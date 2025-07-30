package Java_DSA;

public class leetcode_1672 {
    public static void main(String[] args) {
        int[][] accounts = {
            {1, 2, 3},
            {3, 2, 1},
            {4, 5, 6}
        };
        int maxWealth = maximunWealth(accounts);
        System.out.println("Maximum wealth: " + maxWealth); // Output the maximum wealth
        
    }
    static int maximunWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE; // Initialize ans to the smallest integer value
        for(int person = 0;person < accounts.length; person++) {
            int sum = 0; // Initialize sum for each person
            for(int account = 0; account < accounts[person].length; account++) {
                sum += accounts[person][account]; // Sum the wealth of each person

            }
            if(sum > ans) {
                ans = sum; // Update ans if the current person's wealth is greater
            }
        }
        return ans; // Return the maximum wealth found
    }
}
