package uet.oop.bomberman.entities.character.enemy;

import java.awt.Color;
import uet.oop.bomberman.Board;
import uet.oop.bomberman.Game;
import uet.oop.bomberman.entities.Message;
import uet.oop.bomberman.entities.bomb.Bomb;
import uet.oop.bomberman.entities.character.enemy.ai.AILow;
import uet.oop.bomberman.graphics.Sprite;

public class Minvo extends Enemy {

    public Minvo(int x, int y, Board board) {
        super(x, y, board, Sprite.minvo_dead, Game.getBomberSpeed() / 2, 100);

        _sprite = Sprite.minvo_left1;

        _ai = new AILow();
        _direction = _ai.calculateDirection();
    }

    @Override
    protected void chooseSprite() {
        switch (_direction) {
            case 0:
            case 1:
                _sprite = Sprite.movingSprite(Sprite.minvo_right1, Sprite.minvo_right2, Sprite.minvo_right3, _animate, 60);
                break;
            case 2:
            case 3:
                _sprite = Sprite.movingSprite(Sprite.minvo_left1, Sprite.minvo_left2, Sprite.minvo_left3, _animate, 60);
                break;
        }
    }

    @Override
    protected void afterKill() {
        if (_timeAfter > 0) {
            --_timeAfter;
        } else {
            if (_finalAnimation > 0) {
                --_finalAnimation;
            } else {
                remove();
                int x = _board.getBomber().getXTile();
                int y = _board.getBomber().getYTile();
                Bomb b = new Bomb(x, y, _board);
                Game.addBombRate(-1);
                _board.addBomb(b);
            }
        }
    }
}