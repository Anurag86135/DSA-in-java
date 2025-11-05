package ArrayPrograms;
import java.util.Scanner;

public class linearBinary {
    int binary(int arr[],int element, int size){
    int mid;
    int low=0;
    int high=size-1;

    while(low<=high){
        mid=(low+high)/2;
        if(arr[mid]==element){
            return mid;
        }
        else if(arr[mid]<element){
            low=mid+1;
            
        }
        else{
            high=mid-1;
        }

    }
    return -1;
}

 static int linear(int arr[],int element, int size){
    for(int i=0;i<size;i++){
        if(arr[i]==element){
            return i;
        }

    }
    return -1;
}
public static void main(String [] Args){
    linearBinary b=new linearBinary();

    int arr[]={11,22,33,44,55,76,87};
    int size=arr.length;
    int element ;
    System.out.println("Enter the element : ");
    Scanner sc=new Scanner(System.in);
    element=sc.nextInt();

    // System.out.println("The element found "+element+ " at index "+ linear(arr,element,size));
    System.out.println("The element found "+ element + " at index "+ b.binary(arr,element,size) );
    
    




    

    



    



}

    
}


