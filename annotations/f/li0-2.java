package f;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class li0 implements vt0 {
  public final tw C70;
  
  public final HashMap Iu0;
  
  public final HashMap M30;
  
  public final ArrayList Kv0;
  
  public boolean pY;
  
  public li0(tw paramtw) {
    HashMap<Object, Object> hashMap;
    ArrayList arrayList;
    this.C70 = paramtw;
    this();
    this.Iu0 = this;
    this();
    this.M30 = this;
    this();
    this.Kv0 = this;
    this.pY = true;
  }
  
  public final void destroy() {
    try {
      Iterator<nK> iterator = this.Kv0.iterator();
      while (iterator.hasNext())
        ((nK)iterator.next()).destroy(); 
      if (!(iterator = this.M30.values().iterator()).hasNext())
        return; 
      bo0.Av(iterator.next());
      throw null;
    } finally {
      this.Iu0.clear();
      this.M30.clear();
      this.Kv0.clear();
      this.pY = false;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/li0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */