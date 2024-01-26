package f;

import java.nio.ByteBuffer;

public final class nt0 {
  public float tV;
  
  public float In;
  
  public nt0(ByteBuffer paramByteBuffer) {
    this.In = (paramByteBuffer.getShort() & 0xFFFF) / 65536.0F;
    this.tV = -paramByteBuffer.getShort() - this.In;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nt0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */