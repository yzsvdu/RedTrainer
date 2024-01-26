package f;

public final class He extends t4 {
  public He(Yj paramYj) {}
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield OH : Lf/Yj;
    //   4: dup
    //   5: astore_1
    //   6: getfield Cd : Z
    //   9: ifne -> 34
    //   12: aload_1
    //   13: getfield Qs0 : Ljava/lang/String;
    //   16: ifnonnull -> 34
    //   19: getstatic f/km.mI0 : Lf/P1;
    //   22: getfield Mv0 : Z
    //   25: ifne -> 34
    //   28: aload_0
    //   29: iconst_0
    //   30: putfield cL0 : Z
    //   33: return
    //   34: aload_0
    //   35: dup
    //   36: monitorenter
    //   37: getfield OH : Lf/Yj;
    //   40: dup
    //   41: astore_1
    //   42: getfield au0 : Z
    //   45: ifeq -> 51
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: aload_1
    //   52: getfield Qs0 : Ljava/lang/String;
    //   55: ifnonnull -> 83
    //   58: getstatic f/km.mI0 : Lf/P1;
    //   61: getfield Mv0 : Z
    //   64: ifeq -> 70
    //   67: goto -> 83
    //   70: aload_0
    //   71: dup
    //   72: aload_1
    //   73: iconst_1
    //   74: putfield au0 : Z
    //   77: monitorexit
    //   78: iconst_1
    //   79: putfield cL0 : Z
    //   82: return
    //   83: aload_0
    //   84: monitorexit
    //   85: return
    //   86: aload_0
    //   87: monitorexit
    //   88: athrow
    // Exception table:
    //   from	to	target	type
    //   37	40	86	finally
    //   42	45	86	finally
    //   48	50	86	finally
    //   51	55	86	finally
    //   58	64	86	finally
    //   70	78	86	finally
    //   83	85	86	finally
    //   86	88	86	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/He.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */