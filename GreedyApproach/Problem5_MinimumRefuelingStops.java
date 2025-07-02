import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Problem5_MinimumRefuelingStops {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        int start = sc.nextInt();
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(minRefuelStops(target,start,arr));
        sc.close();
    }
    public static int minRefuelStops(int target, int startFuel, int[][] stations) {
        PriorityQueue<Integer> q =new PriorityQueue<>(Collections.reverseOrder());
        int count = 0;
        int curr = startFuel;
        int i = 0;
        while(curr<target){
            while(i<stations.length && stations[i][0]<=curr){
                q.add(stations[i][1]);
                i++;
            }
            if(q.isEmpty()){
                return -1;
            }
            curr+=q.poll();
            count++;
        }
        return count;
    }
}