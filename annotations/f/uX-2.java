/*  1 */ package f;public final class uX extends FO { public final void d40() { Dk0 dk0; Ip ip; int i; if (km.XU()) { this.ib.Tm(km.wI0.dG(), 160); et et; this.ib.js0(et = et.T90); this.Nj0.Tm(km.wI0.dG(), 160); this.Nj0.C70(et); dk0 = this.Nj0;
/*  2 */       i = (ip = this.ib).Kd; }
/*  3 */     else { cf.IX(h1.Ju0, true); int j = cf.hf0, k = (km.wI0.dG() - j) / 2;
/*    */       
/*  5 */       i = cf.G30 + (int)Math.ceil((km.wI0.vH0 * 50.0F)); this.ib.Tm(j, 115); this.ib
/*  6 */         .ME(k, i - 115);
/*  7 */       this.Nj0.C70(et.Em); dk0 = this.Nj0;
/*  8 */       i = (ip = this.ib).Kd; }  dk0
/*    */       
/* 10 */       .ME(i, ip.er0);
/* 11 */     if (km.XU()) { this.CoM8.mM(); this.CoM8.uh0(116, 116); this.CoM8.QJ0(et.dw0, -22, -22); } else { this.CoM8.mM(); this.CoM8.uh0(128, 24); this.CoM8
/*    */ 
/*    */ 
/*    */         
/* 15 */         .ME(this.ib.m40() - this.CoM8.xY, this.ib.mD() - this.CoM8.HC); }
/*    */      }
/*    */ 
/*    */   
/*    */   public boolean MI0;
/*    */   public boolean ax = false;
/*    */   public p30 CoM8;
/*    */   public h70 rH0;
/*    */   
/*    */   public uX(boolean paramBoolean) {
/*    */     (this.CoM8 = new p30(Ml0.OH0(53), 96, 30)).Xu("battle-button-return");
/*    */     this.CoM8.tW(this::VC);
/*    */     if (km.XU())
/*    */       this.CoM8.Xg0(116, 116); 
/*    */     r6(paramBoolean);
/*    */     J8(this.CoM8);
/*    */   }
/*    */   
/*    */   public final void LV() {
/*    */     this.MI0 = true;
/*    */   }
/*    */   
/*    */   public final boolean i2(oa0 paramoa0) {
/*    */     if (h1.J20(paramoa0.GG0, BM.lc) && B8.Wm0(paramoa0.cz0) && paramoa0.oO())
/*    */       VC(); 
/*    */     return super.i2(paramoa0);
/*    */   }
/*    */   
/*    */   public final void r6(boolean paramBoolean) {
/*    */     this.ax = paramBoolean;
/*    */     this.CoM8.wI0(paramBoolean);
/*    */   }
/*    */   
/*    */   public final void VC() {
/*    */     if (this.MI0 || !this.ax || pA.Dg0.TF.b00.p3())
/*    */       return; 
/*    */     if (this.rH0 != null && !vC0.I8(js.vu0, h70.class))
/*    */       js.vu0.uh(this.rH0); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/uX.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */