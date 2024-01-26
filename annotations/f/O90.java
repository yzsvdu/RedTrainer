/* 1 */ package f;public final class O90 extends Qa0 implements r60 { public final void uc0(float paramFloat) { if (nx0.JC0(paramFloat, -1.0F)) { paramFloat = this.mN.Yp;
/*   */ 
/*   */       
/* 4 */       paramFloat = Math.min(0.1F, UB0.M60.Qy) * (1.0F - paramFloat) + paramFloat; }  if (paramFloat > 0.9999F) paramFloat = 0.9999F;  this.mN.Nu(paramFloat); this.mN
/* 5 */       .HC(this.Cr0.format((paramFloat * 100.0F)) + "%"); }
/*   */ 
/*   */   
/*   */   public DecimalFormat Cr0;
/*   */   public final Ip OC;
/*   */   public final IN mN;
/*   */   public final dQ Su;
/*   */   
/*   */   public O90(String paramString) {
/*   */     super(false, false);
/*   */     dQ dQ1;
/*   */     IN iN;
/*   */     this.Cr0 = new DecimalFormat("0.00");
/*   */     Xu("confirm-widget");
/*   */     this();
/*   */     this.OC = ip;
/*   */     ip.Xu("confirm-panel");
/*   */     this(paramString);
/*   */     this.Su = new dQ();
/*   */     this();
/*   */     this.mN = new IN();
/*   */     Ip ip;
/*   */     (new Ip()).WN((ip = new Ip()).d7().Ya(this).Ya(iN).Em0());
/*   */     (new Ip()).rK0((new Ip()).mE0().Ya(this).Ya(iN));
/*   */     J8(new Ip());
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     super.d40();
/*   */     this.OC.mM();
/*   */     QI();
/*   */     this.OC.js0(et.Wi0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/O90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */