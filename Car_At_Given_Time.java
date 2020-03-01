public class Car_At_Given_Time extends Car{
    double t_0 = 0;
    double distance_from_intersection = 0;
    double distance_from_the_other_car = 0;

    //setters
    public void setDistance_from_intersection(double distance_from_intersection) {
        if(distance_from_intersection >= 10 && distance_from_intersection <= 150){
            this.distance_from_intersection = distance_from_intersection;

        }else {
            System.out.println("The distance from the intersection should be between 10m and 150m ");
        }
    }

    public void setT_0(double t_0) {

            this.t_0 = t_0;

    }

    public void setDistance_from_the_other_car_car(double distance_from_the_other_car) {

        if(distance_from_the_other_car >= 10 && distance_from_the_other_car <= 100){
            this.distance_from_the_other_car = distance_from_the_other_car;

        }else {
            System.out.println("The distance from the front/rear car should be between 10m and 100m ");
        }
    }


//getters

    public double getDistance_from_intersection() {

        return distance_from_intersection;
    }


    public double getT_0() {
        return t_0;
    }

    public double getDistance_from_the_other_car(){
        return distance_from_the_other_car;
    }







    Car_At_Given_Time(int year, String car_model, double car_length, double initial_speed, double constant_positive_acceleration, double constant_negative_acceleration, double t_0, double distance_from_intersection){

        this.setDistance_from_intersection(distance_from_intersection);
        this.t_0 = t_0;

        this.setYear(year);
        this.setCar_model(car_model);
        this.setCar_length(car_length);
        this.setInitial_speed(initial_speed);
        this.setConstant_positive_accelertaion(constant_positive_acceleration);
        this.setConstant_negative_accelertaion(constant_negative_acceleration);

    }

    Car_At_Given_Time(int year, String car_model, double car_length, double initial_speed, double constant_positive_acceleration, double constant_negative_acceleration, double t_0, double distance_from_intersection, double distance_from_the_other_car){

        this.setDistance_from_intersection(distance_from_intersection);
        this.t_0 = t_0;
        this.setDistance_from_the_other_car_car(distance_from_the_other_car);

        this.setYear(year);
        this.setCar_model(car_model);
        this.setCar_length(car_length);
        this.setInitial_speed(initial_speed);
        this.setConstant_positive_accelertaion(constant_positive_acceleration);
        this.setConstant_negative_accelertaion(constant_negative_acceleration);

    }
}
