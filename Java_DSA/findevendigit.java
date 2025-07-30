package Java_DSA;

public class findevendigit {
    public static void main(String[] args) {
        int[] nums = {12, 345, 2, 6, 7896};
        int result = findNumbers(nums);
        System.out.println("Count of numbers with even digits: " + result);
    }
    static int findNumbers(int[] nums){
        int count = 0;
        for(int num: nums){
            if(even(num)) {
                count++; // Increment count if the number of digits is even
            }
        }
        return count;
    }
    static boolean even(int num) {
        int noDigits = digits(num);
        if(noDigits % 2 == 0) {
            return true; // Return true if the number of digits is even
        } else {
            return false; // Return false if the number of digits is odd
        }
    }
    static int digits(int num) {
        int count = 0;
        while(num > 0) {
            count++;
            num = num / 10;
        }
        return count;
    }
}

