package f;

import java.nio.ByteBuffer;

public final class Ie {
  public short RM;
  
  public short Iq0;
  
  public int o40;
  
  public int cm;
  
  public int eQ;
  
  public OF0[] ap0;
  
  public int import;
  
  public Ie(ByteBuffer paramByteBuffer) {
    paramByteBuffer.get(new byte[4]);
    paramByteBuffer.getInt();
    this.RM = paramByteBuffer.getShort();
    this.Iq0 = paramByteBuffer.getShort();
    this.o40 = paramByteBuffer.getInt();
    this.cm = paramByteBuffer.getInt();
    this.eQ = paramByteBuffer.getInt();
    paramByteBuffer.getLong();
    this.ap0 = new OF0[this.RM];
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ie.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */