package uet.oop.bomberman.entities.character.enemy.ai;

import java.util.Random;

public class AILow extends AI {

	@Override
	public int calculateDirection() {
		// TODO: cài đặt thuật toán tìm đường đi
                Random rd = new Random(); //sinh ngẫu nhiên
                int i = rd.nextInt(4);
		return i;
	}

}
