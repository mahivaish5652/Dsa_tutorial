
class Square{
    int side;
    public int area(){
        // area=side*side;
        return side*side;
    }
    public int perimeter(){
        //  perimeter=4*side;
        return 4*side;
    }
}
class rectangle{
    public int area(int l, int b){
        return l*b;
    }
}
class circle{
    public double area(int r){
        return 3.14*r*r;
    }
}public class area_of_sq_re_pe_ci {
    public static void main(String[] args) {
        Square s = new Square();
        s.side = 2;
        System.out.println(s.area());
        System.out.println(s.perimeter());
        rectangle re = new rectangle();
        System.out.println(re.area(2, 3));
        circle c = new circle();
        System.out.println(c.area(2));
    }
}


