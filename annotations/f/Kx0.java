/*  1 */ package f;public final class Kx0 extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put(this.Lpt4); paramByteBuffer
/*    */ 
/*    */       
/*  4 */       .put(this.dj0.HC0);
/*    */     
/*  6 */     paramByteBuffer.put(this.ML);
/*    */     
/*  8 */     paramByteBuffer.putShort(this.MK);
/*    */     
/* 10 */     paramByteBuffer.put((byte)this.u7.length); sK[] arrayOfSK; int i; byte b;
/* 11 */     for (i = (arrayOfSK = this.u7).length, b = 0; b < i; ) { this[b].K10(paramByteBuffer); b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public byte Lpt4;
/*    */   public Te dj0;
/*    */   public byte ML;
/*    */   public short MK;
/*    */   public sK[] u7;
/*    */   
/*    */   public Kx0(byte paramByte1, Te paramTe, byte paramByte2, short paramShort, sK... paramVarArgs) {
/*    */     super(155);
/*    */     this.Lpt4 = paramByte1;
/*    */     this.dj0 = paramTe;
/*    */     this.ML = paramByte2;
/*    */     this.MK = paramShort;
/*    */     this.u7 = paramVarArgs;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Kx0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */