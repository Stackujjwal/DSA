class Solution {
    public int maximumSum(int[] arr) {

        int noDeletion = arr[0];
        int oneDeletion = 0;
        int answer = arr[0];

        for(int i=1;i<arr.length;i++){

            oneDeletion = Math.max(noDeletion, oneDeletion + arr[i]);

            noDeletion = Math.max(arr[i], noDeletion + arr[i]);

            answer = Math.max(answer,
                    Math.max(noDeletion, oneDeletion));
        }

        return answer;
    }
}