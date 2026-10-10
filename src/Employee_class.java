import java.sql.SQLOutput;
    class E{
        int salary;
        String name;
        public int getsalary(){
            return salary;
        }
        public String getname(){
            return name;
        }
        public void setname(String n){
            name=n;
        }
    }class cellphone{
    public void ringing() {
        System.out.println("ringing...");
    }
    public void vibrating(){
        System.out.println("vibrating...");
    }
    public void callfriend(){
        System.out.println("calling mahi...");
    }
}
public class Employee_class {
    public static void main(String[]arg) {
        E neha=new E();
        neha.setname("code with neha");
        neha.salary=256;
        System.out.println(neha.getsalary());
        System.out.println(neha.getname());
        cellphone motorola=new cellphone();
        motorola.ringing();
        motorola.vibrating();
        motorola.callfriend();
    }
}
