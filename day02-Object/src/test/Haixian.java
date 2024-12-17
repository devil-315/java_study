package test;

/**
 * ClassName：Haixian
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Haixian extends Pizza {
   private String peiliao;

    public Haixian() {
    }

    public Haixian(String  name, double prize, double size, String peiliao) {
        super(name, prize, size);
        this.peiliao = peiliao;
    }

    public String getPeiliao() {
        return peiliao;
    }

    public void setPeiliao(String peiliao) {
        this.peiliao = peiliao;
    }

    @Override
    public void show() {
        System.out.println("名称：" + super.getName() +"\n价格："+super.getPrize()+"\n大小：" + super.getSize()+"\n配料："+this.peiliao);

    }
}
