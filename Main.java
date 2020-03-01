public class Main {

    public static void main(String[] args) {
        //  Mitsubishi Pajero io with minimal parameters
        Car_At_Given_Time Car0 = new Car_At_Given_Time(2001,"Mitsubishi Pajero io",3.67,20,1, 1,0,10);

        //  Mitsubishi Pajero io with minimal parameters except constant positive acceleration being 2
        Car_At_Given_Time Car0_1 = new Car_At_Given_Time(2001,"Mitsubishi Pajero io", 3.67,20,2, 1,0,10);

        //  Mitsubishi Pajero io with minimal parameters except constant positive acceleration being 3
        Car_At_Given_Time Car0_2 = new Car_At_Given_Time(2001,"Mitsubishi Pajero io", 3.67,20,3, 1,0,10);


        //  Mitsubishi Pajero io with  initial speed 80km/h and constant positive acceleration being 3
        Car_At_Given_Time Car1 = new Car_At_Given_Time(2001,"Mitsubishi Pajero io", 3.67,80,3, 1,0,10);


        //  Mitsubishi Pajero io with  maximal parameters
        Car_At_Given_Time Car2 = new Car_At_Given_Time(2001,"Mitsubishi Pajero io", 3.67,80,3, 3,0,150);

        //  Mitsubishi Pajero io with  maximal parameters and being 100m away from the front car
        Car_At_Given_Time Car2_1 = new Car_At_Given_Time(2001,"Mitsubishi Pajero io", 3.67,80,3, 3,0,150);


        Car_At_Given_Time myCar1 = new Car_At_Given_Time(2001,"Mitsubishi Pajero io", 3.67,20,1.5, 3,0,150);

        //experiment for mercedes benz
        Car_At_Given_Time Car = new Car_At_Given_Time(1996,"Mercedes benz", 4.686,20,2.22, 1,0,150);


        //road with minimal paramets
        Intersection road1 = new Intersection(2,5);

        //road with yellow light duration 3.53
        Intersection road1_1 = new Intersection(3.53,5);

        //road with maximal parameter values
        Intersection road2 = new Intersection(5,20);

        //road with maximal parameter values
        Intersection road2_1 = new Intersection(5,5);




        Intersection road3= new Intersection(3,5);

//**********************************************************************************************************************
/*
        //Experiment 0 with minimal parameters on Mitsubishi Pajero io
        Print_Status(Car0,road1);
        Can_Pass_Crossroad_max_min_speed(Car0,road1);
        Can_Pass_Crossroad_For_Two_Cars(Car0,Car0,road1);
*/

/*
        //Experiment 0_1 with minimal parameters except constant positive acceleration being 2
        Print_Status(Car0_1,road1);
        Can_Pass_Crossroad_max_min_speed(Car0_1,road1);
        Can_Pass_Crossroad_For_Two_Cars(Car0_1,Car0_1,road1);
*/


/*
        //Experiment 0_2 with minimal parameters except constant positive acceleration being 3
        Print_Status(Car0_2,road1);
        Can_Pass_Crossroad_max_min_speed(Car0_2,road1);
        Can_Pass_Crossroad_For_Two_Cars(Car0_2,Car0_1,road1);
*/
//**********************************************************************************************************************
/*
        //Experiment 1 with minimal parameters of intersection and  car with initial speed 80km/h and constant
        // positive acceleration being 3m/s^2
        Print_Status(Car1,road1);
        Can_Pass_Crossroad_max_min_speed(Car1,road1);
        Can_Pass_Crossroad_For_Two_Cars(Car1,Car1,road1);
*/

/*
        //Experiment 1_1 with minimal parameters of intersection  except yellow light duration being 3.53s and
        //car with initial speed 80km/h and constant positive acceleration being 3m/s^2
        Print_Status(Car1,road1_1);
        Can_Pass_Crossroad_max_min_speed(Car1,road1_1);
        Can_Pass_Crossroad_For_Two_Cars(Car1,Car1,road1_1);
*/

/*
        //Experiment 1_2 with minimal parameters of intersection and car at the back having minimal parameters
        //and car at the front with initial speed 80km/h and constant positive acceleration being 3m/s^2
        Can_Pass_Crossroad_For_Two_Cars(Car0,Car1,road1_1);
*/
//**********************************************************************************************************************
 /*
        //Experiment 2 with maximal parameters of intersection and car
        Print_Status(Car2,road2);
        Can_Pass_Crossroad_max_min_speed(Car2,road2);
        Can_Pass_Crossroad_For_Two_Cars(Car2,Car2,road2);
*/

 /*
        //Experiment 2_1 with maximal parameters of intersection and car
        Print_Status(Car2,road2_1);
        Can_Pass_Crossroad_max_min_speed(Car2,road2_1);
        Can_Pass_Crossroad_For_Two_Cars(Car2,Car2,road2_1);
*/

/*
        //Experiment 2_1 with maximal parameters of intersection and car and Car_2_1 being 100m away from the Car2
        Can_Pass_Crossroad_For_Two_Cars(Car2_1,Car2,road2_1);
*/


    }





    public static boolean Can_Pass_Crossroad(Car_At_Given_Time car, Intersection intersection){
        double displacement = 0;


        //******************************************I think there was a mistake in project description, instead of
        // - Car’s initial speed 20 km/s ≤ v0 ≤ 80 km/s; must be  km/h, which I then make m/s.
        //car attributes
        double car_initial_speed = car.getInitial_speed()*(1000/3600);
        double car_at_time = car.getT_0();
        double car_positive_acceleration = car.getConstant_positive_accelertaion();
        double car_negative_acceleration = car.getConstant_negative_accelertaion();
        double distance_from_the_intersection = car.distance_from_intersection;
        double car_length = car.getCar_length();
        // road attributes
        double yellow_light_duration = intersection.getYellow_light_duretion();
        double intersection_width = intersection.getIntersection_width();

        //I assume that the distence from car to cross-road is measured from the car front tip to cross-road
        //that is why I add car length to the displacement
        displacement = car_initial_speed*yellow_light_duration + (car_positive_acceleration*Math.pow(yellow_light_duration, 2))/2;

        if(displacement >= car_length + distance_from_the_intersection + intersection_width){
            return true;
        }else{
            return false;
        }

    }

    public static void Print_Status(Car_At_Given_Time car, Intersection intersection){
        if(Can_Pass_Crossroad(car,intersection)){
            System.out.println("ACCELERATE! YOU CAN PASS THE CROSS-ROAD!");

        }else{
            System.out.println("STOP! YOU CANNOT PASS THE CROSS-ROAD!");

        }
    }

    //car can pass pass or not using ma=inimal or maximal speed
    public static boolean Can_Pass_Crossroad_max_min_speed(Car_At_Given_Time car, Intersection intersection) {
        double displacement = 0;


        //******************************************I think there was a mistake in project description, instead of
        // - Car’s initial speed 20 km/s ≤ v0 ≤ 80 km/s; must be  km/h, which I then make m/s.
        //car attributes
        double car_initial_speed = car.getInitial_speed() * (1000 / 3600);
        double car_at_time = car.getT_0();
        double car_positive_acceleration = car.getConstant_positive_accelertaion();
        double car_negative_acceleration = car.getConstant_negative_accelertaion();
        double distance_from_the_intersection = car.distance_from_intersection;
        double car_length = car.getCar_length();
        // road attributes
        double yellow_light_duration = intersection.getYellow_light_duretion();
        double intersection_width = intersection.getIntersection_width();


        if (car_initial_speed + car_positive_acceleration * yellow_light_duration / 2 >= 50 * (1000 / 3600) && car_initial_speed + car_positive_acceleration * yellow_light_duration / 2 <= 100 * (1000 / 3600)) {
            //I assume that the distence from car to cross-road is measured from the car front tip to cross-road
            //that is why I add car length to the displacement
            displacement = car_initial_speed * yellow_light_duration + (car_positive_acceleration * Math.pow(yellow_light_duration, 2)) / 2;

            if (displacement >= car_length + distance_from_the_intersection + intersection_width) {
                System.out.println("ACCELERATE! You can pass the road intersection.");
                return true;

            } else {
                System.out.println("STOP! Car cannot accelerate to pass the road intersection.");
                return false;

            }
        } else{
            System.out.println("Car`s speed either exceeds the maximal speed or does not reach to minimal speed limit!");
            return false;
        }

    }



    public static void Can_Pass_Crossroad_For_Two_Cars(Car_At_Given_Time car_at_the_back, Car_At_Given_Time car_at_the_front,Intersection road){

        //I assume that the distence from car to cross-road is measured from the car front tip to cross-road
        //that is why I add car length to the displacement
        //******************************************I think there was a mistake in project description, instead of
        // - Car’s initial speed 20 km/s ≤ v0 ≤ 80 km/s; must be  km/h, which I then make m/s.
        //car attributes
        //*********Front car properties
        double front_car_initial_speed = car_at_the_front.getInitial_speed()*(1000/3600);
        double front_car_at_time = car_at_the_front.getT_0();
        double front_car_positive_acceleration = car_at_the_front.getConstant_positive_accelertaion();
        double front_car_negative_acceleration = car_at_the_front.getConstant_negative_accelertaion();
        double front_distance_from_the_intersection = car_at_the_front.getDistance_from_intersection();
        double front_car_length = car_at_the_front.getCar_length();



        //******************************************I think there was a mistake in project description, instead of
        // - Car’s initial speed 20 km/s ≤ v0 ≤ 80 km/s; must be  km/h, which I then make m/s.
        //car attributes
        //*********Back car properties
        double back_car_initial_speed = car_at_the_back.getInitial_speed()*(1000/3600);
        double back_car_at_time = car_at_the_back.getT_0();
        double back_car_positive_acceleration = car_at_the_back.getConstant_positive_accelertaion();
        double back_car_negative_acceleration = car_at_the_back.getConstant_negative_accelertaion();
        double back_distance_from_the_intersection = car_at_the_back.getDistance_from_intersection();
        double back_car_length = car_at_the_back.getCar_length();
        double back_car_distance_from_the_front_car = car_at_the_back.getDistance_from_the_other_car();


        // road attributes
        double yellow_light_duration = road.getYellow_light_duretion();
        double intersection_width = road.getIntersection_width();


        //I assume that the distence from car to cross-road is measured from the car front tip to cross-road
        //that is why I add car length to the displacement
       double front_car_displacement = front_car_initial_speed*yellow_light_duration + (front_car_positive_acceleration*Math.pow(yellow_light_duration, 2))/2;
       double back_car_displacement = back_car_initial_speed*yellow_light_duration + (back_car_positive_acceleration*Math.pow(yellow_light_duration, 2))/2;

       //this variables show how much car will go after break is pushed
       double front_car_how_much_go_to_stop = front_car_initial_speed*yellow_light_duration + (front_car_negative_acceleration*Math.pow(yellow_light_duration, 2))/2;
       double back_car_how_much_go_to_stop = back_car_initial_speed*yellow_light_duration + (back_car_negative_acceleration*Math.pow(yellow_light_duration, 2))/2;

        double front_car_speed = front_car_initial_speed + front_car_positive_acceleration*yellow_light_duration/2;
       double back_car_speed = back_car_initial_speed + back_car_positive_acceleration*yellow_light_duration/2;



       //if car at the back can go more than the the distance between them and + how much can the front car go then there can be two cases
       if(back_car_displacement >= back_car_distance_from_the_front_car + front_car_displacement){

           if((back_car_how_much_go_to_stop <= back_car_distance_from_the_front_car + front_car_length + front_distance_from_the_intersection)&& Can_Pass_Crossroad(car_at_the_front,road)){
               System.out.println("ACCELERATE CAR AT THE FRONT!. YOU CAN PASS THE CROSS-ROAD!");
               System.out.println("STOP CAR AT THE BACK!");

           }else if((back_car_how_much_go_to_stop < back_car_distance_from_the_front_car + front_car_how_much_go_to_stop)&& Can_Pass_Crossroad(car_at_the_front,road)== false && front_car_how_much_go_to_stop <= front_distance_from_the_intersection){
               System.out.println("STOP CAR AT THE BACK!");
               System.out.println("STOP CAR AT THE FRONT!");

           }else {
               System.out.println("ATTENTION! YOU ARE GOING TO HAVE A CRUSH!!!!!!! HOLD FROM THE SEAT.");

           }
       }else if(back_car_displacement < back_car_distance_from_the_front_car + front_car_displacement){

           if(Can_Pass_Crossroad(car_at_the_back,road)&& Can_Pass_Crossroad(car_at_the_front, road) ){

               System.out.println("ACCELERATE CAR AT THE BACK!. YOU CAN PASS THE CROSS-ROAD!");
               System.out.println("ACCELERATE CAR AT THE FRONT!. YOU CAN PASS THE CROSS-ROAD!");

           }else if((Can_Pass_Crossroad(car_at_the_back,road)== false) && Can_Pass_Crossroad(car_at_the_front, road) ){

               System.out.println("STOP CAR AT THE BACK!");
               System.out.println("ACCELERATE CAR AT THE FRONT!. YOU CAN PASS THE CROSS-ROAD!");

           }else if((Can_Pass_Crossroad(car_at_the_back,road)== false) && (Can_Pass_Crossroad(car_at_the_front, road) == false) && (back_car_how_much_go_to_stop < back_car_distance_from_the_front_car + front_car_how_much_go_to_stop) && (front_car_how_much_go_to_stop <= front_distance_from_the_intersection) ){
               System.out.println("STOP CAR AT THE BACK!");
               System.out.println("STOP CAR AT THE FRONT!");
           }else{

               System.out.println("ATTENTION! YOU ARE GOING TO HAVE A CRUSH!!!!!!! HOLD FROM THE SEAT.");

           }
       }



    }


}
