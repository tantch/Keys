package com.tantch.keys.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.tantch.keys.KeysGame;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title="Keys";
		config.width=800;
		config.height=480;
		new LwjglApplication(new KeysGame(), config);
	}
}
