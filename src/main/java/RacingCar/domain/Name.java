package RacingCar.domain;

public class Name {
    private String name;
    public Name(String name) {
        if (name==null||name.isEmpty())
            throw new IllegalArgumentException();
        if (name.length() > 5)
            throw new IllegalArgumentException();
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
