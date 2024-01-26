package f;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class NT extends Cd0 implements Iterable, Iterator {
  public NT(LF0 paramLF0) {
    super(paramLF0);
  }
  
  public final boolean hasNext() {
    if (this.SJ)
      return this.zb0; 
    throw new JU("#iterator() cannot be used nested.");
  }
  
  public final Object next() {
    if (this.zb0) {
      if (this.SJ) {
        this.pF0 = i;
        hn();
        int i;
        return ((i = this.EY) == -1) ? this.Mp.uv : this.Mp.L8[i];
      } 
      throw new JU("#iterator() cannot be used nested.");
    } 
    throw new NoSuchElementException();
  }
  
  public final Iterator iterator() {
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NT.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */