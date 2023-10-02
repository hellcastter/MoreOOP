package kick;

import java.util.Random;

import lotr.Character;

public class NobleKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character opponent) {
        opponent.setHp(opponent.getHp() - new Random().nextInt(whoKick.getPower()));

    }
    
}
