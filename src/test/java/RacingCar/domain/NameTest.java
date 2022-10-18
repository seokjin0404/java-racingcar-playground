package RacingCar.domain;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class NameTest {
    @Test
    public void nameValidNull() {
        assertThatThrownBy(() -> {
            new Name("");
        }).isInstanceOf(IllegalArgumentException.class);
    }
    @Test
    public void nameValidOver5() {
        assertThatThrownBy(() -> {
            new Name("sdfsdf");
        }).isInstanceOf(IllegalArgumentException.class);
    }
}
