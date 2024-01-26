package f;

import java.nio.ByteBuffer;

public abstract class H00 extends sK {
  public byte FG;
  
  public H00(byte paramByte1, byte paramByte2) {
    super(paramByte1);
    this.FG = paramByte2;
  }
  
  public int a7() {
    return this.FG;
  }
  
  public final void K10(ByteBuffer paramByteBuffer) {
    paramByteBuffer.put(this.ak);
    paramByteBuffer.put(this.FG);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/H00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */