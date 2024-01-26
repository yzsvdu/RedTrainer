package f;

import java.nio.ByteBuffer;

public final class ua extends sK {
  public int Cq;
  
  public ua(int paramInt, byte paramByte) {
    super(paramByte);
    this.Cq = paramInt;
  }
  
  public final int a7() {
    return this.Cq;
  }
  
  public final void K10(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(this.ak);
    paramByteBuffer.putInt(this.Cq);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ua.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */