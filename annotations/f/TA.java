package f;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class TA extends xD {
  public TA(f7 paramf7) {
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
        return this.tI.RG[i = this.yk];
      } 
      throw new JU("#iterator() cannot be used nested.");
    } 
    throw new NoSuchElementException();
  }
  
  public fQ nA0() {
    return jL(new fQ(true, this.tI.Cx0));
  }
  
  public fQ jL(fQ paramfQ) {
    while (this.jy)
      paramfQ.Com3(next()); 
    return paramfQ;
  }
  
  public final Iterator iterator() {
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TA.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */