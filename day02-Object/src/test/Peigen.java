package test;

/**
 * ClassName：Peigen
 *
 * @author: Devil
 * @Date: 2024/8/1
 * @Description:
 * @version: 1.0
 */
public class Peigen extends Pizza{
   private int gram;

    public Peigen() {
    }

    public Peigen(String name, double prize, double size, int gram) {
        super(name, prize, size);
        this.gram = gram;
    }

    public int getGram() {
        return gram;
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    @Override
    public void show() {
        System.out.println("名称：" + super.getName() +"\n价格："+super.getPrize()+"\n大小：" + super.getSize()+"\n培根克数："+this.gram);

    }
}
