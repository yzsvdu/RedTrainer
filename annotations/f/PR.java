/*  1 */ package f;public final class PR extends N50 { public final ZH ys0() { int i = this.tm0;
/*  2 */     i = this.iZ.N50 / 2 / 8;
/*    */     
/*  4 */     int j = this.iZ.bk / 4;
/*    */     
/*  6 */     ByteBuffer byteBuffer = this.iZ.s20.pr(); ZH zH1 = (new Wf(i, i, j, 1, byteBuffer)).wQ(this.ML);
/*    */     
/*  8 */     int k = this.Con.ju * 2;
/*    */     
/* 10 */     int m = this.Con.Og0 / 2; Uc uc = TU(); this(k, m, uc); ZH zH2; for (k = 0; k < 4; ) { m = k % 2 * 64; int n = k / 2 * 32, i1 = k * 32; zH2
/* 11 */         .Con.nM(this.Con, 0, i1, m, n, 64, 32); k++; }
/* 12 */      dispose();
/*    */     return zH2; }
/*    */ 
/*    */   
/*    */   public PR(Cs paramCs, int paramInt, f1 paramf1) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/PR.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */