import java.util.Scanner;

public class Restaurant {
    Reservation[] reservationList = new Reservation[100];
    int count=0;
    

    public Restaurant(){
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome! Press 1 to add, press 2 to end session:");
        int check = in.nextInt();
        while(check != 2) {
            System.out.println("Please input number of guests, what time you want your reservation, and the current time");
            int g = in.nextInt();
            int res = in.nextInt();
            int t = in.nextInt();
            addReservation(g,res,t);
            System.out.println("Do you want to add more reservations? Press 2 to end");
            check = in.nextInt();
        }

        displayReservation(reservationList);
        System.out.println();
        System.out.println("Sorted list according to call time: ");
        sortReservations(reservationList);

//        Reservation Dianne = new Reservation(3,1600,800);
//        System.out.println("Number of people: "+Dianne.numPeople);
//        System.out.println("Time of Reservation: "+Dianne.timeRes);
//        System.out.println("Time guest called: "+Dianne.timeCall);
    }
    public void addReservation(int numPeople, int timeRes, int timeCall){
            reservationList[count] = new Reservation(numPeople, timeRes, timeCall);

        count++;

    }

    public void displayReservation(Reservation [] reservationList){
        for(Reservation i: reservationList) {
            if(i != null) {
                System.out.println("Number Guest: " + i.numPeople);
                System.out.println("Time of Reservation: " + i.timeRes + "'o clock");
                System.out.println("Time of Making Reservation #: " + i.timeCall + "'o clock");
            }
        }
    }

    public void sortReservations(Reservation[] reservationList){
        for(int i=0; i<reservationList.length-1; i++){
            int minIndex = i;
            for(int j=i+1; j<reservationList.length; j++){
                if(reservationList[j] != null && reservationList[j].timeCall<reservationList[minIndex].timeCall){
                    minIndex=j;
                }
            }
            Reservation temp = reservationList[i];
            reservationList[i]=reservationList[minIndex];
            reservationList[minIndex]=temp;
        }
        for(Reservation i: reservationList) {
            if(i != null) {
                System.out.println("Number Guest: " + i.numPeople);
                System.out.println("Time of Reservation: " + i.timeRes + "'o clock");
                System.out.println("Time of Making Reservation #: " + i.timeCall + "'o clock");
            }
        }
    }
    public static void main(String[] args) {

        Restaurant obj = new Restaurant();



    }

}
