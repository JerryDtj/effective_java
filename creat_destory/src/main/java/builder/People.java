package builder;

/**
 * build模式构建
 *  既保证了线程安全，而且避免了嵌套构造方法。
 *  但是代码量较多。
 *
 * @author Jerry
 * @Date 2019/8/23 9:08 上午
 */
public class People {
    String name;
    int sex;
    int height;
    int weight;
    String idCard;
    String hobby;

    public People(Builder builder) {
        this.name = builder.name;
        this.sex = builder.sex;
        this.height = builder.height;
        this.weight = builder.weight;
        this.idCard = builder.idCard;
        this.hobby = builder.hobby;
    }

    public static class Builder{
        private String name;
        private int sex;
        //赋予默认值
        private int height = 0;
        private int weight = 0;
        private String idCard = "";
        private String hobby = "吃吃吃";
        public Builder(String name, int sex){
            this.name = name;
            this.sex = sex;
        }

        public Builder setIdcard(String idCard){
            this.idCard = idCard;
            return this;
        }

        public Builder setHobby(String hobby){
            this.hobby = hobby;
            return this;
        }
        public Builder setHeight(int height){
            this.height = height;
            return this;
        }
        public Builder setWeight(int weight){
            this.weight = weight;
            return this;
        }
        public People buildPeople(){
            return new People(this);
        }
    }

    public static void main(String[] args) {
        People people = new People.Builder("张三",0).setIdcard("41300119991213000X").buildPeople();
    }
}
