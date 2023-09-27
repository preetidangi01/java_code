import java.awt.Frame;
import java.awt.Color;
import java.awt.Label;
import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class MyFrame extends Frame implements WindowListener,ActionListener
{
    private Label lb1,lb2;
    private TextField tf1;
    private Button btn1;
    public MyFrame()
    {
        this.setVisible(true);
        this.setTitle("My Frame");
        this.setBackground(Color.yellow);
        this.setBounds(100,50,700,400);
        this.setLayout(null);
        this.addWindowListener(this);
        
        lb1=new Label("Enter Your Name");
        lb1.setBounds(10 ,50,150,30);
        this.add(lb1);
        
        tf1=new TextField();
        tf1.setBounds(170, 50, 150, 30);
        this.add(tf1);
        
        btn1=new Button("SUBMIT");
        btn1.setBounds(40, 100, 80, 40);
        btn1.setBackground(Color.gray);
        btn1.setForeground(Color.white);
        btn1.addActionListener(this);
        
        lb2=new Label();
        lb2.setBounds(150,130,150,30);
        this.add(lb2);
        
        this.add(btn1);
        btn1.addActionListener(this);
        this.addWindowListener(this);
        
        
    }

    @Override
    public void windowOpened(WindowEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowClosing(WindowEvent e) {
          this.dispose();
      //  throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
      
    }

    @Override
    public void windowClosed(WindowEvent e) {
        ///throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowIconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowActivated(WindowEvent e) {
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        String s=tf1.getText();
        lb1.setText("Your Name is"+s);
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
class Test
{
    public static void main(String args[])throws Exception
    {
        new MyFrame();
    }
}
