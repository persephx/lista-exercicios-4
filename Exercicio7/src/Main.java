public class Main {
    public static void main(String[] args) {
        int [][] matrix = {
                { 1, 2, 3, 4, 5},
                { 6, 7, 8, 9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

        int column_sum, line_sum,biggest_column_sum, biggest_line_sum;
        biggest_line_sum=0;
        biggest_column_sum=0;

        for(int i=0;i<matrix.length;i++){
            column_sum=0;
            line_sum=0;
            for(int j=0;j<matrix[0].length;j++){
                line_sum+=matrix[i][j];
                column_sum+=matrix[j][i];
            }
            if(i==0){
                biggest_column_sum=column_sum;
                biggest_line_sum=line_sum;
            }else{
                if(column_sum>biggest_column_sum)
                    biggest_column_sum=column_sum;
                if(line_sum>biggest_line_sum)
                    line_sum=biggest_line_sum;
            }
        }
        System.out.println("Maior linha = " + biggest_line_sum);
        System.out.println("Maior coluna = " + biggest_column_sum);

    }
}
