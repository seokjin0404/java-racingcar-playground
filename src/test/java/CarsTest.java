import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarsTest {
    @Test
    public void getNameTest() {
        Cars cars = new Cars();
        String[] names = cars.getName("pobi,crong,honux");
        assertThat(names).isEqualTo(new String[] {"pobi","crong","honux"});
    }

    @Test
    public void moveTest() {
        Car car = new Car("pobi");
        car.move(3);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
