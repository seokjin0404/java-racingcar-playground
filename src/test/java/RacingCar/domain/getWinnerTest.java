package RacingCar.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class getWinnerTest {

    @Test
    public void findMaximimPosition() {
        Car pobi = new Car("pobi",3);
        Car crong = new Car("crong",2);
        Car honux = new Car("honux",9);
        Cars cars = new Cars(Arrays.asList(pobi,crong,honux));
        Position maxDistance = cars.findMaxPosition();
        assertThat(maxDistance).isEqualTo(new Position(9));
    }
    @Test
    public void WinnerTestOneWinner() {
        Car pobi = new Car("pobi",3);
        Car crong = new Car("crong",4);
        Car honux = new Car("honux",1);

        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
        List<Car> Winners = cars.findWinners();
        assertThat(Winners).isEqualTo(Arrays.asList(crong));
    }
    @Test
    public void WinnerTestThreeWinner() {
        Car pobi = new Car("pobi",3);
        Car crong = new Car("crong",3);
        Car honux = new Car("honux",3);

        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
        List<Car> Winners = cars.findWinners();
        assertThat(Winners).isEqualTo(Arrays.asList(pobi, crong, honux));
    }
}
