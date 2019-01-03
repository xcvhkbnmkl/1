public class Test {
    private Question[] questions = null;
    private Result result;
    private Answer[] answers;

    public Test(Question[] questions, Result result){
        this.questions = questions;
        this.result = result;
        answers=new Answer[questions.length];
    }

    public void setQuestions(Question[] questions){
        this.questions = questions;
    }

    public Question[] getQuestions(){
        return questions;
    }


    /*public void changePoints(double value){
        this.points += value;
    }*/

    /*public void checkAnswer(String answer){
        if(answer.equals())
    }*/

    public void startTesting(){
        String  answer = null;
        for(int i=0; i<questions.length; i++){
                answer = TestingProcess.askQuestion(questions[i]);
            if(questions[i].isAnswerRight(answer)) {
                result.addPoints(questions[i].getPoints());
                answers[i]=new Answer(answer,true);
            }
            else{
                answers[i]=new Answer(answer,false);
            }

        }
    }
    public void Menu(){
        while (true){
            TestingProcess.menu();
            int menu = TestingProcess.askChoice();
            if (menu==1){startTesting();}
            if (menu==2){
                if (answers[0]!=null) {
                    TestingProcess.result(result);
                    for (int i = 0; i < questions.length; i++) {
                        TestingProcess.Answers(questions[i], answers[i]);
                    }
                }
                else System.out.println("Тест еще не был пройден");
                result.setPoints(0);
            }
            if (menu==3){break;}
        }
    }
    public Result getResult(){
        return result;
    }

}
class Answer{
    private String uzerAnswer;
    private boolean corect;

    Answer(String uzerAnswer,boolean corect){
        this.uzerAnswer=uzerAnswer;
        this.corect=corect;
    }
    boolean getCorect(){
        return corect;
    }
    String getUzerAnswer(){
        return uzerAnswer;
    }
}