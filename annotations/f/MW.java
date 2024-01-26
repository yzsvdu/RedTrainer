/*  1 */ package f;public final class MW extends Un { public int n2; public MW(int paramInt, String paramString, short paramShort) { super(str); String str; this.n2 = 0; this.yu0 = 32; this.Tr = new rH(this); if (km.Nr() && h1.Eg0) { if (paramInt > 0)
/*  2 */       { Gq0(zw.vz(paramString, " (").append(km.Lpt1.am(paramInt)).append(")").toString()); } else { Gq0(paramString); }  Pb0(150); }  U70[] arrayOfU70; (arrayOfU70 = new U70[2])[0] = wm0.y8().SJ0(paramShort, true); (new U70[2])[1] = wm0.y8().eM0(paramShort); this.Tr.qt(arrayOfU70); this.Tr.tL(24, 24); if (h1.Eg0 && !km.XU()) { this.n2 = 24; this.Tr.zT(0, 0); } else { this.Tr.zT(4, 3); }  if (km.XU()) { Xg0(480, 64); this.Tr.tL(48, 48); this.Tr.uE0(et.c5); }  Xu("hud-item-button"); } public int yu0; public rH Tr; public final void LM(throws paramthrows) { super.LM(paramthrows); } public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0
/*  3 */       .oO() && (
/*    */       
/*  5 */       h1.J20(paramoa0.GG0, BM.bC) || 
/*    */       
/*  7 */       h1.J20(paramoa0.GG0, BM.ni))) {
/*    */ 
/*    */       
/* 10 */       hm.Fz0(this.TG0.oh0); return true;
/* 11 */     }  return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   public final void EX(nY paramnY) {}
/*    */   
/*    */   public final void TE(nY paramnY) {}
/*    */   
/*    */   public final void hC0(nY paramnY) {}
/*    */   
/*    */   public final void yV(throws paramthrows) {
/*    */     super.yV(paramthrows);
/*    */   }
/*    */   
/*    */   public final void UD0(pe parampe) {
/*    */     super.UD0(parampe);
/*    */     if (!h1.Eg0 && (this.n2 = Td0() + 35) < 66)
/*    */       this.n2 = 66; 
/*    */   }
/*    */   
/*    */   public final void d40() {
/*    */     if (!km.XU()) {
/*    */       int i = this.n2;
/*    */       uh0(i, this.yu0);
/*    */       i = this.n2;
/*    */       Tm(i, this.yu0);
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void pm() {
/*    */     js.vu0.j90(this, this.z4, et.F30);
/*    */   }
/*    */   
/*    */   public final void GD() {
/*    */     js.vu0.KE();
/*    */   }
/*    */   
/*    */   public final void R60(throws paramthrows) {
/*    */     boolean bool = false;
/*    */     if (this.O.z60(Ap.b00) || this.O.z60(JG0.e30))
/*    */       bool = true; 
/*    */     this.Tr.co(bool);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/MW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */