public class LacosASCII {
    public static void main(String[] args) {
        for (int linha = 1; linha < 7; linha++){
            for (int coluna = 1; coluna < linha; coluna++ ){
                System.out.print(coluna);
            }
            System.out.println();
        }
    }
}
