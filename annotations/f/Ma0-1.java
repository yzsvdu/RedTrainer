/* 1 */ package f;public final class Ma0 extends IN { public final void V90(throws paramthrows) { byte b; super.V90(paramthrows); int i, j; if ((i = this.uH) == (j = this.Yc)) { Nu((i * 100 / this.P4) / 100.0F); return; }  if (this.S90)
/* 2 */     { long l; if ((b = (int)(zm0.u20 - (l = this.K3)) / 40) < 1) return;  this.K3 = l + (b * 40); } else { this.S90 = true; b = 1; this
/*   */         
/* 4 */         .K3 = zm0.u20; }  double d = this.P4 * 0.05D; this.uH = i; d = this.P4 * 0.05D; this.uH = i; if ((i > j) ? ((i -= (int)Math.max(1.0D, d) * b) < (i = this.Yc)) : ((i = (int)Math.max(1.0D, d) * b + i) > (i = this.Yc))) this.uH = i;  Nu((this.uH * 100 / this.P4) / 100.0F); }
/*   */ 
/*   */   
/*   */   public int Yc = 100;
/*   */   public int P4 = 100;
/*   */   public int uH = 100;
/*   */   public boolean S90 = false;
/*   */   public long K3 = 0L;
/*   */   
/*   */   public Ma0() {
/*   */     Xu("love-meter");
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ma0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */