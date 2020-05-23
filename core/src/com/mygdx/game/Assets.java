package com.mygdx.game;

import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;

public class Assets {
    public AssetManager manager;

    public void load(){
        if(manager==null){
            manager = new AssetManager();
        }
        manager.load("player.pack", TextureAtlas.class);
    }
}
