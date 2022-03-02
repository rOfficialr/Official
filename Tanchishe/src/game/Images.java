package game;

import javax.swing.*;
import java.net.URL;

/**
*该类用来获取游戏涉及图片
 */
public class Images {
    //body
    public static URL bodyURL = Images.class.getResource( "/images/body.png");   // /表示指定相对路径
    //将图片封装位一个对象
    public static ImageIcon bodyImg = new ImageIcon(bodyURL);
    //header
    public static URL headerURL = Images.class.getResource( "/images/header.png");   // /表示指定相对路径
    //将图片封装位一个对象
    public static ImageIcon headerImg = new ImageIcon(headerURL);
    //food
    public static URL foodURL = Images.class.getResource( "/images/food.png");   // /表示指定相对路径
    //将图片封装位一个对象
    public static ImageIcon foodImg = new ImageIcon(foodURL);
        
    public static URL barrierURL = Images.class.getResource( "/images/barrier.png");
    public static URL barrier1URL = Images.class.getResource( "/images/barrier1.png");
    public static ImageIcon barrierImg = new ImageIcon(barrierURL);
    public static ImageIcon barrier1Img = new ImageIcon(barrier1URL);
    //ding
    public static URL dingURL = Images.class.getResource( "/images/ding.png");
    //将图片封装位一个对象
    public static ImageIcon dingImg = new ImageIcon(dingURL);
    //Down
    public static URL DownURL = Images.class.getResource( "/images/Down.png");   // /表示指定相对路径
    //将图片封装位一个对象
    public static ImageIcon DownImg = new ImageIcon(DownURL);
    //Right
    public static URL RightURL = Images.class.getResource( "/images/Right.png");   // /表示指定相对路径
    //将图片封装位一个对象
    public static ImageIcon RightImg = new ImageIcon(RightURL);
    //Left
    public static URL LeftURL = Images.class.getResource( "/images/Left.png");   // /表示指定相对路径
    //将图片封装位一个对象
    public static ImageIcon LeftImg = new ImageIcon(LeftURL);
}