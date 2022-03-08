import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Registration extends JFrame {

    JPanel headpanal,inputpanal;
    JLabel headText,name,id;
    JTextField nameTxt,idTxt;
    JButton nextBtn;

    Registration(){
        headpanal = new JPanel();
        headpanal.setBounds(5,5,490,60);
        add(headpanal);

        headText = new JLabel("registration");
        headText.setFont((new Font("Arial",Font.BOLD,30)));
        headpanal.add(headText);

        inputpanal = new JPanel();
        inputpanal.setBounds(5,70,490,425);
        inputpanal.setLayout(null);
        add(inputpanal);

        name = new JLabel("name: ");
        name.setBounds(130,5,100,25);
        inputpanal.add(name);

        nameTxt = new JTextField();
        nameTxt.setBounds(200,5,200,25);
        inputpanal.add(nameTxt);

        id = new JLabel("ID: ");
        id.setBounds(130,50,100,25);
        inputpanal.add(id);

        idTxt = new JTextField();
        idTxt.setBounds(200,50,200,25);
        inputpanal.add(idTxt);

        nextBtn = new JButton("next");
        nextBtn.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new Question();
                dispose();
            }
        });
        nextBtn.setBounds(100, 170, 100, 30);
        inputpanal.add(nextBtn);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(600,350);
        setLayout(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Registration();
    }
}
