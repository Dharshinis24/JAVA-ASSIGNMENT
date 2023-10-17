public class bank_account_no{
 
       int acc_no,balance = 0;
  
       bank_account_no(int x){
      
       acc_no = x;
  
      }
   
     void depositing(int x){
        
        balance += x;
       
       balance_details();
   
     }
   
   void Withdrawing(int x){
       
       if(balance != 0){
            
               if(balance < x){
            
                         System.out.println("Account Number:"+acc_no+"\nInsufficient Amount!");
           
               }
            
             else{
            
                  balance -= x;
            
                 balance_details();
            
             }
       
        }
      
       else
       
       System.out.println("Account Number:"+acc_no+"\nYour Balance is Zero,Cann't Withdraw");
    
      }
    
   void balance_details(){
       
              System.out.println("Account Number:"+acc_no+"\nBalance:"+balance);
    
    }

public static void main(String[] args){
    
bank_account_no obj1 = new bank_account_no(1945);
 
bank_account_no obj2 = new bank_account_no(2000);
    
bank_account_no obj3 = new bank_account_no(2999);
    
obj1.depositing(5000);
   
obj2.depositing(10000);
    
obj2.Withdrawing(2000);
    
obj3.depositing(2000);
    
obj1.Withdrawing(2500);
    
obj3.Withdrawing(20000);
    
obj1.Withdrawing(2500);
   
 obj1.Withdrawing(2500);
   
 
}

}

OUTPUT:

Account Number:1945

Balance:5000

Account Number:2000

Balance:10000

Account Number:2000

Balance:8000

Account Number:2999

Balance:2000

Account Number:1945

Balance:2500

Account Number:2999

Insufficient Amount!

Account Number:1945

Balance:0

Account Number:1945

Your Balance is Zero,Cann't Withdraw
