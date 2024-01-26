package f;

public abstract class LI {
  public Object ML;
  
  public int LPt4;
  
  public int Co;
  
  public String A60;
  
  public LI(Object paramObject, int paramInt1, int paramInt2, String paramString) {
    this.ML = paramObject;
    this.LPt4 = paramInt1;
    this.Co = paramInt2;
    if (paramString.length() > 100)
      paramString = paramString.substring(0, 99); 
    this.A60 = paramString;
  }
  
  public abstract iC0 ey();
  
  public final int Pp0() {
    return this.LPt4;
  }
  
  public final int pQ() {
    return this.Co;
  }
  
  public final String oS() {
    return this.A60;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */