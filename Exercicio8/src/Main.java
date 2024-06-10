public class Main {
    public static void main(String[] args) {
        int[][] matriz = {{1, 2, 1},
                {3, 2, 2},
                {1, 1, 3}};

        diag_principal(matriz);
        System.out.println();
        diag_secundaria(matriz);
        System.out.println();
        int resultado = determinante(matriz);
        System.out.println("Determinante = " + resultado);
    }

    static int determinante(int[][] m) {
        int cont_pos, mult_pos, det = 0;
        int cont_neg, mult_neg;
        for (int i = 0; i < m.length; i++) {
            cont_pos = i;
            cont_neg = i;
            mult_pos = 1;
            mult_neg = 1;
            for (int j = 0; j < m[0].length; j++) {
                mult_pos *= m[j][cont_pos];
                mult_neg *= m[j][cont_neg];
                cont_pos++;
                cont_neg--;
                if (cont_pos > m.length - 1)
                    cont_pos = 0;
                if (cont_neg < 0)
                    cont_neg = m.length - 1;
            }
            det += mult_pos - mult_neg;
        }
        return det;
    }

    static void diag_principal(int[][] m) {
        if (m.length == m[0].length) {
            for (int i = 0; i < m.length; i++) {
                System.out.print(m[i][i] + ", ");
            }
        } else {
            System.out.println("A matriz não é quadrada!");
        }
    }

    static void diag_secundaria(int[][] m) {
        if (m.length == m[0].length) {
            for (int i = m.length - 1; i >= 0; i--) {
                System.out.print(m[m[0].length - 1 - i][i] + ", ");
            }
        }
    }
}