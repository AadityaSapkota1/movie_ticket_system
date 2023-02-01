import model.Movie;
import model.Seat;
import model.Ticket;
import model.User;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Movie> movies = new ArrayList<Movie>();
        Movie m1 = new Movie("Sofa","Action","Paramount","Me","10:00",1200);
        Movie m2 = new Movie("Chair","Romance","Puppy","lelelele","19:30",600);
        movies.add(m1);
        movies.add(m2);


        ArrayList<User> users = new ArrayList<User>();
        User u1 = new User("Aaditya","17","9869361419");
        User u2 = new User("Avarna","18","9809809888");
        users.add(u1);
        users.add(u2);






        ArrayList<Seat> seats = new ArrayList<>();
        Seat s1 = new Seat("Premium", 2);
        Seat s2 = new Seat("Standard", 4);
        seats.add(s1);
        seats.add(s2);


        Ticket t1 = new Ticket(seats,users,movies);



        m1.getInfo();

        t1.getTickets();





    }
}

