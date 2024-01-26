package f;

public final class Pl0 implements Runnable {
  public Pl0(h2 paramh2) {}
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield aa : Lf/h2;
    //   4: dup
    //   5: astore_1
    //   6: getfield Ku0 : Lf/yb0;
    //   9: dup
    //   10: astore_2
    //   11: ifnonnull -> 59
    //   14: aload_0
    //   15: dup
    //   16: aload_1
    //   17: new f/yb0
    //   20: dup
    //   21: aload_0
    //   22: getfield aa : Lf/h2;
    //   25: invokespecial <init> : (Lf/h2;)V
    //   28: putfield Ku0 : Lf/yb0;
    //   31: getfield aa : Lf/h2;
    //   34: dup
    //   35: getfield Ku0 : Lf/yb0;
    //   38: invokevirtual J8 : (Lf/JG0;)V
    //   41: getfield aa : Lf/h2;
    //   44: getfield Bi0 : Lf/ge0;
    //   47: iconst_1
    //   48: istore_1
    //   49: getfield TG0 : Lf/protected;
    //   52: iload_1
    //   53: invokevirtual Fx0 : (Z)V
    //   56: goto -> 77
    //   59: aload_0
    //   60: aload_1
    //   61: aload_2
    //   62: invokevirtual jf0 : (Lf/JG0;)Z
    //   65: pop
    //   66: getfield aa : Lf/h2;
    //   69: getfield Bi0 : Lf/ge0;
    //   72: iconst_0
    //   73: istore_1
    //   74: goto -> 49
    //   77: aload_0
    //   78: getfield aa : Lf/h2;
    //   81: invokevirtual xI0 : ()V
    //   84: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 49
    //   #2	-> 53
    //   #3	-> 62
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Pl0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */