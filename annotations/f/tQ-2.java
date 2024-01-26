/* 1 */ package f;public final class tQ implements Bu0, Xo0 { public final void zr0() { if (this.lV == null) { RD0 rD0; if ((rD0 = this.Im) != null) { if (rD0.ml
/* 2 */           .getName()
/* 3 */           .endsWith(".zktx")) { byte[] arrayOfByte = new byte[10240]; DataInputStream dataInputStream = null; try { DataInputStream dataInputStream1; this(new BufferedInputStream(new GZIPInputStream(this.Im.Yc()))); } catch (Exception exception) { throw new JU("Couldn't load zktx file '" + this.Im + "'", exception); } finally { Ui.JC0(dataInputStream); }  } else { this.lV = ByteBuffer.wrap(this.Im.iy0()); }  if (this.lV.get() == -85) { if (this.lV.get() == 75) { if (this.lV.get() == 84) { if (this.lV.get() == 88) { if (this.lV.get() == 32) { if (this.lV.get() == 49) { if (this.lV.get() == 49) { if (this.lV.get() == -69) { if (this.lV.get() == 13) { if (this.lV.get() == 10) { if (this.lV.get() == 26) { if (this.lV.get() == 10) { int i; if ((i = this.lV.getInt()) == 67305985 || i == 16909060) { if (i != 67305985) { ByteBuffer byteBuffer; ByteOrder byteOrder; if ((byteBuffer = this.lV).order() == (byteOrder = ByteOrder.BIG_ENDIAN)) byteOrder = ByteOrder.LITTLE_ENDIAN;  byteBuffer.order(byteOrder); }  this.xq = this.lV.getInt(); this.lV.getInt(); this.Ar0 = this.lV.getInt(); this.di0 = this.lV.getInt(); this.lV.getInt(); this.nz0 = this.lV.getInt(); this.HM = this.lV.getInt(); this.DO = this.lV.getInt(); this.Rk0 = this.lV.getInt(); this.nF = this.lV.getInt(); if ((this.ti0 = this.lV.getInt()) == 0) { this.ti0 = 1; this.Ed0 = true; }  i = this.lV.getInt(); this.nW = this.lV.position() + i; if (!this.lV.isDirect()) { byte b; for (i = this.nW, b = 0; b < this.ti0; ) { i = (this.lV.getInt(i) + 3 & 0xFFFFFFFC) * this.nF + 4 + i; b++; }  this.lV.limit(i); this.lV.position(0); BufferUtils.xz(i).order(this.lV.order()); BufferUtils.xz(i).put(this.lV); this.lV = BufferUtils.xz(i); }  return; }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Invalid KTX Header"); }  throw new JU("Need a file to load from"); }  throw new JU("Already prepared"); }
/*   */ 
/*   */   
/*   */   public RD0 Im;
/*   */   public int xq;
/*   */   public int Ar0;
/*   */   public int di0;
/*   */   public int nz0 = -1;
/*   */   public int HM = -1;
/*   */   public int DO = -1;
/*   */   public int Rk0;
/*   */   public int nF;
/*   */   public int ti0;
/*   */   public int nW;
/*   */   public ByteBuffer lV;
/*   */   public boolean Ed0;
/*   */   
/*   */   public tQ(RD0 paramRD0, boolean paramBoolean) {
/*   */     this.Im = paramRD0;
/*   */     this.Ed0 = paramBoolean;
/*   */   }
/*   */   
/*   */   public final EL getType() {
/*   */     return EL.Lu0;
/*   */   }
/*   */   
/*   */   public final boolean aF0() {
/*   */     return (this.lV != null);
/*   */   }
/*   */   
/*   */   public final void QI() {
/*   */     pk0(34067);
/*   */   }
/*   */   
/*   */   public final void pk0(int paramInt) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield lV : Ljava/nio/ByteBuffer;
/*   */     //   4: ifnull -> 823
/*   */     //   7: aload_0
/*   */     //   8: bipush #16
/*   */     //   10: invokestatic mt0 : (I)Ljava/nio/IntBuffer;
/*   */     //   13: astore_2
/*   */     //   14: iconst_0
/*   */     //   15: istore_3
/*   */     //   16: getfield xq : I
/*   */     //   19: dup
/*   */     //   20: istore #4
/*   */     //   22: ifeq -> 32
/*   */     //   25: aload_0
/*   */     //   26: getfield Ar0 : I
/*   */     //   29: ifne -> 44
/*   */     //   32: iload #4
/*   */     //   34: aload_0
/*   */     //   35: getfield Ar0 : I
/*   */     //   38: iadd
/*   */     //   39: ifne -> 812
/*   */     //   42: iconst_1
/*   */     //   43: istore_3
/*   */     //   44: aload_0
/*   */     //   45: iconst_1
/*   */     //   46: istore #4
/*   */     //   48: sipush #4660
/*   */     //   51: istore #5
/*   */     //   53: getfield HM : I
/*   */     //   56: ifle -> 67
/*   */     //   59: iconst_2
/*   */     //   60: istore #4
/*   */     //   62: sipush #3553
/*   */     //   65: istore #5
/*   */     //   67: aload_0
/*   */     //   68: getfield DO : I
/*   */     //   71: ifle -> 82
/*   */     //   74: iconst_3
/*   */     //   75: istore #4
/*   */     //   77: sipush #4660
/*   */     //   80: istore #5
/*   */     //   82: aload_0
/*   */     //   83: getfield nF : I
/*   */     //   86: dup
/*   */     //   87: istore #6
/*   */     //   89: bipush #6
/*   */     //   91: if_icmpne -> 117
/*   */     //   94: iload #4
/*   */     //   96: iconst_2
/*   */     //   97: if_icmpne -> 107
/*   */     //   100: ldc 34067
/*   */     //   102: istore #5
/*   */     //   104: goto -> 123
/*   */     //   107: new f/JU
/*   */     //   110: dup
/*   */     //   111: ldc 'cube map needs 2D faces'
/*   */     //   113: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   116: athrow
/*   */     //   117: iload #6
/*   */     //   119: iconst_1
/*   */     //   120: if_icmpne -> 801
/*   */     //   123: aload_0
/*   */     //   124: getfield Rk0 : I
/*   */     //   127: ifle -> 170
/*   */     //   130: iload #5
/*   */     //   132: sipush #4660
/*   */     //   135: if_icmpne -> 141
/*   */     //   138: goto -> 149
/*   */     //   141: iload #5
/*   */     //   143: sipush #3553
/*   */     //   146: if_icmpne -> 160
/*   */     //   149: sipush #4660
/*   */     //   152: istore #5
/*   */     //   154: iinc #4, 1
/*   */     //   157: goto -> 170
/*   */     //   160: new f/JU
/*   */     //   163: dup
/*   */     //   164: ldc 'No API for 3D and cube arrays yet'
/*   */     //   166: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   169: athrow
/*   */     //   170: iload #5
/*   */     //   172: sipush #4660
/*   */     //   175: if_icmpeq -> 790
/*   */     //   178: iload #6
/*   */     //   180: iconst_m1
/*   */     //   181: istore #7
/*   */     //   183: bipush #6
/*   */     //   185: if_icmpne -> 228
/*   */     //   188: iload_1
/*   */     //   189: ldc 34067
/*   */     //   191: if_icmpeq -> 228
/*   */     //   194: ldc 34069
/*   */     //   196: iload_1
/*   */     //   197: if_icmpgt -> 218
/*   */     //   200: iload_1
/*   */     //   201: ldc 34074
/*   */     //   203: if_icmpgt -> 218
/*   */     //   206: iload_1
/*   */     //   207: ldc 34069
/*   */     //   209: isub
/*   */     //   210: istore #7
/*   */     //   212: ldc 34069
/*   */     //   214: istore_1
/*   */     //   215: goto -> 312
/*   */     //   218: new f/JU
/*   */     //   221: dup
/*   */     //   222: ldc 'You must specify either GL_TEXTURE_CUBE_MAP to bind all 6 faces of the cube or the requested face GL_TEXTURE_CUBE_MAP_POSITIVE_X and followings.'
/*   */     //   224: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   227: athrow
/*   */     //   228: iload #6
/*   */     //   230: bipush #6
/*   */     //   232: if_icmpne -> 247
/*   */     //   235: iload_1
/*   */     //   236: ldc 34067
/*   */     //   238: if_icmpne -> 247
/*   */     //   241: ldc 34069
/*   */     //   243: istore_1
/*   */     //   244: goto -> 312
/*   */     //   247: iload_1
/*   */     //   248: iload #5
/*   */     //   250: if_icmpeq -> 312
/*   */     //   253: ldc 34069
/*   */     //   255: iload_1
/*   */     //   256: if_icmpgt -> 275
/*   */     //   259: iload_1
/*   */     //   260: ldc 34074
/*   */     //   262: if_icmpgt -> 275
/*   */     //   265: iload_1
/*   */     //   266: sipush #3553
/*   */     //   269: if_icmpne -> 275
/*   */     //   272: goto -> 312
/*   */     //   275: new f/JU
/*   */     //   278: dup
/*   */     //   279: ldc 'Invalid target requested : 0x'
/*   */     //   281: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   284: iload_1
/*   */     //   285: invokestatic toHexString : (I)Ljava/lang/String;
/*   */     //   288: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   291: ldc_w ', expecting : 0x'
/*   */     //   294: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   297: iload #5
/*   */     //   299: invokestatic toHexString : (I)Ljava/lang/String;
/*   */     //   302: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*   */     //   305: invokevirtual toString : ()Ljava/lang/String;
/*   */     //   308: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   311: athrow
/*   */     //   312: aload_2
/*   */     //   313: getstatic f/UB0.go : Lf/hj0;
/*   */     //   316: sipush #3317
/*   */     //   319: aload_2
/*   */     //   320: invokeinterface glGetIntegerv : (ILjava/nio/IntBuffer;)V
/*   */     //   325: iconst_0
/*   */     //   326: invokevirtual get : (I)I
/*   */     //   329: dup
/*   */     //   330: istore_2
/*   */     //   331: iconst_4
/*   */     //   332: if_icmpeq -> 347
/*   */     //   335: getstatic f/UB0.go : Lf/hj0;
/*   */     //   338: sipush #3317
/*   */     //   341: iconst_4
/*   */     //   342: invokeinterface glPixelStorei : (II)V
/*   */     //   347: aload_0
/*   */     //   348: dup
/*   */     //   349: dup
/*   */     //   350: getfield di0 : I
/*   */     //   353: istore #5
/*   */     //   355: getfield Ar0 : I
/*   */     //   358: istore #6
/*   */     //   360: getfield nW : I
/*   */     //   363: istore #8
/*   */     //   365: iconst_0
/*   */     //   366: istore #9
/*   */     //   368: iload #9
/*   */     //   370: aload_0
/*   */     //   371: getfield ti0 : I
/*   */     //   374: if_icmpge -> 738
/*   */     //   377: aload_0
/*   */     //   378: dup
/*   */     //   379: dup
/*   */     //   380: dup2
/*   */     //   381: getfield nz0 : I
/*   */     //   384: iload #9
/*   */     //   386: ishr
/*   */     //   387: iconst_1
/*   */     //   388: swap
/*   */     //   389: invokestatic max : (II)I
/*   */     //   392: istore #10
/*   */     //   394: getfield HM : I
/*   */     //   397: iload #9
/*   */     //   399: ishr
/*   */     //   400: iconst_1
/*   */     //   401: swap
/*   */     //   402: invokestatic max : (II)I
/*   */     //   405: istore #11
/*   */     //   407: getfield DO : I
/*   */     //   410: iload #9
/*   */     //   412: ishr
/*   */     //   413: iconst_1
/*   */     //   414: swap
/*   */     //   415: invokestatic max : (II)I
/*   */     //   418: pop
/*   */     //   419: getfield lV : Ljava/nio/ByteBuffer;
/*   */     //   422: iload #8
/*   */     //   424: invokevirtual position : (I)Ljava/nio/Buffer;
/*   */     //   427: pop
/*   */     //   428: getfield lV : Ljava/nio/ByteBuffer;
/*   */     //   431: invokevirtual getInt : ()I
/*   */     //   434: dup
/*   */     //   435: istore #12
/*   */     //   437: iconst_3
/*   */     //   438: iadd
/*   */     //   439: bipush #-4
/*   */     //   441: iand
/*   */     //   442: istore #13
/*   */     //   444: iinc #8, 4
/*   */     //   447: iconst_0
/*   */     //   448: istore #14
/*   */     //   450: iload #14
/*   */     //   452: aload_0
/*   */     //   453: getfield nF : I
/*   */     //   456: if_icmpge -> 732
/*   */     //   459: iload #7
/*   */     //   461: iload #8
/*   */     //   463: iload #13
/*   */     //   465: aload_0
/*   */     //   466: getfield lV : Ljava/nio/ByteBuffer;
/*   */     //   469: iload #8
/*   */     //   471: invokevirtual position : (I)Ljava/nio/Buffer;
/*   */     //   474: pop
/*   */     //   475: iadd
/*   */     //   476: istore #8
/*   */     //   478: iconst_m1
/*   */     //   479: if_icmpeq -> 492
/*   */     //   482: iload #7
/*   */     //   484: iload #14
/*   */     //   486: if_icmpeq -> 492
/*   */     //   489: goto -> 726
/*   */     //   492: iload #4
/*   */     //   494: aload_0
/*   */     //   495: getfield lV : Ljava/nio/ByteBuffer;
/*   */     //   498: invokevirtual slice : ()Ljava/nio/ByteBuffer;
/*   */     //   501: dup
/*   */     //   502: astore #15
/*   */     //   504: iload #13
/*   */     //   506: invokevirtual limit : (I)Ljava/nio/Buffer;
/*   */     //   509: pop
/*   */     //   510: iconst_1
/*   */     //   511: if_icmpne -> 517
/*   */     //   514: goto -> 726
/*   */     //   517: iload #4
/*   */     //   519: iconst_2
/*   */     //   520: if_icmpne -> 726
/*   */     //   523: aload_0
/*   */     //   524: getfield Rk0 : I
/*   */     //   527: dup
/*   */     //   528: istore #16
/*   */     //   530: ifle -> 537
/*   */     //   533: iload #16
/*   */     //   535: istore #11
/*   */     //   537: iload_3
/*   */     //   538: ifeq -> 689
/*   */     //   541: iload #5
/*   */     //   543: ldc_w 36196
/*   */     //   546: if_icmpne -> 661
/*   */     //   549: getstatic f/UB0.M60 : Lf/w70;
/*   */     //   552: invokevirtual getClass : ()Ljava/lang/Class;
/*   */     //   555: pop
/*   */     //   556: ldc_w 'GL_OES_compressed_ETC1_RGB8_texture'
/*   */     //   559: invokestatic glfwExtensionSupported : (Ljava/lang/CharSequence;)Z
/*   */     //   562: ifne -> 661
/*   */     //   565: new f/dn0
/*   */     //   568: dup
/*   */     //   569: iload #10
/*   */     //   571: iload #11
/*   */     //   573: aload #15
/*   */     //   575: iconst_0
/*   */     //   576: invokespecial <init> : (IILjava/nio/ByteBuffer;I)V
/*   */     //   579: getstatic f/Uc.com9 : Lf/Uc;
/*   */     //   582: invokestatic xj0 : (Lf/dn0;Lf/Uc;)Lf/ZH;
/*   */     //   585: dup
/*   */     //   586: getstatic f/UB0.go : Lf/hj0;
/*   */     //   589: swap
/*   */     //   590: dup
/*   */     //   591: dup
/*   */     //   592: dup2
/*   */     //   593: iload_1
/*   */     //   594: iload #14
/*   */     //   596: iadd
/*   */     //   597: istore #15
/*   */     //   599: invokevirtual PB : ()I
/*   */     //   602: istore #16
/*   */     //   604: getfield Con : Lcom/badlogic/gdx/graphics/g2d/Gdx2DPixmap;
/*   */     //   607: dup
/*   */     //   608: getfield ju : I
/*   */     //   611: istore #17
/*   */     //   613: getfield Og0 : I
/*   */     //   616: istore #18
/*   */     //   618: invokevirtual qf : ()I
/*   */     //   621: istore #19
/*   */     //   623: invokevirtual i5 : ()I
/*   */     //   626: istore #20
/*   */     //   628: invokevirtual tp0 : ()Ljava/nio/ByteBuffer;
/*   */     //   631: astore #21
/*   */     //   633: iload #15
/*   */     //   635: iload #9
/*   */     //   637: iload #16
/*   */     //   639: iload #17
/*   */     //   641: iload #18
/*   */     //   643: iconst_0
/*   */     //   644: iload #19
/*   */     //   646: iload #20
/*   */     //   648: aload #21
/*   */     //   650: invokeinterface glTexImage2D : (IIIIIIIILjava/nio/Buffer;)V
/*   */     //   655: invokevirtual dispose : ()V
/*   */     //   658: goto -> 726
/*   */     //   661: getstatic f/UB0.go : Lf/hj0;
/*   */     //   664: iload_1
/*   */     //   665: iload #14
/*   */     //   667: iadd
/*   */     //   668: iload #9
/*   */     //   670: iload #5
/*   */     //   672: iload #10
/*   */     //   674: iload #11
/*   */     //   676: iconst_0
/*   */     //   677: iload #12
/*   */     //   679: aload #15
/*   */     //   681: invokeinterface glCompressedTexImage2D : (IIIIIIILjava/nio/Buffer;)V
/*   */     //   686: goto -> 726
/*   */     //   689: getstatic f/UB0.go : Lf/hj0;
/*   */     //   692: aload_0
/*   */     //   693: iload_1
/*   */     //   694: iload #14
/*   */     //   696: iadd
/*   */     //   697: istore #16
/*   */     //   699: getfield xq : I
/*   */     //   702: istore #17
/*   */     //   704: iload #16
/*   */     //   706: iload #9
/*   */     //   708: iload #5
/*   */     //   710: iload #10
/*   */     //   712: iload #11
/*   */     //   714: iconst_0
/*   */     //   715: iload #6
/*   */     //   717: iload #17
/*   */     //   719: aload #15
/*   */     //   721: invokeinterface glTexImage2D : (IIIIIIIILjava/nio/Buffer;)V
/*   */     //   726: iinc #14, 1
/*   */     //   729: goto -> 450
/*   */     //   732: iinc #9, 1
/*   */     //   735: goto -> 368
/*   */     //   738: iload_2
/*   */     //   739: iconst_4
/*   */     //   740: if_icmpeq -> 755
/*   */     //   743: getstatic f/UB0.go : Lf/hj0;
/*   */     //   746: sipush #3317
/*   */     //   749: iload_2
/*   */     //   750: invokeinterface glPixelStorei : (II)V
/*   */     //   755: aload_0
/*   */     //   756: getfield Ed0 : Z
/*   */     //   759: ifeq -> 771
/*   */     //   762: getstatic f/UB0.go : Lf/hj0;
/*   */     //   765: iload_1
/*   */     //   766: invokeinterface glGenerateMipmap : (I)V
/*   */     //   771: aload_0
/*   */     //   772: getfield lV : Ljava/nio/ByteBuffer;
/*   */     //   775: dup
/*   */     //   776: astore_1
/*   */     //   777: ifnull -> 784
/*   */     //   780: aload_1
/*   */     //   781: invokestatic lf : (Ljava/nio/ByteBuffer;)V
/*   */     //   784: aload_0
/*   */     //   785: aconst_null
/*   */     //   786: putfield lV : Ljava/nio/ByteBuffer;
/*   */     //   789: return
/*   */     //   790: new f/JU
/*   */     //   793: dup
/*   */     //   794: ldc_w 'Unsupported texture format (only 2D texture are supported in LibGdx for the time being)'
/*   */     //   797: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   800: athrow
/*   */     //   801: new f/JU
/*   */     //   804: dup
/*   */     //   805: ldc_w 'numberOfFaces must be either 1 or 6'
/*   */     //   808: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   811: athrow
/*   */     //   812: new f/JU
/*   */     //   815: dup
/*   */     //   816: ldc_w 'either both or none of glType, glFormat must be zero'
/*   */     //   819: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   822: athrow
/*   */     //   823: new f/JU
/*   */     //   826: dup
/*   */     //   827: ldc_w 'Call prepare() before calling consumeCompressedData()'
/*   */     //   830: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   833: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 279
/*   */     //   #2	-> 285
/*   */     //   #3	-> 556
/*   */     //   #4	-> 565
/*   */     //   #5	-> 604
/*   */     //   #6	-> 608
/*   */     //   #7	-> 613
/*   */     //   #8	-> 618
/*   */     //   #9	-> 756
/*   */     //   #10	-> 762
/*   */     //   #11	-> 772
/*   */     //   #12	-> 790
/*   */   }
/*   */   
/*   */   public final ZH Jw() {
/*   */     throw new JU("This TextureData implementation does not return a Pixmap");
/*   */   }
/*   */   
/*   */   public final boolean zb() {
/*   */     throw new JU("This TextureData implementation does not return a Pixmap");
/*   */   }
/*   */   
/*   */   public final int Vb() {
/*   */     return this.nz0;
/*   */   }
/*   */   
/*   */   public final int wu0() {
/*   */     return this.HM;
/*   */   }
/*   */   
/*   */   public final Uc getFormat() {
/*   */     throw new JU("This TextureData implementation directly handles texture formats.");
/*   */   }
/*   */   
/*   */   public final boolean wm0() {
/*   */     return this.Ed0;
/*   */   }
/*   */   
/*   */   public final boolean k50() {
/*   */     return true;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/tQ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */