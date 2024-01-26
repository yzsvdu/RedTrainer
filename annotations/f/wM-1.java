/*    */ package f;public final class wM extends me { public static final eo xu = new eo(); public boolean jy0 = false; public boolean zS = false; public Jo qK = null; public lpt1 S8; public wM(hB0 paramhB0) { super(paramhB0); eI.Lj().getClass(); lpt1 lpt11 = eI.Yp0((byte)4, 111, false); this.mh.bb0(3.875F, 0.5F, 5.125F); this.S8.Yr0 = false; this.S8.ml0(0, true); kc(this.S8); } public final void Ic0(float paramFloat) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: dup
/*    */     //   2: getfield S8 : Lf/lpt1;
/*    */     //   5: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   8: getstatic f/wM.xu : Lf/eo;
/*    */     //   11: dup
/*    */     //   12: astore_2
/*    */     //   13: invokevirtual on0 : (Lf/eo;)Lf/eo;
/*    */     //   16: pop
/*    */     //   17: getfield jy0 : Z
/*    */     //   20: ifeq -> 29
/*    */     //   23: ldc 7.725
/*    */     //   25: fstore_3
/*    */     //   26: goto -> 32
/*    */     //   29: ldc 0.5
/*    */     //   31: fstore_3
/*    */     //   32: aload_2
/*    */     //   33: getfield y : F
/*    */     //   36: dup
/*    */     //   37: fstore #4
/*    */     //   39: fload_3
/*    */     //   40: fcmpg
/*    */     //   41: ifge -> 73
/*    */     //   44: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   47: getfield Qy : F
/*    */     //   50: ldc 5.0
/*    */     //   52: fmul
/*    */     //   53: fload #4
/*    */     //   55: fadd
/*    */     //   56: dup
/*    */     //   57: fstore #4
/*    */     //   59: fload_3
/*    */     //   60: aload_2
/*    */     //   61: fload #4
/*    */     //   63: putfield y : F
/*    */     //   66: fcmpl
/*    */     //   67: iflt -> 111
/*    */     //   70: goto -> 106
/*    */     //   73: fload #4
/*    */     //   75: fload_3
/*    */     //   76: fcmpl
/*    */     //   77: ifle -> 125
/*    */     //   80: fload #4
/*    */     //   82: getstatic f/UB0.M60 : Lf/w70;
/*    */     //   85: getfield Qy : F
/*    */     //   88: ldc 5.0
/*    */     //   90: fmul
/*    */     //   91: fsub
/*    */     //   92: dup
/*    */     //   93: fstore #4
/*    */     //   95: fload_3
/*    */     //   96: aload_2
/*    */     //   97: fload #4
/*    */     //   99: putfield y : F
/*    */     //   102: fcmpg
/*    */     //   103: ifgt -> 111
/*    */     //   106: aload_2
/*    */     //   107: fload_3
/*    */     //   108: putfield y : F
/*    */     //   111: aload_0
/*    */     //   112: getfield S8 : Lf/lpt1;
/*    */     //   115: getfield mh : Lcom/badlogic/gdx/math/Matrix4;
/*    */     //   118: aload_2
/*    */     //   119: invokevirtual b8 : (Lf/eo;)V
/*    */     //   122: goto -> 205
/*    */     //   125: aload_0
/*    */     //   126: dup
/*    */     //   127: iconst_0
/*    */     //   128: putfield zS : Z
/*    */     //   131: getfield qK : Lf/Jo;
/*    */     //   134: ifnull -> 205
/*    */     //   137: aload_0
/*    */     //   138: dup
/*    */     //   139: dup
/*    */     //   140: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   143: iconst_4
/*    */     //   144: sipush #1552
/*    */     //   147: invokevirtual RO : (BS)V
/*    */     //   150: getstatic f/km.pm0 : Lf/VD0;
/*    */     //   153: iconst_4
/*    */     //   154: sipush #1561
/*    */     //   157: invokevirtual bL : (BS)V
/*    */     //   160: getfield qK : Lf/Jo;
/*    */     //   163: getfield pm : Lf/d7;
/*    */     //   166: dup
/*    */     //   167: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   170: pop
/*    */     //   171: getstatic f/eo.Zero : Lf/eo;
/*    */     //   174: astore_2
/*    */     //   175: aconst_null
/*    */     //   176: iconst_0
/*    */     //   177: aload_2
/*    */     //   178: invokevirtual KC : (Lf/lpt1;ZLf/eo;)V
/*    */     //   181: getfield qK : Lf/Jo;
/*    */     //   184: getfield Ae : Lf/zk0;
/*    */     //   187: getfield pm : Lf/d7;
/*    */     //   190: dup
/*    */     //   191: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   194: pop
/*    */     //   195: aconst_null
/*    */     //   196: iconst_0
/*    */     //   197: aload_2
/*    */     //   198: invokevirtual KC : (Lf/lpt1;ZLf/eo;)V
/*    */     //   201: aconst_null
/*    */     //   202: putfield qK : Lf/Jo;
/*    */     //   205: aload_0
/*    */     //   206: fload_1
/*    */     //   207: invokespecial Ic0 : (F)V
/*    */     //   210: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 47
/*    */     //   #2	-> 63
/*    */     //   #3	-> 85
/*    */     //   #4	-> 99
/*    */     //   #5	-> 163
/*    */     //   #6	-> 167
/*    */     //   #7	-> 171
/*    */     //   #8	-> 181
/*    */     //   #9	-> 184
/*    */     //   #10	-> 187
/*    */     //   #11	-> 191
/*    */     //   #12	-> 198
/*  1 */     //   #13	-> 202 } public final void Ad0(short[] paramArrayOfshort) { Jo jo; if (paramArrayOfshort.length < 1) return;  short s; if ((s = paramArrayOfshort[0]) != 4699) { if (s == 4700) { vh0 vh0; if ((vh0 = km.a3) == null) return;  jo = vh0.Ct;
/*  2 */         tD0(paramArrayOfshort[1], this); }  } else { super.tD0(paramArrayOfshort[1], null); }  } public final void tD0(short paramShort, Jo paramJo) { if (paramShort == 1) { paramShort = 1; } else { paramShort = 0; }  this.jy0 = paramShort; if (paramJo == null) { float f; eo eo1; this.S8.mh.on0(eo1 = xu); if (this.jy0) { f = 7.725F; } else { f = 0.5F; }  eo1.y = f; this.S8.mh.b8(eo1); this.S8.C50(); this.qK = null; } else { this.zS = true; km.pm0.bL((byte)4, (short)1552); Jo jo; if ((jo = km.a3.Ct) != null) { this.qK = jo;
/*    */         
/*  4 */         lpt1 lpt11 = this.S8; jo.pm.getClass();
/*  5 */         eo eo1 = eo.Zero; jo.pm.KC(lpt11, true, eo1);
/*    */ 
/*    */         
/*  8 */         lpt1 lpt12 = this.S8; jo.Ae.pm.getClass();
/*  9 */         jo.Ae.pm.KC(lpt12, true, eo1);
/* 10 */         km.u4
/* 11 */           .hB0 = new o5(this); }  }  label35: for (paramShort = -1; paramShort < 2; ) { for (short s = -1; s < 2; )
/*    */       { float f; xr0 xr0;
/* 13 */         if ((xr0 = this.im0.v50(paramShort + 15, s + 20, 0)) == null) break label35;  if (this
/* 14 */           .jy0) { f = 31.0F; } else { f = 2.0F; }  ((il)xr0)
/* 15 */           .xJ = f; s = (short)(s + 1); }  paramShort = (short)(paramShort + 1); }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wM.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */