package 学生选课;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginListener implements ActionListener {
    private JComboBox<Object> jco;
    private JPasswordField JLpwd;
    private JFrame jf;
    public LoginListener(JComboBox<Object> jco, JPasswordField jLpwd, JFrame jf){
        super();
        this.jco = jco;
        this.JLpwd = JLpwd;
        this.jf = jf;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = (String) jco.getSelectedItem();
        String pwd = new String(JLpwd.getPassword());
//        My_Connection con = new My_Connection();
//
        if (name.equals("123") && pwd.equals("123")) {
            jf.dispose();
        }
    }
}
