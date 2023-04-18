import java.util.List;

public abstract class Question {
    private String text;
    private String answer;

    public Question(String text, String answer) {
        this.text = text;
        this.answer = answer;
    }

    public String getText() {
        return text;
    }

    public String getAnswer() {
        return answer;
    }

    public void displayAnswer() {
        System.out.println(answer);
    }

    public static class BasicQuestion extends Question {
        public BasicQuestion(String text, String answer) {
            super(text, answer);
        }
    }

    public static class DetailedQuestion extends Question {
        private String explanation;
        private String examples;

        public DetailedQuestion(String text, String answer, String explanation, String examples) {
            super(text, answer);
            this.explanation = explanation;
            this.examples = examples;
        }

        public String getExplanation() {
            return explanation;
        }

        public String getExamples() {
            return examples;
        }

        @Override
        public void displayAnswer() {
            // Display the answer, explanation and examples in the console
            System.out.println(getAnswer());
            System.out.println(getExplanation());
            System.out.println(getExamples());
            }
        }
}