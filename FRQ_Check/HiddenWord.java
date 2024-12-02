// type up the complete HiddenWord class here
public class HiddenWord {
    private String word;
 
 
    public HiddenWord(String word) { 
       this.word = word;
    }
 
    public String getHint(String guess) {
       String hint = "";
       for (int i = 0; i < word.length(); i++) {
          String wordLtr = word.substring(i, i+1);
          String guessLtr = guess.substring(i, i+1);
          if (wordLtr.equals(guessLtr)) {
             hint = hint + guessLtr;
          } else if (word.indexOf(guessLtr) != -1) {
             hint = hint + "+";
          } else {
             hint = hint + "*";
          }
       }
       return hint;
    }
 } 