package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.scenes.scene2d.ui.Skin;

public class animacion extends ApplicationAdapter {
	SpriteBatch batch;
	Texture img;
	private Skin skin;

	public static int WIDTH = 854;
	public static int HEIGHT = 480;
	private Assets assets;
	private Player player;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		Gdx.gl.glClearColor(1f, 1f, 1f, 1);

		assets = new Assets();
		assets.load();
		assets.manager.finishLoading();

		skin = new Skin();
		skin.addRegions(assets.manager.get("player.pack", TextureAtlas.class));

		player = new Player(skin.getRegion("walking"), skin.getRegion("running"));
	}

	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(img, 0, 0);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
