public class Result {
    private int points;
    private String[] ranks;

    public Result(){
        this.points = 0;
        //this.ranks = null;
    }

    public Result(String[] ranks){
        this.ranks = ranks;
        this.points = 0;
    }

    public void setPoints(int points){
        this.points = points;
    }

    public int getPoints(){
        return points;
    }

    public void addPoints(double value){
        this.points += value;
    }

    public void minusPoints(double value){
        this.points -= value;
    }

    public String getRank(int points){
        if(points == 0){return ranks[0];
        }else if((points>0)&&(points<4)){return ranks[1];
        }else if((points == 3)||(points == 5)){return ranks[2];
        }else if((points > 5) && (points < 10)){return ranks[3];
        }else return ranks[4];
    }

}
