import blackbox.MyMath;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BlackBoxTest {

    @Test
    public void testOverflowOdd() {
        System.out.println("testOverflowOdd | n=" + Integer.MAX_VALUE +
                " | expected=" + Double.NEGATIVE_INFINITY +
                " | actual=" + MyMath.minTwoToPower(Integer.MAX_VALUE));
        Assertions.assertEquals(Double.NEGATIVE_INFINITY, MyMath.minTwoToPower(Integer.MAX_VALUE));
    }

    @Test
    public void testOverflowEven() {
        System.out.println("testOverflowEven | n=" + (Integer.MAX_VALUE - 1) +
                " | expected=" + Double.POSITIVE_INFINITY +
                " | actual=" + MyMath.minTwoToPower(Integer.MAX_VALUE - 1));
        Assertions.assertEquals(Double.POSITIVE_INFINITY, MyMath.minTwoToPower(Integer.MAX_VALUE - 1));
    }

    @Test
    public void testBoundary1023() {
        double adjustedMax = Double.MAX_VALUE/(2-Math.pow(2,-52));
        System.out.println("testBoundary1023 | n=1023" +
                " | expected=" + (-1 * Double.MAX_VALUE) +
                " | actual=" + MyMath.minTwoToPower(1023));
        Assertions.assertEquals(-1 * adjustedMax, MyMath.minTwoToPower(1023));
    }

    @Test
    public void testNormalSafeEven() {
        System.out.println("testNormalSafeEven | n=2" +
                " | expected=4.0" +
                " | actual=" + MyMath.minTwoToPower(2));
        Assertions.assertEquals(Double.parseDouble("4.0"), MyMath.minTwoToPower(2));
    }

    @Test
    public void testNormalSafeOdd() {
        System.out.println("testNormalSafeOdd | n=3" +
                " | expected=-8.0" +
                " | actual=" + MyMath.minTwoToPower(3));
        Assertions.assertEquals(Double.parseDouble("-8.0"), MyMath.minTwoToPower(3));
    }

    @Test
    public void testMinValueBoundary() {
        System.out.println("testMinValueBoundary | n=-1074" +
                " | expected=" + Double.MIN_VALUE +
                " | actual=" + MyMath.minTwoToPower(-1074));
        Assertions.assertEquals(Double.MIN_VALUE, MyMath.minTwoToPower(-1074));
    }

    @Test
    public void testUnderflowEven() {
        System.out.println("testUnderflowEven | n=" + Integer.MIN_VALUE +
                " | expected=0.0" +
                " | actual=" + MyMath.minTwoToPower(Integer.MIN_VALUE));
        Assertions.assertEquals(Double.parseDouble("0.0"), MyMath.minTwoToPower(Integer.MIN_VALUE));
    }

    @Test
    public void testUnderflowOdd() {
        System.out.println("testUnderflowOdd | n=" + (Integer.MIN_VALUE + 1) +
                " | expected=-0.0" +
                " | actual=" + MyMath.minTwoToPower(Integer.MIN_VALUE + 1));
        Assertions.assertEquals(Double.parseDouble("-0.0"), MyMath.minTwoToPower(Integer.MIN_VALUE + 1));
    }

    @Test
    public void testSpecificOne() {
        System.out.println("testSpecificOne | n=1" +
                " | expected=-2.0" +
                " | actual=" + MyMath.minTwoToPower(1));
        Assertions.assertEquals(Double.parseDouble("-2.0"), MyMath.minTwoToPower(1));
    }

    @Test
    public void testSpecificZero() {
        System.out.println("testSpecificZero | n=0" +
                " | expected=1.0" +
                " | actual=" + MyMath.minTwoToPower(0));
        Assertions.assertEquals(Double.parseDouble("1.0"), MyMath.minTwoToPower(0));
    }

    @Test
    public void testSpecificNegativeOne() {
        System.out.println("testSpecificNegativeOne | n=-1" +
                " | expected=-0.5" +
                " | actual=" + MyMath.minTwoToPower(-1));
        Assertions.assertEquals(Double.parseDouble("-0.5"), MyMath.minTwoToPower(-1));
    }

    @Test
    public void testSpecificNegativeTwo() {
        System.out.println("testSpecificNegativeTwo | n=-2" +
                " | expected=-0.5" +
                " | actual=" + MyMath.minTwoToPower(-2));
        Assertions.assertEquals(Double.parseDouble("-0.5"), MyMath.minTwoToPower(-2));
    }

    // Test cases for range 2 to 1022
    @Test
    public void testRange2To1022_Even() {
        int n = 4;
        double expected = Math.pow(2, n);
        System.out.println("testRange2To1022_Even | n=" + n +
                " | expected=" + expected +
                " | actual=" + MyMath.minTwoToPower(n));
        Assertions.assertEquals(expected, MyMath.minTwoToPower(n));
    }

    @Test
    public void testRange2To1022_Odd() {
        int n = 5;
        double expected = -1 * Math.pow(2, n);
        System.out.println("testRange2To1022_Odd | n=" + n +
                " | expected=" + expected +
                " | actual=" + MyMath.minTwoToPower(n));
        Assertions.assertEquals(expected, MyMath.minTwoToPower(n));
    }

    @Test
    public void testRange2To1022_MidRange() {
        int n = 100;
        double expected = Math.pow(2, n);
        System.out.println("testRange2To1022_MidRange | n=" + n +
                " | expected=" + expected +
                " | actual=" + MyMath.minTwoToPower(n));
        Assertions.assertEquals(expected, MyMath.minTwoToPower(n));
    }

    @Test
    public void testRange2To1022_HighRange() {
        int n = 1022;
        double expected = Math.pow(2, n);
        System.out.println("testRange2To1022_HighRange | n=" + n +
                " | expected=" + expected +
                " | actual=" + MyMath.minTwoToPower(n));
        Assertions.assertEquals(expected, MyMath.minTwoToPower(n));
    }

    // Test cases for range -2 to -1073
    @Test
    public void testRangeNegative2ToNegative1073_SmallNegative() {
        int n = -3;
        double expected = -1 * Math.pow(2, n);
        System.out.println("testRangeNegative2ToNegative1073_SmallNegative | n=" + n +
                " | expected=" + expected +
                " | actual=" + MyMath.minTwoToPower(n));
        Assertions.assertEquals(expected, MyMath.minTwoToPower(n));
    }

    @Test
    public void testRangeNegative2ToNegative1073_MidRange() {
        int n = -2;
        double expected = -1 * Math.pow(2, n);
        System.out.println("testRangeNegative2ToNegative1073_MidRange | n=" + n +
                " | expected=" + expected +
                " | actual=" + MyMath.minTwoToPower(n));
        Assertions.assertEquals(expected, MyMath.minTwoToPower(n));
    }

    @Test
    public void testRangeNegative2ToNegative1073_LargeNegative() {
        int n = -1073;
        double expected = -1 * Math.pow(2, n);
        System.out.println("testRangeNegative2ToNegative1073_LargeNegative | n=" + n +
                " | expected=" + expected +
                " | actual=" + MyMath.minTwoToPower(n));
        Assertions.assertEquals(expected, MyMath.minTwoToPower(n));
    }
}