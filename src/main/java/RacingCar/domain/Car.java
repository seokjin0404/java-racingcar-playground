package RacingCar.domain;

public class Car {
    private Position position;

    public Car() {
        position = new Position(0);
    }
    public Position move() {
        return position.move();
    }
}
