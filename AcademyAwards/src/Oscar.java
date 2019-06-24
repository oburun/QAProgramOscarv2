public class Oscar {
    String year;
    String category;
    String movie;
    String artist;
    public Oscar(String year, String category, String movie, String artist) {
        this.year = year;
        this.category = category;
        this.movie = movie;
        this.artist = artist;
    }

    public String getYear() {
        return year;
    }

    public String getCategory() {
        return category;
    }

    public String getMovie() {
        return movie;
    }

    public String getArtist() {
        return artist;
    }

    @Override
    public String toString() {
        return "Oscar{" +
                "year=" + year +
                ", category='" + category + '\'' +
                ", movie='" + movie + '\'' +
                ", artist='" + artist + '\'' +
                '}';
    }


}
