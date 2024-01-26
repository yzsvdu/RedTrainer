/*  1 */ package f;public final class bn0 { public static Logger wE = Logger.getLogger(bn0.class.getName()); public static final com6 qs = new com6(0, 0); public static final JB mq0 = new JB(); public static final int[] TV = new int[] { 0, 1, 0 }; public static final int[] r00 = new int[] { 1 }; public final q80 WK; public final VI tJ0; public final TreeMap Bd0; public final TreeMap js0; public nK J; public final void Mn(xS paramxS, String paramString) { int i; String str; if ((str = paramxS.S3("ref")) != null) { JE0 jE0; if ((jE0 = (JE0)this.js0.get(str)) == null) throw paramxS.s70("referenced cursor \"" + str + "\" not found");  } else { if (this.J != null) { boolean bool; str = paramxS.Jg0("xywh"); if ("*".equals(str)) { bool = false; i = 0;
/*  2 */           int m = this.J.Jd0;
/*  3 */           int n = this.J.SI0; }
/*  4 */         else { try { int[] arrayOfInt; if ((arrayOfInt = gd0.dB0(bool)).length == 4) { int i1 = arrayOfInt[0]; i = arrayOfInt[1]; int i2 = arrayOfInt[2], i3 = arrayOfInt[3];
/*    */                }
/*    */             
/*    */             else
/*    */             
/*  9 */             { throw paramxS
/* 10 */                 .s70("xywh requires 4 integer arguments"); }  int m = paramxS.ts(paramxS.Jg0("hotSpotX")), n = paramxS.ts(paramxS.Jg0("hotSpotY")); mX mX1 = null; String str2; if ((str2 = paramxS.S3("imageRef")) != null) mX1 = Mi0(paramxS, str2);  } catch (IllegalArgumentException illegalArgumentException) { throw paramxS.q70("can't parse xywh argument", this); }  }  } else { throw paramxS.s70("can't create area outside of <imagefile> object"); }  int j = paramxS.ts(paramxS.Jg0("hotSpotX")), k = paramxS.ts(paramxS.Jg0("hotSpotY")); mX mX = null; String str1; if ((str1 = paramxS.S3("imageRef")) != null) mX = super.Mi0(paramxS, str1);  }  ((bn0)super).js0.put(paramString, i); paramxS.LX(); } public final mX iq(xS paramxS, String paramString, la paramla) { mX mX2, mX1; boolean bool2; q80 q801 = this.WK; pRn pRn2 = null; String str; if ((str = paramxS.S3("tint")) != null) pRn2 = VN.qs(paramxS, str, q801);  paramla.Jw0 = pRn2; paramla.LN = VN.Ny0(paramxS, "border"); paramla.cE = VN.Ny0(paramxS, "inset"); paramla.rV = paramxS.GC("repeatX", false); paramla.Yf0 = paramxS.GC("repeatY", false); paramla.CG0 = paramxS.pI(-1, "sizeOverwriteH"); paramla.K50 = paramxS.pI(-1, "sizeOverwriteV"); paramla.vF = paramxS.GC("center", false); if ("area".equals(paramString)) { ur(paramxS, paramla); ep0(paramxS, paramla); bool2 = paramxS.GC("tiled", false); int[] arrayOfInt2 = rq0(paramxS, "splity", Math.abs(paramla.aw0)); int[] arrayOfInt1; if ((arrayOfInt1 = rq0(paramxS, "splitx", Math.abs(paramla.QC0))) != null || arrayOfInt2 != null) { byte b1, b2; boolean bool = paramxS.GC("nocenter", false); if (arrayOfInt1 != null) { b1 = 3; } else { b1 = 1; }  if (arrayOfInt2 != null) { b2 = 3; } else { b2 = 1; }  mX[] arrayOfMX; byte b3; for (arrayOfMX = new mX[b1 * b2], b3 = 0; b3 < b2; ) { int j, k; if (arrayOfInt2 != null) { k = paramla.Tt + (j = arrayOfInt2[b3]); j = arrayOfInt2[b3 + 1] - j; j = Integer.signum(paramla.aw0) * j; } else { k = paramla.Tt; j = paramla.aw0; }  for (byte b = 0; b < b1; ) { mX mX; boolean bool3; if (arrayOfInt1 != null) { int n = paramla.ba0 + (m = arrayOfInt1[b]); m = arrayOfInt1[b + 1] - m; m = Integer.signum(paramla.QC0) * m; } else { int n = paramla.ba0; m = paramla.QC0; }  if (b3 == b2 / 2 && b == b1 / 2) { bool3 = true; } else { bool3 = false; }  if (bool && bool3) { this(m, j); } else { pRn pRn = paramla.Jw0; boolean bool4 = bool3 & bool2; int n = paramla.lPT6; mX = fE(paramxS, mX, k, m, j, pRn, bool4, n); }  int m; if ((m = Zk0.yE(paramla.lPT6)) != 1) { if (m != 2) { if (m != 3) { m = b3 * b1 + b; } else { m = (b1 - 1 - b) * b2 + b3; }  } else { m = (b2 - 1 - b3) * b1; m = b1 - 1 - b + m; }  } else { m = b * b2; m = b2 - 1 - b3 + m; }  arrayOfMX[m] = mX; b++; }  b3++; }  int i; if ((i = Zk0.yE(paramla.lPT6)) != 1 && i != 3) { mX2 = new Ha(); if (arrayOfInt1 != null) { arrayOfInt1 = TV; } else { arrayOfInt1 = r00; }  if (arrayOfInt2 != null) { arrayOfInt2 = TV; } else { arrayOfInt2 = r00; }  uE0 uE0 = paramla.LN; this(arrayOfMX, arrayOfInt1, arrayOfInt2, uE0); } else { mX2 = new Ha(); if (arrayOfInt2 != null) { arrayOfInt2 = TV; } else { arrayOfInt2 = r00; }  if (arrayOfInt1 != null) { arrayOfInt1 = TV; } else { arrayOfInt1 = r00; }  uE0 uE0 = paramla.LN; this(arrayOfMX, arrayOfInt2, arrayOfInt1, uE0); }  } else { int i = paramla.ba0, j = paramla.Tt, k = paramla.QC0, m = paramla.aw0; pRn pRn = paramla.Jw0; int n = paramla.lPT6; mX2 = super.fE(paramxS, i, j, k, m, pRn, bool2, n); }  paramxS.LX(); paramla.Jw0 = null; if (bool2) { paramla.rV = false; paramla.Yf0 = false; }  } else if ("alias".equals(bool2)) { mX2 = super.Mi0(paramxS, paramxS.Jg0("ref")); paramxS.LX(); } else { mX[] arrayOfMX; ArrayList<mX> arrayList; if ("composed".equals(bool2)) { this(); paramxS.LX(); while (!paramxS.aM()) { paramxS
/* 11 */             .bb.require(2, null, null); String str1;
/*    */           mX mX;
/* 13 */           arrayList.add(mX = super.B30(paramxS, str1 = paramxS.bb.getName())); uE0 uE0; if ((uE0 = paramla.LN) == null && mX instanceof VK0)
/* 14 */             uE0 = ((VK0)mX).mJ0();  paramla
/* 15 */             .LN = uE0;
/* 16 */           paramxS.bb.require(3, null, str1);
/* 17 */           paramxS.LX(); }  int i; if ((i = arrayList.size()) != 0) { if (i != 1) { LPt5 lPt5; arrayOfMX = arrayList.<mX>toArray(new mX[0]); this(arrayOfMX, paramla.LN); } else { mX1 = arrayList.get(0); }  } else { mX1 = qs; }  }
/* 18 */       else { mX mX; Sv0 sv0; if ("select".equals(arrayList))
/* 19 */         { ArrayList<Nm0> arrayList1; StringBuilder stringBuilder; this(); this(); arrayOfMX.LX(); for (boolean bool = false; !bool && !arrayOfMX.aM(); ) { boolean bool4; la la1; ((xS)arrayOfMX)
/* 20 */               .bb.require(2, null, null);
/* 21 */             Nm0 nm0 = VN.A10((xS)arrayOfMX);
/* 22 */             str = ((xS)arrayOfMX).bb.getName();
/* 23 */             this(); mX mX3 = super.iq((xS)arrayOfMX, str, la1); uE0 uE0; if ((uE0 = paramla.LN) == null && mX3 instanceof VK0)
/* 24 */               uE0 = ((VK0)mX3).mJ0();  paramla
/* 25 */               .LN = uE0;
/* 26 */             ((xS)arrayOfMX).bb.require(3, null, str);
/* 27 */             arrayOfMX.LX(); if (nm0 == null) { bool4 = true; } else { bool4 = false; }  CT cT; if (mX3 instanceof CT && ((
/* 28 */               !(cT = (CT)mX3).QJ0 && cT
/* 29 */               .rA == null && cT.f80 < 0 && cT.nj0 < 0)))
/* 30 */             { Nm0 nm01 = cT.VK0; if (nm0 == null) { nm0 = nm01; } else if (nm01 != null)
/* 31 */               { YL yL; Nm0[] arrayOfNm0; (arrayOfNm0 = new Nm0[2])[0] = nm0; (new Nm0[2])[1] = nm01; this('+', arrayOfNm0); nm0 = yL; }
/* 32 */                mX3 = cT.gU; }  arrayList.add(mX3); if (nm0 != null) arrayList1.add(nm0);  boolean bool3 = bool4; }  if (arrayList1.isEmpty()) { String str1; Logger logger = wE; this(); if (((xS)arrayOfMX)
/* 33 */               .Rm0 != null)
/*    */             
/* 35 */             { str1 = ((xS)arrayOfMX).Rm0 + ":" + ((xS)arrayOfMX).bb.getLineNumber(); } else { str1 = ((xS)str1).bb.getPositionDescription(); }
/* 36 */              warning(stringBuilder.append(str1).append(": state select image needs atleast 1 condition").toString()); if (arrayList.isEmpty()) { com6 com61 = qs; } else { mX = arrayList.get(0); }  }
/* 37 */           else { vc vc; this((Nm0[])stringBuilder.toArray((Object[])new Nm0[0]));
/* 38 */             uE0 uE0 = paramla.LN; this(this, this, arrayList.<mX>toArray(new mX[0])); mX = sv0; }  }
/* 39 */         else { vu0 vu0; int[] arrayOfInt; String str1; if ("grid".equals(arrayList)) { 
/*    */             try { 
/* 41 */               try { int[] arrayOfInt1 = gd0.dB0(sv0.Jg0("weightsX")); 
/*    */                 try { Ha ha2;
/* 43 */                   arrayOfInt = gd0.dB0(sv0.Jg0("weightsY"));
/* 44 */                   mX[] arrayOfMX1 = new mX[this.length * arrayOfInt.length]; sv0.LX(); super.e30((xS)sv0, arrayOfMX1); uE0 uE0 = paramla.LN; this(arrayOfMX1, this, arrayOfInt, uE0); Ha ha1 = ha2; } catch (NumberFormatException null) { throw sv0
/* 45 */                     .q70("Unable to parse", this); }  } catch (NumberFormatException null) {} } catch (IllegalArgumentException illegalArgumentException1) {} throw sv0
/* 46 */               .q70("Unable to parse", this); }
/*    */           
/* 48 */           if ("animation".equals(arrayOfInt)) { int i; UU uU; 
/* 49 */             try { str1 = sv0.Jg0("timeSource"); i = sv0.pI(-1, "frozenTime"); uU = super.up((xS)sv0); if (paramla.LN == null) paramla.LN = HQ(uU);  } catch (IllegalArgumentException null) {} vu0 = new vu0(); VI vI = ((bn0)super).tJ0; uE0 uE0 = paramla.LN; pRn pRn; if ((pRn = paramla.Jw0) == null) pRn = pRn.WHITE;  this(vI, uU, str1, uE0, pRn, i); paramla.Jw0 = null; }
/* 50 */           else { DD0 dD0; if ("gradient".equals(str1)) { 
/* 51 */               try { Ii0 ii0; Class<vc0> clazz = vc0.class;
/*    */ 
/*    */                 
/* 54 */                 vc0 vc0 = (vc0)sv0.dj(clazz, sv0.Jg0("type")); Class<xn0> clazz1 = xn0.class; Enum enum_ = xn0.LD;
/* 55 */                 if ((str = sv0.S3("wrap")) != null) enum_ = sv0.dj(clazz1, str); 
/* 56 */                 this(vc0); xn0 xn0; if ((xn0 = (xn0)enum_) != null) { ii0
/* 57 */                     .JZ = xn0; while (true) { byte b; sv0
/* 58 */                       .LX();
/* 59 */                     if (((xS)sv0).bb.getEventType() == 2) { b = 1; } else { b = 0; }  if (b) { b = 2; xn0 = null;
/* 60 */                       str = "stop";
/* 61 */                       ((xS)sv0).bb.require(b, (String)xn0, str);
/*    */ 
/*    */                       
/* 64 */                       try { float f = Float.parseFloat(sv0.Jg0("pos"));
/* 65 */                         String str2 = sv0.Jg0("color"); ii0.or(f, VN.qs((xS)sv0, str2, ((bn0)super).WK)); sv0.LX(); byte b1 = 3; str2 = null; str = "stop";
/* 66 */                         ((xS)sv0).bb.require(b1, str2, str); } catch (NumberFormatException numberFormatException)
/* 67 */                       { throw (XmlPullParserException)(new XmlPullParserException("Unable to parse float", sv0.bb, this)).initCause(this); }  continue; }  break; }
/* 68 */                    tw tw; (tw = (tw)((bn0)super).tJ0).getClass();
/* 69 */                   this(this, ii0); DD0 dD01 = dD0;
/*    */                    }
/*    */                 
/*    */                 else
/*    */                 
/*    */                 { 
/* 75 */                   throw new NullPointerException("wrap"); }  } catch (IllegalArgumentException illegalArgumentException) {} }
/* 76 */             else { throw sv0
/* 77 */                 .s70("Unexpected '" + dD0 + "'"); }
/*    */              }
/*    */            }
/*    */          }
/*    */        }
/*    */     
/*    */     uE0 uE01;
/*    */     if ((uE01 = paramla.LN) == null && this instanceof VK0)
/*    */       uE01 = ((VK0)this).mJ0(); 
/*    */     pRn pRn1;
/*    */     if ((pRn1 = paramla.Jw0) != null && !pRn.WHITE.equals(pRn1))
/*    */       mX1 = rv0(paramla.Jw0); 
/*    */     boolean bool1;
/*    */     if ((bool1 = paramla.rV) || paramla.Yf0) {
/*    */       Jy jy;
/*    */       boolean bool = paramla.Yf0;
/*    */       this(this, uE01, bool1, bool);
/*    */       mX1 = jy;
/*    */     } 
/*    */     uE0 uE02 = null;
/*    */     if (this instanceof VK0)
/*    */       uE02 = ((VK0)this).mJ0(); 
/*    */     if ((uE01 != null && uE01 != uE02) || paramla.cE != null || paramla.vF || paramla.LK0 != null || paramla.CG0 >= 0 || paramla.K50 >= 0) {
/*    */       CT cT;
/*    */       uE0 uE0 = paramla.cE;
/*    */       int i = paramla.CG0, j = paramla.K50;
/*    */       boolean bool = paramla.vF;
/*    */       Nm0 nm0 = paramla.LK0;
/*    */       this(this, uE01, uE0, i, j, bool, nm0);
/*    */       mX1 = cT;
/*    */     } 
/*    */     return this; }
/*    */ 
/*    */   
/*    */   public final mX B30(xS paramxS, String paramString) {
/*    */     this();
/*    */     la la;
/*    */     (la = new la()).LK0 = VN.A10(paramxS);
/*    */     return iq(paramxS, paramString, this);
/*    */   }
/*    */   
/*    */   public final void e30(xS paramxS, mX[] paramArrayOfmX) {
/*    */     byte b = 0;
/*    */     while (true) {
/*    */       boolean bool;
/*    */       if (paramxS.bb.getEventType() == 2) {
/*    */         bool = true;
/*    */       } else {
/*    */         bool = false;
/*    */       } 
/*    */       if (bool) {
/*    */         if (b != paramArrayOfmX.length) {
/*    */           b++;
/*    */           String str;
/*    */           paramArrayOfmX[b] = B30(paramxS, str = paramxS.bb.getName());
/*    */           paramxS.bb.require(3, null, str);
/*    */           paramxS.LX();
/*    */           continue;
/*    */         } 
/*    */         throw paramxS.s70("Too many sub images");
/*    */       } 
/*    */       break;
/*    */     } 
/*    */     if (b == paramArrayOfmX.length)
/*    */       return; 
/*    */     throw paramxS.s70("Not enough sub images");
/*    */   }
/*    */   
/*    */   public final UR n6(xS paramxS) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: aload_0
/*    */     //   2: new f/UR
/*    */     //   5: dup
/*    */     //   6: astore_0
/*    */     //   7: invokespecial <init> : ()V
/*    */     //   10: getfield WK : Lf/q80;
/*    */     //   13: astore_2
/*    */     //   14: getstatic f/pRn.WHITE : Lf/pRn;
/*    */     //   17: astore_3
/*    */     //   18: ldc 'tint'
/*    */     //   20: invokevirtual S3 : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   23: dup
/*    */     //   24: astore #4
/*    */     //   26: ifnonnull -> 32
/*    */     //   29: goto -> 40
/*    */     //   32: aload_1
/*    */     //   33: aload #4
/*    */     //   35: aload_2
/*    */     //   36: invokestatic qs : (Lf/xS;Ljava/lang/String;Lf/q80;)Lf/pRn;
/*    */     //   39: astore_3
/*    */     //   40: aload_1
/*    */     //   41: aload_0
/*    */     //   42: aload_3
/*    */     //   43: putfield WE0 : Lf/pRn;
/*    */     //   46: ldc_w 'zoom'
/*    */     //   49: astore_2
/*    */     //   50: fconst_1
/*    */     //   51: fstore_3
/*    */     //   52: aload_2
/*    */     //   53: invokevirtual S3 : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   56: dup
/*    */     //   57: astore_2
/*    */     //   58: ifnonnull -> 64
/*    */     //   61: goto -> 69
/*    */     //   64: aload_2
/*    */     //   65: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   68: fstore_3
/*    */     //   69: aload_1
/*    */     //   70: ldc_w 'zoomX'
/*    */     //   73: invokevirtual S3 : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   76: dup
/*    */     //   77: astore_2
/*    */     //   78: ifnonnull -> 86
/*    */     //   81: fload_3
/*    */     //   82: fstore_2
/*    */     //   83: goto -> 91
/*    */     //   86: aload_2
/*    */     //   87: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   90: fstore_2
/*    */     //   91: aload_1
/*    */     //   92: aload_0
/*    */     //   93: fload_2
/*    */     //   94: putfield o5 : F
/*    */     //   97: ldc_w 'zoomY'
/*    */     //   100: invokevirtual S3 : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   103: dup
/*    */     //   104: astore_2
/*    */     //   105: ifnonnull -> 111
/*    */     //   108: goto -> 116
/*    */     //   111: aload_2
/*    */     //   112: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   115: fstore_3
/*    */     //   116: aload_1
/*    */     //   117: aload_0
/*    */     //   118: fload_3
/*    */     //   119: putfield Jq0 : F
/*    */     //   122: ldc_w 'zoomCenterX'
/*    */     //   125: astore_2
/*    */     //   126: ldc_w 0.5
/*    */     //   129: fstore_3
/*    */     //   130: aload_2
/*    */     //   131: invokevirtual S3 : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   134: dup
/*    */     //   135: astore_2
/*    */     //   136: ifnonnull -> 142
/*    */     //   139: goto -> 147
/*    */     //   142: aload_2
/*    */     //   143: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   146: fstore_3
/*    */     //   147: aload_1
/*    */     //   148: aload_0
/*    */     //   149: fload_3
/*    */     //   150: putfield km : F
/*    */     //   153: ldc_w 'zoomCenterY'
/*    */     //   156: astore_2
/*    */     //   157: ldc_w 0.5
/*    */     //   160: fstore_3
/*    */     //   161: aload_2
/*    */     //   162: invokevirtual S3 : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   165: dup
/*    */     //   166: astore_2
/*    */     //   167: ifnonnull -> 173
/*    */     //   170: goto -> 178
/*    */     //   173: aload_2
/*    */     //   174: invokestatic parseFloat : (Ljava/lang/String;)F
/*    */     //   177: fstore_3
/*    */     //   178: aload_0
/*    */     //   179: dup
/*    */     //   180: fload_3
/*    */     //   181: putfield Yj : F
/*    */     //   184: areturn
/*    */     //   185: astore_0
/*    */     //   186: new org/xmlpull/v1/XmlPullParserException
/*    */     //   189: dup
/*    */     //   190: aload_0
/*    */     //   191: swap
/*    */     //   192: aload_1
/*    */     //   193: getfield bb : Lorg/xmlpull/v1/XmlPullParser;
/*    */     //   196: ldc_w 'Unable to parse float'
/*    */     //   199: swap
/*    */     //   200: aload_0
/*    */     //   201: invokespecial <init> : (Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V
/*    */     //   204: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*    */     //   207: checkcast org/xmlpull/v1/XmlPullParserException
/*    */     //   210: athrow
/*    */     //   211: astore_0
/*    */     //   212: new org/xmlpull/v1/XmlPullParserException
/*    */     //   215: dup
/*    */     //   216: aload_0
/*    */     //   217: swap
/*    */     //   218: aload_1
/*    */     //   219: getfield bb : Lorg/xmlpull/v1/XmlPullParser;
/*    */     //   222: ldc_w 'Unable to parse float'
/*    */     //   225: swap
/*    */     //   226: aload_0
/*    */     //   227: invokespecial <init> : (Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V
/*    */     //   230: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*    */     //   233: checkcast org/xmlpull/v1/XmlPullParserException
/*    */     //   236: athrow
/*    */     //   237: astore_0
/*    */     //   238: new org/xmlpull/v1/XmlPullParserException
/*    */     //   241: dup
/*    */     //   242: aload_0
/*    */     //   243: swap
/*    */     //   244: aload_1
/*    */     //   245: getfield bb : Lorg/xmlpull/v1/XmlPullParser;
/*    */     //   248: ldc_w 'Unable to parse float'
/*    */     //   251: swap
/*    */     //   252: aload_0
/*    */     //   253: invokespecial <init> : (Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V
/*    */     //   256: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*    */     //   259: checkcast org/xmlpull/v1/XmlPullParserException
/*    */     //   262: athrow
/*    */     //   263: astore_0
/*    */     //   264: new org/xmlpull/v1/XmlPullParserException
/*    */     //   267: dup
/*    */     //   268: aload_0
/*    */     //   269: swap
/*    */     //   270: aload_1
/*    */     //   271: getfield bb : Lorg/xmlpull/v1/XmlPullParser;
/*    */     //   274: ldc_w 'Unable to parse float'
/*    */     //   277: swap
/*    */     //   278: aload_0
/*    */     //   279: invokespecial <init> : (Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V
/*    */     //   282: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*    */     //   285: checkcast org/xmlpull/v1/XmlPullParserException
/*    */     //   288: athrow
/*    */     //   289: astore_0
/*    */     //   290: new org/xmlpull/v1/XmlPullParserException
/*    */     //   293: dup
/*    */     //   294: aload_0
/*    */     //   295: swap
/*    */     //   296: aload_1
/*    */     //   297: getfield bb : Lorg/xmlpull/v1/XmlPullParser;
/*    */     //   300: ldc_w 'Unable to parse float'
/*    */     //   303: swap
/*    */     //   304: aload_0
/*    */     //   305: invokespecial <init> : (Ljava/lang/String;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/Throwable;)V
/*    */     //   308: invokevirtual initCause : (Ljava/lang/Throwable;)Ljava/lang/Throwable;
/*    */     //   311: checkcast org/xmlpull/v1/XmlPullParserException
/*    */     //   314: athrow
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 18
/*    */     //   #2	-> 43
/*    */     //   #3	-> 53
/*    */     //   #4	-> 65
/*    */     //   #5	-> 70
/*    */     //   #6	-> 73
/*    */     //   #7	-> 87
/*    */     //   #8	-> 94
/*    */     //   #9	-> 100
/*    */     //   #10	-> 112
/*    */     //   #11	-> 119
/*    */     //   #12	-> 131
/*    */     //   #13	-> 143
/*    */     //   #14	-> 150
/*    */     //   #15	-> 162
/*    */     //   #16	-> 174
/*    */     //   #17	-> 181
/*    */     //   #18	-> 186
/*    */     //   #19	-> 212
/*    */     //   #20	-> 238
/*    */     //   #21	-> 264
/*    */     //   #22	-> 290
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   64	68	289	java/lang/NumberFormatException
/*    */     //   86	90	263	java/lang/NumberFormatException
/*    */     //   111	115	237	java/lang/NumberFormatException
/*    */     //   142	146	211	java/lang/NumberFormatException
/*    */     //   173	177	185	java/lang/NumberFormatException
/*    */   }
/*    */   
/*    */   public final UU up(xS paramxS) {
/*    */     int i = 0;
/*    */     String str;
/*    */     if ((str = paramxS.S3("count")) == null || (i = Integer.parseInt(str)) > 0) {
/*    */       ArrayList<UU> arrayList;
/*    */       boolean bool1 = false, bool2 = false;
/*    */       this();
/*    */       paramxS.LX();
/*    */       while ((paramxS.bb.getEventType() == 2)) {
/*    */         boolean bool4;
/*    */         if (bool1 && !bool2) {
/*    */           bool1 = true;
/*    */           Logger logger = Logger.getLogger(bn0.class.getName());
/*    */           Level level = Level.WARNING;
/*    */           String str2 = paramxS.bb.getPositionDescription();
/*    */           if (paramxS.Rm0 != null)
/*    */             str2 = zw.vz(str2, " in ").append(paramxS.Rm0).toString(); 
/*    */           logger.log(level, "Animation frames after an endless repeat won''t be displayed: {0}", str2);
/*    */           boolean bool = bool1;
/*    */         } 
/*    */         String str1 = paramxS.bb.getName();
/*    */         if ("repeat".equals(str1)) {
/*    */           arrayList.add(up(paramxS));
/*    */         } else if ("frame".equals(str1)) {
/*    */           if ((bool4 = paramxS.ts(paramxS.Jg0("duration"))) >= 0) {
/*    */             pRN pRN;
/*    */             UR uR = n6(paramxS);
/*    */             mX mX = Mi0(paramxS, paramxS.Jg0("ref"));
/*    */             pRn pRn = uR.WE0;
/*    */             float f1 = uR.o5, f2 = uR.Jq0, f3 = uR.km, f4 = uR.Yj;
/*    */             this(bool4, mX, pRn, f1, f2, f3, f4);
/*    */             paramxS.LX();
/*    */             arrayList.add(pRN);
/*    */           } else {
/*    */             throw new IllegalArgumentException("duration must be >= 0 ms");
/*    */           } 
/*    */         } else if ("frames".equals(str1)) {
/*    */           la la;
/*    */           this();
/*    */           ur(paramxS, la);
/*    */           ep0(paramxS, la);
/*    */           int j;
/*    */           if ((j = paramxS.ts(paramxS.Jg0("duration"))) >= 1) {
/*    */             int k;
/*    */             if ((k = paramxS.ts(paramxS.Jg0("count"))) >= 1) {
/*    */               UR uR = n6(paramxS);
/*    */               int m = paramxS.pI(0, "offsetx"), n = paramxS.pI(0, "offsety");
/*    */               if (k <= 1 || m != 0 || n != 0) {
/*    */                 for (byte b = 0; b < k; ) {
/*    */                   int i1 = la.ba0, i2 = la.Tt, i3 = la.QC0, i4 = la.aw0;
/*    */                   pRn pRn2 = pRn.WHITE;
/*    */                   int i5 = la.lPT6;
/*    */                   mX mX = fE(paramxS, i1, i2, i3, i4, pRn2, false, i5);
/*    */                   pRn pRn1 = uR.WE0;
/*    */                   float f1 = uR.o5, f2 = uR.Jq0, f3 = uR.km, f4 = uR.Yj;
/*    */                   arrayList.add(new pRN(j, mX, pRn1, f1, f2, f3, f4));
/*    */                   la.ba0 += m;
/*    */                   la.Tt += n;
/*    */                   b++;
/*    */                 } 
/*    */                 paramxS.LX();
/*    */               } else {
/*    */                 throw new IllegalArgumentException("offsets required for multiple frames");
/*    */               } 
/*    */             } else {
/*    */               throw new IllegalArgumentException("count must be >= 1");
/*    */             } 
/*    */           } else {
/*    */             throw new IllegalArgumentException("duration must be >= 1 ms");
/*    */           } 
/*    */         } else {
/*    */           throw paramxS.Zl0();
/*    */         } 
/*    */         XD xD;
/*    */         if (xD = arrayList.get(arrayList.size() - 1) instanceof UU && ((UU)xD).j1 == 0) {
/*    */           bool4 = true;
/*    */         } else {
/*    */           bool4 = false;
/*    */         } 
/*    */         paramxS.bb.require(3, null, str1);
/*    */         paramxS.LX();
/*    */         boolean bool3 = bool4;
/*    */       } 
/*    */       return new UU(arrayList.<XD>toArray(new XD[0]), i);
/*    */     } 
/*    */     throw new IllegalArgumentException("Invalid repeat count");
/*    */   }
/*    */   
/*    */   public final void ur(xS paramxS, la paramla) {
/*    */     if (this.J != null) {
/*    */       String str = paramxS.Jg0("xywh");
/*    */       if ("*".equals(str)) {
/*    */         paramla.ba0 = 0;
/*    */         paramla.Tt = 0;
/*    */         nK nK1;
/*    */         paramla.QC0 = (nK1 = this.J).Jd0;
/*    */         paramla.aw0 = this.SI0;
/*    */       } else {
/*    */         try {
/*    */           int[] arrayOfInt;
/*    */           if ((arrayOfInt = gd0.dB0(str)).length == 4) {
/*    */             paramla.ba0 = this[0];
/*    */             paramla.Tt = this[1];
/*    */             paramla.QC0 = this[2];
/*    */             paramla.aw0 = this[3];
/*    */             return;
/*    */           } 
/*    */           throw paramxS.s70("xywh requires 4 integer arguments");
/*    */         } catch (IllegalArgumentException illegalArgumentException) {
/*    */           throw paramxS.q70("can't parse xywh argument", this);
/*    */         } 
/*    */       } 
/*    */       return;
/*    */     } 
/*    */     throw paramxS.s70("can't create area outside of <imagefile> object");
/*    */   }
/*    */   
/*    */   public final void ep0(xS paramxS, la paramla) {
/*    */     if (this.J != null) {
/*    */       int i;
/*    */       if ((i = paramxS.pI(0, "rot")) != 0) {
/*    */         if (i != 90) {
/*    */           if (i != 180) {
/*    */             if (i == 270) {
/*    */               paramla.lPT6 = 4;
/*    */             } else {
/*    */               throw paramxS.s70("invalid rotation angle");
/*    */             } 
/*    */           } else {
/*    */             paramla.lPT6 = 3;
/*    */           } 
/*    */         } else {
/*    */           paramla.lPT6 = 2;
/*    */         } 
/*    */       } else {
/*    */         paramla.lPT6 = 1;
/*    */       } 
/*    */       return;
/*    */     } 
/*    */     throw paramxS.s70("can't create area outside of <imagefile> object");
/*    */   }
/*    */   
/*    */   public final mX Mi0(xS paramxS, String paramString) {
/*    */     if (!paramString.endsWith(".*")) {
/*    */       mX mX;
/*    */       if ((mX = (mX)this.Bd0.get(paramString)) != null)
/*    */         return this; 
/*    */       throw paramxS.s70("referenced image \"" + paramString + "\" not found");
/*    */     } 
/*    */     throw paramxS.s70("wildcard mapping not allowed");
/*    */   }
/*    */   
/*    */   public final mX fE(xS paramxS, int paramInt1, int paramInt2, int paramInt3, int paramInt4, pRn parampRn, boolean paramBoolean, int paramInt5) {
/*    */     // Byte code:
/*    */     //   0: iload #4
/*    */     //   2: ifeq -> 413
/*    */     //   5: iload #5
/*    */     //   7: ifne -> 13
/*    */     //   10: goto -> 413
/*    */     //   13: iload_2
/*    */     //   14: iload #5
/*    */     //   16: iload #4
/*    */     //   18: aload_0
/*    */     //   19: getfield J : Lf/nK;
/*    */     //   22: dup
/*    */     //   23: dup
/*    */     //   24: astore_0
/*    */     //   25: getfield Jd0 : I
/*    */     //   28: istore #9
/*    */     //   30: getfield SI0 : I
/*    */     //   33: istore #10
/*    */     //   35: invokestatic abs : (I)I
/*    */     //   38: iload_2
/*    */     //   39: iadd
/*    */     //   40: istore #11
/*    */     //   42: invokestatic abs : (I)I
/*    */     //   45: iload_3
/*    */     //   46: iadd
/*    */     //   47: istore #12
/*    */     //   49: iflt -> 92
/*    */     //   52: iload_2
/*    */     //   53: iload #9
/*    */     //   55: if_icmpge -> 92
/*    */     //   58: iload #11
/*    */     //   60: iflt -> 92
/*    */     //   63: iload #11
/*    */     //   65: iload #9
/*    */     //   67: if_icmpgt -> 92
/*    */     //   70: iload_3
/*    */     //   71: iflt -> 92
/*    */     //   74: iload_3
/*    */     //   75: iload #10
/*    */     //   77: if_icmpge -> 92
/*    */     //   80: iload #12
/*    */     //   82: iflt -> 92
/*    */     //   85: iload #12
/*    */     //   87: iload #10
/*    */     //   89: if_icmple -> 229
/*    */     //   92: aload_1
/*    */     //   93: dup
/*    */     //   94: ldc f/bn0
/*    */     //   96: invokevirtual getName : ()Ljava/lang/String;
/*    */     //   99: invokestatic getLogger : (Ljava/lang/String;)Ljava/util/logging/Logger;
/*    */     //   102: astore #13
/*    */     //   104: getstatic java/util/logging/Level.WARNING : Ljava/util/logging/Level;
/*    */     //   107: astore #14
/*    */     //   109: getfield bb : Lorg/xmlpull/v1/XmlPullParser;
/*    */     //   112: invokeinterface getPositionDescription : ()Ljava/lang/String;
/*    */     //   117: astore #15
/*    */     //   119: getfield Rm0 : Ljava/lang/String;
/*    */     //   122: ifnull -> 145
/*    */     //   125: aload #15
/*    */     //   127: ldc_w ' in '
/*    */     //   130: invokestatic vz : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   133: aload_1
/*    */     //   134: getfield Rm0 : Ljava/lang/String;
/*    */     //   137: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   140: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   143: astore #15
/*    */     //   145: iload #12
/*    */     //   147: iload #10
/*    */     //   149: iload #5
/*    */     //   151: iload #11
/*    */     //   153: iload #9
/*    */     //   155: iload #4
/*    */     //   157: iload_3
/*    */     //   158: iload #10
/*    */     //   160: iload_2
/*    */     //   161: iload #9
/*    */     //   163: aload #13
/*    */     //   165: aload #14
/*    */     //   167: ldc_w 'texture partly outside of file: {0}'
/*    */     //   170: aload #15
/*    */     //   172: invokevirtual log : (Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Object;)V
/*    */     //   175: invokestatic min : (II)I
/*    */     //   178: iconst_0
/*    */     //   179: swap
/*    */     //   180: invokestatic max : (II)I
/*    */     //   183: istore_2
/*    */     //   184: invokestatic min : (II)I
/*    */     //   187: iconst_0
/*    */     //   188: swap
/*    */     //   189: invokestatic max : (II)I
/*    */     //   192: istore_3
/*    */     //   193: invokestatic signum : (I)I
/*    */     //   196: istore_1
/*    */     //   197: invokestatic min : (II)I
/*    */     //   200: iconst_0
/*    */     //   201: swap
/*    */     //   202: invokestatic max : (II)I
/*    */     //   205: iload_2
/*    */     //   206: isub
/*    */     //   207: iload_1
/*    */     //   208: imul
/*    */     //   209: istore #4
/*    */     //   211: invokestatic signum : (I)I
/*    */     //   214: istore_1
/*    */     //   215: invokestatic min : (II)I
/*    */     //   218: iconst_0
/*    */     //   219: swap
/*    */     //   220: invokestatic max : (II)I
/*    */     //   223: iload_3
/*    */     //   224: isub
/*    */     //   225: iload_1
/*    */     //   226: imul
/*    */     //   227: istore #5
/*    */     //   229: iload_2
/*    */     //   230: iflt -> 402
/*    */     //   233: iload_2
/*    */     //   234: aload_0
/*    */     //   235: getfield Jd0 : I
/*    */     //   238: if_icmpge -> 402
/*    */     //   241: iload_3
/*    */     //   242: iflt -> 391
/*    */     //   245: iload_3
/*    */     //   246: aload_0
/*    */     //   247: getfield SI0 : I
/*    */     //   250: if_icmpge -> 391
/*    */     //   253: iload #4
/*    */     //   255: invokestatic abs : (I)I
/*    */     //   258: iload_2
/*    */     //   259: iadd
/*    */     //   260: aload_0
/*    */     //   261: getfield Jd0 : I
/*    */     //   264: if_icmpgt -> 380
/*    */     //   267: iload #5
/*    */     //   269: invokestatic abs : (I)I
/*    */     //   272: iload_3
/*    */     //   273: iadd
/*    */     //   274: aload_0
/*    */     //   275: getfield SI0 : I
/*    */     //   278: if_icmpgt -> 369
/*    */     //   281: iload #8
/*    */     //   283: iconst_1
/*    */     //   284: if_icmpne -> 350
/*    */     //   287: iload #7
/*    */     //   289: ifeq -> 305
/*    */     //   292: iload #4
/*    */     //   294: iflt -> 350
/*    */     //   297: iload #5
/*    */     //   299: ifge -> 305
/*    */     //   302: goto -> 350
/*    */     //   305: iload #7
/*    */     //   307: ifeq -> 330
/*    */     //   310: new f/ax0
/*    */     //   313: dup
/*    */     //   314: astore_1
/*    */     //   315: aload_0
/*    */     //   316: iload_2
/*    */     //   317: iload_3
/*    */     //   318: iload #4
/*    */     //   320: iload #5
/*    */     //   322: aload #6
/*    */     //   324: invokespecial <init> : (Lf/nK;IIIILf/pRn;)V
/*    */     //   327: goto -> 367
/*    */     //   330: new f/n90
/*    */     //   333: dup
/*    */     //   334: astore_1
/*    */     //   335: aload_0
/*    */     //   336: iload_2
/*    */     //   337: iload_3
/*    */     //   338: iload #4
/*    */     //   340: iload #5
/*    */     //   342: aload #6
/*    */     //   344: invokespecial <init> : (Lf/nK;IIIILf/pRn;)V
/*    */     //   347: goto -> 367
/*    */     //   350: new f/hs
/*    */     //   353: dup
/*    */     //   354: astore_1
/*    */     //   355: aload_0
/*    */     //   356: iload #4
/*    */     //   358: iload #5
/*    */     //   360: aload #6
/*    */     //   362: iload #7
/*    */     //   364: invokespecial <init> : (Lf/nK;IILf/pRn;Z)V
/*    */     //   367: aload_1
/*    */     //   368: areturn
/*    */     //   369: new java/lang/IllegalArgumentException
/*    */     //   372: dup
/*    */     //   373: ldc_w 'height'
/*    */     //   376: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   379: athrow
/*    */     //   380: new java/lang/IllegalArgumentException
/*    */     //   383: dup
/*    */     //   384: ldc_w 'width'
/*    */     //   387: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   390: athrow
/*    */     //   391: new java/lang/IllegalArgumentException
/*    */     //   394: dup
/*    */     //   395: ldc_w 'y'
/*    */     //   398: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   401: athrow
/*    */     //   402: new java/lang/IllegalArgumentException
/*    */     //   405: dup
/*    */     //   406: ldc_w 'x'
/*    */     //   409: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   412: athrow
/*    */     //   413: new f/com6
/*    */     //   416: dup
/*    */     //   417: iload #5
/*    */     //   419: iload #4
/*    */     //   421: invokestatic abs : (I)I
/*    */     //   424: istore_0
/*    */     //   425: invokestatic abs : (I)I
/*    */     //   428: iload_0
/*    */     //   429: swap
/*    */     //   430: invokespecial <init> : (II)V
/*    */     //   433: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 25
/*    */     //   #2	-> 30
/*    */     //   #3	-> 35
/*    */     //   #4	-> 94
/*    */     //   #5	-> 104
/*    */     //   #6	-> 109
/*    */     //   #7	-> 127
/*    */     //   #8	-> 134
/*    */     //   #9	-> 167
/*    */     //   #10	-> 235
/*    */     //   #11	-> 247
/*    */     //   #12	-> 255
/*    */     //   #13	-> 261
/*    */     //   #14	-> 269
/*    */     //   #15	-> 275
/*    */     //   #16	-> 310
/*    */     //   #17	-> 413
/*    */   }
/*    */   
/*    */   public bn0(q80 paramq80, VI paramVI) {
/*    */     TreeMap<Object, Object> treeMap1;
/*    */     this.WK = paramq80;
/*    */     this.tJ0 = paramVI;
/*    */     this();
/*    */     this.Bd0 = treeMap1;
/*    */     this();
/*    */     this.js0 = treeMap2;
/*    */     treeMap1.put("none", qs);
/*    */     TreeMap<Object, Object> treeMap2;
/*    */     (treeMap2 = new TreeMap<>()).put("os-default", mq0);
/*    */   }
/*    */   
/*    */   public static int[] rq0(xS paramxS, String paramString, int paramInt) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: invokevirtual S3 : (Ljava/lang/String;)Ljava/lang/String;
/*    */     //   5: dup
/*    */     //   6: astore_3
/*    */     //   7: ifnull -> 314
/*    */     //   10: aload_3
/*    */     //   11: bipush #44
/*    */     //   13: invokevirtual indexOf : (I)I
/*    */     //   16: dup
/*    */     //   17: istore #4
/*    */     //   19: iflt -> 288
/*    */     //   22: iconst_4
/*    */     //   23: newarray int
/*    */     //   25: astore #5
/*    */     //   27: iconst_0
/*    */     //   28: istore #6
/*    */     //   30: iconst_0
/*    */     //   31: istore #7
/*    */     //   33: iload #6
/*    */     //   35: iconst_2
/*    */     //   36: if_icmpge -> 210
/*    */     //   39: aload_3
/*    */     //   40: iload #7
/*    */     //   42: iload #4
/*    */     //   44: invokestatic PJ0 : (Ljava/lang/CharSequence;II)Ljava/lang/String;
/*    */     //   47: dup
/*    */     //   48: astore #7
/*    */     //   50: invokevirtual length : ()I
/*    */     //   53: ifeq -> 199
/*    */     //   56: aload #7
/*    */     //   58: iconst_0
/*    */     //   59: istore #8
/*    */     //   61: iconst_1
/*    */     //   62: istore #9
/*    */     //   64: iconst_0
/*    */     //   65: invokevirtual charAt : (I)C
/*    */     //   68: dup
/*    */     //   69: istore #10
/*    */     //   71: bipush #66
/*    */     //   73: if_icmpeq -> 128
/*    */     //   76: iload #10
/*    */     //   78: bipush #76
/*    */     //   80: if_icmpeq -> 134
/*    */     //   83: iload #10
/*    */     //   85: bipush #82
/*    */     //   87: if_icmpeq -> 128
/*    */     //   90: iload #10
/*    */     //   92: bipush #84
/*    */     //   94: if_icmpeq -> 134
/*    */     //   97: iload #10
/*    */     //   99: bipush #98
/*    */     //   101: if_icmpeq -> 128
/*    */     //   104: iload #10
/*    */     //   106: bipush #108
/*    */     //   108: if_icmpeq -> 134
/*    */     //   111: iload #10
/*    */     //   113: bipush #114
/*    */     //   115: if_icmpeq -> 128
/*    */     //   118: iload #10
/*    */     //   120: bipush #116
/*    */     //   122: if_icmpeq -> 134
/*    */     //   125: goto -> 151
/*    */     //   128: iconst_m1
/*    */     //   129: istore #9
/*    */     //   131: iload_2
/*    */     //   132: istore #8
/*    */     //   134: aload #7
/*    */     //   136: dup
/*    */     //   137: iconst_1
/*    */     //   138: istore #7
/*    */     //   140: invokevirtual length : ()I
/*    */     //   143: iload #7
/*    */     //   145: swap
/*    */     //   146: invokestatic PJ0 : (Ljava/lang/CharSequence;II)Ljava/lang/String;
/*    */     //   149: astore #7
/*    */     //   151: aload_3
/*    */     //   152: aload #5
/*    */     //   154: aload #7
/*    */     //   156: invokestatic parseInt : (Ljava/lang/String;)I
/*    */     //   159: istore #7
/*    */     //   161: iload #6
/*    */     //   163: iconst_1
/*    */     //   164: iadd
/*    */     //   165: dup
/*    */     //   166: istore #6
/*    */     //   168: iconst_0
/*    */     //   169: iload_2
/*    */     //   170: iload #9
/*    */     //   172: iload #7
/*    */     //   174: imul
/*    */     //   175: iload #8
/*    */     //   177: iadd
/*    */     //   178: invokestatic min : (II)I
/*    */     //   181: invokestatic max : (II)I
/*    */     //   184: iastore
/*    */     //   185: iload #4
/*    */     //   187: iconst_1
/*    */     //   188: iadd
/*    */     //   189: istore #7
/*    */     //   191: invokevirtual length : ()I
/*    */     //   194: istore #4
/*    */     //   196: goto -> 33
/*    */     //   199: new java/lang/NumberFormatException
/*    */     //   202: dup
/*    */     //   203: ldc_w 'empty string'
/*    */     //   206: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   209: athrow
/*    */     //   210: aload #5
/*    */     //   212: iconst_1
/*    */     //   213: iaload
/*    */     //   214: dup
/*    */     //   215: istore #4
/*    */     //   217: aload #5
/*    */     //   219: iconst_2
/*    */     //   220: iaload
/*    */     //   221: dup
/*    */     //   222: istore #6
/*    */     //   224: if_icmple -> 238
/*    */     //   227: aload #5
/*    */     //   229: dup
/*    */     //   230: iconst_1
/*    */     //   231: iload #6
/*    */     //   233: iastore
/*    */     //   234: iconst_2
/*    */     //   235: iload #4
/*    */     //   237: iastore
/*    */     //   238: aload #5
/*    */     //   240: dup
/*    */     //   241: iconst_3
/*    */     //   242: iload_2
/*    */     //   243: iastore
/*    */     //   244: areturn
/*    */     //   245: astore_2
/*    */     //   246: aload_0
/*    */     //   247: new java/lang/StringBuilder
/*    */     //   250: dup
/*    */     //   251: invokespecial <init> : ()V
/*    */     //   254: ldc_w 'Unable to parse '
/*    */     //   257: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   260: aload_1
/*    */     //   261: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   264: ldc_w ': "'
/*    */     //   267: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   270: aload_3
/*    */     //   271: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   274: ldc_w '"'
/*    */     //   277: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   280: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   283: aload_2
/*    */     //   284: invokevirtual q70 : (Ljava/lang/String;Ljava/lang/Throwable;)Lorg/xmlpull/v1/XmlPullParserException;
/*    */     //   287: athrow
/*    */     //   288: aload_0
/*    */     //   289: new java/lang/StringBuilder
/*    */     //   292: dup
/*    */     //   293: aload_1
/*    */     //   294: swap
/*    */     //   295: invokespecial <init> : ()V
/*    */     //   298: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   301: ldc_w ' requires 2 values'
/*    */     //   304: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   307: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   310: invokevirtual s70 : (Ljava/lang/String;)Lorg/xmlpull/v1/XmlPullParserException;
/*    */     //   313: athrow
/*    */     //   314: aconst_null
/*    */     //   315: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 140
/*    */     //   #2	-> 156
/*    */     // Exception table:
/*    */     //   from	to	target	type
/*    */     //   22	25	245	java/lang/NumberFormatException
/*    */     //   39	47	245	java/lang/NumberFormatException
/*    */     //   50	53	245	java/lang/NumberFormatException
/*    */     //   64	68	245	java/lang/NumberFormatException
/*    */     //   140	149	245	java/lang/NumberFormatException
/*    */     //   151	159	245	java/lang/NumberFormatException
/*    */     //   178	185	245	java/lang/NumberFormatException
/*    */     //   191	194	245	java/lang/NumberFormatException
/*    */     //   199	214	245	java/lang/NumberFormatException
/*    */     //   217	221	245	java/lang/NumberFormatException
/*    */     //   231	244	245	java/lang/NumberFormatException
/*    */   }
/*    */   
/*    */   public static uE0 HQ(XD paramXD) {
/*    */     XD[] arrayOfXD;
/*    */     if (paramXD instanceof UU) {
/*    */       int i = (arrayOfXD = ((UU)paramXD).wr0).length;
/*    */       for (byte b = 0; b < i; b++) {
/*    */         uE0 uE0;
/*    */         if ((uE0 = HQ(arrayOfXD[b])) != null)
/*    */           return uE0; 
/*    */       } 
/*    */     } else {
/*    */       mX mX;
/*    */       if (arrayOfXD instanceof pRN && mX = ((pRN)arrayOfXD).L7 instanceof VK0)
/*    */         return ((VK0)mX).mJ0(); 
/*    */     } 
/*    */     return null;
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/bn0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */