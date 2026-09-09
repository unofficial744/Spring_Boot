public class Inheritance {

    public static void main(String[] args) {
        
        Cat obj = new Cat();
        obj.eat();
        obj.Barking();
        obj.Meow();

    }
    
}

class Animal{
    void eat(){
        System.out.println("Animal eats");
    }
}
class Dog extends Animal{

    void Barking(){
        System.out.println("Dog is Barking");
    }
}
class Cat extends Dog{
    void Meow(){
        System.out.println("Cat meow");
    }
}