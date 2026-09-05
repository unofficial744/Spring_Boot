public class Question {
    
    public static void main(String[] args) {
        Area obj = new Area();

        obj.meth(5.0f);
        obj.meth(10.0, 5.0);
        obj.meth(10, 5);
    }
}

class Area{

    void meth(float radius){
        // circle area = 3.14 * r * r
        float res = 3.14f * radius *radius;
        System.out.println("Circle Area :" + res);
    }

    void meth(double len, double wid){
        // Rectangle area  = len * wid 
        double res = len * wid;
        System.out.println(" Rectangle Area :"+ res);
    }

    void meth(int bas, int hig){
        // triangle area  = 0.5 *(bas * hig)
        double res = 0.5 * bas * hig;
        System.out.println(" Triangle Area :"+ res);
    }

}