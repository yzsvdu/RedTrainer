/*  1 */ package f;public abstract class IW { public static final byte[] SB0 = new byte[] { 3, 4 }; public static final ik hj = C00.gd(IW.class); public static final eM ww = new eM(); public static boolean v9 = false; public static boolean e00() { hZ hZ = UB0.vj0.aP("data/sprites/textures.pak"); try { byte b; byte b1; for (byte[] arrayOfByte = SB0; b1 < b; ) { ww.Ed0(Byte.valueOf(arrayOfByte[b1]), new o6()); b1++; }  ByteBuffer byteBuffer; ByteBuffer.wrap(hZ.iy0()).order(ByteOrder.LITTLE_ENDIAN).position((byteBuffer = ByteBuffer.wrap(hZ.iy0()).order(ByteOrder.LITTLE_ENDIAN)).position() + 8); int i = ByteBuffer.wrap(hZ.iy0()).order(ByteOrder.LITTLE_ENDIAN).getInt(); hj.error("Mismatched textures.pak version. Expected 3 got " + i); for (b = byteBuffer.get(), b1 = 0; b1 < b; ) { byte b2 = byteBuffer.get(); int j = byteBuffer.getInt(); eM eM1;
/*    */         byte b3;
/*  3 */         for (eM1 = ((o6)ww.MF(Byte.valueOf(b2), null)).ut, b3 = 0; b3 < j; ) { F80 f80; this(byteBuffer, i); eM1.Ed0(Integer.valueOf((new F80()).hashCode()), f80); b3++; }  b1++; }  v9 = true; } catch (Exception exception) { hj.error("Error loading data package", exception); }  return false; } public static void tv0() { OutputStream outputStream; hZ hZ = UB0.vj0.N0("data/sprites/textures.pak"); ByteBuffer byteBuffer; (byteBuffer = ByteBuffer.allocate(10485760).order(ByteOrder.LITTLE_ENDIAN)).position(8); ByteBuffer.allocate(10485760).order(ByteOrder.LITTLE_ENDIAN).putInt(3); byte[] arrayOfByte2 = SB0; ByteBuffer.allocate(10485760).order(ByteOrder.LITTLE_ENDIAN).put((byte)2); for (byte b1 = 2, b2 = 0; b2 < b1; ) { byteBuffer.put(b); byte b; byteBuffer.putInt((l20(b = arrayOfByte2[b2])).uJ0); qA0 qA0; (qA0 = l20(b = arrayOfByte2[b2]).iC()).getClass(); while (qA0.hasNext()) { F80 f80; byteBuffer.putInt((f80 = (F80)qA0.next()).lq); byteBuffer.putInt(f80.da); byteBuffer.put(f80.Z0); if ((f80.Z0 & 0x1) != 0) f80.Com3(0, byteBuffer);  if ((f80.Z0 & 0x2) != 0) f80.Com3(1, byteBuffer);  if ((f80.Z0 & 0x4) != 0) f80.Com3(2, byteBuffer);  if ((f80.Z0 & 0x8) != 0) f80.Com3(3, byteBuffer);  }  b2++; }  byteBuffer
/*  4 */       .flip(); byte[] arrayOfByte1; byteBuffer.get(arrayOfByte1 = new byte[byteBuffer.limit()]); 
/*  5 */     try { (outputStream = hZ.hh())
/*  6 */         .write(arrayOfByte1); Ui.JC0(hZ.hh()); return; } catch (IOException iOException) { throw new JU("Error writing file: " + hZ.ml + " (" + hZ.KU + ")", iOException); } finally {} Ui.JC0(outputStream); throw hZ; } public static void Fr0(byte paramByte1, int paramInt1, int paramInt2, int paramInt3, byte paramByte2, int paramInt4) { this(paramInt2, paramInt3); F80 f80; eM eM1; if ((eM1 = l20(paramByte1)).uW(Integer.valueOf((new F80()).hashCode()))) { f80 = (F80)eM1.MF(Integer.valueOf(f80.hashCode()), null); } else { eM1.Ed0(Integer.valueOf(f80.hashCode()), f80); }  boolean bool = false; if (paramInt1 == 0 && ((paramInt2 = f80.Z0) & 0x1) == 0) { f80.Z0 = (byte)(paramInt2 | 0x1); f80.Dx.Ed0(Integer.valueOf(paramInt1), new fQ()); }  if (paramInt1 == 1 && ((paramInt2 = f80.Z0) & 0x2) == 0) { f80.Z0 = (byte)(paramInt2 | 0x2); f80.Dx.Ed0(Integer.valueOf(paramInt1), new fQ()); }  if (paramInt1 == 2 && ((
/*  7 */       paramInt2 = f80.Z0) & 0x4) == 0) { f80
/*  8 */         .Z0 = (byte)(paramInt2 | 0x4); f80.Dx.Ed0(Integer.valueOf(paramInt1), new fQ()); }  if (paramInt1 == 3 && ((
/*  9 */       paramInt2 = f80.Z0) & 0x8) == 0) { f80
/* 10 */         .Z0 = (byte)(paramInt2 | 0x8); f80.Dx.Ed0(Integer.valueOf(paramInt1), new fQ()); }
/*    */ 
/*    */     
/*    */     fQ fQ;
/* 14 */     for (Hc0 hc0 = (fQ = (fQ)f80.Dx.MF(Integer.valueOf(paramInt1), null)).r30(); hc0.hasNext();) { if ((tp0 = (Tp0)hc0.next()).xr0 == paramByte2) { tp0
/* 15 */           .cE0 = paramInt4; bool = true; break; }  }  if (!bool) {
/* 16 */       Tp0 tp0; this(paramInt4, paramByte2); fQ.Com3(tp0);
/*    */     }  }
/*    */ 
/*    */   
/*    */   public static eM l20(byte paramByte) {
/*    */     if (!v9)
/*    */       return null; 
/*    */     if (paramByte != 3 && paramByte != 4)
/*    */       return null; 
/*    */     return ((o6)ww.MF(Byte.valueOf(paramByte), null)).ut;
/*    */   }
/*    */   
/*    */   public static void Og(byte paramByte, int paramInt1, int paramInt2, int paramInt3) {
/*    */     eM eM1;
/*    */     if ((eM1 = l20(paramByte)).uW(Integer.valueOf(paramInt2 = paramInt2 * 1000000 + paramInt3))) {
/*    */       F80 f80;
/*    */       (f80 = (F80)eM1.MF(Integer.valueOf(paramInt2), null)).Dx.Yj0(Integer.valueOf(paramInt1));
/*    */       if (paramInt1 == 0) {
/*    */         f80.Z0 = (byte)(f80.Z0 & 0xFFFFFFFE);
/*    */       } else if (paramInt1 == 1) {
/*    */         f80.Z0 = (byte)(f80.Z0 & 0xFFFFFFFD);
/*    */       } else if (paramInt1 == 2) {
/*    */         f80.Z0 = (byte)(f80.Z0 & 0xFFFFFFFB);
/*    */       } else if (paramInt1 == 3) {
/*    */         f80.Z0 = (byte)(f80.Z0 & 0xFFFFFFF7);
/*    */       } 
/*    */       if (f80.Z0 == 0)
/*    */         eM1.Yj0(Integer.valueOf(paramInt2)); 
/*    */     } 
/*    */   }
/*    */   
/*    */   public static boolean jF(byte paramByte, int paramInt1, int paramInt2, int paramInt3) {
/*    */     // Byte code:
/*    */     //   0: iload_2
/*    */     //   1: iload_0
/*    */     //   2: invokestatic l20 : (B)Lf/eM;
/*    */     //   5: astore_0
/*    */     //   6: iflt -> 129
/*    */     //   9: aload_0
/*    */     //   10: ifnonnull -> 16
/*    */     //   13: goto -> 129
/*    */     //   16: aload_0
/*    */     //   17: iload_2
/*    */     //   18: ldc_w 1000000
/*    */     //   21: imul
/*    */     //   22: iload_3
/*    */     //   23: iadd
/*    */     //   24: dup
/*    */     //   25: istore_2
/*    */     //   26: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   29: invokevirtual uW : (Ljava/lang/Object;)Z
/*    */     //   32: ifeq -> 127
/*    */     //   35: iload_1
/*    */     //   36: aload_0
/*    */     //   37: iload_2
/*    */     //   38: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   41: aconst_null
/*    */     //   42: invokevirtual MF : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   45: checkcast f/F80
/*    */     //   48: astore_0
/*    */     //   49: ifne -> 66
/*    */     //   52: aload_0
/*    */     //   53: getfield Z0 : B
/*    */     //   56: iconst_1
/*    */     //   57: iand
/*    */     //   58: ifeq -> 66
/*    */     //   61: iconst_1
/*    */     //   62: istore_0
/*    */     //   63: goto -> 125
/*    */     //   66: iload_1
/*    */     //   67: iconst_1
/*    */     //   68: if_icmpne -> 83
/*    */     //   71: aload_0
/*    */     //   72: getfield Z0 : B
/*    */     //   75: iconst_2
/*    */     //   76: iand
/*    */     //   77: ifeq -> 83
/*    */     //   80: goto -> 61
/*    */     //   83: iload_1
/*    */     //   84: iconst_2
/*    */     //   85: if_icmpne -> 100
/*    */     //   88: aload_0
/*    */     //   89: getfield Z0 : B
/*    */     //   92: iconst_4
/*    */     //   93: iand
/*    */     //   94: ifeq -> 100
/*    */     //   97: goto -> 61
/*    */     //   100: iload_1
/*    */     //   101: iconst_3
/*    */     //   102: if_icmpne -> 118
/*    */     //   105: aload_0
/*    */     //   106: getfield Z0 : B
/*    */     //   109: bipush #8
/*    */     //   111: iand
/*    */     //   112: ifeq -> 123
/*    */     //   115: goto -> 61
/*    */     //   118: aload_0
/*    */     //   119: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   122: pop
/*    */     //   123: iconst_0
/*    */     //   124: istore_0
/*    */     //   125: iload_0
/*    */     //   126: ireturn
/*    */     //   127: iconst_0
/*    */     //   128: ireturn
/*    */     //   129: iconst_0
/*    */     //   130: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 42
/*    */     //   #2	-> 45
/*    */     //   #3	-> 53
/*    */     //   #4	-> 72
/*    */     //   #5	-> 89
/*    */     //   #6	-> 106
/*    */     //   #7	-> 119
/*    */   }
/*    */   
/*    */   public static int[] Ks0(byte paramByte, Wd paramWd, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*    */     // Byte code:
/*    */     //   0: iload_0
/*    */     //   1: invokestatic l20 : (B)Lf/eM;
/*    */     //   4: dup
/*    */     //   5: astore_0
/*    */     //   6: ifnonnull -> 11
/*    */     //   9: aconst_null
/*    */     //   10: areturn
/*    */     //   11: aload_0
/*    */     //   12: iload_3
/*    */     //   13: ldc_w 1000000
/*    */     //   16: imul
/*    */     //   17: iload #5
/*    */     //   19: iadd
/*    */     //   20: dup
/*    */     //   21: istore_3
/*    */     //   22: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   25: invokevirtual uW : (Ljava/lang/Object;)Z
/*    */     //   28: ifeq -> 171
/*    */     //   31: aload_1
/*    */     //   32: dup
/*    */     //   33: getfield TE : Lf/Yy0;
/*    */     //   36: iload #4
/*    */     //   38: invokevirtual yO : (I)Lf/vO;
/*    */     //   41: checkcast f/fk0
/*    */     //   44: getfield b70 : Lf/f20;
/*    */     //   47: astore_1
/*    */     //   48: getfield Va0 : Lf/Yy0;
/*    */     //   51: getfield ai0 : Lf/fQ;
/*    */     //   54: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   57: astore #4
/*    */     //   59: aload #4
/*    */     //   61: invokevirtual hasNext : ()Z
/*    */     //   64: ifeq -> 89
/*    */     //   67: aload #4
/*    */     //   69: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   72: checkcast f/vO
/*    */     //   75: dup
/*    */     //   76: astore #6
/*    */     //   78: getfield Vk : I
/*    */     //   81: iload #5
/*    */     //   83: if_icmpne -> 59
/*    */     //   86: goto -> 92
/*    */     //   89: aconst_null
/*    */     //   90: astore #6
/*    */     //   92: aload_0
/*    */     //   93: iload_3
/*    */     //   94: aload #6
/*    */     //   96: checkcast f/ZA0
/*    */     //   99: aload_1
/*    */     //   100: invokevirtual nH0 : (Lf/f20;)[I
/*    */     //   103: astore_0
/*    */     //   104: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   107: aconst_null
/*    */     //   108: invokevirtual MF : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   111: checkcast f/F80
/*    */     //   114: getfield Dx : Lf/eM;
/*    */     //   117: iload_2
/*    */     //   118: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   121: aconst_null
/*    */     //   122: invokevirtual MF : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   125: checkcast f/fQ
/*    */     //   128: dup
/*    */     //   129: astore_1
/*    */     //   130: ifnonnull -> 135
/*    */     //   133: aconst_null
/*    */     //   134: areturn
/*    */     //   135: aload_1
/*    */     //   136: invokevirtual r30 : ()Lf/Hc0;
/*    */     //   139: astore_1
/*    */     //   140: aload_1
/*    */     //   141: invokevirtual hasNext : ()Z
/*    */     //   144: ifeq -> 169
/*    */     //   147: aload_0
/*    */     //   148: aload_1
/*    */     //   149: invokevirtual next : ()Ljava/lang/Object;
/*    */     //   152: checkcast f/Tp0
/*    */     //   155: dup
/*    */     //   156: getfield xr0 : B
/*    */     //   159: istore_2
/*    */     //   160: getfield cE0 : I
/*    */     //   163: iload_2
/*    */     //   164: swap
/*    */     //   165: iastore
/*    */     //   166: goto -> 140
/*    */     //   169: aload_0
/*    */     //   170: areturn
/*    */     //   171: aconst_null
/*    */     //   172: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 51
/*    */     //   #2	-> 54
/*    */     //   #3	-> 96
/*    */     //   #4	-> 100
/*    */     //   #5	-> 104
/*    */     //   #6	-> 108
/*    */     //   #7	-> 111
/*    */     //   #8	-> 114
/*    */     //   #9	-> 118
/*    */     //   #10	-> 122
/*    */     //   #11	-> 125
/*    */     //   #12	-> 136
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/IW.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */