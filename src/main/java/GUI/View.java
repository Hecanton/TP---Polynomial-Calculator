package GUI;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class View extends JFrame {
    private JTextField m_polinom1 = new JTextField(20);
    private JTextField m_polinom2 = new JTextField(20);
    private JTextField m_rezultat     = new JTextField(20);
    private JTextField m_polinom     = new JTextField(20);
    private JButton    m_adunareBtn = new JButton("Adunare");
    private JButton    m_scadereBtn    = new JButton("Scadere");
    private JButton    m_inmultireBtn    = new JButton("Inmultire");
    private JButton    m_impartireBtn    = new JButton("Impartire");
    private JButton    m_integrareBtn    = new JButton("Integrare");
    private JButton    m_derivareBtn    = new JButton("Derivare");
    private JTextField m_rezultat2    = new JTextField(20);
    private int m_model;

    public View(){


        JPanel content = new JPanel();
        content.setLayout(new BorderLayout(0,50));
        add (content);

        JPanel content2=new JPanel();
        JPanel content3=new JPanel();
        JPanel content4=new JPanel();
        JPanel content5=new JPanel();

        JPanel content6=new JPanel();
        JPanel content7=new JPanel();
        JPanel content8=new JPanel();
        JPanel content9=new JPanel();

        content3.setLayout(new BorderLayout(5,5));
        content2.setLayout(new FlowLayout());
        content4.setLayout(new FlowLayout());
        content5.setLayout(new FlowLayout());

        content6.setLayout(new BorderLayout(5,5));
        content7.setLayout(new FlowLayout());
        content8.setLayout(new FlowLayout());
        content9.setLayout(new FlowLayout());

        content2.add(new JLabel("Polinom1:"));
        content2.add(m_polinom1,"Center");
        content2.add(new JLabel("Polinom2:"));
        content2.add(m_polinom2);
        content4.add(m_adunareBtn);
        content4.add(m_scadereBtn);
        content4.add(m_inmultireBtn);
        content4.add(m_impartireBtn);
        content5.add(new JLabel("Rezultat:"));
        content5.add(m_rezultat);

        content7.add(new JLabel("Polinom:"));
        content7.add(m_polinom);
        content8.add(m_integrareBtn);
        content8.add(m_derivareBtn);
        content9.add(new JLabel("Rezultat:"));
        content9.add(m_rezultat2);


        content3.add(content2,"North");
        content3.add(content4,"Center");
        content3.add(content5,"South");

        content6.add(content7,"North");
        content6.add(content8,"Center");
        content6.add(content9,"South");


        content.add(content3,"North");
        content.add(content6,"South");

        this.setLocation(500,300);
        this.setSize(1000,10000);
        this.setContentPane(content);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();

        this.setTitle("Calculator Polinoame");
    }

    String getUserInput1() {
        return m_polinom1.getText();
    }

    String getUserInput2() {
        return m_polinom2.getText();
    }

    String getUserInput3() {
        return m_polinom.getText();
    }

    void setRezultat1(String rezultat) {

        m_rezultat.setText(rezultat);
    }

    void setRezultat2(String rezultat) {

        m_rezultat2.setText(rezultat);
    }

    void addSumListener(ActionListener sum) {
        m_adunareBtn.addActionListener(sum);
    }

    void addDiffListener(ActionListener div) {
        m_scadereBtn.addActionListener(div);
    }

    void addMulListener(ActionListener inm) {
        m_inmultireBtn.addActionListener(inm);
    }

    void addDerivListener(ActionListener inm) {
        m_derivareBtn.addActionListener(inm);
    }
    void addIntegListener(ActionListener inm) {
        m_integrareBtn.addActionListener(inm);
    }
}
