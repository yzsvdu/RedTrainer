/*  1 */ package f;public final class Ym0 { public final String toString() { this(200); String str1; StringBuffer stringBuffer; String str4, str3, str2; (new StringBuffer()).append("Layer "); int k; if ((k = this.f0) != 1) { if (k != 2) { if (k != 3) { str4 = null; } else { str4 = "III"; }  } else { str4 = "II"; }  } else { str4 = "I"; }  stringBuffer
/*  2 */       .append(str4); stringBuffer.append(" frame ");
/*  3 */     switch (this.kb0) { default: str4 = null; break;case 3: str4 = "Single channel"; break;case 2: str4 = "Dual channel"; break;case 1: str4 = "Joint stereo"; break;case 0: str4 = "Stereo"; break; }  stringBuffer
/*  4 */       .append(str4); stringBuffer.append(' '); int j;
/*  5 */     if ((j = this.OB) != 0) { if (j != 1) { if (j != 2) { str3 = null; } else { str3 = "MPEG-2.5 LSF"; }  } else { str3 = "MPEG-1"; }  } else { str3 = "MPEG-2 LSF"; }  stringBuffer
/*  6 */       .append(str3);
/*  7 */     if (!((this.rq == 0) ? 1 : 0)) stringBuffer
/*  8 */         .append(" no");  stringBuffer.append(" checksums"); stringBuffer.append(' '); int i;
/*  9 */     if ((i = this.x70) != 0) { if (i != 1) { if (i != 2) { str2 = null; } else if ((i = this.OB) == 1) { str2 = "32 kHz"; } else if (str2 == null) { str2 = "16 kHz"; } else { str2 = "8 kHz"; }  } else if ((i = this.OB) == 1) { str2 = "48 kHz"; } else if (str2 == null) { str2 = "24 kHz"; } else { str2 = "12 kHz"; }  } else if ((i = this.OB) == 1) { str2 = "44.1 kHz"; } else if (str2 == null) { str2 = "22.05 kHz"; } else { str2 = "11.025 kHz"; }  stringBuffer
/* 10 */       .append(str2); stringBuffer.append(','); stringBuffer.append(' ');
/* 11 */     if (this.Tm == true) { StringBuilder stringBuilder; float f2; this();
/* 12 */       float f1 = (this.Lq * 8); if (bool == true)
/*    */       
/*    */       { 
/* 15 */         double d = this.OD[this.f0];
/* 16 */         int[][] arrayOfInt = bH; d /= arrayOfInt[m][this.x70]; int m; if ((m = this.OB) == 0 || m == 2) d /= 2.0D;  f2 = (float)(d * 1000.0D); }
/* 17 */       else { float[] arrayOfFloat; (arrayOfFloat = new float[3])[0] = 8.707483F; (new float[3])[1] = 8.0F; (new float[3])[2] = 12.0F; (new float[3][])[0] = arrayOfFloat; (arrayOfFloat = new float[3])[0] = 26.12245F; (new float[3])[1] = 24.0F; (new float[3])[2] = 36.0F; (new float[3][])[1] = arrayOfFloat; (arrayOfFloat = new float[3])[0] = 26.12245F; (new float[3])[1] = 24.0F; (new float[3])[2] = 36.0F; (new float[3][])[2] = arrayOfFloat; f2 = (new float[3][])[this.f0 - 1][this.x70]; }
/*    */        boolean bool;
/* 19 */       str1 = stringBuilder.append(Integer.toString((((bool = this.Tm) == true) ? ((int)(f1 / f2 * this.Y3) * 1000) : Da[this.OB][this.f0 - 1][this.Dw0]) / 1000)).append(" kb/s").toString(); } else { str1 = Hl0[((Ym0)super).OB][((Ym0)super).f0 - 1][((Ym0)super).Dw0]; }  stringBuffer
/* 20 */       .append(this); return stringBuffer.toString(); }
/*    */ 
/*    */   
/*    */   public static final int[][] bH;
/*    */   public static final int[][][] Da;
/*    */   public static final String[][][] Hl0;
/*    */   public int f0;
/*    */   public int rq;
/*    */   public int Dw0;
/*    */   public int Mh0;
/*    */   public int OB;
/*    */   public int kb0;
/*    */   public int x70;
/*    */   public int hh;
/*    */   public int ne0;
/*    */   public double[] OD;
/*    */   public boolean Tm;
/*    */   public int Y3;
/*    */   public int Lq;
/*    */   public byte[] k3;
/*    */   public byte coM4;
/*    */   public ls0 vw0;
/*    */   public short U30;
/*    */   public int Ln0;
/*    */   public int eb0;
/*    */   
/*    */   public Ym0() {
/*    */     double[] arrayOfDouble;
/*    */     (arrayOfDouble = new double[4])[0] = -1.0D;
/*    */     (new double[4])[1] = 384.0D;
/*    */     (new double[4])[2] = 1152.0D;
/*    */     (new double[4])[3] = 1152.0D;
/*    */     this.OD = this;
/*    */     this.coM4 = 0;
/*    */   }
/*    */   
/*    */   static {
/*    */     int[] arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 22050;
/*    */     (new int[4])[1] = 24000;
/*    */     (new int[4])[2] = 16000;
/*    */     (new int[4])[3] = 1;
/*    */     (new int[3][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 44100;
/*    */     (new int[4])[1] = 48000;
/*    */     (new int[4])[2] = 32000;
/*    */     (new int[4])[3] = 1;
/*    */     (new int[3][])[1] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[4])[0] = 11025;
/*    */     (new int[4])[1] = 12000;
/*    */     (new int[4])[2] = 8000;
/*    */     (new int[4])[3] = 1;
/*    */     bH = new int[][] { null, null, arrayOfInt1 };
/*    */     int[] arrayOfInt2;
/*    */     (arrayOfInt2 = new int[16])[0] = 0;
/*    */     (new int[16])[1] = 32000;
/*    */     (new int[16])[2] = 48000;
/*    */     (new int[16])[3] = 56000;
/*    */     (new int[16])[4] = 64000;
/*    */     (new int[16])[5] = 80000;
/*    */     (new int[16])[6] = 96000;
/*    */     (new int[16])[7] = 112000;
/*    */     (new int[16])[8] = 128000;
/*    */     (new int[16])[9] = 144000;
/*    */     (new int[16])[10] = 160000;
/*    */     (new int[16])[11] = 176000;
/*    */     (new int[16])[12] = 192000;
/*    */     (new int[16])[13] = 224000;
/*    */     (new int[16])[14] = 256000;
/*    */     (new int[16])[15] = 0;
/*    */     int[][] arrayOfInt;
/*    */     (arrayOfInt = new int[3][])[0] = arrayOfInt2;
/*    */     (arrayOfInt2 = new int[16])[0] = 0;
/*    */     (new int[16])[1] = 8000;
/*    */     (new int[16])[2] = 16000;
/*    */     (new int[16])[3] = 24000;
/*    */     (new int[16])[4] = 32000;
/*    */     (new int[16])[5] = 40000;
/*    */     (new int[16])[6] = 48000;
/*    */     (new int[16])[7] = 56000;
/*    */     (new int[16])[8] = 64000;
/*    */     (new int[16])[9] = 80000;
/*    */     (new int[16])[10] = 96000;
/*    */     (new int[16])[11] = 112000;
/*    */     (new int[16])[12] = 128000;
/*    */     (new int[16])[13] = 144000;
/*    */     (new int[16])[14] = 160000;
/*    */     (new int[16])[15] = 0;
/*    */     (new int[3][])[1] = arrayOfInt2;
/*    */     (arrayOfInt2 = new int[16])[0] = 0;
/*    */     (new int[16])[1] = 8000;
/*    */     (new int[16])[2] = 16000;
/*    */     (new int[16])[3] = 24000;
/*    */     (new int[16])[4] = 32000;
/*    */     (new int[16])[5] = 40000;
/*    */     (new int[16])[6] = 48000;
/*    */     (new int[16])[7] = 56000;
/*    */     (new int[16])[8] = 64000;
/*    */     (new int[16])[9] = 80000;
/*    */     (new int[16])[10] = 96000;
/*    */     (new int[16])[11] = 112000;
/*    */     (new int[16])[12] = 128000;
/*    */     (new int[16])[13] = 144000;
/*    */     (new int[16])[14] = 160000;
/*    */     (new int[16])[15] = 0;
/*    */     (new int[3][])[2] = arrayOfInt2;
/*    */     (new int[3][][])[0] = arrayOfInt;
/*    */     (arrayOfInt2 = new int[16])[0] = 0;
/*    */     (new int[16])[1] = 32000;
/*    */     (new int[16])[2] = 64000;
/*    */     (new int[16])[3] = 96000;
/*    */     (new int[16])[4] = 128000;
/*    */     (new int[16])[5] = 160000;
/*    */     (new int[16])[6] = 192000;
/*    */     (new int[16])[7] = 224000;
/*    */     (new int[16])[8] = 256000;
/*    */     (new int[16])[9] = 288000;
/*    */     (new int[16])[10] = 320000;
/*    */     (new int[16])[11] = 352000;
/*    */     (new int[16])[12] = 384000;
/*    */     (new int[16])[13] = 416000;
/*    */     (new int[16])[14] = 448000;
/*    */     (new int[16])[15] = 0;
/*    */     (arrayOfInt = new int[3][])[0] = arrayOfInt2;
/*    */     (arrayOfInt2 = new int[16])[0] = 0;
/*    */     (new int[16])[1] = 32000;
/*    */     (new int[16])[2] = 48000;
/*    */     (new int[16])[3] = 56000;
/*    */     (new int[16])[4] = 64000;
/*    */     (new int[16])[5] = 80000;
/*    */     (new int[16])[6] = 96000;
/*    */     (new int[16])[7] = 112000;
/*    */     (new int[16])[8] = 128000;
/*    */     (new int[16])[9] = 160000;
/*    */     (new int[16])[10] = 192000;
/*    */     (new int[16])[11] = 224000;
/*    */     (new int[16])[12] = 256000;
/*    */     (new int[16])[13] = 320000;
/*    */     (new int[16])[14] = 384000;
/*    */     (new int[16])[15] = 0;
/*    */     (new int[3][])[1] = arrayOfInt2;
/*    */     (arrayOfInt2 = new int[16])[0] = 0;
/*    */     (new int[16])[1] = 32000;
/*    */     (new int[16])[2] = 40000;
/*    */     (new int[16])[3] = 48000;
/*    */     (new int[16])[4] = 56000;
/*    */     (new int[16])[5] = 64000;
/*    */     (new int[16])[6] = 80000;
/*    */     (new int[16])[7] = 96000;
/*    */     (new int[16])[8] = 112000;
/*    */     (new int[16])[9] = 128000;
/*    */     (new int[16])[10] = 160000;
/*    */     (new int[16])[11] = 192000;
/*    */     (new int[16])[12] = 224000;
/*    */     (new int[16])[13] = 256000;
/*    */     (new int[16])[14] = 320000;
/*    */     (new int[16])[15] = 0;
/*    */     (new int[3][])[2] = arrayOfInt2;
/*    */     (new int[3][][])[1] = arrayOfInt;
/*    */     (arrayOfInt2 = new int[16])[0] = 0;
/*    */     (new int[16])[1] = 32000;
/*    */     (new int[16])[2] = 48000;
/*    */     (new int[16])[3] = 56000;
/*    */     (new int[16])[4] = 64000;
/*    */     (new int[16])[5] = 80000;
/*    */     (new int[16])[6] = 96000;
/*    */     (new int[16])[7] = 112000;
/*    */     (new int[16])[8] = 128000;
/*    */     (new int[16])[9] = 144000;
/*    */     (new int[16])[10] = 160000;
/*    */     (new int[16])[11] = 176000;
/*    */     (new int[16])[12] = 192000;
/*    */     (new int[16])[13] = 224000;
/*    */     (new int[16])[14] = 256000;
/*    */     (new int[16])[15] = 0;
/*    */     (arrayOfInt = new int[3][])[0] = arrayOfInt2;
/*    */     (arrayOfInt2 = new int[16])[0] = 0;
/*    */     (new int[16])[1] = 8000;
/*    */     (new int[16])[2] = 16000;
/*    */     (new int[16])[3] = 24000;
/*    */     (new int[16])[4] = 32000;
/*    */     (new int[16])[5] = 40000;
/*    */     (new int[16])[6] = 48000;
/*    */     (new int[16])[7] = 56000;
/*    */     (new int[16])[8] = 64000;
/*    */     (new int[16])[9] = 80000;
/*    */     (new int[16])[10] = 96000;
/*    */     (new int[16])[11] = 112000;
/*    */     (new int[16])[12] = 128000;
/*    */     (new int[16])[13] = 144000;
/*    */     (new int[16])[14] = 160000;
/*    */     (new int[16])[15] = 0;
/*    */     (new int[3][])[1] = arrayOfInt2;
/*    */     (arrayOfInt2 = new int[16])[0] = 0;
/*    */     (new int[16])[1] = 8000;
/*    */     (new int[16])[2] = 16000;
/*    */     (new int[16])[3] = 24000;
/*    */     (new int[16])[4] = 32000;
/*    */     (new int[16])[5] = 40000;
/*    */     (new int[16])[6] = 48000;
/*    */     (new int[16])[7] = 56000;
/*    */     (new int[16])[8] = 64000;
/*    */     (new int[16])[9] = 80000;
/*    */     (new int[16])[10] = 96000;
/*    */     (new int[16])[11] = 112000;
/*    */     (new int[16])[12] = 128000;
/*    */     (new int[16])[13] = 144000;
/*    */     (new int[16])[14] = 160000;
/*    */     (new int[16])[15] = 0;
/*    */     (new int[3][])[2] = arrayOfInt2;
/*    */     Da = new int[][][] { null, null, arrayOfInt };
/*    */     String[] arrayOfString1;
/*    */     (arrayOfString1 = new String[16])[0] = "free format";
/*    */     (new String[16])[1] = "32 kbit/s";
/*    */     (new String[16])[2] = "48 kbit/s";
/*    */     (new String[16])[3] = "56 kbit/s";
/*    */     (new String[16])[4] = "64 kbit/s";
/*    */     (new String[16])[5] = "80 kbit/s";
/*    */     (new String[16])[6] = "96 kbit/s";
/*    */     (new String[16])[7] = "112 kbit/s";
/*    */     (new String[16])[8] = "128 kbit/s";
/*    */     (new String[16])[9] = "144 kbit/s";
/*    */     (new String[16])[10] = "160 kbit/s";
/*    */     (new String[16])[11] = "176 kbit/s";
/*    */     (new String[16])[12] = "192 kbit/s";
/*    */     (new String[16])[13] = "224 kbit/s";
/*    */     (new String[16])[14] = "256 kbit/s";
/*    */     (new String[16])[15] = "forbidden";
/*    */     String[][] arrayOfString;
/*    */     (arrayOfString = new String[3][])[0] = arrayOfString1;
/*    */     (arrayOfString1 = new String[16])[0] = "free format";
/*    */     (new String[16])[1] = "8 kbit/s";
/*    */     (new String[16])[2] = "16 kbit/s";
/*    */     (new String[16])[3] = "24 kbit/s";
/*    */     (new String[16])[4] = "32 kbit/s";
/*    */     (new String[16])[5] = "40 kbit/s";
/*    */     (new String[16])[6] = "48 kbit/s";
/*    */     (new String[16])[7] = "56 kbit/s";
/*    */     (new String[16])[8] = "64 kbit/s";
/*    */     (new String[16])[9] = "80 kbit/s";
/*    */     (new String[16])[10] = "96 kbit/s";
/*    */     (new String[16])[11] = "112 kbit/s";
/*    */     (new String[16])[12] = "128 kbit/s";
/*    */     (new String[16])[13] = "144 kbit/s";
/*    */     (new String[16])[14] = "160 kbit/s";
/*    */     (new String[16])[15] = "forbidden";
/*    */     (new String[3][])[1] = arrayOfString1;
/*    */     (arrayOfString1 = new String[16])[0] = "free format";
/*    */     (new String[16])[1] = "8 kbit/s";
/*    */     (new String[16])[2] = "16 kbit/s";
/*    */     (new String[16])[3] = "24 kbit/s";
/*    */     (new String[16])[4] = "32 kbit/s";
/*    */     (new String[16])[5] = "40 kbit/s";
/*    */     (new String[16])[6] = "48 kbit/s";
/*    */     (new String[16])[7] = "56 kbit/s";
/*    */     (new String[16])[8] = "64 kbit/s";
/*    */     (new String[16])[9] = "80 kbit/s";
/*    */     (new String[16])[10] = "96 kbit/s";
/*    */     (new String[16])[11] = "112 kbit/s";
/*    */     (new String[16])[12] = "128 kbit/s";
/*    */     (new String[16])[13] = "144 kbit/s";
/*    */     (new String[16])[14] = "160 kbit/s";
/*    */     (new String[16])[15] = "forbidden";
/*    */     (new String[3][])[2] = arrayOfString1;
/*    */     (new String[3][][])[0] = arrayOfString;
/*    */     (arrayOfString1 = new String[16])[0] = "free format";
/*    */     (new String[16])[1] = "32 kbit/s";
/*    */     (new String[16])[2] = "64 kbit/s";
/*    */     (new String[16])[3] = "96 kbit/s";
/*    */     (new String[16])[4] = "128 kbit/s";
/*    */     (new String[16])[5] = "160 kbit/s";
/*    */     (new String[16])[6] = "192 kbit/s";
/*    */     (new String[16])[7] = "224 kbit/s";
/*    */     (new String[16])[8] = "256 kbit/s";
/*    */     (new String[16])[9] = "288 kbit/s";
/*    */     (new String[16])[10] = "320 kbit/s";
/*    */     (new String[16])[11] = "352 kbit/s";
/*    */     (new String[16])[12] = "384 kbit/s";
/*    */     (new String[16])[13] = "416 kbit/s";
/*    */     (new String[16])[14] = "448 kbit/s";
/*    */     (new String[16])[15] = "forbidden";
/*    */     (arrayOfString = new String[3][])[0] = arrayOfString1;
/*    */     (arrayOfString1 = new String[16])[0] = "free format";
/*    */     (new String[16])[1] = "32 kbit/s";
/*    */     (new String[16])[2] = "48 kbit/s";
/*    */     (new String[16])[3] = "56 kbit/s";
/*    */     (new String[16])[4] = "64 kbit/s";
/*    */     (new String[16])[5] = "80 kbit/s";
/*    */     (new String[16])[6] = "96 kbit/s";
/*    */     (new String[16])[7] = "112 kbit/s";
/*    */     (new String[16])[8] = "128 kbit/s";
/*    */     (new String[16])[9] = "160 kbit/s";
/*    */     (new String[16])[10] = "192 kbit/s";
/*    */     (new String[16])[11] = "224 kbit/s";
/*    */     (new String[16])[12] = "256 kbit/s";
/*    */     (new String[16])[13] = "320 kbit/s";
/*    */     (new String[16])[14] = "384 kbit/s";
/*    */     (new String[16])[15] = "forbidden";
/*    */     (new String[3][])[1] = arrayOfString1;
/*    */     (arrayOfString1 = new String[16])[0] = "free format";
/*    */     (new String[16])[1] = "32 kbit/s";
/*    */     (new String[16])[2] = "40 kbit/s";
/*    */     (new String[16])[3] = "48 kbit/s";
/*    */     (new String[16])[4] = "56 kbit/s";
/*    */     (new String[16])[5] = "64 kbit/s";
/*    */     (new String[16])[6] = "80 kbit/s";
/*    */     (new String[16])[7] = "96 kbit/s";
/*    */     (new String[16])[8] = "112 kbit/s";
/*    */     (new String[16])[9] = "128 kbit/s";
/*    */     (new String[16])[10] = "160 kbit/s";
/*    */     (new String[16])[11] = "192 kbit/s";
/*    */     (new String[16])[12] = "224 kbit/s";
/*    */     (new String[16])[13] = "256 kbit/s";
/*    */     (new String[16])[14] = "320 kbit/s";
/*    */     (new String[16])[15] = "forbidden";
/*    */     (new String[3][])[2] = arrayOfString1;
/*    */     (new String[3][][])[1] = arrayOfString;
/*    */     (arrayOfString1 = new String[16])[0] = "free format";
/*    */     (new String[16])[1] = "32 kbit/s";
/*    */     (new String[16])[2] = "48 kbit/s";
/*    */     (new String[16])[3] = "56 kbit/s";
/*    */     (new String[16])[4] = "64 kbit/s";
/*    */     (new String[16])[5] = "80 kbit/s";
/*    */     (new String[16])[6] = "96 kbit/s";
/*    */     (new String[16])[7] = "112 kbit/s";
/*    */     (new String[16])[8] = "128 kbit/s";
/*    */     (new String[16])[9] = "144 kbit/s";
/*    */     (new String[16])[10] = "160 kbit/s";
/*    */     (new String[16])[11] = "176 kbit/s";
/*    */     (new String[16])[12] = "192 kbit/s";
/*    */     (new String[16])[13] = "224 kbit/s";
/*    */     (new String[16])[14] = "256 kbit/s";
/*    */     (new String[16])[15] = "forbidden";
/*    */     (arrayOfString = new String[3][])[0] = arrayOfString1;
/*    */     (arrayOfString1 = new String[16])[0] = "free format";
/*    */     (new String[16])[1] = "8 kbit/s";
/*    */     (new String[16])[2] = "16 kbit/s";
/*    */     (new String[16])[3] = "24 kbit/s";
/*    */     (new String[16])[4] = "32 kbit/s";
/*    */     (new String[16])[5] = "40 kbit/s";
/*    */     (new String[16])[6] = "48 kbit/s";
/*    */     (new String[16])[7] = "56 kbit/s";
/*    */     (new String[16])[8] = "64 kbit/s";
/*    */     (new String[16])[9] = "80 kbit/s";
/*    */     (new String[16])[10] = "96 kbit/s";
/*    */     (new String[16])[11] = "112 kbit/s";
/*    */     (new String[16])[12] = "128 kbit/s";
/*    */     (new String[16])[13] = "144 kbit/s";
/*    */     (new String[16])[14] = "160 kbit/s";
/*    */     (new String[16])[15] = "forbidden";
/*    */     (new String[3][])[1] = arrayOfString1;
/*    */     (arrayOfString1 = new String[16])[0] = "free format";
/*    */     (new String[16])[1] = "8 kbit/s";
/*    */     (new String[16])[2] = "16 kbit/s";
/*    */     (new String[16])[3] = "24 kbit/s";
/*    */     (new String[16])[4] = "32 kbit/s";
/*    */     (new String[16])[5] = "40 kbit/s";
/*    */     (new String[16])[6] = "48 kbit/s";
/*    */     (new String[16])[7] = "56 kbit/s";
/*    */     (new String[16])[8] = "64 kbit/s";
/*    */     (new String[16])[9] = "80 kbit/s";
/*    */     (new String[16])[10] = "96 kbit/s";
/*    */     (new String[16])[11] = "112 kbit/s";
/*    */     (new String[16])[12] = "128 kbit/s";
/*    */     (new String[16])[13] = "144 kbit/s";
/*    */     (new String[16])[14] = "160 kbit/s";
/*    */     (new String[16])[15] = "forbidden";
/*    */     (new String[3][])[2] = arrayOfString1;
/*    */     Hl0 = new String[][][] { null, null, arrayOfString };
/*    */   }
/*    */   
/*    */   public final void bt0(byte[] paramArrayOfbyte) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: ldc 'Xing'
/*    */     //   3: astore_2
/*    */     //   4: iconst_4
/*    */     //   5: dup
/*    */     //   6: istore_3
/*    */     //   7: newarray byte
/*    */     //   9: astore #4
/*    */     //   11: getfield OB : I
/*    */     //   14: iconst_1
/*    */     //   15: if_icmpne -> 36
/*    */     //   18: aload_0
/*    */     //   19: getfield kb0 : I
/*    */     //   22: iconst_3
/*    */     //   23: if_icmpne -> 29
/*    */     //   26: goto -> 51
/*    */     //   29: bipush #32
/*    */     //   31: istore #5
/*    */     //   33: goto -> 55
/*    */     //   36: aload_0
/*    */     //   37: getfield kb0 : I
/*    */     //   40: iconst_3
/*    */     //   41: if_icmpne -> 51
/*    */     //   44: bipush #9
/*    */     //   46: istore #5
/*    */     //   48: goto -> 55
/*    */     //   51: bipush #17
/*    */     //   53: istore #5
/*    */     //   55: aload_2
/*    */     //   56: aload_1
/*    */     //   57: iload #5
/*    */     //   59: aload #4
/*    */     //   61: iconst_0
/*    */     //   62: iconst_4
/*    */     //   63: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   66: new java/lang/String
/*    */     //   69: dup
/*    */     //   70: aload #4
/*    */     //   72: invokespecial <init> : ([B)V
/*    */     //   75: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   78: ifeq -> 345
/*    */     //   81: aload_0
/*    */     //   82: dup
/*    */     //   83: dup2
/*    */     //   84: iconst_1
/*    */     //   85: putfield Tm : Z
/*    */     //   88: iconst_m1
/*    */     //   89: putfield Y3 : I
/*    */     //   92: iconst_m1
/*    */     //   93: putfield Lq : I
/*    */     //   96: bipush #100
/*    */     //   98: newarray byte
/*    */     //   100: putfield k3 : [B
/*    */     //   103: iconst_4
/*    */     //   104: istore_2
/*    */     //   105: iconst_4
/*    */     //   106: dup
/*    */     //   107: istore #6
/*    */     //   109: newarray byte
/*    */     //   111: dup
/*    */     //   112: astore #7
/*    */     //   114: aload_1
/*    */     //   115: iload #5
/*    */     //   117: iload_2
/*    */     //   118: iadd
/*    */     //   119: aload #7
/*    */     //   121: iconst_0
/*    */     //   122: iload #6
/*    */     //   124: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   127: bipush #8
/*    */     //   129: istore_2
/*    */     //   130: iconst_3
/*    */     //   131: baload
/*    */     //   132: iconst_1
/*    */     //   133: iand
/*    */     //   134: ifeq -> 200
/*    */     //   137: aload_0
/*    */     //   138: aload #4
/*    */     //   140: aload_1
/*    */     //   141: iload #5
/*    */     //   143: iload_2
/*    */     //   144: iadd
/*    */     //   145: aload #4
/*    */     //   147: iconst_0
/*    */     //   148: iload_3
/*    */     //   149: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   152: iconst_0
/*    */     //   153: baload
/*    */     //   154: bipush #24
/*    */     //   156: ishl
/*    */     //   157: ldc_w -16777216
/*    */     //   160: iand
/*    */     //   161: aload #4
/*    */     //   163: iconst_1
/*    */     //   164: baload
/*    */     //   165: bipush #16
/*    */     //   167: ishl
/*    */     //   168: ldc_w 16711680
/*    */     //   171: iand
/*    */     //   172: ior
/*    */     //   173: aload #4
/*    */     //   175: iconst_2
/*    */     //   176: baload
/*    */     //   177: bipush #8
/*    */     //   179: ishl
/*    */     //   180: ldc_w 65280
/*    */     //   183: iand
/*    */     //   184: ior
/*    */     //   185: aload #4
/*    */     //   187: iconst_3
/*    */     //   188: baload
/*    */     //   189: sipush #255
/*    */     //   192: iand
/*    */     //   193: ior
/*    */     //   194: putfield Y3 : I
/*    */     //   197: bipush #12
/*    */     //   199: istore_2
/*    */     //   200: aload #7
/*    */     //   202: iconst_3
/*    */     //   203: baload
/*    */     //   204: iconst_2
/*    */     //   205: iand
/*    */     //   206: ifeq -> 272
/*    */     //   209: aload_0
/*    */     //   210: aload #4
/*    */     //   212: aload_1
/*    */     //   213: iload #5
/*    */     //   215: iload_2
/*    */     //   216: iadd
/*    */     //   217: aload #4
/*    */     //   219: iconst_0
/*    */     //   220: iload_3
/*    */     //   221: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   224: iconst_0
/*    */     //   225: baload
/*    */     //   226: bipush #24
/*    */     //   228: ishl
/*    */     //   229: ldc_w -16777216
/*    */     //   232: iand
/*    */     //   233: aload #4
/*    */     //   235: iconst_1
/*    */     //   236: baload
/*    */     //   237: bipush #16
/*    */     //   239: ishl
/*    */     //   240: ldc_w 16711680
/*    */     //   243: iand
/*    */     //   244: ior
/*    */     //   245: aload #4
/*    */     //   247: iconst_2
/*    */     //   248: baload
/*    */     //   249: bipush #8
/*    */     //   251: ishl
/*    */     //   252: ldc_w 65280
/*    */     //   255: iand
/*    */     //   256: ior
/*    */     //   257: aload #4
/*    */     //   259: iconst_3
/*    */     //   260: baload
/*    */     //   261: sipush #255
/*    */     //   264: iand
/*    */     //   265: ior
/*    */     //   266: putfield Lq : I
/*    */     //   269: iinc #2, 4
/*    */     //   272: aload #7
/*    */     //   274: iconst_3
/*    */     //   275: baload
/*    */     //   276: iconst_4
/*    */     //   277: iand
/*    */     //   278: ifeq -> 317
/*    */     //   281: iload_2
/*    */     //   282: aload_0
/*    */     //   283: aload_1
/*    */     //   284: aload_0
/*    */     //   285: iload #5
/*    */     //   287: iload_2
/*    */     //   288: iadd
/*    */     //   289: istore_2
/*    */     //   290: getfield k3 : [B
/*    */     //   293: astore #6
/*    */     //   295: iload_2
/*    */     //   296: aload #6
/*    */     //   298: iconst_0
/*    */     //   299: istore_2
/*    */     //   300: arraylength
/*    */     //   301: istore #8
/*    */     //   303: aload #6
/*    */     //   305: iload_2
/*    */     //   306: iload #8
/*    */     //   308: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   311: getfield k3 : [B
/*    */     //   314: arraylength
/*    */     //   315: iadd
/*    */     //   316: istore_2
/*    */     //   317: aload #7
/*    */     //   319: iconst_3
/*    */     //   320: baload
/*    */     //   321: bipush #8
/*    */     //   323: iand
/*    */     //   324: ifeq -> 345
/*    */     //   327: aload_1
/*    */     //   328: iload #5
/*    */     //   330: iload_2
/*    */     //   331: iadd
/*    */     //   332: istore_2
/*    */     //   333: iconst_0
/*    */     //   334: istore #5
/*    */     //   336: iload_2
/*    */     //   337: aload #4
/*    */     //   339: iload #5
/*    */     //   341: iload_3
/*    */     //   342: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   345: ldc_w 'VBRI'
/*    */     //   348: aload_1
/*    */     //   349: bipush #32
/*    */     //   351: aload #4
/*    */     //   353: iconst_0
/*    */     //   354: iconst_4
/*    */     //   355: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   358: new java/lang/String
/*    */     //   361: dup
/*    */     //   362: aload #4
/*    */     //   364: invokespecial <init> : ([B)V
/*    */     //   367: invokevirtual equals : (Ljava/lang/Object;)Z
/*    */     //   370: ifeq -> 511
/*    */     //   373: aload_0
/*    */     //   374: aload #4
/*    */     //   376: aload_1
/*    */     //   377: aload_0
/*    */     //   378: aload #4
/*    */     //   380: aload_1
/*    */     //   381: aload_0
/*    */     //   382: dup
/*    */     //   383: dup2
/*    */     //   384: iconst_1
/*    */     //   385: putfield Tm : Z
/*    */     //   388: iconst_m1
/*    */     //   389: putfield Y3 : I
/*    */     //   392: iconst_m1
/*    */     //   393: putfield Lq : I
/*    */     //   396: bipush #100
/*    */     //   398: newarray byte
/*    */     //   400: putfield k3 : [B
/*    */     //   403: bipush #42
/*    */     //   405: aload #4
/*    */     //   407: iconst_0
/*    */     //   408: iload_3
/*    */     //   409: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   412: iconst_0
/*    */     //   413: baload
/*    */     //   414: bipush #24
/*    */     //   416: ishl
/*    */     //   417: ldc_w -16777216
/*    */     //   420: iand
/*    */     //   421: aload #4
/*    */     //   423: iconst_1
/*    */     //   424: baload
/*    */     //   425: bipush #16
/*    */     //   427: ishl
/*    */     //   428: ldc_w 16711680
/*    */     //   431: iand
/*    */     //   432: ior
/*    */     //   433: aload #4
/*    */     //   435: iconst_2
/*    */     //   436: baload
/*    */     //   437: bipush #8
/*    */     //   439: ishl
/*    */     //   440: ldc_w 65280
/*    */     //   443: iand
/*    */     //   444: ior
/*    */     //   445: aload #4
/*    */     //   447: iconst_3
/*    */     //   448: baload
/*    */     //   449: sipush #255
/*    */     //   452: iand
/*    */     //   453: ior
/*    */     //   454: putfield Lq : I
/*    */     //   457: bipush #46
/*    */     //   459: aload #4
/*    */     //   461: iconst_0
/*    */     //   462: iload_3
/*    */     //   463: invokestatic arraycopy : (Ljava/lang/Object;ILjava/lang/Object;II)V
/*    */     //   466: iconst_0
/*    */     //   467: baload
/*    */     //   468: bipush #24
/*    */     //   470: ishl
/*    */     //   471: ldc_w -16777216
/*    */     //   474: iand
/*    */     //   475: aload #4
/*    */     //   477: iconst_1
/*    */     //   478: baload
/*    */     //   479: bipush #16
/*    */     //   481: ishl
/*    */     //   482: ldc_w 16711680
/*    */     //   485: iand
/*    */     //   486: ior
/*    */     //   487: aload #4
/*    */     //   489: iconst_2
/*    */     //   490: baload
/*    */     //   491: bipush #8
/*    */     //   493: ishl
/*    */     //   494: ldc_w 65280
/*    */     //   497: iand
/*    */     //   498: ior
/*    */     //   499: aload #4
/*    */     //   501: iconst_3
/*    */     //   502: baload
/*    */     //   503: sipush #255
/*    */     //   506: iand
/*    */     //   507: ior
/*    */     //   508: putfield Y3 : I
/*    */     //   511: return
/*    */     //   512: astore_0
/*    */     //   513: new f/z60
/*    */     //   516: dup
/*    */     //   517: ldc_w 'VBRIVBRHeader Corrupted'
/*    */     //   520: aload_0
/*    */     //   521: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Exception;)V
/*    */     //   524: athrow
/*    */     //   525: astore_0
/*    */     //   526: new f/z60
/*    */     //   529: dup
/*    */     //   530: ldc_w 'XingVBRHeader Corrupted'
/*    */     //   533: aload_0
/*    */     //   534: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Exception;)V
/*    */     //   537: athrow
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   55	78	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   81	103	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   109	111	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   122	127	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   130	132	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   148	154	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   161	165	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   173	177	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   185	189	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   194	197	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   200	204	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   220	226	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   233	237	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   245	249	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   257	261	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   266	269	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   272	276	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   290	293	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   300	301	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   303	315	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   317	321	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   336	345	525	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   351	370	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   373	403	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   408	414	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   421	425	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   433	437	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   445	449	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   454	457	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   462	468	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   475	479	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   487	491	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   499	503	512	java/lang/ArrayIndexOutOfBoundsException
/*    */     //   508	511	512	java/lang/ArrayIndexOutOfBoundsException
/*    */   }
/*    */   
/*    */   public final int y9() {
/*    */     return this.OB;
/*    */   }
/*    */   
/*    */   public final int Gc0() {
/*    */     return this.x70;
/*    */   }
/*    */   
/*    */   public final int Kb() {
/*    */     return this.kb0;
/*    */   }
/*    */   
/*    */   public final int Wb() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield x70 : I
/*    */     //   4: dup
/*    */     //   5: istore_1
/*    */     //   6: ifeq -> 72
/*    */     //   9: iload_1
/*    */     //   10: iconst_1
/*    */     //   11: if_icmpeq -> 47
/*    */     //   14: iload_1
/*    */     //   15: iconst_2
/*    */     //   16: if_icmpeq -> 21
/*    */     //   19: iconst_0
/*    */     //   20: ireturn
/*    */     //   21: aload_0
/*    */     //   22: getfield OB : I
/*    */     //   25: dup
/*    */     //   26: istore_0
/*    */     //   27: iconst_1
/*    */     //   28: if_icmpne -> 35
/*    */     //   31: sipush #32000
/*    */     //   34: ireturn
/*    */     //   35: iload_0
/*    */     //   36: ifne -> 43
/*    */     //   39: sipush #16000
/*    */     //   42: ireturn
/*    */     //   43: sipush #8000
/*    */     //   46: ireturn
/*    */     //   47: aload_0
/*    */     //   48: getfield OB : I
/*    */     //   51: dup
/*    */     //   52: istore_0
/*    */     //   53: iconst_1
/*    */     //   54: if_icmpne -> 60
/*    */     //   57: ldc 48000
/*    */     //   59: ireturn
/*    */     //   60: iload_0
/*    */     //   61: ifne -> 68
/*    */     //   64: sipush #24000
/*    */     //   67: ireturn
/*    */     //   68: sipush #12000
/*    */     //   71: ireturn
/*    */     //   72: aload_0
/*    */     //   73: getfield OB : I
/*    */     //   76: dup
/*    */     //   77: istore_0
/*    */     //   78: iconst_1
/*    */     //   79: if_icmpne -> 85
/*    */     //   82: ldc 44100
/*    */     //   84: ireturn
/*    */     //   85: iload_0
/*    */     //   86: ifne -> 93
/*    */     //   89: sipush #22050
/*    */     //   92: ireturn
/*    */     //   93: sipush #11025
/*    */     //   96: ireturn
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ym0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */