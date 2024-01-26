package f;

public final class oi implements Runnable {
  public oi(qt0 paramqt0) {}
  
  public final void run() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Qx : Lf/qt0;
    //   4: dup
    //   5: invokevirtual getClass : ()Ljava/lang/Class;
    //   8: pop
    //   9: getstatic f/km.u4 : Lf/R8;
    //   12: astore_0
    //   13: getfield nf0 : Lf/Tl0;
    //   16: aload_0
    //   17: getfield YS : [Lf/Dm0;
    //   20: swap
    //   21: getfield uQ : B
    //   24: aaload
    //   25: dup
    //   26: astore_0
    //   27: ifnonnull -> 34
    //   30: iconst_0
    //   31: goto -> 58
    //   34: aload_0
    //   35: dup
    //   36: monitorenter
    //   37: invokevirtual CoN : ()Ljava/util/List;
    //   40: iconst_0
    //   41: anewarray f/mq
    //   44: astore_1
    //   45: checkcast java/util/ArrayList
    //   48: aload_1
    //   49: invokevirtual toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
    //   52: checkcast [Lf/mq;
    //   55: aload_0
    //   56: monitorexit
    //   57: arraylength
    //   58: iconst_1
    //   59: if_icmpge -> 76
    //   62: getstatic f/js.vu0 : Lf/js;
    //   65: ldc 270315
    //   67: invokestatic OH0 : (I)Ljava/lang/String;
    //   70: iconst_m1
    //   71: swap
    //   72: invokevirtual Pu : (ILjava/lang/String;)V
    //   75: return
    //   76: iconst_2
    //   77: putstatic f/ro.l10 : B
    //   80: return
    //   81: astore_1
    //   82: aload_1
    //   83: aload_0
    //   84: monitorexit
    //   85: athrow
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 5
    //   #2	-> 9
    //   #3	-> 17
    //   #4	-> 21
    //   #5	-> 24
    //   #6	-> 36
    //   #7	-> 57
    //   #8	-> 62
    //   #9	-> 67
    //   #10	-> 72
    //   #11	-> 77
    //   #12	-> 84
    // Exception table:
    //   from	to	target	type
    //   37	44	81	finally
    //   45	57	81	finally
    //   82	85	81	finally
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */