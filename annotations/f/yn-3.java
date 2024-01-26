/*  1 */ package f;public final class yn extends vO { public final void rf0(ByteBuffer paramByteBuffer) { int i = paramByteBuffer.position(); if ((this.RA & 0x20000000L) == 0L) { int j; paramByteBuffer.position(i + this.W2); long l; int k; if ((k = (int)(((l = this.RA) & 0xC0000000L) >> 29L)) == 0) k++;  if ((l & 0x10000000L) != 0L) { float[] arrayOfFloat; for (arrayOfFloat = new float[j = (int)((l & 0xFFFFL) / k)], k = 0; k < j; ) { arrayOfFloat[k] = dL.jv0(paramByteBuffer.getShort()); k++; }  this
/*  2 */           .bz = arrayOfFloat; }
/*  3 */       else { float[] arrayOfFloat; for (arrayOfFloat = new float[j = (int)((j & 0xFFFFL) / k)], k = 0; k < j; ) { arrayOfFloat[k] = paramByteBuffer.getInt() / 4096.0F; k++; }  this
/*  4 */           .bz = arrayOfFloat; }  }  if ((this.PL0 & 0x20000000L) == 0L) { int j; paramByteBuffer.position(i + this.gv); long l; int k; if ((k = (int)(((l = this.PL0) & 0xC0000000L) >> 29L)) == 0) k++;  if ((l & 0x10000000L) != 0L)
/*  5 */       { float[] arrayOfFloat; for (arrayOfFloat = new float[j = (int)((l & 0xFFFFL) / k)], k = 0; k < j; ) { arrayOfFloat[k] = dL.jv0(paramByteBuffer.getShort()); k++; }  this
/*  6 */           .lr0 = arrayOfFloat; }
/*  7 */       else { float[] arrayOfFloat; for (arrayOfFloat = new float[j = (int)((j & 0xFFFFL) / k)], k = 0; k < j; ) { arrayOfFloat[k] = paramByteBuffer.getInt() / 4096.0F; k++; }  this
/*  8 */           .lr0 = arrayOfFloat; }  }  if ((this.Q & 0x20000000L) == 0L) { paramByteBuffer.position(i + this.NU); long l; int k; if ((k = (int)(((l = this.Q) & 0xC0000000L) >> 29L)) == 0) k++;  int j;
/*  9 */       for (int[] arrayOfInt = new int[j = (int)((l & 0xFFFFL) / k)]; k < j; ) { arrayOfInt[k] = paramByteBuffer.getInt(); k++; }  }  if ((this
/* 10 */       .IA & 0x20000000L) == 0L) { int j; paramByteBuffer.position(i + this.Bl0); long l; int k; if ((k = (int)(((l = this.IA) & 0xC0000000L) >> 29L)) == 0) k++;  if ((l & 0x10000000L) != 0L)
/* 11 */       { float[] arrayOfFloat; for (arrayOfFloat = new float[j = (int)((l & 0xFFFFL) / k)], k = 0; k < j; ) { arrayOfFloat[k] = dL.jv0(paramByteBuffer.getShort()); k++; }  this
/* 12 */           .FH0 = arrayOfFloat; }
/* 13 */       else { float[] arrayOfFloat; for (arrayOfFloat = new float[j = (int)((j & 0xFFFFL) / k)], k = 0; k < j; ) { arrayOfFloat[k] = paramByteBuffer.getInt() / 4096.0F; k++; }  this
/* 14 */           .FH0 = arrayOfFloat; }  }  if ((this.de0 & 0x20000000L) == 0L) { int j; paramByteBuffer.position(i + this.sI); long l; int k; if ((k = (int)(((l = this.de0) & 0xC0000000L) >> 29L)) == 0) k++;  if ((l & 0x10000000L) != 0L)
/* 15 */       { float[] arrayOfFloat; for (arrayOfFloat = new float[j = (int)((l & 0xFFFFL) / k)], k = 0; k < j; ) { arrayOfFloat[k] = dL.jv0(paramByteBuffer.getShort()); k++; }  this
/* 16 */           .qk = arrayOfFloat; }
/* 17 */       else { float[] arrayOfFloat; for (arrayOfFloat = new float[j = (int)((j & 0xFFFFL) / k)], k = 0; k < j; ) { arrayOfFloat[k] = paramByteBuffer.getInt() / 4096.0F; k++; }  this
/* 18 */           .qk = arrayOfFloat; }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public int RA;
/*    */   public int W2;
/*    */   public int PL0;
/*    */   public int gv;
/*    */   public int Q;
/*    */   public int NU;
/*    */   public int IA;
/*    */   public int Bl0;
/*    */   public int de0;
/*    */   public int sI;
/*    */   public float[] bz;
/*    */   public float[] lr0;
/*    */   public float[] FH0;
/*    */   public float[] qk;
/*    */   
/*    */   public final void we0(ByteBuffer paramByteBuffer, int... paramVarArgs) {
/*    */     this.Vk = 0;
/*    */     this.RA = paramByteBuffer.getInt();
/*    */     this.W2 = paramByteBuffer.getInt();
/*    */     this.PL0 = paramByteBuffer.getInt();
/*    */     this.gv = paramByteBuffer.getInt();
/*    */     this.Q = paramByteBuffer.getInt();
/*    */     this.NU = paramByteBuffer.getInt();
/*    */     this.IA = paramByteBuffer.getInt();
/*    */     this.Bl0 = paramByteBuffer.getInt();
/*    */     this.de0 = paramByteBuffer.getInt();
/*    */     this.sI = paramByteBuffer.getInt();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/yn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */