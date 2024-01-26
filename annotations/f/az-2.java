/*  1 */ package f;public final class az extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { zJ0 zJ01; if ((zJ01 = this.jv).B != null) { paramByteBuffer
/*  2 */         .put((byte)0);
/*    */ 
/*    */ 
/*    */       
/*  6 */       paramByteBuffer.putInt(this.jv.B.Mg0);
/*    */ 
/*    */       
/*  9 */       paramByteBuffer.put(this.jv.rr0); return; }
/* 10 */      DK[] arrayOfDK = zJ01.As;
/* 11 */     byte[] arrayOfByte = zJ01.ni;
/*    */     
/* 13 */     paramByteBuffer.put((byte)this.length); byte b = 0; while (b < this.length) {
/* 14 */       paramByteBuffer
/*    */         
/* 16 */         .put((this[b]).tl0);
/*    */       
/* 18 */       paramByteBuffer.put(arrayOfByte[b]); b++;
/*    */     }  }
/*    */ 
/*    */   
/*    */   public zJ0 jv;
/*    */   
/*    */   public az(zJ0 paramzJ0) {
/*    */     super(72);
/*    */     this.jv = paramzJ0;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/az.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */