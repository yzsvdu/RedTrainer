/* 1 */ package f;public final class Aa extends JN { public final nJ0 Zj0(ZP paramZP) { SA sA = (SA)paramZP; (new nJ0())
/* 2 */       .Ox = this;
/*   */     return new nJ0(); }
/*   */ 
/*   */   
/*   */   public static final Aa QQ;
/*   */   public static Color FU = new Color(0.0F, 0.0F, 1.0F, 1.0F);
/*   */   public static Color kj0 = new Color(1.0F, 0.0F, 0.0F, 1.0F);
/*   */   public static Color O1 = new Color(0.0F, 1.0F, 0.0F, 1.0F);
/*   */   public fQ bt0;
/*   */   
/*   */   public Aa() {
/*   */     fQ fQ1;
/*   */     this();
/*   */     this.bt0 = this;
/*   */   }
/*   */   
/*   */   static {
/*   */     JN.fl0 = QQ = new Aa();
/*   */   }
/*   */   
/*   */   public final void mL0(SA paramSA) {
/*   */     if (this.bt0 == null) {
/*   */       fQ fQ2;
/*   */       this();
/*   */       this.bt0 = fQ2;
/*   */     } 
/*   */     this();
/*   */     fQ fQ1;
/*   */     for (Hc0 hc0 = this.bt0.r30(); hc0.hasNext();) {
/*   */       if ((r50 = (R50)hc0.next()).Ro == paramSA)
/*   */         fQ1.Com3(r50); 
/*   */     } 
/*   */     R50.Ru0.freeAll(fQ1);
/*   */     this.bt0.tF(fQ1, true);
/*   */   }
/*   */   
/*   */   public final void xA(SA paramSA, int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     if (this.bt0 == null) {
/*   */       fQ fQ1;
/*   */       this();
/*   */       this.bt0 = fQ1;
/*   */     } 
/*   */     Color color = Color.RED;
/*   */     if (paramInt != 0) {
/*   */       if (--paramInt != 2) {
/*   */         if (paramInt != 3) {
/*   */           if (paramInt == 4)
/*   */             color = O1; 
/*   */         } else {
/*   */           color = kj0;
/*   */         } 
/*   */       } else {
/*   */         color = FU;
/*   */       } 
/*   */       this.ue = color;
/*   */       jG(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*   */       R50 r50;
/*   */       (r50 = (R50)R50.Ru0.obtain()).Ro = paramSA;
/*   */       this.bt0.Com3(this);
/*   */       return;
/*   */     } 
/*   */     throw null;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Aa.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */