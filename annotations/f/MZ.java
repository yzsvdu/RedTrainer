package f;

import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class MZ {
  public byte fA0;
  
  public int CoN;
  
  public int N0;
  
  public short y5;
  
  public int ei0;
  
  public int Kv0;
  
  public int T40;
  
  public ArrayList FO;
  
  public MZ(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer, s40 params40) {
    short s;
    this.FO = new ArrayList();
    this.fA0 = params40.in();
    this.CoN = paramInt1;
    this.N0 = paramInt2;
    this.ei0 = pN.tx0(paramByteBuffer.getInt());
    paramInt1 = params40.in();
    ot ot;
    if ((ot = fV.Gv0().GI0(this.ei0, paramInt1)) == null) {
      s = -1;
    } else {
      s = s.l80;
    } 
    this.y5 = s;
    paramByteBuffer.getInt();
    this.Kv0 = pN.tx0(paramByteBuffer.getInt());
    paramByteBuffer.getInt();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.T40 = paramByteBuffer.get() & 0xFF;
    xm.KR(paramByteBuffer.get());
    yE0.MB0(paramByteBuffer.get());
    vF.t40(paramByteBuffer.get());
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    Y80.io(paramByteBuffer.get());
    if (this.Kv0 > 0) {
      ByteBuffer byteBuffer;
      (byteBuffer = params40.pr()).position(this.Kv0);
      while ((paramInt2 = byteBuffer.get()) >= 1) {
        int i = pN.tx0(byteBuffer.getInt());
        if (paramInt2 == 2 || paramInt2 == 4) {
          ByteBuffer byteBuffer1;
          (byteBuffer1 = params40.pr()).position(i);
          while (byteBuffer1.getShort() != 0) {
            byteBuffer1.getShort();
            byteBuffer1.getInt();
            this.FO.add(new cL0());
          } 
          continue;
        } 
        this.FO.add(new cL0());
      } 
    } 
  }
  
  public MZ(int paramInt1, int paramInt2, ByteBuffer paramByteBuffer) {
    this.FO = new ArrayList();
    this.fA0 = (byte)(paramInt1 / 50);
    this.CoN = paramInt1;
    this.N0 = paramInt2;
    this.ei0 = 0;
    this.y5 = paramByteBuffer.getShort();
    this.Kv0 = 0;
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    this.T40 = paramByteBuffer.get() & 0xFF;
    xm.KR(paramByteBuffer.get());
    yE0.MB0(paramByteBuffer.get());
    vF.t40(paramByteBuffer.get());
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    Y80.io(paramByteBuffer.get());
  }
  
  public final String iL0() {
    byte b;
    return ((b = this.fA0) == 0) ? Ml0.OH0((this.T40 & 0xFF) - 88 + 140000) : Ml0.OH0(b * 1000 + 140000 + (this.T40 & 0xFF));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */