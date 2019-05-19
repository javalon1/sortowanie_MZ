package com.sda.algorytmy;

import java.util.Arrays;
import java.util.Random;

/**
 * Hello world!
 */

public class App {

    public static int[] sort(int[] tab) {


        for (int j = 0; j < tab.length; j++) {
            for (int i = 0; i < tab.length - 1; i++) {
                if (tab[i] > tab[i + 1]) {
                    int tmp = tab[i + 1];
                    tab[i + 1] = tab[i];
                    tab[i] = tmp;
                }
            }
        }

            System.out.println(Arrays.toString(tab));
            return tab;

        }
        public static void main (String[]args) throws InterruptedException {
            Random random = new Random();
            int min = -5000;
            int max = 5000;
            int[] tab = new int[20];
            long startTime = System.currentTimeMillis();
            for (int i = 0; i < tab.length; i++) {
                int randomNumber = random.nextInt(max - min + 1) + min;
                tab[i] = randomNumber;
            }

            long endTime = System.currentTimeMillis();
            long totalTime = endTime - startTime;
            System.out.println("Czas wykonywania" + " " + totalTime);
            startTime = System.currentTimeMillis();
            sort(tab);
            endTime = System.currentTimeMillis();
            totalTime = endTime - startTime;
            System.out.println("Czas sortowania:" + totalTime);

        }

    }




/*}while (true) {

            System.out.println(randomNumber);
            if (randomNumber == min) {
                break;
            }
        }
  }
}
*/
