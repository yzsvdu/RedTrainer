package f;

import java.nio.ByteBuffer;

public abstract class NI0 {
  public short V10;
  
  public byte jJ0;
  
  public byte Xj0;
  
  public boolean f30;
  
  public short VU;
  
  public short Lz;
  
  public short AZ;
  
  public short Ix;
  
  public short qF;
  
  public short ls0;
  
  public short wR = 1;
  
  public short f90 = 1;
  
  public static byte h00(byte paramByte) {
    switch (paramByte) {
      default:
        return -1;
      case 4:
        return 2;
      case 3:
        return 3;
      case 2:
        return 1;
      case 1:
        break;
    } 
    return 0;
  }
  
  public NI0(ByteBuffer paramByteBuffer) {
    paramByteBuffer.position();
  }
  
  public final boolean Au0() {
    byte b;
    if ((b = this.Xj0) == 1 || b == 35)
      return true; 
  }
  
  public short Sn0() {
    return this.VU;
  }
  
  public void Vy0(short paramShort) {
    this.VU = paramShort;
  }
  
  public short Qq0() {
    return this.Lz;
  }
  
  public void Jz0(short paramShort) {
    this.Lz = paramShort;
  }
  
  public float kS() {
    return this.AZ;
  }
  
  public void FN(float paramFloat) {
    this.AZ = (short)(int)paramFloat;
  }
  
  public final void tW() {
    this.Xj0 = 3;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NI0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */