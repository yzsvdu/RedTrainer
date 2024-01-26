/*  1 */ package f;public class Hn implements cF { public int Cs0 = -1; public final Xb0 nj0; public final long Ix0() { long l; float f = 1.0F; Xb0 xb0; if ((xb0 = this.nj0).jj0) { l = 0L; } else { int i; if ((i = xb0.VH(false)) == -1)
/*  2 */       { Xb0 xb01; int j = (xb01 = this.nj0).pX + 1;
/*  3 */         xb01.pX = j %= arrayOfHn.length; Hn hn, arrayOfHn[]; if ((hn = (arrayOfHn = this.nj0.o)[j]) != null) hn.stop();  xb01.o[xb01.pX] = this;
/*  4 */         i = this.nj0.VH(false); }
/*  5 */       else { Xb0 xb01; int k = (xb01 = this.nj0).pX + 1;
/*  6 */         int j = k % arrayOfHn.length; Hn[] arrayOfHn; (arrayOfHn = this.nj0.o)[j] = this; }  if (i == -1) { l = -1L; }
/*    */       else
/*    */       { long l1; Long long_;
/*  9 */         if ((long_ = (Long)this.nj0.lpT8.get(i)) != null) { l1 = long_.longValue(); } else { l1 = -1L; }
/* 10 */          AL10.alSourcei(i, 4105, this.Cs0); AL10.alSourcei(i, 4103, 0); AL10.alSourcef(i, 4106, l); AL10.alSourcePlay(i); l = l1; }  }  return l; } public Hn(Xb0 paramXb0) { this.nj0 = paramXb0; } public final void oK0(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) { byte b; int i = paramArrayOfbyte.length; int j = paramArrayOfbyte.length; if (paramInt1 > 1) { b = 4; } else { b = 2; }  (i -= j % b) / paramInt1 * 2; byteBuffer.order(ByteOrder.nativeOrder()); ByteBuffer byteBuffer; (byteBuffer = ByteBuffer.allocateDirect(i -= j % b)).put(paramArrayOfbyte, 0, i); ByteBuffer.allocateDirect(i -= j % b).flip(); if (this.Cs0 == -1) { char c; int k = AL10.alGenBuffers(); if (paramInt1 > 1) { c = 'ᄃ'; } else { c = 'ᄁ'; }  AL10.alBufferData(k, c, byteBuffer.asShortBuffer(), paramInt2); }  } public final void stop() { Xb0 xb0; boolean bool; if (bool = (xb0 = this.nj0).jj0) return;  int i = this.Cs0; if (!bool) { int j; for (bool = false, j = xb0.a10.mG0; bool < j; ) { int k; if (AL10.alGetSourcei(k = xb0.a10.Vl(bool), 4105) == i) { Long long_; if ((long_ = (Long)xb0.lpT8.remove(k)) != null) xb0.vI0.sH(long_.longValue());  AL10.alSourceStop(k); }  bool++; }  }  } public final long coM7(float paramFloat1, float paramFloat2, float paramFloat3) { long l = Ix0(); Xb0 xb02; Integer integer; if (!(xb02 = this.nj0).jj0 && (integer = (Integer)xb02.vI0.Ie(l)) != null) AL10.alSourcef(integer.intValue(), 4099, paramFloat2);  Xb0 xb01; if (!(xb01 = this.nj0).jj0) { LF0 lF0 = this.vI0; Object object = Integer.valueOf(-1); if (l == 0L) { if (this.B6) Object object1 = this.uv;  } else { int j; if ((j = Pw0(l)) >= 0) object = this.L8[j];  }
/* 11 */        int i; if ((i = ((Integer)object).intValue()) != -1) { float f1 = nx0.zN((paramFloat3 - 1.0F) * 1.5707964F), f2 = nx0.E70((paramFloat3 + 1.0F) * 1.5707964F); AL10.alSource3f(i, 4100, f1, 0.0F, f2); AL10.alSourcef(i, 4106, paramFloat1); }  }  return l; }
/*    */ 
/*    */   
/*    */   public final void dispose() {
/*    */     Xb0 xb0;
/*    */     boolean bool;
/*    */     if (bool = (xb0 = this.nj0).jj0)
/*    */       return; 
/*    */     int i;
/*    */     if ((i = this.Cs0) == -1)
/*    */       return; 
/*    */     if (!bool) {
/*    */       int j;
/*    */       for (bool = false, j = xb0.a10.mG0; bool < j; ) {
/*    */         int k;
/*    */         if (AL10.alGetSourcei(k = xb0.a10.Vl(bool), 4105) == i) {
/*    */           Long long_;
/*    */           if ((long_ = (Long)xb0.lpT8.remove(k)) != null)
/*    */             xb0.vI0.sH(long_.longValue()); 
/*    */           AL10.alSourceStop(k);
/*    */           AL10.alSourcei(k, 4105, 0);
/*    */         } 
/*    */         bool++;
/*    */       } 
/*    */     } 
/*    */     AL10.alDeleteBuffers(this.Cs0);
/*    */     this.Cs0 = -1;
/*    */     xb0 = this.nj0;
/*    */     bool = false;
/*    */     Hn[] arrayOfHn;
/*    */     while (bool < (arrayOfHn = xb0.o).length) {
/*    */       if (arrayOfHn[bool] == this)
/*    */         arrayOfHn[bool] = null; 
/*    */       bool++;
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void oC0() {
/*    */     Xb0 xb0;
/*    */     boolean bool;
/*    */     if (bool = (xb0 = this.nj0).jj0)
/*    */       return; 
/*    */     int i = this.Cs0;
/*    */     if (!bool) {
/*    */       int j;
/*    */       for (bool = false, j = xb0.a10.mG0; bool < j; ) {
/*    */         int k;
/*    */         if (AL10.alGetSourcei(k = xb0.a10.Vl(bool), 4105) == i)
/*    */           AL10.alSourcePause(k); 
/*    */         bool++;
/*    */       } 
/*    */     } 
/*    */   }
/*    */   
/*    */   public final void fE0(long paramLong, boolean paramBoolean) {
/*    */     Xb0 xb0;
/*    */     if ((xb0 = this.nj0).jj0)
/*    */       return; 
/*    */     Integer integer;
/*    */     if ((integer = (Integer)this.vI0.Ie(paramLong)) != null)
/*    */       AL10.alSourcei(intValue(), 4103, paramBoolean); 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Hn.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */