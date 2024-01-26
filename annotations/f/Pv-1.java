package f;

import java.util.Iterator;

public final class Pv implements Iterable {
  public final mf0 m9;
  
  public final boolean Ie;
  
  public vA0 O2;
  
  public vA0 kR;
  
  public Pv(mf0 parammf0) {
    this(parammf0, true);
  }
  
  public Pv(mf0 parammf0, boolean paramBoolean) {
    this.m9 = parammf0;
    this.Ie = paramBoolean;
  }
  
  public final Iterator iterator() {
    if (this.O2 == null) {
      vA0 vA02;
      mf0 mf01 = this.m9;
      this(mf01, this.Ie);
      this.O2 = vA02;
      mf01 = this.m9;
      this(mf01, this.Ie);
      this.kR = vA02;
    } 
    vA0 vA01;
    if (!(vA01 = this.O2).Pr0) {
      vA01.Vo = 0;
      vA01.Pr0 = true;
      this.kR.Pr0 = false;
      return vA01;
    } 
    this.kR.Vo = 0;
    this.kR.Pr0 = true;
    vA01.Pr0 = false;
    return this.kR;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pv.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */