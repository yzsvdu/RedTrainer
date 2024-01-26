package f;

import java.util.List;

public final class sy0 implements vU {
  public s70 up0;
  
  public boolean ZJ0 = false;
  
  public boolean YP = false;
  
  public byte Re0;
  
  public short J8 = 0;
  
  public float j3;
  
  public final List PK;
  
  public sy0(RD0 paramRD0, List paramList) {
    this.PK = paramList;
    OL oL;
    if ((oL = UB0.L90) == null) {
      gk.y2.error("Gdx audio is null, check configuration.");
      this.up0 = null;
      this.ZJ0 = true;
      return;
    } 
    try {
      this.up0 = oL.wf0(paramRD0);
    } catch (Exception exception) {
      R8 r8;
      if ((r8 = km.u4) != null)
        r8.Pq(Ml0.Go(1231, paramRD0.toString())); 
      gk.y2.error("Error loading sound " + paramRD0 + ". Please check any mods for errors.", exception);
      this.up0 = null;
      this.ZJ0 = true;
    } 
  }
  
  public final void Ch0(float paramFloat) {
    if (this.ZJ0)
      return; 
    this.up0.ci0(paramFloat, this.j3);
  }
  
  public final boolean isDone() {
    if (this.ZJ0)
      return true; 
    if (this.up0.OH0())
      return false; 
    this.ZJ0 = true;
    this.up0.dispose();
    return true;
  }
  
  public final void finalize() {
    try {
      if (!this.ZJ0) {
        this.up0.stop();
        this.ZJ0 = true;
        this.up0.dispose();
      } 
    } catch (Exception exception) {}
    super.finalize();
  }
  
  public final void Ix0() {
    if (this.ZJ0)
      return; 
    this.up0.B9(this.YP);
    this.up0.vf0(this.j3);
    this.up0.Ix0();
    this.PK.add(this);
  }
  
  public final void oC0() {
    if (this.ZJ0)
      return; 
    this.up0.oC0();
  }
  
  public final void resume() {
    if (this.ZJ0)
      return; 
    this.up0.Ix0();
  }
  
  public final void Wi0(boolean paramBoolean) {
    if (this.ZJ0)
      return; 
    this.up0.stop();
  }
  
  public final boolean Vh() {
    return this.ZJ0;
  }
  
  public final byte jA() {
    return this.Re0;
  }
  
  public final short LE() {
    return this.J8;
  }
  
  public final void vf0(float paramFloat) {
    this.j3 = paramFloat;
    s70 s701;
    if (!this.ZJ0 && (s701 = this.up0) != null)
      vf0(paramFloat); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */