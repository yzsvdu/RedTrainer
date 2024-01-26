package f;

public final class qx {
  public int rM;
  
  public int UX;
  
  public Ut[][] PL;
  
  public short SK0 = -1;
  
  public qx(int paramInt1, int paramInt2) {
    this.rM = paramInt1;
    this.UX = paramInt2;
    this.PL = new Ut[paramInt1][paramInt2];
  }
  
  public final Ut Jq0(short paramShort1, short paramShort2) {
    Ut[][] arrayOfUt1;
    Ut[] arrayOfUt;
    return (paramShort1 < 0 || paramShort1 >= (arrayOfUt1 = this.PL).length) ? null : ((paramShort2 < 0 || paramShort2 >= (arrayOfUt = this[paramShort1]).length) ? null : this[paramShort2]);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/qx.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */