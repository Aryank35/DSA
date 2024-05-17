/**
 * 01_array
 */
public class array_01 {
    public static boolean isRepeated(int arr[]){
        for(int i = 0;i<arr.length;i++)
        {
            for(int j = i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[] = {1,2,3,1};
        boolean result = isRepeated(nums);
        if(result){
        System.out.println("The given array element is repeated.");
        }
        else{
        System.out.println("The given array elements are not repeated.");
        }

    }
}