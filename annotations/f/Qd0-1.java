/*  1 */ package f;public final class Qd0 implements bF0 { public final bF0 break; public ArrayList Fj0; public Qd0(bF0 parambF0, String paramString, Object paramObject) { if (parambF0 != null) { this.break = parambF0; if (!zA) x0();  this
/*  2 */         .Bb0 = paramString; this.GG = paramObject; H(true); return; }
/*  3 */      throw new NullPointerException("parent"); } public boolean JZ; public Object Bb0; public Object GG; public final void H(boolean paramBoolean) { this.JZ = paramBoolean; bF0 bF01 = this.break; byte b = 1; int i; JJ0[] arrayOfJJ0; if (this.JZ != paramBoolean && (i = this.break.S7(this)) >= 0 && (arrayOfJJ0 = (x0()).PU) != null) { int j; byte b1; for (j = arrayOfJJ0.length, b1 = 0; b1 < j; ) {
/*    */         LL lL;
/*    */         IG iG;
/*  6 */         if ((iG = (IG)gy0.Hr0((gy0[])(lL = (arrayOfJJ0[b1]).J1).Xw, this)) != null && LL.FH(iG)) { int m, n, i1 = (n = (m = lL.RM(this) + 1) + i) + b; XJ0 xJ0; if ((xJ0 = iG.cD0) != null) { n = xJ0.at(i) + m; i1 = iG.cD0.at(i + b) + m; }  int k = i1 - n; if (n >= 0 && k >= 0 && k <= (
/*  7 */             m = lL.ge0) && n <= m - k) { boolean bool; for (m = 0, i1 = 0; i1 < k; ) { if (lL
/*  8 */                 .F9 != null)
/*  9 */               { int i2; bF0 bF02; int i3; int i4; for (bF02 = lL.Oq0(i2 = n + i1), i3 = 0, i4 = 0; i4 < lL.sm0; ) { xy0 xy0; if ((xy0 = lL.SH(i2, i4, bF02)) != null) { i3 = Math.max(i3, xy0.tj0()); i4 = Math.max(xy0.cf0() - 1, 0) + i4; }  i4++; }
/* 10 */                  bool = m | lL.F9.dy0(i2, i3); }  byte b2 = 0; while (b2 < lL
/* 11 */                 .sm0) { lL.bv(n + i1, b2); b2++; }  i1++; }  lL.rq0(); if (bool) lL.MJ0();  }
/* 12 */           else { throw new IllegalArgumentException("row"); }  }  b1++;
/*    */       }  }
/*    */      }
/*    */ 
/*    */   
/*    */   public final Object JA(int paramInt) {
/*    */     return (paramInt == 0) ? this.Bb0 : this.GG;
/*    */   }
/*    */   
/*    */   public final Qd0 Ra0(String paramString, Object paramObject) {
/*    */     this(this, paramString, paramObject);
/*    */     Qd0 qd0;
/*    */     int i = ty0();
/*    */     boolean bool;
/*    */     if ((bool = zA) || S7(qd0) < 0) {
/*    */       if (this.Fj0 == null) {
/*    */         ArrayList arrayList;
/*    */         this();
/*    */         this.Fj0 = arrayList;
/*    */       } 
/*    */       this.Fj0.add(i, qd0);
/*    */       x0().lpt1(i, this);
/*    */       H(false);
/*    */       return qd0;
/*    */     } 
/*    */     throw new AssertionError();
/*    */   }
/*    */   
/*    */   public final boolean fk() {
/*    */     return this.JZ;
/*    */   }
/*    */   
/*    */   public final int S7(bF0 parambF0) {
/*    */     int i;
/*    */     ArrayList arrayList;
/*    */     if ((arrayList = this.Fj0) != null)
/*    */       for (byte b1 = 0; b1 < i; ) {
/*    */         if (this.Fj0.get(b1) != parambF0) {
/*    */           b1++;
/*    */           continue;
/*    */         } 
/*    */         return b1;
/*    */       }  
/*    */     for (byte b = -1; b < i; ) {
/*    */       if (this.Fj0.get(b) != parambF0) {
/*    */         b++;
/*    */         continue;
/*    */       } 
/*    */       return b;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final bF0 getParent() {
/*    */     return this.break;
/*    */   }
/*    */   
/*    */   public final bF0 ly(int paramInt) {
/*    */     return this.Fj0.get(paramInt);
/*    */   }
/*    */   
/*    */   public final Q00 x0() {
/*    */     bF0 bF01 = this.break;
/*    */     while (true) {
/*    */       bF0 bF02;
/*    */       if ((bF02 = getParent()) == null)
/*    */         return (Q00)this; 
/*    */       bF01 = bF02;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final int ty0() {
/*    */     boolean bool;
/*    */     ArrayList arrayList;
/*    */     if ((arrayList = this.Fj0) != null) {
/*    */       bool = size();
/*    */     } else {
/*    */       bool = false;
/*    */     } 
/*    */     return bool;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qd0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */