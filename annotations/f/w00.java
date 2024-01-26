package f;

import java.nio.ByteBuffer;

public final class w00 {
  public int r3;
  
  public int gi;
  
  public int[] fD;
  
  public boolean ib = false;
  
  public w00(ByteBuffer paramByteBuffer, int paramInt) {
    if (paramByteBuffer.getInt() != paramInt)
      return; 
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.r3 = paramByteBuffer.getInt();
    paramByteBuffer.getShort();
    this.gi = paramInt = paramByteBuffer.getShort() & 0xFFFF;
    this.fD = new int[paramInt];
    for (paramInt = 0; paramInt < this.gi; paramInt++)
      this.fD[paramInt] = paramByteBuffer.getInt(); 
    this.ib = true;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/w00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */