package day03;

import java.util.NoSuchElementException;
public class BloodType {
    public static final BloodType A = new BloodType("A");
    public static final BloodType B = new BloodType("B");
    public static final BloodType O = new BloodType("O");
    public static final BloodType AB = new BloodType("AB");

    private String name;
    private BloodType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return this.name;
    }

    public static BloodType valueOf(String name) {
        switch (name.toUpperCase()) {
            case "A": return A;
            case "B": return B;
            case "O": return O;
            case "AB": return AB;
            default: throw new NoSuchElementException(name);
        }
    }

    public boolean canGiveTo(BloodType recipient) {
        if (this==recipient) return true;
        if (this == O) return true;
        if (recipient == AB) return true;
        return false;
    }

    public static BloodType[] values() {
        return new BloodType[] {A,B,O,AB};
    }
}
