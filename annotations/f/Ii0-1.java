package f;

import java.util.ArrayList;

public final class Ii0 {
  public final vc0 xR;
  
  public xn0 JZ;
  
  public final ArrayList ot0;
  
  public Ii0(vc0 paramvc0) {
    if (paramvc0 != null) {
      this.xR = paramvc0;
      this.JZ = xn0.LD;
      this.ot0 = new ArrayList();
      return;
    } 
    throw new NullPointerException("type");
  }
  
  public final vc0 VT() {
    return this.xR;
  }
  
  public final xn0 DS() {
    return this.JZ;
  }
  
  public final int xy() {
    return this.ot0.size();
  }
  
  public final OB EI(int paramInt) {
    return this.ot0.get(paramInt);
  }
  
  public final OB[] jo0() {
    return (OB[])this.ot0.toArray((Object[])new OB[0]);
  }
  
  public final void or(float paramFloat, pRn parampRn) {
    int i;
    if ((i = this.ot0.size()) == 0) {
      int j;
      if ((j = paramFloat cmp 0.0F) >= 0) {
        if (j > 0)
          this.ot0.add(new OB(0.0F, parampRn)); 
      } else {
        throw new IllegalArgumentException("first stop must be >= 0.0f");
      } 
    } 
    if (i <= 0 || paramFloat > ((OB)this.ot0.get(i - 1)).Bo) {
      this.ot0.add(new OB(paramFloat, parampRn));
      return;
    } 
    throw new IllegalArgumentException("pos must be monotone increasing");
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ii0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */