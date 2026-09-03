public class Fibonaci {

    public static void main(String[] args) {
        Fib fib = new Fib();
        fib.printFibonacci(8);
    }
}

class Fib {
    int first = 0;
    int sec = 1;

    void printFibonacci(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println(first);
            int third = first + sec;
            first = sec;
            sec = third;
        }
      
    }
}