package ArrayPrograms;

public class Minmax {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max) max=arr[i];
            if(arr[i]<max) min=arr[i];
        }
        System.out.println("the maximum element in the given array is "+ max);
        System.out.println("the minimum element in the given array is "+ min);
    }
    
}
