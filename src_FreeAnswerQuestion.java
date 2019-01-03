
public class FreeAnswerQuestion extends Question{
    public FreeAnswerQuestion(String question,String rightAnswer,int points ){
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.points = points;
    }
    public String getRightAnswer(){
        return rightAnswer;
    }
    public String getVariant(int index){
        return "";
    }
    public String getSomeVariant(String answer){
        return "";
    }

    public String getQuestions(){
        return question+"\nВведите ответ: \n";
    }
}
