/*    */ package f;public abstract class Ml0 { public static final String[] EH0 = new String[0]; public static final EnumMap aJ0 = new EnumMap<>(wQ.class); public static final int[][][] qq0; public static final int[][][] bB0; public static final int[][][] fe0; public static Ut0 nW = new Ut0(); public static final V6 ha = new V6(); public static YK0[][] gK = new YK0[5][2]; public static void QS(int paramInt) { // Byte code:
/*    */     //   0: iload_0
/*    */     //   1: iconst_0
/*    */     //   2: invokestatic bM0 : (II)Ljava/lang/String;
/*    */     //   5: astore_1
/*    */     //   6: getstatic f/F40.ef0 : Lf/F40;
/*    */     //   9: iconst_4
/*    */     //   10: swap
/*    */     //   11: invokestatic gn0 : (BLf/F40;)Lf/YK0;
/*    */     //   14: astore_2
/*    */     //   15: iconst_0
/*    */     //   16: istore_3
/*    */     //   17: iload_3
/*    */     //   18: iconst_2
/*    */     //   19: if_icmpge -> 161
/*    */     //   22: aload_2
/*    */     //   23: iload_0
/*    */     //   24: invokevirtual sk0 : (I)I
/*    */     //   27: dup
/*    */     //   28: istore #4
/*    */     //   30: iflt -> 95
/*    */     //   33: iload #4
/*    */     //   35: aload_2
/*    */     //   36: getfield Pv0 : [[[Ljava/lang/String;
/*    */     //   39: dup
/*    */     //   40: astore #5
/*    */     //   42: arraylength
/*    */     //   43: if_icmplt -> 49
/*    */     //   46: goto -> 95
/*    */     //   49: aload #5
/*    */     //   51: iload #4
/*    */     //   53: aaload
/*    */     //   54: ifnonnull -> 63
/*    */     //   57: aload_2
/*    */     //   58: iload #4
/*    */     //   60: invokevirtual PH0 : (I)V
/*    */     //   63: iload_3
/*    */     //   64: iflt -> 95
/*    */     //   67: iload_3
/*    */     //   68: aload_2
/*    */     //   69: getfield Pv0 : [[[Ljava/lang/String;
/*    */     //   72: iload #4
/*    */     //   74: aaload
/*    */     //   75: dup
/*    */     //   76: astore #4
/*    */     //   78: arraylength
/*    */     //   79: if_icmplt -> 85
/*    */     //   82: goto -> 95
/*    */     //   85: aload #4
/*    */     //   87: iload_3
/*    */     //   88: aaload
/*    */     //   89: arraylength
/*    */     //   90: istore #4
/*    */     //   92: goto -> 98
/*    */     //   95: iconst_0
/*    */     //   96: istore #4
/*    */     //   98: iconst_1
/*    */     //   99: istore #5
/*    */     //   101: iload #5
/*    */     //   103: iload #4
/*    */     //   105: if_icmpge -> 155
/*    */     //   108: aload_2
/*    */     //   109: iload_0
/*    */     //   110: iload_3
/*    */     //   111: iload #5
/*    */     //   113: invokevirtual j0 : (III)Ljava/lang/String;
/*    */     //   116: dup
/*    */     //   117: astore #6
/*    */     //   119: aload_1
/*    */     //   120: invokevirtual startsWith : (Ljava/lang/String;)Z
/*    */     //   123: ifeq -> 129
/*    */     //   126: goto -> 149
/*    */     //   129: aload_2
/*    */     //   130: aload_1
/*    */     //   131: ldc ': '
/*    */     //   133: aload #6
/*    */     //   135: invokestatic AT : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*    */     //   138: astore #6
/*    */     //   140: iload_0
/*    */     //   141: iload_3
/*    */     //   142: aload #6
/*    */     //   144: iload #5
/*    */     //   146: invokevirtual f80 : (IILjava/lang/String;I)V
/*    */     //   149: iinc #5, 1
/*    */     //   152: goto -> 101
/*    */     //   155: iinc #3, 1
/*    */     //   158: goto -> 17
/*    */     //   161: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 24
/*    */     //   #2	-> 36
/*    */     //   #3	-> 113
/*    */     //   #4	-> 131
/*  1 */     //   #5	-> 146 } public static void N20(Wo paramWo) { F40 f403; if (paramWo == null) return;  YK0 yK01 = paramWo.Ft0(f403); F40 f404; YK0 yK02 = paramWo.Ft0(f404 = F40.wI); gK[2][f403.DX] = yK01; gK[
/*  2 */         2][f404
/*  3 */         .DX] = yK02; 
/*  4 */     try { String str1 = Qf0(f403 = F40.ef0, 92, 3), str2 = Qf0(F40.ef0, 92, 5), str3 = Qf0(F40.ef0, 92, 6), str5 = Qf0(f403, 92, 4); String str4; if ((str4 = Qf0(F40.ef0, 89, 46)).contains(" ")) { String[] arrayOfString = str4.split(" "); int k = 1; if (paramWo.SO().equals("it")) k = 2;  if (k >= arrayOfString.length) k = arrayOfString.length - 1;  str4 = arrayOfString[k]; }  if (paramWo.SO().equals("ko")) { str1 = str1.substring(0, 2); str2 = str2.substring(0, 2); str3 = str3.substring(0, 2); str4 = str4.substring(str4.length() - 3, str4.length() - 1); }  if (paramWo.SO().equals("ja")) { str1 = str1.substring(0, str1.length() - 1); str2 = str2.substring(0, str2.length() - 1); str3 = str3.substring(0, str3.length() - 1); str4 = Qf0(f403, 53, 164).substring(0, 6); }  if (str4.startsWith("d'") && str4.length() > 2) str4 = str4.substring(2);  nW.A3(250000, str1); nW.A3(250001, str2); nW.A3(250003, str3); int j = 250002; nW
/*    */         
/*  6 */         .A3(j, SZ(str4, null)); nW.A3(250004, str5); } catch (Exception exception) { null.printStackTrace(); }
/*    */     
/*  8 */     if (!nW.return(140010)) {
/*  9 */       String str = OH0(250000);
/* 10 */       nW.A3(140010, str);
/* 11 */     }  F40 f402; nW.A3(0, LF.Gt0(Qf0(f402 = F40.ef0, 34, 2))); nW.A3(1, LF.Gt0(Qf0(f402, 34, 1))); nW.A3(2, LF.Gt0(Qf0(f402, 17, 7))); nW.A3(3, Qf0(f402, 55, 2)); nW.A3(4, Qf0(f402, 55, 3)); nW.A3(12, Qf0(f402, 90, 14)); rW(150000, yK01.Rv(70)); rW(210000, yK01.Rv(182)); rW(220000, yK01.Rv(183)); rW(120000, yK01.Rv(202)); rW(110000, yK01.Rv(203)); rW(190240, yK01.Rv(191)); rW(135000, yK01.Rv(53)); rW(245000, yK01.Rv(54)); rW(180000, yK01.Rv(24)); rW(142000, yK01.Rv(89)); Ht0[] arrayOfHt0; int i; byte b; for (i = (arrayOfHt0 = Ht0.Oa0).length, b = 0; b < i; ) { Ht0 ht0; if ((ht0 = arrayOfHt0[b]) == Ht0.CW) { nW
/*    */           
/* 13 */           .A3(ht0.zm0 + 230000, "???"); } else { nW
/*    */ 
/*    */ 
/*    */           
/* 17 */           .A3(ht0.zm0 + 230000, Qf0(F40.ef0, 199, ht0.ON)); }  b++; }  nW
/*    */       
/* 19 */       .A3(1754, mz0(OH0(245328), "??", "[0-9０-９,]{2,10}")); F40 f401 = F40.ef0; i = 41; nW
/*    */ 
/*    */ 
/*    */       
/* 23 */       .A3(201000, gK[2][f401.DX].j0(157, 0, i)); i = 42; nW
/*    */ 
/*    */ 
/*    */       
/* 27 */       .A3(201001, gK[2][f401.DX].j0(157, 0, i)); i = 43; nW
/*    */ 
/*    */ 
/*    */       
/* 31 */       .A3(201007, gK[2][f401.DX].j0(157, 0, i)); nW.A3(200244, Qf0(f401, 15, 82)); } public static void B9() { byte b4; YK0 yK01 = gn0((byte)2, F40.wI); YK0 yK02; if ((yK02 = gn0((byte)2, F40.ef0)).Sy0) { b4 = YK0.L10; } else { b4 = 0; }  int i; for (i = 0; i < 2; ) { String str = TG0(yK01.j0(110, i, 2), (short)5033); yK01.f80(110, i, str, 2); str = TG0(yK01.j0(464, i, 6), (short)5030); yK01.f80(464, i, str, 6); str = TG0(yK01.j0(464, i, 7), (short)5031); yK01.f80(464, i, str, 7); str = TG0(yK01.j0(464, i, 8), (short)5032); yK01.f80(464, i, str, 8); str = TG0(yK01.j0(38, i, 9), (short)5591); yK01.f80(38, i, str, 9); for (Iterator<LPT3> iterator = Of.eH.aj0().iterator(); iterator.hasNext(); ) { LPT3 lPT3; if ((lPT3 = iterator.next()).ux0 != 2) continue;  int k = lPT3.bj0 - 5000; String str4 = mz0(yK02.j0(53, i, k), lPT3.Pa0 + "", "[0-9０-９,]{2,10}"); int m = lPT3.bj0 - 5000; yK02.f80(53, i, str4, m); if (lPT3.Pa0 > 0 && !lPT3.Rv0 && i == b4) nW.A3(lPT3.bj0 + 130000, str4);  int j = lPT3.bj0 - 5000; String str3 = mz0(yK02.j0(53, i, j), lPT3.C90 + "", "[0-9０-９,]{2,10}"); m = lPT3.bj0 - 5000; yK02.f80(53, i, str3, m); if (lPT3.C90 > 0 && i == b4) nW.A3(lPT3.bj0 + 130000, str3);  }  byte b = 0; int[][][] arrayOfInt; while (b < (arrayOfInt = qq0).length) { int[][] arrayOfInt3; int j; byte b5; for (j = (arrayOfInt3 = arrayOfInt[b]).length, b5 = 0; b5 < j; ) { int arrayOfInt4[], m = (arrayOfInt4 = arrayOfInt3[b5])[0], n = arrayOfInt3[b5][1], k = arrayOfInt4[0]; m = arrayOfInt4[1]; String str3 = mz0(yK01.j0(m, i, n), String.valueOf(Bh0.tp((byte)2, (byte)b, null)), "[0-9０-９,]{2,10}"); yK01.f80(k, i, str3, m); b5++; }  b++; }  i++; }  String str2 = mz0((yK01 = gn0((byte)3, F40.ef0)).j0(147, 0, 2), Integer.toString(250), "[0-9０-９,]{4}"); gn0((byte)3, F40.ef0).f80(147, 0, str2, 2); str2 = TG0(gn0((byte)3, F40.ef0).j0(154, 0, 8), (short)5042); gn0((byte)3, F40.ef0).f80(154, 0, str2, 8); str2 = TG0(gn0((byte)3, F40.ef0).j0(484, 0, 1), (short)5033); gn0((byte)3, F40.ef0).f80(484, 0, str2, 1); str2 = TG0(gn0((byte)3, F40.ef0).j0(255, 0, 10), (short)5094); gn0((byte)3, F40.ef0).f80(255, 0, str2, 10); str2 = TG0(gn0((byte)3, F40.ef0).j0(361, 0, 219), (short)5030); gn0((byte)3, F40.ef0).f80(361, 0, str2, 219); str2 = TG0(gn0((byte)3, F40.ef0).j0(361, 0, 220), (short)5031); gn0((byte)3, F40.ef0).f80(361, 0, str2, 220); str2 = TG0(gn0((byte)3, F40.ef0).j0(361, 0, 221), (short)5032); gn0((byte)3, F40.ef0).f80(361, 0, str2, 221); int[][][] arrayOfInt2; for (byte b2 = 0; b2 < (arrayOfInt2 = bB0).length; ) { int[][] arrayOfInt; byte b; for (i = (arrayOfInt = arrayOfInt2[b2]).length, b = 0; b < i; ) { int arrayOfInt3[], k = (arrayOfInt3 = arrayOfInt[b])[0], m = arrayOfInt[b][1], j = arrayOfInt3[0]; k = arrayOfInt3[1];
/* 32 */         String str = mz0(yK01.j0(k, 0, m), String.valueOf(Bh0.tp((byte)2, (byte)b2, null)), "[0-9０-９,]{2,10}");
/* 33 */         yK01.f80(j, 0, str, k); b++; }  b2++; }  String str1; byte b3; for (str1 = Go(16777239, NumberFormat.getInstance().format(25000L)), b3 = 0; b3 < 5; ) { i = b3 * 3 + 20;
/* 34 */       String str = De0.AT(yK01.j0(96, 0, i), "\n", str1);
/* 35 */       yK01.f80(96, 0, str, i); b3++; }
/* 36 */      str1 = TG0((yK01 = gn0((byte)4, F40.ef0)).j0(191, 0, 209), (short)5030); gn0((byte)4, F40.ef0).f80(191, 0, str1, 209); str1 = TG0(gn0((byte)4, F40.ef0).j0(191, 0, 210), (short)5031); gn0((byte)4, F40.ef0).f80(191, 0, str1, 210); str1 = TG0(gn0((byte)4, F40.ef0).j0(191, 0, 211), (short)5032); gn0((byte)4, F40.ef0).f80(191, 0, str1, 211); str1 = TG0(gn0((byte)4, F40.ef0).j0(397, 0, 1), (short)5033); gn0((byte)4, F40.ef0).f80(397, 0, str1, 1); int[][][] arrayOfInt1; for (byte b1 = 0; b1 < (arrayOfInt1 = fe0).length; ) { int[][] arrayOfInt; byte b; for (i = (arrayOfInt = arrayOfInt1[b1]).length, b = 0; b < i; ) { int arrayOfInt3[], k = (arrayOfInt3 = arrayOfInt[b])[0], m = arrayOfInt[b][1], j = arrayOfInt3[0]; k = arrayOfInt3[1];
/* 37 */         String str = mz0(yK01.j0(k, 0, m), String.valueOf(Bh0.tp((byte)4, (byte)b1, null)), "[0-9０-９,]{2,10}");
/* 38 */         yK01.f80(j, 0, str, k); b++; }  b1++; }  } public static String TG0(String paramString, short paramShort) { return mz0(paramString, (Of.eH.On0(paramShort)).ph0 + "", "[0-9０-９,]{2,10}"); } public static void Pl0() { String str1 = mz0(OH0(245328), "", "[0-9０-９,]{2,10}"); String str2 = mz0(OH0(245420), "", "[0-9０-９,]{2,10}"); nW.A3(910000, str2); str2 = OH0(910000); for (Iterator<LPT3> iterator1 = Of.eH.cOm7.values().iterator(); iterator1.hasNext();) { if ((lPT3 = iterator1.next()).kx0 > 0) { String str5, str4; int i = lPT3.bj0 + 900000, j = lPT3.bj0 + 965536; this(); if (lPT3.bj()) { str5 = str2; } else { str5 = str1; }  StringBuilder stringBuilder = stringBuilder.append(str5).append(" - "); WD wD; if (lPT3.kx0 > 0 && (wD = yk0.cw().mP(lPT3.kx0)) != null) { str4 = OH0(wD.iz); } else { str4 = "--"; }  String str3 = stringBuilder.append(str4).toString(); nW.A3(i, str3); str3 = cS.JF(36, OH0(lPT3.kx0 + 120000)); nW.A3(j, str3); lPT3.Iu = i; lPT3.wC0 = j; }  }  for (Iterator<UD0> iterator = (On.v30()).iI0.values().iterator(); iterator.hasNext(); ) { UD0 uD01; if ((uD01 = iterator.next()).h3 != null) { i = 1; } else { i = 0; }  if (!i) continue;  int i = uD01.AP + 150000; UD0 uD02; if (!nW.return(i) && (uD02 = uD01.Qo0()) != null) { int j; if ((j = uD01.D3) == 0 || uD02.AP == 493) { j = uD02.AP; } else { j = uD02.Q5 + 652; j = (short)(j - 1 + j); }  j--; if (uD02.AP > 493) j += 16;  String str = uD02.o60(false) + " [" + Qf0(F40.ef0, 244, j) + "]"; nW.A3(i, str); }  }
/* 39 */      short[][] arrayOfShort; byte b1, b2; for (arrayOfShort = Jf.Z10, b1 = 18, b2 = 0; b2 < b1; ) { int i = arrayOfShort[b2][1] + 150000; String str = OH0(arrayOfShort[b2][0] + 150000);
/* 40 */       nW.A3(i, str); b2++; }  char c = '֧'; b1 = 0; nV[] arrayOfNV; while (b1 < (
/* 41 */       arrayOfNV = nV.ko0).length) { int i = b1 + 930000; String str = Go(101705, arrayOfNV[b1].toString());
/* 42 */       nW.A3(i, str);
/*    */       
/* 44 */       (Of.eH.On0((short)(c + b1)))
/* 45 */         .Iu = i; b1++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public static String mz0(String paramString1, String paramString2, String paramString3) {
/*    */     String str;
/*    */     byte b1 = 0;
/*    */     char[] arrayOfChar;
/*    */     int i = (arrayOfChar = paramString1.toCharArray()).length;
/*    */     for (byte b2 = 0; b2 < i; b2++) {
/*    */       if (Character.UnicodeBlock.of(arrayOfChar[b2]) == Character.UnicodeBlock.HALFWIDTH_AND_FULLWIDTH_FORMS) {
/*    */         b1 = 1;
/*    */         break;
/*    */       } 
/*    */     } 
/*    */     if (b1) {
/*    */       String str1;
/*    */       char[] arrayOfChar1 = paramString2.toCharArray();
/*    */       for (b1 = 0; b1 < arrayOfChar1.length; b1++)
/*    */         arrayOfChar1[b1] = (char)(arrayOfChar1[b1] + 65248); 
/*    */       this(arrayOfChar1);
/*    */       str = str1;
/*    */     } 
/*    */     return paramString1.replaceAll(paramString3, str);
/*    */   }
/*    */   
/*    */   public static void rW(int paramInt, String[] paramArrayOfString) {
/*    */     for (byte b = 0; b < paramArrayOfString.length; b++) {
/*    */       int i = paramInt + b;
/*    */       nW.A3(i, paramArrayOfString[b]);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static String SZ(String paramString1, String paramString2) {
/*    */     this();
/*    */     StringBuilder stringBuilder;
/*    */     char c;
/*    */     for (byte b = 0; b < paramString1.length() && (Character.isLetter(c = paramString1.charAt(b)) || (paramString2 != null && !paramString2.isEmpty() && paramString2.contains(c + ""))); b++)
/*    */       stringBuilder.append(c); 
/*    */     return stringBuilder.toString();
/*    */   }
/*    */   
/*    */   public static void ik(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: iconst_m1
/*    */     //   2: istore #4
/*    */     //   4: iconst_1
/*    */     //   5: if_icmpge -> 11
/*    */     //   8: goto -> 52
/*    */     //   11: aload_0
/*    */     //   12: iload_1
/*    */     //   13: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   16: pop
/*    */     //   17: iconst_0
/*    */     //   18: istore_1
/*    */     //   19: iload_1
/*    */     //   20: iload_2
/*    */     //   21: if_icmplt -> 28
/*    */     //   24: iload_2
/*    */     //   25: ifge -> 52
/*    */     //   28: iload_2
/*    */     //   29: ifge -> 64
/*    */     //   32: aload_0
/*    */     //   33: invokevirtual get : ()B
/*    */     //   36: iload #4
/*    */     //   38: if_icmpne -> 53
/*    */     //   41: aload_0
/*    */     //   42: dup
/*    */     //   43: invokevirtual position : ()I
/*    */     //   46: iconst_1
/*    */     //   47: isub
/*    */     //   48: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   51: pop
/*    */     //   52: return
/*    */     //   53: aload_0
/*    */     //   54: dup
/*    */     //   55: invokevirtual position : ()I
/*    */     //   58: iconst_1
/*    */     //   59: isub
/*    */     //   60: invokevirtual position : (I)Ljava/nio/Buffer;
/*    */     //   63: pop
/*    */     //   64: getstatic f/Ml0.nW : Lf/Ut0;
/*    */     //   67: astore #5
/*    */     //   69: iload_3
/*    */     //   70: iconst_1
/*    */     //   71: iadd
/*    */     //   72: istore #6
/*    */     //   74: getstatic f/ed.j5 : Lf/ak;
/*    */     //   77: pop
/*    */     //   78: new java/lang/StringBuilder
/*    */     //   81: dup
/*    */     //   82: astore #7
/*    */     //   84: invokespecial <init> : ()V
/*    */     //   87: aload_0
/*    */     //   88: invokevirtual get : ()B
/*    */     //   91: dup
/*    */     //   92: istore #8
/*    */     //   94: iconst_m1
/*    */     //   95: if_icmpne -> 101
/*    */     //   98: goto -> 247
/*    */     //   101: iload #8
/*    */     //   103: bipush #-4
/*    */     //   105: if_icmpne -> 173
/*    */     //   108: aload_0
/*    */     //   109: invokevirtual get : ()B
/*    */     //   112: dup
/*    */     //   113: istore #8
/*    */     //   115: bipush #6
/*    */     //   117: if_icmpne -> 123
/*    */     //   120: goto -> 165
/*    */     //   123: iload #8
/*    */     //   125: bipush #8
/*    */     //   127: if_icmpne -> 133
/*    */     //   130: goto -> 165
/*    */     //   133: iload #8
/*    */     //   135: bipush #11
/*    */     //   137: if_icmpne -> 143
/*    */     //   140: goto -> 150
/*    */     //   143: iload #8
/*    */     //   145: bipush #16
/*    */     //   147: if_icmpne -> 158
/*    */     //   150: aload_0
/*    */     //   151: invokevirtual getShort : ()S
/*    */     //   154: pop
/*    */     //   155: goto -> 87
/*    */     //   158: iload #8
/*    */     //   160: bipush #17
/*    */     //   162: if_icmpne -> 87
/*    */     //   165: aload_0
/*    */     //   166: invokevirtual get : ()B
/*    */     //   169: pop
/*    */     //   170: goto -> 87
/*    */     //   173: iload #8
/*    */     //   175: bipush #-3
/*    */     //   177: if_icmpne -> 236
/*    */     //   180: aload #7
/*    */     //   182: aload_0
/*    */     //   183: invokevirtual get : ()B
/*    */     //   186: istore #8
/*    */     //   188: ldc_w '{'
/*    */     //   191: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   194: iconst_1
/*    */     //   195: anewarray java/lang/Object
/*    */     //   198: dup
/*    */     //   199: astore #9
/*    */     //   201: iload #8
/*    */     //   203: invokestatic valueOf : (B)Ljava/lang/Byte;
/*    */     //   206: iconst_0
/*    */     //   207: swap
/*    */     //   208: aastore
/*    */     //   209: ldc_w '%1$02X'
/*    */     //   212: aload #9
/*    */     //   214: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
/*    */     //   217: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   220: ldc_w '}'
/*    */     //   223: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   226: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   229: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   232: pop
/*    */     //   233: goto -> 87
/*    */     //   236: getstatic f/ed.j5 : Lf/ak;
/*    */     //   239: iload #8
/*    */     //   241: invokevirtual db0 : (B)Z
/*    */     //   244: ifne -> 269
/*    */     //   247: aload #5
/*    */     //   249: aload #7
/*    */     //   251: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   254: iload_3
/*    */     //   255: swap
/*    */     //   256: invokevirtual A3 : (ILjava/lang/Object;)Ljava/lang/Object;
/*    */     //   259: pop
/*    */     //   260: iinc #1, 1
/*    */     //   263: iload #6
/*    */     //   265: istore_3
/*    */     //   266: goto -> 19
/*    */     //   269: aload #7
/*    */     //   271: getstatic f/ed.j5 : Lf/ak;
/*    */     //   274: iload #8
/*    */     //   276: invokevirtual Ha0 : (B)Ljava/lang/Object;
/*    */     //   279: checkcast java/lang/String
/*    */     //   282: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   285: pop
/*    */     //   286: goto -> 87
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 13
/*    */     //   #2	-> 78
/*    */     //   #3	-> 188
/*    */     //   #4	-> 195
/*    */     //   #5	-> 241
/*    */     //   #6	-> 251
/*    */     //   #7	-> 256
/*    */     //   #8	-> 271
/*    */   }
/*    */   
/*    */   public static boolean Ks0(int paramInt) {
/*    */     return nW.return(paramInt);
/*    */   }
/*    */   
/*    */   public static String OH0(int paramInt) {
/*    */     String str;
/*    */     if ((str = (String)nW.Z6(paramInt)) == null)
/*    */       return XD0.SD0("STRING_", paramInt); 
/*    */     return Lj(str);
/*    */   }
/*    */   
/*    */   public static String Go(int paramInt, String paramString) {
/*    */     String str2;
/*    */     if ((str2 = (String)nW.Z6(paramInt)) == null)
/*    */       return XD0.SD0("STRING_", paramInt); 
/*    */     Object[] arrayOfObject;
/*    */     (arrayOfObject = new Object[1])[0] = Integer.valueOf(0);
/*    */     String str1 = B40.df("\\{").append(String.format("%1$02X", arrayOfObject)).append("\\}").toString();
/*    */     return Lj(str2.replaceAll(str1, Matcher.quoteReplacement(paramString)));
/*    */   }
/*    */   
/*    */   public static String sB(int paramInt, String... paramVarArgs) {
/*    */     String str;
/*    */     if ((str = (String)nW.Z6(paramInt)) == null)
/*    */       return XD0.SD0("STRING_", paramInt); 
/*    */     paramInt = 0;
/*    */     while (paramInt < paramVarArgs.length) {
/*    */       Object[] arrayOfObject;
/*    */       (arrayOfObject = new Object[1])[0] = Integer.valueOf(paramInt);
/*    */       str = B40.df("\\{").append(String.format("%1$02X", arrayOfObject)).append("\\}").toString();
/*    */       str = str.replaceAll(str, Matcher.quoteReplacement(paramVarArgs[paramInt]));
/*    */       paramInt++;
/*    */     } 
/*    */     return Lj(str);
/*    */   }
/*    */   
/*    */   public static String la(int paramInt, String paramString) {
/*    */     String str;
/*    */     return ((str = (String)nW.Z6(paramInt)) == null) ? paramString : Lj(str);
/*    */   }
/*    */   
/*    */   public static String Nq0(int paramInt, byte[] paramArrayOfbyte, String[] paramArrayOfString) {
/*    */     String str;
/*    */     if ((str = (String)nW.Z6(paramInt)) == null)
/*    */       return XD0.SD0("STRING_", paramInt); 
/*    */     if (paramArrayOfbyte.length == paramArrayOfString.length) {
/*    */       String str1;
/*    */       for (paramInt = 0; paramInt < paramArrayOfbyte.length; ) {
/*    */         Object[] arrayOfObject;
/*    */         (arrayOfObject = new Object[1])[0] = Byte.valueOf(paramArrayOfbyte[paramInt]);
/*    */         str1 = B40.df("\\{").append(String.format("%1$02X", arrayOfObject)).append("\\}").toString();
/*    */         str1 = str.replaceAll(str1, paramArrayOfString[paramInt]);
/*    */         paramInt++;
/*    */       } 
/*    */       return Lj(str1);
/*    */     } 
/*    */     throw new RuntimeException("Mismatching replace keys/values lengths.");
/*    */   }
/*    */   
/*    */   public static String tG(byte paramByte, F40 paramF40, int paramInt1, int paramInt2, String... paramVarArgs) {
/*    */     String str;
/*    */     byte b;
/*    */     for (str = gK[paramByte][paramF40.DX].j0(paramInt1, 0, paramInt2), b = 0; b < paramVarArgs.length; ) {
/*    */       Object[] arrayOfObject;
/*    */       (arrayOfObject = new Object[1])[0] = Integer.valueOf(b);
/*    */       str = B40.df("\\{").append(String.format("%1$02X", arrayOfObject)).append("\\}").toString();
/*    */       str = str.replaceAll(str, Matcher.quoteReplacement(paramVarArgs[b]));
/*    */       b++;
/*    */     } 
/*    */     return Lj(str);
/*    */   }
/*    */   
/*    */   public static String lz(byte paramByte, F40 paramF40, int paramInt1, int paramInt2, String... paramVarArgs) {
/*    */     String str;
/*    */     byte b;
/*    */     for (str = gK[paramByte][paramF40.DX].j0(paramInt1, 0, paramInt2), b = 0; b < paramVarArgs.length; ) {
/*    */       Object[] arrayOfObject;
/*    */       (arrayOfObject = new Object[1])[0] = Integer.valueOf(b);
/*    */       str = str.replaceAll(B40.df("\\{").append(String.format("%1$02X", arrayOfObject)).append("\\}").toString(), B40.df("[#ff8a00]").append(Matcher.quoteReplacement(paramVarArgs[b].trim())).append("[#]").toString());
/*    */       b++;
/*    */     } 
/*    */     return Lj(str);
/*    */   }
/*    */   
/*    */   public static String tm0(byte paramByte, F40 paramF40, int paramInt1, int paramInt2, LPT1... paramVarArgs) {
/*    */     return Lj(CoM2(gK[paramByte][paramF40.DX].j0(paramInt1, 0, paramInt2), paramVarArgs));
/*    */   }
/*    */   
/*    */   public static String Qf0(F40 paramF40, int paramInt1, int paramInt2) {
/*    */     String[] arrayOfString = EH0;
/*    */     return tG((byte)2, paramF40, paramInt1, paramInt2, arrayOfString);
/*    */   }
/*    */   
/*    */   public static String bM0(int paramInt1, int paramInt2) {
/*    */     String[] arrayOfString = EH0;
/*    */     return tG((byte)4, F40.ef0, paramInt1, paramInt2, arrayOfString);
/*    */   }
/*    */   
/*    */   public static String Lj(String paramString) {
/*    */     if (!paramString.contains("{"))
/*    */       return paramString; 
/*    */     for (Matcher matcher = Pattern.compile("\\{([A-F0-9]{2,4})\\}").matcher(paramString); matcher.find(); ) {
/*    */       byte b = (byte)(Integer.parseInt(matcher.group(1), 16) & 0xFF);
/*    */       String str2 = matcher.group();
/*    */       String str1;
/*    */       if ((str1 = (String)ed.CZ.Ha0(b)) == null)
/*    */         str1 = ""; 
/*    */       paramString = paramString.replace(str2, str1);
/*    */     } 
/*    */     return paramString;
/*    */   }
/*    */   
/*    */   public static String CoM2(String paramString, LPT1[] paramArrayOfLPT1) {
/*    */     String str;
/*    */     if (!paramString.contains("{"))
/*    */       return paramString; 
/*    */     if (paramArrayOfLPT1 == null || paramArrayOfLPT1.length < 1)
/*    */       return paramString; 
/*    */     byte b;
/*    */     for (int i = paramArrayOfLPT1.length; b < i; ) {
/*    */       LPT1 lPT1 = paramArrayOfLPT1[b];
/*    */       Object[] arrayOfObject;
/*    */       (arrayOfObject = new Object[1])[0] = Byte.valueOf(lPT1.IM);
/*    */       str = paramString.replace(B40.df("{").append(String.format("%1$02X", arrayOfObject)).append("}").toString(), Matcher.quoteReplacement(lPT1.Na()));
/*    */       b++;
/*    */     } 
/*    */     if (!str.contains("{") || !str.contains("+"))
/*    */       return str; 
/*    */     Matcher matcher;
/*    */     if ((matcher = Pattern.compile("\\{([A-F0-9]{2,4})\\+\\}").matcher(str)).find()) {
/*    */       StringBuilder stringBuilder;
/*    */       b = (byte)(Integer.parseInt(matcher.group(1), 16) & 0xFF);
/*    */       this();
/*    */       int j;
/*    */       byte b1;
/*    */       for (j = paramArrayOfLPT1.length, b1 = 0; b1 < j; ) {
/*    */         LPT1 lPT1;
/*    */         if ((lPT1 = paramArrayOfLPT1[b1]).IM >= b) {
/*    */           if (stringBuilder.length() > 0)
/*    */             stringBuilder.append("/"); 
/*    */           stringBuilder.append(lPT1.Na());
/*    */         } 
/*    */         b1++;
/*    */       } 
/*    */       str = str.replace(matcher.group(), stringBuilder);
/*    */     } 
/*    */     return str;
/*    */   }
/*    */   
/*    */   public static void TP(int paramInt, String paramString) {
/*    */     nW.A3(paramInt, paramString);
/*    */   }
/*    */   
/*    */   public static void oI(s40 params40, int paramInt1, int paramInt2, int paramInt3) {
/*    */     if (paramInt1 < 1)
/*    */       return; 
/*    */     ByteBuffer byteBuffer;
/*    */     (byteBuffer = params40.pr()).position(paramInt1);
/*    */     int i;
/*    */     for (paramInt1 = 0; (paramInt3 <= 0 || paramInt3 > paramInt1) && (i = pN.tx0(byteBuffer.getInt())) >= 1 && i <= byteBuffer.limit(); paramInt1++) {
/*    */       String str = ed.ik(i, params40.pr());
/*    */       nW.A3(paramInt1 + paramInt2, str);
/*    */     } 
/*    */   }
/*    */   
/*    */   public static String LU(String paramString) {
/*    */     if (paramString.contains("STRING_")) {
/*    */       String[] arrayOfString;
/*    */       int i;
/*    */       for (arrayOfString = paramString.split("\\{STRING_"), i = 0; i < arrayOfString.length - 1;) {
/*    */         try {
/*    */           int j = Integer.parseInt(arrayOfString[++i].split("\\}")[0]);
/*    */           if (nW.return(j)) {
/*    */             String str1 = "\\{STRING_" + j + "\\}";
/*    */             String str2;
/*    */             if ((str2 = (String)nW.Z6(j)) == null)
/*    */               str2 = "STRING_" + j; 
/*    */             paramString = paramString.replaceAll(str1, str2);
/*    */           } 
/*    */         } catch (Exception exception) {
/*    */           exception.printStackTrace();
/*    */         } 
/*    */       } 
/*    */     } 
/*    */     return paramString;
/*    */   }
/*    */   
/*    */   public static YK0 gn0(byte paramByte, F40 paramF40) {
/*    */     return gK[paramByte][paramF40.DX];
/*    */   }
/*    */   
/*    */   public static void Ou() {
/*    */     Of.eH.eF0.bM0(Ml0::Md0);
/*    */   }
/*    */   
/*    */   public static String kd0(byte paramByte) {
/*    */     if (paramByte != 3)
/*    */       return (paramByte != 4) ? LF.Gt0(OH0(300095)) : tG(paramByte, F40.ef0, 729, 1, EH0); 
/*    */     return tG(paramByte, F40.ef0, 389, 37, EH0);
/*    */   }
/*    */   
/*    */   public static wQ y0(String paramString) {
/*    */     Iterator<Map.Entry> iterator = aJ0.entrySet().iterator();
/*    */     while (iterator.hasNext()) {
/*    */       Map.Entry<?, String> entry;
/*    */       if (((String)(entry = iterator.next()).getValue()).equalsIgnoreCase(paramString) || ((wQ)entry.getKey()).name().equalsIgnoreCase(paramString))
/*    */         return (wQ)entry.getKey(); 
/*    */     } 
/*    */     return wQ.l8;
/*    */   }
/*    */   
/*    */   public static String cC0(byte paramByte) {
/*    */     return OH0(paramByte + 90);
/*    */   }
/*    */   
/*    */   public static boolean Md0(short paramShort1, short paramShort2) {
/*    */     int i = paramShort1 + 240000;
/*    */     if (!nW.return(i)) {
/*    */       String str = OH0(paramShort2 + 240000);
/*    */       nW.A3(i, str);
/*    */     } 
/*    */     return true;
/*    */   }
/*    */   
/*    */   static {
/*    */     for (byte b1 = 0; b1 < gK.length; b1++) {
/*    */       for (byte b = 0; b < 2; b++)
/*    */         gK[b1][b] = YK0.rq; 
/*    */     } 
/*    */     wQ[] arrayOfWQ;
/*    */     int i = (arrayOfWQ = wQ.values()).length;
/*    */     for (byte b2 = 0; b2 < i; b2++)
/*    */       aJ0.put(arrayOfWQ[b2], ""); 
/*    */   }
/*    */   
/*    */   public static String KM(F40 paramF40, int paramInt) {
/*    */     String[] arrayOfString = EH0;
/*    */     return tG((byte)2, paramF40, 1, paramInt, arrayOfString);
/*    */   }
/*    */   
/*    */   static {
/*    */     (new int[8][][])[0] = new int[0][];
/*    */     int[] arrayOfInt1;
/*    */     (arrayOfInt1 = new int[2])[0] = 64;
/*    */     (new int[2])[1] = 2;
/*    */     int[][] arrayOfInt;
/*    */     (arrayOfInt = new int[2][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[2])[0] = 12;
/*    */     (new int[2])[1] = 23;
/*    */     (new int[2][])[1] = arrayOfInt1;
/*    */     (new int[8][][])[1] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[2])[0] = 64;
/*    */     (new int[2])[1] = 3;
/*    */     (arrayOfInt = new int[2][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[2])[0] = 24;
/*    */     (new int[2])[1] = 3;
/*    */     (new int[2][])[1] = arrayOfInt1;
/*    */     (new int[8][][])[2] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[2])[0] = 64;
/*    */     (new int[2])[1] = 4;
/*    */     (arrayOfInt = new int[2][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[2])[0] = 34;
/*    */     (new int[2])[1] = 3;
/*    */     (new int[2][])[1] = arrayOfInt1;
/*    */     (new int[8][][])[3] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[2])[0] = 64;
/*    */     (new int[2])[1] = 5;
/*    */     (arrayOfInt = new int[2][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[2])[0] = 68;
/*    */     (new int[2])[1] = 3;
/*    */     (new int[2][])[1] = arrayOfInt1;
/*    */     (new int[8][][])[4] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[2])[0] = 64;
/*    */     (new int[2])[1] = 6;
/*    */     (arrayOfInt = new int[2][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[2])[0] = 102;
/*    */     (new int[2])[1] = 3;
/*    */     (new int[2][])[1] = arrayOfInt1;
/*    */     (new int[8][][])[5] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[2])[0] = 64;
/*    */     (new int[2])[1] = 7;
/*    */     (arrayOfInt = new int[2][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[2])[0] = 113;
/*    */     (new int[2])[1] = 3;
/*    */     (new int[2][])[1] = arrayOfInt1;
/*    */     (new int[8][][])[6] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[2])[0] = 64;
/*    */     (new int[2])[1] = 8;
/*    */     (arrayOfInt = new int[2][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[2])[0] = 119;
/*    */     (new int[2])[1] = 3;
/*    */     (new int[2][])[1] = arrayOfInt1;
/*    */     qq0 = new int[][][] { null, null, null, null, null, null, null, arrayOfInt };
/*    */     (new int[8][][])[0] = new int[0][];
/*    */     (new int[8][][])[1] = new int[0][];
/*    */     (arrayOfInt1 = new int[2])[0] = 87;
/*    */     (new int[2])[1] = 3;
/*    */     (arrayOfInt = new int[2][])[0] = arrayOfInt1;
/*    */     (arrayOfInt1 = new int[2])[0] = 88;
/*    */     (new int[2])[1] = 3;
/*    */     (new int[2][])[1] = arrayOfInt1;
/*    */     (new int[8][][])[2] = arrayOfInt;
/*    */     (new int[8][][])[3] = new int[0][];
/*    */     (arrayOfInt1 = new int[2])[0] = 144;
/*    */     (new int[2])[1] = 3;
/*    */     (arrayOfInt = new int[1][])[0] = arrayOfInt1;
/*    */     (new int[8][][])[4] = arrayOfInt;
/*    */     (new int[8][][])[5] = new int[0][];
/*    */     (arrayOfInt1 = new int[2])[0] = 56;
/*    */     (new int[2])[1] = 3;
/*    */     (arrayOfInt = new int[1][])[0] = arrayOfInt1;
/*    */     bB0 = new int[][][] { null, null, null, null, null, null, arrayOfInt, {} };
/*    */     (new int[8][][])[0] = new int[0][];
/*    */     (arrayOfInt1 = new int[2])[0] = 558;
/*    */     (new int[2])[1] = 3;
/*    */     (arrayOfInt = new int[1][])[0] = arrayOfInt1;
/*    */     (new int[8][][])[1] = arrayOfInt;
/*    */     (arrayOfInt1 = new int[2])[0] = 567;
/*    */     (new int[2])[1] = 3;
/*    */     (arrayOfInt = new int[1][])[0] = arrayOfInt1;
/*    */     (new int[8][][])[2] = arrayOfInt;
/*    */     (new int[8][][])[3] = new int[0][];
/*    */     (arrayOfInt1 = new int[2])[0] = 614;
/*    */     (new int[2])[1] = 3;
/*    */     (arrayOfInt = new int[1][])[0] = arrayOfInt1;
/*    */     (new int[8][][])[4] = arrayOfInt;
/*    */     (new int[8][][])[5] = new int[0][];
/*    */     (arrayOfInt1 = new int[2])[0] = 606;
/*    */     (new int[2])[1] = 3;
/*    */     (arrayOfInt = new int[1][])[0] = arrayOfInt1;
/*    */     fe0 = new int[][][] { null, null, null, null, null, null, arrayOfInt, {} };
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Ml0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */