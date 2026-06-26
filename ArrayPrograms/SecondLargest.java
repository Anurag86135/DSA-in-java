public class SecondLargest {
    public static int findSecondLargest(int[] arr){
        if(arr==null || arr.length<2){
            throw new IllegalArgumentException("array must contain at least two elements");
        }
        int largest = arr[0];
        int secondLargest = arr[1];
        if(secondLargest > largest){
            largest = secondLargest;
        }
        for(int i=2; i<arr.length; i++){
            if(arr[i] > largest){
                secondLargest = largest;
                largest = arr[i];
            } else if(arr[i] > secondLargest && arr[i] != largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
}
