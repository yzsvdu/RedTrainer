/* 1 */ package f;public final class r4 extends X00 { public final void OD() { ES eS; if ((eS = this.A5) == null) return;  float f1 = ((uB)eS).uz;
/*   */     
/* 3 */     float f2 = ((uB)eS).B90;
/* 4 */     float f3 = this.ZP;
/* 5 */     float f4 = this.xr0;
/* 6 */     this.He0 = f1 = (this.pT.lPt6(f1, f2, f3, f4)).x; this.cJ = f2 = (this.pT.lPt6(f1, f2, f3, f4)).y; int i; if (((i = this.W0) & 0x8) != 0) { this.ak = 0.0F; } else if ((i & 0x10) != 0) { this.ak = (int)(f3 - f1); } else { this.ak = (int)(f3 / 2.0F - f1 / 2.0F); }  if ((i & 0x2) != 0) { this.t8 = (int)(f4 - f2); } else if ((i & 0x4) != 0) { this.t8 = 0.0F; } else { this.t8 = (int)(f4 / 2.0F - f2 / 2.0F); }
/*   */      }
/*   */ 
/*   */   
/*   */   public QJ0 pT;
/*   */   public int W0 = 1;
/*   */   public float ak;
/*   */   public float t8;
/*   */   public float He0;
/*   */   public float cJ;
/*   */   public ES A5;
/*   */   
/*   */   public r4() {
/*   */     this((ES)null);
/*   */   }
/*   */   
/*   */   public r4(Cz0 paramCz0) {
/*   */     this(paramCz0);
/*   */     r80 r80;
/*   */     this(this, QJ0.Ww, 1);
/*   */   }
/*   */   
/*   */   public r4(pe0 parampe0) {
/*   */     this(parampe0);
/*   */     c3 c3;
/*   */     this(this, QJ0.Ww, 1);
/*   */   }
/*   */   
/*   */   public r4(Texture paramTexture) {
/*   */     this(paramTexture);
/*   */     c3 c3;
/*   */     pe0 pe0;
/*   */     this(pe0);
/*   */     this(this);
/*   */   }
/*   */   
/*   */   public r4(Mw paramMw, String paramString) {
/*   */     this(paramMw.zD(paramString), QJ0.Ww, 1);
/*   */   }
/*   */   
/*   */   public r4(ES paramES) {
/*   */     this(paramES, QJ0.Ww, 1);
/*   */   }
/*   */   
/*   */   public r4(ES paramES, QJ0 paramQJ0) {
/*   */     this(paramES, paramQJ0, 1);
/*   */   }
/*   */   
/*   */   public r4(ES paramES, QJ0 paramQJ0, int paramInt) {
/*   */     eu0(paramES);
/*   */     this.pT = paramQJ0;
/*   */     this.W0 = paramInt;
/*   */     float f = DB0();
/*   */     qp0(f, d6());
/*   */   }
/*   */   
/*   */   public final void cD(JX paramJX, float paramFloat) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: dup
/*   */     //   3: dup2
/*   */     //   4: aload_1
/*   */     //   5: aload_0
/*   */     //   6: dup
/*   */     //   7: invokevirtual kn0 : ()V
/*   */     //   10: getfield As0 : Lcom/badlogic/gdx/graphics/Color;
/*   */     //   13: dup
/*   */     //   14: dup2
/*   */     //   15: astore_3
/*   */     //   16: getfield r : F
/*   */     //   19: fstore #4
/*   */     //   21: getfield g : F
/*   */     //   24: fstore #5
/*   */     //   26: getfield b : F
/*   */     //   29: fstore #6
/*   */     //   31: fload #4
/*   */     //   33: aload_3
/*   */     //   34: getfield a : F
/*   */     //   37: fload_2
/*   */     //   38: fmul
/*   */     //   39: fstore_2
/*   */     //   40: fload #5
/*   */     //   42: fload #6
/*   */     //   44: fload_2
/*   */     //   45: invokevirtual implements : (FFFF)V
/*   */     //   48: getfield bs : F
/*   */     //   51: fstore_2
/*   */     //   52: getfield kl : F
/*   */     //   55: fstore_3
/*   */     //   56: getfield kq : F
/*   */     //   59: fstore #4
/*   */     //   61: getfield DG : F
/*   */     //   64: fstore #5
/*   */     //   66: getfield A5 : Lf/ES;
/*   */     //   69: dup
/*   */     //   70: astore #6
/*   */     //   72: instanceof f/Nv0
/*   */     //   75: ifeq -> 169
/*   */     //   78: fload #4
/*   */     //   80: aload_0
/*   */     //   81: getfield Bz : F
/*   */     //   84: fstore #7
/*   */     //   86: fconst_1
/*   */     //   87: fcmpl
/*   */     //   88: ifne -> 105
/*   */     //   91: fload #5
/*   */     //   93: fconst_1
/*   */     //   94: fcmpl
/*   */     //   95: ifne -> 105
/*   */     //   98: fload #7
/*   */     //   100: fconst_0
/*   */     //   101: fcmpl
/*   */     //   102: ifeq -> 169
/*   */     //   105: aload #6
/*   */     //   107: checkcast f/Nv0
/*   */     //   110: aload_1
/*   */     //   111: aload_0
/*   */     //   112: dup
/*   */     //   113: fload_3
/*   */     //   114: aload_0
/*   */     //   115: fload_2
/*   */     //   116: aload_0
/*   */     //   117: getfield ak : F
/*   */     //   120: dup
/*   */     //   121: fstore_0
/*   */     //   122: fadd
/*   */     //   123: fstore_1
/*   */     //   124: getfield t8 : F
/*   */     //   127: dup
/*   */     //   128: fstore_2
/*   */     //   129: fadd
/*   */     //   130: fstore_3
/*   */     //   131: fconst_0
/*   */     //   132: fload_0
/*   */     //   133: fsub
/*   */     //   134: fstore_0
/*   */     //   135: fconst_0
/*   */     //   136: fload_2
/*   */     //   137: fsub
/*   */     //   138: fstore_2
/*   */     //   139: getfield He0 : F
/*   */     //   142: fstore #6
/*   */     //   144: getfield cJ : F
/*   */     //   147: fstore #8
/*   */     //   149: fload_1
/*   */     //   150: fload_3
/*   */     //   151: fload_0
/*   */     //   152: fload_2
/*   */     //   153: fload #6
/*   */     //   155: fload #8
/*   */     //   157: fload #4
/*   */     //   159: fload #5
/*   */     //   161: fload #7
/*   */     //   163: invokeinterface MF : (Lf/JX;FFFFFFFFF)V
/*   */     //   168: return
/*   */     //   169: aload #6
/*   */     //   171: ifnull -> 216
/*   */     //   174: aload #6
/*   */     //   176: aload_1
/*   */     //   177: aload_0
/*   */     //   178: dup
/*   */     //   179: fload_3
/*   */     //   180: aload_0
/*   */     //   181: fload_2
/*   */     //   182: aload_0
/*   */     //   183: getfield ak : F
/*   */     //   186: fadd
/*   */     //   187: fstore_0
/*   */     //   188: getfield t8 : F
/*   */     //   191: fadd
/*   */     //   192: fstore_1
/*   */     //   193: getfield He0 : F
/*   */     //   196: fload #4
/*   */     //   198: fmul
/*   */     //   199: fstore_2
/*   */     //   200: getfield cJ : F
/*   */     //   203: fload #5
/*   */     //   205: fmul
/*   */     //   206: fstore_3
/*   */     //   207: fload_0
/*   */     //   208: fload_1
/*   */     //   209: fload_2
/*   */     //   210: fload_3
/*   */     //   211: invokeinterface JD : (Lf/JX;FFFF)V
/*   */     //   216: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 10
/*   */     //   #2	-> 16
/*   */     //   #3	-> 48
/*   */     //   #4	-> 52
/*   */     //   #5	-> 56
/*   */     //   #6	-> 61
/*   */     //   #7	-> 66
/*   */     //   #8	-> 81
/*   */     //   #9	-> 107
/*   */   }
/*   */   
/*   */   public final void eu0(ES paramES) {
/*   */     if (this.A5 == paramES)
/*   */       return; 
/*   */     uB uB;
/*   */     if (paramES == null || DB0() != (uB = (uB)paramES).uz || d6() != uB.B90)
/*   */       dD0(); 
/*   */     this.A5 = paramES;
/*   */   }
/*   */   
/*   */   public final float OI() {
/*   */     return 0.0F;
/*   */   }
/*   */   
/*   */   public final float Mb() {
/*   */     return 0.0F;
/*   */   }
/*   */   
/*   */   public final float DB0() {
/*   */     ES eS;
/*   */     return ((eS = this.A5) != null) ? ((uB)this).uz : 0.0F;
/*   */   }
/*   */   
/*   */   public final float d6() {
/*   */     ES eS;
/*   */     return ((eS = this.A5) != null) ? ((uB)this).B90 : 0.0F;
/*   */   }
/*   */   
/*   */   public final String toString() {
/*   */     String str1;
/*   */     int i;
/*   */     if ((i = (str1 = r4.class.getName()).lastIndexOf('.')) != -1)
/*   */       str1 = str1.substring(i + 1); 
/*   */     this();
/*   */     StringBuilder stringBuilder;
/*   */     String str2;
/*   */     if (str1.indexOf('$') != -1) {
/*   */       str2 = "Image ";
/*   */     } else {
/*   */       str2 = "";
/*   */     } 
/*   */     return stringBuilder.append(str2).append(str1).append(": ").append(this.A5).toString();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/r4.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */