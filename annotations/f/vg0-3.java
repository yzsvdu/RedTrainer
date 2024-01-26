package f;

public final class vg0 extends K70 {
  public fQ pL0;
  
  public fo0 iZ;
  
  public vg0(X3 paramX3, lt paramlt) {
    super(paramX3, paramlt);
    fQ fQ1;
    this();
    this.pL0 = this;
  }
  
  public final void mx0(ny paramny) {
    super.mx0(paramny);
    Hc0 hc0 = this.pL0.r30();
    while (hc0.hasNext()) {
      tk tk = (tk)hc0.next();
      fo0 fo01;
      if ((fo01 = this.iZ) != null) {
        super.q10(tk, fo01);
        continue;
      } 
      tx0(tk);
    } 
  }
  
  public final void end() {
    super.end();
    this.pL0.clear();
  }
  
  public final void q10(tk paramtk, fo0 paramfo0) {
    this.pL0.Com3(paramtk);
    this.iZ = paramfo0;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */