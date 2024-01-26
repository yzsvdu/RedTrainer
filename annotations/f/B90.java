/* 1 */ package f;public final class B90 extends GS implements Np0 { public final byte Gs0; public final byte[][] io0; private void bg0(byte[] paramArrayOfbyte, kf paramkf, String[] paramArrayOfString, hm0 paramhm01, hm0 paramhm02, byte paramByte1, byte paramByte2, Gp0 paramGp0) { byte b1, b2; if ((b1 = paramArrayOfbyte[0]) == (b2 = paramArrayOfbyte[1])) { paramkf.Kq(Ml0.OH0(206007)); (arrayOfByte = new byte[2])[0] = 5; (new byte[2])[1] = 6; paramkf.Kq(Ml0.Nq0(205360, this, paramArrayOfString)); paramkf.t80(new ho(paramkf, paramhm01, true)); paramkf.t80(new ho(paramkf, paramhm02, true)); } else { String str; int j = 206005; byte[] arrayOfByte1; (arrayOfByte1 = new byte[4])[0] = 0; (new byte[4])[1] = 1; (new byte[4])[2] = 35; (new byte[4])[3] = 5; arrayOfString[0] = Byte.toString(paramArrayOfbyte[paramByte1]); arrayOfString[1] = Byte.toString(paramArrayOfbyte[paramByte2]); String[] arrayOfString; (arrayOfString = new String[4])[2] = paramGp0.wB(b).dy(); int i = 3; byte b; if ((b = (byte)((arrayOfByte > b2) ? 0 : 1)) == paramByte1) { str = paramhm02.fA(); } else { str = paramhm01.fA(); }  arrayOfString[i] = str; paramkf.Kq(Ml0.Nq0(j, arrayOfByte1, arrayOfString)); i = ((paramByte1 == b) ? 358 : 359) + 205000; paramkf.Kq(Ml0.Nq0(i, new byte[] { 5, 6 }, paramArrayOfString)); paramkf.t80(new ho(paramkf, paramGp0.N0(Gp0.Sr0(b), (byte)0), true)); }  this(paramkf, paramhm02, paramhm01); byte[] arrayOfByte; Q40 q40; paramkf.YP
/* 2 */       .add(this); } public B90(byte paramByte) { if (paramByte == 1) { this.Gs0 = paramByte; this.io0 = null; return; }  throw new RuntimeException(); } public B90(byte paramByte, byte[][] paramArrayOfbyte) { if (paramByte == 0) { this.Gs0 = paramByte; this.io0 = paramArrayOfbyte; return; }  throw new RuntimeException(); } public static void yn(kf paramkf, int paramInt, byte[][] paramArrayOfbyte, byte[] paramArrayOfbyte1) { // Byte code:
/*   */     //   0: aload_2
/*   */     //   1: aload_0
/*   */     //   2: dup
/*   */     //   3: iload_1
/*   */     //   4: dup
/*   */     //   5: ldc 206002
/*   */     //   7: iadd
/*   */     //   8: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   11: astore_0
/*   */     //   12: aload_2
/*   */     //   13: <illegal opcode> run : (Lf/kf;I[[B)Ljava/lang/Runnable;
/*   */     //   18: astore #4
/*   */     //   20: aload_0
/*   */     //   21: ldc ''
/*   */     //   23: aload #4
/*   */     //   25: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   28: iconst_0
/*   */     //   29: aaload
/*   */     //   30: iload_1
/*   */     //   31: baload
/*   */     //   32: dup
/*   */     //   33: istore_0
/*   */     //   34: aload_2
/*   */     //   35: iconst_1
/*   */     //   36: aaload
/*   */     //   37: iload_1
/*   */     //   38: baload
/*   */     //   39: dup
/*   */     //   40: istore_1
/*   */     //   41: if_icmpne -> 66
/*   */     //   44: aload_3
/*   */     //   45: dup
/*   */     //   46: dup2
/*   */     //   47: iconst_0
/*   */     //   48: baload
/*   */     //   49: iconst_1
/*   */     //   50: iadd
/*   */     //   51: i2b
/*   */     //   52: iconst_0
/*   */     //   53: swap
/*   */     //   54: bastore
/*   */     //   55: iconst_1
/*   */     //   56: baload
/*   */     //   57: iconst_1
/*   */     //   58: iadd
/*   */     //   59: i2b
/*   */     //   60: iconst_1
/*   */     //   61: swap
/*   */     //   62: bastore
/*   */     //   63: goto -> 94
/*   */     //   66: iload_0
/*   */     //   67: iload_1
/*   */     //   68: if_icmple -> 84
/*   */     //   71: aload_3
/*   */     //   72: dup
/*   */     //   73: iconst_0
/*   */     //   74: baload
/*   */     //   75: iconst_2
/*   */     //   76: iadd
/*   */     //   77: i2b
/*   */     //   78: iconst_0
/*   */     //   79: swap
/*   */     //   80: bastore
/*   */     //   81: goto -> 94
/*   */     //   84: aload_3
/*   */     //   85: dup
/*   */     //   86: iconst_1
/*   */     //   87: baload
/*   */     //   88: iconst_2
/*   */     //   89: iadd
/*   */     //   90: i2b
/*   */     //   91: iconst_1
/*   */     //   92: swap
/*   */     //   93: bastore
/*   */     //   94: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 21
/* 2 */     //   #2	-> 29 } public static void Mw(kf paramkf, int paramInt, byte[][] paramArrayOfbyte) { gx gx; if ((gx = paramkf.lG0) != null) gx.kf0(paramInt, paramArrayOfbyte);  }
/*   */ 
/*   */   
/*   */   public final byte YG0() {
/*   */     return 81;
/*   */   }
/*   */   
/*   */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*   */     // Byte code:
/*   */     //   0: aload #7
/*   */     //   2: aload_0
/*   */     //   3: getfield Gs0 : B
/*   */     //   6: istore_1
/*   */     //   7: getfield AD : Lf/Gp0;
/*   */     //   10: dup
/*   */     //   11: astore_2
/*   */     //   12: ifnonnull -> 16
/*   */     //   15: return
/*   */     //   16: aload_2
/*   */     //   17: dup
/*   */     //   18: dup
/*   */     //   19: invokevirtual hG0 : ()B
/*   */     //   22: istore_3
/*   */     //   23: invokevirtual nI : ()B
/*   */     //   26: istore #4
/*   */     //   28: iload_3
/*   */     //   29: iconst_0
/*   */     //   30: invokevirtual N0 : (BB)Lf/hm0;
/*   */     //   33: dup
/*   */     //   34: astore #5
/*   */     //   36: aload_2
/*   */     //   37: iload #4
/*   */     //   39: iconst_0
/*   */     //   40: invokevirtual N0 : (BB)Lf/hm0;
/*   */     //   43: astore #6
/*   */     //   45: ifnull -> 289
/*   */     //   48: aload #6
/*   */     //   50: ifnonnull -> 56
/*   */     //   53: goto -> 289
/*   */     //   56: iload_1
/*   */     //   57: iconst_2
/*   */     //   58: anewarray java/lang/String
/*   */     //   61: dup
/*   */     //   62: astore #8
/*   */     //   64: aload #6
/*   */     //   66: aload #8
/*   */     //   68: aload #5
/*   */     //   70: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   73: iconst_0
/*   */     //   74: swap
/*   */     //   75: aastore
/*   */     //   76: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   79: iconst_1
/*   */     //   80: swap
/*   */     //   81: aastore
/*   */     //   82: ifeq -> 122
/*   */     //   85: iload_1
/*   */     //   86: iconst_1
/*   */     //   87: if_icmpeq -> 93
/*   */     //   90: goto -> 288
/*   */     //   93: aload #7
/*   */     //   95: iconst_2
/*   */     //   96: newarray byte
/*   */     //   98: dup
/*   */     //   99: dup
/*   */     //   100: astore_0
/*   */     //   101: iconst_0
/*   */     //   102: iconst_5
/*   */     //   103: bastore
/*   */     //   104: iconst_1
/*   */     //   105: bipush #6
/*   */     //   107: bastore
/*   */     //   108: ldc 206008
/*   */     //   110: aload_0
/*   */     //   111: aload #8
/*   */     //   113: invokestatic Nq0 : (I[B[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   116: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   119: goto -> 288
/*   */     //   122: aload #7
/*   */     //   124: aload_0
/*   */     //   125: getfield io0 : [[B
/*   */     //   128: astore_1
/*   */     //   129: getfield lG0 : Lf/gx;
/*   */     //   132: ifnull -> 138
/*   */     //   135: goto -> 180
/*   */     //   138: aload #7
/*   */     //   140: dup
/*   */     //   141: dup
/*   */     //   142: new f/gx
/*   */     //   145: dup
/*   */     //   146: astore #9
/*   */     //   148: aload #6
/*   */     //   150: aload #5
/*   */     //   152: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   155: astore #10
/*   */     //   157: invokevirtual fA : ()Ljava/lang/String;
/*   */     //   160: aload #10
/*   */     //   162: swap
/*   */     //   163: invokespecial <init> : (Ljava/lang/String;Ljava/lang/String;)V
/*   */     //   166: aload #9
/*   */     //   168: putfield lG0 : Lf/gx;
/*   */     //   171: invokevirtual Ub : ()I
/*   */     //   174: aload #9
/*   */     //   176: swap
/*   */     //   177: invokevirtual si : (Lf/JG0;I)V
/*   */     //   180: iconst_2
/*   */     //   181: newarray byte
/*   */     //   183: astore #9
/*   */     //   185: iconst_0
/*   */     //   186: istore #10
/*   */     //   188: iload #10
/*   */     //   190: iconst_4
/*   */     //   191: if_icmpge -> 258
/*   */     //   194: iload #10
/*   */     //   196: ifne -> 212
/*   */     //   199: aload #7
/*   */     //   201: ldc 206001
/*   */     //   203: invokestatic OH0 : (I)Ljava/lang/String;
/*   */     //   206: invokevirtual Kq : (Ljava/lang/String;)V
/*   */     //   209: goto -> 252
/*   */     //   212: iload #10
/*   */     //   214: iconst_1
/*   */     //   215: isub
/*   */     //   216: istore #11
/*   */     //   218: getstatic f/A1.L7 : Lf/A1;
/*   */     //   221: iload #10
/*   */     //   223: aload #7
/*   */     //   225: iload #11
/*   */     //   227: aload_1
/*   */     //   228: aload #9
/*   */     //   230: <illegal opcode> run : (Lf/kf;I[[B[B)Ljava/lang/Runnable;
/*   */     //   235: astore #11
/*   */     //   237: sipush #2000
/*   */     //   240: imul
/*   */     //   241: i2l
/*   */     //   242: lstore #12
/*   */     //   244: aload #11
/*   */     //   246: lload #12
/*   */     //   248: invokevirtual ac0 : (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
/*   */     //   251: pop
/*   */     //   252: iinc #10, 1
/*   */     //   255: goto -> 188
/*   */     //   258: getstatic f/A1.L7 : Lf/A1;
/*   */     //   261: aload_0
/*   */     //   262: aload #9
/*   */     //   264: aload #7
/*   */     //   266: aload #8
/*   */     //   268: aload #6
/*   */     //   270: aload #5
/*   */     //   272: iload_3
/*   */     //   273: iload #4
/*   */     //   275: aload_2
/*   */     //   276: <illegal opcode> run : (Lf/B90;[BLf/kf;[Ljava/lang/String;Lf/hm0;Lf/hm0;BBLf/Gp0;)Ljava/lang/Runnable;
/*   */     //   281: ldc2_w 8500
/*   */     //   284: invokevirtual ac0 : (Ljava/lang/Runnable;J)Ljava/util/concurrent/ScheduledFuture;
/*   */     //   287: pop
/*   */     //   288: return
/*   */     //   289: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 3
/*   */     //   #2	-> 7
/*   */     //   #3	-> 19
/*   */     //   #4	-> 125
/*   */     //   #5	-> 129
/*   */     //   #6	-> 171
/*   */     //   #7	-> 181
/*   */     //   #8	-> 218
/*   */     //   #9	-> 230
/*   */     //   #10	-> 258
/*   */     //   #11	-> 276
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/B90.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */