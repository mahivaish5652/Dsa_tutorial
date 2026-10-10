import java.sql.SQLOutput;

//class Myemployee {
//    int id;
//    String name;
//
//    public Myemployee() {
//        id = 25;
//        name = "your_name";
//    }
//
//    public String getname() {
//        return name;
//    }
//
//    public void setname(String n) {
//        this.name = n;
//    }
//
//    public void setId(int i) {
//        this.id = i;
//    }
//
//    public int getId() {
//        return id;
//    }
//}
//public class constructor {
//    public static void main(String[]args) {
//        Myemployee emp = new Myemployee();
//        emp.setname("code with neha");
//        emp.setId(45);
//        System.out.println(emp.getId());
//        System.out.println(emp.getname());
//    }
//}


    class salary {
    int id;
    String name;
    int salary;
         public void salary(int a) {
            id = 1;
            name = "neha";
            salary = a;
             System.out.println(a);
    }
          public int salary(int b,int c) {
            id = 2;
            name = "mahi";
              return b+c;
    }
}
public class constructor {
    public static void main(String[]args) {
        salary r=new salary();
        r.salary(50000);
        System.out.println(r.salary(15000,30000));
    }
}
