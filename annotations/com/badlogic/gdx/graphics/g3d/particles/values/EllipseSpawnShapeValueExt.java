/* 1 */ package com.badlogic.gdx.graphics.g3d.particles.values;public final class EllipseSpawnShapeValueExt extends PrimitiveSpawnShapeValueExt { public void read(It paramIt, bM0 parambM0) { super.read(paramIt, parambM0); this
/* 2 */       .side = (PrimitiveSpawnShapeValueExt.SpawnSide)COm9.aD0(paramIt, parambM0, "side", PrimitiveSpawnShapeValueExt.SpawnSide.class, null); if (parambM0.Ua("evenCount"))
/* 3 */     { bM0 bM01 = parambM0.Jb("evenCount");
/* 4 */       this.evenCount = (NumericValue)paramIt.Uj0(NumericValue.class, null, bM01); }  if (parambM0.Ua("evenAngleBonus")) {
/* 5 */       bM0 bM01 = parambM0.Jb("evenAngleBonus");
/* 6 */       this.evenAngleBonus = (NumericValue)paramIt.Uj0(NumericValue.class, null, this);
/*   */     }  }
/*   */ 
/*   */   
/*   */   private Random random = (Random)new W60();
/*   */   private float even = 0.0F;
/*   */   private float lastT = 0.0F;
/*   */   private float iter = 0.0F;
/*   */   private float lastRadiusX;
/*   */   private float lastRadiusY;
/*   */   private float lastRadiusZ;
/*   */   private float lastZ;
/*   */   public PrimitiveSpawnShapeValueExt.SpawnSide side = PrimitiveSpawnShapeValueExt.SpawnSide.both;
/*   */   public NumericValue evenCount = new NumericValue();
/*   */   public NumericValue evenAngleBonus = new NumericValue();
/*   */   
/*   */   public EllipseSpawnShapeValueExt(EllipseSpawnShapeValueExt paramEllipseSpawnShapeValueExt) {
/*   */     super(paramEllipseSpawnShapeValueExt);
/*   */     load(paramEllipseSpawnShapeValueExt);
/*   */   }
/*   */   
/*   */   public EllipseSpawnShapeValueExt() {}
/*   */   
/*   */   public void reSeed() {
/*   */     super.reSeed();
/*   */     if (this.seed.isActive())
/*   */       this.random.setSeed(this.seed.getValue()); 
/*   */     this.even = 0.0F;
/*   */     this.iter = -1.0F;
/*   */   }
/*   */   
/*   */   public void spawnAux(eo parameo, float paramFloat) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: dup2
/*   */     //   3: dup2
/*   */     //   4: dup2
/*   */     //   5: dup2
/*   */     //   6: getfield spawnWidth : F
/*   */     //   9: fstore_3
/*   */     //   10: getfield spawnWidthDiff : F
/*   */     //   13: fstore #4
/*   */     //   15: getfield spawnWidthValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;
/*   */     //   18: fload_2
/*   */     //   19: fload #4
/*   */     //   21: fload_3
/*   */     //   22: invokestatic COn : (Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;FFF)F
/*   */     //   25: fstore_3
/*   */     //   26: getfield spawnHeight : F
/*   */     //   29: fstore #4
/*   */     //   31: getfield spawnHeightDiff : F
/*   */     //   34: fstore #5
/*   */     //   36: getfield spawnHeightValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;
/*   */     //   39: fload_2
/*   */     //   40: fload #5
/*   */     //   42: fload #4
/*   */     //   44: invokestatic COn : (Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;FFF)F
/*   */     //   47: fstore #4
/*   */     //   49: getfield spawnDepth : F
/*   */     //   52: fstore #5
/*   */     //   54: getfield spawnDepthDiff : F
/*   */     //   57: fstore #6
/*   */     //   59: getfield spawnDepthValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;
/*   */     //   62: fload_2
/*   */     //   63: fload #6
/*   */     //   65: fload #5
/*   */     //   67: invokestatic COn : (Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValueExt;FFF)F
/*   */     //   70: fstore_2
/*   */     //   71: fconst_0
/*   */     //   72: fstore #5
/*   */     //   74: ldc 6.2831855
/*   */     //   76: fstore #6
/*   */     //   78: getfield side : Lcom/badlogic/gdx/graphics/g3d/particles/values/PrimitiveSpawnShapeValueExt$SpawnSide;
/*   */     //   81: dup
/*   */     //   82: astore #7
/*   */     //   84: getstatic com/badlogic/gdx/graphics/g3d/particles/values/PrimitiveSpawnShapeValueExt$SpawnSide.top : Lcom/badlogic/gdx/graphics/g3d/particles/values/PrimitiveSpawnShapeValueExt$SpawnSide;
/*   */     //   87: if_acmpne -> 97
/*   */     //   90: ldc 3.1415927
/*   */     //   92: fstore #6
/*   */     //   94: goto -> 109
/*   */     //   97: aload #7
/*   */     //   99: getstatic com/badlogic/gdx/graphics/g3d/particles/values/PrimitiveSpawnShapeValueExt$SpawnSide.bottom : Lcom/badlogic/gdx/graphics/g3d/particles/values/PrimitiveSpawnShapeValueExt$SpawnSide;
/*   */     //   102: if_acmpne -> 109
/*   */     //   105: ldc -3.1415927
/*   */     //   107: fstore #6
/*   */     //   109: aload_0
/*   */     //   110: iconst_1
/*   */     //   111: istore #7
/*   */     //   113: getfield evenCount : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
/*   */     //   116: invokevirtual getValue : ()F
/*   */     //   119: fconst_0
/*   */     //   120: fcmpg
/*   */     //   121: ifgt -> 229
/*   */     //   124: aload_0
/*   */     //   125: getfield evenCount : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
/*   */     //   128: invokevirtual getValue : ()F
/*   */     //   131: fconst_0
/*   */     //   132: fcmpl
/*   */     //   133: ifeq -> 200
/*   */     //   136: aload_0
/*   */     //   137: getfield seed : Lcom/badlogic/gdx/graphics/g3d/particles/values/LongNumericValue;
/*   */     //   140: invokevirtual isActive : ()Z
/*   */     //   143: ifeq -> 200
/*   */     //   146: aload_0
/*   */     //   147: getfield iter : F
/*   */     //   150: dup
/*   */     //   151: fstore #8
/*   */     //   153: fconst_0
/*   */     //   154: fcmpg
/*   */     //   155: iflt -> 185
/*   */     //   158: fload #8
/*   */     //   160: aload_0
/*   */     //   161: getfield evenCount : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
/*   */     //   164: invokevirtual getValue : ()F
/*   */     //   167: f2i
/*   */     //   168: ineg
/*   */     //   169: i2f
/*   */     //   170: frem
/*   */     //   171: fconst_0
/*   */     //   172: fcmpl
/*   */     //   173: ifne -> 179
/*   */     //   176: goto -> 185
/*   */     //   179: iconst_0
/*   */     //   180: istore #7
/*   */     //   182: goto -> 190
/*   */     //   185: aload_0
/*   */     //   186: fconst_0
/*   */     //   187: putfield iter : F
/*   */     //   190: aload_0
/*   */     //   191: dup
/*   */     //   192: getfield iter : F
/*   */     //   195: fconst_1
/*   */     //   196: fadd
/*   */     //   197: putfield iter : F
/*   */     //   200: iload #7
/*   */     //   202: ifeq -> 220
/*   */     //   205: aload_0
/*   */     //   206: dup
/*   */     //   207: getfield random : Ljava/util/Random;
/*   */     //   210: fload #5
/*   */     //   212: fload #6
/*   */     //   214: invokestatic random : (Ljava/util/Random;FF)F
/*   */     //   217: putfield lastT : F
/*   */     //   220: aload_0
/*   */     //   221: getfield lastT : F
/*   */     //   224: fstore #5
/*   */     //   226: goto -> 300
/*   */     //   229: aload_0
/*   */     //   230: dup
/*   */     //   231: dup
/*   */     //   232: fload #6
/*   */     //   234: aload_0
/*   */     //   235: dup
/*   */     //   236: getfield even : F
/*   */     //   239: fstore #5
/*   */     //   241: getfield evenCount : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
/*   */     //   244: invokevirtual getValue : ()F
/*   */     //   247: fdiv
/*   */     //   248: fload #5
/*   */     //   250: fadd
/*   */     //   251: putfield even : F
/*   */     //   254: getfield evenAngleBonus : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
/*   */     //   257: invokevirtual getValue : ()F
/*   */     //   260: aload_0
/*   */     //   261: getfield even : F
/*   */     //   264: fadd
/*   */     //   265: fstore #5
/*   */     //   267: getfield seed : Lcom/badlogic/gdx/graphics/g3d/particles/values/LongNumericValue;
/*   */     //   270: invokevirtual isActive : ()Z
/*   */     //   273: ifeq -> 300
/*   */     //   276: aload_0
/*   */     //   277: getfield seed : Lcom/badlogic/gdx/graphics/g3d/particles/values/LongNumericValue;
/*   */     //   280: invokevirtual getValue : ()J
/*   */     //   283: l2f
/*   */     //   284: ldc 360.0
/*   */     //   286: fdiv
/*   */     //   287: ldc 6.2831855
/*   */     //   289: fmul
/*   */     //   290: aload_0
/*   */     //   291: getfield even : F
/*   */     //   294: fadd
/*   */     //   295: fload #5
/*   */     //   297: fadd
/*   */     //   298: fstore #5
/*   */     //   300: aload_0
/*   */     //   301: getfield edges : Z
/*   */     //   304: ifeq -> 441
/*   */     //   307: fload_3
/*   */     //   308: fconst_0
/*   */     //   309: fcmpl
/*   */     //   310: ifne -> 347
/*   */     //   313: aload_1
/*   */     //   314: fload #5
/*   */     //   316: fload_2
/*   */     //   317: fload #5
/*   */     //   319: fload #4
/*   */     //   321: fconst_2
/*   */     //   322: fdiv
/*   */     //   323: fstore_0
/*   */     //   324: invokestatic E70 : (F)F
/*   */     //   327: fload_0
/*   */     //   328: fmul
/*   */     //   329: fstore_0
/*   */     //   330: fconst_2
/*   */     //   331: fdiv
/*   */     //   332: fstore_1
/*   */     //   333: invokestatic zN : (F)F
/*   */     //   336: fload_1
/*   */     //   337: fmul
/*   */     //   338: fstore_1
/*   */     //   339: fconst_0
/*   */     //   340: fload_0
/*   */     //   341: fload_1
/*   */     //   342: invokevirtual TG0 : (FFF)Lf/eo;
/*   */     //   345: pop
/*   */     //   346: return
/*   */     //   347: fload #4
/*   */     //   349: fconst_0
/*   */     //   350: fcmpl
/*   */     //   351: ifne -> 386
/*   */     //   354: aload_1
/*   */     //   355: fload_2
/*   */     //   356: fload #5
/*   */     //   358: fload_3
/*   */     //   359: fconst_2
/*   */     //   360: fdiv
/*   */     //   361: fstore_0
/*   */     //   362: invokestatic zN : (F)F
/*   */     //   365: fload_0
/*   */     //   366: fmul
/*   */     //   367: fstore_0
/*   */     //   368: fconst_2
/*   */     //   369: fdiv
/*   */     //   370: fstore_1
/*   */     //   371: fload_0
/*   */     //   372: fload #5
/*   */     //   374: invokestatic E70 : (F)F
/*   */     //   377: fload_1
/*   */     //   378: fmul
/*   */     //   379: fconst_0
/*   */     //   380: swap
/*   */     //   381: invokevirtual TG0 : (FFF)Lf/eo;
/*   */     //   384: pop
/*   */     //   385: return
/*   */     //   386: fload_2
/*   */     //   387: fconst_0
/*   */     //   388: fcmpl
/*   */     //   389: ifne -> 424
/*   */     //   392: aload_1
/*   */     //   393: fload #4
/*   */     //   395: fload #5
/*   */     //   397: fload_3
/*   */     //   398: fconst_2
/*   */     //   399: fdiv
/*   */     //   400: fstore_0
/*   */     //   401: invokestatic zN : (F)F
/*   */     //   404: fload_0
/*   */     //   405: fmul
/*   */     //   406: fstore_0
/*   */     //   407: fconst_2
/*   */     //   408: fdiv
/*   */     //   409: fstore_1
/*   */     //   410: fload_0
/*   */     //   411: fload #5
/*   */     //   413: invokestatic E70 : (F)F
/*   */     //   416: fload_1
/*   */     //   417: fmul
/*   */     //   418: fconst_0
/*   */     //   419: invokevirtual TG0 : (FFF)Lf/eo;
/*   */     //   422: pop
/*   */     //   423: return
/*   */     //   424: fload_2
/*   */     //   425: fload #4
/*   */     //   427: fload_3
/*   */     //   428: fconst_2
/*   */     //   429: fdiv
/*   */     //   430: fstore_2
/*   */     //   431: fconst_2
/*   */     //   432: fdiv
/*   */     //   433: fstore_3
/*   */     //   434: fconst_2
/*   */     //   435: fdiv
/*   */     //   436: fstore #4
/*   */     //   438: goto -> 484
/*   */     //   441: aload_0
/*   */     //   442: dup
/*   */     //   443: dup
/*   */     //   444: getfield random : Ljava/util/Random;
/*   */     //   447: fload_3
/*   */     //   448: fconst_2
/*   */     //   449: fdiv
/*   */     //   450: invokestatic random : (Ljava/util/Random;F)F
/*   */     //   453: fstore_3
/*   */     //   454: getfield random : Ljava/util/Random;
/*   */     //   457: fload #4
/*   */     //   459: fconst_2
/*   */     //   460: fdiv
/*   */     //   461: invokestatic random : (Ljava/util/Random;F)F
/*   */     //   464: fstore #4
/*   */     //   466: getfield random : Ljava/util/Random;
/*   */     //   469: fload_2
/*   */     //   470: fconst_2
/*   */     //   471: fdiv
/*   */     //   472: invokestatic random : (Ljava/util/Random;F)F
/*   */     //   475: fstore_2
/*   */     //   476: fload_3
/*   */     //   477: fload #4
/*   */     //   479: fload_2
/*   */     //   480: fstore #4
/*   */     //   482: fstore_3
/*   */     //   483: fstore_2
/*   */     //   484: iload #7
/*   */     //   486: aload_0
/*   */     //   487: getfield random : Ljava/util/Random;
/*   */     //   490: ldc -1.0
/*   */     //   492: fconst_1
/*   */     //   493: invokestatic random : (Ljava/util/Random;FF)F
/*   */     //   496: fstore #6
/*   */     //   498: ifeq -> 522
/*   */     //   501: aload_0
/*   */     //   502: dup
/*   */     //   503: dup2
/*   */     //   504: fload #6
/*   */     //   506: putfield lastZ : F
/*   */     //   509: fload_2
/*   */     //   510: putfield lastRadiusX : F
/*   */     //   513: fload_3
/*   */     //   514: putfield lastRadiusY : F
/*   */     //   517: fload #4
/*   */     //   519: putfield lastRadiusZ : F
/*   */     //   522: aload_1
/*   */     //   523: fload #5
/*   */     //   525: aload_0
/*   */     //   526: dup
/*   */     //   527: getfield lastZ : F
/*   */     //   530: dup
/*   */     //   531: fmul
/*   */     //   532: fconst_1
/*   */     //   533: swap
/*   */     //   534: fsub
/*   */     //   535: f2d
/*   */     //   536: invokestatic sqrt : (D)D
/*   */     //   539: d2f
/*   */     //   540: fstore_1
/*   */     //   541: getfield lastRadiusX : F
/*   */     //   544: fload_1
/*   */     //   545: fmul
/*   */     //   546: fstore_2
/*   */     //   547: invokestatic zN : (F)F
/*   */     //   550: fload_2
/*   */     //   551: fmul
/*   */     //   552: aload_0
/*   */     //   553: fload #5
/*   */     //   555: aload_0
/*   */     //   556: getfield lastRadiusY : F
/*   */     //   559: fload_1
/*   */     //   560: fmul
/*   */     //   561: fstore_0
/*   */     //   562: invokestatic E70 : (F)F
/*   */     //   565: fload_0
/*   */     //   566: fmul
/*   */     //   567: fstore_0
/*   */     //   568: getfield lastRadiusZ : F
/*   */     //   571: fload #6
/*   */     //   573: fmul
/*   */     //   574: fload_0
/*   */     //   575: swap
/*   */     //   576: invokevirtual TG0 : (FFF)Lf/eo;
/*   */     //   579: pop
/*   */     //   580: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 22
/*   */     //   #2	-> 26
/*   */     //   #3	-> 44
/*   */     //   #4	-> 49
/*   */     //   #5	-> 67
/*   */     //   #6	-> 78
/*   */   }
/*   */   
/*   */   public PrimitiveSpawnShapeValueExt.SpawnSide getSide() {
/*   */     return this.side;
/*   */   }
/*   */   
/*   */   public void setSide(PrimitiveSpawnShapeValueExt.SpawnSide paramSpawnSide) {
/*   */     this.side = paramSpawnSide;
/*   */   }
/*   */   
/*   */   public void load(ParticleValue paramParticleValue) {
/*   */     super.load(paramParticleValue);
/*   */     this.side = (this = (EllipseSpawnShapeValueExt)paramParticleValue).side;
/*   */     this.evenCount = this.evenCount;
/*   */     this.evenAngleBonus = this.evenAngleBonus;
/*   */   }
/*   */   
/*   */   public SpawnShapeValueExt copy() {
/*   */     return new EllipseSpawnShapeValueExt(this);
/*   */   }
/*   */   
/*   */   public void write(It paramIt) {
/*   */     super.write(paramIt);
/*   */     paramIt.Jv0(this.side, "side");
/*   */     paramIt.Jv0(this.evenCount, "evenCount");
/*   */     paramIt.Jv0(this.evenAngleBonus, "evenAngleBonus");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/graphics/g3d/particles/values/EllipseSpawnShapeValueExt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */