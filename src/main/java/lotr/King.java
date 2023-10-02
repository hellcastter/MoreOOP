package lotr;

import java.util.Random;

import kick.NobleKick;

public class King extends Character {
    public King() {
        super(
            new Random().nextInt(10) + 5,
            new Random().nextInt(10) + 5,
            new NobleKick()
        );
    }
}
