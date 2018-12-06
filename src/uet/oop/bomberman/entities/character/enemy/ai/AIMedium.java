package uet.oop.bomberman.entities.character.enemy.ai;

import java.util.Random;
import uet.oop.bomberman.entities.character.Bomber;
import uet.oop.bomberman.entities.character.enemy.Enemy;

public class AIMedium extends AI {
	Bomber _bomber;
	Enemy _e;
	
	public AIMedium(Bomber bomber, Enemy e) {
		_bomber = bomber;
		_e = e;
	}

	@Override
	public int calculateDirection() {
		Random rd = new Random(); //sinh ngẫu nhiên
                int i = rd.nextInt(4);
		return i;
	}

}
