package ArrayPrograms;

public class UnoinAndInterSectionOFArray {
    static void printUnion(int[] a,int [] b){
        System.out.println("Unoin: ");

        //first , print all elements of array a;
        System.out.print("[");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+ " ");
        }
        //print all elements of b that are not present in array a;
        
        for(int j=0;j<b.length;j++){
            boolean isDuplicate =false;

            for(int i=0;i<a.length;i++){
                if(b[j]==a[i]){
                    isDuplicate=true;
                    break;

                }
            }
            //if not found in a ,then print it 
            if (!isDuplicate){
                System.out.print(b[j]+" ");
            }

        }
        System.out.print("]");
        System.out.println();
    }
    
        //function to print Intersection 
        static void printIntersection(int a[],int b[]){
            System.out.println("Intersection : ");
            System.out.print("[");
            for(int i=0;i<a.length;i++){
            for(int j=0;j<b.length;j++){
                if(a[i]==b[j]){
                    System.out.print(a[i]+" ");
                    break;

                }
            }    
            }System.out.print("]");
            System.out.println();
        }
public static void main(String[] args) {
    int [] a={1,2,3,4};
    int[] b={3,4,5,6};
    printUnion(a,b);
    printIntersection(a,b);
}
    
}
