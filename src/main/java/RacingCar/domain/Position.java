package RacingCar.domain;

public class Position {
    private int position;
    public Position(int position) {
        if (position < 0)
            throw new IllegalArgumentException();
        this.position = position;
    }

    public Position(Position position) {
        this.position = position.position;
    }

    public Position move() {
        this.position += 1;
        return this;
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null|| getClass() != o.getClass()) return false;
        Position other = (Position)o;
        return position == other.position;
    }

    public boolean furtherThan(Position maxDistance) {
        return position > maxDistance.position;
    }
    public int getPosition() {
        return position;
    }
}
