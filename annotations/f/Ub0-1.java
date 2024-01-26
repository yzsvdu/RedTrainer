package f;

import java.util.NoSuchElementException;

public final class Ub0 extends TA {
  public fQ w30;
  
  public Ub0(Nn paramNn) {
    super(paramNn);
    this.w30 = paramNn.CO;
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
        Object object = this.tI.pd0(this.w30.get(this.yk));
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
  
  public final fQ jL(fQ paramfQ) {
    int i;
    paramfQ.ZY((i = this.w30.Z8) - this.yk);
    Object[] arrayOfObject = this.w30.Uq0;
    for (int j = this.yk; j < i; j++)
      paramfQ.Com3(this.tI.pd0(arrayOfObject[j])); 
    this.ZN = i - 1;
    this.yk = i;
    this.jy = false;
    return paramfQ;
  }
  
  public final fQ nA0() {
    return jL(new fQ(true, this.w30.Z8 - this.yk));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ub0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */