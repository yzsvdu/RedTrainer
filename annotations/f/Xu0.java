package f;

import java.nio.ByteBuffer;

public final class Xu0 {
  public short Z2;
  
  public short Lq;
  
  public short b7;
  
  public short Sz0;
  
  public short aU;
  
  public short Z60;
  
  public short PQ;
  
  public short VE0;
  
  public short n1;
  
  public short PK0;
  
  public short vx0;
  
  public short Q10;
  
  public Xu0(ByteBuffer paramByteBuffer) {
    this.Z2 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.Lq = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.b7 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.Sz0 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.aU = paramByteBuffer.getShort();
    this.Z60 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.PQ = paramByteBuffer.getShort();
    this.VE0 = paramByteBuffer.getShort();
    this.n1 = paramByteBuffer.getShort();
    this.PK0 = paramByteBuffer.getShort();
    this.vx0 = paramByteBuffer.getShort();
    this.Q10 = paramByteBuffer.getShort();
  }
  
  public static float uo0(short paramShort) {
    return -(((paramShort & 0xFFFF) / 65536.0F * 360.0F % 360.0F + 360.0F) % 360.0F);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Xu0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */