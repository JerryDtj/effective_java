package consturctor;

/**
 * 第一种:循环调用构造方法
 * 需要大量的构造方法，没增加一个函数就增加一个构造方法
 *
 * @author Jerry
 * @Date 2019/8/23 8:36 上午
 */
public class Persion {
    String name;
    int sex;
    int height;
    int weight;
    String idCard;
    String hobby;

    public Persion(String name, int sex) {
        this(name,sex,null);
    }

    public Persion(String name, int sex, String idCard) {
        this(name,sex,idCard,0,0);
    }

    public Persion(String name, int sex, String idCard, int height, int weight){
        this(name,sex,idCard,height,weight,null);
    }

    public Persion(String name, int sex, String idCard, int height, int weight, String hobby) {
        this.name = name;
        this.sex = sex;
        this.height = height;
        this.weight = weight;
        this.idCard = idCard;
        this.hobby = hobby;
    }

    public static void main(String[] args) {
        Persion persion = new Persion("张三",0);
    }
}
