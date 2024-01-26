/* 1 */ package f;public final class kp implements else { public static long Sv = 0L; public static final long CS = System.currentTimeMillis(); public final pc XG0() { pc[] arrayOfPc; int i; byte b; int[] arrayOfInt; for (arrayOfPc = this.kT, i = (int)(Sv % this.kf), b = 0; b < (arrayOfInt = this.X00).length; ) { int j; if (i <= (j = arrayOfInt[b]))
/* 2 */         return arrayOfPc[b];  i -= j; b++; }
/* 3 */      throw new JU("Could not determine current animation frame in AnimatedTiledMapTile.  This should never happen."); }
/*   */ 
/*   */   
/*   */   public int JU;
/*   */   public y9 CG;
/*   */   public GC f0;
/*   */   public pc[] kT;
/*   */   public int[] X00;
/*   */   public int kf;
/*   */   
/*   */   public kp(float paramFloat, fQ paramfQ) {
/*   */     this.kT = new pc[j];
/*   */     int i;
/*   */     int j;
/*   */     this.kf = (j = paramfQ.Z8) * (i = (int)(paramFloat * 1000.0F));
/*   */     this.X00 = new int[j];
/*   */     for (j = 0; j < paramfQ.Z8; j++) {
/*   */       this.kT[j] = (pc)paramfQ.get(j);
/*   */       this.X00[j] = i;
/*   */     } 
/*   */   }
/*   */   
/*   */   public kp(o0 paramo0, fQ paramfQ) {
/*   */     this.kT = new pc[paramfQ.Z8];
/*   */     this.X00 = paramo0.zt();
/*   */     this.kf = 0;
/*   */     for (byte b = 0; b < paramo0.mG0; b++) {
/*   */       this.kT[b] = (pc)paramfQ.get(b);
/*   */       int i = this.kf;
/*   */       this.kf = paramo0.Vl(b) + i;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final int getId() {
/*   */     return this.JU;
/*   */   }
/*   */   
/*   */   public final pe0 LPT8() {
/*   */     return (XG0()).o8;
/*   */   }
/*   */   
/*   */   public final float Dh0() {
/*   */     return (XG0()).Z4;
/*   */   }
/*   */   
/*   */   public final float static() {
/*   */     return (XG0()).ex0;
/*   */   }
/*   */   
/*   */   public final y9 eY() {
/*   */     if (this.CG == null) {
/*   */       y9 y91;
/*   */       this();
/*   */       this.CG = y91;
/*   */     } 
/*   */     return this.CG;
/*   */   }
/*   */   
/*   */   public final GC Jy0() {
/*   */     if (this.f0 == null) {
/*   */       GC gC;
/*   */       this();
/*   */       this.f0 = gC;
/*   */     } 
/*   */     return this.f0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kp.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */