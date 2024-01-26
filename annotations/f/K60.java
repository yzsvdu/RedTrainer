package f;

import java.nio.ByteBuffer;

public final class K60 {
  public short[] Kq = new short[4];
  
  public K60(bu0 parambu0, ByteBuffer paramByteBuffer) {
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    if (parambu0.Aq()) {
      112;
      paramByteBuffer.getShort();
    } 
    if (parambu0.HF0()) {
      short[] arrayOfShort;
      for (byte b = 0; b < (arrayOfShort = this.Kq).length; b++)
        arrayOfShort[b] = paramByteBuffer.getShort(); 
    } 
    paramByteBuffer.getShort();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/K60.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */