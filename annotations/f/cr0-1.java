package f;

public final class cr0 extends U90 {
  public cr0(Ip paramIp) {
    super(paramIp);
  }
  
  public final int iD(int paramInt) {
    int i = 0;
    byte b = 0;
    int j = this.gs.size();
    while (b < j) {
      eD0 eD0 = this.gs.get(b);
      if (this.R6.N00 || eD0.Cg())
        i = eD0.iD(paramInt) + i; 
      b++;
    } 
    return i;
  }
  
  public final int fV(int paramInt) {
    int i = 0;
    byte b = 0;
    int j = this.gs.size();
    while (b < j) {
      eD0 eD0 = this.gs.get(b);
      if (this.R6.N00 || eD0.Cg())
        i = eD0.fV(paramInt) + i; 
      b++;
    } 
    return i;
  }
  
  public final int Ab0(int paramInt) {
    int i = 0;
    boolean bool = false;
    byte b = 0;
    int j = this.gs.size();
    while (b < j) {
      eD0 eD0 = this.gs.get(b);
      if (this.R6.N00 || eD0.Cg()) {
        int k;
        if ((k = eD0.Ab0(paramInt)) > 0) {
          i += k;
          bool = true;
        } else {
          i = eD0.fV(paramInt) + i;
        } 
      } 
      b++;
    } 
    if (!bool)
      i = 0; 
    return i;
  }
  
  public final void fA0() {
    if (this.gs.size() > 1) {
      int i = 1;
      byte b = 0;
      while (b < this.gs.size()) {
        int j;
        eD0 eD0 = this.gs.get(b);
        if (this.R6.N00 || eD0.Cg()) {
          boolean bool;
          if (eD0 instanceof rb || eD0 instanceof Ei0) {
            bool = true;
          } else {
            bool = false;
          } 
          if (!bool && !i) {
            rb rb;
            i = b + 1;
            this(this.R6, -4, -4, -4, true);
            this.gs.add(b, rb);
            j = i;
          } 
          i = bool;
        } 
        j++;
      } 
    } 
    super.fA0();
  }
  
  public final void bO(int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: iload_3
    //   1: aload_0
    //   2: iload_1
    //   3: invokevirtual fV : (I)I
    //   6: dup
    //   7: istore #4
    //   9: if_icmpne -> 82
    //   12: aload_0
    //   13: getfield gs : Ljava/util/ArrayList;
    //   16: invokevirtual iterator : ()Ljava/util/Iterator;
    //   19: astore_3
    //   20: aload_3
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 566
    //   29: aload_0
    //   30: aload_3
    //   31: invokeinterface next : ()Ljava/lang/Object;
    //   36: checkcast f/eD0
    //   39: astore #4
    //   41: getfield R6 : Lf/Ip;
    //   44: getfield N00 : Z
    //   47: ifne -> 58
    //   50: aload #4
    //   52: invokevirtual Cg : ()Z
    //   55: ifeq -> 20
    //   58: aload #4
    //   60: iload_1
    //   61: invokevirtual fV : (I)I
    //   64: dup
    //   65: istore #5
    //   67: aload #4
    //   69: iload_1
    //   70: iload_2
    //   71: iload #5
    //   73: invokevirtual bO : (III)V
    //   76: iload_2
    //   77: iadd
    //   78: istore_2
    //   79: goto -> 20
    //   82: aload_0
    //   83: getfield gs : Ljava/util/ArrayList;
    //   86: invokevirtual size : ()I
    //   89: iconst_1
    //   90: if_icmpne -> 113
    //   93: aload_0
    //   94: getfield gs : Ljava/util/ArrayList;
    //   97: iconst_0
    //   98: invokevirtual get : (I)Ljava/lang/Object;
    //   101: checkcast f/eD0
    //   104: iload_1
    //   105: iload_2
    //   106: iload_3
    //   107: invokevirtual bO : (III)V
    //   110: goto -> 566
    //   113: aload_0
    //   114: getfield gs : Ljava/util/ArrayList;
    //   117: invokevirtual size : ()I
    //   120: iconst_1
    //   121: if_icmple -> 566
    //   124: iload_3
    //   125: iload #4
    //   127: isub
    //   128: dup
    //   129: istore_3
    //   130: ifge -> 139
    //   133: iconst_1
    //   134: istore #4
    //   136: goto -> 142
    //   139: iconst_0
    //   140: istore #4
    //   142: iload #4
    //   144: ifeq -> 150
    //   147: iload_3
    //   148: ineg
    //   149: istore_3
    //   150: aload_0
    //   151: getfield gs : Ljava/util/ArrayList;
    //   154: invokevirtual size : ()I
    //   157: anewarray f/a90
    //   160: astore #5
    //   162: iconst_0
    //   163: istore #6
    //   165: iconst_0
    //   166: istore #7
    //   168: iload #7
    //   170: aload_0
    //   171: getfield gs : Ljava/util/ArrayList;
    //   174: invokevirtual size : ()I
    //   177: if_icmpge -> 291
    //   180: aload_0
    //   181: dup
    //   182: getfield gs : Ljava/util/ArrayList;
    //   185: iload #7
    //   187: invokevirtual get : (I)Ljava/lang/Object;
    //   190: checkcast f/eD0
    //   193: astore #8
    //   195: getfield R6 : Lf/Ip;
    //   198: getfield N00 : Z
    //   201: ifne -> 212
    //   204: aload #8
    //   206: invokevirtual Cg : ()Z
    //   209: ifeq -> 285
    //   212: iload #4
    //   214: ifeq -> 235
    //   217: aload #8
    //   219: iload_1
    //   220: invokevirtual fV : (I)I
    //   223: aload #8
    //   225: iload_1
    //   226: invokevirtual iD : (I)I
    //   229: isub
    //   230: istore #8
    //   232: goto -> 250
    //   235: aload #8
    //   237: iload_1
    //   238: invokevirtual Ab0 : (I)I
    //   241: aload #8
    //   243: iload_1
    //   244: invokevirtual fV : (I)I
    //   247: isub
    //   248: istore #8
    //   250: iload #8
    //   252: ifle -> 285
    //   255: aload #5
    //   257: iload #6
    //   259: iconst_1
    //   260: iadd
    //   261: istore #9
    //   263: new f/a90
    //   266: dup
    //   267: astore #10
    //   269: iload #7
    //   271: iload #8
    //   273: invokespecial <init> : (II)V
    //   276: iload #6
    //   278: aload #10
    //   280: aastore
    //   281: iload #9
    //   283: istore #6
    //   285: iinc #7, 1
    //   288: goto -> 168
    //   291: iload #6
    //   293: ifle -> 467
    //   296: iload #6
    //   298: iconst_1
    //   299: if_icmple -> 310
    //   302: aload #5
    //   304: iconst_0
    //   305: iload #6
    //   307: invokestatic sort : ([Ljava/lang/Object;II)V
    //   310: aload_0
    //   311: getfield gs : Ljava/util/ArrayList;
    //   314: invokevirtual size : ()I
    //   317: newarray int
    //   319: astore #7
    //   321: iconst_0
    //   322: istore #8
    //   324: iload #6
    //   326: istore #9
    //   328: iload #8
    //   330: iload #6
    //   332: if_icmpge -> 391
    //   335: iload #4
    //   337: iload_3
    //   338: dup
    //   339: iload #9
    //   341: aload #5
    //   343: iload #8
    //   345: aaload
    //   346: astore_3
    //   347: idiv
    //   348: aload_3
    //   349: getfield Bz0 : I
    //   352: swap
    //   353: invokestatic min : (II)I
    //   356: dup
    //   357: istore #10
    //   359: isub
    //   360: istore #11
    //   362: iinc #9, -1
    //   365: ifeq -> 373
    //   368: iload #10
    //   370: ineg
    //   371: istore #10
    //   373: aload #7
    //   375: aload_3
    //   376: getfield qq : I
    //   379: iload #10
    //   381: iastore
    //   382: iinc #8, 1
    //   385: iload #11
    //   387: istore_3
    //   388: goto -> 328
    //   391: iconst_0
    //   392: istore_3
    //   393: iload_3
    //   394: aload_0
    //   395: getfield gs : Ljava/util/ArrayList;
    //   398: invokevirtual size : ()I
    //   401: if_icmpge -> 566
    //   404: aload_0
    //   405: dup
    //   406: getfield gs : Ljava/util/ArrayList;
    //   409: iload_3
    //   410: invokevirtual get : (I)Ljava/lang/Object;
    //   413: checkcast f/eD0
    //   416: astore #4
    //   418: getfield R6 : Lf/Ip;
    //   421: getfield N00 : Z
    //   424: ifne -> 435
    //   427: aload #4
    //   429: invokevirtual Cg : ()Z
    //   432: ifeq -> 461
    //   435: aload #4
    //   437: iload_1
    //   438: invokevirtual fV : (I)I
    //   441: aload #7
    //   443: iload_3
    //   444: iaload
    //   445: iadd
    //   446: dup
    //   447: istore #5
    //   449: iload_2
    //   450: aload #4
    //   452: iload_1
    //   453: iload_2
    //   454: iload #5
    //   456: invokevirtual bO : (III)V
    //   459: iadd
    //   460: istore_2
    //   461: iinc #3, 1
    //   464: goto -> 393
    //   467: aload_0
    //   468: getfield gs : Ljava/util/ArrayList;
    //   471: invokevirtual iterator : ()Ljava/util/Iterator;
    //   474: astore_3
    //   475: aload_3
    //   476: invokeinterface hasNext : ()Z
    //   481: ifeq -> 566
    //   484: aload_0
    //   485: aload_3
    //   486: invokeinterface next : ()Ljava/lang/Object;
    //   491: checkcast f/eD0
    //   494: astore #5
    //   496: getfield R6 : Lf/Ip;
    //   499: getfield N00 : Z
    //   502: ifne -> 513
    //   505: aload #5
    //   507: invokevirtual Cg : ()Z
    //   510: ifeq -> 475
    //   513: iload #4
    //   515: ifeq -> 529
    //   518: aload #5
    //   520: iload_1
    //   521: invokevirtual iD : (I)I
    //   524: istore #6
    //   526: goto -> 549
    //   529: aload #5
    //   531: iload_1
    //   532: invokevirtual Ab0 : (I)I
    //   535: dup
    //   536: istore #6
    //   538: ifne -> 549
    //   541: aload #5
    //   543: iload_1
    //   544: invokevirtual fV : (I)I
    //   547: istore #6
    //   549: iload_2
    //   550: aload #5
    //   552: iload_1
    //   553: iload_2
    //   554: iload #6
    //   556: invokevirtual bO : (III)V
    //   559: iload #6
    //   561: iadd
    //   562: istore_2
    //   563: goto -> 475
    //   566: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 151
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/cr0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */