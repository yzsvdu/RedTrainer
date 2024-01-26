package f;

import java.util.ArrayList;
import java.util.Iterator;

public final class M9 extends iz0 {
  public Ip lq0;
  
  public M9(cd0 paramcd0, ArrayList paramArrayList) {
    super(paramcd0);
    dQ dQ;
    Q20 q20;
    Xu("wardrobe-picker");
    g0 g0 = (this.lq0 = new Ip()).mE0();
    cr0 cr0 = this.lq0.d7();
    this();
    byte b1 = 0;
    byte b2 = 5;
    Iterator<wc> iterator = paramArrayList.iterator();
    while (iterator.hasNext()) {
      A7 a7;
      wc wc;
      if ((wc = iterator.next()).bk0() == Vp0.CR)
        b2 = 3; 
      b1++;
      if (b1 % b2 == 0) {
        this();
        g0.Ya(q20);
        cr0.Ya(q20);
      } 
      this(paramcd0, this, wc);
      q20.J8(a7);
    } 
    this.lq0.WN(cr0);
    this.lq0.rK0(g0);
    if (paramArrayList.size() == 0) {
      Xu("wardrobe-picker-empty");
      this(Ml0.OH0(3205));
      (new dQ()).Xu("label");
      cr0.Ya(new dQ());
      g0.Ya(this);
      J8(this.lq0);
    } else {
      J8(new rS(((M9)super).lq0));
      (new rS(((M9)super).lq0)).mM();
    } 
  }
  
  public final void d40() {
    super.d40();
    this.lq0.mM();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/M9.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */