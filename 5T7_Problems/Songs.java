public class Songs {
    private static String rating = " - Amazing";
    private String songName;
    private String artist;
 
    public Songs (String songName, String artist) {
        this.songName = songName;
        this.artist = artist;
    }

    public String getSongInfo() {
        String str = songName + " by " + artist;
        return str;
    }

    public static String getRating() {
        return rating;
    }

    public static void setRating(String newValue) {
        rating = " - " + newValue;
    }

    public void addAllInfo() {
        System.out.println(getSongInfo() + rating);
    }
}
