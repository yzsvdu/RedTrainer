/* 1 */ package f;public class C30 implements Cloneable { public static final N4 wm = new N4(); public static final float Dd0 = Color.WHITE.toFloatBits(); public int yg; public int aQ; public int ot0 = -1; public int pK = -1; public int ec; public int hv; public int ik = 255; public ao Mm0; public int bE0; public float SG0 = Dd0; public int TI0 = 1; public int synchronized = 1; public float Y2; public final int mN() { if (this.lpt2 != null)
/* 2 */     { int i; int j; byte b; int[] arrayOfInt; for (i = (int)(zm0.u20 % this.ZZ), j = 0, b = 0; b < (arrayOfInt = this.lpt2).length; ) { if (i < (j += arrayOfInt[b])) return b;  b++; }  }  zh0[] arrayOfZh0; if ((arrayOfZh0 = this.do) != null)
/*   */     {
/* 4 */       return (int)(zm0.u20 / 50L % this.length); }  return 0; } public float Xm0 = 1.0F; public float ad = 1.0F; public float Ah; public float dJ0; public int Ua; public int mn; public float DC; public float Cz; public int[] lpt2; public int ZZ; public Texture TZ; public pe0 V20; public U70 td0; public zh0 WO; public zh0[] do; public final void go0() { // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield Mm0 : Lf/ao;
/*   */     //   4: dup
/*   */     //   5: astore_1
/*   */     //   6: ifnull -> 80
/*   */     //   9: aload_0
/*   */     //   10: aload_1
/*   */     //   11: aload_0
/*   */     //   12: getfield bE0 : I
/*   */     //   15: invokevirtual iF : (I)Lf/ao;
/*   */     //   18: astore_1
/*   */     //   19: new com/badlogic/gdx/graphics/Color
/*   */     //   22: dup
/*   */     //   23: aload_0
/*   */     //   24: swap
/*   */     //   25: aload_1
/*   */     //   26: invokevirtual k90 : ()I
/*   */     //   29: i2f
/*   */     //   30: ldc 255.0
/*   */     //   32: fdiv
/*   */     //   33: aload_1
/*   */     //   34: dup
/*   */     //   35: invokevirtual Mv : ()I
/*   */     //   38: i2f
/*   */     //   39: ldc 255.0
/*   */     //   41: fdiv
/*   */     //   42: fstore_0
/*   */     //   43: invokevirtual jz : ()I
/*   */     //   46: i2f
/*   */     //   47: ldc 255.0
/*   */     //   49: fdiv
/*   */     //   50: fload_0
/*   */     //   51: swap
/*   */     //   52: fconst_2
/*   */     //   53: invokespecial <init> : (FFFF)V
/*   */     //   56: getfield ik : I
/*   */     //   59: i2f
/*   */     //   60: ldc 255.0
/*   */     //   62: fdiv
/*   */     //   63: fstore_0
/*   */     //   64: fconst_1
/*   */     //   65: fconst_1
/*   */     //   66: fconst_1
/*   */     //   67: fload_0
/*   */     //   68: invokevirtual mul : (FFFF)Lcom/badlogic/gdx/graphics/Color;
/*   */     //   71: invokevirtual toFloatBits : ()F
/*   */     //   74: putfield SG0 : F
/*   */     //   77: goto -> 127
/*   */     //   80: aload_0
/*   */     //   81: getfield ik : I
/*   */     //   84: sipush #255
/*   */     //   87: if_icmpeq -> 120
/*   */     //   90: aload_0
/*   */     //   91: new com/badlogic/gdx/graphics/Color
/*   */     //   94: dup
/*   */     //   95: aload_0
/*   */     //   96: getfield ik : I
/*   */     //   99: i2f
/*   */     //   100: ldc 255.0
/*   */     //   102: fdiv
/*   */     //   103: fstore_0
/*   */     //   104: fconst_1
/*   */     //   105: fconst_1
/*   */     //   106: fconst_1
/*   */     //   107: fload_0
/*   */     //   108: invokespecial <init> : (FFFF)V
/*   */     //   111: invokevirtual toFloatBits : ()F
/*   */     //   114: putfield SG0 : F
/*   */     //   117: goto -> 127
/*   */     //   120: aload_0
/*   */     //   121: getstatic f/C30.Dd0 : F
/*   */     //   124: putfield SG0 : F
/* 4 */     //   127: return } public final int tr0() { int i; if ((i = this.ot0) != -1) return i;  Texture texture; if ((texture = this.TZ) != null) return texture.getWidth();  U70 u70; if ((u70 = this.td0) != null) return u70.HA0().getWidth();  pe0 pe01; if ((pe01 = this.V20) != null) return pe01.H0;  zh0 zh01; if ((zh01 = this.WO) != null) return zh01.Ys0;  zh0[] arrayOfZh0; if ((arrayOfZh0 = this.do) != null && this.length > 0)
/* 5 */       return (this[0]).Ys0;  return 0; } public final int ce0() { int i; if ((i = this.pK) != -1) return i;  Texture texture; if ((texture = this.TZ) != null) return texture.getHeight();  U70 u70; if ((u70 = this.td0) != null) return u70.HA0().getHeight();  pe0 pe01; if ((pe01 = this.V20) != null) return pe01.Vn0;  zh0 zh01; if ((zh01 = this.WO) != null) return zh01.Fj;  zh0[] arrayOfZh0; if ((arrayOfZh0 = this.do) != null && this.length > 0) return (this[0]).Fj;  return 0; }
/*   */ 
/*   */   
/*   */   public final void PG0(int paramInt1, int paramInt2) {
/*   */     this.yg = paramInt1;
/*   */     this.aQ = paramInt2;
/*   */   }
/*   */   
/*   */   public final void Po0(float paramFloat1, float paramFloat2) {
/*   */     this.DC = paramFloat1;
/*   */     this.Cz = paramFloat2;
/*   */   }
/*   */   
/*   */   public void KT(JX paramJX, int paramInt1, int paramInt2) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: iload_3
/*   */     //   3: aload_0
/*   */     //   4: iload_2
/*   */     //   5: putfield ec : I
/*   */     //   8: putfield hv : I
/*   */     //   11: getfield SG0 : F
/*   */     //   14: dup
/*   */     //   15: fstore #4
/*   */     //   17: getstatic f/C30.Dd0 : F
/*   */     //   20: dup
/*   */     //   21: fstore #5
/*   */     //   23: fcmpl
/*   */     //   24: ifeq -> 33
/*   */     //   27: aload_1
/*   */     //   28: fload #4
/*   */     //   30: invokevirtual og0 : (F)V
/*   */     //   33: aload_0
/*   */     //   34: dup
/*   */     //   35: getfield TZ : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   38: astore #4
/*   */     //   40: getfield td0 : Lf/U70;
/*   */     //   43: dup
/*   */     //   44: astore #6
/*   */     //   46: ifnull -> 56
/*   */     //   49: aload #6
/*   */     //   51: invokevirtual HA0 : ()Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   54: astore #4
/*   */     //   56: aload #4
/*   */     //   58: ifnull -> 286
/*   */     //   61: aload_1
/*   */     //   62: ifnull -> 286
/*   */     //   65: aload_0
/*   */     //   66: getfield Y2 : F
/*   */     //   69: dup
/*   */     //   70: fstore #6
/*   */     //   72: fconst_0
/*   */     //   73: fcmpl
/*   */     //   74: ifne -> 158
/*   */     //   77: aload_0
/*   */     //   78: getfield Xm0 : F
/*   */     //   81: fconst_1
/*   */     //   82: fcmpl
/*   */     //   83: ifne -> 158
/*   */     //   86: aload_0
/*   */     //   87: getfield ad : F
/*   */     //   90: fconst_1
/*   */     //   91: fcmpl
/*   */     //   92: ifne -> 158
/*   */     //   95: aload_0
/*   */     //   96: getfield Ah : F
/*   */     //   99: fconst_1
/*   */     //   100: fcmpl
/*   */     //   101: ifne -> 158
/*   */     //   104: aload_0
/*   */     //   105: getfield dJ0 : F
/*   */     //   108: fconst_0
/*   */     //   109: fcmpl
/*   */     //   110: ifne -> 158
/*   */     //   113: aload_1
/*   */     //   114: aload #4
/*   */     //   116: aload_0
/*   */     //   117: dup
/*   */     //   118: iload_3
/*   */     //   119: aload_0
/*   */     //   120: iload_2
/*   */     //   121: aload_0
/*   */     //   122: getfield Ua : I
/*   */     //   125: iadd
/*   */     //   126: i2f
/*   */     //   127: fstore_2
/*   */     //   128: getfield mn : I
/*   */     //   131: iadd
/*   */     //   132: i2f
/*   */     //   133: fstore_3
/*   */     //   134: invokevirtual tr0 : ()I
/*   */     //   137: i2f
/*   */     //   138: fstore #4
/*   */     //   140: invokevirtual ce0 : ()I
/*   */     //   143: i2f
/*   */     //   144: fstore #6
/*   */     //   146: fload_2
/*   */     //   147: fload_3
/*   */     //   148: fload #4
/*   */     //   150: fload #6
/*   */     //   152: invokevirtual Ap0 : (Lcom/badlogic/gdx/graphics/Texture;FFFF)V
/*   */     //   155: goto -> 575
/*   */     //   158: aload_1
/*   */     //   159: aload #4
/*   */     //   161: dup
/*   */     //   162: dup
/*   */     //   163: aload_0
/*   */     //   164: dup
/*   */     //   165: dup2
/*   */     //   166: dup2
/*   */     //   167: iload_3
/*   */     //   168: aload_0
/*   */     //   169: iload_2
/*   */     //   170: aload_0
/*   */     //   171: getfield Ua : I
/*   */     //   174: iadd
/*   */     //   175: i2f
/*   */     //   176: fstore_2
/*   */     //   177: getfield mn : I
/*   */     //   180: iadd
/*   */     //   181: i2f
/*   */     //   182: fstore_3
/*   */     //   183: getfield DC : F
/*   */     //   186: fstore #4
/*   */     //   188: getfield Cz : F
/*   */     //   191: fstore #7
/*   */     //   193: getfield yg : I
/*   */     //   196: i2f
/*   */     //   197: fstore #8
/*   */     //   199: getfield aQ : I
/*   */     //   202: i2f
/*   */     //   203: fstore #9
/*   */     //   205: getfield Xm0 : F
/*   */     //   208: aload_0
/*   */     //   209: getfield Ah : F
/*   */     //   212: fmul
/*   */     //   213: aload_0
/*   */     //   214: getfield TI0 : I
/*   */     //   217: i2f
/*   */     //   218: dup
/*   */     //   219: fstore #10
/*   */     //   221: fmul
/*   */     //   222: fstore #11
/*   */     //   224: getfield ad : F
/*   */     //   227: aload_0
/*   */     //   228: getfield dJ0 : F
/*   */     //   231: fmul
/*   */     //   232: fload #10
/*   */     //   234: fmul
/*   */     //   235: fstore #10
/*   */     //   237: invokevirtual getWidth : ()I
/*   */     //   240: aload_0
/*   */     //   241: getfield TI0 : I
/*   */     //   244: imul
/*   */     //   245: istore #12
/*   */     //   247: invokevirtual getHeight : ()I
/*   */     //   250: aload_0
/*   */     //   251: getfield synchronized : I
/*   */     //   254: imul
/*   */     //   255: istore #13
/*   */     //   257: fload_2
/*   */     //   258: fload_3
/*   */     //   259: fload #4
/*   */     //   261: fload #7
/*   */     //   263: fload #8
/*   */     //   265: fload #9
/*   */     //   267: fload #11
/*   */     //   269: fload #10
/*   */     //   271: fload #6
/*   */     //   273: iconst_0
/*   */     //   274: iconst_0
/*   */     //   275: iload #12
/*   */     //   277: iload #13
/*   */     //   279: iconst_0
/*   */     //   280: invokevirtual BE : (Lcom/badlogic/gdx/graphics/Texture;FFFFFFFFFIIIIZ)V
/*   */     //   283: goto -> 575
/*   */     //   286: aload_0
/*   */     //   287: dup
/*   */     //   288: getfield V20 : Lf/pe0;
/*   */     //   291: astore #4
/*   */     //   293: getfield do : [Lf/zh0;
/*   */     //   296: dup
/*   */     //   297: astore #6
/*   */     //   299: ifnull -> 323
/*   */     //   302: aload #6
/*   */     //   304: arraylength
/*   */     //   305: ifle -> 323
/*   */     //   308: aload #6
/*   */     //   310: aload_0
/*   */     //   311: invokevirtual mN : ()I
/*   */     //   314: aaload
/*   */     //   315: invokevirtual Uu0 : ()Lf/pe0;
/*   */     //   318: astore #4
/*   */     //   320: goto -> 340
/*   */     //   323: aload_0
/*   */     //   324: getfield WO : Lf/zh0;
/*   */     //   327: dup
/*   */     //   328: astore #6
/*   */     //   330: ifnull -> 340
/*   */     //   333: aload #6
/*   */     //   335: invokevirtual Uu0 : ()Lf/pe0;
/*   */     //   338: astore #4
/*   */     //   340: aload #4
/*   */     //   342: ifnull -> 575
/*   */     //   345: aload_0
/*   */     //   346: getfield Y2 : F
/*   */     //   349: dup
/*   */     //   350: fstore #6
/*   */     //   352: fconst_0
/*   */     //   353: fcmpl
/*   */     //   354: ifne -> 438
/*   */     //   357: aload_0
/*   */     //   358: getfield Xm0 : F
/*   */     //   361: fconst_1
/*   */     //   362: fcmpl
/*   */     //   363: ifne -> 438
/*   */     //   366: aload_0
/*   */     //   367: getfield ad : F
/*   */     //   370: fconst_1
/*   */     //   371: fcmpl
/*   */     //   372: ifne -> 438
/*   */     //   375: aload_0
/*   */     //   376: getfield Ah : F
/*   */     //   379: fconst_1
/*   */     //   380: fcmpl
/*   */     //   381: ifne -> 438
/*   */     //   384: aload_0
/*   */     //   385: getfield dJ0 : F
/*   */     //   388: fconst_0
/*   */     //   389: fcmpl
/*   */     //   390: ifne -> 438
/*   */     //   393: aload_1
/*   */     //   394: aload #4
/*   */     //   396: aload_0
/*   */     //   397: dup
/*   */     //   398: iload_3
/*   */     //   399: aload_0
/*   */     //   400: iload_2
/*   */     //   401: aload_0
/*   */     //   402: getfield Ua : I
/*   */     //   405: iadd
/*   */     //   406: i2f
/*   */     //   407: fstore_2
/*   */     //   408: getfield mn : I
/*   */     //   411: iadd
/*   */     //   412: i2f
/*   */     //   413: fstore_3
/*   */     //   414: getfield yg : I
/*   */     //   417: i2f
/*   */     //   418: fstore #4
/*   */     //   420: getfield aQ : I
/*   */     //   423: i2f
/*   */     //   424: fstore #6
/*   */     //   426: fload_2
/*   */     //   427: fload_3
/*   */     //   428: fload #4
/*   */     //   430: fload #6
/*   */     //   432: invokevirtual Yo0 : (Lf/pe0;FFFF)V
/*   */     //   435: goto -> 575
/*   */     //   438: aload_1
/*   */     //   439: aload #4
/*   */     //   441: dup
/*   */     //   442: dup2
/*   */     //   443: aload_0
/*   */     //   444: dup
/*   */     //   445: dup2
/*   */     //   446: dup2
/*   */     //   447: iload_3
/*   */     //   448: aload_0
/*   */     //   449: iload_2
/*   */     //   450: aload_0
/*   */     //   451: aload #4
/*   */     //   453: getfield G3 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   456: astore_2
/*   */     //   457: getfield Ua : I
/*   */     //   460: iadd
/*   */     //   461: i2f
/*   */     //   462: fstore_3
/*   */     //   463: getfield mn : I
/*   */     //   466: iadd
/*   */     //   467: i2f
/*   */     //   468: fstore #7
/*   */     //   470: getfield DC : F
/*   */     //   473: fstore #8
/*   */     //   475: getfield Cz : F
/*   */     //   478: fstore #9
/*   */     //   480: getfield yg : I
/*   */     //   483: i2f
/*   */     //   484: fstore #10
/*   */     //   486: getfield aQ : I
/*   */     //   489: i2f
/*   */     //   490: fstore #11
/*   */     //   492: getfield Xm0 : F
/*   */     //   495: aload_0
/*   */     //   496: getfield Ah : F
/*   */     //   499: fmul
/*   */     //   500: fstore #12
/*   */     //   502: getfield ad : F
/*   */     //   505: aload_0
/*   */     //   506: getfield dJ0 : F
/*   */     //   509: fmul
/*   */     //   510: fstore #13
/*   */     //   512: invokevirtual jg : ()I
/*   */     //   515: istore #14
/*   */     //   517: getfield WT : F
/*   */     //   520: aload #4
/*   */     //   522: getfield G3 : Lcom/badlogic/gdx/graphics/Texture;
/*   */     //   525: invokevirtual getHeight : ()I
/*   */     //   528: i2f
/*   */     //   529: fmul
/*   */     //   530: invokestatic round : (F)I
/*   */     //   533: istore #4
/*   */     //   535: getfield H0 : I
/*   */     //   538: istore #15
/*   */     //   540: getfield Vn0 : I
/*   */     //   543: istore #16
/*   */     //   545: aload_2
/*   */     //   546: fload_3
/*   */     //   547: fload #7
/*   */     //   549: fload #8
/*   */     //   551: fload #9
/*   */     //   553: fload #10
/*   */     //   555: fload #11
/*   */     //   557: fload #12
/*   */     //   559: fload #13
/*   */     //   561: fload #6
/*   */     //   563: iload #14
/*   */     //   565: iload #4
/*   */     //   567: iload #15
/*   */     //   569: iload #16
/*   */     //   571: iconst_0
/*   */     //   572: invokevirtual BE : (Lcom/badlogic/gdx/graphics/Texture;FFFFFFFFFIIIIZ)V
/*   */     //   575: aload_0
/*   */     //   576: getfield SG0 : F
/*   */     //   579: fload #5
/*   */     //   581: fcmpl
/*   */     //   582: ifeq -> 591
/*   */     //   585: aload_1
/*   */     //   586: fload #5
/*   */     //   588: invokevirtual og0 : (F)V
/*   */     //   591: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 35
/*   */     //   #2	-> 453
/*   */     //   #3	-> 457
/*   */     //   #4	-> 517
/*   */     //   #5	-> 535
/*   */     //   #6	-> 540
/*   */     //   #7	-> 572
/*   */     //   #8	-> 576
/*   */   }
/*   */   
/*   */   public final C30 pz() {
/*   */     try {
/*   */       return (C30)super.clone();
/*   */     } catch (CloneNotSupportedException cloneNotSupportedException) {
/*   */       return null;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void eU() {
/*   */     this.TI0 = 5;
/*   */     this.synchronized = 5;
/*   */   }
/*   */   
/*   */   public void Ht(tH paramtH) {
/*   */     int i = this.ec;
/*   */     int j = this.hv;
/*   */     KT(paramtH, i, j);
/*   */   }
/*   */   
/*   */   public C30() {
/*   */     this.Ah = 1.0F;
/*   */     this.dJ0 = 1.0F;
/*   */     this.lpt2 = null;
/*   */     this.ZZ = 0;
/*   */     this.TZ = null;
/*   */     this.V20 = null;
/*   */     this.td0 = null;
/*   */     this.WO = null;
/*   */     this.do = null;
/*   */   }
/*   */   
/*   */   public C30(Texture paramTexture) {
/*   */     this.Ah = 1.0F;
/*   */     this.dJ0 = 1.0F;
/*   */     this.lpt2 = null;
/*   */     this.ZZ = 0;
/*   */     this.V20 = null;
/*   */     this.td0 = null;
/*   */     this.WO = null;
/*   */     this.do = null;
/*   */     this.TZ = paramTexture;
/*   */     this.yg = paramTexture.getWidth();
/*   */     this.aQ = i;
/*   */     float f = (this.yg / 2);
/*   */     int i;
/*   */     Po0(f, ((i = paramTexture.getHeight()) / 2));
/*   */   }
/*   */   
/*   */   public C30(pe0 parampe0) {
/*   */     this.Ah = 1.0F;
/*   */     this.dJ0 = 1.0F;
/*   */     this.lpt2 = null;
/*   */     this.ZZ = 0;
/*   */     this.TZ = null;
/*   */     this.td0 = null;
/*   */     this.WO = null;
/*   */     this.do = null;
/*   */     this.V20 = parampe0;
/*   */     this.yg = parampe0.hW();
/*   */     this.aQ = i;
/*   */     float f = (this.yg / 2);
/*   */     int i;
/*   */     Po0(f, ((i = this.V20.qY()) / 2));
/*   */   }
/*   */   
/*   */   public C30(U70 paramU70) {
/*   */     this.Ah = 1.0F;
/*   */     this.dJ0 = 1.0F;
/*   */     this.lpt2 = null;
/*   */     this.ZZ = 0;
/*   */     this.TZ = null;
/*   */     this.V20 = null;
/*   */     this.WO = null;
/*   */     this.do = null;
/*   */     this.td0 = paramU70;
/*   */     if (paramU70.Zz() < 0)
/*   */       this.td0.HA0(); 
/*   */     this.yg = paramU70.Zz();
/*   */     this.aQ = i;
/*   */     float f = (this.yg / 2);
/*   */     int i;
/*   */     Po0(f, ((i = paramU70.eh0()) / 2));
/*   */   }
/*   */   
/*   */   public C30(zh0 paramzh0) {
/*   */     this.Ah = 1.0F;
/*   */     this.dJ0 = 1.0F;
/*   */     this.lpt2 = null;
/*   */     this.ZZ = 0;
/*   */     this.TZ = null;
/*   */     this.V20 = null;
/*   */     this.td0 = null;
/*   */     this.do = null;
/*   */     this.WO = paramzh0;
/*   */     if (paramzh0.zN() < 0)
/*   */       this.WO.Uu0(); 
/*   */     this.yg = paramzh0.zN();
/*   */     this.aQ = i;
/*   */     float f = (this.yg / 2);
/*   */     int i;
/*   */     Po0(f, ((i = paramzh0.IL()) / 2));
/*   */   }
/*   */   
/*   */   public C30(zh0[] paramArrayOfzh0, float paramFloat, int[] paramArrayOfint) {
/*   */     this.lpt2 = null;
/*   */     this.ZZ = 0;
/*   */     this.TZ = null;
/*   */     this.V20 = null;
/*   */     this.td0 = null;
/*   */     this.WO = null;
/*   */     this.do = paramArrayOfzh0;
/*   */     this.Ah = paramFloat;
/*   */     this.dJ0 = paramFloat;
/*   */     double d1 = (1.0F - paramFloat) * 0.5D * 32.0D;
/*   */     double d2 = (1.0F - paramFloat) * 0.5D * 64.0D;
/*   */     if (paramArrayOfzh0[0].zN() < 0)
/*   */       paramArrayOfzh0[0].Uu0(); 
/*   */     this.Ua = (int)((paramArrayOfzh0[0].zN() * -1 / 2 + 32) + d1);
/*   */     this.mn = (int)((paramArrayOfzh0[0].IL() * -1 + 64) + d2);
/*   */     this.yg = paramArrayOfzh0[0].zN();
/*   */     this.aQ = i;
/*   */     float f = (this.yg / 2);
/*   */     int i;
/*   */     Po0(f, ((i = paramArrayOfzh0[0].IL()) / 2));
/*   */     if (paramArrayOfint != null)
/*   */       if (paramArrayOfint.length == paramArrayOfzh0.length) {
/*   */         this.lpt2 = paramArrayOfint;
/*   */         this.ZZ = 0;
/*   */         for (byte b = 0; b < paramArrayOfint.length; b++)
/*   */           this.ZZ += paramArrayOfint[b]; 
/*   */       } else {
/*   */         throw new RuntimeException();
/*   */       }  
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/C30.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */