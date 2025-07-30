package Java_DSA;

public class findmin {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 8, 2};
        System.out.println("Minimum element in the array: " + main(arr));
    }

    static int main(int[] arr) {
        int min = arr[0];
        for(int i =1; i<arr.length; i++) {
            if(arr[i] < min) {
                min = arr[i]; // Update min if a smaller element is found
            }
        }
        return min; // Return the minimum element found in the array
    }
}
