/* 1 */ package f;public abstract class gy0 { public static gy0[] else(gy0[] paramArrayOfgy0, int paramInt) { if (paramInt * 4 > paramArrayOfgy0.length * 3) { int i; if ((paramInt = paramArrayOfgy0.length * 2) >= 4 && (paramInt & (i = paramInt - 1)) == 0) { gy0[] arrayOfGy0; byte b; int j; for (arrayOfGy0 = (gy0[])Array.newInstance(paramArrayOfgy0.getClass().getComponentType(), paramInt), b = 0, j = paramArrayOfgy0.length; b < j; ) { for (gy0 gy01 = paramArrayOfgy0[b]; gy01 != null; ) { gy0 gy02 = gy01.FK0; int k; gy01.FK0 = arrayOfGy0[k = gy01.ks & i]; arrayOfGy0[k] = gy01; gy01 = gy02; }  b++; }  paramArrayOfgy0 = arrayOfGy0; } else { throw new IllegalArgumentException("newSize"); }  }  return paramArrayOfgy0; }
/*   */ 
/*   */   
/*   */   public final Object NF;
/*   */   public final int ks;
/*   */   public gy0 FK0;
/*   */   
/*   */   public gy0(Object paramObject) {
/*   */     this.NF = paramObject;
/*   */     this.ks = paramObject.hashCode();
/*   */   }
/*   */   
/*   */   public static gy0 Hr0(gy0[] paramArrayOfgy0, Object paramObject) {
/*   */     if (paramArrayOfgy0 == null)
/*   */       return null; 
/*   */     gy0 gy01;
/*   */     int i;
/*   */     Object object;
/*   */     for (gy01 = paramArrayOfgy0[(i = paramObject.hashCode()) & paramArrayOfgy0.length - 1]; gy01 != null && (gy01.ks != i || ((object = gy01.NF) != paramObject && !paramObject.equals(object))); gy01 = gy01.FK0);
/*   */     return gy01;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */