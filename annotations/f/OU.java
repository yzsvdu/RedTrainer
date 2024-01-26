package f;

import java.nio.ByteBuffer;

public final class OU extends Xk {
  public final byte YW;
  
  public byte Q6;
  
  public byte Ta;
  
  public byte vG0;
  
  public p5[] q4;
  
  public OU(byte paramByte, ByteBuffer paramByteBuffer, short paramShort) {
    super(paramByte, paramShort);
    this.YW = paramByteBuffer.get();
    this.Q6 = paramByteBuffer.get();
    paramByteBuffer.get();
    this.Ta = paramByteBuffer.get();
    paramByteBuffer.get(new byte[12]);
    String str;
    if (!(str = ed.LJ0(new byte[12])).trim().isEmpty())
      Ml0.TP(EM(), str); 
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getShort();
    paramByteBuffer.getInt();
    paramByteBuffer.getInt();
    this.vG0 = paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    paramByteBuffer.get();
    int i = pN.tx0(paramByteBuffer.getInt());
    int j = paramByteBuffer.position();
    paramByteBuffer.position(i);
    this.q4 = new p5[this.vG0];
    for (i = 0; i < this.vG0; i++) {
      p5 p51;
      this(this.YW, paramByteBuffer);
      this.q4[i] = p51;
    } 
    paramByteBuffer.position(j);
  }
  
  public final byte YF() {
    return this.Q6;
  }
  
  public final short NO() {
    return (short)this.Ta;
  }
  
  public final String m20() {
    return Ml0.OH0(EM());
  }
  
  public final int EM() {
    return this.s90 * 1000 + 195000 + this.tK;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/OU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */