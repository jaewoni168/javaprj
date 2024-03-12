package day04;

public class SoundableTest {
    private static void printSound(Soundable soundable) {
        System.out.println(soundable.sound());
    }

    public static void main(String[] args) {
        printSound(new Cat1());
        printSound(new Dog1());
    }
}
