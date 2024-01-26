/*  1 */ package f;public class Tb implements tk { public final fQ xl0; public final fQ vC0; public final fQ Ly; public final cf0 qY; public Matrix4 mh; public Tb(cf0 paramcf0) { this(paramcf0, (String[])null); } public Tb(cf0 paramcf0, String paramString, boolean paramBoolean) { this(paramcf0, null, paramString, false, false, paramBoolean); } public Tb(cf0 paramcf0, Matrix4 paramMatrix4, String paramString, boolean paramBoolean) { this(paramcf0, paramMatrix4, paramString, false, false, paramBoolean); } public Tb(cf0 paramcf0, String paramString, boolean paramBoolean1, boolean paramBoolean2) { this(paramcf0, null, paramString, true, paramBoolean1, paramBoolean2); } public Tb(cf0 paramcf0, Matrix4 paramMatrix4, String paramString, boolean paramBoolean1, boolean paramBoolean2) { this(paramcf0, paramMatrix4, paramString, true, paramBoolean1, paramBoolean2); } public Tb(cf0 paramcf0, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { this(paramcf0, null, paramString, paramBoolean1, paramBoolean2, paramBoolean3); } public Tb(cf0 paramcf0, Matrix4 paramMatrix4, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) { this(paramcf0, paramMatrix4, paramString, paramBoolean1, paramBoolean2, paramBoolean3, true); } public Tb(cf0 paramcf0, Matrix4 paramMatrix4, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) { Matrix4 matrix4; fQ fQ1; fQ fQ2; this(); this.xl0 = fQ1; this(); this.vC0 = fQ1; this(); this.Ly = fQ2; this.qY = paramcf0; if (paramMatrix4 == null) this();  this.mh = paramMatrix4; zP zP1; zP zP2; fQ1.Com3(zP2 = (zP1 = paramcf0.r4(paramString, paramBoolean1)).F7()); if (paramBoolean3) { Matrix4 matrix41 = this.mh; if (paramBoolean2) { matrix4 = zP1.AS; } else { matrix4 = ((zP)matrix4).Bf0; }  matrix41.lU(matrix4); zP2.z7.TG0(0.0F, 0.0F, 0.0F); zP2.Nq0.Gl0(); zP2.nH.TG0(1.0F, 1.0F, 1.0F); } else if (paramBoolean2 && zP2.cL()) { this.mh.lU((matrix4.Z1()).AS); }  uY(); on0(paramcf0.cs, paramBoolean4); o6(); } public final void Z(zP paramzP) { byte b; int i; for (b = 0, i = paramzP.zx0.Z8; b < i; ) { R70 r70; eM eM; if ((eM = (r70 = (R70)paramzP.zx0.get(b)).tm) != null) for (byte b1 = 0; b1 < eM.uJ0; ) { Object[] arrayOfObject; ((zP[])(arrayOfObject = eM.Jo))[b1] = kB0((((zP[])arrayOfObject)[b1]).v30, true);
/*  2 */           b1++; }   if (!this.xl0.mB(r70.Zz0, true)) { T0 t01; T0 t02; int j; if ((j = this.xl0.JF0(r70.Zz0, false)) < 0) { (t01 = r70.Zz0).getClass();
/*  3 */           this(t01);
/*  4 */           r70.Zz0 = new T0(); this.xl0.Com3(t02); } else { ((R70)t01).Zz0 = (T0)this.xl0.get(t02); }  }  b++; }  b = 0;
/*  5 */     for (i = paramzP.cq.Z8; b < i; )
/*  6 */     { Z(paramzP.kv0(b)); b++; }  } public Tb(cf0 paramcf0, String... paramVarArgs) { this(paramcf0, (Matrix4)null, paramVarArgs); } public Tb(cf0 paramcf0, Matrix4 paramMatrix4, String... paramVarArgs) { fQ fQ1; this(); this.xl0 = fQ1; this(); this.vC0 = fQ1; this(); this.Ly = fQ1; this.qY = paramcf0; if (paramMatrix4 == null) this();  this.mh = paramMatrix4; if (paramVarArgs == null) { aT(paramcf0.O0); } else { COm8(paramcf0.O0, paramVarArgs); }  on0(paramcf0.cs, true); o6(); } public Tb(cf0 paramcf0, fQ paramfQ) { this(paramcf0, (Matrix4)null, paramfQ); } public Tb(cf0 paramcf0, Matrix4 paramMatrix4, fQ paramfQ) { this(paramcf0, paramMatrix4, paramfQ, true); } public Tb(cf0 paramcf0, Matrix4 paramMatrix4, fQ paramfQ, boolean paramBoolean) { fQ fQ1; this(); this.xl0 = fQ1; this(); this.vC0 = fQ1; this(); this.Ly = fQ1; this.qY = paramcf0; if (paramMatrix4 == null) this();  this.mh = paramMatrix4; nj(paramcf0.O0, paramfQ); on0(paramcf0.cs, paramBoolean); o6(); } public Tb(cf0 paramcf0, eo parameo) { this(paramcf0); this.mh.Jo(parameo); } public Tb(cf0 paramcf0, float paramFloat1, float paramFloat2, float paramFloat3) { this(paramcf0); this.mh.gv0(paramFloat1, paramFloat2, paramFloat3); } public Tb(cf0 paramcf0, Matrix4 paramMatrix4) { this(paramcf0, paramMatrix4, (String[])null); } public Tb(Tb paramTb) { this(paramTb, paramTb.mh.Ye()); } public Tb(Tb paramTb, Matrix4 paramMatrix4) { this(paramTb, paramMatrix4, true); } public Tb(Tb paramTb, Matrix4 paramMatrix4, boolean paramBoolean) { this.xl0 = new fQ(); this.vC0 = new fQ(); this.Ly = new fQ(); this.qY = paramTb.qY; if (paramMatrix4 == null) this();  this.mh = paramMatrix4; aT(paramTb.vC0); on0(paramTb.Ly, paramBoolean); o6(); } public final void aT(fQ paramfQ) { byte b = 0; int i = paramfQ.Z8; while (b < i) { zP zP = (zP)paramfQ.get(b); this.vC0.Com3(zP.F7()); b++; }  uY(); } public final void COm8(fQ paramfQ, String... paramVarArgs) { byte b = 0; int i = paramfQ.Z8; while (b < i) { zP zP = (zP)paramfQ.get(b); int j = paramVarArgs.length; for (byte b1 = 0; b1 < j; b1++) { if (paramVarArgs[b1].equals(zP.v30)) { this.vC0.Com3(zP.F7()); break; }  }  b++; }  uY(); } public final void nj(fQ paramfQ1, fQ paramfQ2) { byte b = 0; int i = paramfQ1.Z8; while (b < i) { zP zP = (zP)paramfQ1.get(b); Hc0 hc0 = paramfQ2.r30(); while (hc0.hasNext()) { if (((String)hc0.next()).equals(zP.v30)) { this.vC0.Com3(zP.F7()); break; }  }  b++; }  uY(); } public final void uY() { byte b = 0; int i = this.vC0.Z8; while (b < i) { Z((zP)this.vC0.get(b)); b++; }  } public final void getRenderables(fQ paramfQ, Lc paramLc) { Hc0 hc0 = this.vC0.r30(); while (hc0.hasNext()) vL((zP)hc0.next(), paramfQ, paramLc);  } public final void vL(zP paramzP, fQ paramfQ, Lc paramLc) { fQ fQ1; if ((fQ1 = paramzP.zx0).Z8 > 0) for (Hc0 hc01 = fQ1.r30(); hc01.hasNext();) { if ((r70 = (R70)hc01.next()).cF) { Xw0 xw0; (xw0 = (Xw0)paramLc.obtain()).bL = r70.Zz0; ((Xw0)paramLc.obtain()).L90.W90(r70.xn); Matrix4 matrix4; if ((xw0.Et = r70.Nx) == null && (matrix4 = this.mh) != null) { xw0.kD0.getClass(); xw0.kD0.Qw(matrix4.Z0).lU(paramzP.AS); } else if ((matrix4 = this.mh) != null) { xw0.kD0.getClass(); xw0.kD0.Qw(matrix4.Z0); } else { xw0
/*  7 */               .kD0.WU(); }  xw0.pe0 = null; paramfQ
/*  8 */             .Com3(xw0); }
/*    */          }
/* 10 */         Hc0 hc0 = paramzP.cq.r30(); for (; hc0
/* 11 */       .hasNext(); vL((zP)hc0.next(), paramfQ, paramLc)); }
/*    */ 
/*    */   
/*    */   public final void o6() {
/*    */     int i = this.vC0.Z8;
/*    */     byte b;
/*    */     for (b = 0; b < i; b++)
/*    */       ((zP)this.vC0.get(b)).kJ0(); 
/*    */     for (b = 0; b < i; b++)
/*    */       ((zP)this.vC0.get(b)).x4(); 
/*    */   }
/*    */   
/*    */   public final T0 else(String paramString) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield xl0 : Lf/fQ;
/*    */     //   4: getfield Z8 : I
/*    */     //   7: istore_2
/*    */     //   8: iconst_0
/*    */     //   9: istore_3
/*    */     //   10: iload_3
/*    */     //   11: iload_2
/*    */     //   12: if_icmpge -> 48
/*    */     //   15: aload_0
/*    */     //   16: getfield xl0 : Lf/fQ;
/*    */     //   19: iload_3
/*    */     //   20: invokevirtual get : (I)Ljava/lang/Object;
/*    */     //   23: checkcast f/T0
/*    */     //   26: dup
/*    */     //   27: astore #4
/*    */     //   29: getfield Xy0 : Ljava/lang/String;
/*    */     //   32: aload_1
/*    */     //   33: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
/*    */     //   36: ifeq -> 42
/*    */     //   39: goto -> 51
/*    */     //   42: iinc #3, 1
/*    */     //   45: goto -> 10
/*    */     //   48: aconst_null
/*    */     //   49: astore #4
/*    */     //   51: aload #4
/*    */     //   53: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */   }
/*    */   
/*    */   public final zP Gm0(String paramString) {
/*    */     return kB0(paramString, true);
/*    */   }
/*    */   
/*    */   public final zP kB0(String paramString, boolean paramBoolean) {
/*    */     return zP.le0(this.vC0, paramString, true);
/*    */   }
/*    */   
/*    */   public final void on0(fQ paramfQ, boolean paramBoolean) {
/*    */     Hc0 hc0 = paramfQ.r30();
/*    */     while (hc0.hasNext()) {
/*    */       this();
/*    */       Hc0 hc01;
/*    */       d4 d41, d42;
/*    */       for (d42.Ge = d41.Ge, (d42 = new d4()).Cd0 = d41.Cd0, hc01 = (d41 = (d4)hc0.next()).Jg.r30(); hc01.hasNext(); ) {
/*    */         Kj0 kj02, kj01;
/*    */         zP zP;
/*    */         if ((zP = kB0((kj01 = (Kj0)hc01.next()).WW.v30, true)) == null)
/*    */           continue; 
/*    */         this();
/*    */         (new Kj0()).WW = zP;
/*    */         if (paramBoolean) {
/*    */           kj02.gc = kj01.gc;
/*    */           kj02.I9 = kj01.I9;
/*    */           kj02.lp = kj01.lp;
/*    */         } else {
/*    */           if (kj01.gc != null) {
/*    */             Hc0 hc02;
/*    */             for (kj02.gc = new fQ(), hc02 = kj01.gc.r30(); hc02.hasNext(); ) {
/*    */               w6 w6 = (w6)hc02.next();
/*    */               float f = w6.GY;
/*    */               kj02.gc.Com3(new w6(f, w6.YJ));
/*    */             } 
/*    */           } 
/*    */           if (kj01.I9 != null) {
/*    */             Hc0 hc02;
/*    */             for (kj02.I9 = new fQ(), hc02 = kj01.I9.r30(); hc02.hasNext(); ) {
/*    */               w6 w6 = (w6)hc02.next();
/*    */               float f = w6.GY;
/*    */               kj02.I9.Com3(new w6(f, w6.YJ));
/*    */             } 
/*    */           } 
/*    */           if (kj01.lp != null) {
/*    */             Hc0 hc02;
/*    */             for (kj02.lp = new fQ(), hc02 = kj01.lp.r30(); hc02.hasNext(); ) {
/*    */               w6 w6 = (w6)hc02.next();
/*    */               float f = w6.GY;
/*    */               kj02.lp.Com3(new w6(f, w6.YJ));
/*    */             } 
/*    */           } 
/*    */         } 
/*    */         if (kj02.gc != null || kj02.I9 != null || kj02.lp != null)
/*    */           d42.Jg.Com3(kj02); 
/*    */       } 
/*    */       if (d42.Jg.Z8 > 0)
/*    */         this.Ly.Com3(d42); 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Tb.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */