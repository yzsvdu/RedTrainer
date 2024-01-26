package f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class T7 {
  public HI bP;
  
  public int XL;
  
  public int zu0;
  
  public String JP;
  
  public short vA0;
  
  public String db;
  
  public T7(HI paramHI, String paramString, int paramInt1, int paramInt2, short paramShort) {
    this.bP = paramHI;
    this.JP = paramString;
    this.XL = paramInt1;
    this.zu0 = paramInt2;
    this.vA0 = paramShort;
  }
  
  public final ByteBuffer l2() {
    return rb(false);
  }
  
  public final HI Sh0() {
    return this.bP;
  }
  
  public final String toString() {
    return this.JP;
  }
  
  public ByteBuffer rb(boolean paramBoolean) {
    ByteBuffer byteBuffer2;
    (byteBuffer2 = this.bP.GA0()).position(this.XL);
    if (this.zu0 > 0)
      byteBuffer2.limit(Math.min(byteBuffer2.limit(), this.XL + this.zu0)); 
    ByteOrder byteOrder;
    ByteBuffer byteBuffer1 = byteBuffer2.slice().order(byteOrder = ByteOrder.LITTLE_ENDIAN);
    if (!paramBoolean)
      return byteBuffer1; 
    byte b;
    if ((b = byteBuffer1.get(0)) == 16 || b == 17)
      byteBuffer1 = ByteBuffer.wrap(LF.sf(0, byteBuffer1)).order(this); 
    return byteBuffer1;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/T7.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */