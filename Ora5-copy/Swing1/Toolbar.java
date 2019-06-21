import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

public class Toolbar extends JPanel implements ActionListener{
   private JButton sendButton;
   private JTextField textField;
   private TextPanel textPanel;
    
   public Toolbar(){
        sendButton = new JButton("Send");
        textField = new JTextField(13);
        
        sendButton.addActionListener(this);
        textField.addActionListener(this);

        this.setLayout(new FlowLayout());
        
        this.add(textField);
        this.add(sendButton);
   }
    
   public void setTextPanel(TextPanel textPanel){
       this.textPanel = textPanel;
   }
   
   @Override
   public void actionPerformed (ActionEvent e){ 
       textPanel.appendText(textField.getText()+"\n");
       textField.setText("");
   }
   
    
   

}