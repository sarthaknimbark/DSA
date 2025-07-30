public class sum_of_subset {
   
    public static void printSubset(int[] subset) {
        System.out.print("{ ");
        for (int value : subset) {
            if (value != 0) {
                System.out.print(value + " ");
            }
        }
        System.out.println("}");
    }

    public static void sumOfSubsets(int[] set, int[] subset, int subsetSize, int sum, int target, int index) {
        
        if (sum == target) {
            printSubset(subset);
            return;
        }

        for (int i = index; i < set.length; i++) {
            if (sum + set[i] <= target) {
                subset[subsetSize] = set[i]; 
                sumOfSubsets(set, subset, subsetSize + 1, sum + set[i], target, i + 1); // backtrack
                subset[subsetSize] = 0; 
            }
        }
    }

    public static void main(String[] args) {
        int[] set = {10, 7, 5, 18, 12, 20, 15};
        int target = 35;

        int[] subset = new int[set.length];

        System.out.println("Subsets of given set that sum to " + target + ":");
        sumOfSubsets(set, subset, 0, 0, target, 0);
    }
}
