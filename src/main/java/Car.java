public class Car {

    private String name;
    private int position = 0;

    public Car() {
        this("No Name");
    }

    public Car(String name) {
        this.name = name;
    }
    public void move(int randomNumber) {
        if (randomNumber >= 4)
            position += 1;
    }

    public int getPosition() {
        return position;
    }
}
