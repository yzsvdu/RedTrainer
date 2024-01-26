package f;

import java.nio.ByteBuffer;

public final class xq0 {
  public final byte Ym0;
  
  public final short[][] Bg;
  
  public xq0(byte paramByte1, byte paramByte2, short paramShort, ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2) {
    wx0 wx0;
    this.Bg = new short[3][6];
    this.Ym0 = paramByte1;
    paramByteBuffer1.get();
    paramByteBuffer1.position(paramByteBuffer1.position() + 3);
    paramByteBuffer1.get(new byte[8]);
    String str = ed.LJ0(new byte[8]);
    Ml0.TP(paramByte2 * 1000 + 280000 + paramShort, str);
    short s;
    for (s = 0; s < this.Bg.length; s++) {
      for (paramByte2 = 0; paramByte2 < 6; paramByte2++)
        this.Bg[s][paramByte2] = paramByteBuffer1.getShort(); 
    } 
    paramByteBuffer2.position(pN.tx0(paramByteBuffer1.getInt()));
    this();
    while (true) {
      if ((s = paramByteBuffer2.getShort()) < 0) {
        M5();
        return;
      } 
      F40(s);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */