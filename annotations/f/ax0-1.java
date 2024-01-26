/* 1 */ package f;public final class ax0 extends n90 { public final void W8(fB0 paramfB0, int paramInt1, int paramInt2, int paramInt3, int paramInt4) { nK nK = this.pj; nK.Dk0
/* 2 */       .Ma.dJ0(this.BE);
/* 3 */     int k, m = paramInt4 / (k = this.N5); int i, j; if ((j = paramInt3 / (i = this.sl)) < 10 || m < 10) { int i1; int i2; for (i2 = paramInt2, i1 = m; i1-- > 0; ) { for (int i4 = paramInt1, i3 = j; i3-- > 0; )
/* 4 */         { float f1 = i4, f2 = i2, f3 = i, f4 = k; this.iq0.t50(f1, f2, f3, f4); this.iq0.Ne(this.pj.Dk0.yT); int i5 = i4 + i; }  i2 += k; }  }
/* 5 */      i = j * this.sl; k = m * (paramInt3 = this.N5); paramInt4 -= k; int n; if ((n = paramInt3 - i) > 0 || paramInt4 > 0) { if (n > 0 && m > 0) KG(paramInt1 + i, paramInt2, n, paramInt3, 1, m);  if (paramInt4 > 0) { if (j > 0) { paramInt3 = paramInt2 + k; m = this.sl; KG(paramInt1, paramInt3, m, paramInt4, j, 1); }  if (n > 0) { int i1 = paramInt1 + i; KG(i1, paramInt2 + k, n, paramInt4, 1, 1); }
/*   */          }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public ax0(nK paramnK, int paramInt1, int paramInt2, int paramInt3, int paramInt4, pRn parampRn) {
/*   */     super(paramnK, paramInt1, paramInt2, paramInt3, paramInt4, parampRn);
/*   */   }
/*   */   
/*   */   public ax0(ax0 paramax0, pRn parampRn) {
/*   */     super(paramax0, parampRn);
/*   */   }
/*   */   
/*   */   public final mX rv0(pRn parampRn) {
/*   */     if (parampRn != null)
/*   */       return (parampRn = this.BE.o10(parampRn)).equals(this.BE) ? this : new ax0(this, parampRn); 
/*   */     throw new NullPointerException("color");
/*   */   }
/*   */   
/*   */   public final void KG(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
/*   */     this.pj.Dk0.yT.og0(tw.kI0);
/*   */     while (paramInt6-- > 0) {
/*   */       int i;
/*   */       int j;
/*   */       int k;
/*   */       for (i = paramInt2 + paramInt4, k = paramInt1, j = paramInt5; j-- > 0; ) {
/*   */         int n = k + paramInt3;
/*   */         float f1 = k, f2 = paramInt2, f3 = paramInt3, f4 = paramInt4;
/*   */         this.iq0.t50(f1, f2, f3, f4);
/*   */         this.iq0.Ne(this.pj.Dk0.yT);
/*   */         int m = n;
/*   */       } 
/*   */       paramInt2 = i;
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ax0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */