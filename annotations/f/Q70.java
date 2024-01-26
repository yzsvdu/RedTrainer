package f;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Q70 extends xD {
  public Q70(f7 paramf7) {
    super(paramf7);
  }
  
  public final boolean hasNext() {
    if (this.IO)
      return this.jy; 
    throw new JU("#iterator() cannot be used nested.");
  }
  
  public Object next() {
    if (this.jy) {
      if (this.IO) {
        this.ZN = i;
        wn0();
        int i;
        return this.tI.g00[i = this.yk];
      } 
      throw new JU("#iterator() cannot be used nested.");
    } 
    throw new NoSuchElementException();
  }
  
  public final Q70 H9() {
    return this;
  }
  
  public fQ sk0() {
    return vm0(new fQ(true, this.tI.Cx0));
  }
  
  public fQ vm0(fQ paramfQ) {
    while (this.jy)
      paramfQ.Com3(next()); 
    return paramfQ;
  }
  
  public final Iterator iterator() {
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Q70.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */