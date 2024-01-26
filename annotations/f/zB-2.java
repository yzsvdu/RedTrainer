package f;

import java.nio.ByteBuffer;

public final class zB {
  public float tB;
  
  public zB(ByteBuffer paramByteBuffer) {
    this.tB = paramByteBuffer.getShort() / 4096.0F;
    paramByteBuffer.getShort();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/zB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */