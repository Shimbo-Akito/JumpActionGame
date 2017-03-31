package jp.techacademy.akito.shimbo.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;

/**
 * Created by Develop on 2017/03/31.
 */

public class Enemy extends GameObject {
    public static float ENEMY_WIDTH = 1.0f;
    public static float ENEMY_HEIGHT = 1.0f;

    public static int ENEMY_STATE_NORMAL = 0;
    public static int ENEMY_STATE_VANISH = 1;

    public static int ENEMY_DIRECTION_RIGHT = 0;
    public static int ENEMY_DIRECTION_LEFT = 1;

    public static float ENEMY_VELOCITY = 0.8f;
    public static float ENEMY_ACCEL = 0.2f;

    public int Direction = ENEMY_DIRECTION_RIGHT;

    public int mState = ENEMY_STATE_NORMAL;


    public Enemy (Texture texture, int srcX, int srcY, int srcWidth, int srcHeight){
        super(texture, srcX, srcY, srcWidth, srcHeight);
        setSize(ENEMY_WIDTH,ENEMY_HEIGHT);
        velocity.x = ENEMY_VELOCITY;
    }

    public void update(float delta){
       if (Direction == ENEMY_DIRECTION_RIGHT){
           setX(getX() + velocity.x * delta);
           velocity.x = velocity.x + ENEMY_ACCEL * delta;
       }
        if (Direction == ENEMY_DIRECTION_LEFT){
            setX(getX() - velocity.x * delta);
            velocity.x = velocity.x + ENEMY_ACCEL * delta;
        }
        if(getX() > GameScreen.WORLD_WIDTH - ENEMY_WIDTH){
            Direction = ENEMY_DIRECTION_LEFT;
        }else if (getX() < 0) {
            Direction = ENEMY_DIRECTION_RIGHT;
        }

    }

    public void vanish(){
        //setX(GameScreen.WORLD_WIDTH);
        setAlpha(0);
        mState = ENEMY_STATE_VANISH;
    }


}
