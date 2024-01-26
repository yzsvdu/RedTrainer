package f;

import java.nio.ByteBuffer;

public final class HE0 {
  public byte A90;
  
  public int E1;
  
  public int wP;
  
  public int go0;
  
  public int UF;
  
  public int O1;
  
  public int r90;
  
  public HE0(byte paramByte, ByteBuffer paramByteBuffer) {
    this.A90 = paramByte;
    paramByteBuffer.position();
    this.E1 = paramByteBuffer.getInt();
    this.wP = paramByteBuffer.getInt();
    this.go0 = paramByteBuffer.getInt();
    this.UF = paramByteBuffer.getInt();
    this.O1 = paramByteBuffer.getInt();
    this.r90 = paramByteBuffer.getInt();
    byte[] arrayOfByte;
    paramByteBuffer.get(arrayOfByte = new byte[48]);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HE0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */