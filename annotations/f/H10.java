/* 1 */ package f;public final class H10 { public static short[] tM = new short[] { -1, -1, 0, 0, -1, -1, 0, -1, 0, 0, 0, 0 }; public byte goto = 0; public short[] Hd0 = (short[])tM.clone(); public final void cq0(byte paramByte, Vp0 paramVp0, short paramShort) { byte b; this.Hd0[b = paramVp0.gw0] = paramShort; this
/* 2 */       .Kw0[b] = paramByte; } public byte[] Kw0 = new byte[Vp0.Jo.length]; public H10() {} public H10(H10 paramH10) { ul(paramH10); } public final byte bo0() { return this.goto; } public final short Hb(Vp0 paramVp0) { return this.Hd0[paramVp0.gw0]; } public final byte rB(Vp0 paramVp0) { return this.Kw0[paramVp0.gw0]; }
/*   */ 
/*   */   
/*   */   public final short[] uz0() {
/*   */     return (short[])this.Hd0.clone();
/*   */   }
/*   */   
/*   */   public final byte[] fG() {
/*   */     return (byte[])this.Kw0.clone();
/*   */   }
/*   */   
/*   */   public final void ul(H10 paramH10) {
/*   */     this.goto = paramH10.goto;
/*   */     short[] arrayOfShort;
/*   */     for (byte b = 0; b < (arrayOfShort = this.Hd0).length; b++) {
/*   */       arrayOfShort[b] = paramH10.Hd0[b];
/*   */       this.Kw0[b] = paramH10.Kw0[b];
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/H10.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */