import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import java.util.Arrays;
import java.util.List;

public class gameTest {

    @Test
    public void sizeTest() {
        Cars cars = new Cars("pobi,crong,honux");
        assertThat(cars.getSize()).isEqualTo(3);
    }
    @Test
    public void moveTest() {
        Cars cars = new Cars("pobi,crong,honux");
        List<Integer> positions =  cars.move(Arrays.asList(6,3,5));
        assertThat(positions).isEqualTo(Arrays.asList(1,0,1));
    }

}
