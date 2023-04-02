import junit.framework.TestCase;
import junitTest.SaleMachine;

/**
 * @Author:Su HangFei
 * @Date:2023-04-02 16 28
 * @Project:LiGongSSM
 */
public class TestSaleMachine extends TestCase {
    public void testOperation1() //售货机各资源均有剩余，用户投币5角，选择啤酒
    {
        SaleMachine saleMachine1 = new SaleMachine();
        String expectedResult = "Input Information \n" +
                "Type: Beer; Money: 5 Cents; Change: 0\n\n" +
                "Current State\n" +
                "Beer: 5\n" +
                "Orange Juice: 6\n" +
                "5 Cents: 7\n" +
                "1 Dollar: 6";
        assertEquals(expectedResult, saleMachine1.operation("Beer", "5C"));
    }

    public void testOperation2() //售货机各资源均有剩余，用户投币5角，选择橙汁
    {
        SaleMachine saleMachine2 = new SaleMachine();
        String expectedResult = "Input Information \n" +
                "Type: OrangeJuice; Money: 5 Cents; Change: 0\n\n" +
                "Current State\n" +
                "Beer: 6\n" +
                "Orange Juice: 5\n" +
                "5 Cents: 7\n" +
                "1 Dollar: 6";
        assertEquals(expectedResult, saleMachine2.operation("OrangeJuice", "5C"));
    }

    public void testOperation3() //售货机没有啤酒，用户投币1元，选择啤酒
    {
        SaleMachine saleMachine3 = new SaleMachine(6, 6, 0, 6);
        String expectedResult = "Failure Information \n" + "Beer Shortage";
        assertEquals(expectedResult, saleMachine3.operation("Beer", "1D"));
    }

}
