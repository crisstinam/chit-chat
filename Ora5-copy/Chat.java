import java.util.*;

public class Chat{
    
    public static void main(String[]args){
        Scanner s= new Scanner(System.in);
        String message;
        
        while(true){
          System.out.println("Please insert message: (or \"QUIT\" if you want to exit");
          message= s.nextLine();
          if(message.equals("QUIT")){
              return;
            }
          
          System.out.println("Your message: "+message);
        }
    }

}