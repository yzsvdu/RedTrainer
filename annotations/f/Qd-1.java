/*  1 */ package f;public final class Qd extends me { public final void Ic0(float paramFloat) { byte b1; if ((b1 = this.Fl0) != 1) { if (b1 == 4) this.rl0 = cx[this.pN][1];  } else { this.rl0 = cx[this.Me][1]; }  Jo jo; if ((jo = km.a3.Ct) == null) { this
/*  2 */         .Fl0 = 0; return; }  float f2 = this.rl0 * 0.25F + 0.125F; this(); this.q70.mh.on0(eo); eo eo; float f3, f4, f5; if ((f5 = Math.min(f3 = Math.abs((eo = new eo()).z - this.X0), f4 = Math.abs(eo.z - f2))) > 1.0F) { f5 = 1.5F; } else if (f5 > 0.25F) { f5 = 1.0F; } else { f5 = 0.5F; }  if (nx0.JC0(eo.z, f2)) { this.X0 = f2; if (this.yv != 0) { km.pm0.bL((byte)3, (short)1755); this.yv = 0; }  if ((b2 = this.Fl0) != 1) { if (b2 == 4) { this.Fl0 = 5; this.fv0 = this.pN; }  } else { this.Fl0 = 2; this.fv0 = this.Me; }  } else { if (this.yv == 0 || f3 < 1.0F) { this.yv = 1753; km.pm0.bL((byte)3, (short)1755); km.pm0.bL((byte)3, (short)1753); km.pm0.RO((byte)3, (short)1754); } else if (f4 < 1.0F) { this.yv = 1754; km.pm0.bL((byte)3, (short)1754); km.pm0.RO((byte)3, (short)1753); }
/*  3 */        eo
/*  4 */         .z = f3;
/*  5 */       eo
/*  6 */         .z = f3; if (((f3 = eo.z) < b2) ? ((f3 = UB0.M60.Qy * f5 + f3) > b2) : ((f3 -= UB0.M60.Qy * f5) < b2)) eo.z = b2;  }  byte b2; if ((b2 = this.Fl0) != 2) { if (b2 == 5)
/*  7 */       { byte b4; G5 g5 = jo.HW; boolean bool1 = false; byte b3 = 65;
/*  8 */         short arrayOfShort[][] = cx, s = arrayOfShort[this.pN][1]; boolean bool2 = false; if ((this.pN & 0x1) != 0) { b4 = 3; } else { b4 = 2; }  g5.Zh(bool1, b3, s, bool2, b4); jo
/*  9 */           .pm
/*    */           
/* 11 */           .Cb0(jo.HW);
/* 12 */         jo.pm
/* 13 */           .getClass();
/* 14 */         eo eo1 = eo.Zero; jo.pm.KC(null, false, eo1);
/* 15 */         if (arrayOfShort[this.pN][0] < 63)
/*    */         
/* 17 */         { (new nl[4])[0] = nl.CoM2; nl nl = nl.Dx0; jo.pm.Kk(new nl[] { null, nl, nl, nl }); }
/*    */         else
/* 19 */         { (new nl[5])[0] = nl.CoM2; nl nl = nl.XD; jo.pm.Kk(new nl[] { null, nl, nl, nl, nl }); }  jo
/* 20 */           .pm
/* 21 */           .nZ(new BH0(this)); this.Fl0 = 6; }  }
/* 22 */     else { if (jo.HW
/* 23 */         .mm < 63)
/*    */       
/* 25 */       { nl nl = nl.XD; jo.pm.Kk(new nl[] { nl, nl, nl, nl.XH }); }
/*    */       else
/* 27 */       { nl nl = nl.Dx0; jo.pm.Kk(new nl[] { nl, nl, nl, nl, nl.XH }); }  jo
/* 28 */         .pm
/* 29 */         .nZ(new Z00(this, jo)); this.Fl0 = 3; }  float f1 = eo.z; this.q70.mh.bb0(16.5F, 0.125F, f1); }
/*    */ 
/*    */   
/*    */   public static short[][] cx;
/*    */   public lpt1 q70;
/*    */   public byte fv0 = 5;
/*    */   public byte Me = 5;
/*    */   public byte pN = 5;
/*    */   public byte Fl0 = 0;
/*    */   public float rl0 = 107.0F;
/*    */   public float X0 = 107.0F;
/*    */   public short yv = 0;
/*    */   
/*    */   public Qd(xV paramxV) {
/*    */     super(paramxV);
/*    */     eI.Lj().getClass();
/*    */     lpt1 lpt11 = eI.Gp(475);
/*    */     float f = this.rl0 * 0.25F + 0.125F;
/*    */     lpt11.mh.bb0(16.5F, 0.125F, f);
/*    */     this.q70.Yr0 = false;
/*    */     kc(this.q70);
/*    */   }
/*    */   
/*    */   static {
/*    */     short[] arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 62;
/*    */     (new short[2])[1] = 39;
/*    */     (new short[6][])[0] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 69;
/*    */     (new short[2])[1] = 39;
/*    */     (new short[6][])[1] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 62;
/*    */     (new short[2])[1] = 81;
/*    */     (new short[6][])[2] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 69;
/*    */     (new short[2])[1] = 81;
/*    */     (new short[6][])[3] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 62;
/*    */     (new short[2])[1] = 107;
/*    */     (new short[6][])[4] = arrayOfShort;
/*    */     (arrayOfShort = new short[2])[0] = 69;
/*    */     (new short[2])[1] = 107;
/*    */     cx = new short[][] { null, null, null, null, null, arrayOfShort };
/*    */   }
/*    */   
/*    */   public final void Ad0(short[] paramArrayOfshort) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: arraylength
/*    */     //   2: iconst_1
/*    */     //   3: if_icmpge -> 7
/*    */     //   6: return
/*    */     //   7: aload_1
/*    */     //   8: iconst_0
/*    */     //   9: saload
/*    */     //   10: sipush #4624
/*    */     //   13: if_icmpeq -> 19
/*    */     //   16: goto -> 157
/*    */     //   19: aload_1
/*    */     //   20: iconst_1
/*    */     //   21: saload
/*    */     //   22: i2b
/*    */     //   23: istore_1
/*    */     //   24: getstatic f/km.a3 : Lf/vh0;
/*    */     //   27: getfield Ct : Lf/Jo;
/*    */     //   30: dup
/*    */     //   31: astore_2
/*    */     //   32: ifnonnull -> 38
/*    */     //   35: goto -> 96
/*    */     //   38: iconst_0
/*    */     //   39: istore_3
/*    */     //   40: iload_3
/*    */     //   41: getstatic f/Qd.cx : [[S
/*    */     //   44: astore #4
/*    */     //   46: bipush #6
/*    */     //   48: if_icmpge -> 96
/*    */     //   51: aload_2
/*    */     //   52: getfield HW : Lf/G5;
/*    */     //   55: dup
/*    */     //   56: astore #5
/*    */     //   58: getfield mm : S
/*    */     //   61: aload #4
/*    */     //   63: iload_3
/*    */     //   64: aaload
/*    */     //   65: dup
/*    */     //   66: astore #4
/*    */     //   68: iconst_0
/*    */     //   69: saload
/*    */     //   70: if_icmpne -> 88
/*    */     //   73: aload #5
/*    */     //   75: getfield Yu0 : S
/*    */     //   78: aload #4
/*    */     //   80: iconst_1
/*    */     //   81: saload
/*    */     //   82: if_icmpne -> 88
/*    */     //   85: goto -> 98
/*    */     //   88: iload_3
/*    */     //   89: iconst_1
/*    */     //   90: iadd
/*    */     //   91: i2b
/*    */     //   92: istore_3
/*    */     //   93: goto -> 40
/*    */     //   96: iconst_0
/*    */     //   97: istore_3
/*    */     //   98: iload_3
/*    */     //   99: aload_0
/*    */     //   100: dup
/*    */     //   101: iload_1
/*    */     //   102: aload_0
/*    */     //   103: iload_3
/*    */     //   104: putfield Me : B
/*    */     //   107: putfield pN : B
/*    */     //   110: getfield fv0 : B
/*    */     //   113: istore_1
/*    */     //   114: iconst_1
/*    */     //   115: ior
/*    */     //   116: iload_1
/*    */     //   117: iconst_1
/*    */     //   118: ior
/*    */     //   119: if_icmpne -> 126
/*    */     //   122: iconst_1
/*    */     //   123: goto -> 127
/*    */     //   126: iconst_0
/*    */     //   127: ifeq -> 138
/*    */     //   130: aload_0
/*    */     //   131: iconst_2
/*    */     //   132: putfield Fl0 : B
/*    */     //   135: goto -> 143
/*    */     //   138: aload_0
/*    */     //   139: iconst_1
/*    */     //   140: putfield Fl0 : B
/*    */     //   143: getstatic f/km.u4 : Lf/R8;
/*    */     //   146: new f/lG
/*    */     //   149: dup
/*    */     //   150: aload_0
/*    */     //   151: invokespecial <init> : (Lf/Qd;)V
/*    */     //   154: putfield hB0 : Lf/Ca;
/*    */     //   157: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 24
/*    */     //   #2	-> 27
/*    */     //   #3	-> 41
/*    */     //   #4	-> 52
/*    */     //   #5	-> 58
/*    */     //   #6	-> 64
/*    */     //   #7	-> 75
/*    */     //   #8	-> 81
/*    */     //   #9	-> 104
/*    */     //   #10	-> 154
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Qd.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */