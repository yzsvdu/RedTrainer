package f;

import java.util.HashMap;
import java.util.Iterator;

public final class qN implements Iterable {
  public final int zA0;
  
  public int Pd0;
  
  public int TF0;
  
  public int My;
  
  public final HashMap ul;
  
  public qN(int paramInt) {
    HashMap<Object, Object> hashMap;
    this();
    this.ul = this;
    this.zA0 = paramInt;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof qN))
      return false; 
    this = (qN)paramObject;
    return (this.zA0 == this.zA0);
  }
  
  public final T60 a80(int paramInt) {
    return (T60)this.ul.get(Integer.valueOf(paramInt));
  }
  
  public final int hashCode() {
    return this.zA0;
  }
  
  public final Iterator iterator() {
    return this.ul.values().iterator();
  }
  
  public final int size() {
    return this.ul.size();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */