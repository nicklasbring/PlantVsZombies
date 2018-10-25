public class Zombie {

    private int hp = 100;


    public Zombie(){
    }


    public void zombieAttack(Plant a){
        int attack = (int)(Math.random() * 6) +10;
        a.takeDamage(attack);

        System.out.println("The zombie attacks");
        System.out.println("The zombie hits " + attack + " and the plant drops to " + a.getHp() + " hp");
        System.out.println();
    }


    public void takeDamage(int a){
        hp -= a;
    }


    public int getHp() {
        return hp;
    }
}


