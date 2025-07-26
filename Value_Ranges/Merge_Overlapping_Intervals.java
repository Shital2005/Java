package Value_Ranges;
public class Merge_Overlapping_Intervals {

    public static List<int[]> merge(List<int[]> intervals) {
        if (intervals == null || intervals.size() <= 1)
            return intervals;

        // Sort intervals based on start time
        intervals.sort(Comparator.comparingInt(a -> a[0]));

        List<int[]> merged = new ArrayList<>();
        int[] current = intervals.get(0);

        for (int i = 1; i < intervals.size(); i++) {
            int[] next = intervals.get(i);

            if (current[1] >= next[0]) {
                // Overlap, so merge
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap, add to result and move to next
                merged.add(current);
                current = next;
            }
        }

        merged.add(current); // Add the last interval
        return merged;
    }

    public static void main(String[] args) {
        List<int[]> intervals = new ArrayList<>();
        intervals.add(new int[]{1, 3});
        intervals.add(new int[]{2, 6});
        intervals.add(new int[]{8, 10});
        intervals.add(new int[]{15, 18});

        List<int[]> result = merge(intervals);

        for (int[] interval : result) {
            System.out.println("[" + interval[0] + "," + interval[1] + "]");
        }
    }


}
