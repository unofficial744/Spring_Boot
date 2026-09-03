public class Hello {
    
    void Prime(int num){
      boolean  isprime = true;
        if(num == 1 || num == 0){
            isprime = false;
        }
        else{

        for(int i=2;i<num;i++){
            if(num%i==0){
                isprime = false;
                break;
            }
            
        }
    }
        if(isprime){
        System.out.println(num + "is Prime");
        }else{
            System.out.println(num + " is not Prime");
        }
    }

    public static void main(String[] args) {
      Hello obj = new Hello();
        obj.Prime(25);
      
    }
}
