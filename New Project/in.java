import java.util.*;
public class in{
    void add(){
         Scanner sc=new Scanner(System.in);
   double total=50000;
   double tit=0;
   System.out.println("Please enter no of transaction :");
   int t=sc.nextInt();
   for(int i=1;i<=t;i++){
       System.out.println("Please enter the amount :");
       double amount=sc.nextDouble();
       if(amount>total){
           System.out.println("Insufficient Balance >");
       }
     
        if(i>3){
          total-=18;
       } if(amount>10000 || amount%100!=0){
           System.out.println("Oops your Transaction failed");
       }
       else{
           tit=total;
       total=total-amount;
       if(total<1000){
           System.out.println("OOps Cross minimum balance so,amount cant be deducted ?");
           total=tit;
       }
       }  
       
   }
   System.out.print(total);
    }
    void sub(){
        
    }
    void mul(){
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter days :");
     int days=sc.nextInt();
     if(days >84){
         System.out.println("Sorry your plan was expired");
     }
     
     else{
   
          System.out.println("Enter msg :");
         int msg=sc.nextInt();
         System.out.println("Enter calls : ");
         int calls=sc.nextInt();
         System.out.println("Enter data :");
         double data=sc.nextDouble();
          System.out.println(84-days + " "+"days to  expired ");
         if(msg>100){
             System.out.println("message failed ");
         }
         else{
             System.out.println(100-msg +" "+"message yet to sent ");
         }
         if(calls>3000){
              System.out.println("connection failed ");
         }
         else{
              System.out.println(3000-calls +" "+" yet to called ");
         }
         if(data>2){
              System.out.println("Data was Slowed ");
         }
         else{
              System.out.println(2-data +" "+"data remains ");
         }
    }
    }
    void div(){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    String s=(a<0)? "Enter valid number":(a>21)? a-21+" "+"more lemons":(a>0 && a<21)? 21-a+" "+"is needed":(a==21)? "sufficient":"Enter valid number";
    System.out.println(s); 
    }
    public static void main(String args[]){
        in object=new in();
        object.add();
    }
}