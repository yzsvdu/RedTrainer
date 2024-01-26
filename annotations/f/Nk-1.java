/* 1 */ package f;public final class Nk { public final void aB0(s40 params40) { if (params40 == null || params40.in() != 1) return;  ByteBuffer byteBuffer2 = params40.pr(); ByteBuffer byteBuffer1; (byteBuffer1 = params40.pr())
/* 2 */       .position(params40.wJ.nz(uq.Ya)); params40.pr().getInt(); int i = pN.tx0(params40.pr().getInt()); byte[][] arrayOfByte = new byte[43][5]; params40.pr().position(pN.tx0(params40.pr().getInt())); int j; for (j = 0; j < 43; ) { int k; if (pN.pk0(k = byteBuffer1.getInt())) { byteBuffer2.position(pN.tx0(k)); for (k = 0; k < 5; ) { arrayOfByte[j][k] = (byte)(byteBuffer2.get() + 1); k++; }  }  j++; }  byteBuffer1.position(i); for (i = 0; i < 43; ) { if (pN.pk0(j = byteBuffer1.getInt())) { byteBuffer2.position(pN.tx0(j)); int arrayOfInt1[], arrayOfInt2[], k; for (arrayOfInt1 = new int[9], arrayOfInt2 = new int[9], k = 0; k < 9; ) { arrayOfInt1[k] = pN.tx0(byteBuffer2.getInt()); arrayOfInt2[k] = byteBuffer2.getShort() & 0xFFFF; byteBuffer2.getShort(); k++; }  for (k = 0; k < 9; )
/* 3 */         { G00 g00 = G00.Av0;
/* 4 */           byte b = params40.in(); f1 f1;
/*   */           int m;
/* 6 */           if ((f1 = ((f1[])g00.ib0.Ha0(b))[arrayOfByte[i][(m = k + 1) / 2]]) != null)
/* 7 */           { U70 u70; int n = arrayOfInt1[k], i1 = arrayOfInt2[k] / 2 / 8 / 4; this(new DC(n, i1, params40, f1)); this.dm0[i][k] = u70; }  k = m; }  }  i++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public static Nk mS = new Nk();
/*   */   public U70[][] dm0 = new U70[43][9]; }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */