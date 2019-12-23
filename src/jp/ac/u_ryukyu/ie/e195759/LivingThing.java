package jp.ac.u_ryukyu.ie.e195759;

public class LivingThing {
    String name;
    int hitPoint;
    int attack;
    boolean dead;

    boolean isDead(){
        return dead;
    }

    void attack(LivingThing opponent){
        if(!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
            opponent.wounded(damage);
        }
    }
    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint < 0 ) {
            dead = true;
            System.out.printf("%sは道半ばで力尽きてしまった。\n", name);
        }
    }

    String getName(){
        return name;
    }
}


