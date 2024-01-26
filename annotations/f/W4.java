package f;

public final class W4 {
  public oE Ol0;
  
  public byte coM9;
  
  public W4(oE paramoE, byte paramByte) {
    this.Ol0 = paramoE;
    this.coM9 = paramByte;
  }
  
  public final String toString() {
    v30 v30;
    Byte byte_;
    StringBuilder stringBuilder = (new StringBuilder()).append(this.Ol0).append("(");
    if (this.Ol0 == oE.c0) {
      v30 = v30.wL0(this.coM9);
    } else {
      byte_ = Byte.valueOf(((W4)super).coM9);
    } 
    return stringBuilder.append(this).append(")").toString();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/W4.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */