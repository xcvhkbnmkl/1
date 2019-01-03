public class SetOfQuestions {
    private Question[] questions = new Question[10];
    private String[] ranks = new String[10];

    public Question[] getQuestions(){
        return questions;
    }

    public void initArrayOfQuestions(){
        questions[0] = new SingleChoiceQuestion("На какой главный вопрос отвечает греческая мифология?","d",1
                ,"Существует ли Бог?","Как возникла жизнь на Земле?","Кто чей родственник?","Почему этот мир такой?");
        questions[1] = new FreeAnswerQuestion("Как звали отца богини Афины?","зевс",1);
        questions[2] = new SingleChoiceQuestion("Как звали человека, который обманул смерть?","d",1
                ,"Геракл","Прометей","Арианда","Сизиф");
        questions[3] = new SingleChoiceQuestion("От какого слово произошел фразеологизм: 'Провалиться в тартарары'?","d",1
                ,"Тартария","Таро","Тарт татен","Тартар");
        questions[4] = new SingleChoiceQuestion("Как звали первую женщину, которую создали титаны?","b",1
                ,"Ева","Пандора","Гера","Пенелопа");
        questions[5] = new SingleChoiceQuestion("'От взгляда рождается любовь'. С какими персонажами связана эта фраза?","d",1
                ,"Орфей и Эвридика","Одиссей и Пенелопа","Парис и Елена","Ахилл и Пентесилея");
        questions[6] =new SingleChoiceQuestion("С какой субкульторой новейшего времени связан миф об Эроте?","c",1
                ,"Хиппи","Хип-Хоп","Панк","Готы");
        questions[7] = new SingleChoiceQuestion("С каким богом связан образ сверхчеловека Фридриха Ницше?","a",1
                ,"Дионис","Зевс","Арес","Геракл");
        questions[8] = new SingleChoiceQuestion("С какой частью человеческого тела ассоциируется тонкая часть греческой колонны?","d",1
                ,"Запястье","Колено","Талия","Шея");
        questions[9] = new FreeAnswerQuestion("Как звали бога виноделия и развлечений?","дионис",1);
    }

    public void initArrayOfRanks(){
        ranks[0] = "Вы блуждаете в лабиринте мифов без одного важного инструмента.";
        ranks[1] = "Ваши знания пока летят в тартарары!";
        ranks[2] = "Вы зашли в лабиринт с нитью Ариадны в руке.";
        ranks[3] = "Вы еще не Зевс, но уже почти Геракл!";
        ranks[4] = "Вы на вершине Олимпа!";
    }

    public String getKnowRank(int points){
        return ranks[points];
    }

    public String[] getRanks(){
        return ranks;
    }

}
