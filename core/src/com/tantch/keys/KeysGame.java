package com.tantch.keys;

import com.badlogic.gdx.Game;
import com.tantch.keys.screen.GameScreen;

public class KeysGame extends Game {
	

	@Override
	public void create () {
	
		setScreen(new GameScreen());
	}

	@Override
	public void render () {
		super.render();
	}
}
