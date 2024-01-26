package f;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class ki0 implements Iterator, Iterable {
  public final Object[] zD;
  
  public int ij;
  
  public boolean pM = true;
  
  public ki0(Object[] paramArrayOfObject) {
    this.zD = paramArrayOfObject;
  }
  
  public final boolean hasNext() {
    if (this.pM)
      return (this.ij < this.zD.length); 
    throw new JU("#iterator() cannot be used nested.");
  }
  
  public final Object next() {
    int i;
    Object[] arrayOfObject;
    if ((i = this.ij) < (arrayOfObject = this.zD).length) {
      if (this.pM) {
        this.ij = i + 1;
        return arrayOfObject[i];
      } 
      throw new JU("#iterator() cannot be used nested.");
    } 
    throw new NoSuchElementException(String.valueOf(this.ij));
  }
  
  public final void remove() {
    throw new JU("Remove not allowed.");
  }
  
  public final Iterator iterator() {
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ki0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */