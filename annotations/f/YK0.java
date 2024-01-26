/* 1 */ package f;public class YK0 { public static final YK0 rq = new YK0(); public static final String[] wW = new String[0]; public static int L10 = 0; public F40 te0; public HI qt0; public String[][][] Pv0; public short[][][] bh; public final String[] Rv(int paramInt) { int i = 0; if (this.Sy0 && this.Pq0) i = L10;  String[][][] arrayOfString1; if ((paramInt = sk0(paramInt)) < 0 || paramInt >= (arrayOfString1 = this.Pv0).length) { arrayOfString = wW; return this; }  if (arrayOfString1[paramInt] == null) super.PH0(paramInt);  if (i < 0 || i >= (((YK0)super).Pv0[paramInt]).length) i = 0;  String[] arrayOfString = ((YK0)super).Pv0[paramInt][i]; return this; } public boolean Sy0; public boolean Pq0; public boolean coM3; public ig Up; public YK0(HI paramHI, F40 paramF40, T7 paramT7) { ig ig1; boolean bool; this.te0 = paramF40; this.qt0 = paramHI; this.Sy0 = paramHI.gw(); this.coM3 = paramHI.RX(); if (paramHI.bO() == 2) { bool = true; } else { bool = false; }  this.Pq0 = bool; this(paramT7); this.Up = new ig(); this.Pv0 = new String[size()][][]; this.bh = new short[this.Up.size()][][]; } public YK0() { this.te0 = F40.ef0; this.qt0 = null; this.Pv0 = new String[0][0][0]; this.bh = new short[0][0][0]; } public final String j0(int paramInt1, int paramInt2, int paramInt3) { String[][][] arrayOfString2; if ((paramInt1 = sk0(paramInt1)) < 0 || paramInt1 >= (arrayOfString2 = this.Pv0).length) return "--";  if (this.Sy0 && this.Pq0) paramInt2 = L10;  if (arrayOfString2[paramInt1] == null) PH0(paramInt1);  String[][] arrayOfString1; String[] arrayOfString; return (paramInt2 < 0 || paramInt2 >= (arrayOfString1 = this.Pv0[paramInt1]).length) ? "--" : ((paramInt3 < 0 || paramInt3 >= (arrayOfString = this[paramInt2]).length) ? "--" : this[paramInt3]); } public final void f80(int paramInt1, int paramInt2, String paramString, int paramInt3) { String[][][] arrayOfString2; if ((paramInt1 = sk0(paramInt1)) < 0 || paramInt1 >= (arrayOfString2 = this.Pv0).length) return;  if (arrayOfString2[paramInt1] == null) PH0(paramInt1);  String[][] arrayOfString1; if (paramInt2 < 0 || paramInt2 >= (arrayOfString1 = this.Pv0[paramInt1]).length) return;  String[] arrayOfString; if (paramInt3 < 0 || paramInt3 >= (arrayOfString = this[paramInt2]).length) return;  this[paramInt3] = paramString; } public synchronized void PH0(int paramInt) { if (this.Pv0[paramInt] != null)
/*   */       return; 
/* 3 */     short s2 = byteBuffer.getShort(); byteBuffer.getInt(); byteBuffer.getInt(); ByteBuffer byteBuffer; short s1; int[] arrayOfInt; byte b1; for (arrayOfInt = new int[s1 = (byteBuffer = this.Up.zz(paramInt).rb(false)).getShort()], this.Pv0[paramInt] = new String[s1][s2], this.bh[paramInt] = new short[s1][s2], b1 = 0; b1 < s1; ) { arrayOfInt[b1] = byteBuffer.getInt(); b1++; }  short[] arrayOfShort = new short[3]; this(); StringBuilder stringBuilder; for (byte b2 = 0; b2 < s1; ) { int i = 31881; byteBuffer.position(arrayOfInt[b2]); byteBuffer.getInt(); int[] arrayOfInt1; short[] arrayOfShort1; byte b; for (arrayOfInt1 = new int[s2], arrayOfShort1 = new short[s2], b = 0; b < s2; ) { arrayOfInt1[b] = byteBuffer.getInt(); arrayOfShort1[b] = byteBuffer.getShort(); this.bh[paramInt][b2][b] = byteBuffer.getShort(); b++; }  for (b = 0; b < s2; ) { stringBuilder.setLength(0); byteBuffer.position(arrayOfInt[b2] + arrayOfInt1[b]); boolean bool; byte b3; int j; label108: for (bool = false, b3 = 0, j = i; b3 < arrayOfShort1[b]; ) { int k = (short)(byteBuffer.getShort() ^ j); if (bool) { int m = 0, n = 0; while (true) { int i1; int i2; for (i2 = (i1 = k & 0xFFFF) >> m; m >= 16;) { if ((m += -16) > 0) { if (((i1 = n | i1 << 9 - m & 0x1FF) & 0xFF) == 255) continue label108;  if (i1 != 0 && i1 != 1) stringBuilder.append((char)i1);  }  }  if (((k = i2 & 0x1FF) & 0xFF) == 255) break;  if (k != 0 && k != 1) stringBuilder.append((char)k);  if ((k = m + 9) < 16) { m = i1 >> k & 0x1FF; k += 9; n = m; m = k; } else { m = k; }  j = (j << 3 | j >> 13) & 0xFFFF; if (byteBuffer.remaining() < 2) break;  k = (short)(byteBuffer.getShort() ^ j); b3++; }  } else { if (k == -1) break;  if (k == -2) { if (stringBuilder.length() < 2 || stringBuilder.charAt(stringBuilder.length() - 2) != '\n' || stringBuilder.charAt(stringBuilder.length() - 1) != '\n') stringBuilder.append("\n");  } else if (k == -3840) { bool = true; } else { Object[] arrayOfObject; if (k == -4096) { short s; for (arrayOfShort[0] = 0, arrayOfShort[1] = 0, arrayOfShort[2] = 0, k = 0, j = (j << 3 | j >> 13) & 0xFFFF; k < 3 && (s = (short)(byteBuffer.getShort() ^ j)) != 0; ) { arrayOfShort[k] = s; k++; }  if ((k = arrayOfShort[0]) != -256) { Object[] arrayOfObject1; switch (k) { default: switch (k) { default: k = arrayOfShort[2];
/*   */                           
/* 5 */                           (arrayOfObject1 = new Object[1])[0] = Short.valueOf(k); stringBuilder.append(B40.df("{").append(String.format("%1$02X", arrayOfObject1)).append("}").toString()); break;
/*   */                         case -16894:
/* 7 */                           (arrayOfObject = new Object[1])[0] = Short.valueOf(arrayOfShort[2]); stringBuilder.append(B40.df("{DELAY_").append(String.format("%1$02X", arrayOfObject)).append("}").toString()); break;case -16896: case -16895: stringBuilder.append("\n\n"); break;case -16893: case -16892: case -16891: case -16890: case -16889: case -16888: case -16887: break; }  break;case -17152: case -17151: case -17150: case -17149: case -17148: case -17147: break; }  }  } else if (arrayOfObject == '⑭') { stringBuilder.append('♂'); } else if (arrayOfObject == '⑮') { stringBuilder.append('♀'); } else if (arrayOfObject == '⒆') { stringBuilder.append("PK"); } else if (arrayOfObject == '⒇') { stringBuilder.append("MN"); } else if (arrayOfObject < null || arrayOfObject > 10) { stringBuilder.append((char)arrayOfObject); }  }  }  j = (j << 3 | j >> 13) & 0xFFFF; b3++; }  if ((i += 10627) > 65535) i -= 65536;  this.Pv0[paramInt][b2][b] = stringBuilder.toString(); b++; }  b2++; }
/*   */      }
/*   */ 
/*   */   
/*   */   public int sk0(int paramInt) {
/*   */     if (!this.Sy0)
/*   */       return paramInt; 
/*   */     if (this.te0 == F40.wI)
/*   */       return paramInt; 
/*   */     if (paramInt != 24) {
/*   */       if (paramInt != 25) {
/*   */         if (paramInt != 34) {
/*   */           if (paramInt != 35) {
/*   */             switch (paramInt) {
/*   */               default:
/*   */                 switch (paramInt) {
/*   */                   default:
/*   */                     switch (paramInt) {
/*   */                       default:
/*   */                         return paramInt;
/*   */                       case 204:
/*   */                         return 202;
/*   */                       case 203:
/*   */                         return 204;
/*   */                       case 202:
/*   */                         break;
/*   */                     } 
/*   */                     return 203;
/*   */                   case 20:
/*   */                     return 21;
/*   */                   case 19:
/*   */                     return 3;
/*   */                   case 18:
/*   */                     return 2;
/*   */                   case 17:
/*   */                     return 1;
/*   */                   case 16:
/*   */                     return 18;
/*   */                   case 15:
/*   */                     return 17;
/*   */                   case 14:
/*   */                     return 16;
/*   */                   case 13:
/*   */                     break;
/*   */                 } 
/*   */                 return 15;
/*   */               case 11:
/*   */                 return 14;
/*   */               case 10:
/*   */                 return 13;
/*   */               case 9:
/*   */                 return 12;
/*   */               case 8:
/*   */                 return 11;
/*   */               case 7:
/*   */                 return 10;
/*   */               case 6:
/*   */                 return 9;
/*   */               case 5:
/*   */                 return 8;
/*   */               case 4:
/*   */                 return 7;
/*   */               case 3:
/*   */                 return 6;
/*   */               case 2:
/*   */                 return 5;
/*   */               case 1:
/*   */                 return 4;
/*   */               case 0:
/*   */                 break;
/*   */             } 
/*   */             return 0;
/*   */           } 
/*   */           return 34;
/*   */         } 
/*   */         return 35;
/*   */       } 
/*   */       return 26;
/*   */     } 
/*   */     return 25;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/YK0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */