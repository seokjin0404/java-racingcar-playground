import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {

    private List<Car> cars = new ArrayList<Car>();

    public Cars() {

    }
    public Cars(String names) {
        String[] carNames = getName(names);
        for (int i=0; i<carNames.length;i++)
            cars.add(new Car(carNames[i]));
    }

    public String[] getName(String names) {
        return names.split(",");
    }
    public int getSize() {
        return cars.size();
    }
    public List<Integer> getPositions() {
        return move(Arrays.asList(0,0,0));
    }
    public List<Integer> move(List<Integer> randomNumbers) {
        List<Integer> positions = new ArrayList<Integer>();
        for (int i=0; i<getSize();i++) {
            cars.get(i).move(randomNumbers.get(i));
            positions.add(cars.get(i).getPosition());
        }
        return positions;
    }
}
