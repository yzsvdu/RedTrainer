/* 1 */ package f;public final class rL extends Gt0 { public final boolean com4(xr0 paramxr01, xr0 paramxr02, tc paramtc, byte paramByte) { if (paramtc.b1() && !km.wI0.Oo0()) { int i; byte b = 75; if (paramtc.XC()) { b = 0; } else if (paramtc.z80()) { b = 35; }  paramByte = 0; byte b1;
/* 2 */       if ((b1 = paramtc.HW.g50) == 1) { i = 150; } else if (b1 == 0) { i = -300; }
/* 3 */        if (paramtc.pm
/* 4 */         .J4) i += 500; 
/* 5 */       int j = this.nu0; if (this.R8 == 2)
/*   */       {
/* 7 */         j = L70.gq.fu() + j; }  paramxr01.TL0(new In(this.R8, i, b, j)); if (paramtc.Pf()) km.pm0
/* 8 */           .bA0(true, (byte)2, (short)1658, 0.0F);  }  return false; }
/*   */ 
/*   */   
/*   */   public static final eo cOm2 = new eo();
/*   */   public int nu0;
/*   */   public uT Qo;
/*   */   public byte R8;
/*   */   
/*   */   public rL(int paramInt, byte paramByte) {
/*   */     this.R8 = paramByte;
/*   */     this.nu0 = paramInt;
/*   */   }
/*   */   
/*   */   public final boolean Ud() {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final void NF0(xr0 paramxr0, tc paramtc, K70 paramK70, fo0 paramfo0, Ih0 paramIh0, float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     if (paramxr0.gc() || !paramtc.b1())
/*   */       return; 
/*   */     int i = this.nu0;
/*   */     if (this.R8 == 2)
/*   */       i = L70.gq.fu() + i; 
/*   */     pe0[] arrayOfPe0 = zp0.vY().mF0(i, this.R8);
/*   */     uT uT1;
/*   */     if ((uT1 = this.Qo) == null) {
/*   */       this.Qo = uT.AM(arrayOfPe0[1]);
/*   */     } else {
/*   */       pe0 pe0 = arrayOfPe0[1];
/*   */       uT1.RC.ID(pe0);
/*   */     } 
/*   */     cOm2.TG0(paramFloat1, paramFloat2, paramFloat3 + 0.066F).zT(Xi.z6);
/*   */     this.Qo.lM(Xi.WB);
/*   */     if (this.R8 == 2) {
/*   */       this.Qo.zO(0.012F);
/*   */       this.Qo.WQ(paramFloat1, paramFloat2, paramFloat3 + 0.095F);
/*   */     } else {
/*   */       this.Qo.zO(0.014F);
/*   */       this.Qo.WQ(paramFloat1, paramFloat2, paramFloat3 + 0.176F);
/*   */     } 
/*   */     eo eo1 = paramIh0.H;
/*   */     this.Qo.si(this, paramIh0.nj0);
/*   */     this.Qo.Gz();
/*   */     paramK70.q10(this.Qo, paramfo0);
/*   */   }
/*   */   
/*   */   public final boolean DD() {
/*   */     return false;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/rL.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */