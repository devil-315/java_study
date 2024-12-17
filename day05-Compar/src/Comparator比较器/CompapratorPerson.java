package Comparator比较器;

import java.util.Comparator;

/**
 * ClassName：CompapratorPerson
 *
 * @author: Devil
 * @Date: 2024/8/12
 * @Description:
 * @version: 1.0
 */
public class CompapratorPerson implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getAge()-o2.getAge();
    }
}
