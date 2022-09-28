import java.util.List;
import java.util.Random;

public class Tamagotchi {

    int hunger;
    int boredom;
    List<String> words;
    boolean isAlive;
    Random generator;
    public String name;

    public Tamagotchi() {
        generator = new Random();
        isAlive = true;
    }

    public void Tick() {
        hunger++;
        boredom++;

        if (boredom > 10 && hunger > 10) {
            isAlive = false;
        }
    }

    public void Feed() {
        hunger -= 5;
    }

    public void ReduceBoredom() {
        boredom += 2;
    }

    public void Hi() {

        if (words.size() == 0) {
            System.out.println("Sorry, your tamagotchi has not learned any words.");
        }

        System.out.println(words.get(generator.nextInt(0, words.size())));
        ReduceBoredom();
    }

    public void Teach(String word) {
        words.add(word);
        ReduceBoredom();
    }

    public void PrintStats() {
        System.out.println(" " + name + "is alive || Hunger " + hunger + " || Boredom " + boredom + " || ");
    }

    public boolean GetAlive() {
        return isAlive;
    }


}
