package f;

import java.nio.ByteBuffer;

public final class i40 extends lpT3 {
  public short[] VA0;
  
  public final void rC(ByteBuffer paramByteBuffer) {
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.VA0 = new short[4];
    for (byte b = 0; b < 4; b++)
      this.VA0[b] = paramByteBuffer.getShort(); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/i40.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */