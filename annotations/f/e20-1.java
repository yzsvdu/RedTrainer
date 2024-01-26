/*  1 */ package f;public final class e20 extends XJ0 { public final void kr(int paramInt1, int paramInt2) { int i; boolean bool; if (!(bool = this.hS.sH0())) { byte b; for (bool = false, b = 0; b < paramInt2; ) { Na na = this.hS; int j = paramInt1 + b;
/*  2 */         i = na.W30[j].J50();
/*  3 */         this
/*  4 */           .mE0[j] = i; i = bool + (i = Math.max(na.fN * 2 + 1, i)); b++; }  if (i < this.hS.qF()) { i = 1; } else { i = 0; }  }  if (i != 0) {
/*  5 */       if (this.hS.W30 != null) { Ip ip; cr0 cr0; this();
/*  6 */         this(ip); j8[] arrayOfJ8; int k; byte b;
/*  7 */         for (k = (arrayOfJ8 = this.hS.W30).length, b = 0; b < k; ) { cr0.G90((arrayOfJ8[b]).VT); b++; }  int j = this.hS.qF(); cr0.bO(0, 0, j); }  for (i = 0; i < paramInt2; ) {
/*  8 */         int j = paramInt1 + i; j = (this.hS.W30[i]).am0; this.mE0[j] = 
/*  9 */           Math.max(this.hS.fN * 2 + 1, j);
/* 10 */         i++;
/*    */       } 
/*    */     }  }
/*    */ 
/*    */   
/*    */   public e20(Na paramNa) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/e20.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */