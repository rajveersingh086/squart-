package geeks.searching;
import java.util.*;
public class sqrt_x {
    static int mySqrt(int x) {
            if (x==0||x==1){
                return x;
            }
            int low =1 ,high =x ,ans =0;
            while (low <=high){
                int mid = (low +high )/2;
                if (mid<=x /mid){
                    ans = mid;
                    low = mid+1;
                }
                else {
                    high=mid-1;
                }
            }
            return ans;
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner (System.in);
            System.out.println("enter the element :");
            int x = sc.nextInt();
        System.out.println("The floor of the square root is: " + mySqrt(x));
    }
}
//time complexity :O(log(x))