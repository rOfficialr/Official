package game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GameMianban extends JPanel {   //创建面板类使其继承于JPanel(面板）类
    //定义两个数组来存放X坐标和Y坐标
    int[] snakeX = new int[200];
    int[] snakeY = new int[200];
    //游戏状态
    boolean isStart = false; //默认游戏暂停
    //定时器
    Timer timer1,timer2,timer3;
    //定义蛇的初始长度
    int length;
    //定义蛇的行走方向
    String dirction;
    //定义食物的坐标
    int foodX;
    int foodY;
    
    int barrierX[]={150,375,625};
    int barrierY[]={125,150,175,200,225,250,300,325,350,375,400,425,450,475,500};
//    int barrier1X;
//    int barrier1Y;
    //定义蛇的死亡状态
    boolean isDied = false;
    //定义分数
    int score;
    //定義初始定時器參數
    public  int tim = 0 ;
    public void chushihua() {  //初始化蛇
        length = 3;
        snakeX[0] = 175;    //蛇头
        snakeY[0] = 275;
        snakeX[1] = 150;    //蛇身1
        snakeY[1] = 275;
        snakeX[2] = 125;    //蛇身2
        snakeY[2] = 275;
        //初始化蛇头方向
        dirction = "R";
        //初始化食物坐标
        foodX = 525;
        foodY = 425;

        //分数
        score = 0;
    }
    public GameMianban(int tim) {  //构造函数
        this.tim = tim;
        chushihua();    //调用蛇的初始化函数
        //焦点定位在当前的面板上
        this.setFocusable(true);
                //监听RRR
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                super.keyPressed(e);
                int keyCode = e.getKeyCode();
                if (keyCode == 32) {    //监听空格键，，32 为空格键的 ASCLL 码
                    if (isDied) {  //如果死亡，则进行初始化操作
                        chushihua();
                        isDied = false;
                    }
                    else {isStart =!isStart;}//监听动作，如果为暂停，变为开始，反之，变为暂停
                    repaint();//重绘
                }
                if (keyCode == KeyEvent.VK_UP) {    //38为 上 的ASCLL
                    if (!"D".equals(dirction)) {
                        dirction = "h";
                        repaint();//重绘
                    }
                }
                if (keyCode == KeyEvent.VK_DOWN) {    //40为 下 的ASCLL
                    if (!"h".equals(dirction)) {
                        dirction = "D";
                        repaint();//重绘
                    }
                }
                if (keyCode == KeyEvent.VK_LEFT) {    //37为 左 的ASCLL
                    if (!"R".equals(dirction)) {
                        dirction = "L";
                        repaint();//重绘
                    }
                }
                if (keyCode == KeyEvent.VK_RIGHT) {    //39为 右 的ASCLL
                    if (!"L".equals(dirction)) {
                        dirction = "R";
                        repaint();//重绘
                    }
                }
                if (keyCode == 82) {
                    StartGame.gamestate = true;
                }
            }
        });
    }
    //paintComponent 该方法比较特殊，相当于图形版的main方法；Java虚拟机可自动调用
    @Override
    public void paintComponent(Graphics g) { //参数为画笔
        super.paintComponent(g);
        //填充背景色
        this.setBackground(new Color(35, 153, 138));
//              //像面板中的顶部添加图片
            Images.dingImg.paintIcon(this,g,0,0);
          //画蛇
            Images.headerImg.paintIcon(this,g,snakeX[0],snakeY[0] );

        for(int i=1;i<length;i++) {
            Images.bodyImg.paintIcon(this,g,snakeX[i],snakeY[i] );
        }
        if("R".equals(dirction)) {
            Images.RightImg.paintIcon(this,g,snakeX[0],snakeY[0] );
        }
        if("L".equals(dirction)) {
            Images.LeftImg.paintIcon(this,g,snakeX[0],snakeY[0] );
        }
        if("h".equals(dirction)) {
            Images.headerImg.paintIcon(this,g,snakeX[0],snakeY[0] );
        }
        if("D".equals(dirction)) {
            Images.DownImg.paintIcon(this,g,snakeX[0],snakeY[0] );
        }
            //画食物
            Images.foodImg.paintIcon(this,g,foodX,foodY);
          //画积分
            g.setColor(new Color(234, 27, 58));
            g.setFont( new Font("微软雅黑",Font.ITALIC,17));
            g.drawString("分数="+score,700,30);
            //若游戏暂停或者死亡，应有一个提示语
            if(isStart == false || isDied == true ) {  //游戏暂停或者死亡时运行：
                //游戏暂停：
                if (isStart == false) {
                    //画一个文字
                    g.setColor(new Color(215, 205, 20));
                    //三个参数，字体，加粗，字号
                    g.setFont( new Font("微软雅黑",Font.BOLD,40));
                    g.drawString("点击空格开始",220,80);//画文字 参数：内容，X轴，Y轴
                }
                //蛇死亡后：
                if (isDied == true) {
                    g.setColor(new Color(196, 27, 27));
                    g.setFont( new Font("微软雅黑",Font.CENTER_BASELINE,55));
                    g.drawString("你挂了",220,380);
                    //重新开始
                    g.setColor(new Color(10, 60, 234));
                    g.setFont( new Font("微软雅黑",Font.ITALIC,25));
                    g.drawString("重新开始请按空格",350,690);
              }
            }
    }
}

class timer1 extends  GameMianban {
    timer1(int tim) {
        super(50);
        timer1 = new Timer(tim, new ActionListener() {    //定时器设定   初级
            @Override
            public void actionPerformed(ActionEvent e) {
                if( isStart == true && !isDied) {
                    //蛇身子
                    for( int i = length-1;i>0;i--) {
                        snakeX[i] = snakeX[i-1];
                        snakeY[i] = snakeY[i-1];
                    }
                    //蛇头：
                    if ("R".equals(dirction)) {
                        snakeX[0] += 25;
                    }
                    if ("L".equals(dirction)) {
                        snakeX[0] -= 25;
                    }
                    if ("h".equals(dirction)) {
                        snakeY[0] -= 25;
                    }
                    if ("D".equals(dirction)) {
                        snakeY[0] += 25;
                    }
                    if(snakeX[0] > 775) { //蛇头超出边界的话使蛇头坐标变为0
                        snakeX[0] = 0;
                    }
                    if(snakeX[0] < 0) {
                        snakeX[0] = 775;
                    }
                    if (snakeY[0] > 725) {
                        snakeY[0] = 0;
                    }
                    if (snakeY[0] < 0) {
                        snakeY[0] = 725;
                    }
                    //蛇吃到食物
                    if (snakeX[0] == foodX && snakeY[0] == foodY) {
                        //蛇长度加一
                        length++;
                        score+=10;
                        //随机生成食物的坐标
                        foodX = ((int)(Math.random()*30)+1)*25;//([0,29]+1)*25 --->[1,30]*25
                        foodY = (new Random().nextInt(26)+4)*25;//([0,26)+4)*25 -->[4,29]*25
                    }
                    //蛇碰到自己
                    for (int i=1;i<length;i++) {
                        if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                            isDied = true ;
                        }
                    }
                    repaint(); //重绘
                }
            }
        });
        timer1.start();
    }
}

class timer2 extends GameMianban {
    timer2(int tim) {
        super(50);
        timer2 = new Timer(50, new ActionListener() {    //定时器设定  中级
            @Override
            public void actionPerformed(ActionEvent e) {
                if (isStart == true && !isDied) {
                    //蛇身子
                    for (int i = length - 1; i > 0; i--) {
                        snakeX[i] = snakeX[i - 1];
                        snakeY[i] = snakeY[i - 1];
                    }
                    //蛇头：
                    if ("R".equals(dirction)) {
                        snakeX[0] += 25;
                    }
                    if ("L".equals(dirction)) {
                        snakeX[0] -= 25;
                    }
                    if ("h".equals(dirction)) {
                        snakeY[0] -= 25;
                    }
                    if ("D".equals(dirction)) {
                        snakeY[0] += 25;
                    }
                    //蛇吃到食物
                    if (snakeX[0] == foodX && snakeY[0] == foodY) {
                        //蛇长度加一
                        length++;
                        score += 10;
                        //随机生成食物的坐标
                        foodX = ((int) (Math.random() * 30) + 1) * 25;//([0,29]+1)*25 --->[1,30]*25
                        foodY = (new Random().nextInt(26) + 4) * 25;//([0,26)+4)*25 -->[4,29]*25
                    }
                    //蛇碰到自己
                    for (int i = 1; i < length; i++) {
                        if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                            isDied = true;
                        }
                    }
                    if (snakeX[0] > 775 || snakeX[0] < 0 || snakeY[0] > 725 || snakeY[0] < 0) {
                        isDied = true;
                    }
                    repaint(); //重绘
                }
            }
        });
        timer2.start();
    }
}

class timer3 extends GameMianban {
    timer3(int tim) {
        super(50);
        timer3 = new Timer(35, new ActionListener() {    //定时器设定   困难
            @Override
            public void actionPerformed(ActionEvent e) {
                if( isStart == true && !isDied) {
                    //蛇身子
                    for( int i = length-1;i>0;i--) {
                        snakeX[i] = snakeX[i-1];
                        snakeY[i] = snakeY[i-1];
                    }
                    //蛇头：
                    if ("R".equals(dirction)) {
                        snakeX[0] += 25;
                    }
                    if ("L".equals(dirction)) {
                        snakeX[0] -= 25;
                    }
                    if ("h".equals(dirction)) {
                        snakeY[0] -= 25;
                    }
                    if ("D".equals(dirction)) {
                        snakeY[0] += 25;
                    }
                    //蛇吃到食物
                    if (snakeX[0] == foodX && snakeY[0] == foodY) {
                        //蛇长度加一
                        length++;
                        score+=10;
                        //随机生成食物的坐标
                        foodX = ((int)(Math.random()*30)+1)*25;//([0,29]+1)*25 --->[1,30]*25
                        foodY = (new Random().nextInt(26)+4)*25;//([0,26)+4)*25 -->[4,29]*25
                    }
                    for (int i = 0; i < barrierX.length; i++)
                        for (int m = 0; m < barrierY.length; m++) {
                            while (true) {
                                if (foodX == barrierX[i] && foodY == barrierY[m]) {
                                    foodX = ((int) (Math.random() * 30) + 1) * 25;//([0,29]+1)*25 --->[1,30]*25
                                    foodY = (new Random().nextInt(26) + 4) * 25;//([0,26)+4)*25 -->[4,29]*25
                                } else break;
                            }
                        }
                    //蛇碰到自己
                    for (int i=1;i<length;i++) {
                        if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                            isDied = true ;
                        }
                    }
                    //障碍物
                    for (int i=0;i<barrierX.length;i++ )
                        for (int m = 0;m<barrierY.length;m++) {
                            if(snakeX[0]== barrierX[i]&& snakeY[0]== barrierY[m])
                                isDied =true;
                        }
                    if (snakeX[0] > 775 || snakeX[0] < 0 || snakeY[0] > 725 || snakeY[0] < 0) {
                        isDied = true;
                    }
                    repaint(); //重绘
                }
            }
        });
        timer3.start();
    }
    @Override
    public void paintComponent(Graphics g) { //参数为画笔
        super.paintComponent(g);
        for(int i = 0;i<(barrierX.length);i++)
            for (int m = 0;m<barrierY.length;m++) {
                Images.barrierImg.paintIcon(this,g,barrierX[i],barrierY[m]);
            }
    }
}