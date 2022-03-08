import javax.swing.*;
import java.awt.event.*;

public class Question extends JFrame implements ActionListener{

    JLabel l;
    JRadioButton radioButton[] = new JRadioButton[5];
    JButton btnNext, btnResult;
    ButtonGroup bg;
    int count = 0, ques = 0;

    Question(){
        l = new JLabel();
        bg = new ButtonGroup();
        for (int i = 0; i < 5; i++) {
            radioButton[i] = new JRadioButton();
            add(radioButton[i]);
            bg.add(radioButton[i]);
        }
        btnNext = new JButton("Next");
        btnResult = new JButton("Result");
        btnNext.addActionListener(this);
        btnResult.addActionListener(this);

        set();

        l.setBounds(30, 40, 450, 20);
        radioButton[0].setBounds(50, 80, 450, 20);
        radioButton[1].setBounds(50, 110, 200, 20);
        radioButton[2].setBounds(50, 140, 200, 20);
        radioButton[3].setBounds(50, 170, 200, 20);
        btnNext.setBounds(100, 240, 100, 30);
        btnResult.setBounds(270, 240, 100, 30);

        add(l);
        add(btnNext);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setSize(600, 350);
        setVisible(true);

    }
    public void actionPerformed(ActionEvent e){

        if (e.getSource() == btnNext) {
            if (check())
                count = count + 1;
            ques++;
            set();
            if (ques == 9) {
                btnNext.setEnabled(false);
                add(btnResult);
            }
        }
        if (e.getActionCommand().equals("Result")) {
            if (check())
                count = count + 1;
            ques++;
            JOptionPane.showMessageDialog(this, "correct answers= " + count);
            System.exit(0);
        }

    }
    void set() {
        radioButton[4].setSelected(true);
        if (ques == 0) {
            l.setText("Q1:  Who is known as father of Java Programming Language?");
            radioButton[0].setText("James Gosling");
            radioButton[1].setText("M. P Java");
            radioButton[2].setText("Charel Babbage");
            radioButton[3].setText("Blais Pascal");
        }
        if (ques == 1) {
            l.setText("Q2:  Which provides runtime environment for java byte code to be executed?");
            radioButton[0].setText("JDK");
            radioButton[1].setText("JVM");
            radioButton[2].setText("JRE");
            radioButton[3].setText("JAVAC");
        }
        if (ques == 2) {
            l.setText("Que3: Which one is a template for creating different objects ?");
            radioButton[0].setText("An Array");
            radioButton[1].setText("A class");
            radioButton[2].setText("Interface");
            radioButton[3].setText("Method");
        }
        if (ques == 3) {
            l.setText("Q4: Which of the following are not the methods of the Thread class?");
            radioButton[0].setText("yield()");
            radioButton[1].setText("sleep(long msec)");
            radioButton[2].setText("go()");
            radioButton[3].setText("stop()");
        }
        if (ques == 4) {
            l.setText("Q5: What is the full form of JVM ?");
            radioButton[0].setText("Java Very Large Machine");
            radioButton[1].setText("Java Verified Machine");
            radioButton[2].setText("Java Very Small Machine");
            radioButton[3].setText("Java Virtual Machine");
        }
        if (ques == 5) {
            l.setText("Q6: What is the extension of compiled java classes?");
            radioButton[0].setText(".txt");
            radioButton[1].setText(".js");
            radioButton[2].setText(".class");
            radioButton[3].setText(".java");
        }
        if (ques == 6) {
            l.setText("Q7: Which exception is thrown when java is out of memory?");
            radioButton[0].setText("MemoryError");
            radioButton[1].setText("OutOfMemoryError");
            radioButton[2].setText("MemoryOutOfBoundsException");
            radioButton[3].setText("MemoryFullException");
        }
        if (ques == 7) {
            l.setText("Q8: Which of the following is a superclass of every class in Java?");
            radioButton[0].setText("ArrayList");
            radioButton[1].setText("Abstract class");
            radioButton[2].setText("Object class");
            radioButton[3].setText("String");
        }
        if (ques == 8) {
            l.setText("Q9: Select the valid statement");
            radioButton[0].setText("char[] ch = new char(5)");
            radioButton[1].setText("char[] ch = new char[5]");
            radioButton[2].setText("char[] ch = new char()");
            radioButton[3].setText("char[] ch = new char[]");
        }
        if (ques == 9) {
            l.setText("Q10: Arrays in java are-");
            radioButton[0].setText("Object references");
            radioButton[1].setText("object");
            radioButton[2].setText("Primitive data type");
            radioButton[3].setText("None");
        }
    }
    boolean check() {
        if (ques == 0)
            return (radioButton[0].isSelected());
        if (ques == 1)
            return (radioButton[1].isSelected());
        if (ques == 2)
            return (radioButton[1].isSelected());
        if (ques == 3)
            return (radioButton[2].isSelected());
        if (ques == 4)
            return (radioButton[3].isSelected());
        if (ques == 5)
            return (radioButton[2].isSelected());
        if (ques == 6)
            return (radioButton[1].isSelected());
        if (ques == 7)
            return (radioButton[2].isSelected());
        if (ques == 8)
            return (radioButton[1].isSelected());
        if (ques == 9)
            return (radioButton[1].isSelected());
        return false;
    }

    public static void main(String[] args) {
        new Question();
    }
}
