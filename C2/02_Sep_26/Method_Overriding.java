public class Method_Overriding {

    public static void main(String[] args) {

        // Test t1 = new Test();
        // t1.meth();

        // when we use super keyword:
        Test1 t2 = new Test1();
        t2.meth();
    }
}

class Test {
    void meth() {
        System.out.println("Meth1 is called");
    }
}

class Test1 extends Test{
    @Override
    void meth() {
        super.meth();
        System.out.println("Meth2 is called");
    }
}