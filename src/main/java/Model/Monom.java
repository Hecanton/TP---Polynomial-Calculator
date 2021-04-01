package Model;

public class Monom {
    int grad;
    Number coeff;
    int gasit;

    public Monom(int grad, Number coeff) {
        this.grad = grad;
        this.coeff = coeff;
    }

    public Number getCoeff() {
        return coeff;
    }

    public void setCoeff(Number coeff) {
        this.coeff = coeff;
    }

    public int getGrad() {
        return grad;
    }

    public int getGasit() {
        return gasit;
    }

    public void setGasit(int gasit) {
        this.gasit = gasit;
    }

    @Override
    public String toString() {
        if (coeff.doubleValue() == 0) {
            return "";
        } else {
            if (grad == 0) {
                if (coeff.doubleValue() > 0)
                    return "+" + coeff;
                else
                    return coeff+"";
            } else {
                if (coeff.doubleValue() > 0)
                    return "+" + coeff + "X^" + grad;
                else
                    return coeff + "X^" + grad;
            }
        }
    }
}