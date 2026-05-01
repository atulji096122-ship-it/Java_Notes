
public class Bulitn_Method_in_String_2_ {
    public static void main(String[] args) {

    // 5.mutable String
        StringBuilder s1 = new StringBuilder("hello world");
        StringBuffer s2 = new StringBuffer("hello");

    // 6. Methods 
        //(A) append - add at last - returns a  stringBulder;

        s1.append(" java");
        System.out.println(s1);

        //(B) Insert - add at specific index - returns a stringBuilder

        s2.insert(2 ,"java");
        System.out.println(s2);

        //(C) Delete - (in this end index in not counted)

        s1.delete(3, 6);
        System.out.println(s1); // here we have to delete index from 3 to index 5 but we are written (3 , 6) because 6 is not counted here.


        //(D) Replace -
        s2.replace(2, 4, "iii");
        System.out.println(s2);

        //(E) reverse();
        System.out.println(s2.reverse());
    }
}
