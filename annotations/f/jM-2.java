package f;

public final class jM {
  public final h30 fG;
  
  public jM() {
    h30 h301;
    this();
    this.fG = this;
  }
  
  public jM(h30 paramh30) {
    this.fG = paramh30;
  }
  
  static {
    C00.gd(jM.class);
  }
  
  public final boolean At0(short paramShort) {
    synchronized (this.fG) {
      if (this.fG.Z90(paramShort) != 0) {
        paramShort = 1;
      } else {
        paramShort = 0;
      } 
      /* monitor exit ThisExpression{ObjectType{f/h30}} */
      return paramShort;
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */