public class Main {
    public static void main(String[] args) {
         boolean gameover=true;
         int score =800;
         int levelcompleted=5;
         int bonus=100;
  
        calcluatescore(true, 800, 5, 100);
        score=10000;
        levelcompleted=8;
        bonus=200;
        calcluatescore(true, 10000, 8, 200);
    }
    public static int calcluatescore(boolean gameover ,int score,int levelcompleted,int bonus) {

        int finalscore = score;

        if (gameover) {
            finalscore += (levelcompleted * bonus);
            finalscore+=1000;
            System.out.println("your final score was" + finalscore);
        }

        return finalscore;
    }
}