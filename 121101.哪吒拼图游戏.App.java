import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.List;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_txt=new JLabel();
    JLabel label_foreground=new JLabel();
    int array2d[][]={
            {1,3,2},
            {4,5,8},
            {7,6,9},
            {0,11,10}
    };
    int cell=128;
    int score=0;
    List<JLabel> label_list=new ArrayList<>();
    //构造方法App()
    public App() {
        showMyGame();
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);//敲击任意键。
//                以下三行代码，表示有图小图相对于窗体向下移动了三步
                if (e.getKeyCode()==KeyEvent.VK_UP){
                    new Zero().goDown(array2d);
                    score++;
                }if (e.getKeyCode()==KeyEvent.VK_DOWN){
                    new Zero().goUp(array2d);
                    score++;
                }
                if (e.getKeyCode()==KeyEvent.VK_LEFT){
                    new Zero().goRight(array2d);
                    score++;
                }
                if (e.getKeyCode()==KeyEvent.VK_RIGHT){
                    new Zero().goLeft(array2d);
                    score++;
                }


                showMyGame();
            }
        });

    }

    //    为了使程序结构清晰，设置一个方法来显示所有组件showMyGame()
    void showMyGame(){
        label_txt.setText("总步数："+score);
        label_txt.setBounds(0,0,200,30);
        myPanel.add(label_txt);
        //移动矩阵
        for (int row = 0; row < array2d.length; row++) {
            for (int column = 0; column < array2d[0].length; column++) {
                label_list.add(new JLabel());
                java.net.URL imgURL = App.class.getResource("img/nezha_"+String.valueOf(array2d[row][column])+".png");
                label_list.get(row*3+column).setIcon(new ImageIcon(imgURL));
                label_list.get(row*3+column).setBounds(column*cell,row*cell,cell,cell);
                myPanel.add(label_list.get(row*3+column));
                myPanel.repaint();
            }
        }
    }

    //显示窗体方法go()
    void go(){


        //网格
        java.net.URL imgURL999 = App.class.getResource("img/foreground.png");
        label_foreground.setIcon(new ImageIcon(imgURL999));
        label_foreground.setBounds(0,0,384,512);
        myPanel.add(label_foreground);

        myPanel.setLayout(null);
        JFrame frame = new JFrame("一个小程序");
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(400,150,384,530);
        //frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);//禁止用户修改大小
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
