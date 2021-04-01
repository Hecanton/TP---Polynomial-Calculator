import GUI.Controller;
import GUI.View;
import Logica.Operatii;

public class App 
{
    public static void main( String[] args )
    {
        View view = new View();
        Operatii op1 = new Operatii();
        Controller controller1 = new Controller(view, op1);

        view.setVisible(true);
    }
}
