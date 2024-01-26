package f;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.util.BitSet;
import java.util.zip.InflaterInputStream;

public final class qc0 {
  public BitSet[] N10 = new BitSet[4];
  
  public Qr[] AE = new Qr[4];
  
  public final Object NH = new Object();
  
  public qc0() {
    for (byte b = 0; b < 4; b++) {
      BitSet bitSet;
      Qr qr;
      this();
      this.N10[b] = bitSet;
      this();
      this.AE[b] = qr;
    } 
  }
  
  public final void uC(byte paramByte, byte[] paramArrayOfbyte) {
    Qr qr;
    if (paramArrayOfbyte.length <= 0) {
      BitSet bitSet;
      this();
      this.N10[paramByte] = this;
      this();
      this.AE[paramByte] = this;
      return;
    } 
    try {
      InflaterInputStream inflaterInputStream;
      Qr qr1;
      this(new ByteArrayInputStream(paramArrayOfbyte));
      this(inflaterInputStream);
      byte[] arrayOfByte;
      dataInputStream.read(arrayOfByte = new byte[dataInputStream.readShort()]);
      ((qc0)super).N10[paramByte] = BitSet.valueOf(arrayOfByte);
      DataInputStream dataInputStream;
      byte b = (dataInputStream = new DataInputStream()).readByte();
      this(b);
      for (byte b1 = 0; b1 < b; b1++) {
        short s = dataInputStream.readShort();
        qr1.RD(dataInputStream.readInt(), s);
      } 
      ((qc0)super).AE[paramByte] = qr1;
      dataInputStream.close();
      inflaterInputStream.close();
      return;
    } catch (IOException iOException) {
      throw new RuntimeException(this);
    } 
  }
  
  public final boolean JO(byte paramByte, short paramShort) {
    synchronized (this.NH) {
      /* monitor exit ThisExpression{ObjectType{java/lang/Object}} */
      return this.N10[paramByte].get(paramShort);
    } 
  }
  
  public final boolean cu0(byte paramByte, int paramInt, short paramShort) {
    synchronized (this.NH) {
      if ((this.AE[paramByte].X60(paramShort) & 1 << paramInt) != 0) {
        paramByte = 1;
      } else {
        paramByte = 0;
      } 
      /* monitor exit ThisExpression{ObjectType{java/lang/Object}} */
      return paramByte;
    } 
  }
  
  public final int hp0(short paramShort) {
    Object object;
    boolean bool = false;
    /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/lang/Object}, expression=ThisExpression{ObjectType{f/qc0}}, name=NH, descriptor=Ljava/lang/Object;}} */
    try {
      return Integer.bitCount(this.AE[bool].X60(paramShort));
    } finally {
      Exception exception = null;
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=null} */
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qc0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */