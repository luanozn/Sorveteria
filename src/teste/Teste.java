package teste;

import modelo.Sorveteria;

import java.util.Arrays;

public class Teste {
    public static void main(String[] args) {


        int[] casoTeste1 = {0,2,3,4,4};
        int[] casoTeste2 = {1,1,1,3,4,4};
        int[] casoTeste3 = {1,1,3,0,1,4,0,0};

        System.out.println("Casos de Teste (Sorveteria):");
        System.out.println("1: " + Arrays.toString(casoTeste1) + " Sabor mais popular: " + Sorveteria.saborMaisPopular(casoTeste1));
        System.out.println("2: " + Arrays.toString(casoTeste2) + " Sabor mais popular: " + Sorveteria.saborMaisPopular(casoTeste2));
        System.out.println("3: " + Arrays.toString(casoTeste3) + " Sabor mais popular: " + Sorveteria.saborMaisPopular(casoTeste3));

    }
}
