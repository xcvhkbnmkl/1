
public abstract class Question {
    protected String question;
    protected String rightAnswer;
    protected String[] variants;
    protected int points; //сколько очков начисляется за правильный ответ на данный вопрос

    public void setQuestion(String question){
        this.question = question;
    }

    public void setRightAnswer(String rightAnswer){
        this.rightAnswer = rightAnswer;
    }

    public void setPoints(int points){
        this.points = points;
    }

    public String getQuestion(){
        return question;
    }

    abstract String getRightAnswer();

    public int getPoints(){
        return points;
    }

    abstract String getSomeVariant(String answer);

    abstract String getVariant(int index);

    public boolean isAnswerRight(String answer){
        if(answer.equals(this.rightAnswer)){
            return true;
        }else return false;
    }

    abstract String getQuestions();

}
