public class Palindrone {

    void Palindron(int num) {
        int orig = num;
        int rev = 0;

        while (num > 0) {
            int digi = num % 10;
            rev = rev * 10 + digi;
            num /= 10;
        }
        if(orig == rev){
            System.out.println(orig + " is a palindrone");
        }else{
            System.out.println(orig + " is't a palindrone");
        }

    }

    public static void main(String[] args) {

        Palindrone obj = new Palindrone();

        obj.Palindron(721);
    }
}
