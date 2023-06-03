package org.example;

public class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {

        int i = 0;
        for ( ; i < manager.length; i++) {
            if(manager[i] == -1) break;
        }
        int[] max = {0};
        boolean[] visited = new boolean[n];
        return dfs( i, manager, informTime, max, 0, visited);
    }

    private int dfs(int headID, int[] manager, int[] informTime, int[] max, int pathValue, boolean[] visited) {
        visited[headID] = true;
        for (int i = 0; i < manager.length; i++) {
            if(manager[i] == headID && !visited[i]){
                max[0] = dfs(i, manager, informTime, max, pathValue + informTime[headID], visited);
            }
        }
        return Math.max(max[0], pathValue);
    }

}

