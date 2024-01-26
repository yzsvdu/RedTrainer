package f;

import com.badlogic.gdx.graphics.Texture;

public abstract class Ew implements vf0, iq0 {
  public f7 W60;
  
  public fQ Ro;
  
  public f7 OK;
  
  public f7 dH;
  
  public f7 NUl;
  
  public boolean V10;
  
  public boolean Y0;
  
  public Wd Ef;
  
  public int td0;
  
  public Ew() {
    f7 f71;
    this();
    this.W60 = this;
    this.Ro = null;
    this(1);
    this.OK = this;
    this(1);
    this.dH = this;
    this(1);
    this.NUl = this;
    this.V10 = false;
    this.Y0 = false;
  }
  
  public Ew(int paramInt) {
    f7 f71;
    this();
    this.W60 = this;
    this.Ro = null;
    this(1);
    this.OK = this;
    this(1);
    this.dH = this;
    this(1);
    this.NUl = this;
    this.Y0 = false;
    this.V10 = true;
  }
  
  public abstract void yq(hC paramhC, Wd paramWd);
  
  public final int Vv0(String paramString) {
    Integer integer;
    return ((integer = (Integer)this.OK.pd0(paramString)) == null) ? -1 : intValue();
  }
  
  public final void dispose() {
    this.Y0 = true;
    TA tA;
    (tA = this.W60.mw0()).getClass();
    while (tA.hasNext())
      ((Texture)tA.next()).dispose(); 
    fQ fQ1;
    if ((fQ1 = this.Ro) != null) {
      Hc0 hc0 = fQ1.r30();
      while (hc0.hasNext())
        ((Texture)hc0.next()).dispose(); 
    } 
    this.W60.t9();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ew.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */