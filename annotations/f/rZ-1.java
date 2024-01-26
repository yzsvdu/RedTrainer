package f;

import java.nio.ByteBuffer;

public final class rZ {
  public int W80;
  
  public int VB;
  
  public short h2;
  
  public short j80;
  
  public rZ(ByteBuffer paramByteBuffer) {
    this.W80 = paramByteBuffer.getInt();
    this.VB = paramByteBuffer.getInt();
    this.h2 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.j80 = paramByteBuffer.getShort();
    paramByteBuffer.get(new byte[26]);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */