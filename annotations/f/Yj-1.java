package f;

public final class Yj {
  public static final ik du = C00.gd(Yj.class);
  
  public String Qs0 = null;
  
  public boolean cW = false;
  
  public boolean Cd = false;
  
  public boolean au0 = false;
  
  public Yj() {
    n50.xl0();
  }
  
  public static boolean LpT5(JU paramJU) {
    String str = paramJU.getMessage();
    return ("Error loading pixmap.".equalsIgnoreCase(str) || LF.Cm0(str, "allocate memory for pixmap")) ? true : (LF.Cm0(str, "out of memory"));
  }
  
  public final void so() {
    // Byte code:
    //   0: getstatic f/UB0.vj0 : Lf/XG;
    //   3: ldc 'data/offsets/'
    //   5: invokevirtual aP : (Ljava/lang/String;)Lf/hZ;
    //   8: ldc '.dat'
    //   10: invokevirtual XX : (Ljava/lang/String;)[Lf/RD0;
    //   13: dup
    //   14: astore_1
    //   15: arraylength
    //   16: istore_2
    //   17: iconst_0
    //   18: istore_3
    //   19: iload_3
    //   20: iload_2
    //   21: if_icmpge -> 111
    //   24: aload_1
    //   25: iload_3
    //   26: aaload
    //   27: astore #4
    //   29: new f/p3
    //   32: dup
    //   33: dup
    //   34: astore #5
    //   36: aload #4
    //   38: invokespecial <init> : (Lf/RD0;)V
    //   41: iconst_0
    //   42: invokevirtual oz : (Z)Z
    //   45: ifeq -> 105
    //   48: getstatic f/n50.eJ0 : Ljava/util/HashMap;
    //   51: new java/lang/StringBuilder
    //   54: dup
    //   55: aload #5
    //   57: swap
    //   58: invokespecial <init> : ()V
    //   61: getfield Gb : Ljava/lang/String;
    //   64: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   67: ldc '-'
    //   69: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   72: aload #5
    //   74: getfield ny0 : B
    //   77: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   80: invokevirtual toString : ()Ljava/lang/String;
    //   83: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: checkcast f/uq
    //   89: dup
    //   90: astore #4
    //   92: ifnonnull -> 98
    //   95: goto -> 105
    //   98: aload #4
    //   100: aload #5
    //   102: putfield sd0 : Lf/p3;
    //   105: iinc #3, 1
    //   108: goto -> 19
    //   111: iconst_1
    //   112: goto -> 151
    //   115: astore_1
    //   116: aload_0
    //   117: aload_1
    //   118: invokevirtual NZ : (Ljava/lang/Exception;)Z
    //   121: ifeq -> 128
    //   124: iconst_0
    //   125: goto -> 151
    //   128: aload_0
    //   129: dup
    //   130: ldc 'Error loading offset data.\\nPlease reinstall the client to resolve this issue.'
    //   132: putfield Qs0 : Ljava/lang/String;
    //   135: iconst_1
    //   136: putfield cW : Z
    //   139: getstatic f/Yj.du : Lf/ik;
    //   142: ldc 'Error loading offset data'
    //   144: aload_1
    //   145: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   150: iconst_0
    //   151: ifne -> 155
    //   154: return
    //   155: invokestatic aW : ()V
    //   158: new f/P1
    //   161: dup
    //   162: dup
    //   163: invokespecial <init> : ()V
    //   166: putstatic f/km.mI0 : Lf/P1;
    //   169: getstatic f/UB0.vj0 : Lf/XG;
    //   172: ldc 'roms'
    //   174: invokevirtual N0 : (Ljava/lang/String;)Lf/hZ;
    //   177: invokevirtual h80 : (Lf/hZ;)V
    //   180: getstatic f/UB0.vj0 : Lf/XG;
    //   183: ldc 'roms/importing.tmp'
    //   185: invokevirtual N0 : (Ljava/lang/String;)Lf/hZ;
    //   188: dup
    //   189: astore_1
    //   190: invokevirtual L0 : ()Z
    //   193: ifeq -> 201
    //   196: aload_1
    //   197: invokevirtual La0 : ()Z
    //   200: pop
    //   201: getstatic f/UB0.vj0 : Lf/XG;
    //   204: ldc 'roms'
    //   206: invokevirtual N0 : (Ljava/lang/String;)Lf/hZ;
    //   209: ldc '_import'
    //   211: invokevirtual XX : (Ljava/lang/String;)[Lf/RD0;
    //   214: invokestatic stream : ([Ljava/lang/Object;)Ljava/util/stream/Stream;
    //   217: <illegal opcode> accept : ()Ljava/util/function/Consumer;
    //   222: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   227: getstatic f/UB0.vj0 : Lf/XG;
    //   230: ldc 'data/sprites/addons.pak'
    //   232: invokevirtual aP : (Ljava/lang/String;)Lf/hZ;
    //   235: getstatic f/GF0.Et : Lf/ik;
    //   238: pop
    //   239: getstatic java/nio/channels/FileChannel$MapMode.READ_ONLY : Ljava/nio/channels/FileChannel$MapMode;
    //   242: invokevirtual fg0 : (Ljava/nio/channels/FileChannel$MapMode;)Ljava/nio/MappedByteBuffer;
    //   245: getstatic java/nio/ByteOrder.LITTLE_ENDIAN : Ljava/nio/ByteOrder;
    //   248: invokevirtual order : (Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
    //   251: invokestatic g6 : (Ljava/nio/ByteBuffer;)Z
    //   254: istore_1
    //   255: goto -> 272
    //   258: astore_1
    //   259: getstatic f/GF0.Et : Lf/ik;
    //   262: ldc ''
    //   264: aload_1
    //   265: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   270: iconst_0
    //   271: istore_1
    //   272: iload_1
    //   273: ifeq -> 280
    //   276: iconst_1
    //   277: goto -> 325
    //   280: new java/lang/RuntimeException
    //   283: dup
    //   284: invokespecial <init> : ()V
    //   287: athrow
    //   288: astore_1
    //   289: aload_0
    //   290: aload_1
    //   291: invokevirtual NZ : (Ljava/lang/Exception;)Z
    //   294: ifeq -> 301
    //   297: iconst_0
    //   298: goto -> 325
    //   301: aload_0
    //   302: dup
    //   303: ldc 'Error loading addon data.\\nThe current addon data may be invalid or corrupt.\\nPlease reinstall the client to resolve this issue.'
    //   305: putfield Qs0 : Ljava/lang/String;
    //   308: iconst_1
    //   309: putfield cW : Z
    //   312: getstatic f/Yj.du : Lf/ik;
    //   315: ldc_w 'Error loading pak data'
    //   318: aload_1
    //   319: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   324: iconst_0
    //   325: ifne -> 329
    //   328: return
    //   329: getstatic f/km.mI0 : Lf/P1;
    //   332: dup
    //   333: getfield vo : [Lf/s40;
    //   336: astore_1
    //   337: getfield W40 : [Lf/HI;
    //   340: dup
    //   341: astore_2
    //   342: arraylength
    //   343: istore_3
    //   344: iconst_0
    //   345: istore #4
    //   347: iload #4
    //   349: iload_3
    //   350: if_icmpge -> 366
    //   353: aload_2
    //   354: iload #4
    //   356: aaload
    //   357: invokevirtual BL : ()V
    //   360: iinc #4, 1
    //   363: goto -> 347
    //   366: aload_1
    //   367: arraylength
    //   368: istore_2
    //   369: iconst_0
    //   370: istore_3
    //   371: iload_3
    //   372: iload_2
    //   373: if_icmpge -> 388
    //   376: aload_1
    //   377: iload_3
    //   378: aaload
    //   379: invokevirtual Qf0 : ()V
    //   382: iinc #3, 1
    //   385: goto -> 371
    //   388: iconst_1
    //   389: goto -> 454
    //   392: astore_1
    //   393: aload_0
    //   394: aload_1
    //   395: invokevirtual NZ : (Ljava/lang/Exception;)Z
    //   398: ifeq -> 405
    //   401: iconst_0
    //   402: goto -> 454
    //   405: aload_0
    //   406: ldc_w 'Error loading rom data.\\nOne of the loaded roms may be invalid or corrupt.'
    //   409: putfield Qs0 : Ljava/lang/String;
    //   412: getstatic f/Yj.du : Lf/ik;
    //   415: ldc_w 'Error loading data from rom (load section 1)'
    //   418: aload_1
    //   419: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   424: ldc ''
    //   426: putstatic f/h1.Pq : Ljava/lang/String;
    //   429: ldc ''
    //   431: putstatic f/h1.Vh : Ljava/lang/String;
    //   434: ldc ''
    //   436: putstatic f/h1.h0 : Ljava/lang/String;
    //   439: ldc ''
    //   441: putstatic f/h1.yD0 : Ljava/lang/String;
    //   444: ldc ''
    //   446: putstatic f/h1.Re0 : Ljava/lang/String;
    //   449: invokestatic Td : ()Z
    //   452: pop
    //   453: iconst_0
    //   454: ifne -> 458
    //   457: return
    //   458: getstatic f/km.mI0 : Lf/P1;
    //   461: getfield Mv0 : Z
    //   464: ifeq -> 470
    //   467: goto -> 530
    //   470: invokestatic tI : ()V
    //   473: invokestatic Lj : ()Z
    //   476: ifne -> 486
    //   479: ldc_w 'Error loading PokeMMO data package.\\nThe current data may be invalid or corrupt.\\nPlease reinstall the client to resolve this issue.'
    //   482: astore_1
    //   483: goto -> 498
    //   486: invokestatic e00 : ()Z
    //   489: ifne -> 511
    //   492: ldc_w 'Error loading PokeMMO texture package.\\nThe current data may be invalid or corrupt.\\nPlease reinstall the client to resolve this issue.'
    //   495: goto -> 482
    //   498: aload_0
    //   499: dup
    //   500: aload_1
    //   501: putfield Qs0 : Ljava/lang/String;
    //   504: iconst_1
    //   505: putfield cW : Z
    //   508: goto -> 543
    //   511: getstatic f/cE.eo0 : Lf/cE;
    //   514: iconst_0
    //   515: invokevirtual qK0 : (Z)V
    //   518: invokestatic Ou : ()V
    //   521: invokestatic Pl0 : ()V
    //   524: invokestatic Xy : ()V
    //   527: invokestatic B9 : ()V
    //   530: iconst_1
    //   531: goto -> 567
    //   534: astore_1
    //   535: aload_0
    //   536: aload_1
    //   537: invokevirtual NZ : (Ljava/lang/Exception;)Z
    //   540: ifeq -> 547
    //   543: iconst_0
    //   544: goto -> 567
    //   547: aload_0
    //   548: ldc_w 'Error loading rom data.\\nOne of the loaded roms may be invalid or corrupt.'
    //   551: putfield Qs0 : Ljava/lang/String;
    //   554: getstatic f/Yj.du : Lf/ik;
    //   557: ldc_w 'Error loading data from rom (load section 2)'
    //   560: aload_1
    //   561: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   566: iconst_0
    //   567: ifne -> 571
    //   570: return
    //   571: invokestatic init : ()V
    //   574: getstatic f/d00.Je : Lf/d00;
    //   577: dup
    //   578: astore_1
    //   579: invokevirtual EZ : ()V
    //   582: getstatic f/km.mI0 : Lf/P1;
    //   585: getfield Mv0 : Z
    //   588: ifeq -> 594
    //   591: goto -> 598
    //   594: aload_1
    //   595: invokevirtual Hg : ()V
    //   598: iconst_1
    //   599: goto -> 635
    //   602: astore_1
    //   603: aload_0
    //   604: aload_1
    //   605: invokevirtual NZ : (Ljava/lang/Exception;)Z
    //   608: ifeq -> 615
    //   611: iconst_0
    //   612: goto -> 635
    //   615: aload_0
    //   616: ldc_w 'Error loading/applying mod data.\\nPlease delete invalid mods to continue.'
    //   619: putfield Qs0 : Ljava/lang/String;
    //   622: getstatic f/Yj.du : Lf/ik;
    //   625: ldc_w 'Error loading/applying mod data.'
    //   628: aload_1
    //   629: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   634: iconst_0
    //   635: ifne -> 639
    //   638: return
    //   639: getstatic f/cE.eo0 : Lf/cE;
    //   642: dup
    //   643: astore_1
    //   644: invokevirtual P00 : ()Ljava/lang/String;
    //   647: astore_2
    //   648: getstatic f/h1.p0 : Z
    //   651: ifeq -> 661
    //   654: getstatic f/h1.pB0 : Ljava/lang/String;
    //   657: astore_2
    //   658: goto -> 708
    //   661: aload_2
    //   662: getstatic f/h1.pB0 : Ljava/lang/String;
    //   665: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   668: ifne -> 708
    //   671: aload_1
    //   672: aload_2
    //   673: dup
    //   674: putstatic f/h1.pB0 : Ljava/lang/String;
    //   677: invokevirtual sG : (Ljava/lang/String;)Z
    //   680: pop
    //   681: getstatic f/Yj.du : Lf/ik;
    //   684: ldc_w 'Switching interface language to match system: '
    //   687: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   690: getstatic f/h1.pB0 : Ljava/lang/String;
    //   693: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   696: invokevirtual toString : ()Ljava/lang/String;
    //   699: invokeinterface info : (Ljava/lang/String;)V
    //   704: iconst_1
    //   705: putstatic f/h1.Gh0 : Z
    //   708: aload_2
    //   709: invokevirtual length : ()I
    //   712: iconst_2
    //   713: if_icmple -> 726
    //   716: aload_2
    //   717: iconst_0
    //   718: iconst_2
    //   719: invokevirtual substring : (II)Ljava/lang/String;
    //   722: astore_1
    //   723: goto -> 728
    //   726: aload_2
    //   727: astore_1
    //   728: getstatic f/h1.Bb : Z
    //   731: ifne -> 795
    //   734: getstatic f/h1.qc : Ljava/lang/String;
    //   737: ldc_w 'en'
    //   740: swap
    //   741: invokevirtual equals : (Ljava/lang/Object;)Z
    //   744: ifeq -> 795
    //   747: aload_2
    //   748: getstatic f/h1.qc : Ljava/lang/String;
    //   751: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   754: ifne -> 795
    //   757: aload_1
    //   758: invokestatic nS : (Ljava/lang/String;)Lf/Xv0;
    //   761: ifnull -> 795
    //   764: aload_1
    //   765: putstatic f/h1.qc : Ljava/lang/String;
    //   768: getstatic f/Yj.du : Lf/ik;
    //   771: ldc_w 'Switching chat language to match system: '
    //   774: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   777: getstatic f/h1.qc : Ljava/lang/String;
    //   780: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   783: invokevirtual toString : ()Ljava/lang/String;
    //   786: invokeinterface info : (Ljava/lang/String;)V
    //   791: iconst_1
    //   792: putstatic f/h1.Gh0 : Z
    //   795: getstatic f/A1.L7 : Lf/A1;
    //   798: dup
    //   799: getstatic f/L70.gq : Lf/L70;
    //   802: astore_1
    //   803: invokevirtual getClass : ()Ljava/lang/Class;
    //   806: pop
    //   807: ldc2_w 15000
    //   810: lstore_2
    //   811: ldc2_w 15000
    //   814: lstore #4
    //   816: getfield nc : Lf/cK0;
    //   819: aload_1
    //   820: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   823: astore_1
    //   824: lload #4
    //   826: lload_2
    //   827: aload_1
    //   828: invokevirtual scheduleAtFixedRate : (Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;
    //   831: pop
    //   832: goto -> 836
    //   835: pop
    //   836: aload_0
    //   837: iconst_1
    //   838: putfield Cd : Z
    //   841: return
    //   842: astore_1
    //   843: aload_0
    //   844: ldc_w 'Error loading cryptographic service.'
    //   847: putfield Qs0 : Ljava/lang/String;
    //   850: getstatic f/Yj.du : Lf/ik;
    //   853: aload_0
    //   854: getfield Qs0 : Ljava/lang/String;
    //   857: aload_1
    //   858: invokeinterface error : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   863: getstatic f/km.f70 : Lf/k7;
    //   866: bipush #40
    //   868: ldc_w 'Fatal Render Error'
    //   871: invokestatic la : (ILjava/lang/String;)Ljava/lang/String;
    //   874: getstatic f/LP.Od0 : Lf/LP;
    //   877: new f/Ep0
    //   880: dup
    //   881: astore_0
    //   882: aload_1
    //   883: invokespecial <init> : (Ljava/security/GeneralSecurityException;)V
    //   886: new f/ig0
    //   889: dup
    //   890: astore_1
    //   891: invokespecial <init> : ()V
    //   894: ldc_w 'Error loading cryptographic service.\\n\\nWould you like to submit an error report?'
    //   897: swap
    //   898: aload_0
    //   899: aload_1
    //   900: iconst_1
    //   901: invokevirtual lpt3 : (Ljava/lang/String;Ljava/lang/String;Lf/LP;Ljava/lang/Runnable;Ljava/lang/Runnable;Z)V
    //   904: return
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 0
    //   #2	-> 48
    //   #3	-> 61
    //   #4	-> 64
    //   #5	-> 74
    //   #6	-> 77
    //   #7	-> 102
    //   #8	-> 118
    //   #9	-> 155
    //   #10	-> 169
    //   #11	-> 180
    //   #12	-> 227
    //   #13	-> 239
    //   #14	-> 245
    //   #15	-> 280
    //   #16	-> 329
    //   #17	-> 333
    //   #18	-> 337
    //   #19	-> 342
    //   #20	-> 458
    //   #21	-> 511
    //   #22	-> 515
    //   #23	-> 571
    //   #24	-> 574
    //   #25	-> 579
    //   #26	-> 639
    //   #27	-> 644
    //   #28	-> 684
    //   #29	-> 690
    //   #30	-> 771
    //   #31	-> 777
    //   #32	-> 795
    //   #33	-> 799
    //   #34	-> 803
    //   #35	-> 816
    //   #36	-> 838
    // Exception table:
    //   from	to	target	type
    //   8	13	115	java/lang/Exception
    //   15	16	115	java/lang/Exception
    //   24	27	115	java/lang/Exception
    //   29	32	115	java/lang/Exception
    //   36	45	115	java/lang/Exception
    //   48	54	115	java/lang/Exception
    //   55	89	115	java/lang/Exception
    //   98	105	115	java/lang/Exception
    //   155	158	842	java/security/GeneralSecurityException
    //   227	238	288	java/lang/Exception
    //   239	254	258	java/lang/Exception
    //   259	270	288	java/lang/Exception
    //   280	288	288	java/lang/Exception
    //   342	343	392	java/lang/Exception
    //   353	360	392	java/lang/Exception
    //   366	368	392	java/lang/Exception
    //   376	382	392	java/lang/Exception
    //   470	476	534	java/lang/Exception
    //   479	482	534	java/lang/Exception
    //   486	489	534	java/lang/Exception
    //   492	530	534	java/lang/Exception
    //   574	577	602	java/lang/Exception
    //   579	588	602	java/lang/Exception
    //   594	598	602	java/lang/Exception
    //   816	823	835	java/util/concurrent/RejectedExecutionException
    //   824	831	835	java/util/concurrent/RejectedExecutionException
  }
  
  public final boolean NZ(Exception paramException) {
    if (!(paramException instanceof JU))
      return false; 
    if (LpT5((JU)paramException)) {
      this.Qs0 = "Memory Allocation Failure.\nPlease close another application and try again.";
      du.error("Caught GdxRuntimeException (Memory)", paramException);
    } else {
      this.Qs0 = "Gdx Runtime Exception.\nPlease close another application and try again.";
      du.error("Caught GdxRuntimeException", paramException);
    } 
    return true;
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Yj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */