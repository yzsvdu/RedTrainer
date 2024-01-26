package f;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public final class E4 {
  public int sK;
  
  public int m4;
  
  public int aA0;
  
  public int cW;
  
  public int mJ0;
  
  public int Tp0;
  
  public U5 Zn = null;
  
  public ByteBuffer mk;
  
  public final uI S80;
  
  public final Com7 K60;
  
  public E4(T7 paramT7) {
    this.mk = paramT7.l2();
    (new FA0(byteBuffer)).sV(1413563475);
    this.sK = byteBuffer.getInt();
    this.m4 = byteBuffer.getInt();
    this.aA0 = byteBuffer.getInt();
    this.cW = byteBuffer.getInt();
    this.mJ0 = byteBuffer.getInt();
    byteBuffer.getInt();
    this.Tp0 = byteBuffer.getInt();
    byteBuffer.getInt();
    byteBuffer.position(byteBuffer.position() + 16);
    byteBuffer.position(this.aA0);
    this.S80 = new uI(this);
    this.K60 = new Com7(this);
    ByteBuffer byteBuffer;
    (byteBuffer = R80()).position(this.Tp0);
    R80().get(new byte[4]);
    R80().getInt();
    R80().getInt();
    R80().position(R80().position() + 4);
  }
  
  public final ByteBuffer R80() {
    this.mk.duplicate().order(ByteOrder.LITTLE_ENDIAN).position(0);
    return this.mk.duplicate().order(ByteOrder.LITTLE_ENDIAN);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/E4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */