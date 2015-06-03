package com.tantch.keys.inputs;

import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.tantch.keys.screen.GameScreen;

public class GameInputProcessor implements InputProcessor {

	private GameScreen screen;
	private int i;
	private int j;
	private int comp;
	public GameInputProcessor(GameScreen gameScreen) {
		this.screen = gameScreen;
		i=0;
		j=0;
		comp=12;
	}

	@Override
	public boolean keyDown(int keycode) {
		System.out.println("clicked " + keycode);
		switch(keycode){
		case Keys.LEFT:
			i++;
			if(i>3)
				i--;
			break;
		case Keys.RIGHT:
			i--;
			if(i<0)
				i++;
			break;
		case Keys.UP:
			j++;
			if(j>3)
				j--;
			break;
		case Keys.DOWN:
			j--;
			if(j<0)
				j++;
			break;
		
		case Keys.Q://A
			screen.ff.get(48-comp*i).play();
			break;
		case Keys.NUM_2://A#
			screen.ff.get(49-comp*i).play();
			break;
		case Keys.W://B
			screen.ff.get(50-comp*i).play();
			break;
		case Keys.E://C
			screen.ff.get(51-comp*i).play();
			break;
		case Keys.NUM_4://C#
			screen.ff.get(52-comp*i).play();
			break;
		case Keys.R://D
			screen.ff.get(53-comp*i).play();
			break;
		case Keys.NUM_5://D#
			screen.ff.get(54-comp*i).play();
			break;
		case Keys.T://E
			screen.ff.get(55-comp*i).play();
			break;
		case Keys.Y://F
			screen.ff.get(56-comp*i).play();
			break;
		case Keys.NUM_7://F#
			screen.ff.get(57-comp*i).play();
			break;
		case Keys.U://G
			screen.ff.get(58-comp*i).play();
			break;
		case Keys.NUM_8://G#
			screen.ff.get(59-comp*i).play();
			break;
		case Keys.I://A
			screen.ff.get(60-comp*i).play();
			break;
		case Keys.NUM_9://A#
			screen.ff.get(61-comp*i).play();
			break;
		case Keys.O://B
			screen.ff.get(62-comp*i).play();
			break;

			
			
		case Keys.Z://A
			screen.ff.get(48-comp*j).play();
			break;
		case Keys.S://A#
			screen.ff.get(49-comp*j).play();
			break;
		case Keys.X://B
			screen.ff.get(50-comp*j).play();
			break;
		case Keys.C://C
			screen.ff.get(51-comp*j).play();
			break;
		case Keys.F://C#
			screen.ff.get(52-comp*j).play();
			break;
		case Keys.V://D
			screen.ff.get(53-comp*j).play();
			break;
		case Keys.G://D#
			screen.ff.get(54-comp*j).play();
			break;
		case Keys.B://E
			screen.ff.get(55-comp*j).play();
			break;
		case Keys.N://F
			screen.ff.get(56-comp*j).play();
			break;
		case Keys.J://F#
			screen.ff.get(57-comp*j).play();
			break;
		case Keys.M://G
			screen.ff.get(58-comp*j).play();
			break;
		case Keys.K://G#
			screen.ff.get(59-comp*j).play();
			break;
		case 55://A
			screen.ff.get(60-comp*j).play();
			break;
		case Keys.L://A#
			screen.ff.get(61-comp*j).play();
			break;
		case 56://B
			screen.ff.get(62-comp*j).play();
			break;
		
		
		}
		
		
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		return false;
	}

	@Override
	public boolean keyTyped(char character) {

		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		// TODO Auto-generated method stub
		return false;
	}

}
