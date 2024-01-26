package f;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.LinkedBlockingQueue;

public final class Yv implements T8 {
  public volatile boolean mO;
  
  public final ConcurrentHashMap li0;
  
  public final LinkedBlockingQueue db0;
  
  public Yv() {
    ConcurrentHashMap<Object, Object> concurrentHashMap;
    LinkedBlockingQueue linkedBlockingQueue;
    this.mO = false;
    this();
    this.li0 = this;
    this();
    this.db0 = this;
  }
  
  public final synchronized ik getLogger(String paramString) {
    sl0 sl0;
    if ((sl0 = (sl0)this.li0.get(paramString)) == null) {
      LinkedBlockingQueue linkedBlockingQueue = this.db0;
      this(paramString, this, this.mO);
      this.li0.put(paramString, sl0);
    } 
    return sl0;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Yv.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */