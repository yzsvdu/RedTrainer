package f;

import java.util.NoSuchElementException;

public final class rm0 extends oc {
  public fQ WX;
  
  public rm0(Nn paramNn) {
    super(paramNn);
    this.WX = paramNn.CO;
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
  
  public final yO VJ() {
    if (this.jy) {
      if (this.IO) {
        int i = this.yk;
        this.zf.Lb = this.WX.get(i);
        this.zf.mm = this.tI.pd0(this.zf.Lb);
        this.yk = i;
        if ((i = this.yk + 1) < this.tI.Cx0) {
          i = 1;
        } else {
          i = 0;
        } 
        this.jy = i;
        return this.zf;
      } 
      throw new JU("#iterator() cannot be used nested.");
    } 
    throw new NoSuchElementException();
  }
  
  public final void remove() {
    if (this.ZN >= 0) {
      this.tI.HH(this.zf.Lb);
      this.yk--;
      this.ZN = -1;
      return;
    } 
    throw new IllegalStateException("next must be called before remove.");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rm0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */