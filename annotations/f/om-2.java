package f;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Map;

public final class om {
  public final ThreadLocal mg;
  
  public om() {
    ThreadLocal threadLocal;
    this();
    this.mg = this;
  }
  
  public final void u60(String paramString1, String paramString2) {
    if (paramString1 == null)
      return; 
    Map<Object, Object> map;
    if ((map = this.mg.get()) == null) {
      super();
      this.mg.set(map);
    } 
    Deque deque;
    if ((deque = (Deque)map.get(paramString1)) == null)
      super(); 
    push((E)paramString2);
    map.put(paramString1, this);
  }
  
  public final String WJ0(String paramString) {
    Map map;
    Deque deque;
    return (paramString == null) ? null : (((map = this.mg.get()) == null) ? null : (((deque = (Deque)get(paramString)) == null) ? null : (String)pop()));
  }
  
  public final ArrayDeque I70(String paramString) {
    Deque deque;
    Map map;
    return (paramString == null) ? null : (((map = this.mg.get()) == null) ? null : (((deque = (Deque)get(paramString)) == null) ? null : new ArrayDeque(this)));
  }
  
  public final void Ve0(String paramString) {
    if (paramString == null)
      return; 
    Map map;
    if ((map = this.mg.get()) == null)
      return; 
    Deque deque;
    if ((deque = (Deque)get(paramString)) == null)
      return; 
    clear();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/om.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */