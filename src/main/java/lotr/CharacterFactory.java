package lotr;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.reflections.Reflections;
import org.reflections.scanners.Scanners;

import lombok.SneakyThrows;


public class CharacterFactory {
    @SneakyThrows
    public static Character createCharacter() {
        Reflections reflections = new Reflections(Character.class, Scanners.SubTypes);
        Set<Class<? extends Character>> charactersSet = reflections.getSubTypesOf(Character.class);
        List<Class<? extends Character>> characters = new ArrayList<>(charactersSet);

        int index = new Random().nextInt(characters.size());

        return characters.get(index).getDeclaredConstructor().newInstance();
    }
}
