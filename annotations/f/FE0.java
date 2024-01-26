package f;

import java.nio.ByteBuffer;

public final class FE0 {
  public eA0[] WE0;
  
  public FE0(ig paramig) {
    this.WE0 = new eA0[paramig.size()];
    for (byte b = 0; b < this.WE0.length; b++) {
      eA0 eA01;
      ByteBuffer byteBuffer = paramig.Em0(b).l2();
      this(b, byteBuffer);
      this.WE0[b] = eA01;
    } 
  }
  
  public final eA0[] K0() {
    return this.WE0;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/FE0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */