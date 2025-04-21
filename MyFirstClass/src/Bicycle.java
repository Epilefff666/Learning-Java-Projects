public class Bicycle {

    // constructor of this class, starting the default values for each variable
    public Bicycle(
            String maker,
            String color
    ){
        this.maker = maker;
        this.color = color;
        this.moving = false;
        this.stopped = true;
        this.gear = 1;
        this.speed = 0;
    }
    public Bicycle(){
        this.maker = "ACME";
        this.color = "BLUE";
        this.moving = false;
        this.stopped = true;
        this.gear = 1;
        this.speed = 0;
    }

    //variables that define the states
    String maker ;
    String color;
    boolean moving;
    boolean stopped;
    int gear;
    int speed;

    // definition of methods or behaviors
    public void speedUp(){
        if(speed == 0){
            stopped = false;
            moving = true;
        }
        speed = speed + 1;


    }
    public void stop(){
        if(speed == 1){
            speed = 0;
            stopped = true;
            moving = false;

        }
        if(speed > 1){
            speed = speed -1;
        }
    }
    public void streamBicyle(){
        System.out.println("maker:"+this.maker);
        System.out.println("color:"+ this.color);
        System.out.println("speed:"+ this.speed);
        System.out.println("moving:"+this.moving);
        System.out.println("stopped:"+ this.stopped);
        System.out.println("gear:"+this.gear);
        System.out.println("---------------------------------------");
    }

}
