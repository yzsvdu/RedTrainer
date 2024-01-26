package f;

import java.util.NoSuchElementException;

public final class CM extends Q70 {
  public fQ JJ;
  
  public CM(Nn paramNn) {
    super(paramNn);
    this.JJ = paramNn.CO;
  }
  
  public final void kk0() {
    boolean bool;
    this.ZN = -1;
    this.yk = 0;
    if (this.tI.Cx0 > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    this.jy = bool;
  }
  
  public final Object next() {
    if (this.jy) {
      if (this.IO) {
        Object object = this.JJ.get(this.yk);
        int i = this.yk;
        this.yk = i;
        if (++i < this.tI.Cx0) {
          i = 1;
        } else {
          i = 0;
        } 
        this.jy = i;
        return object;
      } 
      throw new JU("#iterator() cannot be used nested.");
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    int i;
    if ((i = this.ZN) >= 0) {
      ((Nn)this.tI).NL0(i);
      this.yk = this.ZN;
      this.ZN = -1;
      return;
    } 
    throw new IllegalStateException("next must be called before remove.");
  }
  
  public final fQ vm0(fQ paramfQ) {
    fQ fQ1 = this.JJ;
    int i = this.yk;
    paramfQ.wV(this, i, this.Z8 - i);
    this.yk = this.JJ.Z8;
    this.jy = false;
    return paramfQ;
  }
  
  public final fQ sk0() {
    return vm0(new fQ(true, this.JJ.Z8 - this.yk));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/CM.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */