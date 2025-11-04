package ArrayPrograms;
import java.util.Scanner;

public class Deletion {

    void display(int arr[],int size){
        System.out.println("Your array now and here looks like :");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }
    }

    static void DeleteElement(int arr[], int size,int index){
        
        // code for deletion
        for(int i=index;i<size-1;i++){
            arr[i]=arr[i+1];
        }

    }
    public static void main(String [] args){

        int arr[]={11,22,33,44,55};
        int size=5;
        System.out.println("Enter the index of element that you want to remove");
        Scanner sc=new Scanner(System.in);
        int index=sc.nextInt();
        Deletion d=new Deletion();
        System.out.println("The array before Deletion :");
        d.display(arr,size);
        System.out.println();
        DeleteElement(arr, size, index);
        size--;
        System.out.println("After Deletion");
        d.display(arr, size);

    }
}


