/* 1 */ package f;public final class oD { public oD(gD paramgD) { this.U = paramgD; ByteBuffer byteBuffer1 = paramgD.Vz().B8("/data/tmap_block.dat").l2(); int i = byteBuffer1.getInt(); ByteBuffer byteBuffer2; (byteBuffer2 = paramgD.Vz().B8("/data/tmap_flags.dat").l2()).getInt(); this.W90 = new LPT7[i]; ByteBuffer byteBuffer3 = paramgD.HB0(); LF.ps0(75301397, 1963133952, byteBuffer3); short[][] arrayOfShort; byte b2; for (arrayOfShort = new short[20][8], b2 = 0; b2 < 20; ) { for (byte b = 0; b < 8; ) { arrayOfShort[b2][b] = byteBuffer3.getShort(); b++; }  b2++; }  for (byte b1 = 0; b1 < i; ) { LPT7 lPT7; this(this, byteBuffer1, byteBuffer2); byte b; for (this.W90[b1] = lPT7, b = 0; b < 20; ) { LPT7 lPT71; short[] arrayOfShort1; if ((lPT71 = this.W90[b1]).bQ == (arrayOfShort1 = arrayOfShort[b])[3] && (b != 19 || lPT71.LK == 17) && (b != 14 || lPT71.LK == 18)) lPT71.a3(b, (short)(arrayOfShort1[7] + 2480));  b = (byte)(b + 1); }  b1++; }  if (byteBuffer1.remaining() != 0 || byteBuffer2.remaining() != 0) Jr
/* 2 */         .error(B40.df("PlatinumTownMap has more data to be read ").append(byteBuffer1.remaining()).append(" | ").append(byteBuffer2.remaining()).append(" !").toString());  }
/*   */ 
/*   */   
/*   */   public static final ik Jr = C00.gd(oD.class);
/*   */   public static final int[][] zE0;
/*   */   public gD U;
/*   */   public LPT7[] W90;
/*   */   
/*   */   static {
/*   */     int[][] arrayOfInt = new int[32][32];
/*   */     int[] arrayOfInt1;
/*   */     (arrayOfInt1 = (new int[32][32])[5])[26] = 1;
/*   */     (new int[32][32])[3][27] = 1;
/*   */     int[] arrayOfInt2;
/*   */     (arrayOfInt2 = (new int[32][32])[14])[16] = 1;
/*   */     (new int[32][32])[20][10] = 1;
/*   */     (new int[32][32])[25][14] = 1;
/*   */     arrayOfInt3[17] = 1;
/*   */     arrayOfInt1[16] = 4;
/*   */     arrayOfInt[19][13] = 6;
/*   */     arrayOfInt[17][20] = 6;
/*   */     arrayOfInt3[18] = 7;
/*   */     arrayOfInt1[28] = 7;
/*   */     arrayOfInt[1][22] = 2;
/*   */     (arrayOfInt1 = arrayOfInt[9])[23] = 2;
/*   */     arrayOfInt1[19] = 2;
/*   */     arrayOfInt[11][6] = 2;
/*   */     arrayOfInt[4][23] = 3;
/*   */     arrayOfInt2[21] = 3;
/*   */     arrayOfInt[21][18] = 3;
/*   */     arrayOfInt[18][25] = 3;
/*   */     int[] arrayOfInt3;
/*   */     (arrayOfInt3 = (new int[32][32])[26])[23] = 3;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/oD.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */