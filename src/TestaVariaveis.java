public class TestaVariaveis {
    public static void main(String[] args){
        System.out.println("Novo teste");

        int idade = 37;

        System.out.println(idade);
        idade = 10 +2;
        idade = idade * 2 + 5;
        System.out.println(idade);
        System.out.println("Idade é " + idade + ", parabéns.");

        // int 32bytes - +-2^31
        // long 64bytes - 2^63

        long numero_grande = 124124123124l;
        System.out.println(numero_grande);
        // short 16bytes - 2^15 = 32768/2
        short numero_pequeno = 2313;
        System.out.println(Math.pow(2,15));

        // byte 8bytes - 2^8 = 256/2 = 127 (mais ou menos)
        byte numero_muito_pequeno = 127;

        //IEE 754 - https://www.youtube.com/watch?v=PDgT0T0Yodo
        double numero_a = 0.1;
        double numero_b = 0.2;
        System.out.println(numero_a+numero_b); //0.30000000000000004

        float  ponto_flutuante = 3.14f;

        double idade_double = 30.0;
        System.out.println(idade_double);




    }
}
