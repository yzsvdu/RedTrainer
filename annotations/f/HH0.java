/*  1 */ package f;public final class HH0 implements Com9 { public Ao eD0; public FloatBuffer oG; public ByteBuffer fq0; public boolean eZ; public int ws0; public int Kd; public boolean T30; public boolean Bo0; public final void Dc(int paramInt1, int paramInt2, float[] paramArrayOffloat) { this.T30 = true; BufferUtils.BA0(paramArrayOffloat, this.fq0, paramInt2, paramInt1); this.oG.position(0); this.oG.limit(paramInt2); if (this.Bo0) { int i = this.fq0.limit(); ByteBuffer byteBuffer = this.fq0; paramInt2 = this.Kd; UB0.re0.glBufferData(34962, i, byteBuffer, paramInt2); this.T30 = false; }  } public HH0(boolean paramBoolean, int paramInt, lw0... paramVarArgs) { this(paramVarArgs); Ao ao; this(paramBoolean, paramInt, this); } public HH0(boolean paramBoolean, int paramInt, Ao paramAo) { char c; this.T30 = false; this.Bo0 = false; this.ws0 = UB0.re0.glGenBuffer(); BufferUtils.xz(paramAo.Nb * paramInt).limit(0); KI(BufferUtils.xz(paramAo.Nb * paramInt), true, paramAo); if (paramBoolean) { c = '裤'; } else { c = '裨'; }  g70(c); } public HH0(int paramInt, ByteBuffer paramByteBuffer, boolean paramBoolean, Ao paramAo) { this.T30 = false; this.Bo0 = false; this.ws0 = UB0.re0.glGenBuffer(); KI(paramByteBuffer, paramBoolean, paramAo); g70(paramInt); } public final Ao getAttributes() { return this.eD0; } public final int IH() { return this.oG.limit() * 4 / this.eD0.Nb; } public final int dE() { return this.fq0.capacity() / this.eD0.Nb; } public final FloatBuffer w0() { this.T30 = true; return this.oG; } public final void KI(Buffer paramBuffer, boolean paramBoolean, Ao paramAo) { if (!this.Bo0) { ByteBuffer byteBuffer; if (this.eZ && (byteBuffer = this.fq0) != null) BufferUtils.lf(byteBuffer);  this.eD0 = paramAo; if (paramBuffer instanceof ByteBuffer) { this.fq0 = (ByteBuffer)paramBuffer; this.eZ = paramBoolean; int i = (paramBuffer = paramBuffer).limit(); this.fq0.limit(this.fq0.capacity()); this.oG = this.fq0.asFloatBuffer(); this.fq0.limit(i); this.oG.limit(i / 4); return; }  throw new JU("Only ByteBuffer is currently supported"); }  throw new JU("Cannot change attributes while VBO is bound"); } public final void g70(int paramInt) { if (!this.Bo0) { this.Kd = paramInt; return; }  throw new JU("Cannot change usage while VBO is bound"); } public final void sm(Rm0 paramRm0, int[] paramArrayOfint) { byte b; hj0 hj0; (hj0 = UB0.re0).glBindBuffer(34962, this.ws0); if (this.T30) { this.fq0.limit(this.oG.limit() * 4); int j = this.fq0.limit(); ByteBuffer byteBuffer = this.fq0; int k = this.Kd; hj0.glBufferData(34962, j, byteBuffer, k); this.T30 = false; }
/*  2 */      int i = this.eD0.rJ0.length; if (paramArrayOfint == null) { for (b = 0; b < i; )
/*    */       { lw0 lw0;
/*    */         
/*    */         int j;
/*  6 */         if ((j = paramRm0.I((lw0 = this.eD0.rJ0[b]).M8)) >= 0) { paramRm0.O1(j); int k = lw0.uj, m = lw0.We0; boolean bool = lw0.f3; int n = this.eD0.Nb, i1 = lw0.TZ;
/*  7 */           UB0.re0.glVertexAttribPointer(j, k, m, bool, n, i1); }  b++; }  } else { for (byte b1 = 0; b1 < i; )
/*    */       
/*    */       { 
/* 10 */         lw0 lw0 = this.eD0.rJ0[b1]; byte b2;
/* 11 */         if ((b2 = b[b1]) >= 0) { paramRm0.O1(b2); int j = lw0.uj, k = lw0.We0; boolean bool = lw0.f3; int m = this.eD0.Nb, n = lw0.TZ;
/* 12 */           UB0.re0.glVertexAttribPointer(b2, j, k, bool, m, n); }  b1++; }  }  this
/* 13 */       .Bo0 = true; }
/*    */ 
/*    */   
/*    */   public final void bD0(Rm0 paramRm0, int[] paramArrayOfint) {
/*    */     byte b;
/*    */     hj0 hj0 = UB0.re0;
/*    */     int i = this.eD0.rJ0.length;
/*    */     if (paramArrayOfint == null) {
/*    */       for (b = 0; b < i; ) {
/*    */         paramRm0.Gu0((this.eD0.rJ0[b]).M8);
/*    */         b++;
/*    */       } 
/*    */     } else {
/*    */       for (byte b1 = 0; b1 < i; ) {
/*    */         byte b2;
/*    */         if ((b2 = b[b1]) >= 0) {
/*    */           paramRm0.getClass();
/*    */           UB0.re0.glDisableVertexAttribArray(b2);
/*    */         } 
/*    */         b1++;
/*    */       } 
/*    */     } 
/*    */     hj0.glBindBuffer(34962, 0);
/*    */     this.Bo0 = false;
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     UB0.re0.glBindBuffer(34962, 0);
/*    */     UB0.re0.glDeleteBuffer(this.ws0);
/*    */     this.ws0 = 0;
/*    */     if (this.eZ)
/*    */       BufferUtils.lf(this.fq0); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HH0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */