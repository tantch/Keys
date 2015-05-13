package com.tantch.keys.inputs;

import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.MathUtils;
import com.tantch.keys.screen.GameScreen;

public class GameInputProcessor implements InputProcessor {

	private GameScreen screen;

	public GameInputProcessor(GameScreen gameScreen) {
		this.screen = gameScreen;

	}

	@Override
	public boolean keyDown(int keycode) {
		// screen.sel.play(MathUtils.random(0.5f, 1f), MathUtils.random(0.5f,
		// 2f), MathUtils.random(-1f, 1f));
		if (keycode >= 0 && keycode <= 63)
			screen.ff.get(keycode).play();
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
