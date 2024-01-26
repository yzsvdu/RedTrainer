/* 1 */ package f;public final class VP extends dQ { public int jg = 0; public int EI = 0; public final void nx(int paramInt1, int paramInt2) { this.X70.Uq = paramInt1; this.X70
/* 2 */       .Z1 = paramInt2; } public final Dn0 X70; public VP(int paramInt1, int paramInt2, FV paramFV) { Xu("spritelabel"); this.jg = paramInt1; this.EI = paramInt2; if (paramInt1 > 0 && paramInt2 > 0) { uh0(paramInt1, paramInt2); RI(paramInt1, paramInt2); Tm(paramInt1, paramInt2); }  this(this, paramFV); this.X70 = dn0; Dn0 dn0; (dn0 = new Dn0()).G0(); (new Dn0()).gT(1); } public VP(Jo paramJo) { Xu("spritelabel"); this.jg = 0; this.EI = 0; this(this, paramJo); this.X70 = dn0; Dn0 dn0; (dn0 = new Dn0()).G0(); (new Dn0()).gT(1); } public final void yB0(int paramInt) { this.X70.Dd = paramInt; } public final void EX(nY paramnY) { if (this.jg > 0 && this.EI > 0) return;  super.EX(paramnY); } public final void TE(nY paramnY) { if (this.jg > 0 && this.EI > 0) return;  super.TE(paramnY); } public final void CC(boolean paramBoolean) { if (!paramBoolean) { I i; pRn pRn; Ja0 ja0; this((byte)99, (byte)99, (byte)99, (byte)-1); this(this); this(ja0, pRn); this.db0 = i; } else { this
/* 3 */         .db0 = null; }
/*   */      }
/*   */ 
/*   */   
/*   */   public final void hC0(nY paramnY) {
/*   */     if (this.jg > 0 && this.EI > 0)
/*   */       return; 
/*   */     super.hC0(paramnY);
/*   */   }
/*   */   
/*   */   public final int AW() {
/*   */     int i;
/*   */     return ((i = this.jg) > 0) ? i : super.AW();
/*   */   }
/*   */   
/*   */   public final int HY() {
/*   */     int i;
/*   */     return ((i = this.EI) > 0) ? i : super.HY();
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     int i;
/*   */     int j;
/*   */     if ((i = this.jg) > 0 && (j = this.EI) > 0) {
/*   */       uh0(i, j);
/*   */       int k = this.jg;
/*   */       RI(k, this.EI);
/*   */       k = this.jg;
/*   */       Tm(k, this.EI);
/*   */     } 
/*   */   }
/*   */   
/*   */   public final int com4(boolean paramBoolean) {
/*   */     return super.com4(paramBoolean) + 44;
/*   */   }
/*   */   
/*   */   public final void R60(throws paramthrows) {
/*   */     int i = this.X70.Uq;
/*   */     this.X70.gy(i, this.X70.Z1);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/VP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */