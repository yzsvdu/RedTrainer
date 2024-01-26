/*  1 */ package f;public final class LA extends Kl0 { public final void sM() { this
/*  2 */       .Ma0 = this.Ws.getInt(); byte b;
/*    */     int[] arrayOfInt1, arrayOfInt2;
/*  4 */     for (this.PO = arrayOfInt1 = new int[this.Ws.get()], this.aF = new int[arrayOfInt1.length], this.PB = new LPT1[arrayOfInt1.length], b = 0; b < (arrayOfInt2 = this.PO).length; ) { arrayOfInt2[b] = this
/*  5 */         .Ws.getInt();
/*  6 */       this.aF[b] = this
/*  7 */         .Ws.getInt();
/*    */       
/*  9 */       if ((this.Ws.get() == 1)) this
/* 10 */           .PB[b] = Ac();  b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public int Ma0;
/*    */   public int[] PO;
/*    */   public int[] aF;
/*    */   public LPT1[] PB;
/*    */   
/*    */   public LA(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     R8 r8 = km.u4;
/*    */     int i = this.Ma0, arrayOfInt1[] = this.PO, arrayOfInt2[] = this.aF;
/*    */     LPT1[] arrayOfLPT1 = this.PB;
/*    */     pA pA;
/*    */     if ((pA = this.YG0.MH0) != null) {
/*    */       Fq0 fq0;
/*    */       B10();
/*    */       this(this, i, arrayOfInt1, arrayOfInt2, arrayOfLPT1);
/*    */       this.so0 = new Fq0();
/*    */       J8(fq0);
/*    */       this.so0.mM();
/*    */       this.so0.ME(km.wI0.dG() / 2 - this.so0.xY / 2, km.wI0.k1() / 2 - this.so0.HC / 2);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LA.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */