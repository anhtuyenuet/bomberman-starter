package uet.oop.bomberman.entities.tile.item;

import javax.sound.sampled.Clip;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.Sounds;
import uet.oop.bomberman.entities.Entity;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.graphics.Sprite;

public class FlameItem extends Item {

    public FlameItem(int x, int y, Sprite sprite) {
        super(x, y, sprite);
    }

    @Override
    public boolean collide(Entity e) {
        // TODO: xử lý Bomber ăn Item
        if (e instanceof Bomber) {
            Game.addBombRadius(1);
            remove();
            Clip clip = Sounds.getClip("powerup");
            clip.start();
            return true;
        }
        return false;
    }

}
