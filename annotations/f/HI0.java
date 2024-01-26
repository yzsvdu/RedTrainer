/* 1 */ package f;public final class HI0 extends Ty { public final Object try(m6 paramm6, Object paramObject1, Object paramObject2) { Iv0 iv0; paramObject1 = (iv0 = (Iv0)paramObject1).Sm0; tF0[] arrayOfTF0 = paramm6.qK0.Qa; if (paramm6.Nh.else(1) == 1) { int[] arrayOfInt = null; if (paramObject2 instanceof int[]) arrayOfInt = (int[])paramObject2;  if (arrayOfInt == null || arrayOfInt.length < this.Lg0) { arrayOfInt = new int[this.Lg0]; } else { for (byte b = 0; b < arrayOfInt.length; ) { arrayOfInt[b] = 0; b++; }  }  byte b2; int i; for (arrayOfInt[0] = paramm6.Nh.else(Yg0.TV(this.DZ - 1)), arrayOfInt[1] = paramm6.Nh.else(Yg0.TV(this.DZ - 1)), b2 = 0, i = 2; b2 < ((KD)paramObject1).wI0; ) { int j = ((KD)paramObject1).AA0[b2], k = ((KD)paramObject1).fb0[j], n = 1 << m, i1 = 0; int m; if ((m = ((KD)paramObject1).E00[j]) != 0 && (i1 = arrayOfTF0[((KD)paramObject1).H70[j]].rB(paramm6.Nh)) == -1) return null;  for (byte b = 0; b < k; ) { i1 >>>= m; int i2; if ((i2 = ((KD)paramObject1).o6[j][i1 & n - 1]) >= 0) { i2 = i + b; arrayOfInt[i2] = i3; int i3; if ((i3 = arrayOfTF0[i2].rB(paramm6.Nh)) == -1) return null;  } else { arrayOfInt[i + b] = 0; }  b++; }  i += k; b2++; }  for (byte b1 = 2; b1 < this.Lg0; ) { int k, m = arrayOfInt1[i = this.O7[k = b1 - 2]]; int arrayOfInt1[], n, i1 = (arrayOfInt1 = ((KD)paramObject1).L)[n = this.Rc0[k]]; i = arrayOfInt[i]; int j = arrayOfInt1[b1]; i &= 0x7FFF; j = i1 - m; m = Math.abs(n); j = (j - m) * m / j; if ((n = (arrayOfInt[n] & 0x7FFF) - i) < 0) { j = i - j; } else { j = i + j; }
/* 2 */          if ((i = this.DZ - j) < j) { m = i; } else { m = j; }  m <<= 1; if ((n = arrayOfInt[b1]) != 0) { j = ((n >= m) ? ((i > j) ? (n - j) : (-1 - n - i)) : (((n & 0x1) != 0) ? -(n + 1 >>> 1) : (n >> 1))) + j; arrayOfInt[b1] = j; arrayOfInt[j] = arrayOfInt[j = this.O7[k]] & 0x7FFF; arrayOfInt[j] = arrayOfInt[j = this.Rc0[k]] & 0x7FFF; } else { arrayOfInt[b1] = j | 0x8000; }  b1++; }  return arrayOfInt; }  return null; }
/*   */ 
/*   */   
/*   */   public static float[] cA = new float[] { 
/*   */       1.0649863E-7F, 1.1341951E-7F, 1.2079015E-7F, 1.2863978E-7F, 1.369995E-7F, 1.459025E-7F, 1.5538409E-7F, 1.6548181E-7F, 1.7623574E-7F, 1.8768856E-7F, 
/*   */       1.998856E-7F, 2.128753E-7F, 2.2670913E-7F, 2.4144197E-7F, 2.5713223E-7F, 2.7384212E-7F, 2.9163792E-7F, 3.1059022E-7F, 3.307741E-7F, 3.5226967E-7F, 
/*   */       3.7516213E-7F, 3.995423E-7F, 4.255068E-7F, 4.5315863E-7F, 4.8260745E-7F, 5.1397E-7F, 5.4737063E-7F, 5.829419E-7F, 6.208247E-7F, 6.611694E-7F, 
/*   */       7.041359E-7F, 7.4989464E-7F, 7.98627E-7F, 8.505263E-7F, 9.057983E-7F, 9.646621E-7F, 1.0273513E-6F, 1.0941144E-6F, 1.1652161E-6F, 1.2409384E-6F, 
/*   */       1.3215816E-6F, 1.4074654E-6F, 1.4989305E-6F, 1.5963394E-6F, 1.7000785E-6F, 1.8105592E-6F, 1.9282195E-6F, 2.053526E-6F, 2.1869757E-6F, 2.3290977E-6F, 
/*   */       2.4804558E-6F, 2.6416496E-6F, 2.813319E-6F, 2.9961443E-6F, 3.1908505E-6F, 3.39821E-6F, 3.619045E-6F, 3.8542307E-6F, 4.1047006E-6F, 4.371447E-6F, 
/*   */       4.6555283E-6F, 4.958071E-6F, 5.280274E-6F, 5.623416E-6F, 5.988857E-6F, 6.3780467E-6F, 6.7925284E-6F, 7.2339453E-6F, 7.704048E-6F, 8.2047E-6F, 
/*   */       8.737888E-6F, 9.305725E-6F, 9.910464E-6F, 1.0554501E-5F, 1.1240392E-5F, 1.1970856E-5F, 1.2748789E-5F, 1.3577278E-5F, 1.4459606E-5F, 1.5399271E-5F, 
/*   */       1.6400005E-5F, 1.7465769E-5F, 1.8600793E-5F, 1.9809577E-5F, 2.1096914E-5F, 2.2467912E-5F, 2.3928002E-5F, 2.5482977E-5F, 2.7139005E-5F, 2.890265E-5F, 
/*   */       3.078091E-5F, 3.2781227E-5F, 3.4911533E-5F, 3.718028E-5F, 3.9596467E-5F, 4.2169668E-5F, 4.491009E-5F, 4.7828602E-5F, 5.0936775E-5F, 5.424693E-5F, 
/*   */       5.7772202E-5F, 6.152657E-5F, 6.552491E-5F, 6.9783084E-5F, 7.4317984E-5F, 7.914758E-5F, 8.429104E-5F, 8.976875E-5F, 9.560242E-5F, 1.0181521E-4F, 
/*   */       1.0843174E-4F, 1.1547824E-4F, 1.2298267E-4F, 1.3097477E-4F, 1.3948625E-4F, 1.4855085E-4F, 1.5820454E-4F, 1.6848555E-4F, 1.7943469E-4F, 1.9109536E-4F, 
/*   */       2.0351382E-4F, 2.167393E-4F, 2.3082423E-4F, 2.4582449E-4F, 2.6179955E-4F, 2.7881275E-4F, 2.9693157E-4F, 3.1622787E-4F, 3.3677815E-4F, 3.5866388E-4F, 
/*   */       3.8197188E-4F, 4.0679457E-4F, 4.3323037E-4F, 4.613841E-4F, 4.913675E-4F, 5.2329927E-4F, 5.573062E-4F, 5.935231E-4F, 6.320936E-4F, 6.731706E-4F, 
/*   */       7.16917E-4F, 7.635063E-4F, 8.1312325E-4F, 8.6596457E-4F, 9.2223985E-4F, 9.821722E-4F, 0.0010459992F, 0.0011139743F, 0.0011863665F, 0.0012634633F, 
/*   */       0.0013455702F, 0.0014330129F, 0.0015261382F, 0.0016253153F, 0.0017309374F, 0.0018434235F, 0.0019632196F, 0.0020908006F, 0.0022266726F, 0.0023713743F, 
/*   */       0.0025254795F, 0.0026895993F, 0.0028643848F, 0.0030505287F, 0.003248769F, 0.0034598925F, 0.0036847359F, 0.0039241905F, 0.0041792067F, 0.004450795F, 
/*   */       0.004740033F, 0.005048067F, 0.0053761187F, 0.005725489F, 0.0060975635F, 0.0064938175F, 0.0069158226F, 0.0073652514F, 0.007843887F, 0.008353627F, 
/*   */       0.008896492F, 0.009474637F, 0.010090352F, 0.01074608F, 0.011444421F, 0.012188144F, 0.012980198F, 0.013823725F, 0.014722068F, 0.015678791F, 
/*   */       0.016697686F, 0.017782796F, 0.018938422F, 0.020169148F, 0.021479854F, 0.022875736F, 0.02436233F, 0.025945531F, 0.027631618F, 0.029427277F, 
/*   */       0.031339627F, 0.03337625F, 0.035545226F, 0.037855156F, 0.0403152F, 0.042935107F, 0.045725275F, 0.048696756F, 0.05186135F, 0.05523159F, 
/*   */       0.05882085F, 0.062643364F, 0.06671428F, 0.07104975F, 0.075666964F, 0.08058423F, 0.08582105F, 0.09139818F, 0.097337745F, 0.1036633F, 
/*   */       0.11039993F, 0.11757434F, 0.12521498F, 0.13335215F, 0.14201812F, 0.15124726F, 0.16107617F, 0.1715438F, 0.18269168F, 0.19456401F, 
/*   */       0.20720787F, 0.22067343F, 0.23501402F, 0.25028655F, 0.26655158F, 0.28387362F, 0.3023213F, 0.32196787F, 0.34289113F, 0.36517414F, 
/*   */       0.3889052F, 0.41417846F, 0.44109413F, 0.4697589F, 0.50028646F, 0.53279793F, 0.5674221F, 0.6042964F, 0.64356697F, 0.6853896F, 
/*   */       0.72993004F, 0.777365F, 0.8278826F, 0.88168305F, 0.9389798F, 1.0F };
/*   */   
/*   */   public final Object I9(Pp0 paramPp0, E7 paramE7) {
/*   */     int i = 0;
/*   */     int k = -1;
/*   */     this();
/*   */     KD kD;
/*   */     (kD = new KD()).wI0 = paramE7.else(5);
/*   */     byte b;
/*   */     for (b = 0; b < kD.wI0; b++) {
/*   */       kD.AA0[b] = paramE7.else(4);
/*   */       int m;
/*   */       if (k < (m = kD.AA0[b]))
/*   */         k = m; 
/*   */     } 
/*   */     for (b = 0; b < k + 1; b++) {
/*   */       kD.fb0[b] = paramE7.else(3) + 1;
/*   */       kD.E00[b] = paramE7.else(2);
/*   */       int m;
/*   */       if ((m = kD.E00[b]) < 0) {
/*   */         kD.By();
/*   */         return null;
/*   */       } 
/*   */       if (m != 0)
/*   */         kD.H70[b] = paramE7.else(8); 
/*   */       if ((m = kD.H70[b]) < 0 || m >= paramPp0.K3) {
/*   */         kD.By();
/*   */         return null;
/*   */       } 
/*   */       for (m = 0; m < 1 << kD.E00[b]; m++) {
/*   */         kD.o6[b][m] = paramE7.else(8) - 1;
/*   */         int n;
/*   */         if ((n = kD.o6[b][m]) < -1 || n >= paramPp0.K3) {
/*   */           kD.By();
/*   */           return null;
/*   */         } 
/*   */       } 
/*   */     } 
/*   */     kD.KX = paramE7.else(2) + 1;
/*   */     int j = paramE7.else(4);
/*   */     k = 0;
/*   */     b = 0;
/*   */     while (k < kD.wI0) {
/*   */       i += kD.fb0[kD.AA0[k]];
/*   */       while (b < i) {
/*   */         int[] arrayOfInt = kD.L;
/*   */         int m = b + 2;
/*   */         arrayOfInt[m] = n;
/*   */         int n;
/*   */         if ((n = paramE7.else(j)) < 0 || n >= 1 << j) {
/*   */           kD.By();
/*   */           return null;
/*   */         } 
/*   */         b++;
/*   */       } 
/*   */       k++;
/*   */     } 
/*   */     kD.L[0] = 0;
/*   */     kD.L[1] = 1 << j;
/*   */     return kD;
/*   */   }
/*   */   
/*   */   public final Object M8(eX parameX, ag paramag, Object paramObject) {
/*   */     int i = 0;
/*   */     int[] arrayOfInt = new int[65];
/*   */     KD kD = (KD)paramObject;
/*   */     super();
/*   */     ((Iv0)paramObject).Sm0 = kD;
/*   */     ((Iv0)(paramObject = new Iv0())).MF = kD.L[1];
/*   */     byte b2;
/*   */     for (b2 = 0; b2 < kD.wI0; b2++)
/*   */       i += kD.fb0[kD.AA0[b2]]; 
/*   */     ((Iv0)paramObject).Lg0 = i += 2;
/*   */     for (b2 = 0; b2 < i; b2++)
/*   */       arrayOfInt[b2] = b2; 
/*   */     for (b2 = 0; b2 < i - 1; b2++) {
/*   */       for (byte b = b2; b < i; b++) {
/*   */         int[] arrayOfInt1;
/*   */         int j;
/*   */         int k;
/*   */         if ((arrayOfInt1 = kD.L)[k = arrayOfInt[b2]] > arrayOfInt1[j = arrayOfInt[b]]) {
/*   */           arrayOfInt[b] = k;
/*   */           arrayOfInt[b2] = j;
/*   */         } 
/*   */       } 
/*   */     } 
/*   */     for (b2 = 0; b2 < i; b2++)
/*   */       ((Iv0)paramObject).strictfp[b2] = arrayOfInt[b2]; 
/*   */     byte b1;
/*   */     for (b1 = 0; b1 < i; b1++)
/*   */       ((Iv0)paramObject).Yo0[((Iv0)paramObject).strictfp[b1]] = b1; 
/*   */     for (b1 = 0; b1 < i; b1++)
/*   */       ((Iv0)paramObject).Up[b1] = kD.L[((Iv0)paramObject).strictfp[b1]]; 
/*   */     switch (kD.KX) {
/*   */       default:
/*   */         ((Iv0)paramObject).DZ = -1;
/*   */         break;
/*   */       case 4:
/*   */         ((Iv0)paramObject).DZ = 64;
/*   */         break;
/*   */       case 3:
/*   */         ((Iv0)paramObject).DZ = 86;
/*   */         break;
/*   */       case 2:
/*   */         ((Iv0)paramObject).DZ = 128;
/*   */         break;
/*   */       case 1:
/*   */         ((Iv0)paramObject).DZ = 256;
/*   */         break;
/*   */     } 
/*   */     for (b1 = 0; b1 < i - 2; b1++) {
/*   */       b2 = 0;
/*   */       byte b3 = 1;
/*   */       int j = 0;
/*   */       int k = ((Iv0)paramObject).MF;
/*   */       int m;
/*   */       int n = kD.L[m = b1 + 2];
/*   */       for (byte b4 = 0; b4 < m; b4++) {
/*   */         int i1;
/*   */         if ((i1 = kD.L[b4]) > j && i1 < n) {
/*   */           j = i1;
/*   */           b2 = b4;
/*   */         } 
/*   */         if (i1 < k && i1 > n) {
/*   */           k = i1;
/*   */           b3 = b4;
/*   */         } 
/*   */       } 
/*   */       ((Iv0)paramObject).O7[b1] = b2;
/*   */       ((Iv0)paramObject).Rc0[b1] = b3;
/*   */     } 
/*   */     return paramObject;
/*   */   }
/*   */   
/*   */   public final void Qk0() {}
/*   */   
/*   */   public final int z9(m6 paramm6, Object paramObject1, Object paramObject2, float[] paramArrayOffloat) {
/*   */     // Byte code:
/*   */     //   0: aload_3
/*   */     //   1: aload_1
/*   */     //   2: aload_2
/*   */     //   3: checkcast f/Iv0
/*   */     //   6: dup
/*   */     //   7: astore_0
/*   */     //   8: getfield Sm0 : Lf/KD;
/*   */     //   11: astore_2
/*   */     //   12: getfield qK0 : Lf/eX;
/*   */     //   15: getfield M50 : Lf/Pp0;
/*   */     //   18: getfield OF : [I
/*   */     //   21: aload_1
/*   */     //   22: getfield MW : I
/*   */     //   25: iaload
/*   */     //   26: iconst_2
/*   */     //   27: idiv
/*   */     //   28: istore_1
/*   */     //   29: ifnull -> 311
/*   */     //   32: aload_3
/*   */     //   33: checkcast [I
/*   */     //   36: dup
/*   */     //   37: astore_3
/*   */     //   38: iconst_0
/*   */     //   39: istore #5
/*   */     //   41: iconst_0
/*   */     //   42: istore #6
/*   */     //   44: iconst_0
/*   */     //   45: iaload
/*   */     //   46: aload_2
/*   */     //   47: getfield KX : I
/*   */     //   50: imul
/*   */     //   51: istore #7
/*   */     //   53: iconst_1
/*   */     //   54: istore #8
/*   */     //   56: iload #8
/*   */     //   58: aload_0
/*   */     //   59: getfield Lg0 : I
/*   */     //   62: if_icmpge -> 279
/*   */     //   65: aload_3
/*   */     //   66: aload_0
/*   */     //   67: getfield strictfp : [I
/*   */     //   70: iload #8
/*   */     //   72: iaload
/*   */     //   73: dup
/*   */     //   74: istore #9
/*   */     //   76: iaload
/*   */     //   77: dup
/*   */     //   78: istore #10
/*   */     //   80: sipush #32767
/*   */     //   83: iand
/*   */     //   84: dup
/*   */     //   85: istore #11
/*   */     //   87: iload #10
/*   */     //   89: if_icmpne -> 273
/*   */     //   92: iload #11
/*   */     //   94: aload_2
/*   */     //   95: getfield KX : I
/*   */     //   98: imul
/*   */     //   99: dup
/*   */     //   100: istore #5
/*   */     //   102: iload #7
/*   */     //   104: aload_2
/*   */     //   105: getfield L : [I
/*   */     //   108: iload #9
/*   */     //   110: iaload
/*   */     //   111: istore #9
/*   */     //   113: isub
/*   */     //   114: dup
/*   */     //   115: dup
/*   */     //   116: iload #9
/*   */     //   118: iload #6
/*   */     //   120: isub
/*   */     //   121: istore #10
/*   */     //   123: invokestatic abs : (I)I
/*   */     //   126: istore #11
/*   */     //   128: iload #10
/*   */     //   130: idiv
/*   */     //   131: istore #12
/*   */     //   133: ifge -> 145
/*   */     //   136: iload #12
/*   */     //   138: iconst_1
/*   */     //   139: isub
/*   */     //   140: istore #13
/*   */     //   142: goto -> 151
/*   */     //   145: iload #12
/*   */     //   147: iconst_1
/*   */     //   148: iadd
/*   */     //   149: istore #13
/*   */     //   151: aload #4
/*   */     //   153: iload #6
/*   */     //   155: aload #4
/*   */     //   157: iload #6
/*   */     //   159: iload #11
/*   */     //   161: iload #12
/*   */     //   163: iload #10
/*   */     //   165: iconst_0
/*   */     //   166: istore #11
/*   */     //   168: imul
/*   */     //   169: invokestatic abs : (I)I
/*   */     //   172: isub
/*   */     //   173: istore #14
/*   */     //   175: faload
/*   */     //   176: getstatic f/HI0.cA : [F
/*   */     //   179: iload #7
/*   */     //   181: faload
/*   */     //   182: fmul
/*   */     //   183: fastore
/*   */     //   184: iload #6
/*   */     //   186: iconst_1
/*   */     //   187: iadd
/*   */     //   188: dup
/*   */     //   189: istore #6
/*   */     //   191: iload #9
/*   */     //   193: if_icmpge -> 261
/*   */     //   196: iload #11
/*   */     //   198: iload #14
/*   */     //   200: iadd
/*   */     //   201: dup
/*   */     //   202: istore #11
/*   */     //   204: iload #10
/*   */     //   206: if_icmplt -> 234
/*   */     //   209: iload #7
/*   */     //   211: iload #11
/*   */     //   213: iload #10
/*   */     //   215: isub
/*   */     //   216: istore #7
/*   */     //   218: iload #13
/*   */     //   220: iadd
/*   */     //   221: istore #11
/*   */     //   223: iload #11
/*   */     //   225: iload #7
/*   */     //   227: istore #11
/*   */     //   229: istore #7
/*   */     //   231: goto -> 241
/*   */     //   234: iload #7
/*   */     //   236: iload #12
/*   */     //   238: iadd
/*   */     //   239: istore #7
/*   */     //   241: aload #4
/*   */     //   243: iload #6
/*   */     //   245: aload #4
/*   */     //   247: iload #6
/*   */     //   249: faload
/*   */     //   250: getstatic f/HI0.cA : [F
/*   */     //   253: iload #7
/*   */     //   255: faload
/*   */     //   256: fmul
/*   */     //   257: fastore
/*   */     //   258: goto -> 184
/*   */     //   261: iload #9
/*   */     //   263: iload #5
/*   */     //   265: iload #9
/*   */     //   267: istore #6
/*   */     //   269: istore #7
/*   */     //   271: istore #5
/*   */     //   273: iinc #8, 1
/*   */     //   276: goto -> 56
/*   */     //   279: iload #5
/*   */     //   281: iload_1
/*   */     //   282: if_icmpge -> 309
/*   */     //   285: aload #4
/*   */     //   287: iload #5
/*   */     //   289: aload #4
/*   */     //   291: iload #5
/*   */     //   293: faload
/*   */     //   294: aload #4
/*   */     //   296: iload #5
/*   */     //   298: iconst_1
/*   */     //   299: isub
/*   */     //   300: faload
/*   */     //   301: fmul
/*   */     //   302: fastore
/*   */     //   303: iinc #5, 1
/*   */     //   306: goto -> 279
/*   */     //   309: iconst_1
/*   */     //   310: ireturn
/*   */     //   311: iconst_0
/*   */     //   312: istore_0
/*   */     //   313: iload_0
/*   */     //   314: iload_1
/*   */     //   315: if_icmpge -> 329
/*   */     //   318: aload #4
/*   */     //   320: iload_0
/*   */     //   321: fconst_0
/*   */     //   322: fastore
/*   */     //   323: iinc #0, 1
/*   */     //   326: goto -> 313
/*   */     //   329: iconst_0
/*   */     //   330: ireturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 123
/*   */     //   #2	-> 293
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/HI0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */