/* 1 */ package f;public final class gt0 implements iq0 { public final void kN(int paramInt1, int paramInt2) { kV kV1; if ((kV1 = this.J7) != null) kV1.nW(paramInt1, paramInt2);  float f1 = paramInt1, f2 = paramInt2; (this.D60 = new Tm(f1, f2)).Wt(f1, f2, false); this.D60.UX(true); this
/* 2 */       .SO.d60(this.D60.VD0); }
/*   */ 
/*   */   
/*   */   public Tm D60;
/*   */   public JX SO = new JX();
/*   */   public int OJ0;
/*   */   public kV J7;
/*   */   public Texture[] yZ;
/*   */   public int F3;
/*   */   public int mr;
/*   */   
/*   */   public gt0() {
/*   */     kN(UB0.M60.fG0(), UB0.M60.dL());
/*   */     interface.ZZ().getClass();
/*   */     this.yZ = arrayOfTexture;
/*   */     Texture[] arrayOfTexture;
/*   */     int i = (arrayOfTexture = interface.A5()).length;
/*   */     for (byte b = 0; b < i; b++) {
/*   */       Texture texture = arrayOfTexture[b];
/*   */       this.F3 = texture.getWidth() + this.F3;
/*   */       this.mr = texture.getHeight();
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     this.SO.dispose();
/*   */     kV kV1;
/*   */     if ((kV1 = this.J7) != null)
/*   */       kV1.dispose(); 
/*   */     Texture[] arrayOfTexture;
/*   */     if ((arrayOfTexture = this.yZ) != null) {
/*   */       int i = this.length;
/*   */       for (byte b = 0; b < i; b++)
/*   */         this[b].dispose(); 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gt0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */