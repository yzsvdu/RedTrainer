package f;

import java.nio.ByteBuffer;

public final class ta {
  public int pL0;
  
  public short DO;
  
  public short cOM8;
  
  public float o5;
  
  public ta(ByteBuffer paramByteBuffer) {
    paramByteBuffer.position();
    this.pL0 = paramByteBuffer.getInt();
    this.DO = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.cOM8 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.o5 = (paramByteBuffer.getShort() & 0xFFFF) / 65536.0F + paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ta.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */