public class WordRunner {
    public static void main(String[] args) {
        WordClass word1 = new WordClass("apple");
        WordClass word2 = new WordClass("banana");
        WordClass word3 = new WordClass("pineapple");
        WordClass word4 = new WordClass("grape");
        WordClass word5 = new WordClass("orange");
        WordClass word6 = new WordClass("pear");
        System.out.println(word1.getWord());
        System.out.println(word2.getWord());
        System.out.println(word3.getWord());
        System.out.println(word4.getWord());
        System.out.println(word5.getWord());
        System.out.println(word6.getWord());
        System.out.println(WordClass.getMaxWord());

        boolean test1 = Words.doesContain("ell", "hello");
        boolean test2 = Words.doesContain("ell", "hyper");
        boolean test3 = Words.doesContain("ell", "i want to sell");
        boolean test4 = Words.doesContain("happy", "happ");
        boolean test5 = Words.doesContain("happy", "happy");
        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        Words.printReverse("hello");
        Words.printReverse("final it's friday!");


    }
}