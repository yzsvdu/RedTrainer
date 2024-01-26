package f;

import java.nio.ByteBuffer;

public final class QQ extends lF0 {
  public QQ(short paramShort, T7 paramT7) {
    this.sa0 = paramShort;
    int i = byteBuffer.getInt();
    this.X7 = byteBuffer.getShort();
    ByteBuffer byteBuffer;
    short s1 = (byteBuffer = paramT7.l2()).getShort();
    this.U1 = new int[this.X7][s1];
    short s2;
    for (s1 = 0; s1 < (s2 = this.cB0); s1++) {
      for (s2 = 0; s2 < this.X7; s2++)
        this.U1[s2][s1] = byteBuffer.getInt(); 
    } 
    if (i == 1) {
      this.H80 = new int[this.X7][s2];
      for (i = 0; i < this.cB0; i++) {
        for (s1 = 0; s1 < this.X7; s1++)
          this.H80[s1][i] = byteBuffer.getInt(); 
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/QQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */