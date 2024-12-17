package Test6;

/**
 * ClassName：RentalAgency
 *
 * @author: Devil
 * @Date: 2024/8/18
 * @Description:
 * @version: 1.0
 */
public class RentalAgency {
    public double rent (Vehicle car,int day){
        return car.getRentalFee()*day;
    }
}
