package f;

public final class kT extends q60 {
  public NC0 az;
  
  public NC0 ev;
  
  public float Fa;
  
  public float e9;
  
  public float C60;
  
  public float NY;
  
  public boolean vu;
  
  public kT(C30[] paramArrayOfC30, int paramInt1, int paramInt2, NC0 paramNC01, NC0 paramNC02) {
    super(paramArrayOfC30, paramInt1, paramInt2, 1, i, j);
    this.az = paramNC01;
    this.ev = paramNC02;
    i = (int)Math.floor(Math.abs(paramNC01.lS(paramNC02) / 4.0F));
    this.C60 = 5.0F;
    this.NY = 15.0F;
    float f;
    this.Fa = (paramNC02.x - paramNC01.x) / (f = i);
    this.e9 = (paramNC02.y - paramNC01.y) / f;
    this.vu = true;
  }
  
  public final void T80() {
    if (!QF0() || !Ih())
      return; 
    if (this.y0 % 3 != 0)
      return; 
    if (this.az.lS(this.ev) > 5.0F) {
      if (this.vu) {
        float f1 = (float)(this.az.y * Math.PI * 2.0D * this.C60) / UB0.M60.dL();
        float f2 = this.az.y + this.e9;
        f2 = (float)(f2 * Math.PI * 2.0D * this.C60) / UB0.M60.dL();
        this.az.x = this.az.x + (float)((Math.sin(f2) - Math.sin(f1)) * this.NY) + this.Fa;
      } else {
        float f1 = (float)(this.az.x * Math.PI * 2.0D * this.C60) / UB0.M60.fG0();
        float f2 = this.az.x + this.Fa;
        f2 = (float)(f2 * Math.PI * 2.0D * this.C60) / UB0.M60.fG0();
        this.az.y = this.az.y + (float)((Math.sin(f2) - Math.sin(f1)) * this.NY) + this.e9;
      } 
      super.T80();
    } 
  }
  
  public final int YS() {
    return (int)this.az.x;
  }
  
  public final int Jk0() {
    return (int)this.az.y;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kT.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */