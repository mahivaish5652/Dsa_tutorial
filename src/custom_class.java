import org.w3c.dom.ls.LSOutput;
 class Employ {
     int id;
     String name;
    int salary;
     public void printdetails() {
         System.out.println("id is = " + id);
         System.out.println("name is = " + name);
     }
     public int getsalary() {
         return salary;
     }
 }
     public class custom_class {
         public static void main(String[] args) {
             Employ ob = new Employ();
             System.out.println("this is employ class");
             ob.id = 12;
             ob.name = "code with neha";
             ob.printdetails();
             ob.salary=30000;
             int salary=ob.getsalary();
             System.out.println("salary = "+salary);
         }
     }
