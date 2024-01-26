package f;

public class jo0 extends Fp {
  public final JG0 nV;
  
  public jo0(JG0 paramJG0) {
    if (paramJG0 != null) {
      this.nV = paramJG0;
      return;
    } 
    throw new NullPointerException("owner");
  }
  
  public String TI() {
    return "infowindow";
  }
  
  public final void OQ() {
    // Byte code:
    //   0: aload_0
    //   1: getfield fr0 : Lf/JG0;
    //   4: ifnull -> 8
    //   7: return
    //   8: aload_0
    //   9: getfield nV : Lf/JG0;
    //   12: astore_1
    //   13: aload_1
    //   14: ifnull -> 36
    //   17: aload_1
    //   18: instanceof f/jo0
    //   21: ifeq -> 28
    //   24: iconst_1
    //   25: goto -> 37
    //   28: aload_1
    //   29: getfield fr0 : Lf/JG0;
    //   32: astore_1
    //   33: goto -> 13
    //   36: iconst_0
    //   37: ifeq -> 41
    //   40: return
    //   41: aload_0
    //   42: getfield nV : Lf/JG0;
    //   45: getfield Bo0 : Lf/throws;
    //   48: dup
    //   49: astore_1
    //   50: ifnull -> 63
    //   53: aload_0
    //   54: aload_1
    //   55: aload_0
    //   56: invokevirtual fJ0 : (Lf/jo0;)V
    //   59: invokevirtual Ev0 : ()V
    //   62: return
    //   63: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 1
    //   #2	-> 9
    //   #3	-> 18
    //   #4	-> 29
    //   #5	-> 42
    //   #6	-> 45
    //   #7	-> 56
  }
  
  public void mg0() {}
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */