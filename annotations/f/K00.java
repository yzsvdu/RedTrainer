package f;

import java.nio.ByteBuffer;

public final class K00 extends HV {
  public K00(T7 paramT7) {
    byte b = paramT7.Sh0().bO();
    ByteBuffer byteBuffer;
    int j;
    this.oj = new a40[j = (byteBuffer = paramT7.l2()).getInt()];
    short s;
    for (s = 0; s < j; s = (short)(s + 1))
      this.oj[s] = new sb(b, paramT7.vA0, s, byteBuffer); 
    this.KH = new cm0[j = byteBuffer.getInt()];
    for (s = 0; s < j; s++) {
      S7 s7;
      this(b, byteBuffer, paramT7.vA0);
      this.KH[s] = s7;
    } 
    this.et = new NI0[j = byteBuffer.getInt()];
    for (s = 0; s < j; s = (short)(s + 1))
      this.et[s] = new lC(b, paramT7.vA0, s, byteBuffer); 
    int i;
    this.xx0 = new C2[i = byteBuffer.getInt()];
    b = 0;
    while (b < i) {
      YL0 yL0;
      this(byteBuffer);
      this.xx0[b] = yL0;
      short s1 = (short)(b + 1);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/K00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */