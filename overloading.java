

public class overloading {
    void sum(int a){
        System.out.println("mai hun don "+a);
    }
    void sum(int a, int b){
        System.out.println(a+b);
    }
    
}
class hello{
    public static void main(String[] args) {
    overloading obj= new overloading(); 
    obj.sum(244);
    obj.sum(80 , 40);

    }
}
