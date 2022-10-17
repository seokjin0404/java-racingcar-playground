package RacingCar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class MoveTest {
    @Test
    public void moveTest() {
        Car car = new Car();
        assertThat(car.move()).isEqualTo(new Position(1));
    }
}
