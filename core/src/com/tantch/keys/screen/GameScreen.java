package com.tantch.keys.screen;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.GL20;
import com.tantch.keys.inputs.GameInputProcessor;

public class GameScreen implements Screen {

	public Sound sel;
	public ArrayList<Sound> ff;
	public GameScreen(){
		
		//testing

		
		ff = new ArrayList<Sound>();
		sel = Gdx.audio.newSound(Gdx.files.internal("sel.wav"));
		for(int i=1;i<=64;i++){
			//set file name
			String name;
			if(i<10){
				name="ff00" + i;
			}
			else{
				name="ff0" + i;
			}
			ff.add(Gdx.audio.newSound(Gdx.files.internal("piano_key/" +name +".wav")));
		}
	}
	
	@Override
	public void show() {
		Gdx.input.setInputProcessor(new GameInputProcessor(this));
		Gdx.input.setCursorCatched(true);// hides cursor
	}
	@Override
	public void render(float delta) {
		Gdx.gl.glClearColor(0, 0.4f, 0.2f, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub

	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub

	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub

	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

}
