package f;

import java.util.concurrent.ThreadFactory;

public final class KW implements ThreadFactory {
  public KW(String paramString) {}
  
  public final Thread newThread(Runnable paramRunnable) {
    (new Thread(paramRunnable, this.S9)).setDaemon(true);
    return new Thread(paramRunnable, this.S9);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/KW.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */