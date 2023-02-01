package model;

public class Category extends MainCategory {

    String genre;

    public Category( String seat, String genre) {
        super(seat);
        this.genre = genre;
    }
}
