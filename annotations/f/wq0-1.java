/*  1 */ package f;public final class wq0 { public final void k7(int paramInt1, int paramInt2) { AT aT; if (bq0()) return;  (nuL(paramInt1, paramInt2)).F4 = true; if (d20()) { R8 r8 = km.u4; dL0 dL0 = dL0.My0; byte b = (byte)this.yY; int k = 0; v50[] arrayOfV50; int m; byte b1;
/*  2 */       for (m = (arrayOfV50 = this.r50).length, b1 = 0; b1 < m; ) { v50 v501; int n; if ((v501 = arrayOfV50[b1]).F4 && (n = v501.Ua0) > 0) if (!k) { k = n; } else { k *= n; }   b1++; }  r8
/*  3 */         .FL(dL0, b, (short)k);
/*  4 */       int i = (aT = this.com9).qZ;
/*  5 */       int j = this.com9.s3; if (this.com9.Nl0.d20()) { if (((this.Nl0.Yg() + 1 > 7) ? (j + 1) : 0) > 4) { i = 8; } else if (i < 8) { i++; }  } else { i = Math.max(Math.min(this.Nl0.Yg(), i), 1); }  if (i == 8)
/*  6 */         km.u4
/*  7 */           .FL(dL0, (byte)-8, (short)0);  }
/*  8 */     else if (((wq0)super).com9
/*  9 */       .zc0
/* 10 */       .By0()) { km.u4
/* 11 */         .FL(dL0.My0, (byte)-9, (short)0); }
/*    */      }
/*    */ 
/*    */   
/*    */   public int yY;
/*    */   public AT com9;
/*    */   public v50[] r50;
/*    */   
/*    */   public wq0(int paramInt, AT paramAT) {
/*    */     V6 v6;
/*    */     this.yY = Math.min(Math.max(1, paramInt), 8);
/*    */     this.com9 = paramAT;
/*    */     this.r50 = new v50[25];
/*    */     v50[] arrayOfV50;
/*    */     for (byte b1 = 0; b1 < (arrayOfV50 = this.r50).length; b1++) {
/*    */       v50 v501;
/*    */       this();
/*    */       arrayOfV50[b1] = v501;
/*    */     } 
/*    */     this();
/*    */     int[] arrayOfInt = (int[])xi0.k9((Object[])nR.nn[paramInt - 1]);
/*    */     for (byte b2 = 0; b2 < 3; b2++) {
/*    */       for (byte b = 0; b < arrayOfInt[b2]; b++) {
/*    */         int i;
/*    */         do {
/*    */         
/*    */         } while (!v6.uX(i = xi0.qX(25)));
/*    */         (this.r50[i]).Ua0 = (b2 + 2) % 4;
/*    */       } 
/*    */     } 
/*    */     arrayOfInt[3];
/*    */   }
/*    */   
/*    */   public final v50 nuL(int paramInt1, int paramInt2) {
/*    */     return this.r50[paramInt1 * 5 + paramInt2];
/*    */   }
/*    */   
/*    */   public final int Yg() {
/*    */     byte b1 = 0;
/*    */     v50[] arrayOfV50;
/*    */     int i = (arrayOfV50 = this.r50).length;
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       v50 v501;
/*    */       if ((v501 = arrayOfV50[b2]).F4 && v501.Ua0 > 0)
/*    */         b1++; 
/*    */     } 
/*    */     return b1;
/*    */   }
/*    */   
/*    */   public final boolean d20() {
/*    */     v50[] arrayOfV50;
/*    */     int i = (arrayOfV50 = this.r50).length;
/*    */     for (byte b = 0; b < i; b++) {
/*    */       v50 v501;
/*    */       if (!(v501 = this[b]).F4 && v501.Ua0 > 1)
/*    */         return false; 
/*    */     } 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final boolean bq0() {
/*    */     v50[] arrayOfV50;
/*    */     int i = (arrayOfV50 = this.r50).length;
/*    */     for (byte b = 0; b < i; b++) {
/*    */       v50 v501;
/*    */       if ((v501 = arrayOfV50[b]).F4 && v501.Ua0 == 0)
/*    */         return true; 
/*    */     } 
/*    */     return d20();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wq0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */