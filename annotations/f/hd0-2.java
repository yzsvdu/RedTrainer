/* 1 */ package f;public final class hd0 implements Hm { public boolean dl = true; public static String fW(DataInputStream paramDataInputStream, boolean paramBoolean, byte paramByte) { long l = -1L; if (paramByte == 83) { l = RX(paramDataInputStream, paramDataInputStream.readByte(), true); } else if (paramByte == 115)
/* 2 */     { l = (short)((short)paramDataInputStream.readByte() & 0xFF); } else if (paramBoolean)
/* 3 */     { l = RX(paramDataInputStream, paramByte, false); }  int i; if ((i = l cmp 0L) >= 0) { String str; if (i > 0) { byte[] arrayOfByte; paramDataInputStream
/* 4 */           .readFully(arrayOfByte = new byte[(int)l]); this(arrayOfByte, "UTF-8"); }
/* 5 */       else { str = ""; }  return str; }  throw new JU("Unrecognized data type, string expected"); } public final bM0 PL0(RD0 paramRD0) { try { BufferedInputStream bufferedInputStream = paramRD0.hQ(8192); DataInputStream dataInputStream = null; try { DataInputStream dataInputStream1; this(this); } catch (IOException iOException) {  } finally { DataInputStream dataInputStream1; bufferedInputStream = null; }  throw new kN(this); } catch (Exception exception)
/* 6 */     { throw new kN("Error parsing file: " + paramRD0, this); }
/*   */      }
/*   */ 
/*   */   
/*   */   public static long RX(DataInputStream paramDataInputStream, byte paramByte, boolean paramBoolean) {
/*   */     long l = -1L;
/*   */     if (paramByte == 105)
/*   */       return (short)((short)paramDataInputStream.readByte() & 0xFF); 
/*   */     if (paramByte == 73)
/*   */       return (paramDataInputStream.readShort() & 0xFFFF); 
/*   */     if (paramByte == 108)
/*   */       return paramDataInputStream.readInt() & 0xFFFFFFFFFFFFFFFFL; 
/*   */     if (paramByte == 76)
/*   */       return paramDataInputStream.readLong(); 
/*   */     return paramBoolean ? (((short)paramByte & 0xFF) << 24L | ((short)paramDataInputStream.readByte() & 0xFF) << 16L | ((short)paramDataInputStream.readByte() & 0xFF) << 8L | ((short)paramDataInputStream.readByte() & 0xFF)) : l;
/*   */   }
/*   */   
/*   */   public final bM0 K9(DataInputStream paramDataInputStream, byte paramByte) {
/*   */     // Byte code:
/*   */     //   0: iload_2
/*   */     //   1: bipush #91
/*   */     //   3: if_icmpne -> 235
/*   */     //   6: aload_1
/*   */     //   7: new f/bM0
/*   */     //   10: dup
/*   */     //   11: astore_2
/*   */     //   12: getstatic f/nc.implements : Lf/nc;
/*   */     //   15: invokespecial <init> : (Lf/nc;)V
/*   */     //   18: invokevirtual readByte : ()B
/*   */     //   21: dup
/*   */     //   22: istore_3
/*   */     //   23: iconst_0
/*   */     //   24: istore #4
/*   */     //   26: bipush #36
/*   */     //   28: if_icmpne -> 42
/*   */     //   31: aload_1
/*   */     //   32: dup
/*   */     //   33: invokevirtual readByte : ()B
/*   */     //   36: istore #4
/*   */     //   38: invokevirtual readByte : ()B
/*   */     //   41: istore_3
/*   */     //   42: iload_3
/*   */     //   43: ldc2_w -1
/*   */     //   46: lstore #5
/*   */     //   48: bipush #35
/*   */     //   50: if_icmpne -> 108
/*   */     //   53: aload_1
/*   */     //   54: dup
/*   */     //   55: invokevirtual readByte : ()B
/*   */     //   58: iconst_0
/*   */     //   59: invokestatic RX : (Ljava/io/DataInputStream;BZ)J
/*   */     //   62: dup2
/*   */     //   63: lstore #5
/*   */     //   65: lconst_0
/*   */     //   66: lcmp
/*   */     //   67: dup
/*   */     //   68: istore_3
/*   */     //   69: iflt -> 98
/*   */     //   72: iload_3
/*   */     //   73: ifne -> 79
/*   */     //   76: goto -> 233
/*   */     //   79: iload #4
/*   */     //   81: ifne -> 92
/*   */     //   84: aload_1
/*   */     //   85: invokevirtual readByte : ()B
/*   */     //   88: istore_3
/*   */     //   89: goto -> 108
/*   */     //   92: iload #4
/*   */     //   94: istore_3
/*   */     //   95: goto -> 108
/*   */     //   98: new f/JU
/*   */     //   101: dup
/*   */     //   102: ldc 'Unrecognized data type'
/*   */     //   104: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   107: athrow
/*   */     //   108: aconst_null
/*   */     //   109: astore #7
/*   */     //   111: lconst_0
/*   */     //   112: lstore #8
/*   */     //   114: aload_1
/*   */     //   115: invokevirtual available : ()I
/*   */     //   118: ifle -> 233
/*   */     //   121: iload_3
/*   */     //   122: bipush #93
/*   */     //   124: if_icmpeq -> 233
/*   */     //   127: aload #7
/*   */     //   129: aload_0
/*   */     //   130: aload_1
/*   */     //   131: iload_3
/*   */     //   132: invokevirtual K9 : (Ljava/io/DataInputStream;B)Lf/bM0;
/*   */     //   135: dup
/*   */     //   136: astore_3
/*   */     //   137: aload_2
/*   */     //   138: putfield UC : Lf/bM0;
/*   */     //   141: ifnull -> 169
/*   */     //   144: aload_2
/*   */     //   145: dup
/*   */     //   146: aload #7
/*   */     //   148: aload_3
/*   */     //   149: dup
/*   */     //   150: aload #7
/*   */     //   152: putfield Go0 : Lf/bM0;
/*   */     //   155: putfield H7 : Lf/bM0;
/*   */     //   158: getfield LG : I
/*   */     //   161: iconst_1
/*   */     //   162: iadd
/*   */     //   163: putfield LG : I
/*   */     //   166: goto -> 179
/*   */     //   169: aload_2
/*   */     //   170: dup
/*   */     //   171: aload_3
/*   */     //   172: putfield Rr0 : Lf/bM0;
/*   */     //   175: iconst_1
/*   */     //   176: putfield LG : I
/*   */     //   179: lload #5
/*   */     //   181: lconst_0
/*   */     //   182: lcmp
/*   */     //   183: ifle -> 206
/*   */     //   186: lload #8
/*   */     //   188: lconst_1
/*   */     //   189: ladd
/*   */     //   190: dup2
/*   */     //   191: lstore #7
/*   */     //   193: lload #5
/*   */     //   195: lcmp
/*   */     //   196: iflt -> 202
/*   */     //   199: goto -> 233
/*   */     //   202: lload #7
/*   */     //   204: lstore #8
/*   */     //   206: iload #4
/*   */     //   208: ifne -> 220
/*   */     //   211: aload_1
/*   */     //   212: invokevirtual readByte : ()B
/*   */     //   215: istore #7
/*   */     //   217: goto -> 224
/*   */     //   220: iload #4
/*   */     //   222: istore #7
/*   */     //   224: iload #7
/*   */     //   226: aload_3
/*   */     //   227: astore #7
/*   */     //   229: istore_3
/*   */     //   230: goto -> 114
/*   */     //   233: aload_2
/*   */     //   234: areturn
/*   */     //   235: iload_2
/*   */     //   236: bipush #123
/*   */     //   238: if_icmpne -> 478
/*   */     //   241: aload_1
/*   */     //   242: new f/bM0
/*   */     //   245: dup
/*   */     //   246: astore_2
/*   */     //   247: getstatic f/nc.Gg0 : Lf/nc;
/*   */     //   250: invokespecial <init> : (Lf/nc;)V
/*   */     //   253: invokevirtual readByte : ()B
/*   */     //   256: dup
/*   */     //   257: istore_3
/*   */     //   258: iconst_0
/*   */     //   259: istore #4
/*   */     //   261: bipush #36
/*   */     //   263: if_icmpne -> 277
/*   */     //   266: aload_1
/*   */     //   267: dup
/*   */     //   268: invokevirtual readByte : ()B
/*   */     //   271: istore #4
/*   */     //   273: invokevirtual readByte : ()B
/*   */     //   276: istore_3
/*   */     //   277: iload_3
/*   */     //   278: ldc2_w -1
/*   */     //   281: lstore #5
/*   */     //   283: bipush #35
/*   */     //   285: if_icmpne -> 332
/*   */     //   288: aload_1
/*   */     //   289: dup
/*   */     //   290: invokevirtual readByte : ()B
/*   */     //   293: iconst_0
/*   */     //   294: invokestatic RX : (Ljava/io/DataInputStream;BZ)J
/*   */     //   297: dup2
/*   */     //   298: lstore #5
/*   */     //   300: lconst_0
/*   */     //   301: lcmp
/*   */     //   302: dup
/*   */     //   303: istore_3
/*   */     //   304: iflt -> 322
/*   */     //   307: iload_3
/*   */     //   308: ifne -> 314
/*   */     //   311: goto -> 476
/*   */     //   314: aload_1
/*   */     //   315: invokevirtual readByte : ()B
/*   */     //   318: istore_3
/*   */     //   319: goto -> 332
/*   */     //   322: new f/JU
/*   */     //   325: dup
/*   */     //   326: ldc 'Unrecognized data type'
/*   */     //   328: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   331: athrow
/*   */     //   332: aconst_null
/*   */     //   333: astore #7
/*   */     //   335: lconst_0
/*   */     //   336: lstore #8
/*   */     //   338: aload_1
/*   */     //   339: invokevirtual available : ()I
/*   */     //   342: ifle -> 476
/*   */     //   345: iload_3
/*   */     //   346: bipush #125
/*   */     //   348: if_icmpeq -> 476
/*   */     //   351: iload #4
/*   */     //   353: aload_1
/*   */     //   354: iconst_1
/*   */     //   355: iload_3
/*   */     //   356: invokestatic fW : (Ljava/io/DataInputStream;ZB)Ljava/lang/String;
/*   */     //   359: astore_3
/*   */     //   360: ifne -> 372
/*   */     //   363: aload_1
/*   */     //   364: invokevirtual readByte : ()B
/*   */     //   367: istore #10
/*   */     //   369: goto -> 376
/*   */     //   372: iload #4
/*   */     //   374: istore #10
/*   */     //   376: aload #7
/*   */     //   378: aload_0
/*   */     //   379: aload_1
/*   */     //   380: iload #10
/*   */     //   382: invokevirtual K9 : (Ljava/io/DataInputStream;B)Lf/bM0;
/*   */     //   385: dup
/*   */     //   386: dup
/*   */     //   387: astore #10
/*   */     //   389: aload_3
/*   */     //   390: putfield as0 : Ljava/lang/String;
/*   */     //   393: aload_2
/*   */     //   394: putfield UC : Lf/bM0;
/*   */     //   397: ifnull -> 426
/*   */     //   400: aload_2
/*   */     //   401: dup
/*   */     //   402: aload #7
/*   */     //   404: aload #10
/*   */     //   406: dup
/*   */     //   407: aload #7
/*   */     //   409: putfield Go0 : Lf/bM0;
/*   */     //   412: putfield H7 : Lf/bM0;
/*   */     //   415: getfield LG : I
/*   */     //   418: iconst_1
/*   */     //   419: iadd
/*   */     //   420: putfield LG : I
/*   */     //   423: goto -> 437
/*   */     //   426: aload_2
/*   */     //   427: dup
/*   */     //   428: aload #10
/*   */     //   430: putfield Rr0 : Lf/bM0;
/*   */     //   433: iconst_1
/*   */     //   434: putfield LG : I
/*   */     //   437: lload #5
/*   */     //   439: lconst_0
/*   */     //   440: lcmp
/*   */     //   441: ifle -> 464
/*   */     //   444: lload #8
/*   */     //   446: lconst_1
/*   */     //   447: ladd
/*   */     //   448: dup2
/*   */     //   449: lstore #7
/*   */     //   451: lload #5
/*   */     //   453: lcmp
/*   */     //   454: iflt -> 460
/*   */     //   457: goto -> 476
/*   */     //   460: lload #7
/*   */     //   462: lstore #8
/*   */     //   464: aload_1
/*   */     //   465: invokevirtual readByte : ()B
/*   */     //   468: istore_3
/*   */     //   469: aload #10
/*   */     //   471: astore #7
/*   */     //   473: goto -> 338
/*   */     //   476: aload_2
/*   */     //   477: areturn
/*   */     //   478: iload_2
/*   */     //   479: bipush #90
/*   */     //   481: if_icmpne -> 495
/*   */     //   484: new f/bM0
/*   */     //   487: dup
/*   */     //   488: getstatic f/nc.NJ0 : Lf/nc;
/*   */     //   491: invokespecial <init> : (Lf/nc;)V
/*   */     //   494: areturn
/*   */     //   495: iload_2
/*   */     //   496: bipush #84
/*   */     //   498: if_icmpne -> 510
/*   */     //   501: new f/bM0
/*   */     //   504: dup
/*   */     //   505: iconst_1
/*   */     //   506: invokespecial <init> : (Z)V
/*   */     //   509: areturn
/*   */     //   510: iload_2
/*   */     //   511: bipush #70
/*   */     //   513: if_icmpne -> 525
/*   */     //   516: new f/bM0
/*   */     //   519: dup
/*   */     //   520: iconst_0
/*   */     //   521: invokespecial <init> : (Z)V
/*   */     //   524: areturn
/*   */     //   525: iload_2
/*   */     //   526: bipush #66
/*   */     //   528: if_icmpne -> 550
/*   */     //   531: new f/bM0
/*   */     //   534: dup
/*   */     //   535: aload_1
/*   */     //   536: invokevirtual readByte : ()B
/*   */     //   539: i2s
/*   */     //   540: sipush #255
/*   */     //   543: iand
/*   */     //   544: i2s
/*   */     //   545: i2l
/*   */     //   546: invokespecial <init> : (J)V
/*   */     //   549: areturn
/*   */     //   550: iload_2
/*   */     //   551: bipush #85
/*   */     //   553: if_icmpne -> 575
/*   */     //   556: new f/bM0
/*   */     //   559: dup
/*   */     //   560: aload_1
/*   */     //   561: invokevirtual readByte : ()B
/*   */     //   564: i2s
/*   */     //   565: sipush #255
/*   */     //   568: iand
/*   */     //   569: i2s
/*   */     //   570: i2l
/*   */     //   571: invokespecial <init> : (J)V
/*   */     //   574: areturn
/*   */     //   575: iload_2
/*   */     //   576: bipush #105
/*   */     //   578: if_icmpne -> 614
/*   */     //   581: aload_0
/*   */     //   582: new f/bM0
/*   */     //   585: astore_0
/*   */     //   586: getfield dl : Z
/*   */     //   589: ifeq -> 601
/*   */     //   592: aload_1
/*   */     //   593: invokevirtual readShort : ()S
/*   */     //   596: i2l
/*   */     //   597: lstore_1
/*   */     //   598: goto -> 607
/*   */     //   601: aload_1
/*   */     //   602: invokevirtual readByte : ()B
/*   */     //   605: i2l
/*   */     //   606: lstore_1
/*   */     //   607: aload_0
/*   */     //   608: dup
/*   */     //   609: lload_1
/*   */     //   610: invokespecial <init> : (J)V
/*   */     //   613: areturn
/*   */     //   614: iload_2
/*   */     //   615: bipush #73
/*   */     //   617: if_icmpne -> 653
/*   */     //   620: aload_0
/*   */     //   621: new f/bM0
/*   */     //   624: astore_0
/*   */     //   625: getfield dl : Z
/*   */     //   628: ifeq -> 640
/*   */     //   631: aload_1
/*   */     //   632: invokevirtual readInt : ()I
/*   */     //   635: i2l
/*   */     //   636: lstore_1
/*   */     //   637: goto -> 646
/*   */     //   640: aload_1
/*   */     //   641: invokevirtual readShort : ()S
/*   */     //   644: i2l
/*   */     //   645: lstore_1
/*   */     //   646: aload_0
/*   */     //   647: dup
/*   */     //   648: lload_1
/*   */     //   649: invokespecial <init> : (J)V
/*   */     //   652: areturn
/*   */     //   653: iload_2
/*   */     //   654: bipush #108
/*   */     //   656: if_icmpne -> 672
/*   */     //   659: new f/bM0
/*   */     //   662: dup
/*   */     //   663: aload_1
/*   */     //   664: invokevirtual readInt : ()I
/*   */     //   667: i2l
/*   */     //   668: invokespecial <init> : (J)V
/*   */     //   671: areturn
/*   */     //   672: iload_2
/*   */     //   673: bipush #76
/*   */     //   675: if_icmpne -> 690
/*   */     //   678: new f/bM0
/*   */     //   681: dup
/*   */     //   682: aload_1
/*   */     //   683: invokevirtual readLong : ()J
/*   */     //   686: invokespecial <init> : (J)V
/*   */     //   689: areturn
/*   */     //   690: iload_2
/*   */     //   691: bipush #100
/*   */     //   693: if_icmpne -> 709
/*   */     //   696: new f/bM0
/*   */     //   699: dup
/*   */     //   700: aload_1
/*   */     //   701: invokevirtual readFloat : ()F
/*   */     //   704: f2d
/*   */     //   705: invokespecial <init> : (D)V
/*   */     //   708: areturn
/*   */     //   709: iload_2
/*   */     //   710: bipush #68
/*   */     //   712: if_icmpne -> 727
/*   */     //   715: new f/bM0
/*   */     //   718: dup
/*   */     //   719: aload_1
/*   */     //   720: invokevirtual readDouble : ()D
/*   */     //   723: invokespecial <init> : (D)V
/*   */     //   726: areturn
/*   */     //   727: iload_2
/*   */     //   728: bipush #115
/*   */     //   730: if_icmpeq -> 915
/*   */     //   733: iload_2
/*   */     //   734: bipush #83
/*   */     //   736: if_icmpne -> 742
/*   */     //   739: goto -> 915
/*   */     //   742: iload_2
/*   */     //   743: bipush #97
/*   */     //   745: if_icmpeq -> 786
/*   */     //   748: iload_2
/*   */     //   749: bipush #65
/*   */     //   751: if_icmpne -> 757
/*   */     //   754: goto -> 786
/*   */     //   757: iload_2
/*   */     //   758: bipush #67
/*   */     //   760: if_icmpne -> 776
/*   */     //   763: new f/bM0
/*   */     //   766: dup
/*   */     //   767: aload_1
/*   */     //   768: invokevirtual readChar : ()C
/*   */     //   771: i2l
/*   */     //   772: invokespecial <init> : (J)V
/*   */     //   775: areturn
/*   */     //   776: new f/JU
/*   */     //   779: dup
/*   */     //   780: ldc 'Unrecognized data type'
/*   */     //   782: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   785: athrow
/*   */     //   786: iload_2
/*   */     //   787: aload_1
/*   */     //   788: invokevirtual readByte : ()B
/*   */     //   791: istore_2
/*   */     //   792: bipush #65
/*   */     //   794: if_icmpne -> 810
/*   */     //   797: aload_1
/*   */     //   798: invokevirtual readInt : ()I
/*   */     //   801: i2l
/*   */     //   802: ldc2_w -1
/*   */     //   805: land
/*   */     //   806: lstore_3
/*   */     //   807: goto -> 822
/*   */     //   810: aload_1
/*   */     //   811: invokevirtual readByte : ()B
/*   */     //   814: i2s
/*   */     //   815: sipush #255
/*   */     //   818: iand
/*   */     //   819: i2s
/*   */     //   820: i2l
/*   */     //   821: lstore_3
/*   */     //   822: new f/bM0
/*   */     //   825: dup
/*   */     //   826: astore #5
/*   */     //   828: getstatic f/nc.implements : Lf/nc;
/*   */     //   831: invokespecial <init> : (Lf/nc;)V
/*   */     //   834: aconst_null
/*   */     //   835: astore #6
/*   */     //   837: lconst_0
/*   */     //   838: lstore #7
/*   */     //   840: lload #7
/*   */     //   842: lload_3
/*   */     //   843: lcmp
/*   */     //   844: ifge -> 912
/*   */     //   847: aload #6
/*   */     //   849: aload_0
/*   */     //   850: aload_1
/*   */     //   851: iload_2
/*   */     //   852: invokevirtual K9 : (Ljava/io/DataInputStream;B)Lf/bM0;
/*   */     //   855: dup
/*   */     //   856: astore #9
/*   */     //   858: aload #5
/*   */     //   860: putfield UC : Lf/bM0;
/*   */     //   863: ifnull -> 887
/*   */     //   866: aload #5
/*   */     //   868: dup
/*   */     //   869: aload #6
/*   */     //   871: aload #9
/*   */     //   873: putfield H7 : Lf/bM0;
/*   */     //   876: getfield LG : I
/*   */     //   879: iconst_1
/*   */     //   880: iadd
/*   */     //   881: putfield LG : I
/*   */     //   884: goto -> 899
/*   */     //   887: aload #5
/*   */     //   889: dup
/*   */     //   890: aload #9
/*   */     //   892: putfield Rr0 : Lf/bM0;
/*   */     //   895: iconst_1
/*   */     //   896: putfield LG : I
/*   */     //   899: lload #7
/*   */     //   901: lconst_1
/*   */     //   902: ladd
/*   */     //   903: lstore #7
/*   */     //   905: aload #9
/*   */     //   907: astore #6
/*   */     //   909: goto -> 840
/*   */     //   912: aload #5
/*   */     //   914: areturn
/*   */     //   915: new f/bM0
/*   */     //   918: dup
/*   */     //   919: aload_1
/*   */     //   920: iconst_0
/*   */     //   921: iload_2
/*   */     //   922: invokestatic fW : (Ljava/io/DataInputStream;ZB)Ljava/lang/String;
/*   */     //   925: invokespecial <init> : (Ljava/lang/String;)V
/*   */     //   928: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 7
/*   */     //   #2	-> 55
/*   */     //   #3	-> 85
/*   */     //   #4	-> 242
/*   */     //   #5	-> 290
/*   */     //   #6	-> 315
/*   */     //   #7	-> 390
/*   */     //   #8	-> 394
/*   */     //   #9	-> 484
/*   */     //   #10	-> 536
/*   */     //   #11	-> 546
/*   */     //   #12	-> 561
/*   */     //   #13	-> 571
/*   */     //   #14	-> 788
/*   */     //   #15	-> 798
/*   */     //   #16	-> 811
/*   */     //   #17	-> 822
/*   */     //   #18	-> 915
/*   */     //   #19	-> 922
/*   */     //   #20	-> 925
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hd0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */