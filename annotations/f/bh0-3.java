/* 1 */ package f;public final class bh0 extends C30 { public final void Ht(tH paramtH) { C30[] arrayOfC30; int i; byte b; for (i = (arrayOfC30 = this.Hk).length, b = 0; b < i; ) { int j = this.ec; arrayOfC30[b]
/*   */         
/* 3 */         .KT(paramtH, j, this.hv); b++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public C30[] Hk;
/*   */   
/*   */   public bh0(C30[] paramArrayOfC30) {
/*   */     this.Hk = paramArrayOfC30;
/*   */     if (paramArrayOfC30.length > 0) {
/*   */       int i = paramArrayOfC30[0].tr0();
/*   */       PG0(i, paramArrayOfC30[0].ce0());
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void KT(JX paramJX, int paramInt1, int paramInt2) {
/*   */     C30[] arrayOfC30;
/*   */     int i = (arrayOfC30 = this.Hk).length;
/*   */     for (byte b = 0; b < i; b++)
/*   */       this[b].KT(paramJX, paramInt1, paramInt2); 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bh0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */