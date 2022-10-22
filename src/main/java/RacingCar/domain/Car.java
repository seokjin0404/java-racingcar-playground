package RacingCar.domain;

public class Car {
    private Position position;
    private Name name;

    public Car() {
        this("NO", 0);
    }

    public Car(String name) {
        this(name, 0);
    }

    public Car(String name, int position) {
        this.name = new Name(name);
        this.position = new Position(position);
    }

    public Position move() {
        return position.move();
    }

    public Position update(Position maxDistance) {
        if (position.furtherThan(maxDistance))
            return new Position(position);
        return maxDistance;
    }

    public boolean same(Position distance) {
        return position.equals(distance);
    }

    public Position move(int randomNumber) {
        if (randomNumber >= 4)
            return position.move();
        return position;
    }
    public String getName() {
        return name.getName();
    }
}
