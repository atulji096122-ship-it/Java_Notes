class car{
    void wheel(){
        System.out.println("Wheel : 4");
    }   
}
class Maruti extends car {
    void model(){
        System.out.println("Swift");
    }
    void seat(){
        System.out.println("4-seater");
    }
}
class kie extends car {
    void model(){
        System.out.println("Carnival");
    }
    void seat(){
        System.out.println("4-seater");
    }
}
public class Example_on_CAR{
    public static void main(String[] args) {
        Maruti m = new Maruti();
        m.model();
        m.wheel();
        m.seat();

        kie k  = new kie();
        k.model();
        k.wheel();
        k.seat();

    }
}
