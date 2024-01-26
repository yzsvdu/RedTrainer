/*   */ package f;public class me { public final short h20() {
/* 2 */     return this.im0.br0.Ga;
/*   */   }
/*   */   
/*   */   public Cy im0;
/*   */   public fQ UH;
/*   */   public fQ eN;
/*   */   
/*   */   public me(Cy paramCy) {
/*   */     fQ fQ1;
/*   */     this();
/*   */     this.UH = this;
/*   */     this();
/*   */     this.eN = this;
/*   */     this.im0 = paramCy;
/*   */   }
/*   */   
/*   */   public final void kc(lpt1 paramlpt1) {
/*   */     paramlpt1.C50();
/*   */     this.UH.Com3(paramlpt1);
/*   */   }
/*   */   
/*   */   public void dispose() {
/*   */     Hc0 hc0 = this.UH.r30();
/*   */     while (hc0.hasNext())
/*   */       ((lpt1)hc0.next()).Ea0(); 
/*   */     hc0 = this.eN.r30();
/*   */     while (hc0.hasNext())
/*   */       ((lpt1)hc0.next()).Ea0(); 
/*   */     this.UH.clear();
/*   */     this.eN.clear();
/*   */   }
/*   */   
/*   */   public void Ic0(float paramFloat) {
/*   */     Hc0 hc02 = this.UH.r30();
/*   */     while (hc02.hasNext())
/*   */       ((lpt1)hc02.next()).j10(paramFloat, null); 
/*   */     Hc0 hc01 = this.eN.r30();
/*   */     while (hasNext())
/*   */       ((lpt1)next()).j10(paramFloat, null); 
/*   */   }
/*   */   
/*   */   public void Gv0(fo0 paramfo0, K70 paramK70, Ih0 paramIh0) {
/*   */     Hc0 hc0 = this.UH.r30();
/*   */     while (hc0.hasNext()) {
/*   */       lpt1 lpt1;
/*   */       if ((lpt1 = (lpt1)hc0.next()).Re(paramIh0))
/*   */         paramK70.q10(lpt1, paramfo0); 
/*   */     } 
/*   */     paramK70.QJ0(this.eN, paramfo0);
/*   */   }
/*   */   
/*   */   public void Ad0(short[] paramArrayOfshort) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/me.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */