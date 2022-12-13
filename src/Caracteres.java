public class Caracteres {
    public static void main(String[] args) {
        // char guarda somente um caractere
        char letra = 'a';
        System.out.println(letra);

        char valor = 97; // out: a
        System.out.println(valor);

        valor = (char) (valor + 1);
        System.out.println(valor);

        String palavra = "alura cursos online de tecnologia";
        System.out.println(palavra);

        palavra += 2022; //out: alura cursos online de tecnologia2022
        System.out.println(palavra);


    }
}
