/*  1 */ package f;public final class u20 implements Com9 { public static final IntBuffer lPt4 = BufferUtils.mt0(1); public final Ao yr; public final FloatBuffer gq0; public final ByteBuffer aZ; public final boolean RE; public int r00; public final int oG; public boolean Je0; public boolean yO; public final void Dc(int paramInt1, int paramInt2, float[] paramArrayOffloat) { this.Je0 = true; BufferUtils.BA0(paramArrayOffloat, this.aZ, paramInt2, paramInt1); this.gq0.position(0); this.gq0.limit(paramInt2); if (this.yO) { UB0.re0.glBindBuffer(34962, this.r00); int i = this.aZ.limit(); ByteBuffer byteBuffer = this.aZ; paramInt2 = this.oG; UB0.re0.glBufferData(34962, i, byteBuffer, paramInt2); this.Je0 = false; }  } public int cj; public o0 bl; public u20(boolean paramBoolean, int paramInt, lw0... paramVarArgs) { this(paramVarArgs); Ao ao; this(paramBoolean, paramInt, this); } public u20(boolean paramBoolean, int paramInt, Ao paramAo) { char c; this.Je0 = false; this.yO = false; this.cj = -1; this.bl = new o0(); this.yr = paramAo; this.gq0 = floatBuffer; this.RE = true; FloatBuffer floatBuffer; (floatBuffer = (this.aZ = BufferUtils.xz(paramAo.Nb * paramInt)).asFloatBuffer()).flip(); BufferUtils.xz(paramAo.Nb * paramInt).flip(); this.r00 = UB0.re0.glGenBuffer(); if (paramBoolean) { c = '裤'; } else { c = '裨'; }  this.oG = c; zm0(); } public u20(boolean paramBoolean, ByteBuffer paramByteBuffer, Ao paramAo) { char c; this.Je0 = false; this.yO = false; this.cj = -1; this.bl = new o0(); this.yr = paramAo; this.aZ = paramByteBuffer; this.RE = false; (this.gq0 = paramByteBuffer.asFloatBuffer()).flip(); paramByteBuffer.flip(); this.r00 = UB0.re0.glGenBuffer(); if (paramBoolean) { c = '裤'; } else { c = '裨'; }  this.oG = c; zm0(); } public final Ao getAttributes() { return this.yr; } public final int IH() { return this.gq0.limit() * 4 / this.yr.Nb; } public final int dE() { return this.aZ.capacity() / this.yr.Nb; } public final FloatBuffer w0() { this.Je0 = true; return this.gq0; } public final void sm(Rm0 paramRm0, int[] paramArrayOfint) { int j; ib ib; (ib = UB0.Je).yy0(this.cj); int i; if ((i = this.bl.mG0) != 0) { j = 1; } else { j = 0; }
/*    */     
/*  3 */     int k = this.yr.rJ0.length; if (j) if (paramArrayOfint == null) { for (i = 0; j && i < k; ) { if (paramRm0
/*    */ 
/*    */ 
/*    */             
/*  7 */             .I((this.yr.rJ0[i]).M8) == this.bl.Vl(i)) { j = 1; } else { j = 0; }  i++; }  } else { if (paramArrayOfint.length == i) { i = 1; } else { i = 0; }  for (j = i = j = 0; j != 0 && i < k; ) { if (paramArrayOfint[i] == this.bl.Vl(i)) { j = 1; } else { j = 0; }  i++; }  }   if (j == 0) { UB0.go.glBindBuffer(34962, this.r00);
/*  8 */       if (this.bl.mG0 != 0)
/*    */       {
/* 10 */         for (i = this.yr.rJ0.length, j = 0; j < i; ) {
/* 11 */           int m; if ((m = this.bl.Vl(j)) >= 0) { paramRm0.getClass();
/* 12 */             UB0.re0.glDisableVertexAttribArray(m); }  j++;
/* 13 */         }  }  for (this.bl
/* 14 */         .mG0 = 0, i = 0; i < k; )
/*    */       
/*    */       { 
/* 17 */         lw0 lw0 = this.yr.rJ0[i]; if (paramArrayOfint == null) { this
/* 18 */             .bl.oU(paramRm0.I(lw0.M8)); } else { this.bl.oU(paramArrayOfint[i]); }  int m; if ((m = this.bl.Vl(i)) >= 0) { paramRm0.O1(m); int n = lw0.uj, i1 = lw0.We0; boolean bool = lw0.f3; int i2 = this.yr.Nb, i3 = lw0.TZ;
/* 19 */           UB0.re0.glVertexAttribPointer(m, n, i1, bool, i2, i3); }  i++; }  }  if (this
/* 20 */       .Je0) { ib.glBindBuffer(34962, this.r00); this.aZ.limit(this.gq0.limit() * 4); int m = this.aZ.limit(); ByteBuffer byteBuffer = this.aZ; int n = this.oG; ib.glBufferData(34962, m, byteBuffer, n); this.Je0 = false; }  this
/* 21 */       .yO = true; }
/*    */ 
/*    */   
/*    */   public final void bD0(Rm0 paramRm0, int[] paramArrayOfint) {
/*    */     UB0.Je.yy0(0);
/*    */     this.yO = false;
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     UB0.Je.glBindBuffer(34962, 0);
/*    */     UB0.Je.glDeleteBuffer(this.r00);
/*    */     this.r00 = 0;
/*    */     if (this.RE)
/*    */       BufferUtils.lf(this.aZ); 
/*    */     if (this.cj != -1) {
/*    */       intBuffer.clear();
/*    */       IntBuffer intBuffer;
/*    */       (intBuffer = lPt4).put(this.cj);
/*    */       lPt4.flip();
/*    */       UB0.Je.Qu0(intBuffer);
/*    */       this.cj = -1;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void zm0() {
/*    */     IntBuffer intBuffer;
/*    */     (intBuffer = lPt4).clear();
/*    */     UB0.Je.Vl(this);
/*    */     this.cj = lPt4.get();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/u20.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */