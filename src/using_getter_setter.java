import org.w3c.dom.ls.LSOutput;

// area and volume of sphere
 class sphere{
    double radius;
    public void setradius(int r){
        radius = r;
    }
    public double getradius() {
        return radius;
    }
    public double area(){
        return 4 * 3.14 * radius * radius;
    }
    public double volume(){
        return 1.33 * 3.14 * radius * radius * radius;
    }
}
class using_getter_setter {
    public static void main(String[] args) {
        sphere s = new sphere();
        s.setradius(4);
        System.out.println(s.getradius());
        System.out.println(s.area());
        System.out.println(s.volume());
    }
}


// customise parameter using constructor

//class rectangle1 {
//    int length;
//    int breadth;
//
//    public rectangle1(int l, int b) {
//        length = l;
//        breadth = b;
//    }
//
//    public int getlength() {
//        return length;
//    }
//
//    public int getbreadth() {
//        return breadth;
//    }
//}
//class using_getter_setter{
//    public static void main(String[]args) {
//        rectangle1 r= new rectangle1(5,4);
//        System.out.println(r.getlength());
//        System.out.println(r.getbreadth());
//    }
//}


//radius and height of cylinder

//    class cylinder{
//        int radius;
//        int height;
//        public cylinder(int r,int h){
//            radius=r;
//            height=h;
//        }
//        public void setRadius(int r){
//            radius=r;
//        }
//        public double getRadius(){
//            return radius;
//        }
//        public void setHeight(int h){
//            height=h;
//        }
//        public double getHeight(){
//            return height;
//        }
//        public void setsurfacearea(int r,int h){
//            radius=r;
//            height=h;
//        }
//        public double getsurfacearea(){
//            return ((2 * 3.14 * radius * height) + ( 2 * 3.14 * radius * radius));
//        }
//    }
//    public class using_getter_setter {
//        public static void main(String[]args) {
//            cylinder c = new cylinder(3,5);
//            //c.setRadius(3);
//            System.out.println(c.getRadius());
//            //c.setHeight(5);
//            System.out.println(c.getHeight());
//           // c.setsurfacearea(2,3);
//           System.out.println(c.getsurfacearea());
//        }
//    }

//radius and perimeter of circle

//class circle1 {
//    double radius;
//
//    public void setarea(int r) {
//        radius = r;
//    }
//
//    public double getarea() {
//        return 3.14 * radius * radius;
//    }
//
//    public void setperimeter(int r) {
//        radius = r;
//    }
//
//    public double getperimeter() {
//        return 2 * 3.14 * radius;
//    }
//}
//class using_getter_setter{
//    public static void main(String[] args) {
//        circle1 c = new circle1();
//        c.setarea(4);
//        System.out.println(c.getarea());
//        c.setperimeter(2);
//        System.out.println(c.getperimeter());
//    }
//}
//