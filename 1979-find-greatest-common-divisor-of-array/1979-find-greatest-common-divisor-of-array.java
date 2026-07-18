class Solution {
    public int findGCD(int[] arr) {
        int smallest = arr[0];
        int largest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return getGcd(smallest, largest);
    }
    public int getGcd(int x, int y) {

        while (y > 0) {
            int rem = x % y;
            x = y;
            y = rem;
        }
        return x;
    }
}