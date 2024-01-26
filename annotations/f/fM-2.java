/* 1 */ package f;public final class fM extends jT { public final jT zz(int paramInt1, int paramInt2) { int i; int j; int k; char[] arrayOfChar; for (paramInt1 -= this.mx, paramInt2 -= this.dF, i = 0, j = 0, k = 0; k < (arrayOfChar = this.Pe0).length && paramInt2 >= i; ) { int m = k + 1; k = arrayOfChar[k]; int n = m + 1; if ((m = arrayOfChar[m]) > 0) { if (k == 0 || paramInt2 < k) { for (byte b = 0; b < m; ) { jT jT1; int i1; if (paramInt1 >= (i1 = (jT1 = this.nA0.get(j + b)).mx) && paramInt1 < i1 + jT1
/* 2 */               .iw0 && paramInt2 >= (i1 = jT1.dF) && paramInt2 < i1 + jT1.RA0) { i1 = 1; } else { i1 = 0; }  if (i1 != 0)
/* 3 */               return jT1.zz(paramInt1, paramInt2);  b++; }  if (k > 0 && paramInt1 >= ((jT)this.nA0.get(j)).mx) { jT jT1; byte b1; for (jT1 = null, b1 = 0; b1 < m; ) { jT jT2; if ((jT2 = this.nA0.get(j + b1)).mx >= paramInt1 && (jT1 == null || jT1.dM == jT2.dM)) return jT2;  b1++; jT1 = jT2; }  }  }  j += m; }  if (k > 0) i = k;  k = n; }  return this; }
/*   */ 
/*   */   
/*   */   public final ArrayList nA0 = new ArrayList();
/*   */   public final ArrayList Xf0 = new ArrayList();
/*   */   public final ArrayList aA0 = new ArrayList();
/*   */   public char[] Pe0 = f9.F00;
/*   */   
/*   */   public fM(xc paramxc) {
/*   */     super(paramxc);
/*   */   }
/*   */   
/*   */   public final void in0(Pj paramPj) {
/*   */     int i = paramPj.Vm + this.mx;
/*   */     int j = paramPj.nH + this.dF;
/*   */     VI vI = paramPj.f20;
/*   */     int k = this.iw0;
/*   */     int m = this.RA0;
/*   */     ((tw)vI).X2(i, j, k, m);
/*   */     try {
/*   */       if (!((tw)paramPj.f20).lPT4()) {
/*   */         j = 0;
/*   */         ArrayList<?> arrayList;
/*   */         int n = (arrayList = this.nA0).size();
/*   */         while (j < n) {
/*   */           ((jT)arrayList.get(j)).in0(paramPj);
/*   */           j++;
/*   */         } 
/*   */       } 
/*   */       return;
/*   */     } finally {
/*   */       ((tw)paramPj.f20).Hq0();
/*   */       paramPj.Vm -= this.mx;
/*   */       paramPj.nH -= this.dF;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void nv(int paramInt1, int paramInt2) {
/*   */     paramInt1 += this.mx;
/*   */     paramInt2 += this.dF;
/*   */     byte b = 0;
/*   */     int i = this.nA0.size();
/*   */     while (b < i) {
/*   */       ((jT)this.nA0.get(b)).nv(paramInt1, paramInt2);
/*   */       b++;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void xe0(int paramInt1, int paramInt2, ArrayList<dK> paramArrayList) {
/*   */     paramInt1 += this.mx;
/*   */     paramInt2 += this.dF;
/*   */     byte b = 0;
/*   */     int i = this.Xf0.size();
/*   */     while (b < i) {
/*   */       (this.Xf0.get(b)).mx += paramInt1;
/*   */       (this.Xf0.get(b)).dF += paramInt2;
/*   */       paramArrayList.add(this.Xf0.get(b));
/*   */       b++;
/*   */     } 
/*   */     b = 0;
/*   */     i = this.nA0.size();
/*   */     while (b < i) {
/*   */       ((jT)this.nA0.get(b)).xe0(paramInt1, paramInt2, paramArrayList);
/*   */       b++;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void LpT1() {
/*   */     byte b = 0;
/*   */     int i = this.nA0.size();
/*   */     while (b < i) {
/*   */       ((jT)this.nA0.get(b)).LpT1();
/*   */       b++;
/*   */     } 
/*   */     this.nA0.clear();
/*   */     this.Xf0.clear();
/*   */     this.Pe0 = f9.F00;
/*   */   }
/*   */   
/*   */   public final boolean NUl(jT paramjT) {
/*   */     boolean bool = false;
/*   */     byte b2 = 0;
/*   */     int j = this.nA0.size();
/*   */     while (b2 < j) {
/*   */       bool |= ((jT)this.nA0.get(b2)).NUl(paramjT);
/*   */       b2++;
/*   */     } 
/*   */     if (bool) {
/*   */       this.NUl = true;
/*   */     } else {
/*   */       super.NUl(paramjT);
/*   */     } 
/*   */     byte b1 = 0;
/*   */     int i = this.nA0.size();
/*   */     while (b1 < i) {
/*   */       jT jT1;
/*   */       if ((jT1 = this.nA0.get(b1)).rH)
/*   */         jT1.NUl = this.NUl; 
/*   */       b1++;
/*   */     } 
/*   */     return this.NUl;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/fM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */