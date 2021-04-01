package Logica;
import Model.Monom;
import Model.Polinom;

import java.util.List;

public class Operatii {
    public static Polinom adunare(Polinom p1,Polinom p2){
        Polinom p3=new Polinom();
        Monom m3;
        for(Monom m1:p1.getListamon())
            for(Monom m2:p2.getListamon()){
                if(m1.getGrad()==m2.getGrad()){
                    m3=new Monom(m1.getGrad(), m1.getCoeff().doubleValue()+ m2.getCoeff().doubleValue());
                    m1.setGasit(1);
                    m2.setGasit(1);
                    p3.addMonom(m3);
                }
            }
        for(Monom m1:p1.getListamon()){
            if(m1.getGasit()!=1)
                p3.addMonom(m1);
        }
        for(Monom m2:p2.getListamon()){
            if(m2.getGasit()!=1)
                p3.addMonom(m2);
        }
        return p3;
    }

    public static Polinom scadere(Polinom p1,Polinom p2){
        Polinom p3=new Polinom();
        Monom m3;
        for(Monom m1:p1.getListamon())
            for(Monom m2:p2.getListamon()){
                if(m1.getGrad()== m2.getGrad()) {
                    double nr=m1.getCoeff().doubleValue() - m2.getCoeff().doubleValue();
                    if(nr!=0) {
                        m3 = new Monom(m1.getGrad(), nr);
                        p3.addMonom(m3);
                    }
                    m1.setGasit(1);
                    m2.setGasit(1);
                }
            }
        for(Monom m1:p1.getListamon()){
            if(m1.getGasit()!=1)
                p3.addMonom(m1);
        }
        for(Monom m2:p2.getListamon()){
            if(m2.getGasit()!=1) {
                Monom m4 = new Monom(m2.getGrad(),-m2.getCoeff().doubleValue());
                p3.addMonom(m4);
            }
        }
        return p3;
    }

    public static Polinom inmultire(Polinom p1,Polinom p2){
        Polinom p3=new Polinom();
        Polinom p4=new Polinom();
        Monom m3;
        Monom m4;
        for(Monom m1:p1.getListamon())
            for(Monom m2: p2.getListamon()){
                m3=new Monom(m1.getGrad()+m2.getGrad(),m1.getCoeff().doubleValue()*m2.getCoeff().doubleValue());
                p3.addMonom(m3);
            }
        int gradmax=p3.getGradMax();
        double coeff=0;
        int ok=0;
            for(int i=gradmax;i>=0;i--){
                for(Monom m5:p3.getListamon()) {
                    if(m5.getGrad()==i){
                           coeff+=m5.getCoeff().doubleValue();
                            ok=1;
                    }
                }
                if(ok==1) {
                    m4=new Monom(i,coeff);
                    ok=0;
                    p4.addMonom(m4);
                    coeff=0;
                }
            }
            return p4;
    }

    public static Polinom derivare(Polinom p1){
        Polinom p2= new Polinom();
        Monom m2;
        for(Monom m1:p1.getListamon()){
            if(m1.getGrad()>0) {
                m2 = new Monom(m1.getGrad() - 1, m1.getCoeff().doubleValue() * m1.getGrad());
                p2.addMonom(m2);
            }
        }
        return  p2;
    }

    public static Polinom integrare(Polinom p1){
        Polinom p2=new Polinom();
        Monom m2;
        for(Monom m1:p1.getListamon()){
            m2=new Monom(m1.getGrad()+1, m1.getCoeff().doubleValue()/(m1.getGrad()+1));
            p2.addMonom(m2);
        }
        return p2;
    }
}
