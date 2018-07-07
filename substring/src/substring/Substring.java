package substring;

public class Substring {

    public static void main(String[] args) {
       String org="Bolbona at omuk dot com";
       String search1="at";
       String search2="dot";
       String result="";
       String sub1="@";
       String sub2=".";
       int i,j;
       System.out.println(org);
       i=org.indexOf(search1);
       
       do{
        i=org.indexOf(search1);
        
        
       if(i!=-1) 
       {
           result=org.substring(0,i);
           
           result =result+sub1;
           result=result +org.substring(i+search1.length());
           org=result;
           
       }
       }while(i!=-1);
       
        System.out.println(org);
        result=org.replace("dot", ".");
        System.out.println(result);
        String str="            Hello World ".trim();
        System.out.println(str);
        
       
    }

}
