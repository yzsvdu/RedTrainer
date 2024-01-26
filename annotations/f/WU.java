/* 1 */ package f;public final class WU implements con { public final int Uu0(Object paramObject, int paramInt, float[] paramArrayOffloat) { eo eo; Ih0 ih0 = (Ih0)paramObject; switch (paramInt) { default: if (Rv0) return 0;  throw new AssertionError();case 10: paramArrayOffloat[0] = this.x; paramArrayOffloat[1] = this.y; paramArrayOffloat[2] = (eo = this.c5).z; return 3;case 9: paramArrayOffloat[0] = this.x; paramArrayOffloat[1] = this.y; paramArrayOffloat[2] = (eo = ((Ih0)this).I70).z; return 3;case 8: paramArrayOffloat[0] = ((Dd)this).Bj; return 1;case 7: paramArrayOffloat[0] = ((Ih0)this).el0; return 1;case 6: paramArrayOffloat[0] = ((Ih0)this).IG0; return 1;case 5: paramArrayOffloat[0] = ((Ih0)this).Mp; return 1;case 4: paramArrayOffloat[0] = this.x; paramArrayOffloat[1] = this.y; paramArrayOffloat[2] = (eo = ((Ih0)this).Ah).z; return 3;case 3: paramArrayOffloat[0] = ((Ih0)this).Ah.z; return 1;case 2: paramArrayOffloat[0] = ((Ih0)this).Ah.y; return 1;case 1: break; }  paramArrayOffloat[0] = ((Ih0)this).Ah.x; return 1; }
/*   */ 
/*   */   
/*   */   public final void ng(Object paramObject, int paramInt, float[] paramArrayOffloat) {
/*   */     // Byte code:
/*   */     //   0: iload_2
/*   */     //   1: aload_1
/*   */     //   2: checkcast f/Ih0
/*   */     //   5: astore_0
/*   */     //   6: tableswitch default -> 60, 1 -> 338, 2 -> 310, 3 -> 283, 4 -> 256, 5 -> 207, 6 -> 196, 7 -> 157, 8 -> 142, 9 -> 120, 10 -> 69
/*   */     //   60: getstatic f/WU.Rv0 : Z
/*   */     //   63: ifeq -> 363
/*   */     //   66: goto -> 362
/*   */     //   69: aload_0
/*   */     //   70: dup
/*   */     //   71: dup
/*   */     //   72: getfield c5 : Lf/eo;
/*   */     //   75: aload_3
/*   */     //   76: dup
/*   */     //   77: dup
/*   */     //   78: iconst_0
/*   */     //   79: faload
/*   */     //   80: fstore_0
/*   */     //   81: iconst_1
/*   */     //   82: faload
/*   */     //   83: fstore_1
/*   */     //   84: iconst_2
/*   */     //   85: faload
/*   */     //   86: fstore_2
/*   */     //   87: fload_0
/*   */     //   88: fload_1
/*   */     //   89: fload_2
/*   */     //   90: invokevirtual TG0 : (FFF)Lf/eo;
/*   */     //   93: pop
/*   */     //   94: getfield Ah : Lf/eo;
/*   */     //   97: dup
/*   */     //   98: dup
/*   */     //   99: getfield x : F
/*   */     //   102: fstore_0
/*   */     //   103: getfield y : F
/*   */     //   106: fstore_1
/*   */     //   107: getfield z : F
/*   */     //   110: fstore_2
/*   */     //   111: fload_0
/*   */     //   112: fload_1
/*   */     //   113: fload_2
/*   */     //   114: invokevirtual mP : (FFF)V
/*   */     //   117: goto -> 362
/*   */     //   120: aload_0
/*   */     //   121: aload_3
/*   */     //   122: dup
/*   */     //   123: dup
/*   */     //   124: iconst_0
/*   */     //   125: faload
/*   */     //   126: fstore_1
/*   */     //   127: iconst_1
/*   */     //   128: faload
/*   */     //   129: fstore_2
/*   */     //   130: iconst_2
/*   */     //   131: faload
/*   */     //   132: fstore_3
/*   */     //   133: fload_1
/*   */     //   134: fload_2
/*   */     //   135: fload_3
/*   */     //   136: invokevirtual nq0 : (FFF)V
/*   */     //   139: goto -> 275
/*   */     //   142: aload_0
/*   */     //   143: dup
/*   */     //   144: aload_3
/*   */     //   145: iconst_0
/*   */     //   146: faload
/*   */     //   147: putfield Bj : F
/*   */     //   150: iconst_1
/*   */     //   151: invokevirtual abstract : (Z)V
/*   */     //   154: goto -> 362
/*   */     //   157: aload_0
/*   */     //   158: dup
/*   */     //   159: dup2
/*   */     //   160: aload_3
/*   */     //   161: iconst_0
/*   */     //   162: faload
/*   */     //   163: putfield el0 : F
/*   */     //   166: getfield Ah : Lf/eo;
/*   */     //   169: dup
/*   */     //   170: dup
/*   */     //   171: getfield x : F
/*   */     //   174: fstore_0
/*   */     //   175: getfield y : F
/*   */     //   178: fstore_1
/*   */     //   179: getfield z : F
/*   */     //   182: fstore_2
/*   */     //   183: fload_0
/*   */     //   184: fload_1
/*   */     //   185: fload_2
/*   */     //   186: invokevirtual mP : (FFF)V
/*   */     //   189: iconst_1
/*   */     //   190: invokevirtual abstract : (Z)V
/*   */     //   193: goto -> 362
/*   */     //   196: aload_0
/*   */     //   197: aload_3
/*   */     //   198: iconst_0
/*   */     //   199: faload
/*   */     //   200: iconst_1
/*   */     //   201: invokevirtual Ig : (FZ)V
/*   */     //   204: goto -> 362
/*   */     //   207: aload_0
/*   */     //   208: dup
/*   */     //   209: dup
/*   */     //   210: aload_3
/*   */     //   211: iconst_0
/*   */     //   212: faload
/*   */     //   213: dup
/*   */     //   214: fstore_1
/*   */     //   215: aload_0
/*   */     //   216: dup
/*   */     //   217: dup
/*   */     //   218: getfield nj0 : Lf/eo;
/*   */     //   221: getstatic f/eo.Y : Lf/eo;
/*   */     //   224: dup
/*   */     //   225: astore_0
/*   */     //   226: invokevirtual JL : (Lf/eo;)Lf/eo;
/*   */     //   229: pop
/*   */     //   230: getfield I70 : Lf/eo;
/*   */     //   233: astore_2
/*   */     //   234: getfield Mp : F
/*   */     //   237: fsub
/*   */     //   238: fstore_3
/*   */     //   239: aload_2
/*   */     //   240: aload_0
/*   */     //   241: fload_3
/*   */     //   242: invokevirtual e20 : (Lf/eo;Lf/eo;F)V
/*   */     //   245: fload_1
/*   */     //   246: putfield Mp : F
/*   */     //   249: iconst_1
/*   */     //   250: invokevirtual abstract : (Z)V
/*   */     //   253: goto -> 362
/*   */     //   256: aload_0
/*   */     //   257: aload_3
/*   */     //   258: dup
/*   */     //   259: dup
/*   */     //   260: iconst_0
/*   */     //   261: faload
/*   */     //   262: fstore_1
/*   */     //   263: iconst_1
/*   */     //   264: faload
/*   */     //   265: fstore_2
/*   */     //   266: iconst_2
/*   */     //   267: faload
/*   */     //   268: fstore_3
/*   */     //   269: fload_1
/*   */     //   270: fload_2
/*   */     //   271: fload_3
/*   */     //   272: invokevirtual mP : (FFF)V
/*   */     //   275: aload_0
/*   */     //   276: iconst_1
/*   */     //   277: invokevirtual abstract : (Z)V
/*   */     //   280: goto -> 362
/*   */     //   283: aload_0
/*   */     //   284: aload_3
/*   */     //   285: aload_0
/*   */     //   286: getfield Ah : Lf/eo;
/*   */     //   289: dup
/*   */     //   290: getfield x : F
/*   */     //   293: fstore_0
/*   */     //   294: getfield y : F
/*   */     //   297: fstore_1
/*   */     //   298: iconst_0
/*   */     //   299: faload
/*   */     //   300: fstore_2
/*   */     //   301: fload_0
/*   */     //   302: fload_1
/*   */     //   303: fload_2
/*   */     //   304: invokevirtual mP : (FFF)V
/*   */     //   307: goto -> 362
/*   */     //   310: aload_0
/*   */     //   311: dup
/*   */     //   312: getfield Ah : Lf/eo;
/*   */     //   315: dup
/*   */     //   316: aload_3
/*   */     //   317: swap
/*   */     //   318: getfield x : F
/*   */     //   321: fstore_0
/*   */     //   322: iconst_0
/*   */     //   323: faload
/*   */     //   324: fstore_1
/*   */     //   325: getfield z : F
/*   */     //   328: fstore_2
/*   */     //   329: fload_0
/*   */     //   330: fload_1
/*   */     //   331: fload_2
/*   */     //   332: invokevirtual mP : (FFF)V
/*   */     //   335: goto -> 362
/*   */     //   338: aload_0
/*   */     //   339: dup
/*   */     //   340: aload_3
/*   */     //   341: iconst_0
/*   */     //   342: faload
/*   */     //   343: fstore_0
/*   */     //   344: getfield Ah : Lf/eo;
/*   */     //   347: dup
/*   */     //   348: getfield y : F
/*   */     //   351: fstore_1
/*   */     //   352: getfield z : F
/*   */     //   355: fstore_2
/*   */     //   356: fload_0
/*   */     //   357: fload_1
/*   */     //   358: fload_2
/*   */     //   359: invokevirtual mP : (FFF)V
/*   */     //   362: return
/*   */     //   363: new java/lang/AssertionError
/*   */     //   366: dup
/*   */     //   367: invokespecial <init> : ()V
/*   */     //   370: athrow
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 60
/*   */     //   #2	-> 146
/*   */     //   #3	-> 163
/*   */     //   #4	-> 166
/*   */     //   #5	-> 190
/*   */     //   #6	-> 199
/*   */     //   #7	-> 218
/*   */     //   #8	-> 221
/*   */     //   #9	-> 250
/*   */     //   #10	-> 261
/*   */     //   #11	-> 277
/*   */     //   #12	-> 286
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/WU.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */