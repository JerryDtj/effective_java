package consturctor;

/**
 *  get/Set模式
 *  这种模式在避免类重叠构造器时多种构造方法嵌套调用的缺陷
 *  但是带来来另外的两种隐患：
 *      多线程环境下，javabean可能处于不一致的状态、无法让该javabean做成不可变的。
 *
 * @author Jerry
 * @Date 2019/8/23 8:50 上午
 */
public class Persion2 {
    String name;
    int sex;
    int height;
    int weight;
    String idCard;
    String hobby;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    public static void main(String[] args) {
        Persion2 persion = new Persion2();
        persion.setHeight(160);
        persion.setWeight(1600);
        persion.setHobby("吃吃吃");
        persion.setName("李四");
        persion.setSex(1);
    }
}
