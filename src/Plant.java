public class Plant {

    private int hp = 100;


    public Plant(){
    }


    public void plantAttack(Zombie a){
        int attack = (int)(Math.random() * 6) +10;
        a.takeDamage(attack);
        System.out.println("The plant attacks");
        System.out.println("The plant hits " + attack + " and the zombie drops to " + a.getHp() + " hp");
        System.out.println();

    }


    public void takeDamage(int a){
        hp -= a;
    }


    public int getHp() {
        return hp;
    }
}


