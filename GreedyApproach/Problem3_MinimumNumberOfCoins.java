import java.util.*;
public class Problem3_MinimumNumberOfCoins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = {1,2,5,10,20,50,100};
        System.out.println(helper(n,arr));
        sc.close();
    }

    private static int helper(int n, int[] arr) {
        int count = 0;
        for(int i = arr.length-1;i>=0;i--){
            count+= n/arr[i];
            // System.out.println(n/arr[i]+" "+arr[i]);
            n%=arr[i];
        }
        return count;
    }
}
