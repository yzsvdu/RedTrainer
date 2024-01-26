/*  1 */ package f;public final class jJ { public T7 UQ; public boolean nf; public yA0 UP; public NC0 lO; public static boolean V4(Fi paramFi, int paramInt, pz parampz, short[] paramArrayOfshort, NC0 paramNC0) { int i; if (paramInt < 0 || paramInt >= paramFi.Nr0)
/*    */     {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 12 */       return false; }  w2 w2 = (paramFi.AE0[paramInt]).Ri; if ((paramInt = paramFi.yD0) != 0) { if (paramInt != 1) { if (paramInt != 2) { parampz.Wx0 = 0; } else { parampz.Wx0 = w2.BK0; if (paramArrayOfshort != null) { paramArrayOfshort[0] = 256; paramArrayOfshort[1] = 0; paramArrayOfshort[2] = 0; paramArrayOfshort[3] = 256; }  paramNC0.x = w2.rv; paramNC0.y = w2.tq; }  } else { parampz.Wx0 = w2.BK0; paramInt = (int)(Math.sin(w2.Vf0 * 6.283185307179586D / 65536.0D) * 4096.0D); i = (int)(Math.cos(w2.Vf0 * 6.283185307179586D / 65536.0D) * 4096.0D); if (paramArrayOfshort != null) { paramArrayOfshort[0] = (short)(i / (paramInt = w2.dF)); paramArrayOfshort[1] = (short)(paramInt * 256 / paramInt); paramArrayOfshort[2] = (short)(-paramInt * 256 / (paramInt = w2.r3)); paramArrayOfshort[3] = (short)((i *= 256) / paramInt); }  paramNC0.x = w2.rv; paramNC0.y = w2.tq; }  } else { i.Wx0 = w2.BK0; if (paramArrayOfshort != null) { paramArrayOfshort[0] = 256; paramArrayOfshort[1] = 0; paramArrayOfshort[2] = 0; paramArrayOfshort[3] = 256; }  }  return true; }
/*    */ 
/*    */   
/*    */   public pz CW;
/*    */   public NC0 n90;
/*    */   public NC0 ra0;
/*    */   
/*    */   public jJ(T7 paramT7, boolean paramBoolean) {
/*    */     yA0 yA01;
/*    */     NC0 nC02;
/*    */     pz pz1;
/*    */     NC0 nC01;
/*    */     this();
/*    */     this.UP = this;
/*    */     this();
/*    */     this.lO = this;
/*    */     this();
/*    */     this.CW = this;
/*    */     this();
/*    */     this.n90 = this;
/*    */     this();
/*    */     this.ra0 = this;
/*    */     this.UQ = paramT7;
/*    */     this.nf = paramBoolean;
/*    */     kq0();
/*    */   }
/*    */   
/*    */   public final int su(int paramInt) {
/*    */     int i = 0;
/*    */     yA0 yA01;
/*    */     if (paramInt < 0 || paramInt >= (yA01 = this.UP).gr)
/*    */       return -1; 
/*    */     Fi fi;
/*    */     nG0[] arrayOfNG0 = (fi = this.Py[paramInt]).AE0;
/*    */     for (byte b = 0; b < this.Nr0; b++)
/*    */       i += (arrayOfNG0[b]).Zr0; 
/*    */     return i;
/*    */   }
/*    */   
/*    */   public final int yA0(int paramInt, short paramShort) {
/*    */     yA0 yA01;
/*    */     if (paramShort < 0 || paramShort >= (yA01 = this.UP).gr)
/*    */       return -1; 
/*    */     Fi fi;
/*    */     nG0[] arrayOfNG0 = (fi = this.Py[paramShort]).AE0;
/*    */     short s1 = 0;
/*    */     short s2;
/*    */     for (s2 = 0; s2 < this.Nr0; s2++) {
/*    */       short s;
/*    */       if (paramInt < (s = (arrayOfNG0[s2]).Zr0))
/*    */         return s2; 
/*    */       paramInt -= s;
/*    */       s1 = (short)(s1 + s);
/*    */     } 
/*    */     if (s1 == 0)
/*    */       return 0; 
/*    */     paramInt %= s1;
/*    */     for (s1 = 0; s1 < this.Nr0; s1++) {
/*    */       if (paramInt < (s2 = (arrayOfNG0[s1]).Zr0))
/*    */         return s1; 
/*    */       paramInt -= s2;
/*    */     } 
/*    */     return 0;
/*    */   }
/*    */   
/*    */   public final boolean dj(int paramInt1, int paramInt2, int paramInt3, Y3 paramY3, jJ paramjJ, LD paramLD, ek0 paramek0, vJ paramvJ, ZH paramZH, NC0 paramNC0) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: iflt -> 352
/*    */     //   4: iload_1
/*    */     //   5: aload_0
/*    */     //   6: getfield UP : Lf/yA0;
/*    */     //   9: dup
/*    */     //   10: astore_0
/*    */     //   11: getfield gr : S
/*    */     //   14: if_icmplt -> 20
/*    */     //   17: goto -> 352
/*    */     //   20: aload_0
/*    */     //   21: getfield Py : [Lf/Fi;
/*    */     //   24: iload_1
/*    */     //   25: aaload
/*    */     //   26: iload_2
/*    */     //   27: new f/pz
/*    */     //   30: dup
/*    */     //   31: astore_0
/*    */     //   32: invokespecial <init> : ()V
/*    */     //   35: iconst_4
/*    */     //   36: newarray short
/*    */     //   38: new f/NC0
/*    */     //   41: dup
/*    */     //   42: astore_1
/*    */     //   43: invokespecial <init> : ()V
/*    */     //   46: aload_0
/*    */     //   47: swap
/*    */     //   48: aload_1
/*    */     //   49: invokestatic V4 : (Lf/Fi;ILf/pz;[SLf/NC0;)Z
/*    */     //   52: ifne -> 57
/*    */     //   55: iconst_0
/*    */     //   56: ireturn
/*    */     //   57: aload_0
/*    */     //   58: aload_1
/*    */     //   59: dup
/*    */     //   60: dup2
/*    */     //   61: getfield x : F
/*    */     //   64: aload #10
/*    */     //   66: getfield x : F
/*    */     //   69: fadd
/*    */     //   70: putfield x : F
/*    */     //   73: getfield y : F
/*    */     //   76: aload #10
/*    */     //   78: getfield y : F
/*    */     //   81: fadd
/*    */     //   82: putfield y : F
/*    */     //   85: getfield Wx0 : I
/*    */     //   88: dup
/*    */     //   89: istore_0
/*    */     //   90: iflt -> 344
/*    */     //   93: iload_0
/*    */     //   94: aload #4
/*    */     //   96: getfield Sq : Lf/xT;
/*    */     //   99: getfield Pj : S
/*    */     //   102: if_icmplt -> 108
/*    */     //   105: goto -> 350
/*    */     //   108: aload #4
/*    */     //   110: getfield VA : [Lf/Ji0;
/*    */     //   113: iload_0
/*    */     //   114: aaload
/*    */     //   115: dup
/*    */     //   116: astore_0
/*    */     //   117: getfield lz0 : [Lf/v0;
/*    */     //   120: astore_2
/*    */     //   121: iconst_0
/*    */     //   122: istore #4
/*    */     //   124: iload #4
/*    */     //   126: aload_0
/*    */     //   127: getfield u4 : S
/*    */     //   130: dup
/*    */     //   131: istore #10
/*    */     //   133: if_icmpge -> 340
/*    */     //   136: aload #5
/*    */     //   138: iload_3
/*    */     //   139: aload_2
/*    */     //   140: iload #10
/*    */     //   142: iconst_1
/*    */     //   143: isub
/*    */     //   144: iload #4
/*    */     //   146: isub
/*    */     //   147: aaload
/*    */     //   148: dup
/*    */     //   149: astore #10
/*    */     //   151: new f/NC0
/*    */     //   154: dup
/*    */     //   155: astore #11
/*    */     //   157: aload_1
/*    */     //   158: getfield x : F
/*    */     //   161: aload #10
/*    */     //   163: getfield Br : S
/*    */     //   166: i2f
/*    */     //   167: fadd
/*    */     //   168: aload_1
/*    */     //   169: getfield y : F
/*    */     //   172: aload #10
/*    */     //   174: getfield s30 : S
/*    */     //   177: i2f
/*    */     //   178: fadd
/*    */     //   179: invokespecial <init> : (FF)V
/*    */     //   182: getfield QK0 : S
/*    */     //   185: invokevirtual yA0 : (IS)I
/*    */     //   188: dup
/*    */     //   189: istore #12
/*    */     //   191: ifge -> 197
/*    */     //   194: goto -> 350
/*    */     //   197: aload #10
/*    */     //   199: getfield QK0 : S
/*    */     //   202: dup
/*    */     //   203: istore #10
/*    */     //   205: iflt -> 327
/*    */     //   208: iload #10
/*    */     //   210: aload #5
/*    */     //   212: getfield UP : Lf/yA0;
/*    */     //   215: dup
/*    */     //   216: astore #13
/*    */     //   218: getfield gr : S
/*    */     //   221: if_icmplt -> 227
/*    */     //   224: goto -> 327
/*    */     //   227: aload #13
/*    */     //   229: getfield Py : [Lf/Fi;
/*    */     //   232: iload #10
/*    */     //   234: aaload
/*    */     //   235: iload #12
/*    */     //   237: new f/pz
/*    */     //   240: dup
/*    */     //   241: astore #10
/*    */     //   243: invokespecial <init> : ()V
/*    */     //   246: iconst_4
/*    */     //   247: newarray short
/*    */     //   249: astore #12
/*    */     //   251: new f/NC0
/*    */     //   254: dup
/*    */     //   255: astore #13
/*    */     //   257: invokespecial <init> : ()V
/*    */     //   260: aload #10
/*    */     //   262: aload #12
/*    */     //   264: aload #13
/*    */     //   266: invokestatic V4 : (Lf/Fi;ILf/pz;[SLf/NC0;)Z
/*    */     //   269: ifne -> 275
/*    */     //   272: goto -> 327
/*    */     //   275: aload #6
/*    */     //   277: aload #10
/*    */     //   279: aload #13
/*    */     //   281: dup
/*    */     //   282: dup2
/*    */     //   283: getfield x : F
/*    */     //   286: aload #11
/*    */     //   288: getfield x : F
/*    */     //   291: fadd
/*    */     //   292: putfield x : F
/*    */     //   295: getfield y : F
/*    */     //   298: aload #11
/*    */     //   300: getfield y : F
/*    */     //   303: fadd
/*    */     //   304: putfield y : F
/*    */     //   307: getfield Wx0 : I
/*    */     //   310: aload #7
/*    */     //   312: aload #8
/*    */     //   314: aload #9
/*    */     //   316: aload #13
/*    */     //   318: aload #12
/*    */     //   320: invokevirtual Ll : (ILf/ek0;Lf/vJ;Lf/ZH;Lf/NC0;[S)V
/*    */     //   323: iconst_1
/*    */     //   324: goto -> 328
/*    */     //   327: iconst_0
/*    */     //   328: ifne -> 334
/*    */     //   331: goto -> 350
/*    */     //   334: iinc #4, 1
/*    */     //   337: goto -> 124
/*    */     //   340: iconst_1
/*    */     //   341: goto -> 351
/*    */     //   344: aload #4
/*    */     //   346: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   349: pop
/*    */     //   350: iconst_0
/*    */     //   351: ireturn
/*    */     //   352: iconst_0
/*    */     //   353: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 85
/*    */     //   #2	-> 96
/*    */     //   #3	-> 99
/*    */     //   #4	-> 212
/*    */     //   #5	-> 307
/*    */     //   #6	-> 320
/*    */     //   #7	-> 346
/*    */   }
/*    */   
/*    */   public final boolean COM7(int paramInt1, int paramInt2, int paramInt3, int paramInt4, Y3 paramY3, jJ paramjJ) {
/*    */     yA0 yA01;
/*    */     if (paramInt1 < 0 || paramInt1 >= (yA01 = this.UP).gr)
/*    */       return true; 
/*    */     if (paramY3 == null || paramjJ == null)
/*    */       return true; 
/*    */     if ((null = ((this.Py[paramInt1]).AE0[paramInt2]).Ri.BK0) >= 0 && null < paramY3.Sq.Pj) {
/*    */       Ji0 ji0;
/*    */       short s;
/*    */       for (v0[] arrayOfV0 = (ji0 = paramY3.VA[null]).lz0; paramInt2 < (s = this.u4); ) {
/*    */         v0 v0;
/*    */         if (paramjJ.yA0(paramInt3, (v0 = arrayOfV0[s - 1 - paramInt2]).QK0) != paramjJ.yA0(paramInt4, v0.QK0)) {
/*    */           boolean bool = false;
/*    */           // Byte code: goto -> 144
/*    */         } 
/*    */         paramInt2++;
/*    */       } 
/*    */     } 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final boolean lPt3(int paramInt1, int paramInt2, int paramInt3, UA0 paramUA0, NC0 paramNC0) {
/*    */     // Byte code:
/*    */     //   0: iload_1
/*    */     //   1: iflt -> 299
/*    */     //   4: iload_1
/*    */     //   5: aload_0
/*    */     //   6: getfield UP : Lf/yA0;
/*    */     //   9: dup
/*    */     //   10: astore #6
/*    */     //   12: getfield gr : S
/*    */     //   15: if_icmplt -> 21
/*    */     //   18: goto -> 299
/*    */     //   21: aload #4
/*    */     //   23: getfield tt0 : Lf/Y3;
/*    */     //   26: ifnonnull -> 75
/*    */     //   29: aload_0
/*    */     //   30: iload_1
/*    */     //   31: aload_0
/*    */     //   32: getfield lO : Lf/NC0;
/*    */     //   35: dup
/*    */     //   36: dup2
/*    */     //   37: getfield x : F
/*    */     //   40: aload #5
/*    */     //   42: getfield x : F
/*    */     //   45: fadd
/*    */     //   46: dup
/*    */     //   47: fstore_0
/*    */     //   48: putfield x : F
/*    */     //   51: getfield y : F
/*    */     //   54: aload #5
/*    */     //   56: getfield y : F
/*    */     //   59: fadd
/*    */     //   60: dup
/*    */     //   61: fstore_1
/*    */     //   62: putfield y : F
/*    */     //   65: i2s
/*    */     //   66: iload_2
/*    */     //   67: aload #4
/*    */     //   69: fload_0
/*    */     //   70: fload_1
/*    */     //   71: invokevirtual lPt1 : (SILf/UA0;FF)Z
/*    */     //   74: ireturn
/*    */     //   75: aload #6
/*    */     //   77: getfield Py : [Lf/Fi;
/*    */     //   80: iload_1
/*    */     //   81: aaload
/*    */     //   82: iload_2
/*    */     //   83: aload_0
/*    */     //   84: dup
/*    */     //   85: getfield CW : Lf/pz;
/*    */     //   88: astore_1
/*    */     //   89: getfield lO : Lf/NC0;
/*    */     //   92: astore_2
/*    */     //   93: aload_1
/*    */     //   94: aconst_null
/*    */     //   95: aload_2
/*    */     //   96: invokestatic V4 : (Lf/Fi;ILf/pz;[SLf/NC0;)Z
/*    */     //   99: ifne -> 104
/*    */     //   102: iconst_0
/*    */     //   103: ireturn
/*    */     //   104: aload_0
/*    */     //   105: aload #4
/*    */     //   107: aload_0
/*    */     //   108: getfield lO : Lf/NC0;
/*    */     //   111: dup
/*    */     //   112: dup2
/*    */     //   113: getfield x : F
/*    */     //   116: aload #5
/*    */     //   118: getfield x : F
/*    */     //   121: fadd
/*    */     //   122: dup
/*    */     //   123: fstore_0
/*    */     //   124: putfield x : F
/*    */     //   127: getfield y : F
/*    */     //   130: aload #5
/*    */     //   132: getfield y : F
/*    */     //   135: fadd
/*    */     //   136: dup
/*    */     //   137: fstore_1
/*    */     //   138: putfield y : F
/*    */     //   141: getfield tt0 : Lf/Y3;
/*    */     //   144: astore_2
/*    */     //   145: getfield CW : Lf/pz;
/*    */     //   148: getfield Wx0 : I
/*    */     //   151: dup
/*    */     //   152: istore #5
/*    */     //   154: iflt -> 292
/*    */     //   157: iload #5
/*    */     //   159: aload_2
/*    */     //   160: getfield Sq : Lf/xT;
/*    */     //   163: getfield Pj : S
/*    */     //   166: if_icmplt -> 172
/*    */     //   169: goto -> 297
/*    */     //   172: aload_2
/*    */     //   173: getfield VA : [Lf/Ji0;
/*    */     //   176: iload #5
/*    */     //   178: aaload
/*    */     //   179: dup
/*    */     //   180: astore_2
/*    */     //   181: getfield lz0 : [Lf/v0;
/*    */     //   184: astore #5
/*    */     //   186: iconst_0
/*    */     //   187: istore #6
/*    */     //   189: iload #6
/*    */     //   191: aload_2
/*    */     //   192: getfield u4 : S
/*    */     //   195: dup
/*    */     //   196: istore #7
/*    */     //   198: if_icmpge -> 288
/*    */     //   201: aload #4
/*    */     //   203: fload_1
/*    */     //   204: fload_0
/*    */     //   205: aload #5
/*    */     //   207: iload #7
/*    */     //   209: iconst_1
/*    */     //   210: isub
/*    */     //   211: iload #6
/*    */     //   213: isub
/*    */     //   214: aaload
/*    */     //   215: dup
/*    */     //   216: astore #7
/*    */     //   218: getfield Br : S
/*    */     //   221: i2f
/*    */     //   222: fadd
/*    */     //   223: fstore #8
/*    */     //   225: aload #7
/*    */     //   227: getfield s30 : S
/*    */     //   230: i2f
/*    */     //   231: fadd
/*    */     //   232: fstore #9
/*    */     //   234: getfield mA : Lf/jJ;
/*    */     //   237: iload_3
/*    */     //   238: aload #7
/*    */     //   240: getfield QK0 : S
/*    */     //   243: invokevirtual yA0 : (IS)I
/*    */     //   246: dup
/*    */     //   247: istore #10
/*    */     //   249: ifge -> 255
/*    */     //   252: goto -> 297
/*    */     //   255: aload #4
/*    */     //   257: getfield mA : Lf/jJ;
/*    */     //   260: aload #7
/*    */     //   262: getfield QK0 : S
/*    */     //   265: iload #10
/*    */     //   267: aload #4
/*    */     //   269: fload #8
/*    */     //   271: fload #9
/*    */     //   273: invokevirtual lPt1 : (SILf/UA0;FF)Z
/*    */     //   276: ifne -> 282
/*    */     //   279: goto -> 297
/*    */     //   282: iinc #6, 1
/*    */     //   285: goto -> 189
/*    */     //   288: iconst_1
/*    */     //   289: goto -> 298
/*    */     //   292: aload_2
/*    */     //   293: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   296: pop
/*    */     //   297: iconst_0
/*    */     //   298: ireturn
/*    */     //   299: iconst_0
/*    */     //   300: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 148
/*    */     //   #2	-> 160
/*    */     //   #3	-> 163
/*    */     //   #4	-> 293
/*    */   }
/*    */   
/*    */   public final boolean lPt1(short paramShort, int paramInt, UA0 paramUA0, float paramFloat1, float paramFloat2) {
/*    */     yA0 yA01;
/*    */     if (paramShort < 0 || paramShort >= (yA01 = this.UP).gr)
/*    */       return false; 
/*    */     Fi fi = yA01.Py[paramShort];
/*    */     Hr0 hr0 = (Hr0)paramUA0.Wo.obtain();
/*    */     if (paramInt < 0 || paramInt >= fi.Nr0) {
/*    */     
/*    */     } else {
/*    */       w2 w2 = (fi.AE0[paramInt]).Ri;
/*    */       if ((paramInt = fi.yD0) != 0) {
/*    */         if (paramInt != 1) {
/*    */           if (paramInt == 2) {
/*    */             hr0.bx0 = w2.BK0;
/*    */             hr0.K90 = w2.rv;
/*    */             hr0.tK = w2.tq;
/*    */           } 
/*    */         } else {
/*    */           hr0.bx0 = w2.BK0;
/*    */           hr0.K8 = w2;
/*    */           hr0.K90 = w2.rv;
/*    */           hr0.tK = w2.tq;
/*    */         } 
/*    */       } else {
/*    */         hr0.bx0 = w2.BK0;
/*    */       } 
/*    */     } 
/*    */     if (!true) {
/*    */       paramUA0.Wo.free(hr0);
/*    */       return false;
/*    */     } 
/*    */     hr0.K90 = (int)(hr0.K90 + paramFloat1);
/*    */     hr0.tK = (int)(hr0.tK + paramFloat2);
/*    */     int i = hr0.bx0;
/*    */     NC0 nC03 = this.n90, nC04 = this.ra0;
/*    */     paramUA0.Xy.rb0(i, nC03, nC04);
/*    */     NC0 nC01, nC02;
/*    */     hr0.Vb = (nC02 = this.ra0).x - (nC01 = this.n90).x / 2.0F;
/*    */     hr0.EG = nC02.y - this.y / 2.0F;
/*    */     hr0.tK = -hr0.tK;
/*    */     paramUA0.Kz.Com3(hr0);
/*    */     return true;
/*    */   }
/*    */   
/*    */   public final void kq0() {
/*    */     ByteBuffer byteBuffer;
/*    */     byte b1 = (byteBuffer = this.UQ.rb(this.nf)).getInt();
/*    */     this.UQ.rb(this.nf).getShort();
/*    */     this.UQ.rb(this.nf).getShort();
/*    */     this.UQ.rb(this.nf).getInt();
/*    */     this.UQ.rb(this.nf).getShort();
/*    */     this.UQ.rb(this.nf).getShort();
/*    */     byte b2;
/*    */     int arrayOfInt[], i;
/*    */     for ((arrayOfInt = new int[b2 = 2])[0] = 1312902738, (new int[b2 = 2])[1] = 1313685842, i = 0; i < b2; ) {
/*    */       nG0 nG0;
/*    */       if (b1 == arrayOfInt[i]) {
/*    */         byte[] arrayOfByte = new byte[4];
/*    */         this.UP.getClass();
/*    */         byteBuffer.get(arrayOfByte);
/*    */         byteBuffer.getInt();
/*    */         this.UP.getClass();
/*    */         this.UP.gr = byteBuffer.getShort();
/*    */         byteBuffer.getShort();
/*    */         this.UP.getClass();
/*    */         byteBuffer.getInt();
/*    */         this.UP.getClass();
/*    */         this.UP.Ah = byteBuffer.getInt();
/*    */         this.UP.P70 = byteBuffer.getInt();
/*    */         byteBuffer.getLong();
/*    */         this.UP.getClass();
/*    */         for (this.UP.Py = new Fi[this.UP.gr], b1 = 0; b1 < this.UP.gr; ) {
/*    */           byteBuffer.position(b1 * 16 + 48);
/*    */           this();
/*    */           fi.Nr0 = byteBuffer.getInt();
/*    */           fi.yD0 = byteBuffer.getShort();
/*    */           byteBuffer.getShort();
/*    */           byteBuffer.getShort();
/*    */           byteBuffer.getShort();
/*    */           Fi fi;
/*    */           byte b;
/*    */           for ((fi = new Fi()).y7 = byteBuffer.getInt(), (new Fi()).AE0 = new nG0[(new Fi()).Nr0], b = 0; b < fi.Nr0; ) {
/*    */             i = this.UP.Ah + 24;
/*    */             byteBuffer.position(b * 8 + i + fi.y7);
/*    */             this();
/*    */             nG0.fR = byteBuffer.getInt();
/*    */             (nG0 = new nG0()).Zr0 = byteBuffer.getShort();
/*    */             byteBuffer.getShort();
/*    */             byteBuffer.position(this.UP.P70 + 24 + nG0.fR);
/*    */             nG0.Ri.BK0 = byteBuffer.getShort();
/*    */             short s;
/*    */             if ((s = fi.yD0) != 0) {
/*    */               if (s != 1) {
/*    */                 if (s == 2) {
/*    */                   byteBuffer.getShort();
/*    */                   nG0.Ri.getClass();
/*    */                   nG0.Ri.rv = byteBuffer.getShort();
/*    */                   nG0.Ri.tq = byteBuffer.getShort();
/*    */                 } 
/*    */               } else {
/*    */                 nG0.Ri.Vf0 = byteBuffer.getShort();
/*    */                 nG0.Ri.dF = byteBuffer.getInt();
/*    */                 nG0.Ri.r3 = byteBuffer.getInt();
/*    */                 nG0.Ri.rv = byteBuffer.getShort();
/*    */                 nG0.Ri.tq = byteBuffer.getShort();
/*    */               } 
/*    */             } else {
/*    */               byteBuffer.getShort();
/*    */               nG0.Ri.getClass();
/*    */             } 
/*    */             fi.AE0[b] = nG0;
/*    */             b++;
/*    */           } 
/*    */           this.UP.Py[b1] = fi;
/*    */           b1++;
/*    */         } 
/*    */         return;
/*    */       } 
/*    */       nG0++;
/*    */     } 
/*    */     throw new RuntimeException(XD0.SD0("Header magic mismatch = ", b1));
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/jJ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */