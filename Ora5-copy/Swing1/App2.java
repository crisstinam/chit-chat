//import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class App2{
    public static void main(String[]args){
        SwingUtilities.invokeLater(new Runnable(){
            @Override
            public void run(){
                new MainFrame2();
            }
        });
    
    
    
    }
}