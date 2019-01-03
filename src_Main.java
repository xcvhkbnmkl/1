
public class Main {
    public static void main(String[] args) {
        SetOfQuestions set = new SetOfQuestions();
        set.initArrayOfQuestions();
        set.initArrayOfRanks();
        Result result = new Result(set.getRanks());

        Test test = new Test(set.getQuestions(),result);
        test.Menu();


    }
}
