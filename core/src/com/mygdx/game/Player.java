package com.mygdx.game;

import com.badlogic.gdx.audio.Sound;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;

public class Player {
    private static final int FRAME_COLS = 6;
    private static final int FRAME_ROWS = 4;

    public static final int WALKING = 0;
    public static final int RUNNING = 1;
    private int currentAnimation;

    private float stateTime = 0;

    private Animation<TextureRegion> walkingAnimation;
    private Animation<TextureRegion> runningAnimation;

    private TextureRegion[] walkingFrames;
    private TextureRegion[] runningFrames;

    private TextureRegion currentFrame;
    private Animation[] animations;

    public Player(TextureRegion textureRegionWalking, TextureRegion textureRegionRunning) {
        TextureRegion[][] tmp = textureRegionWalking.split(textureRegionWalking.getRegionWidth() / FRAME_COLS,
                textureRegionWalking.getRegionHeight() / FRAME_ROWS);
        walkingFrames = new TextureRegion[FRAME_COLS * FRAME_ROWS];
        int index = 0;
        for (int i = 0; i < FRAME_ROWS; i++) {
            for (int j = 0; j < FRAME_COLS; j++) {
                walkingFrames[index++] = tmp[i][j];
            }
        }
        walkingAnimation = new Animation(0.05f, walkingFrames);
        walkingAnimation.setPlayMode(Animation.PlayMode.LOOP);
    }
        public void setCurretAnimation(int currentAnimation){

        }
        public int getCurrentAnimation(){
                return currentAnimation;
        }
        public void update(SpriteBatch batch){

        }
    }
}
