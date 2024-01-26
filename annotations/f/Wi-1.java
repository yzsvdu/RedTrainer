/* 1 */ package f;public final class Wi extends N50 { public final ZH ys0() { s40 s401 = this.cE0; int j = this.Zg0, k = this.Lc, n = this.Vl, i = this.gE0; ByteBuffer byteBuffer1; byte[] arrayOfByte = LF.sf(n, byteBuffer1 = s401.pr()); int i1; if ((i1 = this.eh) == 2) { i1 = 1; arrayOfByte[34] = 49; arrayOfByte[35] = 66; arrayOfByte[52] = -18; arrayOfByte[53] = 61; }  if (i1 == 3) { i1 = 1; arrayOfByte[34] = 0; arrayOfByte[35] = 0; arrayOfByte[52] = 0; arrayOfByte[53] = 0; }  ByteOrder byteOrder; ByteBuffer byteBuffer2 = ByteBuffer.wrap(arrayOfByte).order(byteOrder = ByteOrder.LITTLE_ENDIAN); this(1, i1 * 32, byteBuffer2); ZH zH; Wf wf; f1 f1; boolean bool; i1 = 128; this(j, 1, 1, 1, byteBuffer1); Uc uc = Uc.xi0; this(168, i1, uc); byteBuffer1.position(k); if (LF.va0(byteBuffer1, 1) > 0) { bool = true; } else { bool = false; }  if (bool) byteBuffer1 = ByteBuffer.wrap(LF.sf(k, byteBuffer1)).order(byteOrder);  int m; short s; for (k = 0, m = 0, s = byteBuffer1.getShort(); byteBuffer1.remaining() > 1 && (bool || s != 0); ) { byte b; int i2 = s & 0xFF, i3 = 64; if (wf
/* 2 */         .Qt == 1) { b = 2; } else { b = 1; }  i3 /= b; if (wf.Y4.length / i3 >= (i3 = i2 + i)) i2 = i3;  if ((s & 0x400) != 0) { i3 = 1; } else { i3 = 0; }  if ((s & 0x800) != 0) { s = 1; } else { s = 0; }  wf
/* 3 */         .COm5(zH, k, m, i2, f1, 0, i3, s); k = 0; if ((k += 8) >= 256 && (m += 8) >= i1) break;  }  return zH; }
/*   */ 
/*   */   
/*   */   public Wi(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, s40 params40) {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */