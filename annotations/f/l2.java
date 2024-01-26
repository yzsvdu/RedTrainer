package f;

public final class l2 {
  public final cA fe;
  
  public boolean in;
  
  public int Sq0;
  
  public int XF;
  
  public int wJ;
  
  public float P4;
  
  public float fh;
  
  public boolean lp;
  
  public int Bt;
  
  public l2(cA paramcA) {
    this.fe = paramcA;
  }
  
  public final void N4(int paramInt, float paramFloat1, float paramFloat2) {
    boolean bool1;
    boolean bool2;
    int i;
    if ((i = this.wJ) != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramInt != 0) {
      bool2 = true;
    } else {
      bool2 = false;
    } 
    if (i != paramInt) {
      this.wJ = paramInt;
      if (bool2) {
        UB0.go.glEnable(2929);
        UB0.go.glDepthFunc(paramInt);
      } else {
        UB0.go.glDisable(2929);
      } 
    } 
    if (bool2) {
      if (!bool1 || this.wJ != paramInt) {
        this.wJ = paramInt;
        UB0.go.glDepthFunc(paramInt);
      } 
      if (!bool1 || this.P4 != paramFloat1 || this.fh != paramFloat2) {
        this.P4 = paramFloat1;
        this.fh = paramFloat2;
        UB0.go.glDepthRangef(paramFloat1, paramFloat2);
      } 
    } 
  }
  
  public final void Mg(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramBoolean != this.in) {
      this.in = paramBoolean;
      if (paramBoolean) {
        UB0.go.glEnable(3042);
      } else {
        UB0.go.glDisable(3042);
      } 
    } 
    if (paramBoolean && (this.Sq0 != paramInt1 || this.XF != paramInt2)) {
      UB0.go.glBlendFunc(paramInt1, paramInt2);
      this.Sq0 = paramInt1;
      this.XF = paramInt2;
    } 
  }
  
  public final void W60(int paramInt) {
    if (paramInt != this.Bt) {
      this.Bt = paramInt;
      if (paramInt == 1028 || paramInt == 1029 || paramInt == 1032) {
        UB0.go.glEnable(2884);
        UB0.go.glCullFace(paramInt);
        return;
      } 
      UB0.go.glDisable(2884);
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/l2.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */