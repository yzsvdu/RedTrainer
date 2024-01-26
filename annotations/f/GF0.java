/*  1 */ package f;public abstract class GF0 { public static boolean g6(ByteBuffer paramByteBuffer) { try { byte[] arrayOfByte2, arrayOfByte3; if (paramByteBuffer.limit() < 22) return false;  paramByteBuffer.position(paramByteBuffer.limit() - 20); byte[] arrayOfByte1; paramByteBuffer.get(arrayOfByte1 = new byte[20]); paramByteBuffer.position(0); paramByteBuffer.limit(paramByteBuffer.limit() - 20); ByteBuffer byteBuffer = paramByteBuffer.slice().order(ByteOrder.LITTLE_ENDIAN); 
/*  2 */       try { MessageDigest.getInstance("SHA1").update(byteBuffer); arrayOfByte3 = MessageDigest.getInstance("SHA1").digest(); } catch (Exception exception) {}
/*  3 */       if (!Arrays.equals(arrayOfByte3, arrayOfByte1)) { byteBuffer.position(0); PrintStream printStream = System.out; StringBuilder stringBuilder = (new StringBuilder()).append("HASH DON'T MATCH ");
/*    */         
/*  5 */         try { MessageDigest.getInstance("SHA1").update(byteBuffer); arrayOfByte2 = MessageDigest.getInstance("SHA1").digest(); } catch (Exception exception) {} printStream
/*  6 */           .println(stringBuilder.append(arrayOfByte2).append(" != ").append(arrayOfByte1).toString()); return false; }  arrayOfByte2.position(10); byte b; byte b1; for (Vp0.zG = new wc[b = arrayOfByte2.get()], b1 = 0; b1 < b; ) { wc wc; Vp0 vp0 = null; short s = (short)b1; boolean bool = false; short[][] arrayOfShort = new short[0][0]; this(vp0, s, "", bool, arrayOfShort, 1); lPT9[] arrayOfLPT9; int j; byte b2; for (Vp0.zG[b1] = wc, j = (arrayOfLPT9 = lPT9.AUX).length, b2 = 0; b2 < j; ) { lPT9 lPT9 = arrayOfLPT9[b2]; byte b3 = arrayOfByte2.get(); byte b4 = 0; wc
/*  7 */             .Mv[b4][lPT9
/*  8 */               .nV] = 
/*  9 */             new X9(wc, lPT9, b3);
/*    */           
/* 11 */           for (X9 x9 = wc.Mv[b4][lPT9.nV]; b4 < b3; ) { wa wa; int k = 1;
/*    */             
/* 13 */             (x9.ls[b4])
/* 14 */               .sc = k;
/* 15 */             k = arrayOfByte2.getInt(); int m = arrayOfByte2.position(); boolean bool1 = false; this(false, (byte)0, m, k);
/* 16 */             (x9.ls[b4])
/* 17 */               .jA0[bool1] = wa;
/*    */             
/* 19 */             arrayOfByte2.position(arrayOfByte2.position() + k); b4 = (byte)(b4 + 1); }  b2++; }  b1 = (byte)(b1 + 1); }  for (int i = arrayOfByte2.getInt(); b1 < i; ) { wc wc; short s = arrayOfByte2.getShort(); Vp0 vp0 = Vp0.cOm1(arrayOfByte2.get()); byte[] arrayOfByte; arrayOfByte2.get(arrayOfByte = new byte[arrayOfByte2.get()]); String str; int j; byte b3; short[][] arrayOfShort; byte b4; for (str = (new String(arrayOfByte)).trim(), j = arrayOfByte2.getInt(), arrayOfShort = new short[b3 = arrayOfByte2.get()][], b4 = 0; b4 < b3; ) { byte b5; short[] arrayOfShort1; for (arrayOfShort[b4] = new short[arrayOfByte2.getShort()], b5 = 0; b5 < (arrayOfShort1 = arrayOfShort[b4]).length; ) { arrayOfShort1[b5] = arrayOfByte2.getShort(); b5++; }  b4++; }  b3 = arrayOfByte2.get(); this(vp0, s, str, j, arrayOfShort, b3); vp0
/* 20 */           .aU
/* 21 */           .Vh0(s, wc); Ua[] arrayOfUa1; byte b2;
/* 22 */         for (arrayOfUa1 = new Ua[s = arrayOfByte2.get()], b2 = 0; b2 < s; ) { Ua ua; this((ByteBuffer)arrayOfByte2); arrayOfUa1[b2] = ua; b2++; }  Ua[] arrayOfUa2; for (arrayOfUa2 = new Ua[2], j = 0; j < s; )
/* 23 */         { Ua ua; Vi vi; if ((vi = (ua = arrayOfUa1[j]).dW) != 
/* 24 */             Vi.Ny0) arrayOfUa2[vi
/* 25 */                 .hE0 - 1] = ua; 
/* 26 */           j++; }  for (wc
/* 27 */           .tX = arrayOfUa2, s = 0; s < b3; )
/* 28 */         { lPT9[] arrayOfLPT9; for (int k = (arrayOfLPT9 = lPT9.AUX).length; j < k; ) { lPT9 lPT9 = arrayOfLPT9[j]; byte b5 = arrayOfByte2.get(); wc
/* 29 */               .Mv[s][lPT9
/* 30 */                 .nV] = 
/* 31 */               new X9(wc, lPT9, b5);
/*    */             byte b6;
/* 33 */             for (X9 x9 = wc.Mv[s][lPT9.nV]; b6 < b5; )
/* 34 */             { byte b7 = arrayOfByte2.get();
/*    */               byte b8;
/* 36 */               for ((x9.ls[b6])
/* 37 */                 .sc = b7, b8 = 0; b8 < b7; ) { boolean bool = false; if (lPT9 == 
/* 38 */                   lPT9.U4) if (arrayOfByte2.get() != 0) { bool = true; } else { bool = false; }   byte b9 = arrayOfByte2.get(); if (!bool) { wa wa; int m = arrayOfByte2.getInt(), n = arrayOfByte2.position(); this(bool, b9, n, m);
/* 39 */                   (x9.ls[b6])
/* 40 */                     .jA0[b8] = wa;
/*    */                   
/* 42 */                   arrayOfByte2.position(arrayOfByte2.position() + m); } else { wa wa; byte b10 = (byte)arrayOfByte2.getInt(); int m = arrayOfByte2.getInt(), n = arrayOfByte2.getInt(); this(bool, b9, b10, m, n);
/* 43 */                   (x9.ls[b6])
/* 44 */                     .jA0[b8] = wa; }
/* 45 */                  b8 = (byte)(b8 + 1); }  b6 = (byte)(b6 + 1); }  j++; }  s++; }  b1++; }  return true; } catch (Exception exception)
/* 46 */     { Et.error("", exception); return false; }
/*    */      }
/*    */ 
/*    */   
/*    */   public static final ik Et = C00.gd(GF0.class); }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/GF0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */