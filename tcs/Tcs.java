package tcs;
import java.util.*;


// 
class Transaction{
    String sender;
    String reciver;
    double amount;
    double time;
    Transaction(String sender,String reciver,double amount,double time){
        this.sender=sender;
        this.reciver=reciver;
        this.amount=amount;
        this.time=time;

    }
}





public class Tcs {
    
    public static void main(String args[]){

        String sender;
        String reciver;
        double amount;
        double time;

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        List<Transaction> list=new ArrayList<>();
        
        for(int i=0;i<n;i++){
            sender=sc.next();
            reciver=sc.next();
            amount=sc.nextDouble();
            time=sc.nextDouble();
            
            Transaction obj=new Transaction(sender,reciver, amount,time);
            list.add(obj);

        }

        boolean[] arr=new boolean[n];
        for(int i=0;i<n;i++){
            Transaction obja=list.get(i);
            for(int j=i+1;j<n;j++){

                Transaction objb=list.get(j);
                if( (obja.sender).equals(objb.sender) && (obja.reciver).equals(objb.reciver) && obja.amount == objb.amount &&  Math.abs(obja.time-objb.time) <=60.0){
                    arr[i]=true;
                    arr[j]=true;
                }
            }
        }


        // printing the non fraud transaction 

        for(int i=0;i<arr.length;i++){
            if(arr[i]==false){
                Transaction objf=list.get(i);
                System.out.print(objf.sender +" ");
                System.out.print(objf.reciver+" ");
                System.out.print(objf.amount+" ");
                System.out.print(objf.time+" ");
             
            }
        }

    }
}
