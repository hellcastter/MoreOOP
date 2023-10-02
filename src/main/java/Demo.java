import lotr.CharacterFactory;
import lotr.Character;

public class Demo {
    public static void main(String[] args) {
        GameManager gameManager = new GameManager();

        Character character1 = CharacterFactory.createCharacter();
        Character character2 = CharacterFactory.createCharacter();

        gameManager.fight(character1, character2);
    }
}
