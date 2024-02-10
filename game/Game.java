package game;

public class Game {
        private int rndom_no ;
        Player p1,p2,p3,p4;

         private boolean correctguess(){
                if(p1.guess == rndom_no){
                        return true;
                } else if (p2.guess == rndom_no) {
                        return true;
                } else if (p3.guess == rndom_no) {
                        return true;
                } else if (p4.guess == rndom_no) {
                        return true;
                }else{
                        return false;
                }
        }


        public Game(String pn1,String pn2,String pn3,String pn4){
                p1 = new Player(pn1);
                p2 = new Player(pn2);
                p3 = new Player(pn3);
                p4 = new Player(pn4);
        }
        void StartGame(){
                System.out.println("Welcome to Number Roulette");
                System.out.println("");
                System.out.println("");
                System.out.println("note: you can also give penalties to each other for a wrong guess");
                rndom_no = (int)(Math.random()*10);
                System.out.println(rndom_no);

               while(true){
                       p1.startguess();
                       p2.startguess();
                       p3.startguess();
                       p4.startguess();
                       boolean winner = correctguess();
                       if(winner){
                               System.out.println("Game over!");
                               break;
                       }else{
                               System.out.println("Nobody wins ......");
                               System.out.println("resetting the value to be guessed......");
                               rndom_no = (int)(Math.random());
                       }
               }


        }
}
