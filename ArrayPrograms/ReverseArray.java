 package ArrayPrograms;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr={2,4,5,7,8};
        System.out.println("the reverse array is given below");
        System.out.print("{ ");
        for (int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
            
        }System.out.print("}");
    }
    
}
