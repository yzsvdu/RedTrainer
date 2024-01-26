package f;

import java.nio.ByteBuffer;

public final class Ua {
  public Vi dW;
  
  public int DH0;
  
  public byte[] mb;
  
  public R30 kg0;
  
  public Ua(ByteBuffer paramByteBuffer) {
    fQ fQ;
    R30 r30;
    this.dW = Vi.tj(paramByteBuffer.get());
    this.DH0 = paramByteBuffer.getShort() & 0xFFFF;
    byte[] arrayOfByte1 = new byte[paramByteBuffer.get() & 0xFF];
    paramByteBuffer.get(arrayOfByte1);
    this(this.mb.length);
    byte[] arrayOfByte2;
    int i = (arrayOfByte2 = this.mb).length;
    for (byte b = 0; b < i; b++)
      fQ.Com3(Byte.valueOf(arrayOfByte2[b])); 
    this(this.DH0 / 1000.0F, fQ);
    this.kg0 = new R30();
    if (this.dW == Vi.q1)
      r30.Pt(Qb.RW); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ua.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */