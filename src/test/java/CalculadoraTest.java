import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculadoraTest {

    @org.junit.jupiter.api.Test
    void somar() {
        Calculadora calculadora = new Calculadora();
        int soma = calculadora.somar(1, 2);
        assertEquals(3, soma);
    }

    @org.junit.jupiter.api.Test
    void subtrair() {
        Calculadora calculadora = new Calculadora();
        int sub = calculadora.subtrair(1,2);
        assertEquals(-1,sub);
    }

    @org.junit.jupiter.api.Test
    void multiplicar() {
        Calculadora calculadora = new Calculadora();
        int mult = calculadora.multiplicar(2,2);
        assertEquals(4,mult);
    }

    @org.junit.jupiter.api.Test
    void dividir() {
        Calculadora calculadora = new Calculadora();
        int div = calculadora.dividir(1,2);
        assertEquals(0,div);


    }
}

