/* 1 */ package f;public abstract class bO { public static byte[] R(byte[] paramArrayOfbyte) { int j = 0; int k, m; if ((m = paramArrayOfbyte[m = (k = paramArrayOfbyte.length) - 4] & 0xFF | (paramArrayOfbyte[m + 1] & 0xFF) << 8 | (paramArrayOfbyte[m + 2] & 0xFF) << 16 | (paramArrayOfbyte[m + 3] & Byte.MAX_VALUE) << 24) < 1) { n = m = 0; m = k; } else { if (k < 8) return null; 
/* 2 */       if ((n = paramArrayOfbyte[k - 5]) >= 8 && n <= 11) { if (k > n)
/* 3 */         { k -= n; int i5; if ((m = (i5 = k - (k = (paramArrayOfbyte[k -= 8] & 0xFF | (paramArrayOfbyte[k + 1] & 0xFF) << 8 | (paramArrayOfbyte[k + 2] & 0xFF) << 16 | (paramArrayOfbyte[k + 3] & Byte.MAX_VALUE) << 24) & 0xFFFFFF)) + k + m) <= 16777215) { n = k; k = i5;
/*   */              }
/*   */           
/*   */           else
/*   */           
/* 8 */           { throw new RuntimeException("blz decompression error"); }  } else { throw new RuntimeException("blz decompression error"); }  } else { throw new RuntimeException("blz decompression error"); }
/*   */        }
/*   */     
/*   */     int n;
/*   */     byte[] arrayOfByte;
/*   */     int i1, i2, i3;
/*   */     for (arrayOfByte = new byte[m], i1 = 0, i2 = 0, n = k + n, i3 = 0; i3 < k; ) {
/*   */       int i5 = i2 + 1, i6 = i1 + 1;
/*   */       arrayOfByte[i2] = paramArrayOfbyte[i1];
/*   */       i3++;
/*   */       i1 = i6;
/*   */       i2 = i5;
/*   */     } 
/*   */     int i4;
/*   */     for (i3 = n - 1, i4 = k; i4 < i3; ) {
/*   */       byte b = paramArrayOfbyte[i4];
/*   */       int i5 = i4 + 1;
/*   */       paramArrayOfbyte[i4] = paramArrayOfbyte[i3];
/*   */       i4 = i3 + -1;
/*   */       paramArrayOfbyte[i3] = b;
/*   */       i3 = i4;
/*   */       i4 = i5;
/*   */     } 
/*   */     for (i3 = 0; i2 < m; ) {
/*   */       if ((i3 >>>= 1) == 0) {
/*   */         if (i1 == n)
/*   */           break; 
/*   */         j = paramArrayOfbyte[i1++] & 0xFF;
/*   */         i3 = 128;
/*   */       } 
/*   */       if ((j & i3) == 0) {
/*   */         if (i1 == n)
/*   */           break; 
/*   */         i4 = i2 + 1;
/*   */         int i6 = i1 + 1;
/*   */         arrayOfByte[i2] = paramArrayOfbyte[i1];
/*   */         i1 = i6;
/*   */         i2 = i4;
/*   */         continue;
/*   */       } 
/*   */       if ((i4 = i1 + 1) >= n)
/*   */         break; 
/*   */       i1 = i4 + 1;
/*   */       int i5;
/*   */       if (i2 + (i5 = ((i4 = (paramArrayOfbyte[i1] & 0xFF) << 8 | paramArrayOfbyte[i4] & 0xFF) >>> 12) + 2 + 1) > m)
/*   */         i5 = m - i2; 
/*   */       for (i4 = (i4 & 0xFFF) + 3; i5-- > 0; ) {
/*   */         byte b = arrayOfByte[i2 - i4];
/*   */         arrayOfByte[i2++] = b;
/*   */       } 
/*   */     } 
/*   */     for (int i = m - k + k - 1; k < i; ) {
/*   */       j = arrayOfByte[k];
/*   */       m = k + 1;
/*   */       arrayOfByte[k] = arrayOfByte[i];
/*   */       k = i + -1;
/*   */       arrayOfByte[i] = j;
/*   */       i = k;
/*   */       k = m;
/*   */     } 
/*   */     return arrayOfByte; }
/*   */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bO.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */