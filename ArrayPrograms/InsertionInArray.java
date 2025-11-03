public class InsertionInArray {
    void display(int arr[], int size) {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    int Insertion(int arr[], int size, int element, int capacity, int index) {
        if (size >=capacity) {
            return -1;
        }

        for (int i = size - 1; i >= index; i--) {
            arr[i + 1] = arr[i];

        }
        arr[index] = element;
        System.out.println("Insertion happened successfully");
        return 0;
    }
    public static void main(String [] args){
        InsertionInArray in =new InsertionInArray();

        int capacity=10;
        int arr[] =new int[capacity];
        arr[0]=7;
        arr[1]=8;
        arr[2]=9;
        arr[3]=33;
        arr[4]=234;
        int size=6,element=45,index=3;

        
        in.display(arr,size);
        System.out.println();
        in.Insertion(arr, size, element, 10, index);
         size++;
         
       
        in.display(arr,size);
    }

}
