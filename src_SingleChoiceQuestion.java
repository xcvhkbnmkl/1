public class SingleChoiceQuestion extends Question{

    public SingleChoiceQuestion(){
        this.question = "";
        this.rightAnswer = "";
        this.points = 0;
        this.variants = new String[4];
    }

    public SingleChoiceQuestion(String question, String rightAnswer, int points, String firstVar, String secondVar,
                                String thirdVar, String fourthVar){
        this.question = question;
        this.rightAnswer = rightAnswer;
        this.points = points;
        this.variants = new String[]{firstVar, secondVar, thirdVar, fourthVar};
    }

    public String getRightAnswer(){
        return rightAnswer+". "+getSomeVariant(rightAnswer);
    }

    public String getSomeVariant(String answer){
        int i=5;
        if(answer.equals("a")){i=0;}
        if(answer.equals("b")){i=1;}
        if(answer.equals("c")){i=2;}
        if(answer.equals("d")){i=3;}
        if (i!=5) {
            return variants[i];
        }
        else
            return " ";
    }

    public String getVariant(int index){
        return variants[index];
    }

    public String getQuestions(){
        return question+"\nВыберите правильный вариант: \na."+variants[0]+"\t\tb."+variants[1]+"\nc."+variants[2]+"\t\td."+variants[3];
    }
}
