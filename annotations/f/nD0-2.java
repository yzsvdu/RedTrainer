package f;

public final class nD0 {
  public static final jc[] Ee = new jc[0];
  
  public short Mn0;
  
  public byte HR;
  
  public int Bv0;
  
  public jc[] xn;
  
  public jc Q0 = null;
  
  public int d5 = -1;
  
  public nD0(int paramInt, short paramShort1, short paramShort2) {
    this(paramShort1, (short)-1, (byte)0, 0, this);
  }
  
  public nD0(short paramShort1, short paramShort2, byte paramByte, int paramInt, jc[] paramArrayOfjc) {
    this.Mn0 = paramShort1;
    this.HR = paramByte;
    this.Bv0 = paramInt;
    this.xn = paramArrayOfjc;
    int i = paramArrayOfjc.length;
    for (paramByte = 0; paramByte < i; paramByte++) {
      jc jc1;
      if ((jc1 = paramArrayOfjc[paramByte]) != null && jc1.So() == paramShort2)
        this.Q0 = jc1; 
    } 
    if (paramShort2 >= 0 && this.Q0 == null)
      this.d5 = paramShort2; 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nD0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */