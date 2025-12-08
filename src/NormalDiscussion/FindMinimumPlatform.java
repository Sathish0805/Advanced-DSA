package NormalDiscussion;

public class FindMinimumPlatform {
    public static void main(String[] args) {
//        int[] arrival = {900, 940, 950, 1100, 1500, 1800};
//        int[] departure = {910, 1200, 1120, 1130, 1900, 2000};

//        int[] arrival = {900, 1235, 1100};
//        int[] departure = {1000, 1240, 1200};
//
//        int[] arrival = {1000, 935, 1100};
//        int[] departure = {1200, 1240, 1130};

//            int[] arrival = {800, 845, 900, 915, 1030, 1200};
//            int[] departure = {820, 900, 915, 930, 1215, 1300};

//        int[] arrival = {700, 730, 800, 810, 900};
//        int[] departure = {740, 800, 830, 850, 920};

//        int[] arrival = {800, 1000, 1100, 1400, 1500};
//        int[] departure = {900, 1100, 1200, 1500, 1600};

//        int[] arrival = {800, 900, 1000, 1100};
//        int[] departure = {900, 1000, 1100, 1200};

                int[] arrival = {1300, 1345, 1500, 1530, 1700};
                int[] departure = {1330, 1400, 1530, 1600, 1800};


        int maxPlatform = 1;
        int count = 1;

//        for(int i = 0; i < arrival.length-1; i++){
//            if(departure[i] <= arrival[i+1] || departure[i+1] < arrival[i]){
//                count = 1;
//            }else{
//                count++;
//                maxPlatform = Math.max(maxPlatform, count);
//            }
//        }

        int currentArrival = arrival[0];
        int currentDeparture = departure[0];
        for (int i = 1; i < arrival.length; i++) {
            System.out.println("(" + currentArrival + "," + currentDeparture + "),(" + arrival[i] + "," + departure[i]+ ")" +( currentDeparture < arrival[i]) +" "+ (departure[i] < currentArrival));
            if (currentDeparture <= arrival[i] || departure[i] < currentArrival) {
                count = 1;
                currentArrival = arrival[i];
                currentDeparture = departure[i];
            }else {
                count++;
                maxPlatform = Math.max(maxPlatform, count);
                currentArrival = Math.min(currentArrival, arrival[i]);
                currentDeparture = Math.max(currentDeparture, departure[i]);
            }
        }

        System.out.println(maxPlatform);
    }
}
/*
Arrival time - [600, 1100, 1200, 1800, 2000]
Depature - [630, 1200, 1230, 1830, 2030]



 */