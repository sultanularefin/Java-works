
package linklist.with.java.assignment;
import java.util.Scanner;
class node{
    int data;
    node next;
}

class linklist
{ 
  node head;
  
void insert(node ob)
  {
   node q,t;
   if(head==null)
   {  head=new node();
      head.data=ob.data;
      head.next=null;
   }
     else {
         q=head;
         while(q.next!=null) q = q.next;
         t=new node();
         t.data=ob.data;
         t.next=null;
         q.next=t;
         
     } 
     
  }
 
  void show()
  {
     for (node q=head;q!=null;q=q.next)
  
        System.out.printf(" % d ::>",q.data);  
        System.out.println();
  }
      
  
  void reverse(node p)
  {   node q;
      q=p;
      if(q.next!=null)   
     reverse(q.next);
     System.out.printf("  %d <::::",q.data);
     
             
  }  
 int insertbefore(int item,int key)
 {
     node newnode,mid;
     int found=0;
     newnode =new node();
     newnode.data=item;
     if(head.data==key)
     {
         newnode.next=head;
         head=newnode;
         found=1;
     }
     else
     {
         mid=head;
         while((mid.next!=null)&&(mid.next.data!=key))mid=mid.next;
         if(mid.next!=null)
         {
             newnode.next=mid.next;
             mid.next=newnode;
             found=1;
         }
     }
     return found;
 } 

int insertafter(int item,int key)
{
    node newnode,mid;
    int found=0;
    newnode=new node();
    newnode.data=item;
    if(head.data==key)
    {
        newnode.next=head.next;
        head.next=newnode;
        found=1;
    }
    else
    {
        mid=head;
        while((mid!=null)&&(mid.data!=key))mid=mid.next;
        if(mid!=null)
        {
            newnode.next=mid.next;
            mid.next=newnode;
            found=1;
            
        }
        
    }
    return found;   
   }

void delete(int item)
{
      node temp1,temp2;
      temp1=head;  
      if(temp1.data==item)
        {
           head=temp1.next;
           return ;
           
        }
      else{
        temp2=temp1;
        while(temp1!=null)
        {
            if(temp1.data==item)         
            { temp2.next=temp1.next;
              return ;
            }
        temp2=temp1;
        temp1=temp1.next;
        }   
    }
}
} 

public class LinklistWithJavaAssignment {

    
    
    
    public static void main(String[] args) {
           
    
{
   Scanner sc=new Scanner(System.in);
   linklist A=new linklist();
   while(true)     
   {
      int q;
      
     
   System.out.println(" choices ==>   1: insertion  2: show  3:insert_before  4:insert_after 5:delete and  6:reverse");
   
   q=sc.nextInt();
   if(q==1)
   {
      System.out.println("put number to insert:");
      int item=sc.nextInt();
      node ob=new node();
      ob.data=item;
      ob.next=null;
      A.insert(ob);
    }
     else if(q==2) A.show();
     
             
     else if(q==3)
     {
        int i,r; 
        System.out.println(" ==>Insert before method <==");
        System.out.println("what number do you want to insert: ?");
        i=sc.nextInt();
        System.out.println(" where ?(before what number)(enter valid position) ");
        r=sc.nextInt();
        A.insertbefore(i, r);
     }              
     
     else if(q==4)
     {
         System.out.println("==> Inser after method <==");
         int i,r;
         System.out.println("put the number that you want to insert: ?");
         i=sc.nextInt();
         System.out.println("where ? (after what number)(enter valid position) ");
         r=sc.nextInt();
         A.insertafter(i, r);
     }
     else if(q==5)
         
     {
         System.out.println(" Which number you want to delete: ");
         int n;
         n=sc.nextInt();
         A.delete(n);
        
     }
      
     else if(q==6){ 
         A.reverse(A.head);
         System.out.printf("%c", + '\n');
     }        
     else break;
    }
 }
}

}
