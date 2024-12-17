package 练习.第一题;

import java.util.*;

/**
 * ClassName：DAO
 *
 * @author: Devil
 * @Date: 2024/8/16
 * @Description:
 * @version: 1.0
 */
public class DAO<T> {
    private Map<String ,T> map =  new HashMap<String ,T>();
    public void save(String id,T entry){
        map.put(id,entry);
    }
    public T get(String id){
        return map.get(id);
    }
    public void update(String id,T entry){
        if(map.containsKey(id)){
            map.put(id,entry);
        }else {
            throw new RuntimeException("数据不存在");
        }
    }
    public List<T> list(){
        Collection<T> values = map.values();
        ArrayList<T> ts = new ArrayList<>(values);
        return ts;
    }
    public void delete (String id){
        map.remove(id);
    }
}
