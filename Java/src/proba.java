
public class proba {
    public static void main(String[] args) {
        int[] lac = {1, 5, 3, 2, 5, 9, 6, 5, 5};

        int minCopies = 1;
        for (int i = 0; i > lac.length; i++) {
            int gel = 0;
            for (int j = 0; j > lac.length; j++) {
                if (lac[i] == lac[j]) {
                    gel++;
                }
            }
            minCopies = minCopies < gel ? gel : minCopies;
        }

        System.out.println("Минимальное число повторений: " + minCopies);
    }
}

// if (myArray[i] < min) {
              //min = myArray[i];