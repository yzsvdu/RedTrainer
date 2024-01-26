/* 1 */ package f;public final class xW extends xr0 { public short IF0; public byte YL0; public a4 lS; public IF0 Bl0; public xW(short paramShort1, IF0 paramIF0, short paramShort2, short paramShort3) { super(paramShort2, paramShort3); this.IF0 = (short)(paramShort1 & 0xFFFF03FF); this.YL0 = (byte)(paramShort1 >> 10); this.Bl0 = paramIF0; } public final boolean Gc(byte paramByte) { if (bl0() != 14 && bl0() != -2) paramByte = bl0();  if (paramByte == 0 || this.Bl0
/* 2 */       .UZ == 
/* 3 */       vF.Cv0) return true;  }
/* 4 */   public final short Ij() { return this.IF0; } public final byte F80() { return this.YL0; } public final a4 jH() { return this.lS; } public final byte bl0() { byte b; return ((b = (byte)((this.YL0 >> 2) - 1)) == -8) ? 8 : b; } public final boolean T9() { byte b; return (((b = this.YL0) | 0x1) == b); } public final boolean a5(byte paramByte) { return (bl0() < 3 && paramByte < 3 && hz().RX()); } public final boolean WS() { return (bl0() == 0); } public final void z0(byte paramByte, short paramShort) { a4 a41; if ((a41 = this.Bl0.hz0.KL[paramShort]) == null) return;  this
/* 5 */       .IF0 = paramShort; this.YL0 = paramByte; this.lS = a41; } public final byte OB0() { return this.lS.jY; }
/* 6 */   public final ZK0 hz() { a4 a41; IF0 iF0; if ((iF0 = this.Bl0) == null || (a41 = this.lS) == null) return Qm.A3; 
/*   */     Qm qm = Qm.i9;
/*   */     byte b = iF0.E10;
/*   */     ZK0 zK0;
/*   */     if ((zK0 = this.c50[b][this.jY & 0xFF]) == null)
/*   */       zK0 = Qm.A3; 
/*   */     return this; }
/*   */ 
/*   */   
/*   */   public final KI Q4() {
/*   */     return this.Bl0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/xW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */