
import java.util.Scanner;

public class ADTinArray {
    int total_size;
    int used_size;
    int arr[];


ADTinArray(int t_size,int u_size){
    total_size=t_size;
    used_size=u_size;
    arr =new int[t_size];
    
}

void setdata(){
    Scanner sc= new Scanner(System.in);
    for(int i=0;i<used_size;i++){
        System.out.println("Enter the elements one by one "+ i +" : ");
        arr[i]=sc.nextInt();
    }

}
void show(){
    System.out.println("Elements of array are listed below one by one");
    
    for(int i=0;i<used_size;i++){
        System.out.println(arr[i]);

    }
}

 
public static void main(String[] args) {
     ADTinArray marks =new ADTinArray(10,5);
     System.out.println("we are running set val");
     marks.setdata();
     System.out.println("We are running show function");
     marks.show();

    
}
}


