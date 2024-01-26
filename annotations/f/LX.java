package f;

import java.nio.ByteBuffer;

public final class LX {
  public Do0 no0;
  
  public int R50;
  
  public int fB0;
  
  public int VS;
  
  public int Oq;
  
  public gu0[] KL0;
  
  public fQ Hz;
  
  public LX(Do0 paramDo0, int paramInt) {
    rZ rZ;
    this.Hz = new fQ();
    this.no0 = paramDo0;
    byteBuffer.position(paramInt);
    this.R50 = byteBuffer.getInt();
    this.fB0 = byteBuffer.getInt();
    byteBuffer.getInt();
    this.VS = byteBuffer.getInt();
    this.Oq = paramInt = byteBuffer.getInt();
    this.KL0 = new gu0[paramInt];
    byteBuffer.position(this.R50 - paramDo0.h90);
    byteBuffer.getShort();
    ByteBuffer byteBuffer;
    (byteBuffer = paramDo0.aF0()).position(this.fB0 - paramDo0.h90);
    paramInt = 0;
    this(byteBuffer);
    while (paramInt < 1000 && (new rZ()).W80 != 18) {
      this.Hz.Com3(rZ);
      paramInt++;
    } 
    byteBuffer.position(this.VS - paramDo0.h90);
    for (byte b = 0; b < this.Oq; b++) {
      gu0 gu01;
      int i = byteBuffer.getInt();
      short s = byteBuffer.getShort();
      byteBuffer.getShort();
      this(this, i, s);
      this.KL0[b] = gu01;
      this.KL0[b].ei();
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */