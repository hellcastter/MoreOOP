package kick;

import lotr.Character;

public class ElfKick implements KickStrategy {

    @Override
    public void kick(Character whoKick, Character opponent) {
        if (opponent.getPower() < whoKick.getPower())
            opponent.setHp(0);
        else
            opponent.setHp(opponent.getHp() - 1);
    }
    
}
