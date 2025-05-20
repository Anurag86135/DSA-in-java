package ArrayPrograms;

public class Cyclic_Rotation {//Cyclically rotate an array by one
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int LastValue =arr[arr.length-1];

        for(int i=arr.length-1;i>0;i--){
            arr[i]=arr[i-1];


        }
        arr[0]=LastValue;
        System.out.print("{");
        for(int k:arr){

            System.out.print(k+ ",");
        }
        System.out.print("}");
    }
    
}
