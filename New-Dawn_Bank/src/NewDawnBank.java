public class NewDawnBank {
    public static void main(String[] args) {

        do {
            System.out.println("1. Datos de la cuenta Bancaria."); //Mostrara el IBAN y el titular y el saldo
            System.out.println("2. IBAN."); //Mostrara el IBAN
            System.out.println("3. Titular."); //Mostrara el titular
            System.out.println("4. Saldo."); //Mostrara el saldo disponible
            System.out.println("5. Ingreso "); //Pedir la cantidad a ingresas y hacer el ingreso si es posible
            System.out.println("6. Retirada"); //Pedir la cantidad a retirar y hacer la retirada si es posible
            System.out.println("7. Movimientos"); //Mostrar una lista con el historial de movimientos
            System.out.println("8. Salir"); //Termina el progama
        } while (true);
    }
}