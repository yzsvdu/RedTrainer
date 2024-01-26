package f;

import java.io.File;

public final class hZ extends RD0 {
  public hZ(String paramString, G20 paramG20) {
    super(paramString, paramG20);
  }
  
  public hZ(File paramFile, G20 paramG20) {
    super(paramFile, paramG20);
  }
  
  public final RD0 f0(String paramString) {
    if (this.ml.getPath().length() == 0) {
      this(paramString);
      return new hZ(this, this.KU);
    } 
    this(((RD0)this).ml, paramString);
    File file1;
    File file2;
    return new hZ(file2, ((RD0)this).KU);
  }
  
  public final RD0 rB0(String paramString) {
    if (this.ml.getPath().length() != 0) {
      File file;
      this(this.ml.getParent(), paramString);
      return new hZ(file, this.KU);
    } 
    throw new JU("Cannot get the sibling of the root.");
  }
  
  public final RD0 wT() {
    File file;
    if ((file = this.ml.getParentFile()) == null)
      if (this.KU == G20.O30) {
        this("/");
      } else {
        this("");
      }  
    return new hZ(file, this.KU);
  }
  
  public final File bo() {
    G20 g20;
    return ((g20 = this.KU) == G20.yx) ? new File(XG.com5, this.ml.getPath()) : ((g20 == G20.XS) ? new File(XG.OE, this.ml.getPath()) : this.ml);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */