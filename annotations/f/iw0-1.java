/*  1 */ package f;public final class iw0 { public tA0[] WG0; public static iw0 BE0(T7 paramT7) { this(); iw0 iw01; ByteBuffer byteBuffer; if (paramT7.rb(false)
/*  2 */       .getInt((byteBuffer = paramT7.rb(false)).position()) == 1397768480) { s = 1; } else { s = 0; }  if (!s) return null;  byteBuffer
/*  3 */       .getInt(); byteBuffer.getInt(); byteBuffer.getShort(); short s = byteBuffer.getShort(); byteBuffer.getInt(); byteBuffer.getInt(); byteBuffer.getInt(); int i = byteBuffer.getInt(); byteBuffer.getInt(); byteBuffer.position(); byteBuffer.position(i); for (iw01.WG0 = new tA0[s], i = 0; i < s; )
/*  4 */     { this(); byteBuffer.position(); byteBuffer.getInt(); tA01.Ht0 = (byte)((byteBuffer.getShort() & 0xFFFF) >> 0 & 0x7); byte b1 = (byte)((byteBuffer.getShort() & 0xFFFF) >> 4 & 0x7), b2 = (byte)((byteBuffer.getShort() & 0xFFFF) >> 8 & 0x7); tA01.XV = 8 << b1; tA01.dK = 8 << b2; byteBuffer.get(); byteBuffer.get(); byteBuffer.getInt(); short s1 = byteBuffer.getShort(); byteBuffer.getShort(); byteBuffer.getInt(); byteBuffer.getShort(); byteBuffer.getShort(); byteBuffer.getInt(); tA0 tA01; byte[] arrayOfByte = new byte[byteBuffer.getInt()]; (new tA0()).hx = new byte[s1]; byteBuffer.get(arrayOfByte); byteBuffer.get(tA01.hx); iw01.WG0[i] = tA01;
/*  5 */       i++; }  return iw01; }
/*    */ 
/*    */   
/*    */   public final ZH VW(int paramInt) {
/*    */     tA0[] arrayOfTA0;
/*    */     if ((arrayOfTA0 = this.WG0).length <= paramInt || paramInt < 0)
/* 11 */       return null;  tA0 tA01; byte[] arrayOfByte; int j, arrayOfInt[], k; for (ByteBuffer byteBuffer = ByteBuffer.wrap(arrayOfByte = (tA01 = this[paramInt]).hx).order(ByteOrder.LITTLE_ENDIAN); k < arrayOfByte.length / 2; ) { short s; arrayOfInt[k] = (((s = byteBuffer.getShort()) & 0x1F) * 8 & 0xFF) << 16 | 0xFF000000 | (((s & 0x3E0) >> 5) * 8 & 0xFF) << 8 | ((s & 0x7C00) >> 10) * 8 & 0xFF; k++; }  int i = this.XV; k = this.dK; this(i, k, Uc.xi0); ZH zH; (new ZH()).r1(y1.Zj); if ((i = this.Ht0) == 6) { for (i = 0; i < this.dK; ) { int m; for (k = 0; k < (m = this.XV); ) { m = i * m + k; m = (m >> 3) * 8; byte[] arrayOfByte1; int n; if ((arrayOfByte1 = this.uS).length > m && (n = (m = arrayOfByte1[m]) & 0x7) < j) { m = (m = m << 24 | arrayOfInt[n] & 0xFFFFFF) << 8 | m >>> 24; zH.Con.YO(k, i, m); }  k++; }  i++; }  } else if (i == 1) { i = 0; while (i < this.dK) { int m; for (k = 0; k < (m = this.XV); ) { m = i * m + k; byte[] arrayOfByte1; int n; if ((arrayOfByte1 = this.uS).length > m && (n = (m = arrayOfByte1[m]) & 0x1F) < j) { m = (m >> 5) * 4; m = (m = (((m >> 5) / 2 + m) * 8 | ((m >> 5) / 2 + m) * 8 >> 5) << 24 | arrayOfInt[n] & 0xFFFFFF) << 8 | m >>> 24; zH.Con.YO(k, i, m); }  k++; }  i++; }  } else if (i == 3) { for (this.uS = o40.TD0(this.uS), arrayOfInt[0] = 0, i = 0; i < this.dK; ) { int m; for (k = 0; k < (m = this.XV); ) { m = i * m + k; byte[] arrayOfByte1; if ((arrayOfByte1 = this.uS).length > m && (m = arrayOfByte1[m] & 0xFF) < j) { m = (m = arrayOfInt[m]) << 8 | m >>> 24; zH.Con.YO(k, i, m); }  k++; }  i++; }  } else { tA0.au0.info(B40.df("unk aps texture format = ").append(this.Ht0).toString()); }  return zH;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/iw0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */