package day16.Test11;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public class CommonThreadFactory implements ThreadFactory {
    //线程池的个数
    private static final AtomicInteger poolNumber=new AtomicInteger(1);
    private final AtomicInteger threadNumber=new AtomicInteger(1);

    private String namePrefix;
    private String name;

    public CommonThreadFactory() {
        this.namePrefix=poolNumber.getAndIncrement()+"";
    }

    public CommonThreadFactory(String name) {
        this();
        this.name=name;
    }
    

    @Override
    public Thread newThread(Runnable r) {
        Thread thread=new Thread(r,(this.name==null||this.name=="")?this.namePrefix+threadNumber:this.name+threadNumber.getAndIncrement());
        return thread;
    }
}
