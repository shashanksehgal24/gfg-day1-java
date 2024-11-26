// User function Template for Java
class Solution {
    public int getSecondLargest(int[] arr) {
        // Handle edge case: if the array has fewer than 2 elements
        if (arr.length < 2) {
            return -1;
        }

        int m1 = Integer.MIN_VALUE; // Largest element
        int m2 = Integer.MIN_VALUE; // Second largest element

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > m1) {
                m2 = m1; // Update second largest
                m1 = arr[i]; // Update largest
            } else if (arr[i] > m2 && arr[i] != m1) {
                m2 = arr[i]; // Update second largest if it's not equal to the largest
            }
        }

        // If m2 is not updated, return -1 (no second largest)
        return (m2 == Integer.MIN_VALUE) ? -1 : m2;
    }
}
