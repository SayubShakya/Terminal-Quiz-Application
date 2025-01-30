class Question {
    private static int idTracker = 1;
    private int id;
    private String questionText;
    private DynamicOptionArray options;

    public void setOptions(DynamicOptionArray options) {
        this.options = options;
    }

    public Question(){
        this.id = idTracker++;
    }

    public int getId() {
        return id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String text){
        this.questionText = text;
    }

    public DynamicOptionArray getOptions() {
        return options;
    }

    public boolean isCorrectAnswer(int answerIndex) {
        return options.get(answerIndex).isCorrect();
    }

    


    @Override
    public String toString() {
        return "Question [id=" + id + ", questionText=" + questionText + ", options=" + options + "]";
    }

    

}