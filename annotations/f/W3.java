package f;

import java.nio.ByteBuffer;

public final class W3 {
  public int tB0;
  
  public byte Z40;
  
  public short y1;
  
  public short D7;
  
  public short oh;
  
  public short Mc;
  
  public short hi0;
  
  public W3(ByteBuffer paramByteBuffer) {
    this.tB0 = paramByteBuffer.getInt();
    this.Z40 = NI.yx((byte)paramByteBuffer.getShort());
    this.y1 = paramByteBuffer.getShort();
    this.D7 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.oh = paramByteBuffer.getShort();
    this.Mc = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.hi0 = paramByteBuffer.getShort();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/W3.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */