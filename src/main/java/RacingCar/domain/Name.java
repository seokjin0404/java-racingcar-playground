package RacingCar.domain;

public class Name {
    public Name(String name) {
        if (name==null||name.isEmpty())
            throw new IllegalArgumentException();
        if (name.length() > 5)
            throw new IllegalArgumentException();
    }
}
