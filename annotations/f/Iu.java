/*  1 */ package f;public final class Iu implements Com9 { public final Ao Wu; public final FloatBuffer W50; public final ByteBuffer jM; public int MS; public final boolean WB0; public final int cC0; public boolean ce = false; public final void Dc(int paramInt1, int paramInt2, float[] paramArrayOffloat) { this.ce = true; if (this.WB0) { BufferUtils.BA0(paramArrayOffloat, this.jM, paramInt2, paramInt1); this.W50.position(0); this.W50.limit(paramInt2); } else { this.W50.clear(); this.W50.put(paramArrayOffloat, paramInt1, paramInt2); this.W50.flip(); this.jM.position(0); this.jM.limit(this.W50.limit() << 2); }  if (this.tA) { int i = this.jM.limit(); ByteBuffer byteBuffer = this.jM; UB0.re0.glBufferSubData(34962, 0, i, byteBuffer); this.ce = false; }  } public boolean tA = false; public Iu(boolean paramBoolean, int paramInt, lw0... paramVarArgs) { this(paramVarArgs); Ao ao; this(paramBoolean, paramInt, this); } public Iu(boolean paramBoolean, int paramInt, Ao paramAo) { this.Wu = paramAo; ByteBuffer byteBuffer = BufferUtils.ar(paramAo.Nb * paramInt); this.WB0 = true; if (paramBoolean) { paramInt = 35044; } else { paramInt = 35048; }  this.cC0 = paramInt; this.W50 = floatBuffer; this.MS = PK(); FloatBuffer floatBuffer; (floatBuffer = byteBuffer.asFloatBuffer()).flip(); byteBuffer.flip(); } public final Ao getAttributes() { return this.Wu; } public final int IH() { return this.W50.limit() * 4 / this.Wu.Nb; } public final int dE() { return this.jM.capacity() / this.Wu.Nb; } public final FloatBuffer w0() { this.ce = true; return this.W50; } public final void sm(Rm0 paramRm0, int[] paramArrayOfint) { byte b; hj0 hj0; (hj0 = UB0.re0).glBindBuffer(34962, this.MS); if (this.ce) { this.jM.limit(this.W50.limit() * 4); int j = this.jM.limit(); ByteBuffer byteBuffer = this.jM; int k = this.cC0; hj0.glBufferData(34962, j, byteBuffer, k); this.ce = false; }
/*  2 */      int i = this.Wu.rJ0.length; if (paramArrayOfint == null) { for (b = 0; b < i; )
/*    */       { lw0 lw0;
/*    */         
/*    */         int j;
/*  6 */         if ((j = paramRm0.I((lw0 = this.Wu.rJ0[b]).M8)) >= 0) { paramRm0.O1(j); int k = lw0.uj, m = lw0.We0; boolean bool = lw0.f3; int n = this.Wu.Nb, i1 = lw0.TZ;
/*  7 */           UB0.re0.glVertexAttribPointer(j, k, m, bool, n, i1); }  b++; }  } else { for (byte b1 = 0; b1 < i; )
/*    */       
/*    */       { 
/* 10 */         lw0 lw0 = this.Wu.rJ0[b1]; byte b2;
/* 11 */         if ((b2 = b[b1]) >= 0) { paramRm0.O1(b2); int j = lw0.uj, k = lw0.We0; boolean bool = lw0.f3; int m = this.Wu.Nb, n = lw0.TZ;
/* 12 */           UB0.re0.glVertexAttribPointer(b2, j, k, bool, m, n); }  b1++; }  }  this
/* 13 */       .tA = true; }
/*    */ 
/*    */   
/*    */   public final void bD0(Rm0 paramRm0, int[] paramArrayOfint) {
/*    */     byte b;
/*    */     hj0 hj0 = UB0.re0;
/*    */     int i = this.Wu.rJ0.length;
/*    */     if (paramArrayOfint == null) {
/*    */       for (b = 0; b < i; ) {
/*    */         paramRm0.Gu0((this.Wu.rJ0[b]).M8);
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
/*    */     this.tA = false;
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     UB0.re0.glBindBuffer(34962, 0);
/*    */     UB0.re0.glDeleteBuffer(this.MS);
/*    */     this.MS = 0;
/*    */   }
/*    */   
/*    */   public final int PK() {
/*    */     UB0.re0.glBindBuffer(34962, j);
/*    */     int i = this.jM.capacity();
/*    */     int j = this.cC0;
/*    */     UB0.re0.glBufferData(34962, i, null, j);
/*    */     UB0.re0.glBindBuffer(34962, 0);
/*    */     return j = UB0.re0.glGenBuffer();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Iu.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */