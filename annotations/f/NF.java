package f;

public final class NF {
  public final String Rk0;
  
  public final String I10;
  
  public final String Ys0;
  
  public NF(String paramString1, String paramString2, String paramString3) {
    this.Rk0 = paramString1;
    this.I10 = paramString2;
    this.Ys0 = paramString3;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject instanceof NF) {
      paramObject = paramObject;
      String str1;
      String str2;
      return ((((str2 = this.Rk0) == null) ? (((NF)paramObject).Rk0 == null) : str2.equals(((NF)paramObject).Rk0)) && (((str2 = this.I10) == null) ? (((NF)paramObject).I10 == null) : str2.equals(((NF)paramObject).I10)) && (((str1 = this.Ys0) == null) ? (((NF)paramObject).Ys0 == null) : equals(((NF)paramObject).Ys0)));
    } 
    return false;
  }
  
  public final int hashCode() {
    byte b1;
    byte b3;
    byte b2;
    int j = 371;
    String str3;
    if ((str3 = this.Rk0) != null) {
      b3 = str3.hashCode();
    } else {
      b3 = 0;
    } 
    j = (j + b3) * 53;
    String str2;
    if ((str2 = this.I10) != null) {
      b2 = str2.hashCode();
    } else {
      b2 = 0;
    } 
    int i = (j + b2) * 53;
    String str1;
    if ((str1 = this.Ys0) != null) {
      b1 = str1.hashCode();
    } else {
      b1 = 0;
    } 
    return i + b1;
  }
  
  public final String toString() {
    StringBuilder stringBuilder = (new StringBuilder()).append(this.Rk0);
    if (this.I10 != null)
      stringBuilder.append('.').append(this.I10); 
    if (this.Ys0 != null)
      stringBuilder.append('#').append(this.Ys0); 
    return stringBuilder.toString();
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NF.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */