package f;

import com.badlogic.gdx.graphics.Color;

public final class su {
  public Color CC;
  
  public Color d50;
  
  public su() {
    Color color;
    this(1.0F, 1.0F, 1.0F, 1.0F);
    this.CC = this;
    this(1.0F, 1.0F, 1.0F, 1.0F);
    this.d50 = this;
  }
  
  public su(Me paramMe, Color paramColor1, Color paramColor2, ES paramES) {
    this.CC = new Color(1.0F, 1.0F, 1.0F, 1.0F);
    this.d50 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
    this.CC.set(paramColor1);
    this.d50.set(paramColor2);
  }
  
  public su(su paramsu) {
    this.CC = new Color(1.0F, 1.0F, 1.0F, 1.0F);
    this.d50 = new Color(1.0F, 1.0F, 1.0F, 1.0F);
    paramsu.getClass();
    this.CC.set(paramsu.CC);
    this.d50.set(paramsu.d50);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/su.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */