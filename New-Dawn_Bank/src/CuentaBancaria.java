import java.util.ArrayList;
import java.util.List;

public class CuentaBancaria {
    //Valores no variables
    private final String iban; //ES6621000418401234567891
    private final String titular; //Nombre completo

    //Valores variables
    private double saldo; //Dinero en euros
    private List<String> movimientos; //Historial de movimientos
    private int nMovimientos;

    //Valores finales staticos
    private final static int MAX_MOVIMIENTOS = 100;
    private final static double SALDO_MIN = -50.0;
    private final static double AVISO_HACIENDA = 3000.0;

    //Booleano para validar la cuenta
    private boolean valida;

    //Constructor
    public CuentaBancaria(String iban, String titular){
        this.iban = iban;
        this.titular = titular;

        //Inicializamos datos variables
        this.saldo = 0.0;
        this.movimientos = new ArrayList();
        this.nMovimientos = 0;

        //Comprobamos si el IBAN es correcto
        if (!iban.matches("^[A-Z]{2}\\d{22}")) {
            System.err.println("ERROR: el formato del IBAN no es correcto");
            this.valida = false;
        } else {
            this.valida = true;
        }
    }

    //Getters
    public String getIban(){
        return iban;
    }
    public String getTitular(){
        return titular;
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean getValida(){
        return valida;
    }

}
