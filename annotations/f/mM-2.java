/*  1 */ package f;public final class mM extends ZK0 { public boolean HL0; public float Sm0; public final boolean sM(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) { return paramtc.XC() ? true : (this instanceof lk); } public uT Ng; public boolean vf0; public mM(boolean paramBoolean1, float paramFloat, boolean paramBoolean2) { this.HL0 = paramBoolean1; this.Sm0 = paramFloat; this.vf0 = paramBoolean2; } public final boolean com4(xr0 paramxr01, xr0 paramxr02, tc paramtc, byte paramByte) { if (this.vf0) { byte b = 75; if (paramtc.XC()) { b = 0; } else if (paramtc.z80()) { b = 35; }  if (paramtc
/*    */ 
/*    */ 
/*    */         
/*  5 */         .b1() && !km.wI0.Oo0()) { byte b1; ce0 ce0 = new ce0(); paramByte = 3; if (this.HL0) { b1 = 600; } else { b1 = 50; }  this(paramByte, b1, b, 9);
/*  6 */         if (paramtc.HW
/*  7 */           .g50 == 0) { b = 35; } else { b = 50; }  this
/*  8 */           .Tb0 = b;
/*  9 */         paramxr01.TL0(this); if (paramtc.Pf()) km.pm0
/* 10 */             .bA0(true, (byte)2, (short)1658, 0.0F);  }  }  return false; }
/*    */ 
/*    */   
/*    */   public final void NF0(xr0 paramxr0, tc paramtc, K70 paramK70, fo0 paramfo0, Ih0 paramIh0, float paramFloat1, float paramFloat2, float paramFloat3) {
/*    */     if (!this.vf0 || paramxr0.gc() || !paramtc.b1())
/*    */       return; 
/*    */     pe0[] arrayOfPe0 = zp0.vY().mF0(9, (byte)3);
/*    */     if (this.Ng == null)
/*    */       this.Ng = uT.AM(arrayOfPe0[1]); 
/*    */     this.Ng.sA0(arrayOfPe0[1], false);
/*    */     this.Ng.lM(Xi.WB);
/*    */     this.Ng.zO(0.0151F);
/*    */     float f = paramFloat2 - 0.025F;
/*    */     this.Ng.WQ(paramFloat1, f, paramFloat3 + 0.08F);
/*    */     eo eo = paramIh0.nj0;
/*    */     this.Ng.getClass();
/*    */     uT.HO.TG0(0.0F, 1.0F, 0.0F);
/*    */     this.Ng.W5(uT.HO, this);
/*    */     this.Ng.Gz();
/*    */     paramK70.q10(this.Ng, paramfo0);
/*    */   }
/*    */   
/*    */   public final boolean kA0(xr0 paramxr0, tc paramtc, byte paramByte) {
/*    */     return ((paramtc.pm.QO > 0));
/*    */   }
/*    */   
/*    */   public final float X6() {
/*    */     return this.Sm0;
/*    */   }
/*    */   
/*    */   public final int Pt(boolean paramBoolean) {
/*    */     return this.HL0 ? 800 : 0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */