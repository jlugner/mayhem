package com.piggy.raingame.graphics;

public class Sprite {

	public final int SIZE;
	private int x, y;
	public int [] pixels;
	private SpriteSheet sheet;
	
	public static Sprite grass = new Sprite(16, 0, 0, SpriteSheet.tiles);
	public static Sprite voidSprite = new Sprite(16, 0x1B87E0);
	
	public Sprite (int size, int x, int y, SpriteSheet sheet) {
		this.SIZE = size;
		pixels = new int [SIZE * SIZE];
		this.x = x * SIZE;			// Define what coordinate in the spritesheet
		this.y = y * SIZE;
		this.sheet = sheet;
		load();
	}

	public Sprite (int size, int color) {
		SIZE = size;
		pixels = new int [SIZE * SIZE];
		setColor(color);
	}
	
	private void setColor(int color) {
		for (int i = 0; i < SIZE * SIZE; i++) {
			pixels[i] = color;
		}
	}
	
	/**
	 * Get the sprite from the spritesheet
	 */
	private void load() {
		for (int y = 0; y < SIZE; y++) {
			for (int x = 0; x < SIZE; x++) {
				pixels [x + y * SIZE] = sheet.pixels[this.x + x + (y + this.y) * sheet.SIZE];
			}
		}
	}
	
}
