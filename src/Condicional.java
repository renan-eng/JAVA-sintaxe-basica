public class Condicional {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 18;
        int quantidadeDePessoa = 1;
        if (idade >= 18) {
            System.out.println("vc tem mais de 18 anos");
            System.out.println("seja bem vindo");
        } else {
            if (quantidadeDePessoa > 1) {
                System.out.println("vc pode entrar pq está acompanhado");
            } else {
                System.out.println("infelizmente vc não pode entrar");
            }
        }
    }
}
