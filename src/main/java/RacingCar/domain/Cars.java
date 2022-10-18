package RacingCar.domain;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cars {
    private List<Car> cars;

    public Cars(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> findWinners() {
        List<Car> Winners = new ArrayList<>();
        Position maxDistance = findMaxPosition();
        for (Car car : cars) {
            if (car.same(maxDistance))
                Winners.add(car);
        }
        return Winners;
    }

    public Position findMaxPosition() {
        Position maxDistance = new Position(0);
        for (Car car : cars) {
            maxDistance = car.update(maxDistance);
        }
        return maxDistance;
    }
}
