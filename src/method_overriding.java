
    class A{
        public void meth1(){
            System.out.println("I am method1 of A");
        }
        public void meth2(){
            System.out.println("I am method2 of A");
        }
    }
    class B extends A {
    @Override
        public void meth2() {
        super.meth2();
            System.out.println("I am method2 of B");
        }
        public void meth3() {
            System.out.println("I am method3 of B");
        }
    }
    public class method_overriding {
        public static void main(String[]args) {
          //  A a=new A();
          //  a.meth1();
         //   a.meth2();
             B b=new B();
           b.meth2();
        }
    }
