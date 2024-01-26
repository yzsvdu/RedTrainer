/* 1 */ package f;public final class Wp extends Fy0 { public final boolean i2(oa0 paramoa0) { if (!this.kN || 
/* 2 */       !this.BT)
/*   */     {
/*   */       
/* 5 */       return super.i2(paramoa0); }  if (paramoa0.Cz0() && paramoa0.cz0 == 4 && paramoa0.vl == 1) { UB0.Kg0.fN(new LY(this)); return true; }  return super.i2(paramoa0); }
/*   */ 
/*   */   
/*   */   public final tR n10;
/*   */   public final j40 jC;
/*   */   public final boolean BT;
/*   */   
/*   */   public Wp(tR paramtR, j40 paramj40, byte paramByte, boolean paramBoolean) {
/*   */     super("999", 46, 46);
/*   */     short s = paramj40.eC().Vf0();
/*   */     byte b = paramj40.s5();
/*   */     zY().sm(new zh0[] { um0.TK0().lb(s, paramj40.ol0(), b)[0] });
/*   */     zY().zT(5, -6);
/*   */     Xu("monsterdex-button");
/*   */     this.n10 = paramtR;
/*   */     this.jC = paramj40;
/*   */     this.BT = paramBoolean;
/*   */     R8 r8;
/*   */     if ((r8 = km.u4) == null || r8.DS() == null) {
/*   */       s6("");
/*   */       return;
/*   */     } 
/*   */     s6((new DecimalFormat("000")).format(paramj40.Ek().eD0()));
/*   */     tW(new AUX(paramtR, paramByte));
/*   */     Pb0(200);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wp.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */