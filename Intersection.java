import java.security.PublicKey;

public class Intersection {

    private double duration_of_the_yellow_light = 0;
    private double intersection_width = 0;

    //setters
    public void setIntersection_width(double intersection_width) {

        if(intersection_width>=5 && intersection_width<=20) {
            this.intersection_width = intersection_width;
        }else{
            System.out.println("The intersection width must be between 5m and 20m");
        }
    }

    public void setDuration_of_the_yellow_light(double duration_of_the_yellow_light) {

        if(duration_of_the_yellow_light>=2 && duration_of_the_yellow_light<=5) {
            this.duration_of_the_yellow_light = duration_of_the_yellow_light;
        }else{
            System.out.println("The duration of the yellow light must be between 2s and 5s");
        }
    }


//getters
    public double getIntersection_width() {
        return intersection_width;
    }

    public double getYellow_light_duretion() {
        return duration_of_the_yellow_light;
    }

    public Intersection(double duration_of_the_yellow_light, double intersection_width){
        this.setDuration_of_the_yellow_light(duration_of_the_yellow_light);
        this.setIntersection_width(intersection_width);
    }
}
