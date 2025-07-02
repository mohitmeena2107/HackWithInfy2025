import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class S1_Problem1_MinimumFibonacciNumbers {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(findMinFibonacciNumbers(n));
        sc.close();
    }
    public static int findMinFibonacciNumbers(int k) {
        List<Integer> arr = new ArrayList<>();
        int i = 1;
        arr.add(1);
        arr.add(1);
        while(i<=k){
            i=arr.get(arr.size()-1)+arr.get(arr.size()-2);
            arr.add(i);
        }
        System.out.println(arr);
        int count = 0;
        for(i = arr.size()-1;i>=0;i--){
            count+= k/arr.get(i);
            // System.out.println(n/arr[i]+" "+arr[i]);
            k%=arr.get(i);
        }
        return count;
    }
}