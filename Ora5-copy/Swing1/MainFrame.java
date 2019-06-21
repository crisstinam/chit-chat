import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class MainFrame extends JFrame{
    //private JTextArea textArea;
    //private JButton btn;
    private TextPanel textPanel;
    private Toolbar toolbar;
    
    public MainFrame(){
      super("Hello world");
      
      this.setLayout(new BorderLayout());
      //textArea = new JTextArea();
      toolbar = new Toolbar();
      textPanel = new TextPanel();
      //btn = new JButton("Click me!");
      toolbar.setTextPanel(textPanel);
      
      /*btn.addActionListener(new ActionListener(){
          @Override
          public void actionPerformed(ActionEvent arg0){
            //textArea.append("Hello\n");
            textPanel.appendText("Hello\n");
          }
        });*/

      //this.add(textArea,BorderLayout.CENTER);
      this.add(toolbar,BorderLayout.NORTH);
      this.add(textPanel,BorderLayout.CENTER);
      //this.add(btn, BorderLayout.SOUTH);
      
      this.setSize(600,500);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
    }

}