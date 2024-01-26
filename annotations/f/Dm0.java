package f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

public final class Dm0 {
  public byte[] c50;
  
  public ArrayList Ft0;
  
  public Dm0(byte[] paramArrayOfbyte) {
    this.c50 = paramArrayOfbyte;
  }
  
  public final List CoN() {
    Exception exception;
    /* monitor enter ThisExpression{ObjectType{f/Dm0}} */
    try {
      ArrayList arrayList;
      if ((arrayList = this.Ft0) == null && this.c50 != null) {
        this.Ft0 = new ArrayList();
        ByteBuffer byteBuffer;
        int i = (byteBuffer = ByteBuffer.wrap(this.c50).order(ByteOrder.LITTLE_ENDIAN)).limit() / 4;
        for (byte b = 0; b < i; b++) {
          short s = byteBuffer.getShort();
          byteBuffer.get();
          byteBuffer.get();
          this.Ft0.add(new mq(s));
        } 
        /* monitor exit ThisExpression{ObjectType{f/Dm0}} */
        return this.Ft0;
      } 
    } finally {}
    if (exception == null) {
      ArrayList arrayList;
      this();
      this.Ft0 = arrayList;
    } 
    /* monitor exit ThisExpression{ObjectType{f/Dm0}} */
    return this.Ft0;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Dm0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */