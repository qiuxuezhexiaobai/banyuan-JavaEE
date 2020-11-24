package club.banyuan.phoy.game;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/11/23 3:49 下午
 */
public class Broadsword  extends  Weapon {
    //关羽
    private int attack = 60;

    public Broadsword() {
        super("青龙偃月刀");
    }
    @Override
    public void attack(Fighter fighter1, Fighter fighter2) {
        int att = fighter1.attack();
        //武器的攻击
        int hw = (int) (attack * 2);
        int total = att + attack + hw;
        int hp = fighter2.getHp();
        fighter2.setHp(hp-total);

        System.out
                .println(fighter1.getName() + "向" + fighter2.getName() + "发起了攻击,造成的伤害为:" + total + ","
                        + fighter2.getName() + "还剩下的血量为:" + fighter2.getHp());
    }
}
