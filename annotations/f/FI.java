/*  1 */ package f;public final class FI extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put((byte)this.d4); byte b = 0; while (b < this
/*  2 */       .d4) { p50 p501; paramByteBuffer
/*    */         
/*  4 */         .put((p501 = this.LpT3[b + this.Kf0]).Lz);
/*    */       
/*  6 */       paramByteBuffer.put(p501.I1); if (p501
/*  7 */         .Lz == 1) { paramByteBuffer
/*    */ 
/*    */           
/* 10 */           .put((byte)p501.ME.size());
/*    */         
/* 12 */         for (Iterator iterator = p501.ME.iterator(); iterator.hasNext();) paramByteBuffer
/*    */             
/* 14 */             .put(((p50)iterator.next()).I1);  }  b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public p50[] LpT3;
/*    */   public int Kf0;
/*    */   public int d4;
/*    */   
/*    */   public FI(p50[] paramArrayOfp50, int paramInt1, int paramInt2) {
/*    */     super(166);
/*    */     this.LpT3 = paramArrayOfp50;
/*    */     this.Kf0 = paramInt1;
/*    */     this.d4 = paramInt2;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/FI.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */