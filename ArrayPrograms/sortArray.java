package ArrayPrograms;

import java.util.Arrays;

public class sortArray {
   static void SortArray(int[]arr){
        int count0=0,count1=0,count2=0;
        System.out.println("Array before sorting "+Arrays.toString( arr));
        
        //0(n)
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0) count0++;
            else if(arr[i] ==1) count1++;
            else if(arr[i]==2) count2++;
        }
        //0(n)
        int idx=0;
        for(int i=0;i<count0;i++){
            arr[idx++]=0;
        }
        for(int i=0;i<count1;i++){
            arr[idx++]=1;

        }
        for(int i=0;i<count2;i++){
            arr[idx]=2;
        }
        System.out.println("Array after sorting "+Arrays.toString( arr));
    }
    

    public static void main(String[] args) {
        int[] arr={2,2,1,1,1,0,0,0,0};
        
        SortArray(arr );
    }
}
