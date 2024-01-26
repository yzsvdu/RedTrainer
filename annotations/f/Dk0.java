package f;

import java.util.LinkedList;

public class Dk0 extends dQ {
  public String Vw0;
  
  public int KM;
  
  public boolean FX = false;
  
  public int jT;
  
  public int rW;
  
  public long qb0;
  
  public LinkedList R = new LinkedList();
  
  public long Pb0 = System.currentTimeMillis();
  
  public long gy0 = 0L;
  
  public int gv0 = 0;
  
  public Dk0() {
    this(1250, 0);
  }
  
  public Dk0(int paramInt1, int paramInt2) {
    super("");
    C70(et.T90);
    this.KM = 0;
    this.Vw0 = "";
    this.gy0 = System.currentTimeMillis();
    this.jT = paramInt1;
    this.rW = paramInt2;
  }
  
  public final void Rp0() {
    this.gv0 = 40;
  }
  
  public final void V90(throws paramthrows) {
    // Byte code:
    //   0: aload_0
    //   1: dup
    //   2: aload_1
    //   3: invokespecial V90 : (Lf/throws;)V
    //   6: getfield Vw0 : Ljava/lang/String;
    //   9: invokevirtual length : ()I
    //   12: aload_0
    //   13: getfield KM : I
    //   16: if_icmple -> 464
    //   19: aload_0
    //   20: getfield gv0 : I
    //   23: dup
    //   24: istore_1
    //   25: ifle -> 31
    //   28: goto -> 118
    //   31: getstatic f/km.MR : Lf/Gp0;
    //   34: dup
    //   35: astore_1
    //   36: ifnull -> 78
    //   39: aload_1
    //   40: getfield gt : [Lf/Fs;
    //   43: ifnull -> 51
    //   46: iconst_1
    //   47: istore_2
    //   48: goto -> 53
    //   51: iconst_0
    //   52: istore_2
    //   53: iload_2
    //   54: ifne -> 103
    //   57: aload_1
    //   58: getfield CJ0 : Lf/eq0;
    //   61: ifnull -> 69
    //   64: iconst_1
    //   65: istore_1
    //   66: goto -> 71
    //   69: iconst_0
    //   70: istore_1
    //   71: iload_1
    //   72: ifeq -> 78
    //   75: goto -> 103
    //   78: getstatic f/h1.sK0 : I
    //   81: dup
    //   82: istore_1
    //   83: iconst_2
    //   84: if_icmpeq -> 115
    //   87: iload_1
    //   88: iconst_3
    //   89: if_icmpeq -> 109
    //   92: iload_1
    //   93: iconst_4
    //   94: if_icmpeq -> 103
    //   97: bipush #25
    //   99: istore_1
    //   100: goto -> 118
    //   103: bipush #10
    //   105: istore_1
    //   106: goto -> 118
    //   109: bipush #15
    //   111: istore_1
    //   112: goto -> 118
    //   115: bipush #20
    //   117: istore_1
    //   118: aload_0
    //   119: iconst_0
    //   120: putfield FX : Z
    //   123: invokestatic currentTimeMillis : ()J
    //   126: aload_0
    //   127: getfield gy0 : J
    //   130: lsub
    //   131: iload_1
    //   132: i2l
    //   133: ldiv
    //   134: l2i
    //   135: aload_0
    //   136: getfield KM : I
    //   139: isub
    //   140: dup
    //   141: istore_1
    //   142: iconst_1
    //   143: if_icmpge -> 147
    //   146: return
    //   147: new java/lang/StringBuilder
    //   150: dup
    //   151: astore_2
    //   152: aload_0
    //   153: getfield wL : Ljava/lang/CharSequence;
    //   156: invokeinterface toString : ()Ljava/lang/String;
    //   161: invokespecial <init> : (Ljava/lang/String;)V
    //   164: iload_1
    //   165: ifle -> 453
    //   168: aload_0
    //   169: getfield KM : I
    //   172: aload_0
    //   173: getfield Vw0 : Ljava/lang/String;
    //   176: invokevirtual length : ()I
    //   179: if_icmpge -> 453
    //   182: aload_0
    //   183: getfield Vw0 : Ljava/lang/String;
    //   186: aload_0
    //   187: getfield KM : I
    //   190: invokevirtual charAt : (I)C
    //   193: dup
    //   194: istore_3
    //   195: aload_0
    //   196: dup
    //   197: getfield KM : I
    //   200: iconst_1
    //   201: iadd
    //   202: putfield KM : I
    //   205: iinc #1, -1
    //   208: bipush #123
    //   210: if_icmpne -> 444
    //   213: aload_0
    //   214: getfield Vw0 : Ljava/lang/String;
    //   217: ldc '}'
    //   219: invokevirtual contains : (Ljava/lang/CharSequence;)Z
    //   222: ifeq -> 444
    //   225: new java/lang/StringBuilder
    //   228: dup
    //   229: astore #4
    //   231: invokespecial <init> : ()V
    //   234: aload_0
    //   235: getfield KM : I
    //   238: aload_0
    //   239: getfield Vw0 : Ljava/lang/String;
    //   242: invokevirtual length : ()I
    //   245: if_icmpge -> 289
    //   248: aload_0
    //   249: getfield Vw0 : Ljava/lang/String;
    //   252: aload_0
    //   253: getfield KM : I
    //   256: invokevirtual charAt : (I)C
    //   259: dup
    //   260: istore_3
    //   261: aload_0
    //   262: dup
    //   263: getfield KM : I
    //   266: iconst_1
    //   267: iadd
    //   268: putfield KM : I
    //   271: bipush #125
    //   273: if_icmpne -> 279
    //   276: goto -> 289
    //   279: aload #4
    //   281: iload_3
    //   282: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   285: pop
    //   286: goto -> 234
    //   289: aload #4
    //   291: invokevirtual toString : ()Ljava/lang/String;
    //   294: ldc 'SCROLL'
    //   296: swap
    //   297: invokevirtual equals : (Ljava/lang/Object;)Z
    //   300: ifeq -> 391
    //   303: aload_2
    //   304: ldc '\\n'
    //   306: invokevirtual indexOf : (Ljava/lang/String;)I
    //   309: dup
    //   310: istore_1
    //   311: iflt -> 341
    //   314: iload_1
    //   315: aload_2
    //   316: invokevirtual length : ()I
    //   319: iconst_2
    //   320: isub
    //   321: if_icmpge -> 341
    //   324: new java/lang/StringBuilder
    //   327: dup
    //   328: astore_3
    //   329: aload_2
    //   330: iload_1
    //   331: iconst_1
    //   332: iadd
    //   333: invokevirtual substring : (I)Ljava/lang/String;
    //   336: invokespecial <init> : (Ljava/lang/String;)V
    //   339: aload_3
    //   340: astore_2
    //   341: aload_0
    //   342: getfield KM : I
    //   345: aload_0
    //   346: getfield Vw0 : Ljava/lang/String;
    //   349: invokevirtual length : ()I
    //   352: if_icmpge -> 453
    //   355: aload_0
    //   356: getfield Vw0 : Ljava/lang/String;
    //   359: aload_0
    //   360: getfield KM : I
    //   363: invokevirtual charAt : (I)C
    //   366: bipush #10
    //   368: if_icmpne -> 453
    //   371: aload_2
    //   372: aload_0
    //   373: dup
    //   374: getfield KM : I
    //   377: iconst_1
    //   378: iadd
    //   379: putfield KM : I
    //   382: bipush #10
    //   384: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   387: pop
    //   388: goto -> 453
    //   391: aload #4
    //   393: invokevirtual toString : ()Ljava/lang/String;
    //   396: ldc 'DELAY_'
    //   398: invokevirtual startsWith : (Ljava/lang/String;)Z
    //   401: ifeq -> 444
    //   404: aload_0
    //   405: aload #4
    //   407: invokevirtual toString : ()Ljava/lang/String;
    //   410: ldc '_'
    //   412: invokevirtual split : (Ljava/lang/String;)[Ljava/lang/String;
    //   415: iconst_1
    //   416: aaload
    //   417: bipush #16
    //   419: invokestatic parseInt : (Ljava/lang/String;I)I
    //   422: istore_1
    //   423: invokestatic currentTimeMillis : ()J
    //   426: iload_1
    //   427: bipush #33
    //   429: imul
    //   430: i2l
    //   431: ladd
    //   432: putfield gy0 : J
    //   435: goto -> 453
    //   438: invokevirtual printStackTrace : ()V
    //   441: goto -> 453
    //   444: aload_2
    //   445: iload_3
    //   446: invokevirtual append : (C)Ljava/lang/StringBuilder;
    //   449: pop
    //   450: goto -> 164
    //   453: aload_0
    //   454: aload_2
    //   455: invokevirtual toString : ()Ljava/lang/String;
    //   458: invokevirtual E1 : (Ljava/lang/String;)V
    //   461: goto -> 622
    //   464: aload_0
    //   465: getfield Vw0 : Ljava/lang/String;
    //   468: invokevirtual length : ()I
    //   471: aload_0
    //   472: getfield KM : I
    //   475: if_icmpne -> 622
    //   478: aload_0
    //   479: getfield Vw0 : Ljava/lang/String;
    //   482: invokevirtual isEmpty : ()Z
    //   485: ifne -> 506
    //   488: invokestatic currentTimeMillis : ()J
    //   491: aload_0
    //   492: getfield Pb0 : J
    //   495: lsub
    //   496: aload_0
    //   497: getfield jT : I
    //   500: i2l
    //   501: lcmp
    //   502: ifgt -> 506
    //   505: return
    //   506: aload_0
    //   507: getfield qb0 : J
    //   510: lconst_1
    //   511: lcmp
    //   512: ifge -> 522
    //   515: aload_0
    //   516: invokestatic currentTimeMillis : ()J
    //   519: putfield qb0 : J
    //   522: aload_0
    //   523: getfield Vw0 : Ljava/lang/String;
    //   526: invokevirtual isEmpty : ()Z
    //   529: ifne -> 550
    //   532: invokestatic currentTimeMillis : ()J
    //   535: aload_0
    //   536: getfield qb0 : J
    //   539: lsub
    //   540: aload_0
    //   541: getfield rW : I
    //   544: i2l
    //   545: lcmp
    //   546: ifgt -> 550
    //   549: return
    //   550: aload_0
    //   551: getfield R : Ljava/util/LinkedList;
    //   554: invokevirtual size : ()I
    //   557: ifle -> 622
    //   560: aload_0
    //   561: dup
    //   562: getfield R : Ljava/util/LinkedList;
    //   565: invokevirtual poll : ()Ljava/lang/Object;
    //   568: checkcast f/Rb
    //   571: aload_0
    //   572: iconst_0
    //   573: putfield KM : I
    //   576: getfield b : Ljava/lang/String;
    //   579: dup
    //   580: astore_1
    //   581: putfield Vw0 : Ljava/lang/String;
    //   584: aload_1
    //   585: invokevirtual isEmpty : ()Z
    //   588: ifeq -> 596
    //   591: lconst_0
    //   592: lstore_2
    //   593: goto -> 600
    //   596: invokestatic currentTimeMillis : ()J
    //   599: lstore_2
    //   600: aload_0
    //   601: dup
    //   602: dup2
    //   603: lload_2
    //   604: putfield Pb0 : J
    //   607: invokestatic currentTimeMillis : ()J
    //   610: putfield gy0 : J
    //   613: lconst_0
    //   614: putfield qb0 : J
    //   617: ldc ''
    //   619: invokevirtual E1 : (Ljava/lang/String;)V
    //   622: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 40
    //   #2	-> 58
    //   #3	-> 78
    //   #4	-> 153
    //   #5	-> 156
    //   #6	-> 161
    //   #7	-> 576
    //   #8	-> 581
    // Exception table:
    //   from	to	target	type
    //   404	422	438	java/lang/Exception
    //   423	426	438	java/lang/Exception
    //   432	438	438	java/lang/Exception
  }
  
  public final boolean bA0() {
    return (System.currentTimeMillis() - this.Pb0 <= this.jT) ? false : ((this.Vw0.length() > this.KM || this.R.size() > 0) ? false : ((this.qb0 < 1L) ? false : (!(!this.Vw0.isEmpty() && System.currentTimeMillis() - this.qb0 <= this.rW))));
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Dk0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */