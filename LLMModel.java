package lesson4;

public abstract class LLMModel {
    protected String name;
    protected String define;

    protected LLMModel(String name, String define) {
        this.name = name;
        this.define = define;
    }

    public abstract String prompt();

    public String sendPrompt(String userPrompt) {
        return name + ": " + prompt() + " | User: " + userPrompt;
    }
}
