package f;

import com.badlogic.gdx.graphics.Texture;

public final class bL implements vf0 {
  public cu0 OT;
  
  public cu0 R00;
  
  public A00 y7;
  
  public A00 lPt4;
  
  public boolean Me;
  
  public bL() {
    cu0 cu01 = cu0.IE;
    this.OT = this;
    A00 a00 = A00.OW;
    this.y7 = this;
    this.Me = false;
  }
  
  public bL(cu0 paramcu01, cu0 paramcu02, A00 paramA001, A00 paramA002, boolean paramBoolean) {
    this.OT = paramcu01;
    this.R00 = paramcu02;
    this.y7 = paramA001;
    this.lPt4 = paramA002;
    this.Me = paramBoolean;
  }
  
  public final Texture j5(String paramString) {
    hZ hZ = UB0.vj0.aP(paramString);
    this(this, this.Me);
    cu0 cu01 = this.OT;
    texture.setFilter(this, this.R00);
    A00 a00 = this.y7;
    Texture texture;
    (texture = new Texture()).setWrap(this, this.lPt4);
    return new Texture();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bL.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */