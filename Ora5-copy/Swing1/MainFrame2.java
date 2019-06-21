import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.JTextArea;
import javax.swing.JButton;

public class MainFrame2 extends JFrame{
    //private JTextArea textArea;
    //private JButton btn;
    private TextPanel textPanel;
    private Toolbar toolbar;
    
    public MainFrame2(){
      super("Chatt app");
      
      this.setLayout(new BorderLayout());
      
      toolbar = new Toolbar();
      textPanel = new TextPanel();

      toolbar.setTextPanel(textPanel);

      this.add(toolbar,BorderLayout.NORTH);
      this.add(textPanel,BorderLayout.CENTER);

      this.setSize(600,500);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);
    }
}