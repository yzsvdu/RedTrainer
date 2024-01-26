package f;

public final class hz {
  public eM GG0;
  
  public Wd bz;
  
  public fQ EB0;
  
  public fQ wr;
  
  public float QE0;
  
  public hz(Wd paramWd, fQ paramfQ) {
    this.GG0 = new eM();
    this.bz = paramWd;
    this.wr = paramfQ;
    this.QE0 = 0.01752F;
    String[] arrayOfString = (paramWd.TE.yO(((Gc0)paramfQ.get(0)).oz0)).Ih.split("\\.");
    byte b = 0;
    Q70 q70 = paramWd.K5.W5().H9();
    while (q70.hasNext()) {
      String str;
      String[] arrayOfString1;
      if (!(arrayOfString1 = (str = q70.next()).split("\\."))[0].equalsIgnoreCase(arrayOfString[0]))
        continue; 
      if (!this.GG0.uW(arrayOfString1[0]))
        this.GG0.Ed0(arrayOfString1[0], new ai(str)); 
      ((ai)this.GG0.bK(arrayOfString1[0])).ZP.Com3(str);
      ((ai)this.GG0.bK(arrayOfString1[0])).ej.Com3(paramWd.zg0.Mr().get(b));
      b++;
    } 
  }
  
  public hz(String paramString, Wd paramWd, fQ paramfQ, float paramFloat) {
    ai ai;
    this.GG0 = new eM();
    this.bz = paramWd;
    this.EB0 = paramfQ;
    this.QE0 = paramFloat;
    this(paramString);
    this.GG0.Ed0(paramString, this);
    Hc0 hc0 = paramWd.K5.Mr().r30();
    while (hc0.hasNext()) {
      String str = (String)hc0.next();
      this.ZP.Com3(str);
      this.ej.Com3(paramWd.zg0.Mr().get(0));
    } 
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hz.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */