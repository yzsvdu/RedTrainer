/*  1 */ package f;public final class sz0 implements iq0 { public final f7 MO; public final f7 g30; public final f7 r70; public final MG Wq; public final f7 yE0; public final fQ Lw; public final void uS() { String str; bs bs; if (Ek0((bs = (bs)this.Lw.Hc(0)).bz)) { this.Sw0.zK0("Already loaded: " + bs); Class clazz = (Class)this.g30.pd0(bs.bz); ((UI)((f7)this.MO.pd0(clazz)).pd0(bs.bz)).HS++; Ce(bs.bz); Fs0 fs0; wP wP; if ((wP = bs.Rs) != null && (fs0 = wP.loadedCallback) != null) { str = bs.bz;
/*  2 */         vf0(((YH)fs0).ja, this); }  } else { ((sz0)super)
/*  3 */         .Sw0.p00("Loading: " + bs);
/*  4 */       Class clazz = bs.RA0; EH0 eH0; if ((eH0 = super.Z6(clazz, bs.bz)) != null) { AF aF = ((sz0)super).mc0; ((sz0)super).le0.Com3(new iw((sz0)this, bs, eH0, this)); return; }  throw new JU(
/*  5 */           B40.df("No loader for type: ")
/*    */ 
/*    */           
/*  8 */           .append(bs.RA0.getSimpleName()).toString()); }  } public final AF mc0; public final fQ le0; public Lpt7 Sw0; public sz0() { this(); ax ax; this(this); } public sz0(Xt0 paramXt0) { this(paramXt0, true); } public sz0(Xt0 paramXt0, boolean paramBoolean) { AF aF; f7 f72; MG mG; f7 f71; fQ fQ1; Lpt7 lpt7; this(); this.MO = f72; this(); this.g30 = f72; this(); this.r70 = f72; this(); this.Wq = mG; this(); this.yE0 = f71; this(); this.Lw = fQ1; this(); this.le0 = fQ1; this("AssetManager", 0); this.Sw0 = lpt7; if (paramBoolean) { mw0 mw0; D7 d7; Jn0 jn0; Z7 z7; ck0 ck0; f00 f00; XY xY; QY qY; ParticleEffectLoader particleEffectLoader; b b; EC0 eC0; RA0 rA0; ZW zW; Dj0 dj0; dM0 dM0; nP nP; hd0 hd0; this(paramXt0); YI0(Me.class, mw0); this(paramXt0); YI0(s70.class, d7); this(paramXt0); YI0(ZH.class, jn0); this(paramXt0); YI0(cF.class, z7); this(paramXt0); YI0(COm1.class, ck0); this(paramXt0); YI0(Texture.class, f00); this(paramXt0); YI0(Mw.class, xY); this(paramXt0); YI0(qp.class, qY); this(paramXt0); YI0(ParticleEffect.class, (EH0)particleEffectLoader); this(paramXt0); YI0(ws0.class, b); this(paramXt0); YI0(Pe0.class, eC0); this(); this(nP, paramXt0); U70(cf0.class, ".g3dj", rA0); this(); this(hd0, paramXt0); U70(cf0.class, ".g3db", rA0); this(paramXt0); U70(cf0.class, ".obj", zW); this(paramXt0); YI0(Rm0.class, dj0); this(paramXt0); YI0(Am0.class, dM0); }  this(1, "AssetManager"); this.mc0 = this; } public final boolean w3() { iw iw; try { if ((iw = (iw)this.le0.peek()).z70 || iw.Jd0()) {  } else {  }  if (false) { UI uI; this.le0.pop(); if (iw.z70) return true;  String str = iw.fe.bz; Class clazz = iw.fe.RA0; Object object = iw.Ej; this.g30.X00(str, clazz); f7 f71; if ((f71 = (f7)this.MO.pd0(clazz)) == null) { this(); this.MO.X00(clazz, f71); }  this(); (new UI()).pE0 = object; f71.X00(str, uI); bs bs; wP wP; Fs0 fs0; if ((wP = (bs = iw.fe).Rs) != null && (fs0 = wP.loadedCallback) != null) { String str1 = bs.bz; vf0(((YH)fs0).ja, str1); }  long l = System.nanoTime(); this.Sw0.zK0(B40.df("Loaded: ").append((float)(l - iw.rF) / 1000000.0F).append("ms ").append(iw.fe).toString()); return true; }  return false; } catch (RuntimeException runtimeException) { iw.z70 = true; throw null; }  } public final void Ce(String paramString) { fQ fQ1; if ((fQ1 = (fQ)this.r70.pd0(paramString)) == null) return;  Hc0 hc0 = fQ1.r30(); while (hc0.hasNext()) { Class clazz = (Class)this.g30.pd0(str); ((UI)((f7)this.MO.pd0(clazz)).pd0(str)).HS++; String str; Ce(str = (String)hc0.next()); }  } public final synchronized boolean az(String paramString) { fQ fQ1; if ((fQ1 = this.le0).Z8 > 0 && ((iw)fQ1.first()).fe.bz.equals(paramString)) return true;  fQ fQ2; for (byte b = 0; b < (fQ2 = this.Lw).Z8; b++) { if (((bs)fQ2.get(b)).bz.equals(paramString)) return true;  }  return Ek0(paramString); } public final synchronized void zu(String paramString) { RD0 rD0; String str; wP wP; Fs0 fs0; bs bs; iw iw; fQ fQ1; if ((fQ1 = this.le0).Z8 > 0 && (iw = (iw)fQ1.first()).fe.bz.equals(paramString)) { this.Sw0.p00("Unload (from tasks): " + paramString); iw.z70 = true; EH0 eH0; if (eH0 = iw.gm0 instanceof Ar0) { Ar0 ar0 = (Ar0)this; sz0 sz01 = iw.lPt3; bs bs1; String str1 = (bs1 = iw.fe).bz; if (iw.fe.b7 == null) bs1.b7 = resolve(str1);  rD0 = bs1.b7; wP = iw.fe.Rs; ar0.unloadAsync(sz01, str1, this, wP); }  return; }  Class clazz; byte b; byte b1; fQ fQ2; for (clazz = (Class)((sz0)super).g30.pd0(wP), b = -1, b1 = 0; b1 < (fQ2 = ((sz0)super).Lw).Z8; ) { if (((bs)fQ2.get(b1)).bz.equals(wP)) { b = b1; break; }  b1++; }  if (b != -1) { bs = (bs)((sz0)super).Lw.Hc(b); ((sz0)super).Sw0.p00("Unload (from queue): " + wP); if (clazz != null && (wP = bs.Rs) != null && (fs0 = wP.loadedCallback) != null) { str = bs.bz; super.vf0(((YH)fs0).ja, this); }  return; }  if (bs != null) { UI uI; if (--(uI = (UI)((f7)((sz0)super).MO.pd0(bs)).pd0(fs0)).HS <= 0) { ((sz0)super).Sw0.p00("Unload (dispose): " + fs0); Object object; if (object = uI.pE0 instanceof iq0) ((iq0)object).dispose();  ((sz0)super).g30.HH(fs0); ((f7)((sz0)super).MO.pd0(bs)).HH(fs0); } else { ((sz0)super).Sw0.p00("Unload (decrement): " + fs0); }  fQ fQ3; if ((fQ3 = (fQ)((sz0)super).r70.pd0(fs0)) != null) for (Hc0 hc0 = fQ3.r30(); hc0.hasNext();) { if (super.Ek0(str1 = (String)hc0.next())) super.zu(str1);  }   if (uI.HS <= 0) ((sz0)super).r70.HH(fs0);  return; }  throw new JU(m0.tF0("Asset not loaded: ", fs0)); } public final synchronized boolean Ek0(String paramString) { return (paramString == null) ? false : this.g30.GB0(paramString); } public final EH0 Z6(Class paramClass, String paramString) { EH0 eH0; f7 f71; if ((f71 = (f7)this.yE0.pd0(paramClass)) == null || this.Cx0 < 1) return null;  if (paramString == null) return (EH0)pd0("");  f71 = null; int i = -1; oc oc; (oc = sh()).getClass(); while (oc.hasNext()) { yO yO; if (((String)(yO = oc.next()).Lb).length() > i && paramString.endsWith((String)yO.Lb)) { eH0 = (EH0)yO.mm; i = ((String)yO.Lb).length(); }  }  return this; } public final synchronized void ks0(String paramString, Class paramClass, wP paramwP) { if (Z6(paramClass, paramString) != null) { byte b; fQ fQ1; for (b = 0; b < (fQ1 = this.Lw).Z8; ) { bs bs; if (!(bs = (bs)fQ1.get(b)).bz.equals(paramString) || bs.RA0.equals(paramClass)) { b++; continue; }  throw new JU("Asset with name '" + paramString + "' already in preload queue, but has different type (expected: " + paramClass.getSimpleName() + ", found: " + bs.RA0.getSimpleName() + ")"); }  for (b = 0; b < (fQ1 = this.le0).Z8; ) { bs bs; if (!(bs = ((iw)fQ1.get(b)).fe).bz.equals(paramString) || bs.RA0.equals(paramClass)) { b++; continue; }  throw new JU("Asset with name '" + paramString + "' already in task list, but has different type (expected: " + paramClass.getSimpleName() + ", found: " + bs.RA0.getSimpleName() + ")"); }  Class clazz; if ((clazz = (Class)this.g30.pd0(paramString)) == null || clazz.equals(paramClass))
/*    */       { bs bs;
/*    */ 
/*    */         
/* 12 */         this(paramString, paramClass, paramwP); this.Lw.Com3(this); this.Sw0.zK0("Queued: " + this); return; }  throw new JU("Asset with name '" + paramString + "' already loaded, but has different type (expected: " + paramClass.getSimpleName() + ", found: " + clazz.getSimpleName() + ")"); }  throw new JU(
/* 13 */         B40.df("No loader for type: ")
/*    */         
/* 15 */         .append(paramClass.getSimpleName()).toString()); }
/*    */ 
/*    */   
/*    */   public final synchronized boolean JH0() {
/*    */     try {
/*    */       return (w3() && this.Lw.Z8 == 0 && this.le0.Z8 == 0);
/*    */     } finally {
/*    */       Exception exception = null;
/*    */       String str = "Error loading asset.";
/*    */       Lpt7 lpt7;
/*    */       if ((lpt7 = this.Sw0).q1 >= 1) {
/*    */         Q50 q50 = UB0.Kg0;
/*    */         String str1 = lpt7.EX;
/*    */         if (q50.Bs >= 1) {
/*    */           q50.Aa0.getClass();
/*    */           System.err.println("[" + str1 + "] " + str);
/*    */           exception.printStackTrace(System.err);
/*    */         } 
/*    */       } 
/*    */       if (!this.le0.isEmpty()) {
/*    */         iw iw;
/*    */         if (((iw)this.le0.pop()).hv0 && iw.Vr0 != null)
/*    */           for (Hc0 hc0 = iw.Vr0.r30(); hc0.hasNext(); zu(((bs)hc0.next()).bz)); 
/*    */         this.le0.clear();
/*    */         throw new JU(exception);
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void B9() {
/*    */     this.Sw0.zK0("Waiting for loading to complete...");
/*    */     for (; !JH0(); Thread.yield());
/*    */     this.Sw0.zK0("Loading complete.");
/*    */   }
/*    */   
/*    */   public final synchronized void Pb(String paramString, fQ paramfQ) {
/*    */     // Byte code:
/*    */     //   0: aload_2
/*    */     //   1: aload_0
/*    */     //   2: getfield Wq : Lf/MG;
/*    */     //   5: astore_2
/*    */     //   6: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   9: astore_3
/*    */     //   10: aload_3
/*    */     //   11: invokevirtual hasNext : ()Z
/*    */     //   14: ifeq -> 426
/*    */     //   17: aload_3
/*    */     //   18: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   21: checkcast f/bs
/*    */     //   24: dup
/*    */     //   25: astore #4
/*    */     //   27: getfield bz : Ljava/lang/String;
/*    */     //   30: dup
/*    */     //   31: astore #5
/*    */     //   33: ifnull -> 410
/*    */     //   36: aload #5
/*    */     //   38: aload_2
/*    */     //   39: getfield Hm : [Ljava/lang/Object;
/*    */     //   42: astore #6
/*    */     //   44: invokevirtual hashCode : ()I
/*    */     //   47: i2l
/*    */     //   48: ldc2_w -7046029254386353131
/*    */     //   51: lmul
/*    */     //   52: aload_2
/*    */     //   53: getfield Mj : I
/*    */     //   56: lushr
/*    */     //   57: l2i
/*    */     //   58: istore #7
/*    */     //   60: aload #6
/*    */     //   62: iload #7
/*    */     //   64: aaload
/*    */     //   65: dup
/*    */     //   66: astore #8
/*    */     //   68: ifnonnull -> 81
/*    */     //   71: iload #7
/*    */     //   73: iconst_1
/*    */     //   74: iadd
/*    */     //   75: ineg
/*    */     //   76: istore #7
/*    */     //   78: goto -> 91
/*    */     //   81: aload #8
/*    */     //   83: aload #5
/*    */     //   85: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   88: ifeq -> 396
/*    */     //   91: iload #7
/*    */     //   93: iflt -> 102
/*    */     //   96: iconst_1
/*    */     //   97: istore #5
/*    */     //   99: goto -> 105
/*    */     //   102: iconst_0
/*    */     //   103: istore #5
/*    */     //   105: iload #5
/*    */     //   107: ifeq -> 113
/*    */     //   110: goto -> 10
/*    */     //   113: aload_0
/*    */     //   114: dup
/*    */     //   115: aload_2
/*    */     //   116: aload #4
/*    */     //   118: getfield bz : Ljava/lang/String;
/*    */     //   121: invokevirtual GV : (Ljava/lang/Object;)V
/*    */     //   124: monitorenter
/*    */     //   125: getfield r70 : Lf/f7;
/*    */     //   128: aload_1
/*    */     //   129: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   132: checkcast f/fQ
/*    */     //   135: dup
/*    */     //   136: astore #5
/*    */     //   138: ifnonnull -> 161
/*    */     //   141: aload_0
/*    */     //   142: new f/fQ
/*    */     //   145: dup
/*    */     //   146: astore #5
/*    */     //   148: invokespecial <init> : ()V
/*    */     //   151: getfield r70 : Lf/f7;
/*    */     //   154: aload_1
/*    */     //   155: aload #5
/*    */     //   157: invokevirtual X00 : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   160: pop
/*    */     //   161: aload_0
/*    */     //   162: aload #4
/*    */     //   164: aload #5
/*    */     //   166: aload #4
/*    */     //   168: getfield bz : Ljava/lang/String;
/*    */     //   171: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   174: getfield bz : Ljava/lang/String;
/*    */     //   177: invokevirtual Ek0 : (Ljava/lang/String;)Z
/*    */     //   180: ifeq -> 272
/*    */     //   183: aload_0
/*    */     //   184: aload #4
/*    */     //   186: aload_0
/*    */     //   187: dup
/*    */     //   188: dup
/*    */     //   189: getfield Sw0 : Lf/Lpt7;
/*    */     //   192: new java/lang/StringBuilder
/*    */     //   195: dup
/*    */     //   196: invokespecial <init> : ()V
/*    */     //   199: ldc_w 'Dependency already loaded: '
/*    */     //   202: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   205: aload #4
/*    */     //   207: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   210: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   213: invokevirtual zK0 : (Ljava/lang/String;)V
/*    */     //   216: getfield g30 : Lf/f7;
/*    */     //   219: aload #4
/*    */     //   221: getfield bz : Ljava/lang/String;
/*    */     //   224: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   227: checkcast java/lang/Class
/*    */     //   230: astore #5
/*    */     //   232: getfield MO : Lf/f7;
/*    */     //   235: aload #5
/*    */     //   237: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   240: checkcast f/f7
/*    */     //   243: aload #4
/*    */     //   245: getfield bz : Ljava/lang/String;
/*    */     //   248: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   251: checkcast f/UI
/*    */     //   254: dup
/*    */     //   255: getfield HS : I
/*    */     //   258: iconst_1
/*    */     //   259: iadd
/*    */     //   260: putfield HS : I
/*    */     //   263: getfield bz : Ljava/lang/String;
/*    */     //   266: invokevirtual Ce : (Ljava/lang/String;)V
/*    */     //   269: goto -> 351
/*    */     //   272: aload_0
/*    */     //   273: aload #4
/*    */     //   275: dup
/*    */     //   276: aload_0
/*    */     //   277: getfield Sw0 : Lf/Lpt7;
/*    */     //   280: new java/lang/StringBuilder
/*    */     //   283: dup
/*    */     //   284: invokespecial <init> : ()V
/*    */     //   287: ldc_w 'Loading dependency: '
/*    */     //   290: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   293: aload #4
/*    */     //   295: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   298: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   301: invokevirtual p00 : (Ljava/lang/String;)V
/*    */     //   304: getfield RA0 : Ljava/lang/Class;
/*    */     //   307: astore #5
/*    */     //   309: getfield bz : Ljava/lang/String;
/*    */     //   312: aload #5
/*    */     //   314: swap
/*    */     //   315: invokevirtual Z6 : (Ljava/lang/Class;Ljava/lang/String;)Lf/EH0;
/*    */     //   318: dup
/*    */     //   319: astore #5
/*    */     //   321: ifnull -> 356
/*    */     //   324: aload_0
/*    */     //   325: getfield le0 : Lf/fQ;
/*    */     //   328: new f/iw
/*    */     //   331: dup
/*    */     //   332: aload_0
/*    */     //   333: dup
/*    */     //   334: getfield mc0 : Lf/AF;
/*    */     //   337: astore #6
/*    */     //   339: aload #4
/*    */     //   341: aload #5
/*    */     //   343: aload #6
/*    */     //   345: invokespecial <init> : (Lf/sz0;Lf/bs;Lf/EH0;Lf/AF;)V
/*    */     //   348: invokevirtual Com3 : (Ljava/lang/Object;)V
/*    */     //   351: aload_0
/*    */     //   352: monitorexit
/*    */     //   353: goto -> 10
/*    */     //   356: new f/JU
/*    */     //   359: dup
/*    */     //   360: new java/lang/StringBuilder
/*    */     //   363: dup
/*    */     //   364: invokespecial <init> : ()V
/*    */     //   367: ldc_w 'No loader for type: '
/*    */     //   370: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   373: aload #4
/*    */     //   375: getfield RA0 : Ljava/lang/Class;
/*    */     //   378: invokevirtual getSimpleName : ()Ljava/lang/String;
/*    */     //   381: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   384: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   387: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   390: athrow
/*    */     //   391: astore_1
/*    */     //   392: aload_1
/*    */     //   393: aload_0
/*    */     //   394: monitorexit
/*    */     //   395: athrow
/*    */     //   396: iload #7
/*    */     //   398: iconst_1
/*    */     //   399: iadd
/*    */     //   400: aload_2
/*    */     //   401: getfield vj0 : I
/*    */     //   404: iand
/*    */     //   405: istore #7
/*    */     //   407: goto -> 60
/*    */     //   410: aload_2
/*    */     //   411: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   414: pop
/*    */     //   415: new java/lang/IllegalArgumentException
/*    */     //   418: dup
/*    */     //   419: ldc_w 'key cannot be null.'
/*    */     //   422: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   425: athrow
/*    */     //   426: aload_2
/*    */     //   427: bipush #32
/*    */     //   429: aload_2
/*    */     //   430: getfield hc : F
/*    */     //   433: invokestatic nf : (IF)I
/*    */     //   436: istore_0
/*    */     //   437: getfield Hm : [Ljava/lang/Object;
/*    */     //   440: dup
/*    */     //   441: astore_1
/*    */     //   442: arraylength
/*    */     //   443: iload_0
/*    */     //   444: if_icmpgt -> 470
/*    */     //   447: aload_2
/*    */     //   448: getfield xl : I
/*    */     //   451: ifne -> 457
/*    */     //   454: goto -> 480
/*    */     //   457: aload_1
/*    */     //   458: aload_2
/*    */     //   459: iconst_0
/*    */     //   460: putfield xl : I
/*    */     //   463: aconst_null
/*    */     //   464: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   467: goto -> 480
/*    */     //   470: aload_2
/*    */     //   471: dup
/*    */     //   472: iconst_0
/*    */     //   473: putfield xl : I
/*    */     //   476: iload_0
/*    */     //   477: invokevirtual lW : (I)V
/*    */     //   480: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 39
/*    */     //   #2	-> 44
/*    */     //   #3	-> 64
/*    */     //   #4	-> 118
/*    */     //   #5	-> 125
/*    */     //   #6	-> 304
/*    */     //   #7	-> 352
/*    */     //   #8	-> 356
/*    */     //   #9	-> 378
/*    */     //   #10	-> 381
/*    */     //   #11	-> 394
/*    */     //   #12	-> 401
/*    */     //   #13	-> 411
/*    */     //   #14	-> 415
/*    */     //   #15	-> 430
/*    */     //   #16	-> 433
/*    */     //   #17	-> 448
/*    */     //   #18	-> 473
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   125	135	391	finally
/*    */     //   141	145	391	finally
/*    */     //   148	160	391	finally
/*    */     //   161	180	391	finally
/*    */     //   183	230	391	finally
/*    */     //   232	258	391	finally
/*    */     //   260	307	391	finally
/*    */     //   309	318	391	finally
/*    */     //   324	337	391	finally
/*    */     //   339	351	391	finally
/*    */     //   356	391	391	finally
/*    */   }
/*    */   
/*    */   public final synchronized void YI0(Class paramClass, EH0 paramEH0) {
/*    */     U70(paramClass, null, paramEH0);
/*    */   }
/*    */   
/*    */   public final synchronized void U70(Class paramClass, String paramString, EH0 paramEH0) {
/*    */     this.Sw0.zK0(B40.df("Loader set: ").append(paramClass.getSimpleName()).append(" -> ").append(paramEH0.getClass().getSimpleName()).toString());
/*    */     f7 f71;
/*    */     if ((f71 = (f7)this.yE0.pd0(paramClass)) == null) {
/*    */       this();
/*    */       this.yE0.X00(paramClass, f71);
/*    */     } 
/*    */     if (paramString == null)
/*    */       paramString = ""; 
/*    */     f71.X00(paramString, paramEH0);
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     this.Sw0.zK0("Disposing.");
/*    */     yi0();
/*    */     this.mc0.dispose();
/*    */   }
/*    */   
/*    */   public final void yi0() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: dup
/*    */     //   3: dup2
/*    */     //   4: monitorenter
/*    */     //   5: getfield Lw : Lf/fQ;
/*    */     //   8: invokevirtual clear : ()V
/*    */     //   11: monitorexit
/*    */     //   12: invokevirtual B9 : ()V
/*    */     //   15: monitorenter
/*    */     //   16: new f/Nu0
/*    */     //   19: dup
/*    */     //   20: astore_1
/*    */     //   21: invokespecial <init> : ()V
/*    */     //   24: aload_0
/*    */     //   25: getfield g30 : Lf/f7;
/*    */     //   28: getfield Cx0 : I
/*    */     //   31: ifle -> 322
/*    */     //   34: aload_1
/*    */     //   35: bipush #51
/*    */     //   37: aload_1
/*    */     //   38: getfield Ke : F
/*    */     //   41: invokestatic nf : (IF)I
/*    */     //   44: istore_2
/*    */     //   45: getfield q40 : [Ljava/lang/Object;
/*    */     //   48: dup
/*    */     //   49: astore_3
/*    */     //   50: arraylength
/*    */     //   51: iload_2
/*    */     //   52: if_icmpgt -> 78
/*    */     //   55: aload_1
/*    */     //   56: getfield Ty : I
/*    */     //   59: ifne -> 65
/*    */     //   62: goto -> 88
/*    */     //   65: aload_3
/*    */     //   66: aload_1
/*    */     //   67: iconst_0
/*    */     //   68: putfield Ty : I
/*    */     //   71: aconst_null
/*    */     //   72: invokestatic fill : ([Ljava/lang/Object;Ljava/lang/Object;)V
/*    */     //   75: goto -> 88
/*    */     //   78: aload_1
/*    */     //   79: dup
/*    */     //   80: iconst_0
/*    */     //   81: putfield Ty : I
/*    */     //   84: iload_2
/*    */     //   85: invokevirtual H3 : (I)V
/*    */     //   88: aload_0
/*    */     //   89: getfield g30 : Lf/f7;
/*    */     //   92: invokevirtual W5 : ()Lf/Q70;
/*    */     //   95: invokevirtual sk0 : ()Lf/fQ;
/*    */     //   98: dup
/*    */     //   99: astore_2
/*    */     //   100: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   103: astore_3
/*    */     //   104: aload_3
/*    */     //   105: invokevirtual hasNext : ()Z
/*    */     //   108: ifeq -> 259
/*    */     //   111: aload_0
/*    */     //   112: aload_3
/*    */     //   113: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   116: checkcast java/lang/String
/*    */     //   119: astore #4
/*    */     //   121: getfield r70 : Lf/f7;
/*    */     //   124: aload #4
/*    */     //   126: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   129: checkcast f/fQ
/*    */     //   132: dup
/*    */     //   133: astore #4
/*    */     //   135: ifnonnull -> 141
/*    */     //   138: goto -> 104
/*    */     //   141: aload #4
/*    */     //   143: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   146: astore #4
/*    */     //   148: aload #4
/*    */     //   150: invokevirtual hasNext : ()Z
/*    */     //   153: ifeq -> 104
/*    */     //   156: aload_1
/*    */     //   157: aload #4
/*    */     //   159: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   162: checkcast java/lang/String
/*    */     //   165: dup
/*    */     //   166: astore #5
/*    */     //   168: iconst_1
/*    */     //   169: istore #6
/*    */     //   171: invokevirtual aD0 : (Ljava/lang/Object;)I
/*    */     //   174: dup
/*    */     //   175: istore #7
/*    */     //   177: iflt -> 198
/*    */     //   180: aload_1
/*    */     //   181: getfield d50 : [I
/*    */     //   184: dup
/*    */     //   185: iload #7
/*    */     //   187: swap
/*    */     //   188: iload #7
/*    */     //   190: iaload
/*    */     //   191: iload #6
/*    */     //   193: iadd
/*    */     //   194: iastore
/*    */     //   195: goto -> 148
/*    */     //   198: aload_1
/*    */     //   199: dup
/*    */     //   200: dup
/*    */     //   201: iload #7
/*    */     //   203: iconst_1
/*    */     //   204: iadd
/*    */     //   205: ineg
/*    */     //   206: istore #6
/*    */     //   208: getfield q40 : [Ljava/lang/Object;
/*    */     //   211: dup
/*    */     //   212: astore #7
/*    */     //   214: iload #6
/*    */     //   216: aload #5
/*    */     //   218: aastore
/*    */     //   219: getfield d50 : [I
/*    */     //   222: iload #6
/*    */     //   224: iconst_1
/*    */     //   225: iastore
/*    */     //   226: getfield Ty : I
/*    */     //   229: iconst_1
/*    */     //   230: iadd
/*    */     //   231: dup
/*    */     //   232: istore #5
/*    */     //   234: aload_1
/*    */     //   235: dup
/*    */     //   236: iload #5
/*    */     //   238: putfield Ty : I
/*    */     //   241: getfield Dx : I
/*    */     //   244: if_icmplt -> 148
/*    */     //   247: aload_1
/*    */     //   248: aload #7
/*    */     //   250: arraylength
/*    */     //   251: iconst_1
/*    */     //   252: ishl
/*    */     //   253: invokevirtual H3 : (I)V
/*    */     //   256: goto -> 148
/*    */     //   259: aload_2
/*    */     //   260: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   263: astore_2
/*    */     //   264: aload_2
/*    */     //   265: invokevirtual hasNext : ()Z
/*    */     //   268: ifeq -> 24
/*    */     //   271: aload_1
/*    */     //   272: aload_2
/*    */     //   273: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   276: checkcast java/lang/String
/*    */     //   279: dup
/*    */     //   280: astore_3
/*    */     //   281: iconst_0
/*    */     //   282: istore #4
/*    */     //   284: invokevirtual aD0 : (Ljava/lang/Object;)I
/*    */     //   287: dup
/*    */     //   288: istore #5
/*    */     //   290: ifge -> 296
/*    */     //   293: goto -> 305
/*    */     //   296: aload_1
/*    */     //   297: getfield d50 : [I
/*    */     //   300: iload #5
/*    */     //   302: iaload
/*    */     //   303: istore #4
/*    */     //   305: iload #4
/*    */     //   307: ifne -> 264
/*    */     //   310: aload_0
/*    */     //   311: aload_3
/*    */     //   312: invokevirtual zu : (Ljava/lang/String;)V
/*    */     //   315: goto -> 264
/*    */     //   318: astore_1
/*    */     //   319: goto -> 465
/*    */     //   322: aload_0
/*    */     //   323: getfield MO : Lf/f7;
/*    */     //   326: dup
/*    */     //   327: dup
/*    */     //   328: astore_1
/*    */     //   329: getfield J6 : F
/*    */     //   332: bipush #51
/*    */     //   334: swap
/*    */     //   335: invokestatic nf : (IF)I
/*    */     //   338: istore_2
/*    */     //   339: getfield g00 : [Ljava/lang/Object;
/*    */     //   342: arraylength
/*    */     //   343: iload_2
/*    */     //   344: if_icmpgt -> 354
/*    */     //   347: aload_1
/*    */     //   348: invokevirtual t9 : ()V
/*    */     //   351: goto -> 364
/*    */     //   354: aload_1
/*    */     //   355: dup
/*    */     //   356: iconst_0
/*    */     //   357: putfield Cx0 : I
/*    */     //   360: iload_2
/*    */     //   361: invokevirtual lE : (I)V
/*    */     //   364: aload_0
/*    */     //   365: getfield g30 : Lf/f7;
/*    */     //   368: dup
/*    */     //   369: dup
/*    */     //   370: astore_1
/*    */     //   371: getfield J6 : F
/*    */     //   374: bipush #51
/*    */     //   376: swap
/*    */     //   377: invokestatic nf : (IF)I
/*    */     //   380: istore_2
/*    */     //   381: getfield g00 : [Ljava/lang/Object;
/*    */     //   384: arraylength
/*    */     //   385: iload_2
/*    */     //   386: if_icmpgt -> 396
/*    */     //   389: aload_1
/*    */     //   390: invokevirtual t9 : ()V
/*    */     //   393: goto -> 406
/*    */     //   396: aload_1
/*    */     //   397: dup
/*    */     //   398: iconst_0
/*    */     //   399: putfield Cx0 : I
/*    */     //   402: iload_2
/*    */     //   403: invokevirtual lE : (I)V
/*    */     //   406: aload_0
/*    */     //   407: getfield r70 : Lf/f7;
/*    */     //   410: dup
/*    */     //   411: dup
/*    */     //   412: astore_1
/*    */     //   413: getfield J6 : F
/*    */     //   416: bipush #51
/*    */     //   418: swap
/*    */     //   419: invokestatic nf : (IF)I
/*    */     //   422: istore_2
/*    */     //   423: getfield g00 : [Ljava/lang/Object;
/*    */     //   426: arraylength
/*    */     //   427: iload_2
/*    */     //   428: if_icmpgt -> 438
/*    */     //   431: aload_1
/*    */     //   432: invokevirtual t9 : ()V
/*    */     //   435: goto -> 448
/*    */     //   438: aload_1
/*    */     //   439: dup
/*    */     //   440: iconst_0
/*    */     //   441: putfield Cx0 : I
/*    */     //   444: iload_2
/*    */     //   445: invokevirtual lE : (I)V
/*    */     //   448: aload_0
/*    */     //   449: dup
/*    */     //   450: dup
/*    */     //   451: getfield Lw : Lf/fQ;
/*    */     //   454: invokevirtual clear : ()V
/*    */     //   457: getfield le0 : Lf/fQ;
/*    */     //   460: invokevirtual clear : ()V
/*    */     //   463: monitorexit
/*    */     //   464: return
/*    */     //   465: aload_1
/*    */     //   466: aload_0
/*    */     //   467: monitorexit
/*    */     //   468: athrow
/*    */     //   469: astore_1
/*    */     //   470: aload_1
/*    */     //   471: aload_0
/*    */     //   472: monitorexit
/*    */     //   473: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 38
/*    */     //   #2	-> 56
/*    */     //   #3	-> 81
/*    */     //   #4	-> 89
/*    */     //   #5	-> 171
/*    */     //   #6	-> 260
/*    */     //   #7	-> 284
/*    */     //   #8	-> 312
/*    */     //   #9	-> 329
/*    */     //   #10	-> 335
/*    */     //   #11	-> 365
/*    */     //   #12	-> 371
/*    */     //   #13	-> 377
/*    */     //   #14	-> 407
/*    */     //   #15	-> 413
/*    */     //   #16	-> 419
/*    */     //   #17	-> 451
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   5	12	469	finally
/*    */     //   16	19	318	finally
/*    */     //   21	31	318	finally
/*    */     //   37	44	318	finally
/*    */     //   45	48	318	finally
/*    */     //   50	51	318	finally
/*    */     //   55	59	318	finally
/*    */     //   65	98	318	finally
/*    */     //   100	103	318	finally
/*    */     //   104	108	318	finally
/*    */     //   111	119	318	finally
/*    */     //   121	132	318	finally
/*    */     //   141	146	318	finally
/*    */     //   148	153	318	finally
/*    */     //   156	165	318	finally
/*    */     //   171	174	318	finally
/*    */     //   180	184	318	finally
/*    */     //   185	191	318	finally
/*    */     //   194	198	318	finally
/*    */     //   208	211	318	finally
/*    */     //   214	229	318	finally
/*    */     //   234	244	318	finally
/*    */     //   247	251	318	finally
/*    */     //   253	263	318	finally
/*    */     //   264	268	318	finally
/*    */     //   271	279	318	finally
/*    */     //   284	287	318	finally
/*    */     //   296	303	318	finally
/*    */     //   310	318	318	finally
/*    */     //   322	326	318	finally
/*    */     //   329	338	318	finally
/*    */     //   339	343	318	finally
/*    */     //   347	368	318	finally
/*    */     //   371	380	318	finally
/*    */     //   381	385	318	finally
/*    */     //   389	410	318	finally
/*    */     //   413	422	318	finally
/*    */     //   423	427	318	finally
/*    */     //   431	464	318	finally
/*    */     //   465	468	318	finally
/*    */     //   470	473	469	finally
/*    */   }
/*    */   
/*    */   public final synchronized int Na0(String paramString) {
/*    */     Class clazz;
/*    */     if ((clazz = (Class)this.g30.pd0(paramString)) != null)
/*    */       return ((UI)((f7)this.MO.pd0(clazz)).pd0(paramString)).HS; 
/*    */     throw new JU(m0.tF0("Asset not loaded: ", paramString));
/*    */   }
/*    */   
/*    */   public final synchronized void vf0(int paramInt, String paramString) {
/*    */     Class clazz;
/*    */     if ((clazz = (Class)this.g30.pd0(paramString)) != null) {
/*    */       ((UI)((f7)this.MO.pd0(clazz)).pd0(paramString)).HS = paramInt;
/*    */       return;
/*    */     } 
/*    */     throw new JU(m0.tF0("Asset not loaded: ", paramString));
/*    */   }
/*    */   
/*    */   public final synchronized String kF(iq0 paramiq0) {
/*    */     Q70 q70;
/*    */     (q70 = this.MO.W5()).getClass();
/*    */     while (q70.hasNext()) {
/*    */       Class clazz = q70.next();
/*    */       oc oc = ((f7)this.MO.pd0(clazz)).COM7();
/*    */       while (oc.hasNext()) {
/*    */         yO yO;
/*    */         Object object;
/*    */         if ((object = ((UI)(yO = oc.next()).mm).pE0) == paramiq0 || paramiq0.equals(object))
/*    */           return (String)yO.Lb; 
/*    */       } 
/*    */     } 
/*    */     return null;
/*    */   }
/*    */   
/*    */   public final void ad(String paramString) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Sw0 : Lf/Lpt7;
/*    */     //   4: new java/lang/StringBuilder
/*    */     //   7: dup
/*    */     //   8: invokespecial <init> : ()V
/*    */     //   11: ldc_w 'Waiting for asset to be loaded: '
/*    */     //   14: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   17: aload_1
/*    */     //   18: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   21: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   24: invokevirtual zK0 : (Ljava/lang/String;)V
/*    */     //   27: aload_0
/*    */     //   28: dup
/*    */     //   29: monitorenter
/*    */     //   30: getfield g30 : Lf/f7;
/*    */     //   33: aload_1
/*    */     //   34: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   37: checkcast java/lang/Class
/*    */     //   40: dup
/*    */     //   41: astore_2
/*    */     //   42: ifnull -> 102
/*    */     //   45: aload_0
/*    */     //   46: getfield MO : Lf/f7;
/*    */     //   49: aload_2
/*    */     //   50: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   53: checkcast f/f7
/*    */     //   56: dup
/*    */     //   57: astore_2
/*    */     //   58: ifnull -> 102
/*    */     //   61: aload_2
/*    */     //   62: aload_1
/*    */     //   63: invokevirtual pd0 : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   66: checkcast f/UI
/*    */     //   69: ifnull -> 102
/*    */     //   72: aload_0
/*    */     //   73: dup
/*    */     //   74: getfield Sw0 : Lf/Lpt7;
/*    */     //   77: new java/lang/StringBuilder
/*    */     //   80: dup
/*    */     //   81: invokespecial <init> : ()V
/*    */     //   84: ldc_w 'Asset loaded: '
/*    */     //   87: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   90: aload_1
/*    */     //   91: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   94: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   97: invokevirtual zK0 : (Ljava/lang/String;)V
/*    */     //   100: monitorexit
/*    */     //   101: return
/*    */     //   102: aload_0
/*    */     //   103: dup
/*    */     //   104: invokevirtual JH0 : ()Z
/*    */     //   107: pop
/*    */     //   108: monitorexit
/*    */     //   109: invokestatic yield : ()V
/*    */     //   112: goto -> 27
/*    */     //   115: astore_1
/*    */     //   116: aload_1
/*    */     //   117: aload_0
/*    */     //   118: monitorexit
/*    */     //   119: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 109
/*    */     //   #2	-> 118
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   30	40	115	finally
/*    */     //   45	56	115	finally
/*    */     //   61	69	115	finally
/*    */     //   72	101	115	finally
/*    */     //   102	107	115	finally
/*    */     //   108	109	115	finally
/*    */     //   116	119	115	finally
/*    */   }
/*    */   
/*    */   public final synchronized Object Yo(Class paramClass, String paramString) {
/*    */     f7 f71;
/*    */     UI uI;
/*    */     if ((f71 = (f7)this.MO.pd0(paramClass)) != null && (uI = (UI)pd0(paramString)) != null)
/*    */       return this.pE0; 
/*    */     throw new JU(m0.tF0("Asset not loaded: ", paramString));
/*    */   }
/*    */   
/*    */   public final synchronized void KJ(String paramString) {
/*    */     ks0(paramString, Texture.class, null);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/sz0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */