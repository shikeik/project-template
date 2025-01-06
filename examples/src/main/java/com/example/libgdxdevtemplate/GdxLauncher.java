package com.example.libgdxdevtemplate;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Color;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.utils.ScreenUtils;
import com.badlogic.gdx.utils.viewport.FitViewport;

public class GdxLauncher extends ApplicationAdapter {
	private SpriteBatch batch;
	private ShapeRenderer shapeRenderer;
	private Texture logo, background;
	private Color backgroundColor = Color.valueOf("#000000FF"), clearColor = Color.valueOf("#333333FF");

	float worldWidth = 960, worldHeight = 540;
	private FitViewport worldViewport;
	private OrthographicCamera cam;


	@Override
	public void create() {
		shapeRenderer = new ShapeRenderer();

		batch = new SpriteBatch();
		logo = new Texture("libgdx.png");

		worldViewport = new FitViewport(worldWidth, worldHeight);
	}

	@Override
	public void render() {
		ScreenUtils.clear(clearColor);
		float viewWidth = Gdx.graphics.getWidth();
		float viewHeight = Gdx.graphics.getHeight();
		float viewCenterX = viewWidth / 2f;
		float viewCenterY = viewHeight / 2f;
		float worldCenterX = worldWidth / 2f;
		float worldCenterY = worldHeight / 2f;

		worldViewport.apply(true);

		shapeRenderer.setProjectionMatrix(worldViewport.getCamera().combined);
		shapeRenderer.begin(ShapeRenderer.ShapeType.Filled);
		shapeRenderer.setColor(backgroundColor);
		shapeRenderer.rect(0, 0, worldWidth, worldHeight);
		shapeRenderer.end();

		batch.setProjectionMatrix(worldViewport.getCamera().combined);
		batch.begin();
		{
			float logoWidth = logo.getWidth();
			float logoHeight = logo.getHeight();
			batch.draw(logo, worldCenterX - logoWidth / 2, worldCenterY - logoHeight / 2, logoWidth, logoHeight);
		}
		batch.end();
	}

	@Override
	public void resize(int width, int height) {
		worldViewport.update(width, height, true);
	}
}

