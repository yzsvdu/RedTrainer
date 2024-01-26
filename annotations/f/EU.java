/* 1 */ package f;public abstract class EU extends zi0 { public void Id(int paramInt) { this.JO[paramInt] = 2; this.ir0 = paramInt = this.ir0 - 1; int i = this.Vh0 - 1; if (this.Q0 != 0.0F && !this.IC && i <= 0) {
/* 2 */       paramInt = Math.max(paramInt + 1, Yr0.Fg(paramInt / this.ri0) + 1); int[] arrayOfInt;
/* 3 */       if ((paramInt = Arrays.binarySearch(arrayOfInt = gF.yv, paramInt)) < 0) paramInt = -paramInt - 1; 
/* 4 */       Hj0(arrayOfInt[paramInt]); this
/* 5 */         .qm = Math.min(paramInt - 1, (int)(paramInt * this.ri0)); this.Mj = (paramInt = FH()) - (paramInt = this.ir0); float f; int j;
/* 6 */       if ((j = (f = this.Q0) cmp 0.0F) != 0 && j != 0) this
/* 7 */           .Vh0 = (int)(paramInt * f + 0.5F); 
/*   */     }  }
/*   */ 
/*   */   
/*   */   public static final long serialVersionUID = 1L;
/*   */   public transient byte[] JO;
/*   */   
/*   */   public EU() {}
/*   */   
/*   */   public EU(int paramInt) {
/*   */     this(paramInt, 0);
/*   */   }
/*   */   
/*   */   public EU(int paramInt1, int paramInt2) {
/*   */     int i = Math.max(1, paramInt1);
/*   */     this.ri0 = 0.5F;
/*   */     J00(Yr0.Fg(i / 0.5F));
/*   */   }
/*   */   
/*   */   public final int FH() {
/*   */     return this.JO.length;
/*   */   }
/*   */   
/*   */   public int J00(int paramInt) {
/*   */     int arrayOfInt[], j;
/*   */     if ((j = Arrays.binarySearch(arrayOfInt = gF.yv, paramInt)) < 0)
/*   */       j = -j - 1; 
/*   */     this.qm = Math.min(i - 1, (int)(i * this.ri0));
/*   */     int i;
/*   */     this.Mj = (i = arrayOfInt[j]) - this.ir0;
/*   */     float f;
/*   */     if ((f = this.Q0) != 0.0F)
/*   */       this.Vh0 = (int)(paramInt * f + 0.5F); 
/*   */     this.JO = new byte[i];
/*   */     return i;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/EU.class
 * Java compiler version: 5 (49.0)
 * JD-Core Version:       1.1.3
 */