import java.util.*;
public class Main {
    static int ACcounter=2;
    static int Slecounter=2;
    static Queue<String> BookingAC=new LinkedList<String>();
    static Queue<Integer> BookAC=new LinkedList<Integer>();
    static Queue<String> BookingSL=new LinkedList<String>();
    static Queue<Integer> BookSL=new LinkedList<Integer>();
    public void getReservation(int ticket,int coach) {
        if (ACcounter<=0&&Slecounter<=0) {
            System.out.println("Tickets not available");
        }
        else {
            switch (coach) {
                case 1:
                    if (ticket <= ACcounter) {
                        for (int i = 0; i < ticket; i++) {
                            System.out.println("Enter name: ");
                            Scanner sc = new Scanner(System.in);
                            String name = sc.nextLine();
                            System.out.println("Enter age of that person: ");
                            BookingAC.add(name);
                            int age = sc.nextInt();
                            BookAC.add(age);
                            ACcounter--;
                        }
                    }
                    break;
                case 2:
                    if (ticket <= Slecounter) {
                        for (int i = 0; i < ticket; i++) {
                            System.out.println("Enter name: ");
                            Scanner sc = new Scanner(System.in);
                            String name = sc.nextLine();
                            System.out.println("Enter age of that person: ");
                            BookingSL.add(name);
                            int age = sc.nextInt();
                            BookSL.add(age);
                            Slecounter--;
                        }

                    }


            }
        }
    }
    public static void main(String[] args) {
        Main obj=new Main();
        Scanner sc=new Scanner(System.in);
        int num;
//        int ticket = 10;
        do{
            System.out.println("TICKET BOOKING SYSTEM");
            System.out.println("Enter 1 for reservation");
            System.out.println("Enter 2 for View Remaining Tickets");
            System.out.println("Enter 3 for Sold Ticket List");
            System.out.println("Enter 4 for Exit");
            num=sc.nextInt();
            switch (num) {
                case 1 -> {
                    System.out.println("Enter number of Tickets you want to reserve");
                    int t = sc.nextInt();
                    System.out.println("Enter 1 for AC and 2 for Sleeper coaches");
                    int c = sc.nextInt();
                    obj.getReservation(t,c);
                }
                case 2 -> {
                    System.out.println("Number of tickets left in AC" + ACcounter);
                    System.out.println("Number of tickets left in SLEEPER" + Slecounter);
                    break;
                }
                case 3 -> {
                    System.out.println("Number of sold tickets");
                    System.out.println("Persons in AC: "+ BookingAC + "Having thier respective ages "+ BookAC);
                    System.out.println("Persons in SLEEPER: "+ BookingSL + "Having thier respective ages "+ BookSL);
                }
            }

        }while(num!=4);

    }

    }