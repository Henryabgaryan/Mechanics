public class Car {

    private int year = 0;
    private String car_model = "";
    private double car_length = 4.5;
    private double initial_speed = 0;
    private double constant_positive_accelertaion = 0;
    private double constant_negative_accelertaion = 0;
    private double max_speed = 100;
    private double min_speed = 50;


//setters

    public void setYear(int year){
        this.year = year;
    }

    public void setCar_model(String car_model) {
        this.car_model = car_model;
    }

    public void setCar_length(double car_length) {
        this.car_length = car_length;
    }

    public void setMax_speed(double max_speed) {
        this.max_speed = max_speed;
    }

    public void setMin_speed(double min_speed) {
        this.min_speed = min_speed;
    }

    public void setInitial_speed(double initial_speed) {

        if(initial_speed>=20 && initial_speed<=80) {
            this.initial_speed = initial_speed;
        }else{
            System.out.println("Cars initial speed must be between 20km/h and 80km/h");
        }

    }

    public void setConstant_negative_accelertaion(double an) {

        if(an>=1 && an<=3) {
            this.constant_negative_accelertaion = an;
        }else{
            System.out.println("The constant negative acceleration of the car must be between 1m/s^2 and 3m/s^2");
        }


    }

    public void setConstant_positive_accelertaion(double ap) {
        if(ap>=1 && ap<=3) {
            this.constant_positive_accelertaion = ap;
        }else{
            System.out.println("The constant positive acceleration of the car must be between 1m/s^2 and 3m/s^2");
        }
    }

//getters
    public int getYear() {
        return year;
    }

    public String getCar_model() {
        return car_model;
    }

    public double getCar_length() {
        return car_length;
    }

    public double getMax_speed() {
        return max_speed;
    }

    public double getMin_speed() {
        return min_speed;
    }

    public double getInitial_speed() {
        return initial_speed;
    }

    public double getConstant_positive_accelertaion() {
        return constant_positive_accelertaion;
    }

    public double getConstant_negative_accelertaion() {
        return constant_negative_accelertaion;
    }

}
