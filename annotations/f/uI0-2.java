package f;

import java.nio.ByteBuffer;

public final class uI0 {
  public short vx0;
  
  public uI0(ByteBuffer paramByteBuffer) {
    this.vx0 = paramByteBuffer.getShort();
  }
  
  public final int Eu0() {
    return this.vx0 & 0xFFFF & 0xFFFF03FF;
  }
  
  public final byte EL0() {
    return (byte)(this.vx0 >> 12 & 0xF);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uI0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */