package baseball;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class RandomNumberGeneratorTest {

    NumberGenerator numberGenerator = new RandomNumberGenerator();
    
    @Test
    void generate() {
        int generate = numberGenerator.generate();
        boolean result = 0 < generate && generate < 10;

        assertThat(result).isTrue();
    }
}