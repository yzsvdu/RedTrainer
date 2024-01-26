package f;

import java.nio.ByteBuffer;

public final class zs0 {
  public short PX;
  
  public short ZF0;
  
  public short Uq0;
  
  public short z5;
  
  public aJ0 tu;
  
  public aJ0 Yi;
  
  public nt0 Hu;
  
  public OA eF0;
  
  public zs0(COn paramCOn, ByteBuffer paramByteBuffer) {
    this.PX = paramByteBuffer.getShort();
    this.ZF0 = paramByteBuffer.getShort();
    this.Uq0 = paramByteBuffer.getShort();
    this.z5 = paramByteBuffer.getShort();
    this.tu = paramCOn.rc()[this.PX];
    this.Yi = paramCOn.rc()[this.ZF0];
    this.eF0 = paramCOn.xI0()[this.Uq0];
    this.Hu = paramCOn.ge0()[this.z5];
  }
  
  public final float tm(float paramFloat1, float paramFloat2) {
    OA oA;
    float f1 = 65536.0F / (oA = this.eF0).V50 * this.Vd / 65536.0F;
    float f2 = 65536.0F / (oA = this.eF0).V50 * this.hZ / 65536.0F;
    float f3 = 4096.0F / (oA = this.eF0).V50;
    return this.Hu.tV * f3 - f1 * paramFloat1 - f1 / 2.0F - f2 * paramFloat2 - f2 / 2.0F;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zs0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */