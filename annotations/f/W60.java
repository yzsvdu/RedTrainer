/* 1 */ package f;public final class W60 extends Random { public final void setSeed(long paramLong) { if (paramLong == 0L) paramLong = Long.MIN_VALUE;  long l = ((((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L ^ ((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L >>> 33L ^ (((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L ^ ((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L >>> 33L) >>> 33L) * -49064778989728563L ^ (((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L ^ ((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L >>> 33L ^ (((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L ^ ((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L >>> 33L) >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L ^ ((((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L ^ ((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L >>> 33L ^ (((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L ^ ((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L >>> 33L) >>> 33L) * -49064778989728563L ^ (((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L ^ ((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L >>> 33L ^ (((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L ^ ((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L >>> 33L) >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L >>> 33L; this.qL0 = ((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L ^ ((paramLong ^ paramLong >>> 33L) * -49064778989728563L ^ (paramLong ^ paramLong >>> 33L) * -49064778989728563L >>> 33L) * -4265267296055464877L >>> 33L; this.IL = l; }
/*   */ 
/*   */   
/*   */   public long qL0;
/*   */   public long IL;
/*   */   
/*   */   public W60() {
/*   */     setSeed((new Random()).nextLong());
/*   */   }
/*   */   
/*   */   public W60(long paramLong) {
/*   */     setSeed(paramLong);
/*   */   }
/*   */   
/*   */   public W60(long paramLong1, long paramLong2) {
/*   */     VN(paramLong1, paramLong2);
/*   */   }
/*   */   
/*   */   public final long nextLong() {
/*   */     long l1 = this.IL;
/*   */     this.IL = l2;
/*   */     long l2;
/*   */     return (l2 = (l2 = this.qL0 ^ this.qL0 << 23L) ^ l1 ^ l2 >>> 17L ^ l1 >>> 26L) + l1;
/*   */   }
/*   */   
/*   */   public final int next(int paramInt) {
/*   */     return (int)(nextLong() & (1L << paramInt) - 1L);
/*   */   }
/*   */   
/*   */   public final int nextInt() {
/*   */     return (int)nextLong();
/*   */   }
/*   */   
/*   */   public final int nextInt(int paramInt) {
/*   */     return (int)nextLong(paramInt);
/*   */   }
/*   */   
/*   */   public final long nextLong(long paramLong) {
/*   */     if (paramLong > 0L) {
/*   */       long l1;
/*   */       long l2;
/*   */       do {
/*   */         l2 = (nextLong() >>> 1L) - (l1 = (nextLong() >>> 1L) % paramLong);
/*   */       } while (paramLong - 1L + l2 < 0L);
/*   */       return l1;
/*   */     } 
/*   */     throw new IllegalArgumentException("n must be positive");
/*   */   }
/*   */   
/*   */   public final double nextDouble() {
/*   */     return (nextLong() >>> 11L) * 1.1102230246251565E-16D;
/*   */   }
/*   */   
/*   */   public final float nextFloat() {
/*   */     return (float)((nextLong() >>> 40L) * 5.9604644775390625E-8D);
/*   */   }
/*   */   
/*   */   public final boolean nextBoolean() {
/*   */     return ((nextLong() & 0x1L) != 0L);
/*   */   }
/*   */   
/*   */   public final void nextBytes(byte[] paramArrayOfbyte) {
/*   */     int i = paramArrayOfbyte.length;
/*   */     while (i != 0) {
/*   */       int j;
/*   */       if (i < 8) {
/*   */         j = i;
/*   */       } else {
/*   */         j = 8;
/*   */       } 
/*   */       long l;
/*   */       for (l = nextLong(); j-- != 0; l >>= 8L)
/*   */         paramArrayOfbyte[--i] = (byte)(int)l; 
/*   */     } 
/*   */   }
/*   */   
/*   */   public final void VN(long paramLong1, long paramLong2) {
/*   */     this.qL0 = paramLong1;
/*   */     this.IL = paramLong2;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/W60.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */