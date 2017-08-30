
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        
        if(this.guessedLetters.contains(letter)){
            
        } else if(word.contains(letter)){
            this.guessedLetters += letter;
        } else{
            this.numberOfFaults++;
            this.guessedLetters += letter;
        }

    }

    public String hiddenWord() {
        
        int length = word.length();
        int i = 0;
        String hidden = "";
        
        while (i < length){
            char c = word.charAt(i);
            String character = "" + c;
            if (guessedLetters.contains(character)){
                hidden += character;
            } else {
                hidden += "_";
            }
            i++;
        }
        return hidden;
}
}
