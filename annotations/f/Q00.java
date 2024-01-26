/* 1 */ package f;public abstract class Q00 extends fT implements qy0 { public final void lpt1(int paramInt, bF0 parambF0) { byte b = 1; JJ0[] arrayOfJJ0; if ((arrayOfJJ0 = this.PU) != null) { int i; byte b1; for (i = arrayOfJJ0.length, b1 = 0; b1 < i; ) {
/*   */         LL lL; IG iG;
/* 3 */         if ((iG = (IG)gy0.Hr0((gy0[])(lL = (arrayOfJJ0[b1]).J1).Xw, parambF0)) != null) { XJ0 xJ0; if ((xJ0 = iG.cD0) != null) { boolean bool; if ((bool = LL.kw) || paramInt <= xJ0
/* 4 */               .NW)
/*   */             { int k, m, arrayOfInt2[];
/* 6 */               if ((m = (k = xJ0.NW) + b) >= (arrayOfInt2 = xJ0.mE0).length) { arrayOfInt2 = new int[m]; xJ0.yE(0, k, arrayOfInt2); xJ0.mE0 = arrayOfInt2; } else { xJ0.yE(0, k, arrayOfInt2); }  int j = paramInt + b; k = xJ0.NW - paramInt; int[] arrayOfInt1; System.arraycopy(arrayOfInt1 = xJ0.mE0, paramInt, arrayOfInt1, j, k); xJ0.NW = m; xJ0.kr(paramInt, b); xJ0.em0(0, m); if (!bool && 
/* 7 */                 iG.cD0
/* 8 */                 .NW != parambF0
/* 9 */                 .ty0()) throw new AssertionError();  } else { throw new AssertionError(); }  }  if (iG.z4 != null) { IG[] arrayOfIG1 = new IG[parambF0.ty0()]; System.arraycopy(iG.z4, 0, arrayOfIG1, 0, paramInt); IG[] arrayOfIG2 = iG.z4; int j = paramInt + b, k = arrayOfIG2.length - paramInt; System.arraycopy(arrayOfIG2, paramInt, arrayOfIG1, j, k); iG.z4 = arrayOfIG1; }  if (lL.bi(iG)) { int j = lL.RM(parambF0.ly(paramInt)); if (LL.kw || j < lL.ge0) { lL.av0(j, b); } else { throw new AssertionError(); }  }  }  b1++;
/*   */       }  }
/*   */      }
/*   */ 
/*   */   
/*   */   public final ArrayList Ko;
/*   */   public JJ0[] PU;
/*   */   
/*   */   public Q00() {
/*   */     ArrayList arrayList;
/*   */     this();
/*   */     this.Ko = this;
/*   */   }
/*   */   
/*   */   public final Object JA(int paramInt) {
/*   */     return null;
/*   */   }
/*   */   
/*   */   public final void oq() {}
/*   */   
/*   */   public final bF0 getParent() {
/*   */     return null;
/*   */   }
/*   */   
/*   */   public final boolean fk() {
/*   */     return false;
/*   */   }
/*   */   
/*   */   public final int ty0() {
/*   */     return this.Ko.size();
/*   */   }
/*   */   
/*   */   public final bF0 ly(int paramInt) {
/*   */     return this.Ko.get(paramInt);
/*   */   }
/*   */   
/*   */   public final int S7(bF0 parambF0) {
/*   */     byte b = 0;
/*   */     int i = this.Ko.size();
/*   */     while (b < i) {
/*   */       if (this.Ko.get(b) == parambF0)
/*   */         return b; 
/*   */       b++;
/*   */     } 
/*   */     return -1;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Q00.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */