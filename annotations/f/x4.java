package f;

import java.nio.ByteBuffer;

public final class x4 extends j60 {
  public short[] vv0 = new short[7];
  
  public x4(byte paramByte, ByteBuffer paramByteBuffer) {
    this.ka = 2;
    this.tp0 = paramByte;
    this.bQ = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.p20 = paramByteBuffer.getShort();
    this.LK = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.mE0 = paramByteBuffer.getShort();
    if (paramByteBuffer.getShort() == 1) {
      paramByte = 1;
    } else {
      paramByte = 0;
    } 
    this.RE0 = paramByte;
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.fP = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    short[] arrayOfShort;
    for (paramByte = 0; paramByte < (arrayOfShort = this.vv0).length; paramByte++)
      arrayOfShort[paramByte] = paramByteBuffer.getShort(); 
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/x4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */