import java.util.*;

public class array_04{
    public static int trap(int arr[]){
        int size = arr.length;
        int res = 0,l=0,r=size -1;
        int lMax = arr[l], rMax = arr[r];
        while(l<r){
            if(lMax < rMax){
                l++;
                lMax = Math.max(lMax, arr[l]);
                res += lMax - arr[l];
            }
            else{
                r--;
                rMax = Math.max(rMax, arr[r]);
                res += rMax - arr[r];
            }
        }
        return res;
    }
    public static void main(String[] args) {
        int height[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        int result = trap(height);
        System.out.println("The Total unit the water can store is: "+result);
    }
}