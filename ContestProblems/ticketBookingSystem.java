package ContestProblems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.HashMap;

public class ticketBookingSystem {
    static int capacity = 10;
    //static HashMap<String,Integer> mp=new HashMap<>();


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Queue<String> q = new LinkedList<>();

        int n;

        do {
            System.out.println("Welcone to the ticket booking system");
            System.out.println(" 1-For Reservation");
            System.out.println(" 2-For viewing Remaining tickets");
            System.out.println(" 3-For sold tickets");
            System.out.println("4-Exit");

            System.out.println("Enter the value of n ");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    findReservation(q);
                    break;

                case 2:
                    System.out.println("Number of remaining tickets " + viewRemaining(q));
                    break;

                case 3:
                    System.out.println("Number of sold tickets " + soldTickets(q));
                    break;

                case 4:
                      viewTicketsBookedList(q);
                    break;

                default:

                    break;
            }

        } while (n <= 4 && n > 0);
    }

    static void viewTicketsBookedList(Queue<String> q) {
        HashMap<String,Integer> mp=new HashMap<>();

        // while(q.isEmpty()==false){
        //     mp.add(q.remove())
        // }
        
        System.out.println("List of person Booked the ticket");
        if(q.isEmpty()==false){
            System.out.println(q);
        }
        else{
            System.out.println("No tickets booked yet");
        }

       
    }

    static int soldTickets(Queue<String> q) {

        return q.size();
    }

    static int viewRemaining(Queue<String> q) {
        return capacity - q.size();
    }

    static void findReservation(Queue<String> q) {
        if (q.size() >= capacity) {
            System.out.println("No tickets available");

        } else {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Your name");
            String name = sc.next();
            System.out.println("Enter the number of tickets to be booked");
            int noof = sc.nextInt();

            for (int i = 0; i < noof; i++) {
                q.add(name);
            }

            System.out.println("Your ticket is booked");
        }
    }

}
