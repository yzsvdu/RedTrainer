package f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class TF extends T7 {
  public TF(HI paramHI, String paramString, int paramInt1, int paramInt2, short paramShort) {
    super(paramHI, paramString, paramInt1, paramInt2, paramShort);
  }
  
  public final ByteBuffer rb(boolean paramBoolean) {
    ByteBuffer byteBuffer = super.rb(paramBoolean);
    if (paramBoolean) {
      byte[] arrayOfByte;
      get(arrayOfByte = new byte[remaining()]);
      byteBuffer = ByteBuffer.wrap(bO.R(this)).order(ByteOrder.LITTLE_ENDIAN);
    } 
    return this;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */