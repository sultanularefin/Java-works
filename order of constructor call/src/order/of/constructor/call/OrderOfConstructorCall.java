package order.of.constructor.call;
class A{
A()
{System.out.println("A’s Constructor");  }
}
class B extends A{
B()
{System.out.println("B’s Constructor");  }
}
class C extends B{
C()
{System.out.println("C’s Constructor");  }
}

public class OrderOfConstructorCall {

       public static void main(String[] args) {
        C c = new C();
       }

}
