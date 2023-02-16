public class Reservation {

    int numPeople;
    int timeRes;
    int timeCall;

    Reservation(int numPeople, int timeRes, int timeCall){
        this.numPeople=numPeople;
        this.timeRes=timeRes;
        this.timeCall=timeCall;
    }
    public String toString(){
        return numPeople+ " "+timeRes+" "+timeCall;
    }

}
