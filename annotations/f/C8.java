package f;

import java.nio.ByteBuffer;

public final class C8 extends vO {
  public int d60;
  
  public int[] p20;
  
  public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
    this.Vk = paramByteBuffer.getShort();
    this.d60 = paramByteBuffer.get() & 0xFF;
    paramByteBuffer.get();
    this.p20 = new int[this.d60];
  }
  
  public final void rf0(ByteBuffer paramByteBuffer) {
    for (byte b = 0; b < this.d60; b++)
      this.p20[b] = paramByteBuffer.get() & 0xFF; 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/C8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */