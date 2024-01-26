package f;

import java.util.Iterator;

public final class HN implements Iterable {
  public final Object[] fG0;
  
  public ki0 UC0;
  
  public ki0 synchronized;
  
  public HN(Object[] paramArrayOfObject) {
    this.fG0 = paramArrayOfObject;
  }
  
  public final Iterator iterator() {
    if (this.UC0 == null) {
      ki0 ki02;
      Object[] arrayOfObject;
      this(arrayOfObject = this.fG0);
      this.UC0 = ki02;
      this(arrayOfObject);
      this.synchronized = ki02;
    } 
    ki0 ki01;
    if (!(ki01 = this.UC0).pM) {
      ki01.ij = 0;
      ki01.pM = true;
      this.synchronized.pM = false;
      return ki01;
    } 
    this.synchronized.ij = 0;
    this.synchronized.pM = true;
    ki01.pM = false;
    return this.synchronized;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HN.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */