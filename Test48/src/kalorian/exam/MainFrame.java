package kalorian.exam;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * description:
 * author:
 * time:2020/10/16
 */
public class MainFrame{

    public MainFrame(){

    }

    public static void main(String[] args) {
        createFrame(new CloneFrameTest(){

        });
    }

    public static void createFrame(CloneFrame cloneFrame){
        cloneFrame.cloneTest();
    }
}

interface CloneFrame{
    public void cloneTest();
}

class CloneFrameTest implements CloneFrame{

    @Override
    public void cloneTest() {

    }
}

class MainFrameModel extends JFrame{

    public MainFrameModel(){
        Container contentPane = getContentPane();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setBounds(200,200,400,300);
        setLayout(new GridLayout(2,1));

        JLabel jl=new JLabel("Test");
        contentPane.add(jl);
        JButton jb=new JButton("click");
        contentPane.add(jb);

        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("BBA!");
            }
        });

        setVisible(true);
    }
}
