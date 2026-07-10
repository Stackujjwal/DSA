class Solution {

    public boolean isHappy(int n) {

        // Initialize both pointers at the starting number
        int slow = n;
        int fast = n;

        // Continue until fast reaches 1 (happy number)
        while (fast != 1) {

            // Move slow pointer one step
            slow = getNext(slow);

            // Move fast pointer two steps
            fast = getNext(getNext(fast));

            // If both pointers meet, a cycle is detected
            // Since fast is not 1, the number is not happy
            if (slow == fast) {
                break;
            }
        }

        // If fast reached 1, the number is happy
        if (fast == 1) {
            return true;
        }

        // Otherwise, a cycle exists that does not contain 1
        return false;
    }

    // Returns the sum of the squares of the digits of n
    private int getNext(int n) {

        int sum = 0;

        // Extract each digit and add its square to the sum
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }

        return sum;
    }
}