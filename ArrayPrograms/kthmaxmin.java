package ArrayPrograms;

import java.util.Arrays;

public class kthmaxmin {
    public int findthlargest( int[] nums,int k){
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
    public int findkthSmallest(int[] nums,int k){
        Arrays.sort(nums);
        return nums[k-1];

    }
    public static void main(String[] args) {
        kthmaxmin obj=new kthmaxmin();
        // Example of arrays and values
        int [] nums={3,2,1,5,6,4};
        int kLargest=2;
        int kSmallest=3;

        //finding the k-th largest and k-th smallest 
         kLargest=obj.findthlargest(nums,kLargest);
         kSmallest=obj.findkthSmallest(nums,kSmallest);

        //printing results
        System.out.println("The"+kLargest+ " -th largest element is :" +kLargest);
        System.out.println("The "+kSmallest+ "-th Smallest element is :"+kSmallest);
    }
}
