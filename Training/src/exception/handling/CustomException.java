package exception.handling;
public class CustomException extends Exception {  
        
     void validate(int age) {  
         try{  
        	 if(age<18) {  
        		 throw new CustomException(); 
                  }
        	 else  
                 System.out.println("welcome to vote"); 
         }
         catch(CustomException m) {
               System.out.println("Exception occured: "+m);
         } 
    }  
    public static void main(String args[]){  
         CustomException ce=new CustomException();
         ce.validate(12);
         System.out.println("rest of the code...");  
    }  
}  

