package lesson4;

public class Main {
    public static void main(String[] args) {
        LLMModel codeModel = LLMModelFactory.getModel(Activities.CODE_GENERATION);
        System.out.println(codeModel.sendPrompt("כתוב פונקציה לבדיקת מספר ראשוני"));

        LLMModel docModel = LLMModelFactory.getModel(Activities.DOCUMENT_ANALYSIS);
        System.out.println(docModel.sendPrompt("נתח את הדוח המצורף"));
    }
}
