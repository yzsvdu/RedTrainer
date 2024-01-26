/*    */ package f;public final class tl implements Com9 { public final void sm(Rm0 paramRm0, int[] paramArrayOfint) { byte b;
/*  2 */     int i = this.HP.rJ0.length;
/*  3 */     this.Jv.limit(this.an.limit() * 4); if (paramArrayOfint == null) { for (b = 0; b < i; )
/*    */       { lw0 lw0;
/*    */         int j;
/*  6 */         if ((j = paramRm0.I((lw0 = this.HP.rJ0[b]).M8)) >= 0) { int k, m; boolean bool; int n; ByteBuffer byteBuffer; paramRm0.O1(j); if (lw0.We0 == 5126) { this.an.position(lw0.TZ / 4); k = lw0.uj; m = lw0.We0; bool = lw0.f3; n = this.HP.Nb; FloatBuffer floatBuffer = this.an; }
/*  7 */           else { this
/*  8 */               .Jv.position(k.TZ); k = k.uj; m = k.We0; bool = k.f3; n = this.HP.Nb; byteBuffer = this.Jv; }  UB0.re0.glVertexAttribPointer(j, k, m, bool, n, byteBuffer); }  b++; }  } else { for (byte b1 = 0; b1 < i; ) {
/*    */         
/* 10 */         lw0 lw0 = this.HP.rJ0[b1]; byte b2;
/* 11 */         if ((b2 = b[b1]) >= 0) { int j, k; boolean bool; int m; ByteBuffer byteBuffer; paramRm0.O1(b2); if (lw0.We0 == 5126) { this.an.position(lw0.TZ / 4); j = lw0.uj; k = lw0.We0; bool = lw0.f3; m = this.HP.Nb; FloatBuffer floatBuffer = this.an; }
/* 12 */           else { this
/* 13 */               .Jv.position(j.TZ); j = j.uj; k = j.We0; bool = j.f3; m = this.HP.Nb; byteBuffer = this.Jv; }  UB0.re0.glVertexAttribPointer(b2, j, k, bool, m, byteBuffer); }  b1++;
/*    */       }  }
/*    */      }
/*    */ 
/*    */   
/*    */   public final Ao HP;
/*    */   public final FloatBuffer an;
/*    */   public final ByteBuffer Jv;
/*    */   
/*    */   public tl(int paramInt, lw0... paramVarArgs) {
/*    */     this(paramVarArgs);
/*    */     Ao ao;
/*    */     this(paramInt, this);
/*    */   }
/*    */   
/*    */   public tl(int paramInt, Ao paramAo) {
/*    */     this.HP = paramAo;
/*    */     (this.an = (this.Jv = BufferUtils.xz(paramAo.Nb * paramInt)).asFloatBuffer()).flip();
/*    */     BufferUtils.xz(paramAo.Nb * paramInt).flip();
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     BufferUtils.lf(this.Jv);
/*    */   }
/*    */   
/*    */   public final FloatBuffer w0() {
/*    */     return this.an;
/*    */   }
/*    */   
/*    */   public final int IH() {
/*    */     return this.an.limit() * 4 / this.HP.Nb;
/*    */   }
/*    */   
/*    */   public final int dE() {
/*    */     return this.Jv.capacity() / this.HP.Nb;
/*    */   }
/*    */   
/*    */   public final void Dc(int paramInt1, int paramInt2, float[] paramArrayOffloat) {
/*    */     BufferUtils.BA0(paramArrayOffloat, this.Jv, paramInt2, paramInt1);
/*    */     this.an.position(0);
/*    */     this.an.limit(paramInt2);
/*    */   }
/*    */   
/*    */   public final void bD0(Rm0 paramRm0, int[] paramArrayOfint) {
/*    */     byte b;
/*    */     int i = this.HP.rJ0.length;
/*    */     if (paramArrayOfint == null) {
/*    */       for (b = 0; b < i; ) {
/*    */         paramRm0.Gu0((this.HP.rJ0[b]).M8);
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
/*    */   }
/*    */   
/*    */   public final Ao getAttributes() {
/*    */     return this.HP;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tl.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */