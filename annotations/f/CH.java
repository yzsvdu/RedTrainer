package f;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class CH {
  public final ThreadPoolExecutor iu;
  
  public final f7 Ap0;
  
  public final f7 T7;
  
  public final f7 Ep0;
  
  public CH() {
    this(2147483647);
  }
  
  public CH(int paramInt) {
    COm7 cOm7;
    boolean bool;
    int i;
    LinkedBlockingQueue<Runnable> linkedBlockingQueue;
    if (paramInt == Integer.MAX_VALUE) {
      bool = true;
    } else {
      bool = false;
    } 
    ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
    if (bool) {
      i = 0;
    } else {
      i = paramInt;
    } 
    long l = 60L;
    TimeUnit timeUnit = TimeUnit.SECONDS;
    if (bool) {
      SynchronousQueue synchronousQueue;
      this();
    } else {
      this();
    } 
    this();
    this(i, paramInt, l, timeUnit, linkedBlockingQueue, this);
    this.iu = threadPoolExecutor;
    threadPoolExecutor.allowCoreThreadTimeOut(bool ^ true);
    this.Ap0 = new f7();
    this.T7 = new f7();
    this.Ep0 = new f7();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CH.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */