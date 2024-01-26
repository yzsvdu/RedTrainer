package f;

import java.nio.ByteBuffer;

public final class Ze0 {
  public int[] pm;
  
  public Ze0(LX paramLX, int paramInt1, int paramInt2, ByteBuffer paramByteBuffer) {
    this.pm = new int[paramInt2];
    paramByteBuffer.position(paramInt1 - paramLX.no0.h90);
    for (byte b = 0; b < paramInt2; b++)
      this.pm[b] = paramByteBuffer.getShort(); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ze0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */