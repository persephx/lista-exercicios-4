import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrizColuna, matrizLinha;

        System.out.println("Insira o número de colunas da primeira matriz: ");
        matrizColuna = scanner.nextInt();

        System.out.println("Insira o número de linhas da primeira matriz: ");
        matrizLinha = scanner.nextInt();

        int [][]matriz1 = new int[matrizLinha][matrizColuna];

        System.out.println("Insira o número de colunas da segunda matriz: ");
        matrizColuna = scanner.nextInt();

        System.out.println("Insira o número de linhas da segunda matriz: ");
        matrizLinha = scanner.nextInt();

        int [][]matriz2 = new int[matrizLinha][matrizColuna];

        if (matriz1[0].length != matriz2.length) {
            System.out.println("Não é possivel multiplicar essas matrizes");
        }else{
            int [][]matriz3 = new int[matriz1.length][matriz2[0].length];

            for (int i=0; i < matriz1.length; i++){
                for(int j = 0; j < matriz1[0].length; j++){

                    System.out.println("Insira um valor para os seguintes pontos da primeira matriz "+ i+"° coluna "+ j+ "° linha.");
                    matriz1[i][j] = scanner.nextInt();
                }
            }

            for (int i=0; i < matriz2.length; i++){
                for(int j = 0; j < matriz2[0].length; j++){

                    System.out.println("Insira um valor para os seguintes pontos da segunda matriz "+ i+"° coluna "+ j+ "° linha.");
                    matriz2[i][j] = scanner.nextInt();
                }
            }
            for (int i = 0; i < matriz1.length; i++) {
                for (int j = 0; j < matriz2[0].length; j++) {
                    for (int k = 0; k < matriz1[0].length; k++) {
                        matriz3[i][j] += matriz1[i][k] * matriz2[k][j];
                        System.out.println("Os valores das matrizes são as seguintes: \n " +
                                "matriz 3" + i + j + " matriz 1" + i + k + " matriz 2" + k + j);
                    }
                }
            }
            System.out.print("O resultado final da matriz é: \n");
            for(int [] line : matriz3) {
                for(int value:line)
                    System.out.print(value + " ");
                System.out.println();
            }
        }
    }
}