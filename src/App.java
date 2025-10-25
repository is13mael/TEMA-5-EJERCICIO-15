public class App {
    public static void main(String[] args) throws Exception {
        System.out.print("Introduzca la base: ");
        int base = Integer.parseInt(System.console().readLine());
        System.out.print("Introduzca el exponente máximo: ");
        int exponente = Integer.parseInt(System.console().readLine());
        
        for(int i = 0; i <= exponente; i++){
            int resultado = 1;
            for(int j = 0; j < i; j++){
                resultado *= base;
            }
            System.out.printf("%d^%d = %d%n", base, i, resultado);
        }
        
    }
}
