import junitTest.Calc;
import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @Author:Su HangFei
 * @Date:2023-04-02 16 23
 * @Project:LiGongSSM
 */
public class CalcTest {
    @BeforeAll
    static void setUpBeforeClass() throws Exception {
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
    }

    @BeforeEach
    void setUp() throws Exception {
    }

    @AfterEach
    void tearDown() throws Exception {
    }

    @Test
    public void testAdd() {
        Calc calc = new Calc();
        int result = calc.add(1, 2);
        assertEquals(4, result);
    }
    @Test
    public void testSub() {
        Calc calc = new Calc();
        int result = calc.sub(1, 2);
        assertEquals(-1, result);
    }
    @Test
    public void testMul() {
        Calc calc = new Calc();
        int result = calc.mul(1, 2);
        assertEquals(2, result);
    }
    @Test
    public void testDiv() {
        Calc calc = new Calc();
        int result = calc.div(1, 2);
        assertEquals(0, result);
    }
}
