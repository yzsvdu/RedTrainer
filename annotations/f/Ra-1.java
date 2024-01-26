package f;

public final class Ra extends dj {
  public static final long a30 = dj.tv0("texFormat");
  
  public static final long SG0 = dj.tv0("GX_TEXFMT_A5I3");
  
  public int ek0;
  
  public static Boolean yv(long paramLong) {
    if ((paramLong & a30) != 0L || (paramLong & SG0) != 0L)
      return Boolean.valueOf(true); 
  }
  
  public Ra(long paramLong) {
    super(paramLong);
    if (yv(paramLong).booleanValue())
      return; 
    throw new JU("Invalid type specified");
  }
  
  public Ra(long paramLong, int paramInt) {
    this(paramLong);
    this.ek0 = paramInt;
  }
  
  public Ra(Ra paramRa) {
    this(l, i);
  }
  
  public final dj Mi0() {
    return new Ra(this);
  }
  
  public final int hashCode() {
    return super.hashCode() * 5 + (this.ek0 ^ this.ek0 >>> 32);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ra.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */