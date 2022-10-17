package RacingCar.domain;

public class Position {
    private int position;
    public Position(int position) {
        if (position < 0)
            throw new IllegalArgumentException();
        this.position = position;
    }
}
