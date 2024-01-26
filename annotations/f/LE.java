/*  1 */ package f;public abstract class LE implements s70 { public static final byte[] as = new byte[40960]; public static final ByteBuffer JE0 = BufferUtils.createByteBuffer(40960); public G3 tE0; public final Xb0 Lpt8; public IntBuffer Yx0; public int TO; public int U30; public int Jy; public final void Ix0() { Xb0 xb0; if ((xb0 = this.Lpt8).jj0) return;  if (this.TO == -1) { if ((this.TO = xb0.VH(true)) == -1) return;  this.Lpt8.uH.Com3(this); this.Yx0 = BufferUtils.createIntBuffer(3); AL10.alGetError(); AL10.alGenBuffers(this.Yx0); byte b; if (this.Yx0 != null || (b = AL10.alGetError()) == 0)
/*  2 */       { AL10.alSourcei(this.TO, 4103, 0); float f = this.Wm; ci0(f, this.mg); AL10.alGetError(); int i; for (b = 0; b < 3 && xb0(i = this.Yx0.get(b)); ) { AL10.alSourceQueueBuffers(this.TO, i); b++; }  if (AL10.alGetError() != 0) { stop(); return; }  } else { throw new JU(XD0.SD0("Unable to allocate audio buffers. AL Error: ", b)); }  }  if (!this.SL0) { AL10.alSourcePlay(this.TO); this.SL0 = true; }  } public boolean yf0; public boolean SL0; public float mg; public float Wm; public float Da0; public final RD0 hS; public LE(Xb0 paramXb0, RD0 paramRD0) { G3 g3; this(3); this.tE0 = this; this.TO = -1; this.mg = 1.0F; this.Wm = 0.0F; this.Lpt8 = paramXb0; this.hS = paramRD0; } public final void NZ(int paramInt1, int paramInt2) { char c; if (paramInt1 > 1) { c = 'ᄃ'; } else { c = 'ᄁ'; }  this.U30 = c; this.Jy = paramInt2; this.Da0 = 40960.0F / (paramInt1 * 2 * paramInt2); } public final void stop() { Xb0 xb0; if ((xb0 = this.Lpt8).jj0) return;  if (this.TO == -1) return;  xb0.uH.Ct(this, true); j30(); xb0 = this.Lpt8; int i = this.TO; if (!xb0.jj0) { AL10.alSourceStop(i); AL10.alSourcei(i, 4105, 0); Long long_; if ((long_ = (Long)xb0.lpT8.remove(i)) != null) xb0.vI0.sH(long_.longValue());  xb0.a10.oU(i); }  this
/*  3 */       .TO = -1; this.tE0
/*  4 */       .NB0 = 0;
/*  5 */     this.SL0 = false; } public final void oC0() { if (this.Lpt8.jj0) return;  int i; if ((i = this.TO) != -1) AL10.alSourcePause(i);  this.SL0 = false; } public final boolean OH0() { return this.Lpt8.jj0 ? false : ((this.TO == -1) ? false : this.SL0); } public final boolean xb0(int paramInt) { float f1; ByteBuffer byteBuffer; (byteBuffer = JE0).clear(); byte[] arrayOfByte; int i; if ((i = DG(arrayOfByte = as)) <= 0) if (this.yf0) { NV(); if ((i = DG(arrayOfByte)) <= 0) return false;  G3 g31; int k; if ((k = (g31 = this.tE0).NB0) > 0) { k = 0; f1 = 0.0F; if (k > 0) { g31.By0[k] = f1; } else { throw new IndexOutOfBoundsException(HB0.DH0("index can't be >= size: ", k, " >= ").append(g31.NB0).toString()); }  }  } else { return false; }   G3 g3; int j; if ((j = (g3 = this.tE0).NB0) > 0) { if (j != 0) { f1 = g3.By0[0]; } else { throw new IllegalStateException("Array is empty."); }  } else { f1 = 0.0F; }
/*  6 */      byte b = 0; float f2 = this.Da0 * i / 40960.0F + f1; if (j >= 0) { float[] arrayOfFloat; if (j == (
/*  7 */         arrayOfFloat = g3.By0).length) arrayOfFloat = g3.Jd0(Math.max(8, (int)(j * 1.75F)));  if (g3.bK0) { j = g3.NB0 - b; System.arraycopy(arrayOfFloat, b, arrayOfFloat, 1, j); } else { j = g3.NB0; arrayOfFloat[j] = arrayOfFloat[b]; }  g3.NB0++; arrayOfFloat[b] = f2; byteBuffer
/*  8 */         .put(arrayOfByte, 0, i).flip(); int k = this.U30; paramInt = this.Jy; AL10.alBufferData(paramInt, k, byteBuffer, paramInt); return true; }
/*  9 */      throw new IndexOutOfBoundsException(
/* 10 */         HB0.DH0("index can't be > size: ", b, " > ")
/* 11 */         .append(g3.NB0).toString()); }
/*    */ 
/*    */   
/*    */   public final void B9(boolean paramBoolean) {
/*    */     this.yf0 = paramBoolean;
/*    */   }
/*    */   
/*    */   public final void vf0(float paramFloat) {
/*    */     if (paramFloat >= 0.0F) {
/*    */       this.mg = paramFloat;
/*    */       if (this.Lpt8.jj0)
/*    */         return; 
/*    */       int i;
/*    */       if ((i = this.TO) != -1)
/*    */         AL10.alSourcef(i, 4106, paramFloat); 
/*    */       return;
/*    */     } 
/*    */     throw new IllegalArgumentException("volume cannot be < 0: " + paramFloat);
/*    */   }
/*    */   
/*    */   public final void ci0(float paramFloat1, float paramFloat2) {
/*    */     this.mg = paramFloat2;
/*    */     this.Wm = paramFloat1;
/*    */     if (this.Lpt8.jj0)
/*    */       return; 
/*    */     int i;
/*    */     if ((i = this.TO) == -1)
/*    */       return; 
/*    */     float f = nx0.zN((paramFloat1 - 1.0F) * 1.5707964F);
/*    */     paramFloat1 = nx0.E70((paramFloat1 + 1.0F) * 1.5707964F);
/*    */     AL10.alSource3f(i, 4100, f, 0.0F, paramFloat1);
/*    */     AL10.alSourcef(this.TO, 4106, paramFloat2);
/*    */   }
/*    */   
/*    */   public abstract int DG(byte[] paramArrayOfbyte);
/*    */   
/*    */   public abstract void j30();
/*    */   
/*    */   public void NV() {
/*    */     j30();
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     stop();
/*    */     if (this.Lpt8.jj0)
/*    */       return; 
/*    */     IntBuffer intBuffer;
/*    */     if ((intBuffer = this.Yx0) == null)
/*    */       return; 
/*    */     AL10.alDeleteBuffers(intBuffer);
/*    */     this.Yx0 = null;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LE.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */