package f;

import java.nio.ByteBuffer;

public class ZA0 extends vO {
  public ByteBuffer WI;
  
  public static int Ui(short paramShort) {
    return ((paramShort & 0x1F) * 8 & 0xFF) << 16 | 0xFF000000 | (((paramShort & 0x3E0) >> 5) * 8 & 0xFF) << 8 | ((paramShort & 0x7C00) >> 10) * 8 & 0xFF;
  }
  
  public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
    this.WI = paramByteBuffer;
    int i = paramVarArgs[0];
    this.Vk = (short)(paramByteBuffer.getShort() & 0x1FFF) * 8 + i;
    paramByteBuffer.getShort();
  }
  
  public byte[] Ax0(f20 paramf20) {
    this.WI.position(this.Vk);
    int i;
    if ((i = 32) > this.WI.remaining())
      i = this.WI.remaining(); 
    this.WI.get(new byte[i]);
    return new byte[i];
  }
  
  public int[] nH0(f20 paramf20) {
    this.WI.position(this.Vk);
    int i;
    if ((i = paramf20.D2) > this.WI.remaining())
      i = this.WI.remaining(); 
    int[] arrayOfInt = new int[i /= 2];
    for (byte b = 0; b < i; b++)
      arrayOfInt[b] = Ui(this.WI.getShort()); 
    return arrayOfInt;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ZA0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */