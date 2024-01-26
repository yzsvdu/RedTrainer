/*  1 */ package f;public final class mC extends ZK0 { public final boolean com4(xr0 paramxr01, xr0 paramxr02, tc paramtc, byte paramByte) { int i; byte b = 75; if (paramtc.XC()) { b = 0; } else if (paramtc.z80()) { b = 35; }  paramByte = 0; byte b1;
/*  2 */     if ((b1 = paramtc.HW.g50) == 1) { i = 150; } else if (b1 == 0) { i = -300; }
/*  3 */      if (paramtc.pm
/*  4 */       .J4) i += 500; 
/*  5 */     int j = this.rn;
/*    */     L70 l70;
/*  7 */     j = (l70 = L70.gq).fu() + j; if (this.sK0 && this.x20 == 2 && this.lW && l70.fu() == 3) j++;  if (paramtc.b1() && !km.wI0.Oo0()) { byte b2; ce0 ce0; this(this.x20, i, b, j);
/*  8 */       if (paramtc.HW
/*  9 */         .g50 == 0) { b2 = 50; } else { b2 = 75; }  ce0
/* 10 */         .Tb0 = b2;
/* 11 */       paramxr01.TL0(ce0); if (paramtc.Pf()) km.pm0
/* 12 */           .bA0(true, (byte)2, (short)1658, 0.0F);  }  return false; }
/*    */ 
/*    */   
/*    */   public int rn;
/*    */   public byte x20;
/*    */   public boolean lW;
/*    */   public boolean sK0;
/*    */   public uT Fx0;
/*    */   
/*    */   public mC(byte paramByte, int paramInt, boolean paramBoolean) {
/*    */     this(paramByte, paramInt, paramBoolean, true);
/*    */   }
/*    */   
/*    */   public mC(byte paramByte, int paramInt, boolean paramBoolean1, boolean paramBoolean2) {
/*    */     this.x20 = paramByte;
/*    */     this.rn = paramInt;
/*    */     this.lW = paramBoolean1;
/*    */     this.sK0 = paramBoolean2;
/*    */   }
/*    */   
/*    */   public final void NF0(xr0 paramxr0, tc paramtc, K70 paramK70, fo0 paramfo0, Ih0 paramIh0, float paramFloat1, float paramFloat2, float paramFloat3) {
/*    */     L70 l70;
/*    */     if (paramxr0.gc() || !paramtc.b1())
/*    */       return; 
/*    */     int i = this.rn;
/*    */     if (this.sK0 && this.x20 == 2) {
/*    */       i = (l70 = L70.gq).fu() + i;
/*    */       if (this.lW && l70.fu() == 3)
/*    */         i++; 
/*    */     } else if (this.x20 == 3 && l70.D4() == 87) {
/*    */       return;
/*    */     } 
/*    */     pe0[] arrayOfPe0 = zp0.vY().mF0(i, this.x20);
/*    */     if (this.Fx0 == null)
/*    */       this.Fx0 = uT.AM(arrayOfPe0[3]); 
/*    */     this.Fx0.sA0(arrayOfPe0[3], false);
/*    */     this.Fx0.lM(Xi.WB);
/*    */     byte b;
/*    */     if ((b = this.x20) != 2) {
/*    */       if (b != 4) {
/*    */         this.Fx0.zO(0.0151F);
/*    */         float f = paramFloat2 - 0.065F;
/*    */         this.Fx0.WQ(paramFloat1, f, paramFloat3 + 0.025F);
/*    */         eo eo = paramIh0.nj0;
/*    */         this.Fx0.getClass();
/*    */         uT.HO.TG0(0.0F, 1.0F, 0.0F);
/*    */         this.Fx0.W5(uT.HO, eo);
/*    */       } else {
/*    */         this.Fx0.zO(0.0125F);
/*    */         this.Fx0.WQ(paramFloat1, paramFloat2, paramFloat3 + 0.05F);
/*    */         eo eo = paramIh0.H;
/*    */         this.Fx0.si(eo, paramIh0.nj0);
/*    */       } 
/*    */     } else {
/*    */       this.Fx0.zO(0.01275F);
/*    */       float f = paramFloat2 + 0.025F;
/*    */       this.Fx0.WQ(paramFloat1, f, paramFloat3 + 0.125F);
/*    */       eo eo = paramIh0.H;
/*    */       this.Fx0.si(eo, paramIh0.nj0);
/*    */     } 
/*    */     this.Fx0.Gz();
/*    */     paramK70.q10(this.Fx0, paramfo0);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/mC.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */