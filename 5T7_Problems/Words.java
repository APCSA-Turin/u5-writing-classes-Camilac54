public class Words {
    private Words() {}

    public static boolean doesContain(String word1, String word2){
        int i = word2.indexOf(word1);
        if (i == -1){
            return false;
        } else {
            return true;
        }
    }

    public static void printReverse(String word){
        for (int i = word.length() - 1; i >= 0; i--) {
            String chara = word.substring(i, i + 1);
            System.out.print(chara + " ");
        }
        System.out.println();
    }
}
