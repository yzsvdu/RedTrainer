package f;

public final class nE0 {
  public int bz0;
  
  public byte Ly;
  
  public boolean T7;
  
  public byte Jf;
  
  public int n8;
  
  public int Gi;
  
  public short MB;
  
  public nH0 Xu0 = null;
  
  public Q90 Ml = null;
  
  public A30 Ao0 = null;
  
  public MM Kz0 = null;
  
  public short[] WK0 = new short[6];
  
  public final byte qL0() {
    return this.Jf;
  }
  
  public final int yi() {
    return this.Gi;
  }
  
  public final short mw() {
    return this.MB;
  }
  
  public final byte w70() {
    return (byte)(this.MB & 0xFF);
  }
  
  public final byte JH0() {
    return (byte)(this.MB >> 8);
  }
  
  public final boolean NG0() {
    return ((byte)(this.MB & 0xFF) < 0);
  }
  
  public final int NC() {
    if (this.Jf == 2)
      return this.n8; 
    throw new UnsupportedOperationException();
  }
  
  public final nH0 c1() {
    return this.Xu0;
  }
  
  public final Q90 Wc() {
    return this.Ml;
  }
  
  public final A30 lF0() {
    return this.Ao0;
  }
  
  public final MM je0() {
    return this.Kz0;
  }
  
  public static byte xw(short paramShort) {
    return (byte)(paramShort & 0x7F);
  }
  
  public static boolean up(short paramShort) {
    return ((paramShort & 0x80) != 0);
  }
  
  public nE0(int paramInt1, byte paramByte1, boolean paramBoolean, byte paramByte2, int paramInt2, int paramInt3, short paramShort) {
    this.bz0 = paramInt1;
    this.Ly = paramByte1;
    this.T7 = paramBoolean;
    this.Jf = paramByte2;
    this.n8 = paramInt2;
    this.Gi = paramInt3;
    this.MB = paramShort;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nE0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */