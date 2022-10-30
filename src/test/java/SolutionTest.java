import challenge.Solution;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


class SolutionTest {
    Solution solutionClass;

    @BeforeEach
    void beforeTest() {
        solutionClass = new Solution();
    }

    @Test
    void testCountOdds() {
        //Given
        int low = 3, high = 7;
        //When
        int result = solutionClass.countOdds(low, high);
        //Then
        Assertions.assertEquals(result, 3);
    }

    @Test
    void testCountOdds2() {
        //Given
        int low = 278382788, high = 569302584;
        //When
        int result = solutionClass.countOdds(low, high);
        //Then
        Assertions.assertEquals(result, 145459898);
    }
}