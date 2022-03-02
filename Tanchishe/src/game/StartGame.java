package game;

import javax.swing.*;
import java.awt.*;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class StartGame {
    static boolean gamestate = true;
    static String s;
//    public static void keyPressed() {
//        super.k(e);
//        int keyCode = e.getKeyCode();
//        if (keyCode == 82) {
//            gamestate = true;
//        }
//    }

    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null,"本游戏分为简单，中级和困难难度\n" +
                "简单：贪吃蛇可以穿墙\n中级：贪吃蛇不能穿墙\n困难；贪吃蛇不能穿墙，且图中有障碍物\n"
                +"贪吃蛇由键盘上下左右键控制\n空格键：暂停或开始游戏","游戏说明",JOptionPane.INFORMATION_MESSAGE);
        //创建一个窗体
        JFrame jf = new JFrame("贪吃蛇 ——WHY,WZY,ZMF");
        //窗体弹出的坐标,对应窗体的大小
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;//获取屏幕的宽
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;//获取屏幕的高
        jf.setBounds((width - 800) / 2, (height - 800) / 2 - 20, 815, 810); //使窗体居中
        //将窗体设置为不可以调节大小的
        jf.setResizable(false);
        JMenuBar jb = new JMenuBar();
        JMenu menu1 = new JMenu("难度选项");
        JMenu menu2 = new JMenu("退出游戏");
        JMenu menu3 = new JMenu("帮助");
        jb.add(menu1);
        jb.add(menu2);
        jb.add(menu3);
        JMenuItem it1 = new JMenuItem("选择");
        JMenuItem it2 = new JMenuItem("确认退出");
        JMenuItem it3 = new JMenuItem("关于游戏");
        menu1.add(it1);
        menu2.add(it2);
        menu3.add(it3);
//        it1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                GameMianban.gamestate = true;
//            }
//        });
        //退出游戏监听
        it2.addActionListener(e -> System.exit(0));
        it3.addActionListener(e -> JOptionPane.showMessageDialog(null, "版本：1.1\n" +
                        "制作人：软工1901\n                翟明飞\n                王泽宇\n                王浩洋",
                "关于游戏", JOptionPane.INFORMATION_MESSAGE));
        jf.setJMenuBar(jb);
R
            if (gamestate) {
                Object[] objects = {"简单", "中级", "困难"};
                s = (String) JOptionPane.showInputDialog(null, "请选择\n", "选择难度",
                        JOptionPane.PLAIN_MESSAGE, new ImageIcon(""), objects, "贪吃蛇");
                gamestate = false;
            }
            if ("简单".equals(s)) {
                timer1 t1 = new timer1(50);              //初级难度
                jf.add(t1);
                jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                jf.setVisible(true);
            }
            if ("中级".equals(s)) {
                timer2 t2 = new timer2(50);             //中级难度
                jf.add(t2);
                jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                jf.setVisible(true);
            }
            if ("困难".equals(s)) {
                timer3 t3 = new timer3(50);               //困难难度
                jf.add(t3);
                jf.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
                jf.setVisible(true);
            }
        }
    }
}