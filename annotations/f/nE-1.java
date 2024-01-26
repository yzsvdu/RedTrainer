package f;

public final class nE extends t4 {
  public final void run() {
    // Byte code:
    //   0: getstatic f/km.mI0 : Lf/P1;
    //   3: getfield AN : Lf/Wo;
    //   6: ifnonnull -> 10
    //   9: return
    //   10: getstatic f/km.ln : Lf/ei;
    //   13: ifnonnull -> 26
    //   16: new f/ei
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: putstatic f/km.ln : Lf/ei;
    //   26: getstatic f/km.ln : Lf/ei;
    //   29: dup
    //   30: astore_1
    //   31: getfield tn : Lf/fQ;
    //   34: invokevirtual r30 : ()Lf/Hc0;
    //   37: astore_2
    //   38: aload_2
    //   39: invokevirtual hasNext : ()Z
    //   42: ifeq -> 69
    //   45: aload_2
    //   46: invokevirtual next : ()Ljava/lang/Object;
    //   49: checkcast f/IZ
    //   52: dup
    //   53: astore_3
    //   54: ifnull -> 38
    //   57: aload_3
    //   58: invokevirtual R7 : ()Z
    //   61: ifne -> 38
    //   64: iconst_0
    //   65: istore_1
    //   66: goto -> 78
    //   69: aload_1
    //   70: getfield tn : Lf/fQ;
    //   73: invokevirtual clear : ()V
    //   76: iconst_1
    //   77: istore_1
    //   78: aload_0
    //   79: iload_1
    //   80: putfield cL0 : Z
    //   83: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 31
    //   #2	-> 34
    //   #3	-> 80
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */