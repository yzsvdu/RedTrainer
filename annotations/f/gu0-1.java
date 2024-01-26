package f;

import java.nio.ByteBuffer;

public final class gu0 {
  public int oF0;
  
  public short MJ;
  
  public Ze0[][] t30;
  
  public gu0(LX paramLX, int paramInt, short paramShort) {
    this.oF0 = paramInt;
    this.MJ = paramShort;
    this.t30 = new Ze0[paramShort][];
  }
  
  public final void ei() {
    ByteBuffer byteBuffer2 = this.GF.no0.aF0();
    ByteBuffer byteBuffer3 = this.GF.no0.aF0();
    ByteBuffer byteBuffer1;
    (byteBuffer1 = this.GF.no0.aF0()).position(this.oF0 - this.GF.no0.h90);
    for (byte b = 0; b < this.MJ; b++) {
      int i = byteBuffer1.getInt();
      this.t30[b] = new Ze0[i];
      byteBuffer2.position(byteBuffer1.getInt() - this.GF.no0.h90);
      for (byte b1 = 0; b1 < i; b1++) {
        Ze0 ze0;
        int j = byteBuffer2.getInt();
        int k = byteBuffer2.getInt();
        this(this.GF, j, k, byteBuffer3);
        this.t30[b][b1] = ze0;
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gu0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */