package ArrayPrograms;
// Move all negative numbers to beginning and positive to end
public class Moving {
    static  int move (int[] arr){
        int j=0;
        for(int i=0;i<arr.length;i++){
            //if negative number is present
            //swap it with arr[j]
            if(arr[i]<0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }

    }
        public static void main(String [] args){
            int []arr={-12,11,-13,-5,6,-7,5,-3,-6};
            //create a new array to hold the result
            int[]ans=new int[arr.length];
            int index=0;
            //first add all negative numbers
            for(int num : arr){
                if(num<0){
                ans[index++]=num;
            }
        }
        
        //then add all non-negative numbers
        for(int num:arr){
            if(num>=0){
                ans[index++]=num;
            }
        }
        for(int num : ans){//printing the result
            System.out.print(num +" ");
        }
        System.out.println();
    
}
}
