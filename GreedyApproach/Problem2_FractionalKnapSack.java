import java.util.*;
public class Problem2_FractionalKnapSack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double w = sc.nextDouble();
        double[][] arr = new double[n][2];
        for(int i = 0;i<n;i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        System.out.println(helper(arr,w));
        sc.close();
    }
    public static double helper(double[][] arr,double w){
        Arrays.sort(arr,(a,b)->Double.compare(a[0]/a[1],b[0]/b[1]));
        System.out.println(Arrays.deepToString(arr));
        double res = 0;
        for(int i = arr.length-1;i>=0;i--){
            if(w>=arr[i][1]){
                res+=arr[i][0];
                w-=arr[i][1];
            }
            else{
                res+= arr[i][0]*((double)(w/arr[i][1]));
                break;
            }
        }
        return res;
    }
}