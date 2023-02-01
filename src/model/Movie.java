package model;

public class Movie extends Category {

    String name;


    public Movie(String seat, String genre, String name, String director, String show_time, int price) {
        super(seat, genre);
        this.name = name;
        this.director = director;
        this.show_time = show_time;
        this.price = price;
    }

    String director;
    String show_time;
    int price;


    public void getInfo() {
        System.out.println("You have chosen:" + this.seat);
        System.out.println("Your Movie Category is:" + this.genre);
        System.out.println("Your Movie is:" + this.name);
    }

   /* public void getMovies(String show_time) {
        if (this.show_time.equals(show_time)) {
            System.out.println("Movie:" + this.name);
        } else {
            System.out.println("No movie for the above mentioned show time!!!");
        }
    }*/
}
