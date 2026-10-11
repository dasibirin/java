package lesson4;

public class LLMModelFactory {
    public static LLMModel getModel(String activity) {
        if (activity == null) {
            throw new IllegalArgumentException("Activity cannot be null");
        }

        switch (activity) {
            case Activities.COMPLEX_ANALYSIS:
                return new GPT_5();
            case Activities.CODE_GENERATION:
            case Activities.SUMMARIZATION:
                return new Claude_Sunnet();
            case Activities.DOCUMENT_ANALYSIS:
                return new Gemini();
            case Activities.SIMPLE_QUESTION:
                return new GPT_5_MINI();
            default:
                throw new IllegalArgumentException("Unknown activity: " + activity);
        }
    }
}
