package f;

import java.nio.ByteBuffer;

public final class TA0 extends By0 {
  public TA0(Wo paramWo, T7 paramT7) {
    ByteBuffer byteBuffer = paramT7.l2();
    int i;
    this.Z6 = (Ws0[])new gb[(i = paramT7.zu0 / 48) + 9];
    short s;
    for (s = 0; s < i; s = (short)(s + 1)) {
      gb gb;
      this(s, paramWo, byteBuffer);
      ((gb[])this.Z6)[s] = gb;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */