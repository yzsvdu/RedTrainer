package f;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

public final class a00 implements ThreadFactory {
  public int V90 = 5;
  
  public String Lm0 = "ThreadPool";
  
  public AtomicInteger iH0 = new AtomicInteger(1);
  
  public ThreadGroup P3 = new ThreadGroup(this.Lm0);
  
  public final Thread newThread(Runnable paramRunnable) {
    (new Thread(this.P3, paramRunnable)).setName(this.Lm0 + "-" + this.iH0.getAndIncrement());
    (new Thread(this.P3, paramRunnable)).setPriority(this.V90);
    return new Thread(this.P3, paramRunnable);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/a00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */