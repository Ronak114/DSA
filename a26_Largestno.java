import java.util.*;

public class a26_Largestno {
    /************To find Largest No*********** */
    public static int getLargest(int nums[]){
        int largestNo=Integer.MIN_VALUE;// -infinity
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=largestNo){
                largestNo=nums[i];
            }
        }
        return largestNo;
    }

    /************To find Smallest No*********** */
    public static int getSmallest(int nums[]){
        int SmallestNo=Integer.MAX_VALUE;// -infinity
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=SmallestNo){
                SmallestNo=nums[i];
            }
        }
        return SmallestNo;
    }
    public static void main(String[] args){
        int nums[]={1,2,6,4,3,5};

        System.out.println("Largest value : " + getLargest(nums)); 
        System.out.println("Smallest value : " + getSmallest(nums)); 
    }
}
