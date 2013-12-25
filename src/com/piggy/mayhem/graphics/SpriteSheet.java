package com.piggy.mayhem.graphics;

import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

public class SpriteSheet {
	
	public static SpriteSheet tiles = new SpriteSheet("/textures/spritesheet.png", 256);
	public static SpriteSheet chars = new SpriteSheet("/textures/character_sprites.png", 512);
	public static SpriteSheet projectiles = new SpriteSheet("/textures/projectiles.png", 64);
	
	private String path;
	public final int SIZE;
	public int [] pixels;

	public SpriteSheet(String path, int size) {
		this.path   = path;
		this.SIZE   = size;
		this.pixels = new int [size*size];
		load();
	}
	
	private void load() {
		try {
			BufferedImage image = ImageIO.read(SpriteSheet.class.getResource(path));
			int w = image.getWidth();
			int h = image.getHeight();
			image.getRGB(0, 0, w, h, pixels, 0, w);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}