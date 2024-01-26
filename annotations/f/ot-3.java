package f;

import java.nio.ByteBuffer;

public final class ot {
  public short l80;
  
  public final int aux;
  
  public final byte tA;
  
  public final byte zl;
  
  public final boolean iv0;
  
  public short[] eR;
  
  public short[] S10;
  
  public ot(short paramShort, ByteBuffer paramByteBuffer, s40 params40) {
    this.l80 = paramShort;
    paramByteBuffer.position();
    int i = paramByteBuffer.getInt();
    int j = paramByteBuffer.getInt();
    int k = pN.tx0(paramByteBuffer.getInt());
    int m = pN.tx0(paramByteBuffer.getInt());
    int n = pN.tx0(paramByteBuffer.getInt());
    (n - params40.bV().nz(n = uq.sK)) / 24;
    params40.in();
    (pN.tx0(paramByteBuffer.getInt()) - params40.bV().nz(n)) / 24;
    params40.in();
    if (params40.in() == 1) {
      this.tA = 2;
      this.zl = 2;
    } else {
      this.tA = paramByteBuffer.get();
      this.zl = paramByteBuffer.get();
      paramByteBuffer.getShort();
    } 
    if (i > 65535 || j > 65535 || this.tA < 0 || this.zl < 0 || m < 1 || m >= paramByteBuffer.limit() || k < 1 || k >= paramByteBuffer.limit()) {
      this.iv0 = false;
    } else {
      this.iv0 = true;
    } 
    if (this.iv0) {
      paramByteBuffer.position(m);
      this.eR = new short[i * j];
      short[] arrayOfShort2;
      for (i = 0; i < (arrayOfShort2 = this.eR).length; i++)
        arrayOfShort2[i] = paramByteBuffer.getShort(); 
      paramByteBuffer.position(this.aux);
      this.S10 = new short[this.tA * this.zl];
      for (i = 0; i < (arrayOfShort2 = this.S10).length; i++)
        arrayOfShort2[i] = paramByteBuffer.getShort(); 
      byte b = params40.in();
      short[] arrayOfShort1 = this.eR;
      g70.du0().Ya(b, paramShort, arrayOfShort1);
    } 
  }
  
  public ot(byte paramByte, ByteBuffer paramByteBuffer, short paramShort) {
    this.l80 = paramShort;
    int j = paramByteBuffer.getInt();
    this.aux = 0;
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    byte b1 = paramByteBuffer.get();
    byte b2 = paramByteBuffer.get();
    paramByteBuffer.getShort();
    int i;
    if ((i = paramByteBuffer.getInt()) > 65535 || j > 65535 || b1 < 0 || b2 < 0) {
      this.iv0 = false;
    } else {
      this.iv0 = true;
    } 
    if (this.iv0) {
      this.eR = new short[i * j];
      short[] arrayOfShort;
      for (i = 0; i < (arrayOfShort = this.eR).length; i++)
        arrayOfShort[i] = paramByteBuffer.getShort(); 
      this.S10 = new short[this.tA * this.zl];
      for (i = 0; i < (arrayOfShort = this.S10).length; i++)
        arrayOfShort[i] = paramByteBuffer.getShort(); 
      g70.du0().Ya(paramByte, paramShort, this.eR);
    } 
  }
  
  static {
    C00.gd(ot.class);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ot.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */