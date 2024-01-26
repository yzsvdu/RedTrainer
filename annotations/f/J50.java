/*  1 */ package f;public final class J50 extends sH { public Kr0[] v70; public final Jo Q7; public boolean h3 = false; public boolean Ub = false; public boolean wx = false; public final byte qi0; public final void Ja(int paramInt, byte paramByte) { boolean bool; byte b; Kr0[] arrayOfKr0; for (bool = false, b = 0; b < (arrayOfKr0 = this.v70).length; ) { if ((arrayOfKr0[b]).Jg == paramInt) bool = true;  b++; }  if (!bool) return;  this
/*  2 */       .wx = true; if (paramByte != 1) { this
/*  3 */         .Ub = true; km.pm0
/*  4 */         .Wk0((byte)0, (short)0); paramInt = 0; Kr0[] arrayOfKr01; while (paramInt < (
/*  5 */         arrayOfKr01 = this.v70).length) { (arrayOfKr01[paramInt])
/*  6 */           .pm
/*  7 */           .Cb0(this.xK0[paramInt]); (this.v70[paramInt])
/*  8 */           .R3 = this.qw[paramInt]; char c = 'È';
/*  9 */         (this.v70[paramInt]).pi = System.currentTimeMillis() + c;
/* 10 */         this.v70[paramInt].iV(this.Yt[paramInt]); paramInt++; }  }  if (paramByte == 2) { paramInt = 0; Kr0[] arrayOfKr01; while (paramInt < (
/* 11 */         arrayOfKr01 = this.v70).length) { km.a3
/*    */           
/* 13 */           .cA0((arrayOfKr01[paramInt]).YP); paramInt++; }  }  } public G5[] xK0; public byte[] qw; public byte[] Yt; public boolean COM3; public J50(Kr0 paramKr0, Jo paramJo, boolean paramBoolean) { Kr0[] arrayOfKr01 = km.a3.Bh(paramKr0); this.Q7 = paramJo; this.xK0 = new G5[arrayOfKr01.length]; this.qw = new byte[arrayOfKr01.length]; this.Yt = new byte[arrayOfKr01.length]; Kr0[] arrayOfKr02; for (byte b = 0; b < (arrayOfKr02 = this.v70).length; b++) { this.xK0[b] = arrayOfKr02[b].zm().Ef0(); this.qw[b] = this.v70[b].jM(); this.Yt[b] = this.v70[b].zO().UA0(); }  this.COM3 = paramBoolean; uG(); short s = this.v70[0].nul(); this.qi0 = LF.KU(paramJo.nul(), paramJo.zD(), s, this.v70[0].zD()); Uk0(); } public final boolean CoM9() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield h3 : Z
/*    */     //   4: ifne -> 123
/*    */     //   7: aload_0
/*    */     //   8: getfield Ub : Z
/*    */     //   11: dup
/*    */     //   12: istore_1
/*    */     //   13: ifeq -> 19
/*    */     //   16: goto -> 123
/*    */     //   19: iload_1
/*    */     //   20: ifeq -> 26
/*    */     //   23: goto -> 121
/*    */     //   26: aload_0
/*    */     //   27: getfield COM3 : Z
/*    */     //   30: ifne -> 50
/*    */     //   33: getstatic f/km.a3 : Lf/vh0;
/*    */     //   36: getfield Ct : Lf/Jo;
/*    */     //   39: getfield pm : Lf/d7;
/*    */     //   42: aload_0
/*    */     //   43: getfield qi0 : B
/*    */     //   46: invokevirtual qz0 : (B)Z
/*    */     //   49: pop
/*    */     //   50: aload_0
/*    */     //   51: getfield wx : Z
/*    */     //   54: ifeq -> 121
/*    */     //   57: iconst_0
/*    */     //   58: istore_1
/*    */     //   59: iload_1
/*    */     //   60: aload_0
/*    */     //   61: getfield v70 : [Lf/Kr0;
/*    */     //   64: dup
/*    */     //   65: astore_2
/*    */     //   66: arraylength
/*    */     //   67: if_icmpge -> 112
/*    */     //   70: aload_2
/*    */     //   71: iload_1
/*    */     //   72: aaload
/*    */     //   73: getfield pm : Lf/d7;
/*    */     //   76: invokevirtual gD0 : ()Z
/*    */     //   79: ifeq -> 108
/*    */     //   82: aload_0
/*    */     //   83: getfield v70 : [Lf/Kr0;
/*    */     //   86: iload_1
/*    */     //   87: aaload
/*    */     //   88: getfield pm : Lf/d7;
/*    */     //   91: getfield ew0 : Ljava/util/LinkedList;
/*    */     //   94: invokeinterface isEmpty : ()Z
/*    */     //   99: ifeq -> 108
/*    */     //   102: iinc #1, 1
/*    */     //   105: goto -> 59
/*    */     //   108: iconst_0
/*    */     //   109: goto -> 113
/*    */     //   112: iconst_1
/*    */     //   113: ifeq -> 121
/*    */     //   116: aload_0
/*    */     //   117: iconst_1
/*    */     //   118: putfield h3 : Z
/*    */     //   121: iconst_0
/*    */     //   122: ireturn
/*    */     //   123: iconst_1
/*    */     //   124: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 27
/*    */     //   #2	-> 36
/*    */     //   #3	-> 39
/*    */     //   #4	-> 43
/*    */     //   #5	-> 61
/*    */     //   #6	-> 73
/*    */     //   #7	-> 76
/*    */     //   #8	-> 88
/*    */     //   #9	-> 91
/*    */     //   #10	-> 94
/* 13 */     //   #11	-> 118 } public final void uG() { this(); ArrayList<nl> arrayList; byte b = 0; arrayList.clear(); arrayList.add(nl.Qp0); for (; b <= 3 && !this.v70[0].kx(this.Q7, b, arrayList); b = (byte)(b + 1)); Kr0[] arrayOfKr0; for (b = 0; b < (arrayOfKr0 = this.v70).length; ) { Kr0 kr0; (kr0 = arrayOfKr0[b]).R3 = -1; if ((arrayOfKr0[b]).Lq.L7) { Jo jo; if ((jo = km.a3.Ct) != null) { G5 g51; short s1; G5 g52; short s2; if ((s1 = (g51 = jo.HW).mm) > (s2 = (g52 = kr0.HW).mm)) { kr0.iV((byte)9); } else if (s1 < s2) { kr0.iV((byte)10); } else { short s; if ((s = g51.Yu0) < (s1 = g52.Yu0)) { kr0.iV((byte)7); } else if (s > s1) { kr0.iV((byte)8); }  }  } else { kr0.iV((byte)0); }  }  for (nl nl : arrayList) { (this.v70[b]).pm
/* 14 */           .Kk(new nl[] { nl }); }  b++; }
/*    */      }
/*    */ 
/*    */   
/*    */   public final byte coM9() {
/*    */     return this.qi0;
/*    */   }
/*    */   
/*    */   public final void Uk0() {
/*    */     // Byte code:
/*    */     //   0: getstatic f/km.a3 : Lf/vh0;
/*    */     //   3: getfield eA : B
/*    */     //   6: istore_1
/*    */     //   7: getstatic f/T30.Qh : Lf/T30;
/*    */     //   10: iload_1
/*    */     //   11: aload_0
/*    */     //   12: getfield v70 : [Lf/Kr0;
/*    */     //   15: iconst_0
/*    */     //   16: aaload
/*    */     //   17: getfield YP : S
/*    */     //   20: invokevirtual Xr : (BS)Lf/Xk;
/*    */     //   23: dup
/*    */     //   24: astore_0
/*    */     //   25: ifnull -> 1962
/*    */     //   28: iload_1
/*    */     //   29: aload_0
/*    */     //   30: dup
/*    */     //   31: invokevirtual YF : ()B
/*    */     //   34: i2s
/*    */     //   35: istore_0
/*    */     //   36: invokevirtual NO : ()S
/*    */     //   39: istore_2
/*    */     //   40: tableswitch default -> 76, 0 -> 1707, 1 -> 1344, 2 -> 888, 3 -> 399, 4 -> 81
/*    */     //   76: iconst_0
/*    */     //   77: istore_0
/*    */     //   78: goto -> 1954
/*    */     //   81: iload_0
/*    */     //   82: lookupswitch default -> 396, 3 -> 816, 5 -> 816, 8 -> 816, 9 -> 1338, 11 -> 1338, 14 -> 1338, 20 -> 1338, 21 -> 852, 24 -> 1338, 25 -> 852, 31 -> 834, 34 -> 1338, 36 -> 852, 38 -> 1260, 42 -> 1338, 43 -> 852, 46 -> 1338, 47 -> 846, 52 -> 1338, 55 -> 840, 56 -> 852, 62 -> 840, 63 -> 834, 64 -> 1338, 65 -> 1338, 68 -> 834, 77 -> 852, 78 -> 834, 79 -> 876, 82 -> 876, 113 -> 840, 114 -> 840, 115 -> 1338, 116 -> 840, 117 -> 840, 118 -> 840, 121 -> 1260, 122 -> 852
/*    */     //   396: goto -> 822
/*    */     //   399: iload_0
/*    */     //   400: tableswitch default -> 804, 2 -> 882, 3 -> 876, 4 -> 882, 5 -> 876, 6 -> 882, 7 -> 804, 8 -> 870, 9 -> 864, 10 -> 858, 11 -> 852, 12 -> 846, 13 -> 846, 14 -> 858, 15 -> 840, 16 -> 882, 17 -> 804, 18 -> 864, 19 -> 846, 20 -> 840, 21 -> 840, 22 -> 870, 23 -> 840, 24 -> 834, 25 -> 834, 26 -> 840, 27 -> 834, 28 -> 870, 29 -> 834, 30 -> 846, 31 -> 834, 32 -> 828, 33 -> 828, 34 -> 828, 35 -> 828, 36 -> 804, 37 -> 822, 38 -> 858, 39 -> 834, 40 -> 834, 41 -> 822, 42 -> 846, 43 -> 804, 44 -> 870, 45 -> 870, 46 -> 852, 47 -> 846, 48 -> 864, 49 -> 858, 50 -> 858, 51 -> 828, 52 -> 858, 53 -> 834, 54 -> 834, 55 -> 846, 56 -> 846, 57 -> 858, 58 -> 840, 59 -> 840, 60 -> 882, 61 -> 876, 62 -> 804, 63 -> 804, 64 -> 804, 65 -> 816, 66 -> 816, 67 -> 816, 68 -> 816, 69 -> 1260, 70 -> 864, 71 -> 864, 72 -> 810, 73 -> 810, 74 -> 804, 75 -> 804, 76 -> 804, 77 -> 804, 78 -> 804, 79 -> 804, 80 -> 804, 81 -> 840, 82 -> 840, 83 -> 840, 84 -> 840, 85 -> 876, 86 -> 804, 87 -> 810, 88 -> 810, 89 -> 810, 90 -> 804, 91 -> 804, 92 -> 804, 93 -> 804, 94 -> 804, 95 -> 804, 96 -> 804, 97 -> 804, 98 -> 840
/*    */     //   804: sipush #1104
/*    */     //   807: goto -> 77
/*    */     //   810: sipush #1103
/*    */     //   813: goto -> 77
/*    */     //   816: sipush #1113
/*    */     //   819: goto -> 77
/*    */     //   822: sipush #1108
/*    */     //   825: goto -> 77
/*    */     //   828: sipush #1106
/*    */     //   831: goto -> 77
/*    */     //   834: sipush #1109
/*    */     //   837: goto -> 77
/*    */     //   840: sipush #1112
/*    */     //   843: goto -> 77
/*    */     //   846: sipush #1111
/*    */     //   849: goto -> 77
/*    */     //   852: sipush #1107
/*    */     //   855: goto -> 77
/*    */     //   858: sipush #1102
/*    */     //   861: goto -> 77
/*    */     //   864: sipush #1105
/*    */     //   867: goto -> 77
/*    */     //   870: sipush #1101
/*    */     //   873: goto -> 77
/*    */     //   876: sipush #1110
/*    */     //   879: goto -> 77
/*    */     //   882: sipush #1100
/*    */     //   885: goto -> 77
/*    */     //   888: iload_0
/*    */     //   889: tableswitch default -> 1260, 3 -> 1338, 4 -> 1260, 5 -> 1338, 6 -> 1332, 7 -> 1332, 8 -> 1326, 9 -> 1326, 10 -> 1260, 11 -> 1260, 12 -> 1260, 13 -> 1320, 14 -> 1314, 15 -> 1314, 16 -> 1314, 17 -> 1260, 18 -> 1320, 19 -> 1260, 20 -> 1260, 21 -> 1260, 22 -> 1260, 23 -> 1260, 24 -> 1308, 25 -> 1308, 26 -> 1326, 27 -> 1332, 28 -> 1332, 29 -> 1332, 30 -> 1302, 31 -> 1296, 32 -> 1302, 33 -> 1290, 34 -> 1326, 35 -> 1284, 36 -> 1284, 37 -> 1260, 38 -> 1260, 39 -> 1278, 40 -> 1260, 41 -> 1260, 42 -> 1338, 43 -> 1326, 44 -> 1326, 45 -> 1332, 46 -> 1272, 47 -> 1260, 48 -> 1320, 49 -> 1308, 50 -> 1308, 51 -> 1284, 52 -> 1272, 53 -> 1332, 54 -> 1260, 55 -> 1260, 56 -> 1260, 57 -> 1296, 58 -> 1326, 59 -> 1302, 60 -> 1302, 61 -> 1326, 62 -> 1326, 63 -> 1296, 64 -> 1284, 65 -> 1320, 66 -> 1326, 67 -> 1326, 68 -> 1302, 69 -> 1302, 70 -> 1308, 71 -> 1308, 72 -> 1284, 73 -> 1332, 74 -> 1332, 75 -> 1290, 76 -> 1290, 77 -> 1278, 78 -> 1260, 79 -> 1260, 80 -> 1260, 81 -> 1260, 82 -> 1260, 83 -> 1326, 84 -> 1266, 85 -> 1320, 86 -> 1326, 87 -> 1290, 88 -> 1260, 89 -> 1260, 90 -> 1266, 91 -> 1266
/*    */     //   1260: sipush #1114
/*    */     //   1263: goto -> 77
/*    */     //   1266: sipush #1120
/*    */     //   1269: goto -> 77
/*    */     //   1272: sipush #1122
/*    */     //   1275: goto -> 77
/*    */     //   1278: sipush #1127
/*    */     //   1281: goto -> 77
/*    */     //   1284: sipush #1121
/*    */     //   1287: goto -> 77
/*    */     //   1290: sipush #1126
/*    */     //   1293: goto -> 77
/*    */     //   1296: sipush #1118
/*    */     //   1299: goto -> 77
/*    */     //   1302: sipush #1123
/*    */     //   1305: goto -> 77
/*    */     //   1308: sipush #1117
/*    */     //   1311: goto -> 77
/*    */     //   1314: sipush #1116
/*    */     //   1317: goto -> 77
/*    */     //   1320: sipush #1119
/*    */     //   1323: goto -> 77
/*    */     //   1326: sipush #1125
/*    */     //   1329: goto -> 77
/*    */     //   1332: sipush #1124
/*    */     //   1335: goto -> 77
/*    */     //   1338: sipush #1115
/*    */     //   1341: goto -> 77
/*    */     //   1344: iload_0
/*    */     //   1345: tableswitch default -> 1584, 2 -> 1701, 3 -> 1695, 4 -> 1686, 5 -> 1680, 6 -> 1680, 7 -> 1674, 8 -> 1668, 9 -> 1695, 10 -> 1662, 11 -> 1695, 12 -> 1662, 13 -> 1656, 14 -> 1674, 15 -> 1650, 16 -> 1701, 17 -> 1644, 18 -> 1638, 19 -> 1638, 20 -> 1650, 21 -> 1650, 22 -> 1632, 23 -> 1674, 24 -> 1662, 25 -> 1701, 26 -> 1584, 27 -> 1638, 28 -> 1674, 29 -> 1662, 30 -> 1632, 31 -> 1626, 32 -> 1584, 33 -> 1617, 34 -> 1611, 35 -> 1584, 36 -> 1611, 37 -> 1584, 38 -> 1605, 39 -> 1701, 40 -> 1590, 41 -> 1662, 42 -> 1674, 43 -> 1662, 44 -> 1650, 45 -> 1668, 46 -> 1611, 47 -> 1584, 48 -> 1680, 49 -> 1695, 50 -> 1584, 51 -> 1584, 52 -> 1680, 53 -> 1695, 54 -> 1650, 55 -> 1638, 56 -> 1662, 57 -> 1668
/*    */     //   1584: sipush #380
/*    */     //   1587: goto -> 77
/*    */     //   1590: iload_2
/*    */     //   1591: bipush #58
/*    */     //   1593: if_icmpeq -> 1584
/*    */     //   1596: iload_2
/*    */     //   1597: bipush #60
/*    */     //   1599: if_icmpne -> 1650
/*    */     //   1602: goto -> 1584
/*    */     //   1605: sipush #454
/*    */     //   1608: goto -> 77
/*    */     //   1611: sipush #449
/*    */     //   1614: goto -> 77
/*    */     //   1617: iload_2
/*    */     //   1618: bipush #49
/*    */     //   1620: if_icmpne -> 1584
/*    */     //   1623: goto -> 1638
/*    */     //   1626: sipush #450
/*    */     //   1629: goto -> 77
/*    */     //   1632: sipush #397
/*    */     //   1635: goto -> 77
/*    */     //   1638: sipush #379
/*    */     //   1641: goto -> 77
/*    */     //   1644: sipush #453
/*    */     //   1647: goto -> 77
/*    */     //   1650: sipush #407
/*    */     //   1653: goto -> 77
/*    */     //   1656: sipush #419
/*    */     //   1659: goto -> 77
/*    */     //   1662: sipush #416
/*    */     //   1665: goto -> 77
/*    */     //   1668: sipush #385
/*    */     //   1671: goto -> 77
/*    */     //   1674: sipush #423
/*    */     //   1677: goto -> 77
/*    */     //   1680: sipush #417
/*    */     //   1683: goto -> 77
/*    */     //   1686: iload_2
/*    */     //   1687: bipush #32
/*    */     //   1689: if_icmpne -> 1584
/*    */     //   1692: goto -> 1638
/*    */     //   1695: sipush #441
/*    */     //   1698: goto -> 77
/*    */     //   1701: sipush #451
/*    */     //   1704: goto -> 77
/*    */     //   1707: iload_0
/*    */     //   1708: tableswitch default -> 1924, 57 -> 1948, 58 -> 1948, 59 -> 1942, 60 -> 1948, 61 -> 1948, 62 -> 1942, 63 -> 1936, 64 -> 1936, 65 -> 1948, 66 -> 1948, 67 -> 1936, 68 -> 1948, 69 -> 1948, 70 -> 1948, 71 -> 1948, 72 -> 1948, 73 -> 1942, 74 -> 1942, 75 -> 1948, 76 -> 1948, 77 -> 1948, 78 -> 1948, 79 -> 1948, 80 -> 1948, 81 -> 1930, 82 -> 1936, 83 -> 1924, 84 -> 1924, 85 -> 1936, 86 -> 1948, 87 -> 1924, 88 -> 1948, 89 -> 1930, 90 -> 1924, 91 -> 1936, 92 -> 1942, 93 -> 1948, 94 -> 1942, 95 -> 1948, 96 -> 1948, 97 -> 1924, 98 -> 1924, 99 -> 1948, 100 -> 1942, 101 -> 1942, 102 -> 1948, 103 -> 1942, 104 -> 1948, 105 -> 1942, 106 -> 1942
/*    */     //   1924: sipush #282
/*    */     //   1927: goto -> 77
/*    */     //   1930: sipush #315
/*    */     //   1933: goto -> 77
/*    */     //   1936: sipush #283
/*    */     //   1939: goto -> 77
/*    */     //   1942: sipush #284
/*    */     //   1945: goto -> 77
/*    */     //   1948: sipush #285
/*    */     //   1951: goto -> 77
/*    */     //   1954: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   1957: iload_1
/*    */     //   1958: iload_0
/*    */     //   1959: invokevirtual Wk0 : (BS)V
/*    */     //   1962: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 3
/*    */     //   #2	-> 7
/*    */     //   #3	-> 12
/*    */     //   #4	-> 17
/*    */     //   #5	-> 20
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/J50.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */