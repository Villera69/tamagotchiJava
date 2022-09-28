import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Tamagotchi tamagotchi = new Tamagotchi();
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello! Welcome to the tamagotchi game. What do you want your tamagotchi to be called? ");
        tamagotchi.name = sc.next();


    }
}