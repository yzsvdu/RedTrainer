/*  1 */ package f;public final class br extends Kl0 { public final void sM() { byte b; pr[] arrayOfPr; for (this.Rm = new pr[R00()], b = 0; b < (arrayOfPr = this.Rm).length; ) { this
/*  2 */         .Ws.getInt();
/*    */ 
/*    */       
/*  5 */       byte b1 = this.Ws.get();
/*  6 */       float f = this.Ws.getFloat();
/*  7 */       short s = this.Ws.getShort();
/*  8 */       byte b2 = this.Ws.get();
/*  9 */       int i = this.Ws.getInt(), j = this.Ws.getInt(); arrayOfPr[b] = new pr(DK.com4(this.Ws.get()), b1, f, s, b2, i, j);
/*    */       
/* 11 */       b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public pr[] Rm;
/*    */   
/*    */   public br(c4 paramc4, ByteBuffer paramByteBuffer) {
/*    */     super(paramc4, paramByteBuffer);
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     EJ0 eJ0 = (r8()).wG;
/*    */     getClass();
/*    */     pr[] arrayOfPr;
/*    */     int i;
/*    */     byte b;
/*    */     for (i = (arrayOfPr = this.Rm).length, b = 0; b < i; ) {
/*    */       pr pr1 = arrayOfPr[b];
/*    */       byte b1 = pr1.zK.tl0;
/*    */       this.wS.put(Integer.valueOf(pr1.xZ * 16 + b1), pr1);
/*    */       b++;
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/br.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */