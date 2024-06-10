public class Main {
    public static void main(String[] args) {

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                numeros[i] += 2;
            } else {
                numeros[i] *= 2;
            }
            System.out.print(numeros[i] + ", ");
        }
    }
}
