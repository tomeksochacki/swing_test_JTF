package nextswingstudyjtextfiledexample;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TFDemo implements ActionListener{

    JTextField jtf;
    JButton jbtnRev;
    JLabel jlabPropt, jlabContents;

    TFDemo(){

        JFrame jfrm = new JFrame("Field text");
        jfrm.setLayout(new FlowLayout());
        jfrm.setSize(240, 120);
        jfrm.setDefaultCloseOperation(3);

        jtf = new JTextField(10);
        jtf.setActionCommand("myTF");
        JButton jbtnRev = new JButton("Reverse");

        jtf.addActionListener(this);
        jbtnRev.addActionListener(this);

        jlabPropt = new JLabel("Enter the text");
        jlabContents = new JLabel("");

        jfrm.add(jlabPropt);
        jfrm.add(jtf);
        jfrm.add(jbtnRev);
        jfrm.add(jlabContents);

        jfrm.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getActionCommand().equals("Reverse")){
            String orgStr = jtf.getText();
            String resString = "";

            for (int i = orgStr.length()-1; i>=0; i--)
                resString += orgStr.charAt(i);

            jtf.setText(resString);
        } else
            jlabContents.setText("You putt the enter. Tekst: " + jtf.getText());
    }

    public static void main(String args[]){
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TFDemo();
            }
        });
    }
}
