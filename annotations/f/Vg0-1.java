package f;

public final class Vg0 {
  public byte import;
  
  public byte lpt6;
  
  public nV xm;
  
  public byte iI0;
  
  public short[] rt;
  
  public Fm Jz0;
  
  public Vg0(byte paramByte) {
    Fm fm;
    this();
    this.Jz0 = fm;
    if (paramByte != 1 && paramByte != 6) {
      this.import = paramByte;
      return;
    } 
    throw new RuntimeException();
  }
  
  public Vg0(byte paramByte, int paramInt) {
    Fm fm;
    this();
    this.Jz0 = fm;
    this.import = b;
    this.lpt6 = paramByte;
  }
  
  public Vg0(nV paramnV, byte paramByte, short[] paramArrayOfshort, hR[] paramArrayOfhR, byte[] paramArrayOfbyte) {
    this.Jz0 = new Fm();
    this.import = 1;
    this.xm = paramnV;
    this.iI0 = paramByte;
    this.rt = paramArrayOfshort;
    if (paramArrayOfhR.length == paramArrayOfbyte.length) {
      byte b = 0;
      while (b < paramArrayOfhR.length) {
        if ((paramByte = paramArrayOfbyte[b]) >= 0 && paramByte <= 31) {
          this.Jz0.ej(paramByte, paramArrayOfhR[b]);
          b = (byte)(b + 1);
          continue;
        } 
        throw new RuntimeException();
      } 
      return;
    } 
    throw new RuntimeException();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Vg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */