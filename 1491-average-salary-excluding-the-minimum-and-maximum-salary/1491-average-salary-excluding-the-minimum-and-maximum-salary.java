class Solution {
    public double average(int[] salary) {
          int sum=0;
          int max=Integer.MIN_VALUE;
          int min=Integer.MAX_VALUE;
          for(int i=0;i<salary.length;i++){
            sum+=salary[i];
            if(salary[i]>max) max=salary[i];
             if(salary[i]<min) min=salary[i];
          }
          return(double)(sum-max-min)/(salary.length-2);
    }
}