package f;

import java.nio.ByteBuffer;

public final class I6 extends vO {
  public static final ik X9 = C00.gd(I6.class);
  
  public int ov;
  
  public int HG;
  
  public int[] pt;
  
  public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
    this.Vk = paramByteBuffer.getInt();
  }
  
  public final void rf0(ByteBuffer paramByteBuffer) {
    byte[] arrayOfByte;
    if (paramByteBuffer.getInt() != 1447100502) {
      paramByteBuffer.position(paramByteBuffer.position() - 4);
      paramByteBuffer.get(arrayOfByte = new byte[4]);
      X9.getClass();
      return;
    } 
    ((I6)super).ov = paramByteBuffer.getShort() & 0xFFFF;
    ((I6)super).HG = paramByteBuffer.getShort() & 0xFFFF;
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    ((I6)super).pt = new int[(((I6)super).ov * ((I6)super).HG >> 5) + 1];
    if (paramByteBuffer.remaining() / 4 < ((I6)super).pt.length) {
      paramByteBuffer.remaining() / 4;
      ((I6)super).pt.length;
      X9.getClass();
      ((I6)super).pt = new int[paramByteBuffer.remaining() / 4];
    } 
    int[] arrayOfInt;
    for (byte b = 0; b < (arrayOfInt = ((I6)super).pt).length; b++)
      arrayOfInt[b] = paramByteBuffer.getInt(); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/I6.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */