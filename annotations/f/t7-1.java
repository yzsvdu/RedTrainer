package f;

import java.nio.ByteBuffer;

public final class t7 extends lpT3 {
  public short eE0;
  
  public final void rC(ByteBuffer paramByteBuffer) {
    this.eE0 = paramByteBuffer.getShort();
    paramByteBuffer.position(paramByteBuffer.position() + 2);
    paramByteBuffer.getShort();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.position(paramByteBuffer.position() + 2);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/t7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */