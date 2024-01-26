package f;

import java.nio.ByteBuffer;

public final class OF0 {
  public short An0;
  
  public int cY;
  
  public int fr0;
  
  public OG0[] x;
  
  public OG0[] oD0;
  
  public NC0 XP = new NC0();
  
  public NC0 IC0 = new NC0();
  
  public OF0(Ie paramIe, ByteBuffer paramByteBuffer) {
    this.An0 = paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.cY = paramByteBuffer.getInt();
    if (paramIe.Iq0 == 1) {
      paramByteBuffer.getShort();
      paramByteBuffer.getShort();
      paramByteBuffer.getShort();
      paramByteBuffer.getShort();
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/OF0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */