package f;

import com.badlogic.gdx.graphics.Color;

public final class jj0 {
  public Color yk;
  
  public Color O2;
  
  public Color YD0;
  
  public QB0 AUX;
  
  public su Wa;
  
  public jj0() {
    Color color;
    this(1.0F, 1.0F, 1.0F, 1.0F);
    this.yk = this;
  }
  
  public jj0(Me paramMe, Color paramColor, ES paramES, QB0 paramQB0, su paramsu) {
    this(1.0F, 1.0F, 1.0F, 1.0F);
    this.yk = color;
    Color color;
    (color = new Color()).set(paramColor);
    this.AUX = paramQB0;
    this.Wa = paramsu;
  }
  
  public jj0(jj0 paramjj0) {
    this(1.0F, 1.0F, 1.0F, 1.0F);
    this.yk = color;
    paramjj0.getClass();
    Color color;
    (color = new Color()).set(paramjj0.yk);
    if (paramjj0.O2 != null)
      this.O2 = new Color(paramjj0.O2); 
    if (paramjj0.YD0 != null)
      this.YD0 = new Color(paramjj0.YD0); 
    this.AUX = new QB0(paramjj0.AUX);
    this.Wa = new su(paramjj0.Wa);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jj0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */