package Matrix;

// LeetCode 56. Merge Intervals
// https://leetcode.com/problems/merge-intervals/    
import java.util.*;
class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> list = new ArrayList<>();

        Arrays.sort(intervals,Comparator.comparingInt(i -> i[0]));

        int[] newInterval = intervals[0];
        list.add(newInterval);

        for(int[] interval : intervals){
            if(interval[0] <= newInterval[1]){
                newInterval[1] = Math.max(newInterval[1],interval[1]);
            } else {
                newInterval = interval;
                list.add(newInterval);
            }
        }

        return list.toArray(new int[list.size()][]);


    }
}