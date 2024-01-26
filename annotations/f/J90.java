package f;

import java.nio.ByteBuffer;

public final class J90 extends NI0 {
  public J90(byte paramByte, short paramShort1, short paramShort2, ByteBuffer paramByteBuffer) {
    super(paramByteBuffer);
    this.V10 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.jJ0 = NI0.h00(paramByteBuffer.get());
    this.Xj0 = paramByteBuffer.get();
    if (paramShort1 == 136 && paramShort2 == 0)
      this.Xj0 = 2; 
    if (paramByteBuffer.getShort() == 1) {
      paramByte = 1;
    } else {
      paramByte = 0;
    } 
    this.f30 = paramByte;
    if (paramByte != 0) {
      this.Ix = paramByteBuffer.getShort();
      this.qF = paramByteBuffer.getShort();
      this.ls0 = paramByteBuffer.getShort();
    } else {
      this.VU = paramByteBuffer.getShort();
      this.AZ = paramByteBuffer.getShort();
      this.Lz = paramByteBuffer.getShort();
    } 
    this.wR = paramByteBuffer.getShort();
    this.f90 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
  }
  
  public final short Sn0() {
    return (short)(this.VU >> 4);
  }
  
  public final void Vy0(short paramShort) {
    this.VU = (short)(paramShort * 16 + 8);
  }
  
  public final short Qq0() {
    return (short)(this.Lz >> 4);
  }
  
  public final void Jz0(short paramShort) {
    this.Lz = (short)(paramShort * 16 + 8);
  }
  
  public final float kS() {
    return this.AZ / 16.0F;
  }
  
  public final void FN(float paramFloat) {
    this.AZ = (short)(int)(paramFloat * 16.0F);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/J90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */