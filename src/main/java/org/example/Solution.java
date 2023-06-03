package org.example;

import java.util.*;

public class Solution {
    public int numOfMinutes(int n, int headID, int[] manager, int[] informTime) {
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        for (int i = 0; i < n; i++) {
            if (manager[i] != -1) {
                graph.get(manager[i]).add(i);
            }
        }

        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{headID, 0});
        int maxTime = 0;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int employee = current[0];
            int time = current[1];
            maxTime = Math.max(maxTime, time);

            for (int subordinate : graph.get(employee)) {
                queue.offer(new int[]{subordinate, time + informTime[employee]});
            }
        }

        return maxTime;
    }
}
