package using.pkgfinal.to.prevent.overriding;
class Book {
    protected int pages=1200;
    public /* final */ void message() {
        System.out.println("Number of pages: " + pages);   
    }
}
class Dictionary extends Book {
    protected int definitions=3500;
    public void message() {                //ERROR
        System.out.println("Number of definitions " +  definitions);
        System.out.println("Definitions per page: " + (definitions/pages));
        super.message();   }
}

public class UsingFinalToPreventOverriding {

       public static void main(String[] args) {
        Dictionary D=new Dictionary();
        D.message();
           
    }

}
