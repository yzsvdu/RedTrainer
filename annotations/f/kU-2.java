package f;

import com.badlogic.gdx.graphics.Color;
import java.util.Arrays;

public class kU {
  public int Mj = -1;
  
  public int fl = -1;
  
  public int zC = 640;
  
  public int e6 = 480;
  
  public int K3 = -1;
  
  public int nJ0 = -1;
  
  public int IK = -1;
  
  public int ed0 = -1;
  
  public boolean c0 = true;
  
  public boolean yH = true;
  
  public boolean CoM8 = false;
  
  public ba Rn0;
  
  public boolean Og0 = true;
  
  public G20 Hz0;
  
  public String[] FG0;
  
  public oY Q90;
  
  public KZ Sl0;
  
  public String pk0;
  
  public Color Eq0 = Color.BLACK;
  
  public boolean GL = true;
  
  public boolean fn0 = true;
  
  public final void RA0(kU paramkU) {
    this.Mj = paramkU.Mj;
    this.fl = paramkU.fl;
    this.zC = paramkU.zC;
    this.e6 = paramkU.e6;
    this.K3 = paramkU.K3;
    this.nJ0 = paramkU.nJ0;
    this.IK = paramkU.IK;
    this.ed0 = paramkU.ed0;
    this.c0 = paramkU.c0;
    this.yH = paramkU.yH;
    this.CoM8 = paramkU.CoM8;
    this.Rn0 = paramkU.Rn0;
    this.Og0 = paramkU.Og0;
    this.Hz0 = paramkU.Hz0;
    String[] arrayOfString;
    if ((arrayOfString = paramkU.FG0) != null)
      this.FG0 = Arrays.<String>copyOf(arrayOfString, arrayOfString.length); 
    this.Q90 = paramkU.Q90;
    this.Sl0 = paramkU.Sl0;
    this.pk0 = paramkU.pk0;
    this.Eq0 = paramkU.Eq0;
    this.GL = paramkU.GL;
    this.fn0 = paramkU.fn0;
  }
  
  public final void YF0(int paramInt1, int paramInt2) {
    this.zC = paramInt1;
    this.e6 = paramInt2;
  }
  
  public final void wY(boolean paramBoolean) {
    this.yH = paramBoolean;
  }
  
  public final void b80(boolean paramBoolean) {
    this.CoM8 = paramBoolean;
  }
  
  public final void MP() {
    this.Og0 = true;
  }
  
  public final void Q00(int paramInt1, int paramInt2) {
    this.Mj = paramInt1;
    this.fl = paramInt2;
  }
  
  public final void rj(G20 paramG20, String... paramVarArgs) {
    this.Hz0 = paramG20;
    this.FG0 = paramVarArgs;
  }
  
  public final void Se(oY paramoY) {
    this.Q90 = paramoY;
  }
  
  public final void Z7(Zv paramZv) {
    this.Sl0 = (KZ)paramZv;
  }
  
  public final void wE0() {
    this.pk0 = "PokeMMO";
  }
  
  public final void ww(boolean paramBoolean) {
    this.fn0 = paramBoolean;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */