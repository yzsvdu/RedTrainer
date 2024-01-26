package f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class ml {
  public String jh0;
  
  public String e60;
  
  public String UI;
  
  public byte H50;
  
  public int UR;
  
  public int HV;
  
  public int dg0;
  
  public int LB0;
  
  public int RK;
  
  public int LP;
  
  public int hu;
  
  public int Ds;
  
  public int Jq;
  
  public Do0[] Og0;
  
  public Do0[] dF0;
  
  public ml(RD0 paramRD0) {
    byte[] arrayOfByte3;
    paramRD0.m30(arrayOfByte3 = new byte[2048], 2048);
    byte[] arrayOfByte2 = new byte[4];
    byte[] arrayOfByte4 = new byte[2];
    byte[] arrayOfByte1;
    byteBuffer.get(arrayOfByte1 = new byte[12]);
    byteBuffer.get(arrayOfByte2);
    byteBuffer.get(arrayOfByte4);
    this.jh0 = (new String(this)).trim();
    this.e60 = new String(arrayOfByte2);
    this.UI = (new String(arrayOfByte2, 0, 3)).trim();
    byteBuffer.get();
    byteBuffer.get();
    double d = (byteBuffer.get() + 17);
    Math.pow(2.0D, d);
    byteBuffer.get(new byte[9]);
    this.H50 = byteBuffer.get();
    byteBuffer.get();
    this.UR = byteBuffer.getInt();
    byteBuffer.getInt();
    byteBuffer.getInt();
    this.HV = byteBuffer.getInt();
    byteBuffer.getInt();
    byteBuffer.getInt();
    byteBuffer.getInt();
    byteBuffer.getInt();
    this.dg0 = byteBuffer.getInt();
    byteBuffer.getInt();
    this.LB0 = byteBuffer.getInt();
    this.RK = byteBuffer.getInt();
    this.LP = byteBuffer.getInt();
    this.hu = byteBuffer.getInt();
    this.Ds = byteBuffer.getInt();
    this.Jq = byteBuffer.getInt();
    ByteBuffer byteBuffer;
    (byteBuffer = ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN)).getInt();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getInt();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getInt();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getShort();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getShort();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getInt();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getInt();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getLong();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getInt();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getInt();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).get(new byte[56]);
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getShort();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getShort();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getInt();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getInt();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getInt();
    ByteBuffer.wrap(arrayOfByte3).order(ByteOrder.LITTLE_ENDIAN).getInt();
  }
  
  public final void vj(HI paramHI) {
    ByteBuffer byteBuffer = paramHI.GA0();
    for (byte b = 0; b < 2; b++) {
      int i;
      if (b == 0) {
        i = this.LP;
      } else {
        i = this.Ds;
      } 
      byteBuffer.position(i);
      int j;
      Do0[] arrayOfDo0 = new Do0[j = ((b == 0) ? this.hu : this.Jq) / 32];
      for (byte b1 = 0; b1 < j; b1++) {
        Do0 do0;
        this(paramHI.vf0, byteBuffer);
        arrayOfDo0[b1] = do0;
      } 
      if (b == 0) {
        this.Og0 = arrayOfDo0;
      } else {
        this.dF0 = arrayOfDo0;
      } 
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ml.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */