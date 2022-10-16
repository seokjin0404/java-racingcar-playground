import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class RefereeTest {
    private Cars cars;
    @BeforeEach
    public void setUp() {
        cars = new Cars("pobi,crong,honux");
    }
    @Test
    public void getPositionTest() {
        cars.move(Arrays.asList(9,0,0));
        cars.move(Arrays.asList(9,0,0));
        assertThat(cars.getPositions()).isEqualTo(Arrays.asList(2,0,0));
    }
    @Test
    public void maxPositionTest() {
        cars.move(Arrays.asList(9,0,0));
        cars.move(Arrays.asList(9,0,0));
        Referee referee = new Referee(cars);
        assertThat(referee.getMaxDistance()).isEqualTo(2);
    }

    @Test
    public void getOneWinnerTest() {
        cars.move(Arrays.asList(9,0,0));
        Referee referee = new Referee(cars);
        assertThat(referee.judge()).isEqualTo("pobi");
    }
}
