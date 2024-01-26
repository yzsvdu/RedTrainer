/*    */ package f;public final class HK0 extends Mf0 { public final void wO(boolean paramBoolean) {
/*  2 */     int i = this.Cn0;
/*  3 */     int j = this.QQ;
/*  4 */     int k = this.o6;
/*  5 */     ou0.com8(this.G80, i, j, k);
/*    */     
/*  7 */     float f1 = this.w00 + (i = this.OD0) + this.Kf;
/*    */     
/*  9 */     float f2 = this.ow + (k = this.b2) + this.EG;
/* 10 */     ny
/* 11 */       .gV = f1; ny ny; (ny = this.Xe).oA = f2; if (paramBoolean) { float f = -i; f = f1 / 2.0F + f; f1 = -k; ny.H.TG0(f, f2 / 2.0F + f1, 0.0F); }  this
/* 12 */       .Xe
/* 13 */       .En();
/*    */   }
/*    */   
/*    */   public boolean LY;
/*    */   public int OD0;
/*    */   public int Kf;
/*    */   public int b2;
/*    */   public int EG;
/*    */   
/*    */   public HK0(Tm paramTm, boolean paramBoolean) {
/*    */     super(1280.0F, 720.0F, paramTm);
/*    */     this.LY = paramBoolean;
/*    */   }
/*    */   
/*    */   public final void cOM2(int paramInt1, int paramInt2) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup
/*    */     //   3: dup2
/*    */     //   4: iconst_1
/*    */     //   5: istore_3
/*    */     //   6: iconst_0
/*    */     //   7: putfield OD0 : I
/*    */     //   10: iconst_0
/*    */     //   11: putfield Kf : I
/*    */     //   14: iconst_0
/*    */     //   15: putfield EG : I
/*    */     //   18: iconst_0
/*    */     //   19: putfield b2 : I
/*    */     //   22: getfield LY : Z
/*    */     //   25: ifeq -> 167
/*    */     //   28: getstatic f/h1.B30 : I
/*    */     //   31: dup
/*    */     //   32: istore #4
/*    */     //   34: iconst_1
/*    */     //   35: if_icmpeq -> 139
/*    */     //   38: iload #4
/*    */     //   40: iconst_2
/*    */     //   41: if_icmpeq -> 96
/*    */     //   44: iload #4
/*    */     //   46: iconst_3
/*    */     //   47: if_icmpeq -> 53
/*    */     //   50: goto -> 167
/*    */     //   53: aload_0
/*    */     //   54: dup
/*    */     //   55: dup2
/*    */     //   56: getstatic f/km.VH : Lf/Yj;
/*    */     //   59: pop
/*    */     //   60: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   63: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   66: pop
/*    */     //   67: iconst_0
/*    */     //   68: putfield OD0 : I
/*    */     //   71: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   74: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   77: pop
/*    */     //   78: iconst_0
/*    */     //   79: putfield Kf : I
/*    */     //   82: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   85: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   88: pop
/*    */     //   89: iconst_0
/*    */     //   90: putfield b2 : I
/*    */     //   93: goto -> 125
/*    */     //   96: aload_0
/*    */     //   97: dup
/*    */     //   98: dup
/*    */     //   99: getstatic f/km.VH : Lf/Yj;
/*    */     //   102: pop
/*    */     //   103: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   106: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   109: pop
/*    */     //   110: iconst_0
/*    */     //   111: putfield OD0 : I
/*    */     //   114: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   117: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   120: pop
/*    */     //   121: iconst_0
/*    */     //   122: putfield Kf : I
/*    */     //   125: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   128: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   131: pop
/*    */     //   132: iconst_0
/*    */     //   133: putfield EG : I
/*    */     //   136: goto -> 167
/*    */     //   139: aload_0
/*    */     //   140: dup
/*    */     //   141: getstatic f/km.VH : Lf/Yj;
/*    */     //   144: pop
/*    */     //   145: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   148: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   151: pop
/*    */     //   152: iconst_0
/*    */     //   153: putfield OD0 : I
/*    */     //   156: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   159: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   162: pop
/*    */     //   163: iconst_0
/*    */     //   164: putfield Kf : I
/*    */     //   167: aload_0
/*    */     //   168: dup
/*    */     //   169: getfield jw0 : F
/*    */     //   172: fstore #4
/*    */     //   174: getfield TH : F
/*    */     //   177: fstore #5
/*    */     //   179: getstatic f/QJ0.qf : Lf/uv0;
/*    */     //   182: fload #4
/*    */     //   184: iload_2
/*    */     //   185: iload_1
/*    */     //   186: i2f
/*    */     //   187: fstore #6
/*    */     //   189: i2f
/*    */     //   190: fstore #7
/*    */     //   192: fload #5
/*    */     //   194: fload #6
/*    */     //   196: fload #7
/*    */     //   198: invokevirtual lPt6 : (FFFF)Lf/NC0;
/*    */     //   201: dup
/*    */     //   202: astore #6
/*    */     //   204: getfield x : F
/*    */     //   207: invokestatic round : (F)I
/*    */     //   210: dup
/*    */     //   211: istore #7
/*    */     //   213: iload_1
/*    */     //   214: aload #6
/*    */     //   216: getfield y : F
/*    */     //   219: invokestatic round : (F)I
/*    */     //   222: istore #6
/*    */     //   224: if_icmpge -> 297
/*    */     //   227: aload_0
/*    */     //   228: iload_1
/*    */     //   229: iload #7
/*    */     //   231: fload #5
/*    */     //   233: iload #6
/*    */     //   235: i2f
/*    */     //   236: dup
/*    */     //   237: fload #5
/*    */     //   239: fdiv
/*    */     //   240: fstore #8
/*    */     //   242: fdiv
/*    */     //   243: fstore #9
/*    */     //   245: isub
/*    */     //   246: i2f
/*    */     //   247: fload #9
/*    */     //   249: fmul
/*    */     //   250: fstore #9
/*    */     //   252: getfield gc : F
/*    */     //   255: dup
/*    */     //   256: fstore #10
/*    */     //   258: fconst_0
/*    */     //   259: fcmpl
/*    */     //   260: ifle -> 277
/*    */     //   263: fload #9
/*    */     //   265: fload #10
/*    */     //   267: aload_0
/*    */     //   268: getfield jw0 : F
/*    */     //   271: fsub
/*    */     //   272: invokestatic min : (FF)F
/*    */     //   275: fstore #9
/*    */     //   277: fload #9
/*    */     //   279: fload #8
/*    */     //   281: fload #4
/*    */     //   283: fload #9
/*    */     //   285: fadd
/*    */     //   286: fstore #4
/*    */     //   288: fmul
/*    */     //   289: invokestatic round : (F)I
/*    */     //   292: iload #7
/*    */     //   294: iadd
/*    */     //   295: istore #7
/*    */     //   297: iload #6
/*    */     //   299: iload_2
/*    */     //   300: if_icmpge -> 372
/*    */     //   303: aload_0
/*    */     //   304: iload_2
/*    */     //   305: iload #6
/*    */     //   307: fload #4
/*    */     //   309: iload #7
/*    */     //   311: i2f
/*    */     //   312: dup
/*    */     //   313: fload #4
/*    */     //   315: fdiv
/*    */     //   316: fstore #8
/*    */     //   318: fdiv
/*    */     //   319: fstore #9
/*    */     //   321: isub
/*    */     //   322: i2f
/*    */     //   323: fload #9
/*    */     //   325: fmul
/*    */     //   326: fstore #9
/*    */     //   328: getfield fp : F
/*    */     //   331: fconst_0
/*    */     //   332: fcmpl
/*    */     //   333: ifle -> 352
/*    */     //   336: fload #9
/*    */     //   338: aload_0
/*    */     //   339: getfield gc : F
/*    */     //   342: aload_0
/*    */     //   343: getfield TH : F
/*    */     //   346: fsub
/*    */     //   347: invokestatic min : (FF)F
/*    */     //   350: fstore #9
/*    */     //   352: fload #9
/*    */     //   354: fload #8
/*    */     //   356: fload #5
/*    */     //   358: fload #9
/*    */     //   360: fadd
/*    */     //   361: fstore #5
/*    */     //   363: fmul
/*    */     //   364: invokestatic round : (F)I
/*    */     //   367: iload #6
/*    */     //   369: iadd
/*    */     //   370: istore #6
/*    */     //   372: aload_0
/*    */     //   373: iload_3
/*    */     //   374: aload_0
/*    */     //   375: dup
/*    */     //   376: fload #5
/*    */     //   378: fload #4
/*    */     //   380: aload_0
/*    */     //   381: dup
/*    */     //   382: iload_2
/*    */     //   383: iload #6
/*    */     //   385: iload_1
/*    */     //   386: iload #7
/*    */     //   388: aload_0
/*    */     //   389: iload #6
/*    */     //   391: aload_0
/*    */     //   392: iload #7
/*    */     //   394: aload_0
/*    */     //   395: dup
/*    */     //   396: dup2
/*    */     //   397: dup2
/*    */     //   398: dup2
/*    */     //   399: iload #6
/*    */     //   401: iload #7
/*    */     //   403: i2f
/*    */     //   404: fload #4
/*    */     //   406: fdiv
/*    */     //   407: fstore_0
/*    */     //   408: i2f
/*    */     //   409: fload #5
/*    */     //   411: fdiv
/*    */     //   412: fstore_1
/*    */     //   413: getfield Kf : I
/*    */     //   416: i2f
/*    */     //   417: fload_0
/*    */     //   418: fdiv
/*    */     //   419: f2i
/*    */     //   420: dup
/*    */     //   421: istore_2
/*    */     //   422: putfield Kf : I
/*    */     //   425: getfield OD0 : I
/*    */     //   428: i2f
/*    */     //   429: fload_0
/*    */     //   430: fdiv
/*    */     //   431: f2i
/*    */     //   432: dup
/*    */     //   433: istore_0
/*    */     //   434: putfield OD0 : I
/*    */     //   437: getfield b2 : I
/*    */     //   440: i2f
/*    */     //   441: fload_1
/*    */     //   442: fdiv
/*    */     //   443: f2i
/*    */     //   444: dup
/*    */     //   445: istore_3
/*    */     //   446: putfield b2 : I
/*    */     //   449: getfield EG : I
/*    */     //   452: i2f
/*    */     //   453: fload_1
/*    */     //   454: fdiv
/*    */     //   455: f2i
/*    */     //   456: dup
/*    */     //   457: istore_1
/*    */     //   458: putfield EG : I
/*    */     //   461: putfield QQ : I
/*    */     //   464: putfield o6 : I
/*    */     //   467: isub
/*    */     //   468: iconst_2
/*    */     //   469: idiv
/*    */     //   470: istore #4
/*    */     //   472: isub
/*    */     //   473: iconst_2
/*    */     //   474: idiv
/*    */     //   475: istore #5
/*    */     //   477: iload #4
/*    */     //   479: putfield G80 : I
/*    */     //   482: iload #5
/*    */     //   484: putfield Cn0 : I
/*    */     //   487: iload_0
/*    */     //   488: i2f
/*    */     //   489: fsub
/*    */     //   490: iload_2
/*    */     //   491: i2f
/*    */     //   492: fsub
/*    */     //   493: fstore_0
/*    */     //   494: iload_3
/*    */     //   495: i2f
/*    */     //   496: fsub
/*    */     //   497: iload_1
/*    */     //   498: i2f
/*    */     //   499: fsub
/*    */     //   500: fstore_1
/*    */     //   501: fload_0
/*    */     //   502: putfield w00 : F
/*    */     //   505: fload_1
/*    */     //   506: putfield ow : F
/*    */     //   509: invokevirtual wO : (Z)V
/*    */     //   512: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 60
/*    */     //   #2	-> 68
/*    */     //   #3	-> 71
/*    */     //   #4	-> 79
/*    */     //   #5	-> 82
/*    */     //   #6	-> 90
/*    */     //   #7	-> 103
/*    */     //   #8	-> 111
/*    */     //   #9	-> 114
/*    */     //   #10	-> 122
/*    */     //   #11	-> 125
/*    */     //   #12	-> 133
/*    */     //   #13	-> 145
/*    */     //   #14	-> 153
/*    */     //   #15	-> 156
/*    */     //   #16	-> 164
/*    */     //   #17	-> 169
/*    */     //   #18	-> 174
/*    */     //   #19	-> 179
/*    */     //   #20	-> 252
/*    */     //   #21	-> 268
/*    */     //   #22	-> 272
/*    */     //   #23	-> 328
/*    */     //   #24	-> 339
/*    */     //   #25	-> 343
/*    */     //   #26	-> 347
/*    */     //   #27	-> 461
/*    */     //   #28	-> 469
/*    */     //   #29	-> 479
/*    */     //   #30	-> 502
/*    */     //   #31	-> 509
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */