package f;

public class vF0 extends dQ {
  public int Q50;
  
  public int QX;
  
  public rH TS;
  
  public boolean bn;
  
  public vF0() {
    this(-1, -1, 0);
  }
  
  public vF0(int paramInt1, int paramInt2) {
    this(paramInt1, paramInt2, 0);
  }
  
  public vF0(int paramInt1, int paramInt2, int paramInt3) {
    super("");
    rH rH1;
    this.Q50 = -1;
    this.QX = -1;
    this(this);
    this.TS = rH1;
    this.bn = true;
    Xu("spritelabel");
    Cu0(paramInt1, paramInt2);
  }
  
  public final rH ZH0() {
    return this.TS;
  }
  
  public final void EX(nY paramnY) {
    if (this.QX > -1 && this.Q50 > -1)
      return; 
    super.EX(paramnY);
  }
  
  public final void TE(nY paramnY) {}
  
  public final void hC0(nY paramnY) {
    if (this.QX > -1 && this.Q50 > -1)
      return; 
    super.hC0(paramnY);
  }
  
  public final int AW() {
    int i;
    return (this.QX > -1 && (i = this.Q50) > -1) ? i : super.AW();
  }
  
  public final int HY() {
    int i;
    return ((i = this.QX) > -1 && this.Q50 > -1) ? i : super.HY();
  }
  
  public final void Cu0(int paramInt1, int paramInt2) {
    this.Q50 = paramInt1;
    this.QX = paramInt2;
    if (paramInt2 > -1 && paramInt1 > -1) {
      uh0(paramInt1, paramInt2);
      RI(paramInt1, paramInt2);
      Tm(paramInt1, paramInt2);
    } 
  }
  
  public void d40() {
    int i;
    int j;
    if ((i = this.QX) > -1 && (j = this.Q50) > -1) {
      uh0(j, i);
      int k = this.Q50;
      RI(k, this.QX);
      k = this.Q50;
      Tm(k, this.QX);
    } 
  }
  
  public final void R60(throws paramthrows) {
    if (this.bn)
      this.TS.Iq(); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/vF0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */