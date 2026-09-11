public class GetSet {
    
    public static void main(String[] args) {
        
        Student obj = new Student();
        obj.setAge(14);
        obj.setName("Krishan");

        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }
}

class Student{

    private String name;
    private int age;

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}