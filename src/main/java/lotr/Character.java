package lotr;

import kick.KickStrategy;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public abstract class Character {
    @Getter
    private int hp;
    @Getter
    private int power;
    private KickStrategy kick;

    public void kick(Character opponent)  {
        kick.kick(this, opponent);
    }

    public boolean isAlive() {
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + getHp() + ", power=" +  getPower() +"}";
    }
}
