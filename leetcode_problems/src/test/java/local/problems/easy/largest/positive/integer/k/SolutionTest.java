package local.problems.easy.largest.positive.integer.k;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;




@RunWith(Parameterized.class)
public class SolutionTest {
    private final int[] firstNums;
    private final int expected;

    public SolutionTest(int[] firstNums, int expected) {
        this.firstNums = firstNums;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[][] getSumData() {
        return new Object[][] {
                {new int[]{-1,2,-3,3},3},
                {new int[]{-1,10,6,7,-7,1},7},
                {new int[]{-10,8,6,7,-2,-3},-1},
        };



    }

    @Test
    public void findMaxKArreyMaxK(){
        Solution solution = new Solution();
        int kMax= solution.findMaxK(firstNums);
        Assert.assertEquals(expected,kMax);
    }
}
