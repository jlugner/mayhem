package com.piggy.raingame.levels.tiles;

import com.piggy.raingame.graphics.Screen;
import com.piggy.raingame.graphics.Sprite;

public class Tile {
	
	public static Tile grass = new GrassTile(Sprite.grass);
	public static Tile flowerGrass = new GrassTile(Sprite.flowerGrass);
	public static Tile trunk = new TrunkTile(Sprite.trunk);
	public static Tile bigTrunk = new BigTrunkTile(Sprite.BigTrunk);
	public static Tile voidTile = new VoidTile(Sprite.voidSprite);
	public static Tile water    = new WaterTile(Sprite.water);
	
	public int x,y;
	public Sprite sprite;

	public Tile (Sprite sprite) {
		this.sprite = sprite;
	}
	
	public void render(int x, int y, Screen screen) {
	}
	
	public boolean collidable() {
		return false;
	}
}
