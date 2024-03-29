import org.example.Solution;
import org.junit.Assert;
import org.junit.Test;

public class SolutionTest1 {
    @Test
    public void numOfMinutesTest1() {
        int n = 1;
        int headID = 0;
        int[] manager = {-1};
        int[] informTime = {0};

        int output = 0;

        Assert.assertEquals(output, new Solution().numOfMinutes(n, headID, manager, informTime));
    }

    @Test
    public void numOfMinutesTest2() {
        int n = 6;
        int headID = 2;
        int[] manager = {2, 2, -1, 2, 2, 2};
        int[] informTime = {0, 0, 1, 0, 0, 0};

        int output = 1;

        Assert.assertEquals(output, new Solution().numOfMinutes(n, headID, manager, informTime));
    }

    @Test
    public void numOfMinutesTest3() {
        int n = 22;
        int headID = 7;
        int[] manager = {12, 7, 18, 11, 13, 21, 12, -1, 6, 5, 14, 13, 14, 9, 20, 13, 11, 1, 1, 2, 3, 19};
        int[] informTime = {0, 540, 347, 586, 0, 748, 824, 486, 0, 777, 0, 202, 653, 713, 454, 0, 0, 0, 574, 735, 721, 772};

        int output = 9132;

        Assert.assertEquals(output, new Solution().numOfMinutes(n, headID, manager, informTime));
    }
}
