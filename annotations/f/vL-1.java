package f;

import java.nio.ByteBuffer;

public final class vL {
  public short[] Kh0 = new short[5];
  
  public vL(ByteBuffer paramByteBuffer) {
    paramByteBuffer.getShort();
    paramByteBuffer.get();
    paramByteBuffer.get();
    short[] arrayOfShort;
    for (byte b = 0; b < (arrayOfShort = this.Kh0).length; b++)
      arrayOfShort[b] = paramByteBuffer.getShort(); 
    paramByteBuffer.getShort();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */