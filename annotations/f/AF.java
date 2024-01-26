package f;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public final class AF implements iq0 {
  public final ExecutorService qj;
  
  public AF(int paramInt) {
    this(paramInt, "AsynchExecutor-Thread");
  }
  
  public AF(int paramInt, String paramString) {
    this.qj = Executors.newFixedThreadPool(paramInt, new KW(paramString));
  }
  
  public final void dispose() {
    this.qj.shutdown();
    try {
      this.qj.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
      return;
    } catch (InterruptedException interruptedException) {
      throw new JU("Couldn't shutdown loading thread", this);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AF.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */