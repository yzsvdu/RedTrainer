/*  1 */ package f;public final class oV extends a10 { public final void sM() { this
/*  2 */       .LPt7 = this.Ws.get();
/*    */     
/*  4 */     this.UN = this.Ws.get();
/*    */     
/*  6 */     this.Yt = this.Ws.get();
/*    */     
/*  8 */     this.bh = this.Ws.get(); byte b; if ((b = this.LPt7) == 2) { for (this.tQ = new j40[R00()], b = 0; b < this.tQ.length; ) { j40 j401; this(0); q90
/*    */           
/* 10 */           .Cw0 = this.Ws.getShort();
/*    */         Q90 q90;
/* 12 */         (q90 = new Q90()).ld0 = this.Ws.getShort();
/* 13 */         this(q90); this.tQ[b] = j401; b++; }  return; }  if (b != 0) return;  j40[] arrayOfJ40; for (this.tQ = new j40[R00()], b = 0; b < (arrayOfJ40 = this.tQ).length; ) {
/* 14 */       j40 j401; this(vy0()); arrayOfJ40[b] = j401;
/* 15 */       b++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public byte LPt7;
/*    */   public byte UN;
/*    */   public byte Yt;
/*    */   public byte bh;
/*    */   public j40[] tQ = null;
/*    */   
/*    */   public oV(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramByteBuffer, paramc4);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     ro ro = r8();
/*    */     byte b1 = this.LPt7, b2 = this.UN, b3 = this.Yt, b4 = this.bh;
/*    */     j40[] arrayOfJ40 = this.tQ;
/*    */     pA pA;
/*    */     if ((pA = ((R8)this).YG0.MH0) != null) {
/*    */       tR tR;
/*    */       if ((tR = this.yI0) != null) {
/*    */         tR.ra0();
/*    */         this.yI0 = null;
/*    */       } 
/*    */       this(this, b1, b2, b3, b4, arrayOfJ40);
/*    */       this.yI0 = new tR();
/*    */       J8(tR);
/*    */       this.yI0.mM();
/*    */       this.yI0.ME(km.wI0.dG() / 2 - this.yI0.xY / 2, km.wI0.k1() / 2 - this.yI0.HC / 2);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oV.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */