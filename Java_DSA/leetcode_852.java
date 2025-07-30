package Java_DSA;

public class leetcode_852 {
    public static void main(String[] args) {
         int[] arr = {0, 2, 1, 0};

    }

     public int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while(start < end) {
            int mid = start + (end - start) / 2;
            if(arr[mid] > arr[mid + 1]) {
                // dec part of array
                // maybe true but go to the left
                end = mid;
            } else {
                // inc part of array
                // maybe true but go to the right
                start = mid + 1;
            }
        }

        return start; // Return the peak index found in the mountain array
    }
        

}
