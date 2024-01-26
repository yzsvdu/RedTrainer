package f;

public abstract class oo implements Runnable {
  public final Q50 F3;
  
  public long lu0;
  
  public long Sf0;
  
  public int tf;
  
  public volatile HC co0;
  
  public oo() {
    if ((this.F3 = UB0.Kg0) != null)
      return; 
    throw new IllegalStateException("Gdx.app not available.");
  }
  
  public final void uw0() {
    // Byte code:
    //   0: aload_0
    //   1: getfield co0 : Lf/HC;
    //   4: dup
    //   5: astore_1
    //   6: ifnull -> 50
    //   9: aload_1
    //   10: aload_0
    //   11: aload_1
    //   12: aload_0
    //   13: dup
    //   14: dup
    //   15: aload_1
    //   16: monitorenter
    //   17: monitorenter
    //   18: lconst_0
    //   19: putfield lu0 : J
    //   22: aconst_null
    //   23: putfield co0 : Lf/HC;
    //   26: getfield Hg0 : Lf/fQ;
    //   29: aload_0
    //   30: iconst_1
    //   31: invokevirtual Ct : (Ljava/lang/Object;Z)Z
    //   34: pop
    //   35: monitorexit
    //   36: monitorexit
    //   37: goto -> 63
    //   40: astore_2
    //   41: aload_2
    //   42: aload_0
    //   43: monitorexit
    //   44: athrow
    //   45: astore_0
    //   46: aload_0
    //   47: aload_1
    //   48: monitorexit
    //   49: athrow
    //   50: aload_0
    //   51: dup
    //   52: dup2
    //   53: monitorenter
    //   54: lconst_0
    //   55: putfield lu0 : J
    //   58: aconst_null
    //   59: putfield co0 : Lf/HC;
    //   62: monitorexit
    //   63: return
    //   64: astore_1
    //   65: aload_1
    //   66: aload_0
    //   67: monitorexit
    //   68: athrow
    // Exception table:
    //   from	to	target	type
    //   17	18	45	finally
    //   18	34	40	finally
    //   35	36	40	finally
    //   36	40	45	finally
    //   41	44	40	finally
    //   44	45	45	finally
    //   46	49	45	finally
    //   54	63	64	finally
    //   65	68	64	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oo.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */