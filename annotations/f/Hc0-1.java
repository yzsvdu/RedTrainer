package f;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class Hc0 implements Iterator, Iterable {
  public final fQ yw;
  
  public final boolean E80;
  
  public int po;
  
  public boolean dE0 = true;
  
  public Hc0(fQ paramfQ) {
    this(paramfQ, true);
  }
  
  public Hc0(fQ paramfQ, boolean paramBoolean) {
    this.yw = paramfQ;
    this.E80 = paramBoolean;
  }
  
  public final boolean hasNext() {
    if (this.dE0)
      return (this.po < this.yw.Z8); 
    throw new JU("#iterator() cannot be used nested.");
  }
  
  public final Object next() {
    int i;
    fQ fQ1;
    if ((i = this.po) < (fQ1 = this.yw).Z8) {
      if (this.dE0) {
        this.po = i + 1;
        return fQ1.Uq0[i];
      } 
      throw new JU("#iterator() cannot be used nested.");
    } 
    throw new NoSuchElementException(String.valueOf(this.po));
  }
  
  public final void remove() {
    if (this.E80) {
      int i = this.po - 1;
      this.yw.Hc(i);
      return;
    } 
    throw new JU("Remove not allowed.");
  }
  
  public final Iterator iterator() {
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hc0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */