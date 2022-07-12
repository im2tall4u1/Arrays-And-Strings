import java.util.*;

public class Main {
    public static void main (String[] args) {
    
        Scanner s = new Scanner(System.in);
        Ticket t = new Ticket();
        
        System.out.println("Enter no of bookings:\n");
        int no = s.nextInt();
        
        System.out.println("\nEnter the available tickets:\n");
        int availableTicket = s.nextInt();
        t.setAvailableTickets(availableTicket);
        
        do{
            
        System.out.println("\nEnter the ticketid:\n");
        int tickedId = s.nextInt();
        t.setTicketid(tickedId);
        
        System.out.println("\nEnter the price:\n");
        int price = s.nextInt();
        t.setPrice(price);
        
        System.out.println("\nEnter the no of tickets:\n");
        int bookTickets = s.nextInt();
        
        System.out.println("\nAvailable tickets:"+t.getAvailableTickets());
        System.out.println("\nTotal amount:"+t.calculateTicketCost(bookTickets));
        System.out.println("\nAvailable ticket after booking:"+t.getAvailableTickets());
        
        no--;
        }while(no>0);
    }
}
