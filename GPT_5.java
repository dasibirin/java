package lesson4;

public class GPT_5 extends LLMModel {
    public GPT_5() {
        super("GPT-5", "מתאים למשימות כלליות ומורכבות");
    }

    @Override
    public String prompt() {
        return "GPT-5 – מתאים למשימות כלליות ומורכבות";
    }
}