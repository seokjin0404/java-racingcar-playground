package RacingCar.domain;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class getWinnerTest {
    @Test
    public void WinnerTest {
        Car pobi = new Car("pobi",3);
        Car crong = new Car("crong",2);
        Car honux = new Car("honux",1);

        Cars cars = new Cars(Arrays.asList(pobi, crong, honux));
        Winners = cars.findWinners();
        assertThat(Winners).isEqualTo(Arrays.asList(pobi));
    }
}
