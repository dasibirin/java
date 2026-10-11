package lesson4;

public class Gemini extends LLMModel {
    public Gemini() {
        super("Gemini", "מתאים לעבודה עם כמויות גדולות של מידע");
    }

    @Override
    public String prompt() {
        return "Gemini – מתאים לעבודה עם כמויות גדולות של מידע";
    }
}
