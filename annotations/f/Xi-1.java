/*  1 */ package f;public abstract class Xi { public static final ik l8 = C00.gd(Xi.class); public static eo z6 = new eo(); public static boolean WB = false; public boolean w6; public boolean Com2; public fQ wN; public float Bu0; public boolean E4; public boolean Gq; public e2 ZK; public Xi() { fQ fQ1; e2 e21; this.w6 = false; this.Com2 = false; this(); this.wN = this; this.Bu0 = 0.0F; this.E4 = true; this(150); this.ZK = this; } public boolean Wp0(KI paramKI) { if (km.D70(3)) { boolean bool; if (!this.w6 || !this.Gq) return false;  e2 e21; (e21 = this.ZK).getClass(); if (System.currentTimeMillis() < e21.jn0) { bool = false; } else { bool = true; }  if (bool) { if (UB0.PU.Ak(70) || UB0.PU.Ak(81)) { ek(); this.ZK.T30(); return true; }  if (UB0.PU.Ak(69)) { k0(); this.ZK.T30(); } else if (UB0.PU.Ak(3)) { Xv0(); BJ0(x0()); this.ZK.T30(); }  }  return true; }  return false; } public void qb0() { boolean bool; js.vu0
/*  2 */       .getClass();
/*  3 */     if (km.D70(3) && js.uD(js.vu0) == null) { bool = true; } else { bool = false; }  this
/*  4 */       .Gq = bool; Wp0(km.a3.Jr0()); } public void Kh() { this.Com2 = true; vh0 vh0; if ((vh0 = km.a3) == null) return;  for (Iterator iterator = iterator(); hasNext(); ) { tc tc; if ((tc = (tc)next()).Ae != null && tc.AJ0()) ((yF)tc.Ae.Y1)
/*    */           
/*  6 */           .wS();  tc.default().wS(); }
/*  7 */      Jo jo; if ((jo = km.a3.Ct) != null)
/*  8 */     { if (AJ0())
/*    */       {
/* 10 */         ((yF)this.Ae.Y1)
/*    */           
/* 12 */           .wS(); }  this
/* 13 */         .J
/* 14 */         .wS(); }  } public void xL() {} public abstract void QE(int paramInt1, int paramInt2); public abstract void ek(); public abstract void k0(); public abstract void CH(double paramDouble); public abstract void BJ0(float paramFloat); public abstract float x0(); public abstract void Xv0(); public abstract void dispose(); public boolean su() { return false; } public final void dr0(KI paramKI) { xm xm; if ((xm = paramKI.Eo) == xm.jQ && !paramKI.lpT1) { this.Bu0 = 0.0F; km.u4.Ta0 = 0; return; }  if (xm == xm.dR) { this.Bu0 = 0.0F; km.u4.Ta0 = 0; }  float f1; float f2; if ((f1 = this.Bu0) - (f2 = km.u4.Ta0) >= 0.0F && (this.Bu0 = f1 - UB0.M60.Qy * 2.0F) < 0.0F) this.Bu0 = 0.0F;  if (f2 - (f1 = this.Bu0) > 0.0F && (this.Bu0 = UB0.M60.Qy * 2.0F + f1) > 6.0F) this.Bu0 = 6.0F;  }
/*    */ 
/*    */   
/*    */   public boolean we(xr0 paramxr0, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public boolean rS(byte paramByte, eo parameo, int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3) {
/*    */     return false;
/*    */   }
/*    */   
/*    */   public void fB0(boolean paramBoolean, short paramShort1, short paramShort2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, short paramShort3) {}
/*    */   
/*    */   public void O00(boolean paramBoolean) {}
/*    */   
/*    */   public abstract String XX();
/*    */   
/*    */   public abstract ny UB0();
/*    */   
/*    */   public Eb vD() {
/*    */     return null;
/*    */   }
/*    */   
/*    */   public void j00(short[] paramArrayOfshort) {
/*    */     if (paramArrayOfshort.length < 1)
/*    */       return; 
/*    */     if (paramArrayOfshort[0] == -28672) {
/*    */       int i = (km.u4.s40(aq0.LI)).Lg0.size();
/*    */       for (Hc0 hc0 = this.wN.r30(); hc0.hasNext(); ((Ah)hc0.next()).WQ(i));
/*    */     } 
/*    */   }
/*    */   
/*    */   public void Rx0(boolean paramBoolean) {}
/*    */   
/*    */   public void AP() {
/*    */     l8.info("Reloading map.");
/*    */   }
/*    */   
/*    */   public abstract void Iy(qo paramqo);
/*    */   
/*    */   public kg0 eA0() {
/*    */     return null;
/*    */   }
/*    */   
/*    */   public abstract void LB0(boolean paramBoolean);
/*    */   
/*    */   public abstract void Ap0();
/*    */   
/*    */   public void Zq0(boolean paramBoolean, int paramInt) {}
/*    */   
/*    */   public abstract void LB(tc paramtc, p10 paramp10, ArrayList paramArrayList);
/*    */   
/*    */   public void Hk() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Xi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */