package lesson4;

public class GPT_5_MINI extends LLMModel {
    public GPT_5_MINI() {
        super("GPT-5 mini", "מתאים למשימות פשוטות ומהירות");
    }

    @Override
    public String prompt() {
        return "GPT-5 mini – מתאים למשימות פשוטות ומהירות.";
    }
}
