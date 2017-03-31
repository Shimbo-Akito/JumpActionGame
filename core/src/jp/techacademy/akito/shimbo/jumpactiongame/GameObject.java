package jp.techacademy.akito.shimbo.jumpactiongame;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.math.Vector2;

/**
 * Created by Develop on 2017/03/29.
 */

public class GameObject extends Sprite {
    public final Vector2 velocity; //x方向,y方向の速度を保持する二次元ベクトル

    public GameObject(Texture texture, int srcX, int srcY, int srcWidth, int srcHeight) {
        super(texture, srcX, srcY, srcWidth, srcHeight);

        velocity = new Vector2();
    }

}
