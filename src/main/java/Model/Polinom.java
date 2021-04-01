package Model;

import java.util.ArrayList;
import java.util.*;

public class Polinom {
    List<Monom> listamon;

    public Polinom() {
        this.listamon = new ArrayList<>();
    }

    public List<Monom> getListamon() {
        return listamon;
    }

    public void addMonom(Monom x){
        listamon.add(x);
    }

    public int getGradMax(){
        int gradmax=0;
        for(Monom m1:this.getListamon()){
            if(m1.getGrad()>gradmax)
                gradmax=m1.getGrad();
        }
        return gradmax;
    }
    public String toString() {
        String result="";
        for(Monom m1:listamon) {
            result+=m1.toString();
        }
        return result;
    }

}
