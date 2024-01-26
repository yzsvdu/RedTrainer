package f;

import java.util.Iterator;
import java.util.LinkedList;

public final class BL implements tx {
  public final LinkedList JK0;
  
  public BL() {
    LinkedList linkedList;
    this();
    this.JK0 = this;
  }
  
  public final void cq0(BI paramBI) {
    Iterator iterator = this.JK0.iterator();
    while (hasNext())
      ((tx)next()).cq0(paramBI); 
  }
  
  public final void DQ(ah0 paramah0) {
    Iterator iterator = this.JK0.iterator();
    while (hasNext())
      ((tx)next()).DQ(paramah0); 
  }
  
  public final boolean KL(BI paramBI, int paramInt) {
    Iterator iterator = this.JK0.iterator();
    while (hasNext()) {
      if (((tx)next()).KL(paramBI, paramInt))
        return true; 
    } 
    return false;
  }
  
  public final boolean F0(BI paramBI, int paramInt) {
    Iterator iterator = this.JK0.iterator();
    while (hasNext()) {
      if (((tx)next()).F0(paramBI, paramInt))
        return true; 
    } 
    return false;
  }
  
  public final boolean CoM2(BI paramBI, int paramInt, float paramFloat) {
    Iterator iterator = this.JK0.iterator();
    while (hasNext()) {
      if (((tx)next()).CoM2(paramBI, paramInt, paramFloat))
        return true; 
    } 
    return false;
  }
  
  public final void ty(UV paramUV) {
    this.JK0.add(paramUV);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/BL.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */