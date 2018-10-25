public class Game {


    public static void startGame() {

        Plant tulip = new Plant();
        Zombie morten = new Zombie();

        int turn = (int) Math.random() * 2;

        while(tulip.getHp() > 0 && morten.getHp() > 0) {
            if (turn % 2 == 0) {
                morten.zombieAttack(tulip);
            }

            else {
                tulip.plantAttack(morten);
            }
            turn++;
        }


        if (morten.getHp() > 0){
            System.out.println("Morten the zombie, is the winner!");
        }


        else{
            System.out.println("Tulip the plant, is the winner!");
        }


    }}









