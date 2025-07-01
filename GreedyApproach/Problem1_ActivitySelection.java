import java.util.*;
public class Problem1_ActivitySelection {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(helper(arr));
        sc.close();
    }
    public static int helper(int[][] arr){
        Arrays.sort(arr,Comparator.comparingInt(a->a[1]));
        // System.out.println(Arrays.deepToString(arr));
        int count = 1;
        int prev = arr[0][1];
        for(int i = 1;i<arr.length;i++){
            if(arr[i][0]>=prev){
                count++;
                prev = arr[i][1];
            }
        }
        return count;
    }
}