package f;

import com.badlogic.gdx.graphics.Texture;

public final class RS implements iq0 {
  public Y00 zy0;
  
  public JX Xh;
  
  public Texture RE0;
  
  public boolean lpT5 = false;
  
  public IF0 bv = null;
  
  public final void dispose() {
    Y00 y00;
    if ((y00 = this.zy0) != null)
      y00.dispose(); 
    JX jX;
    if ((jX = this.Xh) != null)
      jX.dispose(); 
    Texture texture;
    if ((texture = this.RE0) != null)
      dispose(); 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/RS.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */