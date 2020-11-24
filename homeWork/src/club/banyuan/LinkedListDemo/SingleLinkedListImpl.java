package club.banyuan.LinkedListDemo;

/**
 * @author nijing
 * @date 2020/11/24 7:36 下午
 * @override 1.0
 */
public class SingleLinkedListImpl implements SingleLinkedList {
    private Node head = new Node(null, null);

    /**
     * 更新指定下标位置的元素
     *
     * @param index   替换的位置
     * @param element 替换后的元素
     * @return 被替换掉的元素
     */
    @Override
    public Object set(int index, Object element) {
        Node temp = head;
        if (temp == null){
            return  null;
        }
        Object oj = null;
        int key = 0;
        while (true) {
            if (temp.nextNode == null) {
                break;
            }
            if (key == index - 1) {
                oj = temp.nextNode;
                temp.nextNode = new Node(temp.nextNode.nextNode, element);
                return oj;
            }
            temp = temp.nextNode;
            key++;
        }
        return null;
    }

    /**
     * 根据下标获取元素
     *
     * @param index 下标
     * @return
     */
    @Override
    public Object get(int index) {
        Node temp = head;
        if (head == null){
            return null;
        }
        int key = 0;
        while (true) {
            if (temp.nextNode == null) {
                break;
            }
            if (key == index) {
                return temp.value;
            }
            temp = temp.nextNode;
            key++;
        }
        return null;
    }

    /**
     * 清空集合中的所有元素
     */
    @Override
    public void clear() {
        Node temp = head;
        head.nextNode = null;
    }

    /**
     * 删除指定位置的元素
     *
     * @param index
     * @return 返回被删除掉的元素的引用，如果传入index不合法，返回null
     */
    @Override
    public Object remove(int index) {
        if (index > size() - 1) {
            return null;
        }
        Object ob = null;
        Node temp = head;
        int key = 0;
        while (true) {
            if (head.nextNode == null) {
                break;
            }
            if (key == index - 1){
                ob = temp.nextNode;
                temp.nextNode = temp.nextNode.nextNode;
                break;
            }
            temp = temp.nextNode;
            key++;
        }
        return ob;
    }

    /**
     * 查找匹配的元素并删除
     *
     * @param o
     * @return true 被删除的元素存在，并且成功被移除
     */
    @Override
    public boolean remove(Object o) {
        Node temp = head;
        if (head == null){
            return false;
        }
        while (true){
            if(temp.nextNode == null){
                break;
            }
            if(temp.nextNode.value == o){
                temp.nextNode = temp.nextNode.nextNode;
                return true;
            }
            temp = temp.nextNode;
        }
        return false;
    }

    /**
     * @param o 添加元素
     * @return true 添加成功
     */
    @Override
    public boolean add(Object o) {
        try {
            Node temp = head;
            while (true) {
                if (temp.nextNode == null) {
                    break;
                }
                temp = temp.nextNode;
            }
            Node n = new Node(null, o);
            temp.nextNode = n;
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    /**
     * @return true 空集合， false 集合中包含元素
     */
    @Override
    public boolean isEmpty() {
        Node temp = head;
        if (temp.nextNode != null) {
            return true;
        }
        return false;
    }

    /**
     * @return 集合中元素个数
     */
    @Override
    public int size() {
        Node temp = head;
        int key = 0;
        while (true) {
            //key++; 算上头节点
            if (temp.nextNode == null) {
                break;
            }
            temp = temp.nextNode;
            key++; //不算头节点
        }
        return key;
    }
}

class Node {
    Node nextNode;
    Object value;

    public Node() {
    }

    public Node(Node nextNode, Object value) {
        this.nextNode = nextNode;
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}