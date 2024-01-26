package f;

import java.nio.ByteBuffer;

public final class Di0 extends HV {
  public Di0(T7 paramT7) {
    byte b1 = paramT7.Sh0().bO();
    ByteBuffer byteBuffer;
    if ((byteBuffer = paramT7.l2()).getInt() < 1)
      return; 
    byte b2 = byteBuffer.get();
    byte b3 = byteBuffer.get();
    byte b4 = byteBuffer.get();
    byte b5 = byteBuffer.get();
    this.oj = new a40[b2];
    short s;
    for (s = 0; s < b2; s = (short)(s + 1))
      this.oj[s] = new j50(b1, paramT7.vA0, s, byteBuffer); 
    this.KH = new cm0[b3];
    for (b2 = 0; b2 < b3; b2++) {
      yb yb;
      this(b1, byteBuffer, paramT7.vA0);
      this.KH[b2] = yb;
    } 
    this.et = new NI0[b4];
    b2 = 0;
    while (b2 < b4) {
      this.et[b2] = new J90(b1, paramT7.vA0, b2, byteBuffer);
      short s1 = (short)(b2 + 1);
    } 
    this.xx0 = new C2[b5];
    byte b = 0;
    while (b < b5) {
      Nm nm;
      this(byteBuffer);
      this.xx0[b] = nm;
      short s1 = (short)(b + 1);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Di0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */