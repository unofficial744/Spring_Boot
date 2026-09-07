public class Method_Overrriding {
    
    public static void main(String[] args) {
        
    Animal obj1 = new Animal();
    Dog obj2 = new Dog();

    obj1.sound();
    obj2.sound();
    }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

