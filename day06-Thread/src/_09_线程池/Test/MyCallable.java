package _09_线程池.Test;

import java.util.concurrent.Callable;

/**
 * ClassName：MyCallable
 *
 * @author: Devil
 * @Date: 2024/8/14
 * @Description:
 * @version: 1.0
 */
public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return Thread.currentThread().getName();
    }
}
