import java.util.Scanner;

public class kthmaxmin {
    static void printArray(int[] arr){
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
}

void bubbleSort(int[] arr){
    int n=arr.length;

    for(int i=0;i<n-1;i++){
        for(int j=0;j<n-i-1;j++){
            if (arr[j]>arr[j+1]){
                int temp =arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
            }
        }
    }
}
void kmaxmin(int arr[]){
    System.out.println();
    System.out.println("Enter the value of k:");
    Scanner sc=new Scanner(System.in);
    int k=sc.nextInt();
    bubbleSort(arr);

    int kMin=arr[k-1];
    int kMax=arr[arr.length-k];

    System.out.println(k+" th smallest element : "+kMin);
    System.out.println(k+ " th largest element  : "+kMax );



}

 public static void main(String[] args) {
    kthmaxmin k=new kthmaxmin();

    int arr[]={22,1,33,2,4,55,90};

    System.out.println("Original Array");
    printArray(arr);

    k.bubbleSort(arr);// for sorting the  array

    System.out.println("Sorted Array");
    printArray(arr);

   k.kmaxmin(arr);

 }
    
}
