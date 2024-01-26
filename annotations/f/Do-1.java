/*  1 */ package f;public final class Do extends Bi { public final void mL(c4 paramc4, ByteBuffer paramByteBuffer) { paramByteBuffer.put((byte)this.ZI); if (this
/*  2 */       .N90 == null) return;  for (byte b = 0; b < this.ZI; ) { p50 p501; paramByteBuffer
/*    */         
/*  4 */         .put((p501 = this.N90[b + this.zs]).Lz);
/*    */       
/*  6 */       e6.Ti(p501.qg, paramByteBuffer);
/*    */       
/*  8 */       e6.Ti(p501.TH0, paramByteBuffer);
/*  9 */       if (p501.Lz == 1) { paramByteBuffer
/*    */ 
/*    */           
/* 12 */           .put((byte)p501.ME.size());
/*    */         
/* 14 */         for (Iterator iterator = p501.ME.iterator(); iterator.hasNext();)
/*    */         {
/* 16 */           e6.Ti(((p50)iterator.next()).qg, paramByteBuffer); }  }  b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public p50[] N90;
/*    */   public int zs;
/*    */   public int ZI;
/*    */   
/*    */   public Do(p50[] paramArrayOfp50, int paramInt1, int paramInt2) {
/*    */     super(167);
/*    */     this.N90 = paramArrayOfp50;
/*    */     this.zs = paramInt1;
/*    */     this.ZI = paramInt2;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Do.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */