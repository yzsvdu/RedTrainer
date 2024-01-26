/* 1 */ package f;public final class ha0 extends GS implements Np0 { public final byte TA; public final byte KP; private void Iw(PE paramPE, Wl paramWl) { paramPE.I6 = this.ut0; paramWl
/* 2 */       .yw0(this.KP, (short)518); } public final byte ut0; public ha0(byte paramByte1, byte paramByte2, byte paramByte3) { this.KP = paramByte2; this.TA = paramByte1; this.ut0 = paramByte3; } private void XO(PE paramPE, Wl paramWl) { paramPE.prn = this.ut0; paramWl.yw0(this.KP, (short)520); } private void zj(PE paramPE, Wl paramWl) { paramPE.Fy0 = this.ut0; paramWl.yw0(this.KP, (short)519); }
/*   */ 
/*   */   
/*   */   public final byte YG0() {
/*   */     return -18;
/*   */   }
/*   */   
/*   */   public final void Nl(hm0 paramhm01, hm0 paramhm02, boolean paramBoolean1, boolean paramBoolean2, short paramShort, boolean paramBoolean3, kf paramkf, b60 paramb60) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getstatic f/km.wI0 : Lf/Pw;
/*   */     //   4: getfield K7 : Lf/Wl;
/*   */     //   7: astore_3
/*   */     //   8: getstatic f/km.MR : Lf/Gp0;
/*   */     //   11: aload_0
/*   */     //   12: getfield KP : B
/*   */     //   15: invokevirtual a0 : (B)Lf/PE;
/*   */     //   18: astore #4
/*   */     //   20: getfield TA : B
/*   */     //   23: dup
/*   */     //   24: istore #5
/*   */     //   26: tableswitch default -> 68, 0 -> 333, 1 -> 333, 2 -> 201, 3 -> 136, 4 -> 136, 5 -> 71, 6 -> 71
/*   */     //   68: goto -> 403
/*   */     //   71: iload #5
/*   */     //   73: aload #7
/*   */     //   75: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   78: astore_1
/*   */     //   79: bipush #15
/*   */     //   81: istore_2
/*   */     //   82: getfield AD : Lf/Gp0;
/*   */     //   85: astore #5
/*   */     //   87: iconst_5
/*   */     //   88: if_icmpne -> 99
/*   */     //   91: sipush #164
/*   */     //   94: istore #6
/*   */     //   96: goto -> 104
/*   */     //   99: sipush #166
/*   */     //   102: istore #6
/*   */     //   104: aload_0
/*   */     //   105: aload_1
/*   */     //   106: aload #5
/*   */     //   108: aload_0
/*   */     //   109: getfield KP : B
/*   */     //   112: iload #6
/*   */     //   114: swap
/*   */     //   115: invokevirtual iD : (IB)I
/*   */     //   118: iload_2
/*   */     //   119: swap
/*   */     //   120: invokestatic Qf0 : (Lf/F40;II)Ljava/lang/String;
/*   */     //   123: astore_0
/*   */     //   124: aload #4
/*   */     //   126: aload_3
/*   */     //   127: <illegal opcode> run : (Lf/ha0;Lf/PE;Lf/Wl;)Ljava/lang/Runnable;
/*   */     //   132: astore_1
/*   */     //   133: goto -> 394
/*   */     //   136: iload #5
/*   */     //   138: aload #7
/*   */     //   140: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   143: astore_1
/*   */     //   144: bipush #15
/*   */     //   146: istore_2
/*   */     //   147: getfield AD : Lf/Gp0;
/*   */     //   150: astore #5
/*   */     //   152: iconst_3
/*   */     //   153: if_icmpne -> 164
/*   */     //   156: sipush #172
/*   */     //   159: istore #6
/*   */     //   161: goto -> 169
/*   */     //   164: sipush #174
/*   */     //   167: istore #6
/*   */     //   169: aload_0
/*   */     //   170: aload_1
/*   */     //   171: aload #5
/*   */     //   173: aload_0
/*   */     //   174: getfield KP : B
/*   */     //   177: iload #6
/*   */     //   179: swap
/*   */     //   180: invokevirtual iD : (IB)I
/*   */     //   183: iload_2
/*   */     //   184: swap
/*   */     //   185: invokestatic Qf0 : (Lf/F40;II)Ljava/lang/String;
/*   */     //   188: astore_0
/*   */     //   189: aload #4
/*   */     //   191: aload_3
/*   */     //   192: <illegal opcode> run : (Lf/ha0;Lf/PE;Lf/Wl;)Ljava/lang/Runnable;
/*   */     //   197: astore_1
/*   */     //   198: goto -> 394
/*   */     //   201: aload_0
/*   */     //   202: aload #7
/*   */     //   204: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   207: astore_0
/*   */     //   208: bipush #14
/*   */     //   210: istore_3
/*   */     //   211: getfield AD : Lf/Gp0;
/*   */     //   214: astore #4
/*   */     //   216: getfield KP : B
/*   */     //   219: dup
/*   */     //   220: istore #5
/*   */     //   222: aload #4
/*   */     //   224: sipush #1156
/*   */     //   227: istore #6
/*   */     //   229: invokevirtual hG0 : ()B
/*   */     //   232: if_icmpne -> 238
/*   */     //   235: goto -> 269
/*   */     //   238: aload #4
/*   */     //   240: iload #5
/*   */     //   242: invokevirtual wB : (B)Lf/QZ;
/*   */     //   245: dup
/*   */     //   246: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   249: pop
/*   */     //   250: instanceof f/Yu
/*   */     //   253: ifeq -> 264
/*   */     //   256: sipush #1157
/*   */     //   259: istore #6
/*   */     //   261: goto -> 269
/*   */     //   264: sipush #1158
/*   */     //   267: istore #6
/*   */     //   269: aload #7
/*   */     //   271: dup
/*   */     //   272: iconst_1
/*   */     //   273: anewarray java/lang/String
/*   */     //   276: dup
/*   */     //   277: astore #4
/*   */     //   279: aload_2
/*   */     //   280: invokevirtual coM1 : ()Ljava/lang/String;
/*   */     //   283: iconst_0
/*   */     //   284: swap
/*   */     //   285: aastore
/*   */     //   286: iconst_2
/*   */     //   287: aload_0
/*   */     //   288: iload_3
/*   */     //   289: iload #6
/*   */     //   291: aload #4
/*   */     //   293: invokestatic tG : (BLf/F40;II[Ljava/lang/String;)Ljava/lang/String;
/*   */     //   296: invokevirtual cr : (Ljava/lang/String;)V
/*   */     //   299: new f/LV
/*   */     //   302: dup
/*   */     //   303: astore_0
/*   */     //   304: new f/Ka0
/*   */     //   307: dup
/*   */     //   308: aload_2
/*   */     //   309: swap
/*   */     //   310: aload_1
/*   */     //   311: invokespecial <init> : (Lf/hm0;)V
/*   */     //   314: invokevirtual SK : (Lf/hm0;)Lf/wb;
/*   */     //   317: iconst_0
/*   */     //   318: swap
/*   */     //   319: invokespecial <init> : (BLf/wb;)V
/*   */     //   322: getfield YP : Ljava/util/LinkedList;
/*   */     //   325: aload_0
/*   */     //   326: invokevirtual add : (Ljava/lang/Object;)Z
/*   */     //   329: pop
/*   */     //   330: goto -> 403
/*   */     //   333: iload #5
/*   */     //   335: aload #7
/*   */     //   337: getstatic f/F40.ef0 : Lf/F40;
/*   */     //   340: astore_1
/*   */     //   341: bipush #15
/*   */     //   343: istore_2
/*   */     //   344: getfield AD : Lf/Gp0;
/*   */     //   347: astore #5
/*   */     //   349: ifne -> 360
/*   */     //   352: sipush #168
/*   */     //   355: istore #6
/*   */     //   357: goto -> 365
/*   */     //   360: sipush #170
/*   */     //   363: istore #6
/*   */     //   365: aload_0
/*   */     //   366: aload_1
/*   */     //   367: aload #5
/*   */     //   369: aload_0
/*   */     //   370: getfield KP : B
/*   */     //   373: iload #6
/*   */     //   375: swap
/*   */     //   376: invokevirtual iD : (IB)I
/*   */     //   379: iload_2
/*   */     //   380: swap
/*   */     //   381: invokestatic Qf0 : (Lf/F40;II)Ljava/lang/String;
/*   */     //   384: astore_0
/*   */     //   385: aload #4
/*   */     //   387: aload_3
/*   */     //   388: <illegal opcode> run : (Lf/ha0;Lf/PE;Lf/Wl;)Ljava/lang/Runnable;
/*   */     //   393: astore_1
/*   */     //   394: aload #7
/*   */     //   396: aload_0
/*   */     //   397: ldc ''
/*   */     //   399: aload_1
/*   */     //   400: invokevirtual RV : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Runnable;)V
/*   */     //   403: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 4
/*   */     //   #2	-> 8
/*   */     //   #3	-> 82
/*   */     //   #4	-> 109
/*   */     //   #5	-> 147
/*   */     //   #6	-> 174
/*   */     //   #7	-> 211
/*   */     //   #8	-> 216
/*   */     //   #9	-> 229
/*   */     //   #10	-> 242
/*   */     //   #11	-> 250
/*   */     //   #12	-> 273
/*   */     //   #13	-> 293
/*   */     //   #14	-> 296
/*   */     //   #15	-> 322
/*   */     //   #16	-> 337
/*   */     //   #17	-> 344
/*   */     //   #18	-> 370
/*   */     //   #19	-> 397
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/ha0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */