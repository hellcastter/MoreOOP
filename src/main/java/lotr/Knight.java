package lotr;

import java.util.Random;

import kick.NobleKick;

public class Knight extends Character { 

    public Knight() {
        super(new Random().nextInt(10) + 2, new Random().nextInt(10)  + 2, new NobleKick());
    }   
}
