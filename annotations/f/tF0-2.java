/* 1 */ package f;public final class tF0 { public final int rB(E7 paramE7) { int i = 0; paramE7.getClass(); int j = E7.e2[j]; cZ cZ1; int k, m = (j = (cZ1 = this.bz0).Pk0) + (k = paramE7.SJ); int n, i1; if ((n = paramE7.m60) + 4 >= (i1 = paramE7.zk) && 
/* 2 */       JO.Se0(m, 1, 8, n) >= i1) { j = -1; }
/* 3 */     else { byte[] arrayOfByte; int i2, i3 = ((arrayOfByte = paramE7.qJ0)[i2 = paramE7.UG] & 0xFF) >>> k; i3 |= (arrayOfByte[i2 + 1] & 0xFF) << 8 - k; i3 |= (arrayOfByte[i2 + 2] & 0xFF) << 16 - k; i3 |= (arrayOfByte[i2 + 3] & 0xFF) << 24 - k; if (m > 8 && m > 16 && m > 24 && m > 32 && k != 0) i3 |= (arrayOfByte[i2 + 4] & 0xFF) << 32 - k;  j &= i3; }
/* 4 */      paramE7
/* 5 */       .UG += j /= 8; paramE7.m60 = n + j; paramE7.SJ = (j = cZ1.KX[j] + k) & 0x7; if (j >= 0 && (i = cZ1.ml[j]) <= 0) return -i;  while (true) {
/* 6 */       if ((j = paramE7.m60) >= paramE7.zk) { k = -1; if (++paramE7.SJ > 7) { paramE7.SJ = 0; paramE7.UG++; paramE7.m60 = j + 1; }  } else { n = paramE7.qJ0[k = paramE7.UG] >> (m = paramE7.SJ) & 0x1; if ((paramE7.SJ = m + 1) > 7) { paramE7.SJ = 0; paramE7.UG = k + 1; paramE7.m60 = j + 1; }  k = n; }  if (k != 0) { if (k != 1) return -1; 
/* 7 */         i = cZ1.Sp[i]; } else { i = cZ1.Wn[i]; }  if (i <= 0) return -i; 
/*   */     }  }
/*   */ 
/*   */   
/*   */   public int PR;
/*   */   public int Rd;
/*   */   public Y8 YX = new Y8();
/*   */   public float[] eS;
/*   */   public cZ bz0;
/*   */   public int[] i80 = new int[15]; }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tF0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */