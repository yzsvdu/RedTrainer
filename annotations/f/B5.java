package f;

import java.nio.ByteBuffer;

public final class B5 {
  public short h20;
  
  public short HX;
  
  public B5(ByteBuffer paramByteBuffer) {
    this.h20 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.HX = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/B5.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */