public class Main {
    public static void main(String[] args) {

        int[][] matriz = {{1, 2, 1},
                {3, 2, 2},
                {1, 1, 3}};

        int resultado = determinante(matriz);
        System.out.println("Determinante = "+ resultado);

    }
    static int determinante(int [][]matriz1){
        int contaPositiva,multplicaPositiva,somaPositiva=0;
        int contaNegativa,multiplicaNegativa, somaNegativa=0;

        for(int i=0;i<matriz1.length;i++){
            contaPositiva=i;
            contaNegativa=i;
            multplicaPositiva=1;
            multiplicaNegativa=1;

            for(int j=0;j<matriz1[0].length;j++){
                multplicaPositiva*=matriz1[j][contaPositiva];
                multiplicaNegativa*=matriz1[j][contaNegativa];
                contaPositiva++;
                contaNegativa--;

                if(contaPositiva>matriz1.length-1)
                    contaPositiva=0;

                if(contaNegativa<0)
                    contaNegativa=matriz1.length-1;
            }
            somaPositiva += multplicaPositiva;
            somaNegativa += multiplicaNegativa;
        }
        return somaPositiva - somaNegativa;
    }
}