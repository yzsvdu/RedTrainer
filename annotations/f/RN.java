/* 1 */ package f;public final class RN extends JG0 { public final void V90(throws paramthrows) { super.V90(paramthrows); if (this.xh != this.lh)
/* 2 */     { int i; int j; for (long l = zm0.u20; this
/* 3 */         .Pc0 + 250L < l && (i = this.xh) != (j = this.lh); ) { if (i > j) km.pm0.bL((byte)1, (short)91);  i = this.lh; if (this.xh > i) { j = 1; } else { j = -1; }  this.lh = i + j; this.Pc0 += 250L; }  }  byte b = 0; while (b < this
/* 4 */       .lh) {
/* 5 */       int i = this.Kd;
/* 6 */       int j = this.er0;
/* 7 */       this.D30.zT(i, b * 16 + j); this.D30.Iq(); b++;
/*   */     }  }
/*   */ 
/*   */   
/*   */   public int lh = 0;
/*   */   public int xh = 0;
/*   */   public long Pc0 = 0L;
/*   */   public rH D30;
/*   */   
/*   */   public RN() {
/*   */     (this.D30 = new rH(this)).sm(new zh0[] { a80.Oz0.fj() });
/*   */     this.D30.tL(16, 16);
/*   */     this.xh = xi0.qX(4);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/RN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */