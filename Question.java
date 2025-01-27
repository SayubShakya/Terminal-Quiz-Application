class Question {
    private String questionText;
    private Option[] options;

    public Question(String questionText, Option[] options) {
        this.questionText = questionText;
        this.options = options;
    }

    public String getQuestionText() {
        return questionText;
    }

    public Option[] getOptions() {
        return options;
    }

    public boolean isCorrectAnswer(int answerIndex) {
        return options[answerIndex].isCorrect();
    }
} // to Checks if a chosen answer (like Option 1) is correct.