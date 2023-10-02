package lotr;

import kick.ElfKick;

public class Elf extends Character {

    public Elf() {
        super(10, 10, new ElfKick());
    }

    @Override
    public void kick(Character opponent) {
        if (opponent.getPower() < getPower())
            opponent.setHp(0);
        else
            setHp(getHp() - 1);
    }
}
