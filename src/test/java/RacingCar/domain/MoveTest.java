package RacingCar.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MoveTest {
    @Test
    public void moveTest() {
        Car car = new Car();
        assertThat(car.move()).isEqualTo(new Position(1));
    }
    @Test
    public void moveThreeTest() {
        Cars cars = new Cars(Arrays.asList(new Car("pobi"), new Car("crong"),new Car("honux")));
        assertThat(cars.move(Arrays.asList(3,4,5))).isEqualTo(Arrays.asList(new Position(0),new Position(1),new Position(1)));
    }
}
