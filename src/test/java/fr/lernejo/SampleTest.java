package fr.lernejo;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class SampleTest {

    @ParameterizedTest
    @CsvSource({
        "1, 3, 4",
        "20, 2, 22"
    })
    void add_behaves_as_expected(int a, int b, int expectedResult) {
        int result = new Sample().op(Sample.Operation.ADD,a,b);
        Assertions.assertThat(result).isEqualTo(expectedResult);
    }
}
