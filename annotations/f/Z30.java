package f;

public final class Z30 {
  public float Com2;
  
  public float Lz0;
  
  public float QP;
  
  public float Nl;
  
  public Z30(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    this.Com2 = paramFloat1;
    this.Lz0 = paramFloat2;
    this.QP = paramFloat3;
    this.Nl = paramFloat4;
  }
  
  public static Z30[] FC(int paramInt, yn paramyn) {
    Z30[] arrayOfZ30 = new Z30[paramInt];
    for (byte b = 0; b < paramInt; b++) {
      Z30 z30;
      float f1 = dL.Jd0(paramyn.Bl0);
      float f2 = dL.Jd0(paramyn.sI);
      float f3 = dL.Jd0(paramyn.gv);
      float f4 = dL.Jd0(paramyn.W2);
      float[] arrayOfFloat;
      if ((arrayOfFloat = paramyn.FH0) != null && arrayOfFloat.length > b)
        f1 = arrayOfFloat[b]; 
      if ((arrayOfFloat = paramyn.qk) != null && arrayOfFloat.length > b)
        f2 = arrayOfFloat[b]; 
      if ((arrayOfFloat = paramyn.bz) != null && arrayOfFloat.length > b)
        f3 = arrayOfFloat[b]; 
      if ((arrayOfFloat = paramyn.lr0) != null && arrayOfFloat.length > b)
        f4 = arrayOfFloat[b]; 
      this(f1, f2, f3, f4);
      arrayOfZ30[b] = z30;
    } 
    return arrayOfZ30;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Z30.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */