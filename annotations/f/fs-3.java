/* 1 */ package f;public final class fs extends XJ0 { public final void kr(int paramInt1, int paramInt2) { for (byte b = 0; b < paramInt2; ) { int[] arrayOfInt = this.mE0; Na na; bF0 bF0 = (na = this.LpT3).Oq0(paramInt1); int i = 0, j = 0; while (j < na
/* 2 */         .sm0) { xy0 xy0; if ((xy0 = na.SH(paramInt1, j, bF0)) != null) { i = Math.max(i, xy0.tj0()); j = Math.max(xy0.cf0() - 1, 0) + j; }  j++; }  arrayOfInt[paramInt1] = i;
/* 3 */       b++; paramInt1++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public fs(Na paramNa, int paramInt) {
/*   */     super(paramInt);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fs.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */