package gr.aueb.cf.challenges.tasks6;

import java.util.Arrays;

public class MaxParkedCarsApp {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};
        int max = getMaxParkedCarsAtGivenMoment(arr);
        System.out.println("The maximum amount of parked cars is: " + max);
    }

    public static int getMaxParkedCarsAtGivenMoment(int[][] array) {
        int numberOfCars = array.length;
        int[][] arrivalsAndDepartures = new int[numberOfCars * 2][2];
        int maxCars = 0;
        int currentCars = 0;

        for (int i = 0; i < array.length; i++) {
            arrivalsAndDepartures[2 * i] = new int[] {array[i][0], 1};
            arrivalsAndDepartures[2 * i + 1] = new int[] {array[i][1], 0};
        }

        Arrays.sort(arrivalsAndDepartures, (a, b) -> a[0] - b[0]);


//        //sorting it myself the old fashion way:

//        for (int i = arrivalsAndDepartures.length - 1; i >= 0; i--) {
//            for (int j = 0; j < i; j++) {
//                if (arrivalsAndDepartures[j][0] > arrivalsAndDepartures[j + 1][0]) {
//
//                    int[] temp = new int[]{arrivalsAndDepartures[j][0], arrivalsAndDepartures[j][1]};
//
//                    arrivalsAndDepartures[j][0] = arrivalsAndDepartures[j + 1][0];
//                    arrivalsAndDepartures[j][1] = arrivalsAndDepartures[j + 1][1];
//
//                    arrivalsAndDepartures[j + 1][0] = temp[0];
//                    arrivalsAndDepartures[j + 1][1] = temp[1];
//                }
//            }
//        }

        for (int[] row : arrivalsAndDepartures) {
            for (int el : row) {
                System.out.print(el + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (arrivalsAndDepartures[i][1] == 1) {
                currentCars++;
            }
            else {
                currentCars--;
            }
            maxCars = Math.max(maxCars, currentCars);

        }
        return maxCars;
    }
}
