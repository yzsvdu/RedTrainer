package f;

import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.function.Supplier;

public final class Yy0 implements Iterable {
  public short rG0;
  
  public BE0 e10;
  
  public fQ ai0;
  
  public Yy0(ByteBuffer paramByteBuffer, Supplier paramSupplier, int paramInt) {
    this(paramByteBuffer, paramSupplier, paramInt, this);
  }
  
  public Yy0(ByteBuffer paramByteBuffer, Supplier<vO> paramSupplier, int paramInt, int... paramVarArgs) {
    paramByteBuffer.get();
    this.rG0 = (short)(paramByteBuffer.get() & 0xFF);
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getInt();
    this.ai0 = new fQ(this.rG0);
    if (this.rG0 <= 0)
      return; 
    byte b2;
    for (b2 = 0; b2 < this.rG0; b2++)
      paramByteBuffer.getInt(); 
    this.e10 = new BE0();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.e10.getClass();
    for (b2 = 0; b2 < this.rG0; b2++) {
      vO.getClass();
      vO vO;
      (vO = paramSupplier.get()).we0(paramByteBuffer, paramVarArgs);
      this.ai0.Com3(vO);
    } 
    int i;
    for (i = 0; i < this.rG0; i++) {
      byte[] arrayOfByte;
      paramByteBuffer.get(arrayOfByte = new byte[16]);
      ((vO)this.ai0.get(i)).Ih = (new String(arrayOfByte)).trim();
    } 
    i = paramByteBuffer.position();
    for (byte b1 = 0; b1 < this.rG0; b1++) {
      vO vO;
      int j;
      if ((j = (vO = (vO)this.ai0.get(b1)).Vk) >= 0) {
        int k = j + paramInt;
        paramByteBuffer.position(k);
        vO.rf0(paramByteBuffer);
      } 
    } 
    paramByteBuffer.position(i);
  }
  
  public final Iterator iterator() {
    return this.ai0.r30();
  }
  
  public final vO yO(int paramInt) {
    return (vO)this.ai0.get(paramInt);
  }
  
  public final int size() {
    return this.ai0.Z8;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Yy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */