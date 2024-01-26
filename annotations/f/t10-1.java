package f;

public final class t10 extends ZK0 {
  public fQ zl0;
  
  public t10(So0 paramSo0) {
    fQ fQ1;
    this();
    this.zl0 = this;
  }
  
  public final void Er0(W3 paramW3) {
    this.zl0.Com3(paramW3);
  }
  
  public final boolean kA0(xr0 paramxr0, tc paramtc, byte paramByte) {
    Hc0 hc0 = this.zl0.r30();
    while (hc0.hasNext()) {
      W3 w3;
      vu vu;
      if ((w3 = (W3)hc0.next()).Z40 == paramByte && (vu = (vu)this.z8.go0.get(Integer.valueOf(w3.tB0))) != null) {
        boolean bool;
        if (w3.y1 > 0) {
          bool = true;
        } else {
          bool = false;
        } 
        vu.cj0(bool, false);
      } 
    } 
    return false;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/t10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */