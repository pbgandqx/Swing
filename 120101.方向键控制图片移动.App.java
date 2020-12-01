import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_Plane=new JLabel();
    int CELL=128;
    int row,column;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    row++;
                    label_Plane.setBounds(column*CELL,row*CELL,CELL,CELL);
                   
                }else if (e.getKeyCode() == KeyEvent.VK_UP) {
                    row--;
                    label_Plane.setBounds(column*CELL,row*CELL,CELL,CELL);
                    
                }else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                    column--;
                    label_Plane.setBounds(column*CELL,row*CELL,CELL,CELL);
                    
                }else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
                    column++;
                    label_Plane.setBounds(column*CELL,row*CELL,CELL,CELL);
                   
                }
            }
        });


    }
    //显示窗体方法
    void go(){
        java.net.URL imgURL = App.class.getResource("img/plane0.png");
        label_Plane.setIcon(new ImageIcon(imgURL));
        label_Plane.setBounds(100,100,CELL,CELL);
        myPanel.add(label_Plane);

        label_txt.setText("这是一个label标签");
        label_txt.setBounds(0,0,CELL,CELL);
        myPanel.add(label_txt);



        JFrame frame = new JFrame("快来移动我吧");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,512,720);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);
    }
    public static void main(String[] args) {
        new App().go();
    }
}
