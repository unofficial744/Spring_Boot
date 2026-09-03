public class Factorial {
    
    int fact(int num){

        if(num == 0){
            return 1;
        }else{
            return  num * fact(num -1);

        }
    }   
    
    public static void main(String[] args) {
        Factorial obj = new Factorial();

        System.out.println(obj.fact(5));
    }
}
