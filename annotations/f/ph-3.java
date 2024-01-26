/*  1 */ package f;public final class ph extends mL { public final void sM() { this
/*  2 */       .nl0 = this.Ws.get();
/*    */     
/*  4 */     this.cJ0 = this.Ws.getShort();
/*    */     
/*  6 */     this.Dr0 = this.Ws.get();
/*    */     byte b;
/*  8 */     for (this.ta0 = this.Ws.getShort(), this.jb = au(), this.bj = new b60[R00()], b = 0; b < this.bj.length; ) {
/*    */       b60 b601;
/*    */       
/* 11 */       this(this.Ws.getInt(), this.Ws.getShort()); int i; byte b1; for (i = R00(), b1 = 0; b1 < i; ) { GS gS; if ((gS = tl()) != null) b601
/* 12 */             .JX.add(gS);  b1++; }  this
/* 13 */         .bj[b] = b601; b++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public byte nl0;
/*    */   public byte Dr0;
/*    */   public short cJ0;
/*    */   public short ta0;
/*    */   public String jb;
/*    */   public b60[] bj;
/*    */   
/*    */   public ph(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramByteBuffer, paramc4);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     Gp0 gp0;
/*    */     if ((gp0 = km.MR) != null) {
/*    */       Mq mq;
/*    */       byte b1 = this.nl0;
/*    */       short s1 = this.cJ0;
/*    */       byte b2 = this.Dr0;
/*    */       short s2 = this.ta0;
/*    */       String str = this.jb;
/*    */       b60[] arrayOfB60 = this.bj;
/*    */       this(b1, s1, b2, s2, str, arrayOfB60);
/*    */       gp0.W.add(mq);
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ph.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */