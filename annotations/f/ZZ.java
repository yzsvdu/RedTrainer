/*  1 */ package f;public final class ZZ extends ZK0 { public final boolean com4(xr0 paramxr01, xr0 paramxr02, tc paramtc, byte paramByte) { char c2, c1 = ''; if (paramtc.XC()) { c1 = 'K'; } else if (paramtc.z80()) { c1 = 'd'; }  if (paramtc.HW
/*  2 */       .g50 == 1) c1 += '2';  paramByte = 0;
/*  3 */     if (paramtc.pm
/*  4 */       .J4) c2 = 'Ǵ';  if (paramtc
/*  5 */       .b1() && !km.wI0.Oo0()) { Bo bo; byte b = this.Pw; int i = this.s0; this(b, c2, c1, i);
/*  6 */       if (paramtc.HW
/*  7 */         .g50 == 0) { b = 40; } else { b = 100; }  bo
/*  8 */         .nG = b;
/*  9 */       paramxr01.TL0(bo); if (paramtc.Pf()) km.pm0
/* 10 */           .bA0(true, (byte)2, (short)1658, 0.0F);  }  return false; }
/*    */ 
/*    */   
/*    */   public byte Pw;
/*    */   public int s0;
/*    */   
/*    */   public ZZ(int paramInt, byte paramByte) {
/*    */     this.Pw = paramByte;
/*    */     this.s0 = paramInt;
/*    */   }
/*    */   
/*    */   public final void lPT8(xr0 paramxr0, tc paramtc, tH paramtH, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     if (paramxr0.gc())
/*    */       return; 
/*    */     byte b = paramtc.HW.FB;
/*    */     U70 u70;
/*    */     if ((u70 = G00.Av0.Cx0(b, this.s0, false).LT(0)) != null) {
/*    */       Texture texture = HA0();
/*    */       float f1 = paramInt1, f2 = paramInt2;
/*    */       paramtH.VI(this, f1, f2);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ZZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */