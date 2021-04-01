package GUI;

import Logica.Operatii;
import Model.Monom;
import Model.Polinom;


import java.awt.event.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {
    private View view;
    private Operatii op;

    public Controller(View view, Operatii op){
        this.op=op;
        this.view=view;

        view.addSumListener(new SumListener());
        view.addDiffListener(new DiffListener());
        view.addMulListener(new MulListener());
        view.addDerivListener(new DerivListener());
        view.addIntegListener(new IntegListener());

    }

    class SumListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userImput1=view.getUserInput1();
            String userImput2=view.getUserInput2();
            Polinom p1=toPolinom(userImput1);
            Polinom p2=toPolinom(userImput2);
            Polinom p3;
            p3=op.adunare(p1, p2);

            view.setRezultat1(p3.toString());
        }
    }

	class DiffListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			String userImput1=view.getUserInput1();
			String userImput2=view.getUserInput2();
			Polinom p1=toPolinom(userImput1);
            Polinom p2=toPolinom(userImput2);
            Polinom p3;
            p3=op.scadere(p1, p2);

            view.setRezultat1(p3.toString());
		}
	}
    class MulListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userImput1=view.getUserInput1();
            String userImput2=view.getUserInput2();
            Polinom p1=toPolinom(userImput1);
            Polinom p2=toPolinom(userImput2);
            Polinom p3;
            p3=op.inmultire(p1, p2);

            view.setRezultat1(p3.toString());
        }
    }
    class DerivListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userImput3=view.getUserInput3();
            Polinom p1=toPolinom(userImput3);
            Polinom p3;
            p3=op.derivare(p1);

            view.setRezultat2(p3.toString());
        }
    }

    class IntegListener implements ActionListener{
        public void actionPerformed(ActionEvent e) {
            String userImput3=view.getUserInput3();
            Polinom p1=toPolinom(userImput3);
            Polinom p3;
            p3=op.integrare(p1);

            view.setRezultat2(p3.toString());
        }
    }


    public Polinom toPolinom(String pol) {
        Polinom p1=new Polinom();
        Monom m1;
        Pattern pattern1=Pattern.compile( "(-?\\d+)[xX]\\^(\\-?+\\d+)" );
        Matcher m=pattern1.matcher(pol);
        while(m.find()) {
            m1=new Monom(Integer.parseInt(m.group(2)),Double.parseDouble(m.group(1)));
            p1.addMonom(m1);
        }
        return p1;
    }

}
