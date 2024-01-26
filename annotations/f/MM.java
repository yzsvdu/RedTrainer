package f;

public final class MM {
  public byte og0;
  
  public short Wk0;
  
  public short Ur;
  
  public byte ja0;
  
  public byte ZA;
  
  public byte com5;
  
  public boolean YB0;
  
  public boolean AC;
  
  public MM(byte paramByte1, short paramShort, byte paramByte2, byte paramByte3, byte paramByte4, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramByte1 == 1) {
      this.og0 = paramByte1;
      this.Wk0 = paramShort;
      this.ja0 = paramByte2;
      this.ZA = paramByte3;
      this.com5 = paramByte4;
      this.YB0 = paramBoolean1;
      this.AC = paramBoolean2;
      return;
    } 
    throw new RuntimeException("");
  }
  
  public MM(byte paramByte, short paramShort) {
    if (paramByte == 2) {
      this.og0 = paramByte;
      this.Ur = paramShort;
      return;
    } 
    throw new RuntimeException("");
  }
  
  public final short bv0() {
    return this.Wk0;
  }
  
  public final byte F7() {
    return this.ZA;
  }
  
  public final boolean Q2() {
    return this.AC;
  }
  
  public final boolean ZN() {
    return this.YB0;
  }
  
  public final byte oZ() {
    return this.com5;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */