public class Escopo {
    public static void main(String[] args) {
        System.out.println("testando condicionais");
        int idade = 16;
        int quantidadeDePessoas = 3;
        //boolean acompanhado = quantidadeDePessoas >= 2;
        boolean acompanhado;
        //System.out.println(acompanhado); variavel precisa ser inicializada antes

        if(quantidadeDePessoas >= 2) {
            acompanhado = true;
        } else {
            acompanhado = false;
        }

        if (idade >= 18 || acompanhado) {
            System.out.println("seja bem vindo");
        } else {
            System.out.println("infelizmente vc não pode entrar");
        }
    }
}
