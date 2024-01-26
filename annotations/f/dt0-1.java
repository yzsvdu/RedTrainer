/*  1 */ package f;public final class dt0 extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put((byte)this.wo.length); byte b = 0; Qv0[] arrayOfQv0; while (b < (
/*  2 */       arrayOfQv0 = this.wo).length) { paramByteBuffer
/*    */         
/*  4 */         .put((arrayOfQv0[b].lK()).Cl0);
/*    */       
/*  6 */       paramByteBuffer.putShort(this.wo[b].fH0());
/*    */ 
/*    */       
/*  9 */       paramByteBuffer.put((this.AJ0[b].lK()).Cl0);
/*    */       
/* 11 */       paramByteBuffer.putShort(this.AJ0[b].fH0()); b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public Qv0[] wo;
/*    */   public Qv0[] AJ0;
/*    */   
/*    */   public dt0(Qv0[] paramArrayOfQv01, Qv0[] paramArrayOfQv02) {
/*    */     super(9);
/*    */     this.wo = paramArrayOfQv01;
/*    */     this.AJ0 = paramArrayOfQv02;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/dt0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */