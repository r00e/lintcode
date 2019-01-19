import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class _50_ProductOfArrayExcludeItselfTest {
    static _50_ProductOfArrayExcludeItself tstObj;
    static List<Long> expected;
    static List<Integer> input;

    @BeforeAll
    static void initAll(){
        tstObj = new _50_ProductOfArrayExcludeItself();
    }

    @Test
    void shouldReturn_1_For_empty(){
        expected = Arrays.asList(1L);
        input = new ArrayList<>();

        validate();
    }

    @Test
    void shouldReturn_1_For_1(){
        expected = Arrays.asList(1L);
        input = Arrays.asList(1);

        validate();
    }

    @Test
    void shouldReturn_2_1_For_1_2(){
        expected = Arrays.asList(2L,1L);
        input = Arrays.asList(1,2);

        validate();
    }

    @Test
    void shouldReturn_6_3_2_For_1_2_3(){
        expected = Arrays.asList(6L,3L,2L);
        input = Arrays.asList(1,2,3);

        validate();
    }

    @Test
    void shouldReturn_24_12_8_6_For_1_2_3_4(){
        expected = Arrays.asList(24L,12L,8L,6L);
        input = Arrays.asList(1,2,3,4);

        validate();
    }

    private void validate() {
        assertEquals(expected, tstObj.productExcludeItself(input));
    }
}