public class CopyConst {
    String name;

    CopyConst( String name){
        this.name = name;
    }

    CopyConst(CopyConst name1){
        name = name1.name;
    }

    void display(){
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        CopyConst obj = new CopyConst("Deepu");
        CopyConst obj1 = new CopyConst(obj);

        obj.display();
        obj1.display();
    }
}
