public class Solution {
    public ArrayList<Interval> insert(ArrayList<Interval> intervals, Interval newInterval) {
        ArrayList<Interval> result = new ArrayList<>();
        int i = 0, n = intervals.size();

        // Step 1: Add all intervals ending before newInterval starts
        while (i < n && intervals.get(i).end < newInterval.start) {
            result.add(intervals.get(i));
            i++;
        }

        // Step 2: Merge overlapping intervals with newInterval
        while (i < n && intervals.get(i).start <= newInterval.end) {
            newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
            newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
            i++;
        }
        result.add(newInterval);

        // Step 3: Add remaining intervals after merged newInterval
        while (i < n) {
            result.add(intervals.get(i));
            i++;
        }

        return result;
    }
}


