import java.util.Scanner;

public class TestingProcess {
    /* класс для текстовой работы с пользователем */
    static void menu(){
        System.out.println("Menu:\n 1.Начать тест\n 2.Пoсмотреть результат\n 3.Выйти из программы\n");
    }
    static int askChoice(){
       int menu;
       Scanner in = new Scanner(System.in);
       menu=in.nextInt();
       return menu;
    }
    static void Answers(Question question,Answer answer){
        System.out.println(question.getQuestion());
            if (answer.getCorect()) {
                System.out.println("Ваш ответ: '" + question.getRightAnswer() + "' являеться правильным");
            } else {
                System.out.println("Ваш ответ: '" + answer.getUzerAnswer() +" "+question.getSomeVariant(answer.getUzerAnswer())+ "' являеться неправильным, правильный ответ - " + question.getRightAnswer());
            }

        System.out.println();
    }
    static void result(Result result){
        System.out.println("ВАШ РЕЗУЛЬТАТ!");
        System.out.println(result.getPoints()+"/10");
        System.out.println(result.getRank((int) result.getPoints())+"\n");
    }
    static String askQuestion(Question question){
        String answer = null;
        System.out.println(question.getQuestions());
        Scanner sc = new Scanner(System.in);
        answer = sc.nextLine();
        return answer.toLowerCase();
    }
}
