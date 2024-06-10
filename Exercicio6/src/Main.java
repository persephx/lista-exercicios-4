public class Main {
    public static void main(String[] args) {
        int [] vector = {10,20,30,40,50,60,70,80,90};
        int aux;

        for (int n: vector) {
            System.out.println(n + " ");
        }

        for(int i=0;i< vector.length/2;i++){
            aux=vector[i];
            vector[i]=vector[(vector.length-1)-i];
            vector[(vector.length-1)-i]=aux;
        }

        System.out.println();
    }
}