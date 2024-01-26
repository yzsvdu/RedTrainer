package f;

import java.nio.ByteBuffer;

public final class lC extends NI0 {
  public lC(byte paramByte, short paramShort1, short paramShort2, ByteBuffer paramByteBuffer) {
    super(paramByteBuffer);
    this.VU = paramByteBuffer.getShort();
    this.Lz = paramByteBuffer.getShort();
    this.V10 = paramByteBuffer.getShort();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */