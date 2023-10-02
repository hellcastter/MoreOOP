import lotr.Character;
import lotr.Hobbit;

public class GameManager {
    void fight(Character c1, Character c2) {
        if (c1 instanceof Hobbit && c2 instanceof Hobbit) {
            System.out.println("Endless battle of 2 hobbits with lots of tears...");
            return;
        }

        while (c1.isAlive() && c2.isAlive()) {
            System.out.print(c1);
            System.out.print(" kicks ");
            System.out.println(c2);

            c1.kick(c2);

            // swap characters
            Character tempCharacter = c1;
            c1 = c2;
            c2 = tempCharacter;
        }

        System.out.print(c1.isAlive() ? c2 : c1);
        System.out.println(" is dead");
    }
}
