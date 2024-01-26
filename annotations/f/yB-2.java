/* 1 */ package f;public final class yB extends GC0 { public final GC0 ce0(int paramInt1, int paramInt2) { int i; int j; int k; char[] arrayOfChar; for (paramInt1 -= this.Iu, paramInt2 -= this.Bm, i = 0, j = 0, k = 0; k < (arrayOfChar = this.jX).length && paramInt2 >= i; ) { int m = k + 1; k = arrayOfChar[k]; int n = m + 1; if ((m = arrayOfChar[m]) > 0) { if (k == 0 || paramInt2 < k) { for (byte b = 0; b < m; ) { GC0 gC0; int i1; if (paramInt1 >= (i1 = (gC0 = this.la0.get(j + b)).Iu) && paramInt1 < i1 + gC0
/* 2 */               .J1 && paramInt2 >= (i1 = gC0.Bm) && paramInt2 < i1 + gC0.tq0) { i1 = 1; } else { i1 = 0; }  if (i1 != 0)
/* 3 */               return gC0.ce0(paramInt1, paramInt2);  b++; }  if (k > 0 && paramInt1 >= ((GC0)this.la0.get(j)).Iu) { GC0 gC0; byte b1; for (gC0 = null, b1 = 0; b1 < m; ) { GC0 gC01; if ((gC01 = this.la0.get(j + b1)).Iu >= paramInt1 && (gC0 == null || gC0.pM == gC01.pM)) return gC01;  b1++; gC0 = gC01; }  }  }  j += m; }  if (k > 0) i = k;  k = n; }  return this; }
/*   */ 
/*   */   
/*   */   public final ArrayList la0 = new ArrayList();
/*   */   public final ArrayList yb0 = new ArrayList();
/*   */   public final ArrayList fi = new ArrayList();
/*   */   public char[] jX = da.ap;
/*   */   
/*   */   public yB(xc paramxc) {
/*   */     super(paramxc);
/*   */   }
/*   */   
/*   */   public final void Zb(X8 paramX8) {
/*   */     int i = paramX8.sN + this.Iu;
/*   */     int j = paramX8.SW + this.Bm;
/*   */     VI vI = paramX8.RB0;
/*   */     int k = this.J1;
/*   */     int m = this.tq0;
/*   */     ((tw)vI).X2(i, j, k, m);
/*   */     try {
/*   */       if (!((tw)paramX8.RB0).lPT4()) {
/*   */         j = 0;
/*   */         ArrayList<?> arrayList;
/*   */         int n = (arrayList = this.la0).size();
/*   */         while (j < n) {
/*   */           ((GC0)arrayList.get(j)).Zb(paramX8);
/*   */           j++;
/*   */         } 
/*   */       } 
/*   */       return;
/*   */     } finally {
/*   */       ((tw)paramX8.RB0).Hq0();
/*   */       paramX8.sN -= this.Iu;
/*   */       paramX8.SW -= this.Bm;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void IG0(int paramInt1, int paramInt2) {
/*   */     paramInt1 += this.Iu;
/*   */     paramInt2 += this.Bm;
/*   */     byte b = 0;
/*   */     int i = this.la0.size();
/*   */     while (b < i) {
/*   */       ((GC0)this.la0.get(b)).IG0(paramInt1, paramInt2);
/*   */       b++;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void NuL(int paramInt1, int paramInt2, ArrayList<m10> paramArrayList) {
/*   */     paramInt1 += this.Iu;
/*   */     paramInt2 += this.Bm;
/*   */     byte b = 0;
/*   */     int i = this.yb0.size();
/*   */     while (b < i) {
/*   */       (this.yb0.get(b)).Iu += paramInt1;
/*   */       (this.yb0.get(b)).Bm += paramInt2;
/*   */       paramArrayList.add(this.yb0.get(b));
/*   */       b++;
/*   */     } 
/*   */     b = 0;
/*   */     i = this.la0.size();
/*   */     while (b < i) {
/*   */       ((GC0)this.la0.get(b)).NuL(paramInt1, paramInt2, paramArrayList);
/*   */       b++;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void WG() {
/*   */     byte b = 0;
/*   */     int i = this.la0.size();
/*   */     while (b < i) {
/*   */       ((GC0)this.la0.get(b)).WG();
/*   */       b++;
/*   */     } 
/*   */     this.la0.clear();
/*   */     this.yb0.clear();
/*   */     this.jX = da.ap;
/*   */   }
/*   */   
/*   */   public final boolean Q8(GC0 paramGC0) {
/*   */     boolean bool = false;
/*   */     byte b2 = 0;
/*   */     int j = this.la0.size();
/*   */     while (b2 < j) {
/*   */       bool |= ((GC0)this.la0.get(b2)).Q8(paramGC0);
/*   */       b2++;
/*   */     } 
/*   */     if (bool) {
/*   */       this.gv0 = true;
/*   */     } else {
/*   */       super.Q8(paramGC0);
/*   */     } 
/*   */     byte b1 = 0;
/*   */     int i = this.la0.size();
/*   */     while (b1 < i) {
/*   */       GC0 gC0;
/*   */       if ((gC0 = this.la0.get(b1)).Jz0)
/*   */         gC0.gv0 = this.gv0; 
/*   */       b1++;
/*   */     } 
/*   */     return this.gv0;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yB.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */