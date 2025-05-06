


public class MinMax{
    public static void main(String[] args) {
        
    
    int [] arr={2,5,7,9,8};
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if (arr[i]<min)
        min=arr[i];
        if(arr[i]>max)
        max=arr[i];
    }
    System.out.println("maximum element of array is :"+ max);
    System.out.println("minimum element of array is :"+ min);
}
}