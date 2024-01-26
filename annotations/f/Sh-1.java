package f;

import java.nio.ByteBuffer;

public final class Sh extends vO {
  public short MH;
  
  public fQ VD;
  
  public Sh() {
    fQ fQ1;
    this();
    this.VD = this;
  }
  
  public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
    this.MH = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.Vk = paramByteBuffer.getShort() & 0xFFFF;
  }
  
  public final void rf0(ByteBuffer paramByteBuffer) {
    for (byte b = 0; b < this.MH; b++) {
      this();
      gc0.LB = paramByteBuffer.getShort();
      gc0.oz0 = paramByteBuffer.get();
      Gc0 gc0;
      (gc0 = new Gc0()).Wq = paramByteBuffer.get();
      this.VD.Com3(gc0);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Sh.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */