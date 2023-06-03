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

        Assert.assertEquals(0, new Solution().numOfMinutes(n, headID, manager, informTime));
    }

    @Test
    public void numOfMinutesTest2() {
        int n = 6;
        int headID = 2;
        int[] manager = {2, 2, -1, 2, 2, 2};
        int[] informTime = {0, 0, 1, 0, 0, 0};

        int output = 1;

        Assert.assertEquals(0, new Solution().numOfMinutes(n, headID, manager, informTime));
    }
}
