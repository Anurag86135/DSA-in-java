public class ReverseArray {
    public static void main(String[] args) {
        
        int[] arr={1,2,3,4,5,6};
        // int rev=0;
        System.out.println("the reverse array is given below");
        System.out.print("{ ");
        for(int i=arr.length-1;i>=0;i--){
            //  arr[i];//
             System.out.print( arr[i]+ " ");
        }
       System.out.print("}");
    }
    
}
