package com.karan.rain.level.tile;

import com.karan.rain.graphics.Screen;
import com.karan.rain.graphics.Sprite;

/**
 * Created by user on 02/12/2015.
 */
public class GrassTile extends Tile{



    //GrassTile actually i a part of Tile(they are made of the same material)

    public GrassTile(Sprite sprite) {
        super(sprite); // same thing as level class
    }

    public void render(int x,int y,Screen screen) {
        // Do render stuff here !
        /*
        What are x and y ,they are in pixel format
        they have to calculated into tile positions
         */
        screen.renderTile(x,y,this);

    }

}