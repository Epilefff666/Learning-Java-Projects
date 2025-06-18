public class Lasagna {

    static final int EXPECTED_MINUTES_OVEN = 40;

    public int expectedMinutesInOven(){

        return EXPECTED_MINUTES_OVEN;

    }

    public int remainingMinutesInOven(int minutes){

      return expectedMinutesInOven() - minutes;
    }

    public int preparationTimeInMinutes(int layers){

        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int minutesOven){

        return minutesOven + preparationTimeInMinutes(layers);
    }
}
