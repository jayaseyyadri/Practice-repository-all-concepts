package practiceJava;

public class Darts {

    /*Write a function that given a point in the target (defined by its real cartesian coordinates x and y), returns the correct amount earned by a dart landing in that point
            If the dart lands outside the target, player earns no points (0 points).
            If the dart lands in the outer circle of the target, player earns 1 point.
            If the dart lands in the middle circle of the target, player earns 5 points.
            If the dart lands in the inner circle of the target, player earns 10 points.

    */

    public class Darts {
        private double x2;
        private double y2;
        private double distance;
        Darts(double x, double y) {
            distance = Math.sqrt(Math.pow(x2-x,2)+ Math.pow(y2-y,2));

            // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }

        int score() {

            int points =0;
            if (distance == 0 || distance < 1  ){
                return points =10;
            }else if(distance > 1 && distance <= 5){
                return points =5;
            }else if(distance >5 && distance<=10){
                return points =1;
            }
            return points;

            // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        }

    }

}
