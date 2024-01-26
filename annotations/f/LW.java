/* 1 */ package f;public class LW extends Bs implements Cloneable { public final void s() { short[][][] arrayOfShort; int j; if (this.zm) return;  this.zm = true; ByteBuffer byteBuffer; this
/* 2 */       .kT = (byteBuffer = this.wX.rb(false)).getInt(); this.L8 = byteBuffer.getInt(); int i; if ((i = this.kT) == 149326) { this.Ul0 = new int[0]; this.dd0 = byteBuffer.getInt(); byteBuffer.getInt(); } else if (i == 214098 || i == 213591) { this.Ul0 = new int[] { byteBuffer.getInt() }; this.dd0 = byteBuffer.getInt(); byteBuffer.getInt(); } else { this.Ul0 = new int[] { byteBuffer.getInt(), byteBuffer.getInt() }; this.dd0 = byteBuffer.getInt(); byteBuffer.getInt(); }  int[] arrayOfInt1; byte b; int[] arrayOfInt2; for (this.gP = new short[(arrayOfInt1 = this.Ul0).length][][][], this.my0 = new short[arrayOfInt1.length][][], b = 0; b < (arrayOfInt2 = this.Ul0).length; ) { byteBuffer.position(arrayOfInt2[b]); j = byteBuffer.getShort(); short s1 = byteBuffer.getShort(); if (this.ar0 == 0 && this.Rc0 == 0) { this.ar0 = j; this.Rc0 = s1; }  if (this.ar0 == j && this.Rc0 == s1) { byte b1; for (this.gP[b] = new short[4][j][s1], b1 = 0; b1 < s1; ) { for (byte b2 = 0; b2 < j; ) { for (byte b3 = 0; b3 < 4; ) { if (this.kT == 214098) byteBuffer.position(byteBuffer.position() + 4);  this.gP[b][b3][b2][b1] = byteBuffer.getShort(); b3++; }  b2++; }  b1++; }  int[] arrayOfInt; if (b > 0 || (arrayOfInt = this.Ul0).length < 2) { j = this.dd0; } else { j = j[1]; }  for (j = (j - byteBuffer.position()) / 8, this.my0[b] = new short[j][4], s1 = 0; s1 < j; ) { for (b1 = 0; b1 < 4; ) { this.my0[b][s1][b1] = byteBuffer.getShort(); b1++; }  s1 = (short)(s1 + 1); }  b++; continue; }  throw new RuntimeException(this.wX.vA0 + " Size mismatch:" + j + " " + s1); }  short s; if ((s = this.MV) == 524) { byte b1; short[][] arrayOfShort1; short[][][][] arrayOfShort2; int k; short[][][] arrayOfShort3; for (k = j[0], this.Ul0 = new int[] { k, 0, 0, 0 }, this.gP = arrayOfShort2 = new short[4][][][], arrayOfShort2[0] = arrayOfShort3, (arrayOfShort1 = (arrayOfShort3 = this.gP[0])[3])[14][20] = 129, this.gP[0][2][14][20] = 1, arrayOfShort1[16][20] = 129, this.gP[0][2][16][20] = 1, b1 = 1; b1 < 4; ) { for (int m = this.ar0, m = 0; m < this.Rc0; ) { for (j = 0; j < this.ar0; ) { boolean bool; if (j > 6 && j < 24 && m > 18 && m < 27) { bool = true; } else { bool = false; }  if (b1 == 1) { if (j < 8 && m != 19 && m != 23) bool = false;  if (j > 22 && m != 19 && m != 23) bool = false;  if (j > 12 && m < 23) bool = false;  if (j > 17) bool = false;  }  if (b1 == 2) { if (j < 8 && m > 23) bool = false;  if (j > 22 && m != 19 && m != 23) bool = false;  if (j > 7 && j < 18 && m > 19 && m < 23) bool = false;  if (j == 16 && m == 23) bool = false;  if (j == 13 && m == 23) bool = false;  }  if (b1 == 3) { if (j < 8 && m != 19 && m != 23) bool = false;  if (j > 22 && m != 19 && m != 23) bool = false;  if (j > 12 && j < 18 && m > 19 && m < 23 && j != 15 && (m != 21 || j <= 13 || j >= 17)) bool = false;  if (j < 13 && m > 23) bool = false;  if (j == 19 && m == 19) bool = false;  }  if ((j == 8 || j == 12) && (m == 20 || m == 24)) bool = false;  if ((j == 13 || j == 17) && (m == 20 || m == 24)) bool = false;  if ((j == 18 || j == 22) && (m == 20 || m == 24)) bool = false;  short arrayOfShort4[][][], arrayOfShort5[] = (arrayOfShort4 = this.gP[b1])[3][j], s1 = (short)(bool ? 128 : 129); arrayOfShort5[m] = s1; arrayOfShort4[2][j][m] = (short)(bool ^ true); j++; }  m++; }  b1++; }  arrayOfShort = this.my0; this.my0 = arrayOfShort3; (arrayOfShort3 = new short[4][0][0])[0] = arrayOfShort[0]; } else { byte b1; if (arrayOfShort == '×') { for (b1 = 0; b1 < this.Rc0; ) { for (b = 0; b < this.ar0; ) { if (b > 5 && b < 23 && b1 > 12 && b1 < 26) { this.gP[0][3][b][b1] = 128; this.gP[0][2][b][b1] = 0; }  b++; }  b1++; }  } else if (b1 == 'ƈ') { for (b1 = 0; b1 < this.Rc0; ) { for (b = 0; b < this.ar0; ) { if (b > 9 && b < 18 && b1 > 25 && b1 < 30) { this.gP[0][3][b][b1] = 128; this.gP[0][2][b][b1] = 0; }  b++; }  b1++; }  } else if (b1 == 'Ɖ') { for (b1 = 0; b1 < this.Rc0; ) { for (b = 0; b < this.ar0; ) { if (b > 9 && b < 18 && b1 > 17 && b1 < 22) { this.gP[0][3][b][b1] = 128; this.gP[0][2][b][b1] = 0; }  b++; }  b1++; }  } else if (b1 == 'Ɗ') { for (b1 = 0; b1 < this.Rc0; ) { for (b = 0; b < this.ar0; ) { if ((b > 13 && b < 22 && b1 > 0 && b1 < 5) || (b > 14 && b < 23 && b1 > 9 && b1 < 14)) { this.gP[0][3][b][b1] = 128; this.gP[0][2][b][b1] = 0; }  b++; }  b1++; }  } else if (b1 == 'Ƌ') { for (b1 = 0; b1 < this.Rc0; ) { for (b = 0; b < this.ar0; ) { if ((b > -1 && b < 8 && b1 > 3 && b1 < 8) || (b > 11 && b < 20 && b1 > 3 && b1 < 8) || (b > 11 && b < 20 && b1 > 11 && b1 < 16)) { this.gP[0][3][b][b1] = 128; this.gP[0][2][b][b1] = 0; }  b++; }  b1++; }  } else if (b1 == 'ȕ') { for (b1 = 0; b1 < this.Rc0; ) { for (b = 0; b < this.ar0; ) { if ((b > 3 && b < 19 && (b1 == 3 || b1 == 12)) || ((b == 3 || b == 19) && b1 > 3 && b1 < 12)) { this.gP[0][3][b][b1] = 129; this.gP[0][2][b][b1] = 1; }  b++; }  b1++; }  } else if (b1 == 'è') { for (b1 = 0; b1 < 3; ) { for (b = 0; b < 3; ) { j = b * 8 + 9; cj0(j, b1 * 8 + 9, 6, 5); b++; }  b1++; }  } else if (b1 == 'é') { for (b1 = 0; b1 < 3; ) { for (b = 0; b < 2; ) { if (b != 1 || b1 != 0) { j = b * 8 + 1; cj0(j, b1 * 8 + 9, 6, 5); }  b++; }  b1++; }  cj0(48, 16, 2, 2); cj0(48, 20, 2, 2); cj0(48, 24, 2, 2); cj0(48, 28, 2, 2); } else if (b1 == 'ê') { cj0(9, 33, 5, 4); cj0(9, 41, 5, 4); cj0(17, 41, 5, 4); cj0(26, 42, 4, 3); cj0(21, 32, 11, 6); cj0(16, 48, 2, 2); cj0(20, 48, 2, 2); cj0(24, 48, 2, 2); cj0(28, 48, 2, 2); } else if (b1 == 'ë') { cj0(0, 0, 2, 6); cj0(33, 41, 5, 4); cj0(42, 42, 4, 3); cj0(32, 48, 2, 2); cj0(36, 48, 2, 2); cj0(40, 48, 2, 2); cj0(44, 48, 2, 2); this.gP[0][3][11][4] = 0; this.gP[0][2][11][4] = 0; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public short[][][][] gP;
/*   */   public short[][][] my0;
/*   */   public boolean zm = false;
/*   */   
/*   */   public LW(Wo paramWo, short paramShort, T7 paramT7) {
/*   */     super(paramWo, paramShort, paramT7);
/*   */   }
/*   */   
/*   */   public LW(LW paramLW) {
/*   */     super(paramLW);
/*   */     this.gP = paramLW.gP;
/*   */     this.my0 = paramLW.my0;
/*   */   }
/*   */   
/*   */   public final short[][][][] Nb0() {
/*   */     return this.gP;
/*   */   }
/*   */   
/*   */   public final void cj0(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     paramInt1 %= this.ar0;
/*   */     paramInt2 %= this.Rc0;
/*   */     short s;
/*   */     for (s = 0; s < paramInt4; s = (short)(s + 1)) {
/*   */       int i;
/*   */       for (i = 0; i < paramInt3; i = (short)(i + 1)) {
/*   */         int j;
/*   */         this.gP[0][3][i = paramInt1 + i][j = paramInt2 + s] = 129;
/*   */         this.gP[0][2][i][j] = 1;
/*   */       } 
/*   */     } 
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/LW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */