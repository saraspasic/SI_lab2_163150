import java.util.ArrayList;
import java.util.List;

class Angle {
    int degrees;
    int minutes;
    int seconds;

    public Angle(int degrees, int minutes, int seconds) {
        this.degrees = degrees;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getDegrees() {
        return degrees;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Angle> angleList) {
        List<Integer> result = new ArrayList<>();//A

        for (int i = 0; i < angleList.size(); i++) { // B
            int deg = angleList.get(i).getDegrees();// Node C
            int min = angleList.get(i).getMinutes();//Node C
            int sec = angleList.get(i).getSeconds();//Node C
            if (deg >= 0 && deg < 360) {//Node D
                if (min < 0 || min > 59)//Node E
                    throw new RuntimeException("The minutes of the angle are not valid!"); // F
                else {
                    if (sec < 0 || sec > 59)// Node G
                        throw new RuntimeException("The seconds of the angle are not valid"); // H
                    else
                        result.add(deg * 3600 + min * 60 + sec);// I
                }
            } else if (deg == 360) { //Node J
                if (min == 0 && sec == 0)// Node K
                    result.add(deg * 3600 + min * 60 + sec);// L
                else
                    throw new RuntimeException("The angle is greater then the maximum");// M
            } else {
                throw new RuntimeException("The angle is smaller or greater then the minimum"); //Noode N
            }
        }
        return result; //O

    }
}