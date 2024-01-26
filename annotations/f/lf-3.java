/* 1 */ package f;public class lf extends Un { public final void U8(nY paramnY) { String str = "border"; int k = 0; Class<uE0> clazz = uE0.class; uE0 uE0;
/* 2 */     if ((uE0 = (uE0)((q80)paramnY).Yz0(str, k, clazz, null)) == null)
/* 3 */       return;  int i = uE0.M7;
/* 4 */     int j = uE0.ie;
/* 5 */     j = this.GH * 20 + j;
/* 6 */     k = uE0.nG0;
/* 7 */     int m = uE0.oN;
/* 8 */     kN(i, j, k, m); }
/*   */ 
/*   */   
/*   */   public Jo Nz0;
/*   */   public final Dn0 br;
/*   */   public int GH;
/*   */   public FV G;
/*   */   
/*   */   public lf(String paramString, int paramInt, Jo paramJo) {
/*   */     super(paramString);
/*   */     Xu("spritelabel");
/*   */     if (paramJo == null) {
/*   */       this.Nz0 = km.a3.wQ();
/*   */     } else {
/*   */       this.Nz0 = paramJo;
/*   */     } 
/*   */     this(this, paramJo);
/*   */     this.br = dn0;
/*   */     Dn0 dn0;
/*   */     (dn0 = new Dn0()).gT(paramInt);
/*   */     this.GH = paramInt;
/*   */   }
/*   */   
/*   */   public lf(String paramString, int paramInt, FV paramFV) {
/*   */     super(paramString);
/*   */     Xu("spritelabel");
/*   */     this.G = paramFV;
/*   */     this(this, paramFV);
/*   */     this.br = dn0;
/*   */     Dn0 dn0;
/*   */     (dn0 = new Dn0()).gT(paramInt);
/*   */     this.GH = paramInt;
/*   */   }
/*   */   
/*   */   public final void mM() {
/*   */     int j = J50();
/*   */     int i = tj0();
/*   */     Tm(JG0.Fr(AW(), j, this.fu), JG0.Fr(HY(), i, this.Rr));
/*   */     uW();
/*   */   }
/*   */   
/*   */   public final void R60(throws paramthrows) {
/*   */     if (this.Nz0 == null && this.G == null)
/*   */       return; 
/*   */     int i = (this.GH - 1) * -16 + -12;
/*   */     this.br.gy(i, (this.GH - 1) * -10 + -12);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/lf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */