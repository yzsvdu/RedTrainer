package f;

import java.util.Iterator;

public final class cD0 implements Iterable {
  public final fQ hm0;
  
  public final boolean TG0;
  
  public Hc0 mn0;
  
  public Hc0 zb;
  
  public cD0(fQ paramfQ) {
    this(paramfQ, true);
  }
  
  public cD0(fQ paramfQ, boolean paramBoolean) {
    this.hm0 = paramfQ;
    this.TG0 = paramBoolean;
  }
  
  public final Hc0 aN() {
    if (this.mn0 == null) {
      Hc0 hc01;
      fQ fQ1 = this.hm0;
      this(fQ1, this.TG0);
      this.mn0 = hc01;
      fQ1 = this.hm0;
      this(fQ1, this.TG0);
      this.zb = hc01;
    } 
    Hc0 hc0;
    if (!(hc0 = this.mn0).dE0) {
      hc0.po = 0;
      hc0.dE0 = true;
      this.zb.dE0 = false;
      return hc0;
    } 
    this.zb.po = 0;
    this.zb.dE0 = true;
    hc0.dE0 = false;
    return this.zb;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cD0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */