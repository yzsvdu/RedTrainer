package f;

import java.io.IOException;
import java.util.zip.ZipException;
import java.util.zip.ZipFile;

public abstract class Uu {
  public static final ik re0 = C00.gd(Uu.class);
  
  public static Xt0 Cw;
  
  public static RD0 Rm() {
    return Cw.resolve("twl.fragment.glsl");
  }
  
  static {
    if (Cw == null) {
      Cw = new cb("data/shaders/");
      if (!km.ER())
        try {
          hZ hZ;
          if ((hZ = UB0.vj0.aP("data/shaders.pak")).L0()) {
            ZipFile zipFile;
            this(hZ.bo());
            Cw = new qg0(new Xt0[] { Cw, new pZ(zipFile) });
          } 
        } catch (ZipException zipException) {
          re0.error("Error loading shader data.", zipException);
          throw new JU("Error loading shader data.");
        } catch (IOException iOException) {
          re0.error("Error loading shader data.", iOException);
          throw new JU("Error loading shader data.");
        }  
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Uu.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */