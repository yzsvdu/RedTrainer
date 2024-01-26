package f;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class g3 implements Iterable, Iterator {
  public final eM He0;
  
  public int yp0;
  
  public boolean E90 = true;
  
  public g3(eM parameM) {
    this.He0 = parameM;
  }
  
  public final boolean hasNext() {
    if (this.E90)
      return (this.yp0 < this.He0.uJ0); 
    throw new JU("#iterator() cannot be used nested.");
  }
  
  public final Iterator iterator() {
    return this;
  }
  
  public final Object next() {
    int i;
    eM eM1;
    if ((i = this.yp0) < (eM1 = this.He0).uJ0) {
      if (this.E90) {
        this.yp0 = i + 1;
        return eM1.Jo[i];
      } 
      throw new JU("#iterator() cannot be used nested.");
    } 
    throw new NoSuchElementException(String.valueOf(this.yp0));
  }
  
  public final void remove() {
    int i = this.yp0 - 1;
    this.He0.SB(i);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/g3.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */