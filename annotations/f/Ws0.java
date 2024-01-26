package f;

import java.nio.ByteBuffer;

public abstract class Ws0 implements Cloneable {
  public HI he0;
  
  public short Ga;
  
  public short COm4;
  
  public short F70;
  
  public short zN = -1;
  
  public short zk = -1;
  
  public short fd0 = -1;
  
  public short Ww0 = -1;
  
  public short CW = -1;
  
  public short qz = -1;
  
  public short ZC0;
  
  public short f10;
  
  public byte d8;
  
  public byte Z5;
  
  public byte et;
  
  public short cC;
  
  public byte gS;
  
  public short Ka0;
  
  public int Rb0;
  
  public int ve;
  
  public int SE0;
  
  public uz0 P2;
  
  public eA0 cC0;
  
  public ByteBuffer g5;
  
  public Ws0(short paramShort, HI paramHI, ByteBuffer paramByteBuffer) {
    this.Ga = paramShort;
    this.he0 = paramHI;
    this.g5 = paramByteBuffer;
    paramByteBuffer.position();
    i3();
  }
  
  public abstract void i3();
  
  public abstract void Lj0();
  
  public final String getName() {
    return Ml0.la(this.he0.bO() * 1000 + 140000 + (this.d8 & 0xFF), "???");
  }
  
  public abstract String Lr();
  
  public final boolean M6(short paramShort) {
    return ((this.cC & paramShort) != 0);
  }
  
  public final uz0 lpT5() {
    return this.P2;
  }
  
  public final byte VK() {
    return this.he0.bO();
  }
  
  public abstract vF WD0();
  
  public abstract boolean kJ();
  
  public abstract boolean cOM9();
  
  public abstract boolean hG0();
  
  public final Ws0 Ae0() {
    try {
      return (Ws0)clone();
    } catch (CloneNotSupportedException cloneNotSupportedException) {
      return null;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ws0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */