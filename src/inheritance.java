// accessible or not

//   class A{
//    int x;
//      public  void setx(int x){
//          this.x=x;
//        System.out.println("Hii, I am neha!!");
//    }
//       public int getx(){
//         return x;
//    }
//   }
//   class B extends A{
//       int y;
//       public void sety(int y){
//           System.out.println("Hello!!");
//       }
//       public int gety(){
//           return y;
//       }
//   }
//   public class inheritance {
//       public static void main(String[]args) {
//           //super class object
//           A oa= new A();
//           oa.setx(1);
//         //  oa.sety(2);   //not accessible
//           B ob= new B();
//           ob.setx(4);
//           ob.sety(2);
//          // System.out.println(ob.getx());
//          //System.out.println(ob.gety());
//       }
//}

// class animal and another class dog from it

 class Animal{
    int s;
    int e;
    public void sound(int s){
        this.s=s;
        System.out.println("animals make noise....");
    }
    public void eat(int e){
        this.e=e;
        System.out.println("animal wants to be eat something....");
    }
 }
 class Dog extends Animal{
    int b;
    public void barks(int b) {
        this.b = b;
        System.out.println("suddenly dog barks ");
    }
    }
    class inheritance{
        public static void main(String[]args) {
//            Animal a = new Animal();
//            a.sound(2);
//            a.eat(30);
         //   a.barks(2); // not accessible
            Dog d= new Dog();
            d.barks(2);
            d.sound(2);
        }
 }