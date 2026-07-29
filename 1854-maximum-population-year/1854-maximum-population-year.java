class Solution {
    public int maximumPopulation(int[][] logs) {
        int maxPop = 0;
        int maxYear = 0;
        for (int year = 1950; year <= 2050; year++) {
            int pop = 0;
            for (int i = 0; i < logs.length; i++) {
                int birth = logs[i][0];
                int death = logs[i][1];
                if (birth <= year && year < death) {
                    pop++;
                }
            }
            if (pop > maxPop) {
                maxPop = pop;
                maxYear = year;
            }
        }
        return maxYear;
    }
}