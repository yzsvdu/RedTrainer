package f;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class oc extends xD {
  public yO zf;
  
  public oc(f7 paramf7) {
    super(paramf7);
    yO yO1;
    this();
    this.zf = this;
  }
  
  public yO VJ() {
    if (this.jy) {
      if (this.IO) {
        f7 f7;
        Object[] arrayOfObject = (f7 = this.tI).g00;
        int i;
        this.zf.Lb = arrayOfObject[i = this.yk];
        this.zf.mm = f7.RG[i];
        this.ZN = i;
        wn0();
        return this.zf;
      } 
      throw new JU("#iterator() cannot be used nested.");
    } 
    throw new NoSuchElementException();
  }
  
  public final boolean hasNext() {
    if (this.IO)
      return this.jy; 
    throw new JU("#iterator() cannot be used nested.");
  }
  
  public final Iterator iterator() {
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oc.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */