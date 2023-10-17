import java.util.Dictionary;

import java.util.Enumeration;

import java.util.Hashtable;

public class vending_machine{
   
        int amount=0,balance=0;
    
       void items(Dictionary dictionary){
     
                     Enumeration<String> keys = dictionary.keys();
		
                     while (keys.hasMoreElements()) {
		 
                                   for(int i=0;i<dictionary.size();i++){
			
                                              String key = keys.nextElement();
			
                                              System.out.println(key);
     
                                   }
		
                     }
    
          }
    
       void dispense(int op){
        
                      if(op == 1)
            
                             System.out.println("Dispensing lassi");
       
                      if(op == 2)
            
                             System.out.println("Dispensing biscuits");
        
                      if(op == 3)
            
                              System.out.println("Dispensing chips");
   
        }
    
       void calculate_transaction(int VA,int q){
       
                   amount = (q) * (VA);
        
                  System.out.println("Your Amount = "+amount);
   
       }

      void change(int x){
           
               balance = x - amount;
          
               System.out.println("Your change = "+balance);
     
      }
public static void main(String[] args) {
		
                        Dictionary<String, Integer> dictionary = new Hashtable<>();
		
                       dictionary.put("1.lassi", 100);
		
                       dictionary.put("2.biscuits", 200);
		
                       dictionary.put("3.chips", 300);
		
                       vending_machine obj1 = new vending_machine();
		
                       int v1 = dictionary.get("1.lassi");
		
                       int v2 = dictionary.get("2.biscuits");
		
                       int v3 = dictionary.get("3.chips");
		
                       obj1.items(dictionary);
		
                       obj1.dispense(2);
		
                       obj1.calculate_transaction(v2,1);
	
                       obj1.change(500);	
                       obj1.dispense(1);
		
                       obj1.calculate_transaction(v1,4);

	     obj1.change(500);
}	

}

OUTPUT:

3.chips

1.lassi

2.biscuits

Dispensing biscuits

Your Amount = 200

Your change = 300

Dispensing lassi

Your Amount = 400

Your change = 100


