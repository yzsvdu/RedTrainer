package f;

import java.nio.ByteBuffer;

public final class QA0 extends Xk {
  public byte fD = 0;
  
  public byte y9 = 0;
  
  public XT[] B70;
  
  public short[] tc0 = new short[4];
  
  public QA0(short paramShort, Wo paramWo, ByteBuffer paramByteBuffer) {
    super((byte)2, paramShort);
    if (paramByteBuffer.remaining() < 20) {
      this.B70 = new XT[0];
      return;
    } 
    this.fD = paramByteBuffer.get();
    this.y9 = paramByteBuffer.get();
    switch (paramShort = paramByteBuffer.get()) {
      default:
        throw new RuntimeException(paramShort + "");
      case 1:
      case 2:
      case 3:
        break;
      case 0:
        break;
    } 
    this.B70 = new XT[paramByteBuffer.get()];
    short[] arrayOfShort;
    for (paramShort = 0; paramShort < (arrayOfShort = this.tc0).length; paramShort++)
      arrayOfShort[paramShort] = paramByteBuffer.getShort(); 
    paramByteBuffer.get();
    paramByteBuffer.position(paramByteBuffer.position() + 3);
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.getShort();
  }
  
  public final String m20() {
    return Ml0.Qf0(F40.ef0, 190, this.tK);
  }
  
  public final byte YF() {
    return this.y9;
  }
  
  public final short NO() {
    byte b;
    if ((b = this.y9) < 47)
      return (short)b; 
    if (b == 47)
      return 40; 
    if (b < 92)
      return (short)(b - 1); 
    switch (b) {
      default:
        return 0;
      case 104:
        return 94;
      case 103:
        return 93;
      case 102:
        return 92;
      case 101:
        return 40;
      case 100:
        return 91;
      case 99:
        return 41;
      case 98:
        return 42;
      case 97:
        return 69;
      case 96:
        return 75;
      case 95:
        return 74;
      case 94:
        return 70;
      case 93:
        return 4;
      case 92:
        break;
    } 
    return 71;
  }
  
  public final boolean fv() {
    return ((this.fD & 0x1) != 0);
  }
  
  public final boolean v4() {
    return ((this.fD & 0x2) != 0);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/QA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */