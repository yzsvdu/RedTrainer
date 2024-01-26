package f;

import java.nio.ByteBuffer;

public final class Md0 {
  public String cD0;
  
  public String Al0;
  
  public short[] x80 = new short[4];
  
  public short[] ie0 = new short[6];
  
  public Md0(byte paramByte, ByteBuffer paramByteBuffer) {
    paramByteBuffer.getShort();
    byte[] arrayOfByte1;
    paramByteBuffer.get(arrayOfByte1 = new byte[11]);
    paramByteBuffer.get(arrayOfByte2);
    this.cD0 = ed.LJ0(arrayOfByte1);
    byte[] arrayOfByte2;
    String str = ed.LJ0(arrayOfByte2 = new byte[8]);
    Ml0.TP(paramByte + 315000, str);
    paramByteBuffer.get();
    paramByteBuffer.getShort();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.getShort();
    byte b;
    for (b = 0; b < 4; b++)
      this.x80[b] = paramByteBuffer.getShort(); 
    for (b = 0; b < 6; b++)
      this.ie0[b] = (short)(paramByteBuffer.get() & 0xFF); 
    paramByteBuffer.position(paramByteBuffer.position() + 16);
    paramByteBuffer.getInt();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Md0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */