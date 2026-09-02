class Methods{

    public void meth(){
        int x = 20;
        int y = 20;
        int z = x+y;
        System.out.println(z);
    }

    public static void meth2(){
        int a = 1;
        int b = 3;
        int c = a + b;
        System.out.println("Result " + c);
    }

    public void meth3(int x, int y){
        int z = x * y;
        System.out.println("result: " + z);
    }
    public static void meth4(int x, String y){
        
        System.out.println("Age is : " + x);
        System.out.println("Name is : " + y);
    }
    public int meth5(){
        return 5;
    }

    public static void main(String[] args) {
       Methods obj = new Methods();
       obj.meth();
       meth2();
       
       obj.meth3(5, 7);
       meth4(24, "Danish");

       System.out.println(obj.meth5());
    }
}