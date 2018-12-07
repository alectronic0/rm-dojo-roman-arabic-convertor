package co.alectronic.dojo.roman;

public class RomanNumeral {
    private final String name;
    private final int number;

    public RomanNumeral(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

}
