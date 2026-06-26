public class Largest {
    public static int findLargest(int[] arr){
        if (arr==null || arr.length==0){
            throw new IllegalArgumentException("Array must not be empty or null");
            
        }
        int max=arr[0];

        for(int i=1; i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args){
        int[] arr={3,5,7,2,8,1};
        int largest=findLargest(arr);
        System.out.println("The largest element in the array is: "+largest);
    }
    
}
