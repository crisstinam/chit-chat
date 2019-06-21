import javax.swing.*;
import java.awt.*;
public class TextPanel extends JPanel{
    
    private JTextArea textArea;
    
    public TextPanel(){
        textArea = new JTextArea();
        
        this.setLayout(new BorderLayout());
        this.add(new JScrollPane(textArea), BorderLayout.CENTER);
        
    }
    
    public void appendText(String text){
        textArea.append(text);
    }
    
    

}


