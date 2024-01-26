package f;

public abstract class X0 extends Lc {
  public fQ wu;
  
  public X0() {
    fQ fQ1;
    this();
    this.wu = this;
  }
  
  public X0(int paramInt) {
    super(paramInt);
    fQ fQ1;
    this();
    this.wu = this;
  }
  
  public X0(int paramInt1, int paramInt2) {
    super(paramInt1, paramInt2);
    fQ fQ1;
    this();
    this.wu = this;
  }
  
  public Object obtain() {
    this.wu.Com3(super.obtain());
    return super.obtain();
  }
  
  public final void cF0() {
    super.freeAll(this.wu);
    this.wu.clear();
  }
  
  public final void free(Object paramObject) {
    this.wu.Ct(paramObject, true);
    super.free(paramObject);
  }
  
  public final void freeAll(fQ paramfQ) {
    this.wu.tF(paramfQ, true);
    super.freeAll(paramfQ);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/X0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */