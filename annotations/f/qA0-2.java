package f;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class qA0 implements Iterable, Iterator {
  public final eM hy;
  
  public int rm;
  
  public boolean F0 = true;
  
  public qA0(eM parameM) {
    this.hy = parameM;
  }
  
  public final boolean hasNext() {
    if (this.F0)
      return (this.rm < this.hy.uJ0); 
    throw new JU("#iterator() cannot be used nested.");
  }
  
  public final Iterator iterator() {
    return this;
  }
  
  public final Object next() {
    int i;
    eM eM1;
    if ((i = this.rm) < (eM1 = this.hy).uJ0) {
      if (this.F0) {
        this.rm = i + 1;
        return eM1.WD0[i];
      } 
      throw new JU("#iterator() cannot be used nested.");
    } 
    throw new NoSuchElementException(String.valueOf(this.rm));
  }
  
  public final void remove() {
    int i = this.rm - 1;
    this.hy.SB(i);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qA0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */