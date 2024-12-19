package com.goldsprite.gsgdxf.samples;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MainGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture logo;

	@Override
	public void create() {
		batch = new SpriteBatch();
		logo = new Texture("libgdx.png");
	}

	@Override
	public void render() {
		ScreenUtils.clear(0.3f, 0.3f, 0.3f, 1);

		batch.begin();
		{
			int viewCenterX = Gdx.graphics.getWidth() / 2;
			int viewCenterY = Gdx.graphics.getHeight() / 2;
			float logoWidth = logo.getWidth();
			float logoHeight = logo.getHeight();
			batch.draw(logo, viewCenterX - logoWidth / 2, viewCenterY - logoHeight / 2, logoWidth, logoHeight);
		}
		batch.end();
	}
}
