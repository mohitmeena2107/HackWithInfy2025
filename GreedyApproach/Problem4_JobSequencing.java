import java.util.Arrays;
import java.util.Scanner;
public class Problem4_JobSequencing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        job[] arr = new job[n];
        for(int i = 0;i<n;i++){
            
            int start = sc.nextInt();
            int end = sc.nextInt();
            int profit = sc.nextInt();
            arr[i] = new job(start,end,profit);
        }
        
        sc.close();
    }
    public static int jobScheduling(job[] arr) {
        
        Arrays.sort(arr,(a,b)->a.end-b.end);
        for(job i:arr){
            i.display();
        }
        int[] max = new int[arr.length];
        max[0]=arr[0].profit;
        for(int i = 1;i<arr.length;i++){
            int j = bs(arr,i);
            int inc = j==-1?0:max[j];
            max[i] = Math.max(max[i-1],inc+arr[i].profit);
        }
        return max[arr.length-1];
    }
    public static int bs(job[] arr,int i){
        int l = 0;
        int r = i-1;
        while(l<=r){
            int m = l+(r-l)/2;
            if(arr[m].end<=arr[i].start){
                if(arr[m+1].end<=arr[i].start){
                    l = m+1;
                }
                else{
                    return m;
                }
            }
            else{
                r = m-1;
            }
        }
        return -1;
    }
}
    class job{
        int start;
        int end;
        int profit;
        public job(int start,int end,int profit){
            this.start = start;
            this.end = end;
            this.profit = profit;
        }
        public void display(){
            System.out.println("{"+start+","+end+","+profit+"}");
        }

    }