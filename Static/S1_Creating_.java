class student{
    int erp;
    static String clgName = "rungta";
    //Static variable = created once shared among all objects. 
}

public class S1_Creating_ {
    public static void main(String[] augr){
        student s1 = new student();
        s1.erp = 10332;
        System.out.println(s1.erp);
        System.out.println(s1.clgName);

        student s2 = new student();
        System.out.println(s2.clgName);

    }
}

