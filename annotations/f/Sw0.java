/* 1 */ package f;public final class Sw0 implements iq0 { public final void dispose() { this.XI.dispose(); zp0 zp0;
/* 2 */     for (Hc0 hc0 = (zp0 = zp0.vY()).Ri0.r30(); hc0.hasNext(); ((Texture)hc0.next()).dispose()); this.Ri0.clear(); this.Ri0 = null; }
/*   */ 
/*   */   
/*   */   public Ag0 xB0;
/*   */   public JX XI;
/*   */   public Ui0[] bc0 = new Ui0[12];
/*   */   public Tm O60;
/*   */   public Color yp0 = new Color(270521855);
/*   */   public Color wJ = new Color(1.0F, 1.0F, 1.0F, 1.0F);
/*   */   public float hI = 0.0F;
/*   */   
/*   */   public Sw0() {
/*   */     int i;
/*   */     for (i = 0; i < 4; i++) {
/*   */       Ui0 ui0;
/*   */       this(zp0.vY().G50(0));
/*   */       this.bc0[i] = ui0;
/*   */     } 
/*   */     i = 0;
/*   */     while (i < 7)
/*   */       this.bc0[i + 4] = new Ui0(zp0.vY().G50(++i)); 
/*   */     this.O60 = new Tm(UB0.M60.fG0(), UB0.M60.dL());
/*   */     this.XI = new JX(30);
/*   */     (this.xB0 = new Ag0(this.O60)).cOM2(UB0.M60.fG0(), UB0.M60.dL());
/*   */     i = (int)this.bc0[10].i2() * 10;
/*   */     int j = (int)this.bc0[10].Lv0();
/*   */     this.bc0[10].Y9(0, 0, i, j);
/*   */     this.bc0[10].Kf(this.bc0[10].i2() * 10.0F, this.bc0[10].Lv0());
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Sw0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */