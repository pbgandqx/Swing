import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class App {
    JPanel myPanel=new JPanel();
    JLabel label_background=new JLabel();
    JLabel label_frog1=new JLabel();
    JLabel label_frog2=new JLabel();
    JLabel label_frog3=new JLabel();
    JLabel label_score=new JLabel();
    JTextArea textArea_UserInput=new JTextArea();
    int  x1=390,y1=256,x2=256,y2=120,x3=650,y3=16;
    int scoer=0,scoer1=0,scoer2=0,scoer3=0,scoer4=0,scoer5=0,scoer6=0,scoer7=0,scoer8=0,scoer9=0;
    int witch_frog=1;
    //构造方法
    public App() {
        myPanel.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                textArea_UserInput.append(String.valueOf(e.getKeyChar()));
                if (witch_frog==1){
                    if (label_frog1.getX()==100 && label_frog1.getY()==430 && textArea_UserInput.getText().equals("hello")){
                        scoer1=1;
                        scoer=scoer1+scoer2+scoer3+scoer4+scoer5+scoer6+scoer7+scoer8+scoer9;
                        label_score.setText("得分："+String.valueOf(scoer));

                        label_frog1.setBounds(390,256,128,128);
                        textArea_UserInput.setText("");
                    }
                    if (label_frog1.getX()==x1 && label_frog1.getY()==y1 && textArea_UserInput.getText().equals("world")){
                        scoer2=1;
                        scoer=scoer1+scoer2+scoer3+scoer4+scoer5+scoer6+scoer7+scoer8+scoer9;
                        label_score.setText("得分："+String.valueOf(scoer));

                        label_frog1.setBounds(256,120,128,128);
                        textArea_UserInput.setText("");
                    }
                    if (label_frog1.getX()==x2 && label_frog1.getY()==y2 && textArea_UserInput.getText().equals("hi")){
                        scoer3=1;
                        scoer=scoer1+scoer2+scoer3+scoer4+scoer5+scoer6+scoer7+scoer8+scoer9;
                        label_score.setText("得分："+String.valueOf(scoer));

                        label_frog1.setBounds(650,16,128,128);
                        textArea_UserInput.setText("");
                        witch_frog=2;
                    }
                }
                if (witch_frog==2){
                    if (label_frog2.getX()==80 && label_frog2.getY()==430 && textArea_UserInput.getText().equals("hello")){
                        scoer4=1;
                        scoer=scoer1+scoer2+scoer3+scoer4+scoer5+scoer6+scoer7+scoer8+scoer9;
                        label_score.setText("得分："+String.valueOf(scoer));

                        label_frog2.setBounds(390,256,128,128);
                        textArea_UserInput.setText("");
                    }
                    if (label_frog2.getX()==x1 && label_frog2.getY()==y1 && textArea_UserInput.getText().equals("world")){
                        scoer5=1;
                        scoer=scoer1+scoer2+scoer3+scoer4+scoer5+scoer6+scoer7+scoer8+scoer9;
                        label_score.setText("得分："+String.valueOf(scoer));

                        label_frog2.setBounds(256,120,128,128);
                        textArea_UserInput.setText("");
                    }
                    if (label_frog2.getX()==x2 && label_frog2.getY()==y2 && textArea_UserInput.getText().equals("hi")){
                        scoer6=1;
                        scoer=scoer1+scoer2+scoer3+scoer4+scoer5+scoer6+scoer7+scoer8+scoer9;
                        label_score.setText("得分："+String.valueOf(scoer));

                        label_frog2.setBounds(630,16,128,128);
                        textArea_UserInput.setText("");
                        witch_frog=3;
                    }
                }
                if (witch_frog==3){
                    if (label_frog3.getX()==60 && label_frog3.getY()==430 && textArea_UserInput.getText().equals("hello")){
                        scoer7=1;
                        scoer=scoer1+scoer2+scoer3+scoer4+scoer5+scoer6+scoer7+scoer8+scoer9;
                        label_score.setText("得分："+String.valueOf(scoer));

                        label_frog3.setBounds(390,256,128,128);
                        textArea_UserInput.setText("");
                    }
                    if (label_frog3.getX()==x1 && label_frog3.getY()==y1 && textArea_UserInput.getText().equals("world")){
                        scoer8=1;
                        scoer=scoer1+scoer2+scoer3+scoer4+scoer5+scoer6+scoer7+scoer8+scoer9;
                        label_score.setText("得分："+String.valueOf(scoer));

                        label_frog3.setBounds(256,120,128,128);
                        textArea_UserInput.setText("");
                    }
                    if (label_frog3.getX()==x2 && label_frog3.getY()==y2 && textArea_UserInput.getText().equals("hi")){
                        scoer9=1;
                        scoer=scoer1+scoer2+scoer3+scoer4+scoer5+scoer6+scoer7+scoer8+scoer9;
                        label_score.setText("得分："+String.valueOf(scoer));

                        label_frog3.setBounds(610,16,128,128);
                        textArea_UserInput.setText("");
                        witch_frog=4;
                    }
                }
                if (witch_frog==4){
                    JOptionPane.showMessageDialog(myPanel,"恭喜你，青蛙全部过河成功！");
                    //结束游戏，关闭窗口
                    System.exit(0);

                }
            }
        });
    }
    //显示窗体方法
    void go(){
        textArea_UserInput.setText("");
        textArea_UserInput.setBounds(0,0,300,50);
        myPanel.add(textArea_UserInput);

        java.net.URL imgURL = App.class.getResource("img/background.png");
        label_background.setIcon(new ImageIcon(imgURL));
        label_background.setBounds(0,0,1024,600);

        java.net.URL imgURL2 = App.class.getResource("img/frog.png");
        label_frog1.setIcon(new ImageIcon(imgURL2));
        label_frog1.setBounds(100,430,128,128);

        java.net.URL imgURL3 = App.class.getResource("img/frog.png");
        label_frog2.setIcon(new ImageIcon(imgURL3));
        label_frog2.setBounds(80,430,128,128);

        java.net.URL imgURL4 = App.class.getResource("img/frog.png");
        label_frog3.setIcon(new ImageIcon(imgURL4));
        label_frog3.setBounds(60,430,128,128);

        label_score.setText("得分：0");
        label_score.setBounds(0,120,200,50);
        myPanel.add(label_score);
        myPanel.add(label_frog1);
        myPanel.add(label_frog2);
        myPanel.add(label_frog3);
        myPanel.add(label_background);

        JFrame frame = new JFrame("青蛙过河");
        myPanel.setLayout(null);
        frame.setContentPane(myPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBounds(100,100,1024,600);
        //frame.pack();
        frame.setVisible(true);
        myPanel.setFocusable(true);//键盘监听必须加panel面板的焦点获取才可以
    }
    public static void main(String[] args) {
        new App().go();
    }
}
