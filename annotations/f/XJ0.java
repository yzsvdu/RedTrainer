/* 1 */ package f;public class XJ0 { public final boolean dy0(int paramInt1, int paramInt2) { if ((paramInt2 -= at(paramInt1 + 1) - at(paramInt1)) != 0) { int i = 0;
/* 2 */       for (int j = this.NW; i < j; ) { int k; if (paramInt1 <= (k = i + j >>> 1)) { this.mE0[k] = this.mE0[k] + paramInt2; j = k; continue; }  i = k + 1; }  return true; }  return false; }
/*   */ 
/*   */   
/*   */   public int[] mE0;
/*   */   public int NW;
/*   */   public int dG0;
/*   */   
/*   */   public XJ0() {
/*   */     this(64);
/*   */   }
/*   */   
/*   */   public XJ0(int paramInt) {
/*   */     this.mE0 = new int[paramInt];
/*   */   }
/*   */   
/*   */   public final int at(int paramInt) {
/*   */     int i = 0;
/*   */     int j = this.NW;
/*   */     int k = 0;
/*   */     while (i < j) {
/*   */       int m;
/*   */       if (paramInt <= (m = i + j >>> 1)) {
/*   */         j = m;
/*   */         continue;
/*   */       } 
/*   */       i = k + this.mE0[m];
/*   */       k = m + 1;
/*   */       k = i;
/*   */       i = k;
/*   */     } 
/*   */     return k;
/*   */   }
/*   */   
/*   */   public final int HK0() {
/*   */     int i = 0;
/*   */     int j = this.NW;
/*   */     int k = 0;
/*   */     while (i < j) {
/*   */       i = i + j >>> 1;
/*   */       k += this.mE0[i];
/*   */       i++;
/*   */     } 
/*   */     return k;
/*   */   }
/*   */   
/*   */   public final int zn0(int paramInt) {
/*   */     int i = 0;
/*   */     int j = this.NW;
/*   */     while (i < j) {
/*   */       int k = i + j >>> 1;
/*   */       int m;
/*   */       if (paramInt < (m = this.mE0[k])) {
/*   */         j = k;
/*   */         continue;
/*   */       } 
/*   */       paramInt = k + 1;
/*   */       i = paramInt - m;
/*   */       i = paramInt;
/*   */       paramInt = i;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final int yE(int paramInt1, int paramInt2, int[] paramArrayOfint) {
/*   */     int i = 0;
/*   */     while (paramInt1 < paramInt2) {
/*   */       int j;
/*   */       paramArrayOfint[i = paramInt1 + paramInt2 >>> 1] = (j = this.mE0[i]) - yE(paramInt1, i, paramArrayOfint);
/*   */       paramInt1 = i + j;
/*   */       i = paramInt1;
/*   */       paramInt1 = ++i;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public final int em0(int paramInt1, int paramInt2) {
/*   */     int i = 0;
/*   */     while (paramInt1 < paramInt2) {
/*   */       paramInt1 = paramInt1 + paramInt2 >>> 1;
/*   */       i = this.mE0[paramInt1];
/*   */       this.mE0[paramInt1] = i;
/*   */       i += i = em0(paramInt1, paramInt1) + i;
/*   */       paramInt1++;
/*   */     } 
/*   */     return i;
/*   */   }
/*   */   
/*   */   public void kr(int paramInt1, int paramInt2) {
/*   */     int i = paramInt1 + paramInt2;
/*   */     Arrays.fill(this.mE0, paramInt1, i, this.dG0);
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/XJ0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */