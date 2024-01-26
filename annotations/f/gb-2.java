/*  1 */ package f;public final class gb extends Ws0 { public final void Lj0() { short s; if ((s = this.COm4) >= 2 && s <= 206) {
/*  2 */       s = (short)(L70.gq.fu() + s);
/*    */     }
/*    */     
/*  5 */     this
/*  6 */       .P2 = uz0; Wo wo = (Wo)hI;
/*    */     
/*    */     uz0 uz0;
/*    */     HI hI;
/* 10 */     this.cC0 = this.r70.WE0[(uz0 = (hI = this.he0).kO.Ek[s]).YI0]; }
/*    */ 
/*    */   
/*    */   public gb(short paramShort, Wo paramWo, ByteBuffer paramByteBuffer) {
/*    */     super(paramShort, paramWo, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void i3() {
/*    */     this.gS = this.g5.get();
/*    */     this.g5.get();
/*    */     this.COm4 = this.g5.getShort();
/*    */     this.F70 = this.g5.getShort();
/*    */     this.g5.getShort();
/*    */     this.g5.getShort();
/*    */     this.g5.getShort();
/*    */     this.zN = this.g5.getShort();
/*    */     this.zk = this.g5.getShort();
/*    */     this.fd0 = this.g5.getShort();
/*    */     this.Ww0 = this.g5.getShort();
/*    */     this.g5.getShort();
/*    */     this.ZC0 = this.g5.getShort();
/*    */     this.f10 = this.g5.getShort();
/*    */     this.d8 = this.g5.get();
/*    */     this.g5.get();
/*    */     this.Z5 = this.g5.get();
/*    */     this.et = this.g5.get();
/*    */     this.cC = this.g5.getShort();
/*    */     this.Ka0 = this.g5.getShort();
/*    */     this.g5.get();
/*    */     this.g5.get();
/*    */     this.Rb0 = this.g5.getInt();
/*    */     this.ve = this.g5.getInt();
/*    */     this.SE0 = this.g5.getInt();
/*    */     Lj0();
/*    */   }
/*    */   
/*    */   public final String Lr() {
/*    */     return (this.F70 == 175) ? (getName() + " (" + Ml0.OH0(this.he0.bO() * 1000 + 140000 + 69) + ")") : getName();
/*    */   }
/*    */   
/*    */   public final vF WD0() {
/*    */     if (M6((short)4096))
/*    */       return vF.ai; 
/*    */     return vF.IQ;
/*    */   }
/*    */   
/*    */   public final boolean kJ() {
/*    */     return M6((short)8192);
/*    */   }
/*    */   
/*    */   public final boolean cOM9() {
/*    */     return M6((short)4096);
/*    */   }
/*    */   
/*    */   public final boolean hG0() {
/*    */     return (this.P2.Nx == 0);
/*    */   }
/*    */   
/*    */   public final Object clone() {
/*    */     return Ae0();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */