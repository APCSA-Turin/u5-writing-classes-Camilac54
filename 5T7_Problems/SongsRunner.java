public class SongsRunner {
    public static void main(String[] args) {
        System.out.println("-----------------\n");
        System.out.println("Song List:");
        Songs song1 = new Songs("Hide and Seek", "Imogen Heap");
        System.out.println(song1.getSongInfo());
        Songs song2 = new Songs("Just For Now", "Imogen Heap");
        System.out.println(song2.getSongInfo());
        Songs song3 = new Songs("Clear the Area", "Imogen Heap");
        System.out.println(song3.getSongInfo());
        Songs song4 = new Songs("Flicks", "Frou Frou");
        System.out.println(song4.getSongInfo());
        System.out.println("-----------------\n");
        
        System.out.println("My personal song ratings: ");
        song1.addAllInfo();
        song2.addAllInfo();
        song3.addAllInfo();
        Songs.setRating("Good");
        song4.addAllInfo();
    }
}