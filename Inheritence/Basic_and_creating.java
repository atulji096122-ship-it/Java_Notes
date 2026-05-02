import java.util.*;
class pet{ //Parent class with common properties.
    String name ;
    int age ;

    void eat(){
        System.out.println("Eating");
    }
}

//Basic Syntex.
//class child extends Parent{
// }


class Dog extends pet{ //child class.
    void bark(){
        System.out.println("barking");
    }
}


public class Basic_and_creating {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        //child class object has access to 
            //his unique properties / methods.
            // All properties/method of parent class.
            // child class don't have acces of privet variable of parrent class.
        d1.name = "don";
        d1.age = 5;
        d1.bark();
        d1.eat();

        System.out.println(d1.name);
    }
}
