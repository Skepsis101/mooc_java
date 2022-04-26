public class Film {
    private String filmName;
    private int filmAgeRating;

    public Film(String name, int ageRating) {
        this.filmName = name;
        this.filmAgeRating = ageRating;
    }

    public String name() {
        return this.filmName;
    }

    public int ageRating() {
        return this.filmAgeRating;
    }
}
