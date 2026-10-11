package lesson4;

public class Claude_Sunnet extends LLMModel {
    public Claude_Sunnet() {
        super("Claude Sonnet", "מתאים במיוחד לעבודה עם קוד וניתוח טקסט");
    }

    @Override
    public String prompt() {
        return "Claude Sonnet – מתאים במיוחד לעבודה עם קוד וניתוח טקסט";
    }
}
