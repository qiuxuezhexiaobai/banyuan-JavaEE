package club.banyuan.phoy.game;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/11/23 4:00 下午
 */
public class TestGane {

    public static void main(String[] args) {
        SpearWeapon spearWeapon = new SpearWeapon();
        HalberdWeapon halberdWeapon = new HalberdWeapon();
        Broadsword broadsword = new Broadsword();
        Sword sword = new Sword();

        Fighter fighter1 = new Fighter("张飞", spearWeapon);
        Fighter fighter2 = new Fighter("吕布", halberdWeapon);
        Fighter fighter3 = new Fighter("关羽", broadsword);
        Fighter fighter4 = new Fighter("刘备", sword);


        while (true) {
            int index = (int) (Math.random() * 3);
            if (fighter2.getHp() < 0) {
                System.out.println("刘备道：吕布很强，但胜利属于正义方！");
                System.out.println("关羽道：吕布这厮也不过如此！");
                System.out.println("张飞道：哥哥说的对！");
                break;
            }
            if(fighter1.getHp()<0 && fighter3.getHp()<0 && fighter4.getHp()<0){
                System.out.println("吕布获得胜利，大喊道：还有谁！");
                 break;
            }
            if (index == 0) {
                if(fighter1.getHp()<0){
                    System.out.println("张飞死亡");
                    break;
                }
                fighter1.attack(fighter2);
                fighter2.attack(fighter1);
            } else if (index == 1) {
                if(fighter3.getHp()<0){
                    System.out.println("关羽死亡");
                    continue;
                }
                fighter3.attack(fighter2);
                fighter2.attack(fighter3);
            } else {
                if(fighter4.getHp()<0){
                    System.out.println("刘备死亡");
                    continue;
                }
                fighter4.attack(fighter2);
                fighter2.attack(fighter4);
            }
        }


/*
        while (fighter1.getHp() > 0
                && fighter2.getHp() > 0
                && fighter3.getHp() > 0
                && fighter4.getHp()>0) {
            fighter1.attack(fighter2);
            fighter2.attack(fighter1);
            fighter3.attack(fighter2);
            fighter4.attack(fighter2);
        }


        if (fighter1.getHp() < 0) {

        } else {

        }*/


    }

}
