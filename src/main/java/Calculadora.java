public class Calculadora {

    public static int somar(int a, int b) {
        return a + b;
    }

    public static int subtrair(int a, int b) {
        return a - b;
    }

    public static int multiplicar(int a, int b) {
        return a * b;
    }

    public static int dividir(int a, int b) {
        return a / b;
    }

    public static int expressão(String expressão) {
        int resultado = 0;
        for (String valorSomar : expressão.split("\\+")) {
            resultado += Integer.parseInt(valorSomar);

        }
        return resultado;

    }

    public static void main(String[] args) {
        System.out.println(expressão("1+2+3"));

    }



    }





