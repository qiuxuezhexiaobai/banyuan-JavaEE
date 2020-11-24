package club.banyuan.phoy.game;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/11/23 3:48 下午
 */
public class Sword  extends  Weapon {
    //刘备
    private int attack = 30;

    public Sword() {
        super("雌雄双股剑");
    }

    @Override
    public void attack(Fighter fighter1, Fighter fighter2) {
        int att = fighter1.attack();
        int total = att + attack;
        int hp = fighter2.getHp();
        fighter2.setHp(hp - total);

        System.out
                .println(fighter1.getName() + "向" + fighter2.getName() + "发起了攻击,造成的伤害为:" + total + ","
                        + fighter2.getName() + "还剩下的血量为:" + fighter2.getHp());
    }
}
