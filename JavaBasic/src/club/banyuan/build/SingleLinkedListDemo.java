package JavaBasic.src.club.banyuan.build;

/**
 * @author nijing
 * @date 2020/11/10 7:35 下午
 * @override 1.0
 */
public class SingleLinkedListDemo {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1, "宋江", "及时雨");
        HeroNode hero2 = new HeroNode(2, "卢俊义", "玉麒麟");
        HeroNode hero3 = new HeroNode(3, "吴用", "智多星");
        HeroNode hero4 = new HeroNode(4, "公孙胜", "入云龙");

        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(hero1);
        singleLinkedList.add(hero2);
        singleLinkedList.add(hero3);
        singleLinkedList.add(hero4);
        singleLinkedList.list();
        System.out.println("\n\n\n");

        hero2 = new HeroNode(2,"小卢","白玉麒麟");
        singleLinkedList.update(hero2);
        singleLinkedList.list();
        System.out.println("\n\n\n");

        singleLinkedList.delete(2);
        singleLinkedList.list();
        System.out.println("\n\n\n");

        singleLinkedList.insert(hero2);
        singleLinkedList.list();
    }
}

class HeroNode {
    public int no;
    public String name;
    public String nickName;
    public HeroNode next; //指向下一个节点

    public HeroNode(int no, String name, String nickName) {
        this.no = no;
        this.name = name;
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "HeroNode{" +
                "no=" + no +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                '}';
    }
}

//定义SingleLinkedList, 来管理HeroNode
class SingleLinkedList {
    //先定义一个头节点，头节点不要动, 不存放具体数据
    private HeroNode head = new HeroNode(0, "", "");

    //添加节点到单向链表，添加到链表最后，最后节点的next指向新的节点
    public void add(HeroNode heroNode) {
        //因为head节点不能动，因此需要一个辅助节点temp
        HeroNode temp = head;
        while (true) {
            //找到链表最后
            if (temp.next == null) {
                break;
            }
            //如果没有找到，temp后移
            temp = temp.next;
        }
        //当退出循环时，temp指向链表最后.
        temp.next = heroNode;
    }

    //通过遍历，显示链表
    public void list() {
        //先判断链表是否为空
        if(head.next == null){
            System.out.println("链表为空");
            return;
        }
        HeroNode temp = head.next;
        while (true){
            if(temp == null){
                break;
            }
            System.out.println(temp); //逐个打印node
            temp = temp.next;
        }
    }

    //插入节点,根据no,插入指定位置
    public void insert(HeroNode heroNode){
        HeroNode temp = head;
        boolean flag = false;
        while(true){
            if (temp.next == null){
                break;
            }
            if(heroNode.no < temp.next.no){
                break;
            }else if(heroNode.no == temp.next.no){
                //说明添加的节点已经存在
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
           System.out.println("节点已经存在，不能添加");
        }else{
            heroNode.next = temp.next;
            temp.next = heroNode;
        }
    }

    //根据节点no,来修改链表中的节点信息
    public void update(HeroNode heroNode){
        HeroNode temp = head.next;
        if(temp == null){
            System.out.println("链表为空");
            return;
        }
        boolean flag = false;
        while(true){
            if(temp == null){
                break;
            }
            if(temp.no == heroNode.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.name = heroNode.name;
            temp.nickName = heroNode.nickName;
        }else{
            System.out.println("该节点不存在");
        }
    }

    //删除指定no的节点
    public void delete(int no){
        HeroNode temp = head.next;
        if(temp == null){
            System.out.println("该链表为空");
            return;
        }
        boolean flag = false;
        while (true){
            if(temp.next == null){
                break;
            }
            if(no == temp.next.no){
                flag = true;
                break;
            }
            temp = temp.next;
        }
        if(flag){
            temp.next = temp.next.next;
        }else{
            System.out.println("该节点不存在");
        }
    }
}
