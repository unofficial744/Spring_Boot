public class Overloading {

    public static void main(String[] args) {
        Method obj = new Method();
        obj.meth(5, 5);
        obj.meth(5, 5, 6);
        obj.meth(5.6f, 5.0f);
    }
}

class Method {
    void meth(int a, int b) {
        System.out.println("Sum " + (a + b));
    }

    void meth(int a, int b, int c) {
        System.out.println("Sum " + (a + b + c));
    }

    void meth(float a, float b) {
        System.out.println("Sum " + (a + b));
    }
}