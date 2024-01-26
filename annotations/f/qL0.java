package f;

import java.nio.ByteBuffer;

public final class qL0 extends vO {
  public byte[] aL;
  
  public ByteBuffer zb = null;
  
  public int Pw = 0;
  
  public int h30;
  
  public int rh;
  
  public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
    this.Vk = paramByteBuffer.getInt();
  }
  
  public final void rf0(ByteBuffer paramByteBuffer) {
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getInt();
    int i = paramByteBuffer.getInt();
    paramByteBuffer.position(this.Vk + i);
    byte[] arrayOfByte = new byte[paramByteBuffer.getInt()];
    paramByteBuffer.get(this);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qL0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */