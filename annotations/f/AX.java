package f;

public final class AX extends me implements iq0 {
  public static final ik AV = C00.gd(AX.class);
  
  public final eo b1 = new eo();
  
  public final eo ex0 = new eo(4.0F, 0.0F, 3.0F);
  
  public fQ tW = new fQ(false, 16);
  
  public f7 Lv0;
  
  public S0 K80;
  
  public Wd jy0;
  
  public float Mt = 64.0F;
  
  public AX(pI parampI) {
    super(parampI);
    VV vV;
    vk vk;
    this.K80 = (vk = km.mI0.AN.P().Sa0(vV = VV.i60, 18)).Hc0;
    this.Lv0 = vk.ip0;
    this.jy0 = km.mI0.AN.oB(this, 18);
    Q50(75, 0.0F, 0.0F);
    Q50(75, 4.0F, 0.0F);
    Q50(75, 0.0F, 2.0F);
    Q50(75, 4.0F, 2.0F);
    Q50(75, 0.0F, 4.0F);
    Q50(75, 4.0F, 4.0F);
    Q50(187, 2.0F, 6.0F);
    Q50(183, 0.0F, 8.0F);
    Q50(182, 4.0F, 8.0F);
    Q50(216, 8.0F, 2.0F);
    Q50(216, 8.0F, 4.0F);
    Q50(214, 8.0F, 8.0F);
    Q50(213, 2.0F, 10.0F);
    Q50(213, 6.0F, 10.0F);
    vk.ip0.t9();
    parampI.rH0().YE0((short)1).tW();
  }
  
  public final void dispose() {
    super.dispose();
    Hc0 hc0 = this.tW.r30();
    while (hc0.hasNext())
      ((Iq)hc0.next()).dispose(); 
    this.tW.clear();
  }
  
  public final void Q50(int paramInt, float paramFloat1, float paramFloat2) {
    // Byte code:
    //   0: aload_0
    //   1: getfield K80 : Lf/S0;
    //   4: getfield Vr0 : Ljava/util/HashMap;
    //   7: iload_1
    //   8: i2s
    //   9: invokestatic valueOf : (S)Ljava/lang/Short;
    //   12: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast f/Mh0
    //   18: dup
    //   19: astore #4
    //   21: ifnonnull -> 52
    //   24: getstatic f/AX.AV : Lf/ik;
    //   27: new java/lang/StringBuilder
    //   30: dup
    //   31: invokespecial <init> : ()V
    //   34: ldc 'Unable to load model: '
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: iload_1
    //   40: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   43: invokevirtual toString : ()Ljava/lang/String;
    //   46: invokeinterface info : (Ljava/lang/String;)V
    //   51: return
    //   52: aload_0
    //   53: aload #4
    //   55: dup
    //   56: invokevirtual DI0 : ()V
    //   59: getfield sD : Lf/Q1;
    //   62: astore #5
    //   64: aconst_null
    //   65: astore #6
    //   67: getfield Lv0 : Lf/f7;
    //   70: iload_1
    //   71: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   74: invokevirtual GB0 : (Ljava/lang/Object;)Z
    //   77: ifeq -> 112
    //   80: new f/lpt1
    //   83: dup
    //   84: astore #4
    //   86: iload_1
    //   87: aload #4
    //   89: aload_0
    //   90: getfield Lv0 : Lf/f7;
    //   93: iload_1
    //   94: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   97: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
    //   100: checkcast f/lpt1
    //   103: invokespecial <init> : (Lf/lpt1;)V
    //   106: putfield jx : I
    //   109: goto -> 346
    //   112: new f/Iq
    //   115: dup
    //   116: astore #7
    //   118: aload_0
    //   119: aload #5
    //   121: aload_0
    //   122: aload #7
    //   124: invokespecial <init> : ()V
    //   127: getfield tW : Lf/fQ;
    //   130: aload #7
    //   132: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   135: getfield Nt : [Lf/hC;
    //   138: iconst_0
    //   139: aaload
    //   140: astore #8
    //   142: getfield jy0 : Lf/Wd;
    //   145: aload #8
    //   147: swap
    //   148: invokevirtual yq : (Lf/hC;Lf/Wd;)V
    //   151: getstatic f/h1.Pm : Z
    //   154: ifeq -> 236
    //   157: getstatic f/km.ln : Lf/ei;
    //   160: getfield dh0 : [Lf/IZ;
    //   163: iconst_2
    //   164: aaload
    //   165: aload #4
    //   167: getstatic f/VV.i60 : Lf/VV;
    //   170: astore #6
    //   172: getfield yn0 : I
    //   175: istore #8
    //   177: aload #6
    //   179: bipush #18
    //   181: iload #8
    //   183: aload #7
    //   185: invokevirtual yd0 : (Lf/VV;IILf/Iq;)Lf/lpt1;
    //   188: dup
    //   189: astore #6
    //   191: ifnull -> 236
    //   194: aload #4
    //   196: getfield Fe0 : Lf/fQ;
    //   199: getfield Z8 : I
    //   202: ifle -> 236
    //   205: aload #6
    //   207: invokestatic Lj : ()Lf/eI;
    //   210: aload #4
    //   212: aload_0
    //   213: getfield jy0 : Lf/Wd;
    //   216: astore #8
    //   218: getfield Fe0 : Lf/fQ;
    //   221: astore #9
    //   223: invokevirtual getClass : ()Ljava/lang/Class;
    //   226: pop
    //   227: aload #8
    //   229: aload #7
    //   231: aload #9
    //   233: invokestatic aI : (Lf/lpt1;Lf/Wd;Lf/Ew;Lf/fQ;)V
    //   236: aload #6
    //   238: ifnonnull -> 322
    //   241: aload #5
    //   243: dup
    //   244: invokestatic Lj : ()Lf/eI;
    //   247: pop
    //   248: getfield Nt : [Lf/hC;
    //   251: iconst_0
    //   252: aaload
    //   253: aload_0
    //   254: getfield jy0 : Lf/Wd;
    //   257: invokestatic DG0 : (Lf/hC;Lf/Wd;)V
    //   260: invokestatic Lj : ()Lf/eI;
    //   263: astore #5
    //   265: getfield Nt : [Lf/hC;
    //   268: iconst_0
    //   269: aaload
    //   270: dup
    //   271: astore #6
    //   273: aload #7
    //   275: aload #5
    //   277: aload_0
    //   278: aload #4
    //   280: aload_0
    //   281: getfield jy0 : Lf/Wd;
    //   284: astore #4
    //   286: getfield Fe0 : Lf/fQ;
    //   289: astore #5
    //   291: getfield Mt : F
    //   294: aload #6
    //   296: getfield Sw : F
    //   299: fdiv
    //   300: fstore #6
    //   302: invokevirtual getClass : ()Ljava/lang/Class;
    //   305: pop
    //   306: aload #4
    //   308: aload #5
    //   310: fload #6
    //   312: iconst_0
    //   313: iconst_0
    //   314: invokestatic Q9 : (Lf/hC;Lf/Ew;Lf/Wd;Lf/fQ;FZZ)Lf/lpt1;
    //   317: astore #4
    //   319: goto -> 326
    //   322: aload #6
    //   324: astore #4
    //   326: aload #4
    //   328: iload_1
    //   329: aload_0
    //   330: getfield Lv0 : Lf/f7;
    //   333: iload_1
    //   334: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   337: aload #4
    //   339: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   342: pop
    //   343: putfield jx : I
    //   346: aload #4
    //   348: aload_0
    //   349: aload #4
    //   351: dup
    //   352: dup2
    //   353: aload_0
    //   354: dup
    //   355: getfield b1 : Lf/eo;
    //   358: fload_2
    //   359: fconst_0
    //   360: fload_3
    //   361: invokevirtual TG0 : (FFF)Lf/eo;
    //   364: pop
    //   365: getfield b1 : Lf/eo;
    //   368: aload_0
    //   369: getfield ex0 : Lf/eo;
    //   372: invokevirtual zT : (Lf/eo;)Lf/eo;
    //   375: pop
    //   376: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
    //   379: aload_0
    //   380: getfield b1 : Lf/eo;
    //   383: invokevirtual Ri0 : (Lf/eo;)V
    //   386: getfield Of : Lf/Eb;
    //   389: getfield pp0 : Lf/eo;
    //   392: aload_0
    //   393: getfield b1 : Lf/eo;
    //   396: invokevirtual zT : (Lf/eo;)Lf/eo;
    //   399: pop
    //   400: getfield Of : Lf/Eb;
    //   403: getfield s60 : Lf/eo;
    //   406: aload_0
    //   407: getfield b1 : Lf/eo;
    //   410: invokevirtual zT : (Lf/eo;)Lf/eo;
    //   413: pop
    //   414: getfield Of : Lf/Eb;
    //   417: dup
    //   418: dup
    //   419: getfield pp0 : Lf/eo;
    //   422: astore_0
    //   423: getfield s60 : Lf/eo;
    //   426: aload_0
    //   427: swap
    //   428: invokevirtual kX : (Lf/eo;Lf/eo;)Lf/Eb;
    //   431: pop
    //   432: getfield UH : Lf/fQ;
    //   435: aload #4
    //   437: invokevirtual Com3 : (Ljava/lang/Object;)V
    //   440: iconst_1
    //   441: iconst_0
    //   442: aconst_null
    //   443: invokevirtual rd : (IZLf/J3;)Lf/KI0;
    //   446: pop
    //   447: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 160
    //   #2	-> 164
    //   #3	-> 167
    //   #4	-> 443
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/AX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */