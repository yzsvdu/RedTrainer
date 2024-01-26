/*  1 */ package f;public class eF0 { public Zy ih0; public c rK0; public final xC0 kS = new xC0(0); public final xC0 Zg = new xC0(0); public final fQ AG0 = new fQ(0); public i80 iG0 = i80.s0; public boolean Yo0 = true; public float bs; public float kl; public float ZP; public float xr0; public float kq = 1.0F; public float DG = 1.0F; public float Bz; public final Color As0 = new Color(1.0F, 1.0F, 1.0F, 1.0F); public void La(float paramFloat) { fQ fQ1; if ((fQ1 = this.AG0).Z8 == 0) return;  Zy zy; if ((zy = this.ih0) != null && zy.Pp)
/*  2 */       UB0.M60
/*  3 */         .AW
/*  4 */         .df0();  byte b = 0; try { while (b < fQ1
/*  5 */         .Z8) { u60 u60; if ((u60 = (u60)fQ1.get(b)).Zf() && b < fQ1.Z8) { int i; if ((u60)fQ1.get(b) == u60) { i = b; } else { i = fQ1.JF0(u60, true); }  if (i != -1) { fQ1.Hc(i); eF0 eF01 = null; if (u60
/*  6 */               .DX == null) u60
/*  7 */                 .DX = eF01;  b--; }  }  b++; }  return; } catch (RuntimeException runtimeException)
/*  8 */     { String str = toString(); throw new RuntimeException(
/*  9 */           B40.df("Actor: ")
/* 10 */           .append(substring(0, Math.min(length(), 128))).toString(), runtimeException); }  } public final boolean kZ(V80 paramV80) { if (paramV80.OC0 == null) paramV80.OC0 = this.ih0;  paramV80.l0 = this; fQ fQ1; c c1; for (fQ1 = (fQ)Lp0.vu0(fQ.class).obtain(), c1 = this.rK0; c1 != null; ) { fQ1.Com3(c1); c1 = c1.rK0; }  try { Object[] arrayOfObject; int i; for (arrayOfObject = fQ1.Uq0, i = fQ1.Z8 - 1; i >= 0; ) { ((c)arrayOfObject[i]).CA0(paramV80, true); if (paramV80.Hy) return false;  i--; }  CA0(paramV80, true); if (paramV80.Hy) return false;  CA0(paramV80, false);
/* 11 */       if (!paramV80.Uf0)
/* 12 */         return false;  if (paramV80
/* 13 */         .Hy)
/* 14 */         return false;  for (byte b = 0; b < i; ) { ((c)arrayOfObject[b]).CA0(paramV80, false); if (paramV80
/* 15 */           .Hy)
/* 16 */           return false;  b++; }  return false; } finally { fQ1.clear(); Lp0.Lj0(fQ1); }
/*    */      }
/*    */ 
/*    */   
/*    */   public eF0 QI0(float paramFloat1, float paramFloat2, boolean paramBoolean) {
/*    */     if (paramBoolean && this.iG0 != i80.s0)
/*    */       return null; 
/*    */     if (!this.Yo0)
/*    */       return null; 
/*    */     if (paramFloat1 < 0.0F || paramFloat1 >= this.ZP || paramFloat2 < 0.0F || paramFloat2 >= this.xr0)
/*    */       this = null; 
/*    */     return this;
/*    */   }
/*    */   
/*    */   public void Vs(Zy paramZy) {
/*    */     this.ih0 = paramZy;
/*    */   }
/*    */   
/*    */   public final void O00(i80 parami80) {
/*    */     this.iG0 = parami80;
/*    */   }
/*    */   
/*    */   public final void i6(float paramFloat1, float paramFloat2) {
/*    */     if (this.bs != paramFloat1 || this.kl != paramFloat2) {
/*    */       this.bs = paramFloat1;
/*    */       this.kl = paramFloat2;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final float c4() {
/*    */     return this.ZP;
/*    */   }
/*    */   
/*    */   public final float ke0() {
/*    */     return this.xr0;
/*    */   }
/*    */   
/*    */   public void J6() {}
/*    */   
/*    */   public final void qp0(float paramFloat1, float paramFloat2) {
/*    */     if (this.ZP != paramFloat1 || this.xr0 != paramFloat2) {
/*    */       this.ZP = paramFloat1;
/*    */       this.xr0 = paramFloat2;
/*    */       J6();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void DD(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*    */     if (this.bs != paramFloat1 || this.kl != paramFloat2) {
/*    */       this.bs = paramFloat1;
/*    */       this.kl = paramFloat2;
/*    */     } 
/*    */     if (this.ZP != paramFloat3 || this.xr0 != paramFloat4) {
/*    */       this.ZP = paramFloat3;
/*    */       this.xr0 = paramFloat4;
/*    */       J6();
/*    */     } 
/*    */   }
/*    */   
/*    */   public final NC0 pT(NC0 paramNC0) {
/*    */     c c1;
/*    */     if ((c1 = this.rK0) != null)
/*    */       c1.pT(paramNC0); 
/*    */     XD(paramNC0);
/*    */     return paramNC0;
/*    */   }
/*    */   
/*    */   public String toString() {
/*    */     String str;
/*    */     int i;
/*    */     if ((i = (str = getClass().getName()).lastIndexOf('.')) != -1)
/*    */       str = substring(i + 1); 
/*    */     return this;
/*    */   }
/*    */   
/*    */   public void cD(JX paramJX, float paramFloat) {}
/*    */   
/*    */   public final void CA0(V80 paramV80, boolean paramBoolean) {
/*    */     if (paramV80.l0 != null) {
/*    */       xC0 xC01;
/*    */       if (paramBoolean) {
/*    */         xC01 = this.Zg;
/*    */       } else {
/*    */         xC01 = this.kS;
/*    */       } 
/*    */       int i;
/*    */       if ((i = xC01.Z8) == 0)
/*    */         return; 
/*    */       paramV80.Kx = this;
/*    */       if (paramV80.OC0 == null)
/*    */         paramV80.OC0 = this.ih0; 
/*    */       try {
/*    */         xC01.LG0++;
/*    */         for (byte b = 0; b < i; ) {
/*    */           if (((E6)xC01.get(b)).Qi0(paramV80))
/*    */             paramV80.Aj0 = true; 
/*    */           b++;
/*    */         } 
/*    */         xC01.ms0();
/*    */         return;
/*    */       } catch (RuntimeException runtimeException) {
/*    */         String str = toString();
/*    */         throw new RuntimeException(B40.df("Actor: ").append(substring(0, Math.min(length(), 128))).toString(), runtimeException);
/*    */       } 
/*    */     } 
/*    */     throw new IllegalArgumentException("The event target cannot be null.");
/*    */   }
/*    */   
/*    */   public final void Na0(E6 paramE6) {
/*    */     if (!this.kS.mB(paramE6, true)) {
/*    */       this.kS.Com3(paramE6);
/*    */       return;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void XD(NC0 paramNC0) {
/*    */     float f1 = this.kq;
/*    */     float f3 = this.DG;
/*    */     float f4 = this.bs;
/*    */     float f5 = this.kl;
/*    */     float f2;
/*    */     if ((f2 = this.Bz) == 0.0F) {
/*    */       if (f1 == 1.0F && f3 == 1.0F) {
/*    */         paramNC0.x -= f4;
/*    */         paramNC0.y -= f5;
/*    */       } else {
/*    */         paramNC0.x = (paramNC0.x - f4 - 0.0F) / f1 + 0.0F;
/*    */         paramNC0.y = (paramNC0.y - f5 - 0.0F) / f3 + 0.0F;
/*    */       } 
/*    */     } else {
/*    */       f2 = (float)Math.cos((f2 * 0.017453292F));
/*    */       float f7 = (float)Math.sin((f2 * 0.017453292F));
/*    */       f4 = paramNC0.x - f4 - 0.0F;
/*    */       float f6 = f4 * f2;
/*    */       paramNC0.x = (f5 * f7 + f6) / f1 + 0.0F;
/*    */       f1 = f4 * -f7;
/*    */       paramNC0.y = ((f5 = paramNC0.y - f5 - 0.0F) * f2 + f1) / f3 + 0.0F;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/eF0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */