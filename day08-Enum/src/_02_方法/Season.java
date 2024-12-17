package _02_方法;

/**
 * ClassName：Season
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public enum Season {
    //枚举对象，多个对象之间， 使用 ， 隔开
    SPRING("春","春眠不觉晓"),
    SUMMER("夏","小荷才露尖尖角"),
    AUTUMN("秋","停车坐爱枫林晚"),
    WINTER("冬","风雪压我两三年");

    //对象的属性
    private final String Name;
    private final String Desc;

    Season(String name, String desc) {
        Name = name;
        Desc = desc;
    }

    public String getName() {
        return Name;
    }

    public String getDesc() {
        return Desc;
    }
}
