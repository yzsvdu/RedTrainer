/* 1 */ package f;public class IN extends Ap { public static final Ll JF = Ll.F10("valueChanged"); public static final Ll vt = Ll.F10("indeterminate"); public mX sw; public void Nu(float paramFloat) { if (paramFloat <= 0.0F) { paramFloat = 0.0F; } else if (paramFloat > 1.0F) { paramFloat = 1.0F; }  if (this.Yp != paramFloat) { this.Yp = paramFloat; this.O
/* 2 */         .gf0(vt, false); this.O.Ym0(JF); }  } public float Yp; public IN() { cOm7().Ym0(JF); } public final String TI() { return "progressbar"; } public final void Xw(nY paramnY) { super.Xw(paramnY); this.sw = ((q80)paramnY).w2("progressImage"); } public final void J00(throws paramthrows) { int i = qF(), j = Hy(); mX mX1; if ((mX1 = this.sw) != null && this.Yp >= 0.0F) { int k, m; if ((m = (int)((k = i - (i = mX1.Vb())) * this.Yp)) < 0) { k = 0; } else if (m <= k) { k = m; }  Sa0 sa0 = this.O; k = RS(); m = e3(); int n = i + k; this.sw.W8(sa0, k, m, n, j); }
/*   */     
/* 4 */     Lp(this.O); }
/*   */ 
/*   */   
/*   */   public final int AW() {
/*   */     int i = super.AW();
/*   */     mX mX1;
/*   */     if ((mX1 = this.td0) != null) {
/*   */       int j = mX1.Vb();
/*   */       i = Math.max(i, Ho() + j);
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public int HY() {
/*   */     int i = super.HY();
/*   */     mX mX1;
/*   */     if ((mX1 = this.td0) != null) {
/*   */       int j = mX1.wu0();
/*   */       i = Math.max(i, Et() + j);
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final int R80() {
/*   */     int i = super.R80();
/*   */     mX mX1;
/*   */     if ((mX1 = this.sw) != null)
/*   */       i = Math.max(i, mX1.Vb()); 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final int tJ0() {
/*   */     int i = super.tJ0();
/*   */     mX mX1;
/*   */     if ((mX1 = this.sw) != null)
/*   */       i = Math.max(i, mX1.wu0()); 
/*   */     return i;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IN.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */