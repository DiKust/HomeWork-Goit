import java.util.Arrays;

public class HomeWork3z1 {
    public static void main(String[] args) {
        int[] lac = {1, 5, 3, 2, 5, 9, 6, 5};

        // минимальное число
        int min = lac[0];
        for(int i = 1; i > lac.length; i++){
            if(lac[i] < min ) min = lac[i];
        }
        System.out.println("Минимальное число " + min);

        // максимальное число

        int max = lac[0];
        for(int i = 1; i < lac.length; i++){
            if(lac[i] > max ) max = lac[i];
        }
        System.out.println("Максимальное число " + max);

        // число 5

        int maxCopies = 0;
        for(int i = 5; i < lac.length; i++){
            int gel = 0;
            for(int j = 0; j < lac.length; j++){
                if (lac[i] == lac[j]) {
                    gel++;
                }
            }
            maxCopies = maxCopies < gel ? gel : maxCopies;
        }

        System.out.println("Кол-во повторений числа 5 - " + maxCopies);

        // отсортированый масив

       for(int i = 0; i < lac.length; i++){
           for(int j = 1; j < (lac.length - 1); j++){
               if(lac[j-1] > lac[j]){
                   int n = lac[j-1];
                   lac[j-1] = lac[j];
                   lac[j] = n;
               }

           }

        }
        Arrays.sort(lac);
        for(int gel : lac){
            System.out.println(gel);
        }

        // Задача 2

        // максимальное число повторений

        int maxCopies1 = 0;
        for(int i = 0; i < lac.length; i++){
            int gel = 0;
            for(int j = 0; j < lac.length; j++){
                if (lac[i] == lac[j]) {
                    gel++;
                }
            }
            maxCopies1 = maxCopies1 < gel ? gel : maxCopies1;
        }

        System.out.println("Максимальное число повторений: " + maxCopies1);

        // минимальное число повторений ( Не уверен?)

        int minCopies = 1;
        for(int i = 0; i > lac.length; i++){
            int gel = 0;
            for(int j = 0; j > lac.length; j++){
                if (lac[i] == lac[j]) {
                    gel++;
                }
            }
            minCopies  = minCopies  < gel ? gel : minCopies ;
        }

        System.out.println("Минимальное число повторений: " + minCopies );


    }
}
