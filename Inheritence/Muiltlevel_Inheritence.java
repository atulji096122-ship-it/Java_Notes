class Dadaji {
    String surname;
    boolean isbuilding;

    void relation(){
        System.out.println("I am Dada ji");
    }
}

class Papa extends Dadaji{
    int height;
    void relation2(){
        System.out.println("I am father");
    }
}

class You extends Papa{
    void relation3(){
        System.out.println("I am you");
    }

}
public class Muiltlevel_Inheritence {
    public static void main(String[] args) {
        System.out.println("Multilevel Inheritence");
        You y = new You();
        y.surname = "Pandit";
        y.height = 6;
        

        System.out.println(y.surname);
        System.out.println(y.height);
        y.relation();
        y.relation2();
        y.relation3();
    }
}
