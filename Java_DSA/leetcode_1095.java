package Java_DSA;

public class leetcode_1095 {
    public static void main(String[] args) {
        
    }

    int search(int[] arr, int target) {
        int peakIndex = peakIndexInMountainArray(arr);
        // Search in the increasing part of the mountain array
        int leftSearch = binarySearch(arr, target, 0, peakIndex);
        if(leftSearch != -1) {
            return leftSearch; // Return the index if found in the left part
        } 
        // Search in the decreasing part of the mountain array
        int rightSearch = binarySearch(arr, target, peakIndex + 1, arr.length - 1);
        return rightSearch; // Return the index if found in the right part, or -1 if not found
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

    // Java program for the above approach

// An iterative binary search function.
static int binarySearch(int arr[],int target, int start, int end)
{

    // Checking the sorted order of the given array
    boolean isAsc = arr[start] < arr[end];
    while (start <= end) {
        int middle = start + (end - start) / 2;

        // Check if x is present at mid
        if (arr[middle] == target)
            return middle;

        // Ascending order
        if (isAsc == true) {

            // If x greater, ignore left half
            if (arr[middle] < target)
                start = middle + 1;

            // If x smaller, ignore right half
            else
                end = middle - 1;
        }

        // Descending order
        else {

            // If x smaller, ignore left half
            if (arr[middle] > target)
                start = middle + 1;

            // If x greater, ignore right half
            else
                end = middle - 1;
        }
    }

    // Element is not present
    return -1;
}


}
