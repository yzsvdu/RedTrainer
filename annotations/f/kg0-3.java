/*  1 */ package f;public final class kg0 implements tk, iq0 { public static ZH Wl0(ZH paramZH, boolean paramBoolean1, boolean paramBoolean2) { ZH zH; if (paramZH != null && (paramBoolean1 || paramBoolean2)) { ZH zH1; int i; if (paramBoolean1 && !paramBoolean2)
/*  2 */       { i = paramZH.Con.ju * 2;
/*    */         
/*  4 */         this(i, paramZH.Con.Og0, Uc.xi0); zH1.fL(paramZH, 0, 0); zH1
/*    */ 
/*    */           
/*  7 */           .fL(FX.pS(paramZH, true, false), paramZH.Con.ju, 0); FX.pS(paramZH, true, false).dispose(); paramZH.dispose(); paramZH = zH1; } else if (i != 0 && zH1 == null)
/*    */       { Gdx2DPixmap gdx2DPixmap;
/*    */ 
/*    */         
/* 11 */         this((gdx2DPixmap = paramZH.Con).ju, gdx2DPixmap.Og0 * 2, Uc.xi0); zH1.fL(paramZH, 0, 0); zH1
/*    */ 
/*    */           
/* 14 */           .fL(FX.pS(paramZH, false, true), 0, paramZH.Con.Og0); FX.pS(paramZH, false, true).dispose(); paramZH.dispose(); paramZH = zH1; }
/*    */       else
/*    */       { Gdx2DPixmap gdx2DPixmap;
/*    */         
/* 18 */         this((gdx2DPixmap = paramZH.Con).ju * 2, gdx2DPixmap.Og0 * 2, Uc.xi0); (new ZH()).r1(y1.Zj); ZH zH2 = FX.pS(paramZH, true, false), zH3 = FX.pS(paramZH, false, true); zH1.fL(paramZH, 0, 0); zH1
/*    */ 
/*    */           
/* 21 */           .fL(zH2, paramZH.Con.ju, 0);
/*    */ 
/*    */         
/* 24 */         zH1.fL(zH3, 0, paramZH.Con.Og0);
/*    */         
/* 26 */         int j = paramZH.Con.ju;
/*    */         
/* 28 */         zH1.fL(zH4, j, paramZH.Con.Og0); zH2.dispose(); zH3.dispose(); ZH zH4; (zH4 = FX.pS(paramZH, true, true)).dispose(); paramZH.dispose(); zH = zH1; }  }  return zH; }
/*    */ 
/*    */   
/*    */   public static final ik Zn = C00.gd(kg0.class);
/*    */   public static ig nJ0 = null;
/*    */   public static Xt0 ZJ0;
/*    */   public static float b5 = 0.016666668F;
/*    */   public int nn;
/*    */   public int jB;
/*    */   public fQ X90;
/*    */   public ArrayDeque Hg0;
/*    */   public sz0 SJ0;
/*    */   public Ih0 HU;
/*    */   public Texture Mw;
/*    */   public S vF;
/*    */   public Xa0 aL;
/*    */   public float Rj;
/*    */   public eM nu0;
/*    */   
/*    */   public kg0(Ih0 paramIh0) {
/*    */     ParticleEffectLoaderExt particleEffectLoaderExt;
/*    */     ParticleEffectExtLoaderExt particleEffectExtLoaderExt;
/*    */     this.nn = 0;
/*    */     this.jB = 0;
/*    */     this.Hg0 = new ArrayDeque();
/*    */     this.Rj = 0.0F;
/*    */     this.nu0 = new eM();
/*    */     this.X90 = new fQ();
/*    */     this.HU = paramIh0;
/*    */     this.aL = new Xa0();
/*    */     Z8();
/*    */     this(ZJ0);
/*    */     (this.SJ0 = new sz0(ZJ0)).YI0(ParticleEffect.class, (EH0)particleEffectLoaderExt);
/*    */     this(ZJ0);
/*    */     this.SJ0.YI0(ParticleEffectExt.class, (EH0)particleEffectExtLoaderExt);
/*    */     Uc uc = Uc.eJ0;
/*    */     this(1, 1, this);
/*    */     this.Mw = new Texture(zH);
/*    */     ZH zH;
/*    */     (zH = new ZH()).dispose();
/*    */   }
/*    */   
/*    */   public static void Z8() {
/*    */     if (ZJ0 == null) {
/*    */       ZJ0 = new cb("data/sprites/particles/");
/*    */       if (!km.ER())
/*    */         try {
/*    */           hZ hZ;
/*    */           if ((hZ = UB0.vj0.aP("data/sprites/particles.pak")).L0()) {
/*    */             ZipFile zipFile;
/*    */             this(hZ.bo());
/*    */             ZJ0 = new qg0(new Xt0[] { ZJ0, new pZ(zipFile) });
/*    */           } 
/*    */         } catch (ZipException zipException) {
/*    */           Zn.error("Error loading particle data.", zipException);
/*    */           throw new JU("Error loading particle data.");
/*    */         } catch (IOException iOException) {
/*    */           Zn.error("Error loading particle data.", iOException);
/*    */           throw new JU("Error loading particle data.");
/*    */         }  
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void fA0(Wo paramWo) {
/*    */     if (nJ0 == null)
/*    */       nJ0 = new ig(paramWo.TI.B8("/a/0/0/6")); 
/*    */     this.vF = nJ0;
/*    */   }
/*    */   
/*    */   public final void L40(ParticleEffectExt paramParticleEffectExt) {
/*    */     this.X90.Com3(paramParticleEffectExt);
/*    */     if (Bz.SF)
/*    */       this.nu0.Ed0(paramParticleEffectExt, Long.valueOf(zm0.u20)); 
/*    */   }
/*    */   
/*    */   public final void Ow0(ParticleEffectExt paramParticleEffectExt) {
/*    */     if (this.X90.Ct(paramParticleEffectExt, true))
/*    */       paramParticleEffectExt.dispose(); 
/*    */     if (Bz.SF && this.nu0.uW(paramParticleEffectExt)) {
/*    */       Zn.info(B40.df("effect done in = ").append(zm0.u20 - ((Long)this.nu0.MF(paramParticleEffectExt, null)).longValue()).append("ms ").append(paramParticleEffectExt).toString());
/*    */       this.nu0.Yj0(paramParticleEffectExt);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void iy() {
/*    */     Hc0 hc0 = this.X90.r30();
/*    */     while (hc0.hasNext()) {
/*    */       ParticleEffectExt particleEffectExt;
/*    */       if ((particleEffectExt = (ParticleEffectExt)hc0.next()).isComplete())
/*    */         Ow0(particleEffectExt); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void strictfp() {
/*    */     this.X90.clear();
/*    */     if (Bz.SF)
/*    */       this.nu0.clear(); 
/*    */   }
/*    */   
/*    */   public final void pf0() {
/*    */     Hc0 hc0 = this.X90.r30();
/*    */     while (hc0.hasNext())
/*    */       ((ParticleEffectExt)hc0.next()).dispose(); 
/*    */     strictfp();
/*    */   }
/*    */   
/*    */   public final ParticleEffectExt gi0(String paramString) {
/*    */     try {
/*    */       PW("particle/" + paramString + ".vfx").copy().init();
/*    */       return PW("particle/" + paramString + ".vfx").copy();
/*    */     } catch (Exception exception) {
/*    */       ik ik1 = Zn;
/*    */       StringBuilder stringBuilder = (new StringBuilder()).append("Couldn't load VFXFully ").append(paramString).append("\n");
/*    */       synchronized (this.SJ0) {
/*    */         StringBuilder stringBuilder1;
/*    */         this(256);
/*    */         oc oc = this.SJ0.g30.sh();
/*    */         while (oc.hasNext()) {
/*    */           String str1 = (String)((yO)oc.next()).Lb;
/*    */           Class clazz = (Class)((yO)oc.next()).mm;
/*    */           if (stringBuilder1.length() > 0)
/*    */             stringBuilder1.append('\n'); 
/*    */           stringBuilder1.append(str1);
/*    */           stringBuilder1.append(", ");
/*    */           stringBuilder1.append(clazz.getSimpleName());
/*    */           stringBuilder1.append(", refs: ");
/*    */           stringBuilder1.append(((UI)((f7)null.MO.pd0(clazz)).pd0(str1)).HS);
/*    */           fQ fQ1;
/*    */           if ((fQ1 = (fQ)null.r70.pd0(str1)) != null) {
/*    */             stringBuilder1.append(", deps: [");
/*    */             for (Hc0 hc0 = fQ1.r30(); hc0.hasNext(); ) {
/*    */               stringBuilder1.append((String)hc0.next());
/*    */               stringBuilder1.append(',');
/*    */             } 
/*    */             stringBuilder1.append(']');
/*    */           } 
/*    */         } 
/*    */         String str = stringBuilder1.toString();
/*    */         info(stringBuilder.append(this).toString(), exception);
/*    */         return new ParticleEffectExt();
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void update() {
/*    */     TY(UB0.M60.Qy);
/*    */   }
/*    */   
/*    */   public final void TY(float paramFloat) {
/*    */     Hc0 hc0;
/*    */     this.Rj += paramFloat;
/*    */     if (Bz.SF)
/*    */       this.jB++; 
/*    */     while ((paramFloat = this.Rj) >= b5) {
/*    */       hc0 = this.X90.r30();
/*    */       while (hc0.hasNext())
/*    */         ((ParticleEffectExt)hc0.next()).update(b5); 
/*    */       this.Rj -= b5;
/*    */       if (Bz.SF)
/*    */         this.nn++; 
/*    */     } 
/*    */     if (hc0 < 0.0F)
/*    */       this.Rj = 0.0F; 
/*    */   }
/*    */   
/*    */   public final void begin() {
/*    */     Hc0 hc0 = this.X90.r30();
/*    */     while (hasNext())
/*    */       ((ParticleEffectExt)next()).begin(); 
/*    */   }
/*    */   
/*    */   public final void ZK0() {
/*    */     Hc0 hc0 = this.X90.r30();
/*    */     while (hasNext())
/*    */       ((ParticleEffectExt)next()).draw(); 
/*    */   }
/*    */   
/*    */   public final void end() {
/*    */     Hc0 hc0 = this.X90.r30();
/*    */     while (hasNext())
/*    */       ((ParticleEffectExt)next()).end(); 
/*    */   }
/*    */   
/*    */   public final void getRenderables(fQ paramfQ, Lc paramLc) {
/*    */     Hc0 hc0 = this.X90.r30();
/*    */     while (hasNext())
/*    */       ((ParticleEffectExt)next()).getRenderables(paramfQ, paramLc); 
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     pf0();
/*    */     this.SJ0.dispose();
/*    */     this.Mw.dispose();
/*    */     this.aL.dispose();
/*    */   }
/*    */   
/*    */   public final sz0 Zf() {
/*    */     return this.SJ0;
/*    */   }
/*    */   
/*    */   public final Texture vb0(ParticleControllerExt paramParticleControllerExt) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: dup
/*    */     //   2: getfield type : Lcom/badlogic/gdx/graphics/g3d/particles/APSType;
/*    */     //   5: astore_2
/*    */     //   6: getfield aps_id : I
/*    */     //   9: dup
/*    */     //   10: istore_3
/*    */     //   11: aload_0
/*    */     //   12: aload_1
/*    */     //   13: dup
/*    */     //   14: dup2
/*    */     //   15: dup2
/*    */     //   16: dup2
/*    */     //   17: getfield aps_texture_range : Lcom/badlogic/gdx/graphics/g3d/particles/values/RangedNumericValue;
/*    */     //   20: invokevirtual getLowMin : ()F
/*    */     //   23: f2i
/*    */     //   24: istore_1
/*    */     //   25: getfield aps_texture_range : Lcom/badlogic/gdx/graphics/g3d/particles/values/RangedNumericValue;
/*    */     //   28: invokevirtual getLowMax : ()F
/*    */     //   31: f2i
/*    */     //   32: istore #4
/*    */     //   34: getfield repeat_x : Z
/*    */     //   37: istore #5
/*    */     //   39: getfield repeat_y : Z
/*    */     //   42: istore #6
/*    */     //   44: getfield flip_x : Z
/*    */     //   47: istore #7
/*    */     //   49: getfield flip_y : Z
/*    */     //   52: istore #8
/*    */     //   54: getfield mix : Z
/*    */     //   57: istore #9
/*    */     //   59: getfield avg : Z
/*    */     //   62: istore #10
/*    */     //   64: getfield vF : Lf/S;
/*    */     //   67: invokevirtual size : ()I
/*    */     //   70: if_icmplt -> 155
/*    */     //   73: getstatic f/kg0.Zn : Lf/ik;
/*    */     //   76: new java/lang/StringBuilder
/*    */     //   79: dup
/*    */     //   80: invokespecial <init> : ()V
/*    */     //   83: ldc_w 'Attempted to load invalid APS texture ( '
/*    */     //   86: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   89: aload_2
/*    */     //   90: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   93: ldc_w ' ). #'
/*    */     //   96: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   99: iload_3
/*    */     //   100: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   103: ldc_w ' folder '
/*    */     //   106: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   109: aload_0
/*    */     //   110: getfield vF : Lf/S;
/*    */     //   113: getfield B1 : Ljava/lang/String;
/*    */     //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   119: ldc_w ' size: '
/*    */     //   122: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   125: aload_0
/*    */     //   126: getfield vF : Lf/S;
/*    */     //   129: invokevirtual size : ()I
/*    */     //   132: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   135: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   138: new java/lang/RuntimeException
/*    */     //   141: dup
/*    */     //   142: invokespecial <init> : ()V
/*    */     //   145: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   150: aconst_null
/*    */     //   151: astore_0
/*    */     //   152: goto -> 1110
/*    */     //   155: aload_2
/*    */     //   156: getstatic com/badlogic/gdx/graphics/g3d/particles/APSType.CUSTOM : Lcom/badlogic/gdx/graphics/g3d/particles/APSType;
/*    */     //   159: if_acmpne -> 324
/*    */     //   162: iload #5
/*    */     //   164: new f/ZH
/*    */     //   167: dup
/*    */     //   168: astore_0
/*    */     //   169: getstatic f/kg0.ZJ0 : Lf/Xt0;
/*    */     //   172: new java/lang/StringBuilder
/*    */     //   175: dup
/*    */     //   176: invokespecial <init> : ()V
/*    */     //   179: ldc_w 'sprites/'
/*    */     //   182: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   185: iload_3
/*    */     //   186: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   189: ldc_w '.png'
/*    */     //   192: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   195: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   198: invokeinterface resolve : (Ljava/lang/String;)Lf/RD0;
/*    */     //   203: invokespecial <init> : (Lf/RD0;)V
/*    */     //   206: ifne -> 214
/*    */     //   209: iload #6
/*    */     //   211: ifeq -> 253
/*    */     //   214: iload #7
/*    */     //   216: ifne -> 224
/*    */     //   219: iload #8
/*    */     //   221: ifeq -> 244
/*    */     //   224: getstatic f/kg0.Zn : Lf/ik;
/*    */     //   227: new java/lang/IllegalArgumentException
/*    */     //   230: dup
/*    */     //   231: astore_1
/*    */     //   232: invokespecial <init> : ()V
/*    */     //   235: ldc_w 'Flip / Repeat functions are mutually exclusive'
/*    */     //   238: aload_1
/*    */     //   239: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   244: aload_0
/*    */     //   245: iload #5
/*    */     //   247: iload #6
/*    */     //   249: invokestatic Wl0 : (Lf/ZH;ZZ)Lf/ZH;
/*    */     //   252: astore_0
/*    */     //   253: iload #7
/*    */     //   255: ifne -> 263
/*    */     //   258: iload #8
/*    */     //   260: ifeq -> 306
/*    */     //   263: iload #5
/*    */     //   265: ifne -> 273
/*    */     //   268: iload #6
/*    */     //   270: ifeq -> 293
/*    */     //   273: getstatic f/kg0.Zn : Lf/ik;
/*    */     //   276: new java/lang/IllegalArgumentException
/*    */     //   279: dup
/*    */     //   280: astore_1
/*    */     //   281: invokespecial <init> : ()V
/*    */     //   284: ldc_w 'Flip / Repeat functions are mutually exclusive'
/*    */     //   287: aload_1
/*    */     //   288: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   293: aload_0
/*    */     //   294: dup
/*    */     //   295: iload #7
/*    */     //   297: iload #8
/*    */     //   299: invokestatic pS : (Lf/ZH;ZZ)Lf/ZH;
/*    */     //   302: astore_0
/*    */     //   303: invokevirtual dispose : ()V
/*    */     //   306: aload_0
/*    */     //   307: new com/badlogic/gdx/graphics/Texture
/*    */     //   310: dup
/*    */     //   311: astore_1
/*    */     //   312: aload_0
/*    */     //   313: invokespecial <init> : (Lf/ZH;)V
/*    */     //   316: invokevirtual dispose : ()V
/*    */     //   319: aload_1
/*    */     //   320: astore_0
/*    */     //   321: goto -> 1110
/*    */     //   324: iload #9
/*    */     //   326: aload_0
/*    */     //   327: getfield vF : Lf/S;
/*    */     //   330: iload_3
/*    */     //   331: invokevirtual Em0 : (I)Lf/T7;
/*    */     //   334: invokestatic BE0 : (Lf/T7;)Lf/iw0;
/*    */     //   337: astore_0
/*    */     //   338: ifeq -> 571
/*    */     //   341: iload_1
/*    */     //   342: iload #4
/*    */     //   344: if_icmpeq -> 571
/*    */     //   347: aload_0
/*    */     //   348: iload_1
/*    */     //   349: invokevirtual VW : (I)Lf/ZH;
/*    */     //   352: iload #5
/*    */     //   354: iload #6
/*    */     //   356: invokestatic Wl0 : (Lf/ZH;ZZ)Lf/ZH;
/*    */     //   359: dup
/*    */     //   360: astore_1
/*    */     //   361: aload_0
/*    */     //   362: iload #4
/*    */     //   364: invokevirtual VW : (I)Lf/ZH;
/*    */     //   367: iload #5
/*    */     //   369: iload #6
/*    */     //   371: invokestatic Wl0 : (Lf/ZH;ZZ)Lf/ZH;
/*    */     //   374: astore_0
/*    */     //   375: ifnull -> 542
/*    */     //   378: aload_0
/*    */     //   379: ifnonnull -> 385
/*    */     //   382: goto -> 542
/*    */     //   385: aload_1
/*    */     //   386: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   389: dup
/*    */     //   390: astore_2
/*    */     //   391: getfield ju : I
/*    */     //   394: dup
/*    */     //   395: istore_3
/*    */     //   396: aload_0
/*    */     //   397: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   400: dup
/*    */     //   401: astore #4
/*    */     //   403: getfield ju : I
/*    */     //   406: dup
/*    */     //   407: istore #5
/*    */     //   409: if_icmplt -> 477
/*    */     //   412: iload #7
/*    */     //   414: aload_0
/*    */     //   415: aload_1
/*    */     //   416: aload_0
/*    */     //   417: aload_2
/*    */     //   418: iload_3
/*    */     //   419: iload #5
/*    */     //   421: isub
/*    */     //   422: iconst_2
/*    */     //   423: idiv
/*    */     //   424: istore_0
/*    */     //   425: getfield Og0 : I
/*    */     //   428: aload #4
/*    */     //   430: getfield Og0 : I
/*    */     //   433: isub
/*    */     //   434: iconst_2
/*    */     //   435: idiv
/*    */     //   436: iload_0
/*    */     //   437: swap
/*    */     //   438: invokevirtual fL : (Lf/ZH;II)V
/*    */     //   441: invokevirtual dispose : ()V
/*    */     //   444: ifne -> 452
/*    */     //   447: iload #8
/*    */     //   449: ifeq -> 461
/*    */     //   452: aload_1
/*    */     //   453: iload #7
/*    */     //   455: iload #8
/*    */     //   457: invokestatic pS : (Lf/ZH;ZZ)Lf/ZH;
/*    */     //   460: astore_1
/*    */     //   461: aload_1
/*    */     //   462: new com/badlogic/gdx/graphics/Texture
/*    */     //   465: dup
/*    */     //   466: astore_0
/*    */     //   467: aload_1
/*    */     //   468: invokespecial <init> : (Lf/ZH;)V
/*    */     //   471: invokevirtual dispose : ()V
/*    */     //   474: goto -> 1110
/*    */     //   477: iload #7
/*    */     //   479: aload_1
/*    */     //   480: aload_0
/*    */     //   481: aload_1
/*    */     //   482: aload #4
/*    */     //   484: iload #5
/*    */     //   486: iload_3
/*    */     //   487: isub
/*    */     //   488: iconst_2
/*    */     //   489: idiv
/*    */     //   490: istore_1
/*    */     //   491: getfield Og0 : I
/*    */     //   494: aload_2
/*    */     //   495: getfield Og0 : I
/*    */     //   498: isub
/*    */     //   499: iconst_2
/*    */     //   500: idiv
/*    */     //   501: iload_1
/*    */     //   502: swap
/*    */     //   503: invokevirtual fL : (Lf/ZH;II)V
/*    */     //   506: invokevirtual dispose : ()V
/*    */     //   509: ifne -> 517
/*    */     //   512: iload #8
/*    */     //   514: ifeq -> 526
/*    */     //   517: aload_0
/*    */     //   518: iload #7
/*    */     //   520: iload #8
/*    */     //   522: invokestatic pS : (Lf/ZH;ZZ)Lf/ZH;
/*    */     //   525: astore_0
/*    */     //   526: aload_0
/*    */     //   527: new com/badlogic/gdx/graphics/Texture
/*    */     //   530: dup
/*    */     //   531: astore_1
/*    */     //   532: aload_0
/*    */     //   533: invokespecial <init> : (Lf/ZH;)V
/*    */     //   536: invokevirtual dispose : ()V
/*    */     //   539: goto -> 319
/*    */     //   542: new f/ZH
/*    */     //   545: dup
/*    */     //   546: astore_0
/*    */     //   547: getstatic f/Uc.xi0 : Lf/Uc;
/*    */     //   550: astore_1
/*    */     //   551: iconst_1
/*    */     //   552: iconst_1
/*    */     //   553: aload_1
/*    */     //   554: invokespecial <init> : (IILf/Uc;)V
/*    */     //   557: new com/badlogic/gdx/graphics/Texture
/*    */     //   560: dup
/*    */     //   561: astore_1
/*    */     //   562: aload_0
/*    */     //   563: invokespecial <init> : (Lf/ZH;)V
/*    */     //   566: aload_1
/*    */     //   567: astore_0
/*    */     //   568: goto -> 1110
/*    */     //   571: iload_1
/*    */     //   572: iload #4
/*    */     //   574: if_icmpeq -> 983
/*    */     //   577: iload #10
/*    */     //   579: iload #4
/*    */     //   581: iload_1
/*    */     //   582: isub
/*    */     //   583: iconst_1
/*    */     //   584: iadd
/*    */     //   585: istore_2
/*    */     //   586: aconst_null
/*    */     //   587: astore_3
/*    */     //   588: iconst_0
/*    */     //   589: istore #9
/*    */     //   591: iconst_0
/*    */     //   592: istore #11
/*    */     //   594: iconst_0
/*    */     //   595: istore #12
/*    */     //   597: ifeq -> 715
/*    */     //   600: iload_1
/*    */     //   601: istore #13
/*    */     //   603: iload #13
/*    */     //   605: iload #4
/*    */     //   607: if_icmpgt -> 715
/*    */     //   610: aload_0
/*    */     //   611: getfield WG0 : [Lf/tA0;
/*    */     //   614: dup
/*    */     //   615: astore #14
/*    */     //   617: arraylength
/*    */     //   618: iload #13
/*    */     //   620: if_icmple -> 641
/*    */     //   623: iload #13
/*    */     //   625: ifge -> 631
/*    */     //   628: goto -> 641
/*    */     //   631: aload #14
/*    */     //   633: iload #13
/*    */     //   635: aaload
/*    */     //   636: astore #15
/*    */     //   638: goto -> 644
/*    */     //   641: aconst_null
/*    */     //   642: astore #15
/*    */     //   644: aload #14
/*    */     //   646: aload #15
/*    */     //   648: getfield XV : I
/*    */     //   651: istore #15
/*    */     //   653: arraylength
/*    */     //   654: iload #13
/*    */     //   656: if_icmple -> 677
/*    */     //   659: iload #13
/*    */     //   661: ifge -> 667
/*    */     //   664: goto -> 677
/*    */     //   667: aload #14
/*    */     //   669: iload #13
/*    */     //   671: aaload
/*    */     //   672: astore #14
/*    */     //   674: goto -> 680
/*    */     //   677: aconst_null
/*    */     //   678: astore #14
/*    */     //   680: iload #9
/*    */     //   682: aload #14
/*    */     //   684: getfield dK : I
/*    */     //   687: istore #14
/*    */     //   689: iload #15
/*    */     //   691: if_icmpge -> 698
/*    */     //   694: iload #15
/*    */     //   696: istore #9
/*    */     //   698: iload #11
/*    */     //   700: iload #14
/*    */     //   702: if_icmpge -> 709
/*    */     //   705: iload #15
/*    */     //   707: istore #11
/*    */     //   709: iinc #13, 1
/*    */     //   712: goto -> 603
/*    */     //   715: iload_1
/*    */     //   716: iload #4
/*    */     //   718: if_icmpgt -> 943
/*    */     //   721: iload #9
/*    */     //   723: aload_0
/*    */     //   724: iload_1
/*    */     //   725: invokevirtual VW : (I)Lf/ZH;
/*    */     //   728: iload #5
/*    */     //   730: iload #6
/*    */     //   732: invokestatic Wl0 : (Lf/ZH;ZZ)Lf/ZH;
/*    */     //   735: astore #13
/*    */     //   737: ifeq -> 745
/*    */     //   740: iload #11
/*    */     //   742: ifne -> 766
/*    */     //   745: aload #13
/*    */     //   747: ifnull -> 766
/*    */     //   750: aload #13
/*    */     //   752: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   755: dup
/*    */     //   756: getfield ju : I
/*    */     //   759: istore #9
/*    */     //   761: getfield Og0 : I
/*    */     //   764: istore #11
/*    */     //   766: aload_3
/*    */     //   767: ifnonnull -> 810
/*    */     //   770: aload #13
/*    */     //   772: ifnull -> 810
/*    */     //   775: new f/ZH
/*    */     //   778: dup
/*    */     //   779: dup2
/*    */     //   780: astore_3
/*    */     //   781: iload #9
/*    */     //   783: iload_2
/*    */     //   784: imul
/*    */     //   785: iload #11
/*    */     //   787: getstatic f/Uc.xi0 : Lf/Uc;
/*    */     //   790: invokespecial <init> : (IILf/Uc;)V
/*    */     //   793: getstatic f/y1.hM : Lf/y1;
/*    */     //   796: invokevirtual r1 : (Lf/y1;)V
/*    */     //   799: getstatic f/hu0.kT : [Lf/hu0;
/*    */     //   802: pop
/*    */     //   803: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   806: iconst_0
/*    */     //   807: invokevirtual tf0 : (I)V
/*    */     //   810: aload #13
/*    */     //   812: ifnull -> 937
/*    */     //   815: aload_3
/*    */     //   816: ifnull -> 937
/*    */     //   819: iload #10
/*    */     //   821: ifeq -> 885
/*    */     //   824: aload #13
/*    */     //   826: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   829: dup
/*    */     //   830: astore #14
/*    */     //   832: getfield ju : I
/*    */     //   835: dup
/*    */     //   836: istore #15
/*    */     //   838: iload #9
/*    */     //   840: if_icmpeq -> 885
/*    */     //   843: aload_3
/*    */     //   844: iload #12
/*    */     //   846: iload #9
/*    */     //   848: aload #14
/*    */     //   850: getfield Og0 : I
/*    */     //   853: istore #16
/*    */     //   855: iinc #12, 1
/*    */     //   858: imul
/*    */     //   859: istore #17
/*    */     //   861: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   864: aload #14
/*    */     //   866: iconst_0
/*    */     //   867: iconst_0
/*    */     //   868: iload #15
/*    */     //   870: iload #16
/*    */     //   872: iload #17
/*    */     //   874: iconst_0
/*    */     //   875: iload #9
/*    */     //   877: iload #11
/*    */     //   879: invokevirtual fj : (Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;IIIIIIII)V
/*    */     //   882: goto -> 932
/*    */     //   885: aload_3
/*    */     //   886: aload #13
/*    */     //   888: iload #12
/*    */     //   890: iload #9
/*    */     //   892: iinc #12, 1
/*    */     //   895: imul
/*    */     //   896: istore #14
/*    */     //   898: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   901: dup
/*    */     //   902: dup
/*    */     //   903: astore #15
/*    */     //   905: getfield ju : I
/*    */     //   908: istore #16
/*    */     //   910: getfield Og0 : I
/*    */     //   913: istore #17
/*    */     //   915: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*    */     //   918: aload #15
/*    */     //   920: iconst_0
/*    */     //   921: iconst_0
/*    */     //   922: iload #14
/*    */     //   924: iconst_0
/*    */     //   925: iload #16
/*    */     //   927: iload #17
/*    */     //   929: invokevirtual nM : (Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;IIIIII)V
/*    */     //   932: aload #13
/*    */     //   934: invokevirtual dispose : ()V
/*    */     //   937: iinc #1, 1
/*    */     //   940: goto -> 715
/*    */     //   943: aload_3
/*    */     //   944: ifnull -> 1108
/*    */     //   947: iload #7
/*    */     //   949: ifne -> 957
/*    */     //   952: iload #8
/*    */     //   954: ifeq -> 970
/*    */     //   957: aload_3
/*    */     //   958: dup
/*    */     //   959: iload #7
/*    */     //   961: iload #8
/*    */     //   963: invokestatic pS : (Lf/ZH;ZZ)Lf/ZH;
/*    */     //   966: astore_3
/*    */     //   967: invokevirtual dispose : ()V
/*    */     //   970: aload_3
/*    */     //   971: new com/badlogic/gdx/graphics/Texture
/*    */     //   974: dup
/*    */     //   975: astore_0
/*    */     //   976: aload_3
/*    */     //   977: invokespecial <init> : (Lf/ZH;)V
/*    */     //   980: goto -> 471
/*    */     //   983: aload_0
/*    */     //   984: iload_1
/*    */     //   985: invokevirtual VW : (I)Lf/ZH;
/*    */     //   988: dup
/*    */     //   989: astore_0
/*    */     //   990: ifnonnull -> 1048
/*    */     //   993: getstatic f/kg0.Zn : Lf/ik;
/*    */     //   996: new java/lang/StringBuilder
/*    */     //   999: dup
/*    */     //   1000: invokespecial <init> : ()V
/*    */     //   1003: ldc_w 'Texture not found '
/*    */     //   1006: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1009: iload_1
/*    */     //   1010: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   1013: ldc_w ' type '
/*    */     //   1016: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1019: aload_2
/*    */     //   1020: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   1023: ldc_w ' id '
/*    */     //   1026: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   1029: iload_3
/*    */     //   1030: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   1033: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   1036: new java/lang/RuntimeException
/*    */     //   1039: dup
/*    */     //   1040: invokespecial <init> : ()V
/*    */     //   1043: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   1048: aload_0
/*    */     //   1049: iload #5
/*    */     //   1051: iload #6
/*    */     //   1053: invokestatic Wl0 : (Lf/ZH;ZZ)Lf/ZH;
/*    */     //   1056: dup
/*    */     //   1057: astore_0
/*    */     //   1058: aconst_null
/*    */     //   1059: astore_1
/*    */     //   1060: ifnull -> 1099
/*    */     //   1063: iload #7
/*    */     //   1065: ifne -> 1073
/*    */     //   1068: iload #8
/*    */     //   1070: ifeq -> 1086
/*    */     //   1073: aload_0
/*    */     //   1074: dup
/*    */     //   1075: iload #7
/*    */     //   1077: iload #8
/*    */     //   1079: invokestatic pS : (Lf/ZH;ZZ)Lf/ZH;
/*    */     //   1082: astore_0
/*    */     //   1083: invokevirtual dispose : ()V
/*    */     //   1086: aload_0
/*    */     //   1087: new com/badlogic/gdx/graphics/Texture
/*    */     //   1090: dup
/*    */     //   1091: astore_1
/*    */     //   1092: aload_0
/*    */     //   1093: invokespecial <init> : (Lf/ZH;)V
/*    */     //   1096: invokevirtual dispose : ()V
/*    */     //   1099: aload_1
/*    */     //   1100: astore_0
/*    */     //   1101: aload_0
/*    */     //   1102: ifnull -> 1108
/*    */     //   1105: goto -> 1110
/*    */     //   1108: aconst_null
/*    */     //   1109: astore_0
/*    */     //   1110: aload_0
/*    */     //   1111: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 64
/*    */     //   #2	-> 164
/*    */     //   #3	-> 327
/*    */     //   #4	-> 386
/*    */     //   #5	-> 391
/*    */     //   #6	-> 397
/*    */     //   #7	-> 403
/*    */     //   #8	-> 423
/*    */     //   #9	-> 425
/*    */     //   #10	-> 435
/*    */     //   #11	-> 491
/*    */     //   #12	-> 500
/*    */     //   #13	-> 611
/*    */     //   #14	-> 617
/*    */     //   #15	-> 648
/*    */     //   #16	-> 653
/*    */     //   #17	-> 684
/*    */     //   #18	-> 725
/*    */     //   #19	-> 752
/*    */     //   #20	-> 756
/*    */     //   #21	-> 761
/*    */     //   #22	-> 775
/*    */     //   #23	-> 803
/*    */     //   #24	-> 826
/*    */     //   #25	-> 832
/*    */     //   #26	-> 850
/*    */     //   #27	-> 861
/*    */     //   #28	-> 898
/*    */     //   #29	-> 905
/*    */     //   #30	-> 910
/*    */     //   #31	-> 915
/*    */     //   #32	-> 934
/*    */   }
/*    */   
/*    */   public final ParticleEffectExt PW(String paramString) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield SJ0 : Lf/sz0;
/*    */     //   4: dup
/*    */     //   5: dup2
/*    */     //   6: astore_2
/*    */     //   7: monitorenter
/*    */     //   8: getfield g30 : Lf/f7;
/*    */     //   11: invokevirtual W5 : ()Lf/Q70;
/*    */     //   14: invokevirtual sk0 : ()Lf/fQ;
/*    */     //   17: astore_2
/*    */     //   18: monitorexit
/*    */     //   19: aload_2
/*    */     //   20: getfield Z8 : I
/*    */     //   23: bipush #15
/*    */     //   25: if_icmpgt -> 66
/*    */     //   28: getstatic f/Bz.na0 : Z
/*    */     //   31: ifne -> 245
/*    */     //   34: aload_0
/*    */     //   35: getfield SJ0 : Lf/sz0;
/*    */     //   38: dup
/*    */     //   39: dup2
/*    */     //   40: astore_2
/*    */     //   41: monitorenter
/*    */     //   42: getfield g30 : Lf/f7;
/*    */     //   45: invokevirtual W5 : ()Lf/Q70;
/*    */     //   48: invokevirtual sk0 : ()Lf/fQ;
/*    */     //   51: astore_2
/*    */     //   52: monitorexit
/*    */     //   53: aload_2
/*    */     //   54: getfield Z8 : I
/*    */     //   57: ifle -> 245
/*    */     //   60: goto -> 66
/*    */     //   63: aload_2
/*    */     //   64: monitorexit
/*    */     //   65: athrow
/*    */     //   66: aload_0
/*    */     //   67: dup
/*    */     //   68: getfield SJ0 : Lf/sz0;
/*    */     //   71: dup
/*    */     //   72: dup2
/*    */     //   73: astore_2
/*    */     //   74: monitorenter
/*    */     //   75: getfield g30 : Lf/f7;
/*    */     //   78: invokevirtual W5 : ()Lf/Q70;
/*    */     //   81: invokevirtual sk0 : ()Lf/fQ;
/*    */     //   84: astore_2
/*    */     //   85: monitorexit
/*    */     //   86: aload_2
/*    */     //   87: getfield Z8 : I
/*    */     //   90: bipush #15
/*    */     //   92: isub
/*    */     //   93: istore_2
/*    */     //   94: new java/util/ArrayList
/*    */     //   97: dup
/*    */     //   98: astore_3
/*    */     //   99: invokespecial <init> : ()V
/*    */     //   102: getfield Hg0 : Ljava/util/ArrayDeque;
/*    */     //   105: invokevirtual iterator : ()Ljava/util/Iterator;
/*    */     //   108: astore #4
/*    */     //   110: aload #4
/*    */     //   112: invokeinterface hasNext : ()Z
/*    */     //   117: ifeq -> 195
/*    */     //   120: aload_0
/*    */     //   121: aload #4
/*    */     //   123: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   128: checkcast java/lang/String
/*    */     //   131: astore #5
/*    */     //   133: getfield SJ0 : Lf/sz0;
/*    */     //   136: aload #5
/*    */     //   138: invokevirtual Ek0 : (Ljava/lang/String;)Z
/*    */     //   141: ifne -> 172
/*    */     //   144: aload_0
/*    */     //   145: getfield Hg0 : Ljava/util/ArrayDeque;
/*    */     //   148: aload #5
/*    */     //   150: invokevirtual remove : (Ljava/lang/Object;)Z
/*    */     //   153: pop
/*    */     //   154: getstatic f/kg0.Zn : Lf/ik;
/*    */     //   157: astore #6
/*    */     //   159: ldc_w 'Tried to unload not loaded asset: '
/*    */     //   162: aload #5
/*    */     //   164: aload #6
/*    */     //   166: invokestatic tq : (Ljava/lang/String;Ljava/lang/String;Lf/ik;)V
/*    */     //   169: goto -> 110
/*    */     //   172: aload_0
/*    */     //   173: getfield SJ0 : Lf/sz0;
/*    */     //   176: aload #5
/*    */     //   178: invokevirtual Na0 : (Ljava/lang/String;)I
/*    */     //   181: iconst_1
/*    */     //   182: if_icmpgt -> 110
/*    */     //   185: aload_3
/*    */     //   186: aload #5
/*    */     //   188: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   191: pop
/*    */     //   192: goto -> 110
/*    */     //   195: aload_3
/*    */     //   196: invokevirtual iterator : ()Ljava/util/Iterator;
/*    */     //   199: astore_3
/*    */     //   200: aload_3
/*    */     //   201: invokeinterface hasNext : ()Z
/*    */     //   206: ifeq -> 245
/*    */     //   209: iload_2
/*    */     //   210: aload_0
/*    */     //   211: dup
/*    */     //   212: aload_3
/*    */     //   213: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   218: checkcast java/lang/String
/*    */     //   221: astore_2
/*    */     //   222: getfield SJ0 : Lf/sz0;
/*    */     //   225: aload_2
/*    */     //   226: invokevirtual zu : (Ljava/lang/String;)V
/*    */     //   229: getfield Hg0 : Ljava/util/ArrayDeque;
/*    */     //   232: aload_2
/*    */     //   233: invokevirtual remove : (Ljava/lang/Object;)Z
/*    */     //   236: pop
/*    */     //   237: iconst_m1
/*    */     //   238: iadd
/*    */     //   239: dup
/*    */     //   240: istore_2
/*    */     //   241: iconst_1
/*    */     //   242: if_icmpge -> 200
/*    */     //   245: aload_0
/*    */     //   246: dup
/*    */     //   247: dup2
/*    */     //   248: aload_1
/*    */     //   249: ldc_w '\\'
/*    */     //   252: ldc_w '/'
/*    */     //   255: invokevirtual replaceAll : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   258: astore_1
/*    */     //   259: getfield SJ0 : Lf/sz0;
/*    */     //   262: aload_1
/*    */     //   263: new com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExtLoaderExt$ParticleEffectLoadParameterExt
/*    */     //   266: dup
/*    */     //   267: astore_2
/*    */     //   268: aload_0
/*    */     //   269: dup
/*    */     //   270: getfield HU : Lf/Ih0;
/*    */     //   273: astore_3
/*    */     //   274: getfield aL : Lf/Xa0;
/*    */     //   277: aload_3
/*    */     //   278: swap
/*    */     //   279: invokespecial <init> : (Lf/ny;Lf/Xa0;)V
/*    */     //   282: ldc com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
/*    */     //   284: aload_2
/*    */     //   285: invokevirtual ks0 : (Ljava/lang/String;Ljava/lang/Class;Lf/wP;)V
/*    */     //   288: getfield SJ0 : Lf/sz0;
/*    */     //   291: invokevirtual B9 : ()V
/*    */     //   294: getfield SJ0 : Lf/sz0;
/*    */     //   297: dup
/*    */     //   298: dup
/*    */     //   299: astore_2
/*    */     //   300: ldc com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
/*    */     //   302: astore_3
/*    */     //   303: monitorenter
/*    */     //   304: aload_3
/*    */     //   305: aload_1
/*    */     //   306: invokevirtual Yo : (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;
/*    */     //   309: aload_2
/*    */     //   310: monitorexit
/*    */     //   311: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
/*    */     //   314: astore_2
/*    */     //   315: getfield SJ0 : Lf/sz0;
/*    */     //   318: aload_1
/*    */     //   319: invokevirtual Na0 : (Ljava/lang/String;)I
/*    */     //   322: iconst_1
/*    */     //   323: if_icmpne -> 335
/*    */     //   326: aload_0
/*    */     //   327: getfield SJ0 : Lf/sz0;
/*    */     //   330: iconst_2
/*    */     //   331: aload_1
/*    */     //   332: invokevirtual vf0 : (ILjava/lang/String;)V
/*    */     //   335: aload_2
/*    */     //   336: aload_0
/*    */     //   337: dup
/*    */     //   338: getfield Hg0 : Ljava/util/ArrayDeque;
/*    */     //   341: aload_1
/*    */     //   342: invokevirtual remove : (Ljava/lang/Object;)Z
/*    */     //   345: pop
/*    */     //   346: getfield Hg0 : Ljava/util/ArrayDeque;
/*    */     //   349: aload_1
/*    */     //   350: invokevirtual add : (Ljava/lang/Object;)Z
/*    */     //   353: pop
/*    */     //   354: invokevirtual isLoaded : ()Z
/*    */     //   357: ifeq -> 362
/*    */     //   360: aload_2
/*    */     //   361: areturn
/*    */     //   362: aload_2
/*    */     //   363: dup
/*    */     //   364: invokevirtual getBatches : ()Lf/fQ;
/*    */     //   367: astore_3
/*    */     //   368: iconst_0
/*    */     //   369: istore #4
/*    */     //   371: invokevirtual getControllers : ()Lf/fQ;
/*    */     //   374: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   377: astore #5
/*    */     //   379: aload #5
/*    */     //   381: invokevirtual hasNext : ()Z
/*    */     //   384: ifeq -> 720
/*    */     //   387: aload #5
/*    */     //   389: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   392: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleController
/*    */     //   395: dup
/*    */     //   396: astore #6
/*    */     //   398: instanceof com/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt
/*    */     //   401: ifeq -> 379
/*    */     //   404: aload_3
/*    */     //   405: aload #6
/*    */     //   407: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt
/*    */     //   410: astore #6
/*    */     //   412: getfield Z8 : I
/*    */     //   415: iload #4
/*    */     //   417: if_icmpgt -> 584
/*    */     //   420: aload_0
/*    */     //   421: aload #6
/*    */     //   423: dup
/*    */     //   424: new com/badlogic/gdx/graphics/g3d/particles/batches/BillboardParticleBatchExt
/*    */     //   427: dup
/*    */     //   428: astore #7
/*    */     //   430: aload_0
/*    */     //   431: aload #7
/*    */     //   433: aload_0
/*    */     //   434: getfield aL : Lf/Xa0;
/*    */     //   437: invokespecial <init> : (Lf/Xa0;)V
/*    */     //   440: getfield HU : Lf/Ih0;
/*    */     //   443: invokevirtual setCamera : (Lf/ny;)V
/*    */     //   446: new com/badlogic/gdx/graphics/g3d/particles/renderers/BillboardRendererExt
/*    */     //   449: dup
/*    */     //   450: aload #7
/*    */     //   452: invokespecial <init> : (Lcom/badlogic/gdx/graphics/g3d/particles/batches/BillboardParticleBatchExt;)V
/*    */     //   455: putfield renderer : Lcom/badlogic/gdx/graphics/g3d/particles/renderers/ParticleControllerRenderer;
/*    */     //   458: aconst_null
/*    */     //   459: astore #8
/*    */     //   461: iconst_0
/*    */     //   462: istore #9
/*    */     //   464: invokevirtual vb0 : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt;)Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   467: astore #8
/*    */     //   469: goto -> 535
/*    */     //   472: astore #9
/*    */     //   474: iconst_1
/*    */     //   475: istore #10
/*    */     //   477: getstatic f/kg0.Zn : Lf/ik;
/*    */     //   480: ldc_w 'Failed to load effect '
/*    */     //   483: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   486: aload_2
/*    */     //   487: invokevirtual path : ()Ljava/lang/String;
/*    */     //   490: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   493: ldc_w ' '
/*    */     //   496: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   499: aload #6
/*    */     //   501: getfield type : Lcom/badlogic/gdx/graphics/g3d/particles/APSType;
/*    */     //   504: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   507: ldc_w ' '
/*    */     //   510: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   513: aload #6
/*    */     //   515: getfield aps_id : I
/*    */     //   518: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   521: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   524: aload #9
/*    */     //   526: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   531: iload #10
/*    */     //   533: istore #9
/*    */     //   535: iload #9
/*    */     //   537: ifne -> 561
/*    */     //   540: aload #8
/*    */     //   542: ifnull -> 561
/*    */     //   545: aload_2
/*    */     //   546: aload #8
/*    */     //   548: aload #7
/*    */     //   550: aload #8
/*    */     //   552: invokevirtual setTexture : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   555: invokevirtual addResource : (Lf/iq0;)V
/*    */     //   558: goto -> 572
/*    */     //   561: aload #7
/*    */     //   563: invokestatic ZZ : ()Lf/interface;
/*    */     //   566: getfield Nz : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   569: invokevirtual setTexture : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   572: aload_3
/*    */     //   573: aload #7
/*    */     //   575: iinc #4, 1
/*    */     //   578: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   581: goto -> 379
/*    */     //   584: aload_0
/*    */     //   585: aload #6
/*    */     //   587: aload_3
/*    */     //   588: iload #4
/*    */     //   590: dup
/*    */     //   591: iconst_1
/*    */     //   592: iadd
/*    */     //   593: istore #4
/*    */     //   595: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   598: checkcast com/badlogic/gdx/graphics/g3d/particles/batches/BillboardParticleBatchExt
/*    */     //   601: astore #7
/*    */     //   603: aconst_null
/*    */     //   604: astore #8
/*    */     //   606: iconst_0
/*    */     //   607: istore #9
/*    */     //   609: invokevirtual vb0 : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt;)Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   612: astore #8
/*    */     //   614: goto -> 680
/*    */     //   617: astore #9
/*    */     //   619: iconst_1
/*    */     //   620: istore #10
/*    */     //   622: getstatic f/kg0.Zn : Lf/ik;
/*    */     //   625: ldc_w 'Failed to load aps texture type = '
/*    */     //   628: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   631: aload #6
/*    */     //   633: getfield type : Lcom/badlogic/gdx/graphics/g3d/particles/APSType;
/*    */     //   636: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   639: ldc_w ' '
/*    */     //   642: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   645: aload #6
/*    */     //   647: getfield aps_id : I
/*    */     //   650: invokevirtual append : (I)Ljava/lang/StringBuilder;
/*    */     //   653: ldc_w ' '
/*    */     //   656: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   659: aload_2
/*    */     //   660: invokevirtual path : ()Ljava/lang/String;
/*    */     //   663: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   666: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   669: aload #9
/*    */     //   671: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*    */     //   676: iload #10
/*    */     //   678: istore #9
/*    */     //   680: iload #9
/*    */     //   682: ifne -> 706
/*    */     //   685: aload #8
/*    */     //   687: ifnull -> 706
/*    */     //   690: aload_2
/*    */     //   691: aload #8
/*    */     //   693: aload #7
/*    */     //   695: aload #8
/*    */     //   697: invokevirtual setTexture : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   700: invokevirtual addResource : (Lf/iq0;)V
/*    */     //   703: goto -> 379
/*    */     //   706: aload #7
/*    */     //   708: invokestatic ZZ : ()Lf/interface;
/*    */     //   711: getfield Nz : Lcom/badlogic/gdx/graphics/Texture;
/*    */     //   714: invokevirtual setTexture : (Lcom/badlogic/gdx/graphics/Texture;)V
/*    */     //   717: goto -> 379
/*    */     //   720: aload_2
/*    */     //   721: dup
/*    */     //   722: aload_0
/*    */     //   723: getfield SJ0 : Lf/sz0;
/*    */     //   726: aload_1
/*    */     //   727: invokevirtual setLoaded : (Lf/sz0;Ljava/lang/String;)V
/*    */     //   730: areturn
/*    */     //   731: aload_2
/*    */     //   732: monitorexit
/*    */     //   733: athrow
/*    */     //   734: aload_2
/*    */     //   735: monitorexit
/*    */     //   736: athrow
/*    */     //   737: aload_2
/*    */     //   738: monitorexit
/*    */     //   739: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 8
/*    */     //   #2	-> 20
/*    */     //   #3	-> 42
/*    */     //   #4	-> 54
/*    */     //   #5	-> 75
/*    */     //   #6	-> 87
/*    */     //   #7	-> 159
/*    */     //   #8	-> 173
/*    */     //   #9	-> 306
/*    */     //   #10	-> 311
/*    */     //   #11	-> 480
/*    */     //   #12	-> 487
/*    */     //   #13	-> 566
/*    */     //   #14	-> 569
/*    */     //   #15	-> 625
/*    */     //   #16	-> 633
/*    */     //   #17	-> 711
/*    */     //   #18	-> 714
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   8	17	737	finally
/*    */     //   42	51	63	finally
/*    */     //   75	84	734	finally
/*    */     //   304	309	731	finally
/*    */     //   464	467	472	java/lang/Exception
/*    */     //   609	612	617	java/lang/Exception
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kg0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */