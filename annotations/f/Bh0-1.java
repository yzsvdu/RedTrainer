package f;

public abstract class Bh0 {
  public static final byte[][] BP;
  
  public static final short[] aq0 = new short[] { 2495, 2500 };
  
  public static boolean py(byte paramByte, short paramShort) {
    // Byte code:
    //   0: iload_1
    //   1: ifne -> 6
    //   4: iconst_1
    //   5: ireturn
    //   6: iload_0
    //   7: ifne -> 213
    //   10: iload_1
    //   11: lookupswitch default -> 68, 675 -> 211, 2092 -> 211, 2095 -> 211, 2116 -> 211, 2121 -> 211, 2228 -> 211
    //   68: iload_1
    //   69: tableswitch default -> 116, 2080 -> 211, 2081 -> 211, 2082 -> 211, 2083 -> 211, 2084 -> 211, 2085 -> 211, 2086 -> 211, 2087 -> 211
    //   116: iload_1
    //   117: tableswitch default -> 208, 2192 -> 211, 2193 -> 211, 2194 -> 211, 2195 -> 211, 2196 -> 211, 2197 -> 211, 2198 -> 211, 2199 -> 211, 2200 -> 211, 2201 -> 211, 2202 -> 211, 2203 -> 211, 2204 -> 211, 2205 -> 211, 2206 -> 211, 2207 -> 211, 2208 -> 211, 2209 -> 211, 2210 -> 211
    //   208: goto -> 1213
    //   211: iconst_1
    //   212: ireturn
    //   213: iload_0
    //   214: iconst_1
    //   215: if_icmpne -> 529
    //   218: iload_1
    //   219: sipush #305
    //   222: if_icmpeq -> 527
    //   225: iload_1
    //   226: sipush #306
    //   229: if_icmpeq -> 527
    //   232: iload_1
    //   233: tableswitch default -> 260, 214 -> 527, 215 -> 527, 216 -> 527
    //   260: iload_1
    //   261: lookupswitch default -> 328, 253 -> 527, 281 -> 527, 303 -> 527, 2146 -> 527, 2216 -> 527, 2228 -> 527, 2240 -> 527
    //   328: iload_1
    //   329: tableswitch default -> 364, 421 -> 527, 422 -> 527, 423 -> 527, 424 -> 527, 425 -> 527
    //   364: iload_1
    //   365: tableswitch default -> 408, 467 -> 527, 468 -> 527, 469 -> 527, 470 -> 527, 471 -> 527, 472 -> 527, 473 -> 527
    //   408: iload_1
    //   409: tableswitch default -> 524, 2151 -> 527, 2152 -> 527, 2153 -> 527, 2154 -> 527, 2155 -> 527, 2156 -> 527, 2157 -> 527, 2158 -> 527, 2159 -> 527, 2160 -> 527, 2161 -> 527, 2162 -> 527, 2163 -> 527, 2164 -> 527, 2165 -> 527, 2166 -> 527, 2167 -> 527, 2168 -> 527, 2169 -> 527, 2170 -> 527, 2171 -> 527, 2172 -> 527, 2173 -> 527, 2174 -> 527, 2175 -> 527
    //   524: goto -> 1213
    //   527: iconst_1
    //   528: ireturn
    //   529: iload_0
    //   530: iconst_2
    //   531: if_icmpne -> 689
    //   534: iload_1
    //   535: sipush #1568
    //   538: if_icmpeq -> 687
    //   541: iload_1
    //   542: sipush #2400
    //   545: if_icmpeq -> 687
    //   548: iload_1
    //   549: sipush #2403
    //   552: if_icmpeq -> 687
    //   555: iload_1
    //   556: tableswitch default -> 604, 1521 -> 687, 1522 -> 687, 1523 -> 687, 1524 -> 687, 1525 -> 687, 1526 -> 687, 1527 -> 687, 1528 -> 687
    //   604: iload_1
    //   605: tableswitch default -> 684, 2480 -> 687, 2481 -> 687, 2482 -> 687, 2483 -> 687, 2484 -> 687, 2485 -> 687, 2486 -> 687, 2487 -> 687, 2488 -> 687, 2489 -> 687, 2490 -> 687, 2491 -> 687, 2492 -> 687, 2493 -> 687, 2494 -> 687, 2495 -> 687
    //   684: goto -> 1213
    //   687: iconst_1
    //   688: ireturn
    //   689: iload_0
    //   690: iconst_3
    //   691: if_icmpne -> 865
    //   694: iload_1
    //   695: sipush #2404
    //   698: if_icmpeq -> 863
    //   701: iload_1
    //   702: sipush #2546
    //   705: if_icmpeq -> 863
    //   708: iload_1
    //   709: sipush #2548
    //   712: if_icmpeq -> 863
    //   715: iload_1
    //   716: sipush #16469
    //   719: if_icmpeq -> 863
    //   722: iload_1
    //   723: tableswitch default -> 772, 1360 -> 863, 1361 -> 863, 1362 -> 863, 1363 -> 863, 1364 -> 863, 1365 -> 863, 1366 -> 863, 1367 -> 863, 1368 -> 863
    //   772: iload_1
    //   773: tableswitch default -> 860, 2480 -> 863, 2481 -> 863, 2482 -> 863, 2483 -> 863, 2484 -> 863, 2485 -> 863, 2486 -> 863, 2487 -> 863, 2488 -> 863, 2489 -> 863, 2490 -> 863, 2491 -> 863, 2492 -> 863, 2493 -> 863, 2494 -> 863, 2495 -> 863, 2496 -> 863, 2497 -> 863
    //   860: goto -> 1213
    //   863: iconst_1
    //   864: ireturn
    //   865: iload_0
    //   866: iconst_4
    //   867: if_icmpne -> 1173
    //   870: iload_1
    //   871: sipush #1495
    //   874: if_icmpeq -> 1171
    //   877: iload_1
    //   878: sipush #1496
    //   881: if_icmpeq -> 1171
    //   884: iload_1
    //   885: sipush #2510
    //   888: if_icmpeq -> 1171
    //   891: iload_1
    //   892: sipush #2511
    //   895: if_icmpeq -> 1171
    //   898: iload_1
    //   899: lookupswitch default -> 980, 299 -> 1171, 607 -> 1171, 1490 -> 1171, 2404 -> 1171, 2409 -> 1171, 2451 -> 1171, 2459 -> 1171, 2507 -> 1171, 2513 -> 1171
    //   980: iload_1
    //   981: tableswitch default -> 1032, 1360 -> 1171, 1361 -> 1171, 1362 -> 1171, 1363 -> 1171, 1364 -> 1171, 1365 -> 1171, 1366 -> 1171, 1367 -> 1171, 1368 -> 1171
    //   1032: iload_1
    //   1033: tableswitch default -> 1140, 2480 -> 1171, 2481 -> 1171, 2482 -> 1171, 2483 -> 1171, 2484 -> 1171, 2485 -> 1171, 2486 -> 1171, 2487 -> 1171, 2488 -> 1171, 2489 -> 1171, 2490 -> 1171, 2491 -> 1171, 2492 -> 1171, 2493 -> 1171, 2494 -> 1171, 2495 -> 1171, 2496 -> 1171, 2497 -> 1171, 2498 -> 1171, 2499 -> 1171, 2500 -> 1171, 2501 -> 1171, 2502 -> 1171
    //   1140: iload_1
    //   1141: tableswitch default -> 1168, 2515 -> 1171, 2516 -> 1171, 2517 -> 1171
    //   1168: goto -> 1213
    //   1171: iconst_1
    //   1172: ireturn
    //   1173: iload_0
    //   1174: bipush #10
    //   1176: if_icmpne -> 1213
    //   1179: iload_1
    //   1180: sipush #288
    //   1183: if_icmplt -> 1193
    //   1186: iload_1
    //   1187: sipush #395
    //   1190: if_icmple -> 1207
    //   1193: iload_1
    //   1194: sipush #407
    //   1197: if_icmplt -> 1211
    //   1200: iload_1
    //   1201: sipush #433
    //   1204: if_icmpgt -> 1211
    //   1207: iconst_1
    //   1208: goto -> 1212
    //   1211: iconst_0
    //   1212: ireturn
    //   1213: iconst_0
    //   1214: ireturn
  }
  
  public static short interface(int paramInt, byte paramByte) {
    int i;
    switch (paramByte) {
      default:
        return 0;
      case 4:
        return (short)(paramInt + 1361);
      case 3:
        return ((i = paramInt + 1) != 3) ? ((i != 4) ? ((i != 5) ? (short)(paramInt + 1361) : 1364) : 1363) : 1365;
      case 2:
        return (short)(paramInt + 1521);
      case 1:
        return (short)(paramInt + 2151);
      case 0:
        break;
    } 
    return (short)(paramInt + 2080);
  }
  
  public static byte tp(byte paramByte1, byte paramByte2, jM paramjM) {
    // Byte code:
    //   0: iload_0
    //   1: iconst_4
    //   2: if_icmpne -> 131
    //   5: aload_2
    //   6: ifnull -> 131
    //   9: iload_1
    //   10: iconst_4
    //   11: if_icmpne -> 94
    //   14: aload_2
    //   15: getstatic f/Bh0.aq0 : [S
    //   18: astore_3
    //   19: getfield fG : Lf/h30;
    //   22: dup
    //   23: astore #4
    //   25: monitorenter
    //   26: iconst_2
    //   27: istore #5
    //   29: iconst_0
    //   30: istore #6
    //   32: iload #6
    //   34: iload #5
    //   36: if_icmpge -> 71
    //   39: aload_2
    //   40: aload_3
    //   41: iload #6
    //   43: saload
    //   44: istore #7
    //   46: getfield fG : Lf/h30;
    //   49: iload #7
    //   51: invokevirtual Z90 : (S)S
    //   54: ifne -> 65
    //   57: aload #4
    //   59: iconst_0
    //   60: istore_3
    //   61: monitorexit
    //   62: goto -> 78
    //   65: iinc #6, 1
    //   68: goto -> 32
    //   71: aload #4
    //   73: iconst_1
    //   74: istore_3
    //   75: goto -> 61
    //   78: iload_3
    //   79: ifeq -> 94
    //   82: bipush #39
    //   84: ireturn
    //   85: aload_0
    //   86: aload #4
    //   88: monitorexit
    //   89: athrow
    //   90: astore_0
    //   91: goto -> 85
    //   94: iload_1
    //   95: iconst_5
    //   96: if_icmpne -> 112
    //   99: aload_2
    //   100: sipush #1365
    //   103: invokevirtual At0 : (S)Z
    //   106: ifne -> 112
    //   109: bipush #40
    //   111: ireturn
    //   112: iload_1
    //   113: bipush #8
    //   115: if_icmpne -> 131
    //   118: aload_2
    //   119: sipush #1496
    //   122: invokevirtual At0 : (S)Z
    //   125: ifeq -> 131
    //   128: bipush #55
    //   130: ireturn
    //   131: getstatic f/Bh0.BP : [[B
    //   134: iload_0
    //   135: aaload
    //   136: iload_1
    //   137: baload
    //   138: ireturn
    // Line number table:
    //   Java source line number -> byte code offset
    //   #1	-> 19
    //   #2	-> 103
    // Exception table:
    //   from	to	target	type
    //   39	44	90	finally
    //   46	54	90	finally
    //   61	65	90	finally
    //   85	89	90	finally
  }
  
  static {
    byte[] arrayOfByte;
    (arrayOfByte = new byte[10])[0] = 20;
    (new byte[10])[1] = 26;
    (new byte[10])[2] = 32;
    (new byte[10])[3] = 37;
    (new byte[10])[4] = 46;
    (new byte[10])[5] = 47;
    (new byte[10])[6] = 50;
    (new byte[10])[7] = 55;
    (new byte[10])[8] = 62;
    (new byte[10])[9] = 100;
    (new byte[5][])[0] = arrayOfByte;
    (arrayOfByte = new byte[10])[0] = 20;
    (new byte[10])[1] = 24;
    (new byte[10])[2] = 28;
    (new byte[10])[3] = 33;
    (new byte[10])[4] = 35;
    (new byte[10])[5] = 38;
    (new byte[10])[6] = 44;
    (new byte[10])[7] = 48;
    (new byte[10])[8] = 58;
    (new byte[10])[9] = 100;
    (new byte[5][])[1] = arrayOfByte;
    (arrayOfByte = new byte[10])[0] = 20;
    (new byte[10])[1] = 24;
    (new byte[10])[2] = 27;
    (new byte[10])[3] = 31;
    (new byte[10])[4] = 35;
    (new byte[10])[5] = 38;
    (new byte[10])[6] = 43;
    (new byte[10])[7] = 46;
    (new byte[10])[8] = 56;
    (new byte[10])[9] = 100;
    (new byte[5][])[2] = arrayOfByte;
    (arrayOfByte = new byte[10])[0] = 20;
    (new byte[10])[1] = 27;
    (new byte[10])[2] = 29;
    (new byte[10])[3] = 34;
    (new byte[10])[4] = 37;
    (new byte[10])[5] = 43;
    (new byte[10])[6] = 46;
    (new byte[10])[7] = 52;
    (new byte[10])[8] = 60;
    (new byte[10])[9] = 100;
    (new byte[5][])[3] = arrayOfByte;
    (arrayOfByte = new byte[10])[0] = 20;
    (new byte[10])[1] = 24;
    (new byte[10])[2] = 29;
    (new byte[10])[3] = 32;
    (new byte[10])[4] = 37;
    (new byte[10])[5] = 39;
    (new byte[10])[6] = 41;
    (new byte[10])[7] = 46;
    (new byte[10])[8] = 48;
    (new byte[10])[9] = 100;
    BP = new byte[][] { null, null, null, null, arrayOfByte };
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Bh0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */