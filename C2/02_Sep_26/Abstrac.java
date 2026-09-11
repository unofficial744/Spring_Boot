public class Abstrac {
    
    public static void main(String[] args) {
        
        Test2 t1 = new Test2();
        t1.Pay();
        t1.Scan_QR();
        // t1.meth1();
    }
}

abstract class Test{
    
    void meth1(){
        System.out.println("This is normal method");
    }

    abstract void Pay();
    abstract void Scan_QR();
}
class Test2 extends Test{

    void Pay(){
        System.out.println("Net banking ");
    }

    void Scan_QR(){
        System.out.println("Pay using UPI");
    }
}