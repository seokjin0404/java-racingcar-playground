import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Referee {
    private Cars cars;
    public Referee(Cars cars) {
        this.cars = cars;
    }
    public int getMaxDistance() {
        List<Integer> positions = cars.getPositions();
        return Collections.max(positions);
    }

    public String judge() {
        int maxValue = getMaxDistance();
        List<String> names = new ArrayList<>();
        for (int i=0; i<cars.getSize();i++) {
            if (cars.getCar(i).getPosition() == maxValue);
                names.add(cars.getCar(i).getName());
        }
        return String.join(", ",names);
    }
}
