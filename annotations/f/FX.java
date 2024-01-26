/*  1 */ package f;public abstract class FX { public static ZH dC0(s40 params40, Wf paramWf, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { return QC(params40, paramWf, paramInt1, paramInt2, paramInt3, paramInt4, 1, null); } public static ZH QC(s40 params40, Wf paramWf, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, f1 paramf1) { ByteBuffer byteBuffer = params40.pr(); Uc uc = Uc.xi0; this(paramInt3, paramInt4, uc); ZH zH; f1 f11; boolean bool1, bool2, bool3; int j; boolean bool4, bool5; if (paramf1 != null) { f11 = paramf1; } else { aM0
/*  2 */         .getClass();
/*  3 */       ByteBuffer byteBuffer1 = params40.pr(); byte b = params40.in(); aM0 aM0; f11 = (aM0 = aM0.Ij0).LY(paramInt5, paramInt2, byteBuffer1, b); }  Ut0 ut0 = null; if (f11
/*  4 */       .LPT2.length > 
/*  5 */       instanceof.IG(paramInt5)) { bool1 = true; } else { bool1 = false; }  byteBuffer
/*  6 */       .position(paramInt1); if (LF.va0(byteBuffer, 1) > 0) { bool2 = true; } else { bool2 = false; }  if (bool2) byteBuffer = ByteBuffer.wrap(LF.sf(paramInt1, byteBuffer)).order(ByteOrder.LITTLE_ENDIAN);  paramInt1 = 0; int i = 0; f1 f12 = f11; label62: do { if (byteBuffer.remaining() > 1) { short s; if (paramInt5 == 2) { s = (short)(byteBuffer.get() & 0xFF); } else { s = byteBuffer.getShort(); }  if (!bool2 && s == 0) continue;  j = s & 0x3FF; if ((s & 0x400) != 0) { bool4 = true; } else { bool4 = false; }  if ((s & 0x800) != 0) { bool5 = true; } else { bool5 = false; }  int k = s >> 12 & 0xF; if (bool1 || paramf1 != null)
/*    */         
/*    */         { 
/*    */           
/* 10 */           if (f12
/* 11 */             .LPT2.length > (
/* 12 */             k = instanceof.IG(paramInt5) * k)) continue;  } else { if (k == 0) { f12 = f11; } else { if (ut0 == null) this();  if ((f12 = (f1)ut0.Z6(k)) == null) { aM0 aM0 = aM0.Ij0; int n = ((paramInt5 == 1) ? 32 : 2048) * k, m = n + paramInt2; aM0.getClass(); ByteBuffer byteBuffer1 = params40.pr(); byte b = params40.in(); f12 = aM0.LY(paramInt5, m, byteBuffer1, b); ut0.A3(k, f12); }  k = 0; }  continue; }  } else { break label62; }  paramWf
/* 13 */         .COm5(zH, paramInt1, i, j, f12, bool3, bool4, bool5); paramInt1 = 0; } while ((paramInt1 += 8) < paramInt3 || (i += 8) < paramInt4); return zH; }
/*    */ 
/*    */   
/*    */   public static ZH hY(ZH paramZH) {
/*    */     int i = paramZH.Con.ju;
/*    */     int j = paramZH.Con.Og0;
/*    */     Uc uc = paramZH.TU();
/*    */     this(j, i, uc);
/*    */     ZH zH;
/*    */     for (byte b = 0; b < j; ) {
/*    */       for (byte b1 = 0; b1 < i; ) {
/*    */         int k = paramZH.Con.Fl(b1, b);
/*    */         zH.Con.YO(b, b1, k);
/*    */         b1++;
/*    */       } 
/*    */       b++;
/*    */     } 
/*    */     return zH;
/*    */   }
/*    */   
/*    */   public static ZH tK0(ZH paramZH, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     ZH zH;
/*    */     int i = paramZH.Con.Og0;
/*    */     int j = paramZH.Con.ju;
/*    */     if (paramBoolean1 && paramBoolean2) {
/*    */       this(j, i, paramZH.TU());
/*    */       (new ZH()).r1(y1.Zj);
/*    */       for (paramBoolean2 = false; paramBoolean2 < i; ) {
/*    */         for (byte b = 0; b < j; ) {
/*    */           int k = j - 1 - b, m = i - 1 - paramBoolean2;
/*    */           k = paramZH.Con.Fl(k, m);
/*    */           zH.Con.YO(b, paramBoolean2, k);
/*    */           b++;
/*    */         } 
/*    */         paramBoolean2++;
/*    */       } 
/*    */       return zH;
/*    */     } 
/*    */     if (zH != null) {
/*    */       this(j, i, paramZH.TU());
/*    */       (new ZH()).r1(y1.Zj);
/*    */       for (paramBoolean2 = false; paramBoolean2 < i; ) {
/*    */         for (byte b = 0; b < j; ) {
/*    */           int k = j - 1 - b;
/*    */           k = paramZH.Con.Fl(k, paramBoolean2);
/*    */           zH.Con.YO(b, paramBoolean2, k);
/*    */           b++;
/*    */         } 
/*    */         paramBoolean2++;
/*    */       } 
/*    */       return zH;
/*    */     } 
/*    */     if (paramBoolean2) {
/*    */       this(j, i, paramZH.TU());
/*    */       (new ZH()).r1(y1.Zj);
/*    */       for (paramBoolean2 = false; paramBoolean2 < i; ) {
/*    */         for (byte b = 0; b < j; ) {
/*    */           int k = i - 1 - paramBoolean2;
/*    */           k = paramZH.Con.Fl(b, k);
/*    */           zH.Con.YO(b, paramBoolean2, k);
/*    */           b++;
/*    */         } 
/*    */         paramBoolean2++;
/*    */       } 
/*    */       return zH;
/*    */     } 
/*    */     return paramZH;
/*    */   }
/*    */   
/*    */   public static void sH0(ZH paramZH1, ZH paramZH2, int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     int i = paramZH1.Con.Og0;
/*    */     int j = paramZH1.Con.ju;
/*    */     if (paramBoolean1 && paramBoolean2) {
/*    */       for (paramBoolean1 = false; paramBoolean1 < i; ) {
/*    */         for (paramBoolean2 = false; paramBoolean2 < j; ) {
/*    */           int k = paramInt1 + paramBoolean2, m = paramInt2 + paramBoolean1, n = j - 1 - paramBoolean2, i1 = i - 1 - paramBoolean1;
/*    */           n = paramZH1.Con.Fl(n, i1);
/*    */           paramZH2.Con.YO(k, m, n);
/*    */           paramBoolean2++;
/*    */         } 
/*    */         paramBoolean1++;
/*    */       } 
/*    */     } else if (paramBoolean1) {
/*    */       for (paramBoolean1 = false; paramBoolean1 < i; ) {
/*    */         for (paramBoolean2 = false; paramBoolean2 < j; ) {
/*    */           int k = paramInt1 + paramBoolean2, m = paramInt2 + paramBoolean1, n = j - 1 - paramBoolean2;
/*    */           n = paramZH1.Con.Fl(n, paramBoolean1);
/*    */           paramZH2.Con.YO(k, m, n);
/*    */           paramBoolean2++;
/*    */         } 
/*    */         paramBoolean1++;
/*    */       } 
/*    */     } else if (paramBoolean2) {
/*    */       for (paramBoolean1 = false; paramBoolean1 < i; ) {
/*    */         for (paramBoolean2 = false; paramBoolean2 < j; ) {
/*    */           int k = paramInt1 + paramBoolean2, m = paramInt2 + paramBoolean1, n = i - 1 - paramBoolean1;
/*    */           n = paramZH1.Con.Fl(paramBoolean2, n);
/*    */           paramZH2.Con.YO(k, m, n);
/*    */           paramBoolean2++;
/*    */         } 
/*    */         paramBoolean1++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static ZH pS(ZH paramZH, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     ZH zH;
/*    */     int i = paramZH.Con.Og0;
/*    */     int j = paramZH.Con.ju;
/*    */     if (paramBoolean1 && paramBoolean2) {
/*    */       this(j, i, paramZH.TU());
/*    */       (new ZH()).r1(y1.Zj);
/*    */       for (paramBoolean2 = false; paramBoolean2 < i; ) {
/*    */         for (byte b = 0; b < j; ) {
/*    */           int k = j - 1 - b, m = i - 1 - paramBoolean2;
/*    */           k = paramZH.Con.Fl(k, m);
/*    */           zH.Con.YO(b, paramBoolean2, k);
/*    */           b++;
/*    */         } 
/*    */         paramBoolean2++;
/*    */       } 
/*    */       return zH;
/*    */     } 
/*    */     if (zH != null) {
/*    */       this(j, i, paramZH.TU());
/*    */       (new ZH()).r1(y1.Zj);
/*    */       for (paramBoolean2 = false; paramBoolean2 < i; ) {
/*    */         for (byte b = 0; b < j; ) {
/*    */           int k = j - 1 - b;
/*    */           k = paramZH.Con.Fl(k, paramBoolean2);
/*    */           zH.Con.YO(b, paramBoolean2, k);
/*    */           b++;
/*    */         } 
/*    */         paramBoolean2++;
/*    */       } 
/*    */       return zH;
/*    */     } 
/*    */     if (paramBoolean2) {
/*    */       this(j, i, paramZH.TU());
/*    */       (new ZH()).r1(y1.Zj);
/*    */       for (paramBoolean2 = false; paramBoolean2 < i; ) {
/*    */         for (byte b = 0; b < j; ) {
/*    */           int k = i - 1 - paramBoolean2;
/*    */           k = paramZH.Con.Fl(b, k);
/*    */           zH.Con.YO(b, paramBoolean2, k);
/*    */           b++;
/*    */         } 
/*    */         paramBoolean2++;
/*    */       } 
/*    */       return zH;
/*    */     } 
/*    */     return paramZH;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/FX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */