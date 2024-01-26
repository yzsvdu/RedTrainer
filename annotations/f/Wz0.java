/* 1 */ package f;public final class Wz0 extends sh { public static int o30; public static int kW; public static final m30 xX; public static final HashMap Dd; public Object k00; public Class uR; public con ed; public int OD0; public i0 st; public int Zt; public final float[] NW; public final float[] Ys0; public float[] Vd; public float[] gc; public final void TL0() { super.TL0(); this.k00 = null; this.uR = null; this.ed = null; this.OD0 = -1; this.st = null; this.Zt = 0; int i; if (this.Vd.length != (i = o30)) this.Vd = new float[i];  if (this.gc.length != (i = (kW + 2) * i)) this.gc = new float[i];  } public final Wz0 a(float paramFloat) { this.Ys0[0] = paramFloat; return this; } public final void sn0(Object<?> paramObject, int paramInt, float paramFloat) { if (paramFloat >= 0.0F) { this.k00 = paramObject; if (paramObject != null) { if (Dd.containsKey(paramObject.getClass())) { paramObject = (Object<?>)this.k00.getClass(); } else if (paramObject = (Object<?>)this.k00 instanceof con) { paramObject = (Object<?>)paramObject.getClass(); } else { for (paramObject = (Object<?>)paramObject.getClass().getSuperclass(); paramObject != null && !Dd.containsKey(paramObject); paramObject = (Object<?>)paramObject.getSuperclass()); }  } else { paramObject = null; }  this
/* 2 */         .uR = (Class)paramObject; this.OD0 = paramInt; this.aq0 = paramFloat; return; }  throw new RuntimeException("Duration can't be negative"); }
/* 3 */   public final Wz0 n20(float paramFloat1, float paramFloat2) { this.Ys0[0] = paramFloat1; this.Ys0[1] = paramFloat2; return this; } public final Wz0 qw0(float paramFloat1, float paramFloat2, float paramFloat3) { this.Ys0[0] = paramFloat1; this.Ys0[1] = paramFloat2; this.Ys0[2] = paramFloat3; return this; } public final Wz0 qY(float... paramVarArgs) { if (paramVarArgs.length <= o30) { float[] arrayOfFloat = this.Ys0; int i = paramVarArgs.length; System.arraycopy(paramVarArgs, 0, this, 0, i); return this; }  String str = N.Gl0(B40.df("You cannot combine more than "), o30, " attributes in a tween. You can raise this limit with Tween.setCombinedAttributesLimit(), which should be called once in application initialization code.");
/* 4 */     throw new RuntimeException(this); } public final void Cy0() { m30 m301; if (!(m301 = xX).QT.contains(this)) { Rz0 rz0; if ((rz0 = m301.Hi0) != null) rz0.xn(this);  m301.QT.add(this); }  } public final void S7() { Object object; if ((object = this.k00) == null) return;  int i = this.OD0; this.ed.Uu0(object, i, this.NW); for (i = 0; i < this.Zt; i++) this.Ys0[i] = this.Ys0[i] + 0.0F;  } public final Object VS() { String str; if (this.k00 != null) { Object object; if ((this.ed = (con)Dd.get(this.uR)) == null && object = this.k00 instanceof con) this.ed = (con)object;  if ((object = this.ed) != null) { object = this.k00; int i = this.OD0; float[] arrayOfFloat = this.Vd; if ((this.Zt = object.Uu0(object, i, arrayOfFloat)) > o30) { str = N.Gl0(B40.df("You cannot combine more than "), o30, " attributes in a tween. You can raise this limit with Tween.setCombinedAttributesLimit(), which should be called once in application initialization code.");
/* 5 */           throw new RuntimeException(this); }  return this; }
/* 6 */        throw new RuntimeException("No TweenAccessor was found for the target"); }
/*   */     
/*   */     return this; }
/*   */ 
/*   */   
/*   */   public final void Dy() {
/*   */     Object object;
/*   */     if ((object = this.k00) == null)
/*   */       return; 
/*   */     int i = this.OD0;
/*   */     this.ed.ng(object, i, this.NW);
/*   */   }
/*   */   
/*   */   public final void else() {
/*   */     Object object;
/*   */     if ((object = this.k00) == null)
/*   */       return; 
/*   */     int i = this.OD0;
/*   */     this.ed.ng(object, i, this.Ys0);
/*   */   }
/*   */   
/*   */   public final void sa(boolean paramBoolean, int paramInt1, int paramInt2, float paramFloat) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield k00 : Ljava/lang/Object;
/*   */     //   4: dup
/*   */     //   5: astore #5
/*   */     //   7: ifnull -> 327
/*   */     //   10: aload_0
/*   */     //   11: getfield st : Lf/i0;
/*   */     //   14: ifnonnull -> 20
/*   */     //   17: goto -> 327
/*   */     //   20: iload_1
/*   */     //   21: ifne -> 52
/*   */     //   24: iload_2
/*   */     //   25: iload_3
/*   */     //   26: if_icmple -> 52
/*   */     //   29: aload_0
/*   */     //   30: getfield ed : Lf/con;
/*   */     //   33: aload #5
/*   */     //   35: aload_0
/*   */     //   36: dup
/*   */     //   37: getfield OD0 : I
/*   */     //   40: istore_0
/*   */     //   41: getfield Ys0 : [F
/*   */     //   44: iload_0
/*   */     //   45: swap
/*   */     //   46: invokeinterface ng : (Ljava/lang/Object;I[F)V
/*   */     //   51: return
/*   */     //   52: iload_1
/*   */     //   53: ifne -> 84
/*   */     //   56: iload_2
/*   */     //   57: iload_3
/*   */     //   58: if_icmpge -> 84
/*   */     //   61: aload_0
/*   */     //   62: getfield ed : Lf/con;
/*   */     //   65: aload #5
/*   */     //   67: aload_0
/*   */     //   68: dup
/*   */     //   69: getfield OD0 : I
/*   */     //   72: istore_0
/*   */     //   73: getfield NW : [F
/*   */     //   76: iload_0
/*   */     //   77: swap
/*   */     //   78: invokeinterface ng : (Ljava/lang/Object;I[F)V
/*   */     //   83: return
/*   */     //   84: getstatic f/Wz0.lpt5 : Z
/*   */     //   87: dup
/*   */     //   88: istore_2
/*   */     //   89: ifne -> 107
/*   */     //   92: iload_1
/*   */     //   93: ifeq -> 99
/*   */     //   96: goto -> 107
/*   */     //   99: new java/lang/AssertionError
/*   */     //   102: dup
/*   */     //   103: invokespecial <init> : ()V
/*   */     //   106: athrow
/*   */     //   107: iload_2
/*   */     //   108: ifne -> 131
/*   */     //   111: aload_0
/*   */     //   112: getfield yz0 : F
/*   */     //   115: fconst_0
/*   */     //   116: fcmpl
/*   */     //   117: iflt -> 123
/*   */     //   120: goto -> 131
/*   */     //   123: new java/lang/AssertionError
/*   */     //   126: dup
/*   */     //   127: invokespecial <init> : ()V
/*   */     //   130: athrow
/*   */     //   131: iload_2
/*   */     //   132: ifne -> 158
/*   */     //   135: aload_0
/*   */     //   136: getfield yz0 : F
/*   */     //   139: aload_0
/*   */     //   140: getfield aq0 : F
/*   */     //   143: fcmpg
/*   */     //   144: ifgt -> 150
/*   */     //   147: goto -> 158
/*   */     //   150: new java/lang/AssertionError
/*   */     //   153: dup
/*   */     //   154: invokespecial <init> : ()V
/*   */     //   157: athrow
/*   */     //   158: aload_0
/*   */     //   159: getfield aq0 : F
/*   */     //   162: dup
/*   */     //   163: fstore_1
/*   */     //   164: ldc 1.0E-11
/*   */     //   166: fcmpg
/*   */     //   167: ifge -> 201
/*   */     //   170: fload #4
/*   */     //   172: ldc -1.0E-11
/*   */     //   174: fcmpl
/*   */     //   175: ifle -> 201
/*   */     //   178: aload_0
/*   */     //   179: getfield ed : Lf/con;
/*   */     //   182: aload #5
/*   */     //   184: aload_0
/*   */     //   185: dup
/*   */     //   186: getfield OD0 : I
/*   */     //   189: istore_0
/*   */     //   190: getfield NW : [F
/*   */     //   193: iload_0
/*   */     //   194: swap
/*   */     //   195: invokeinterface ng : (Ljava/lang/Object;I[F)V
/*   */     //   200: return
/*   */     //   201: fload_1
/*   */     //   202: ldc 1.0E-11
/*   */     //   204: fcmpg
/*   */     //   205: ifge -> 239
/*   */     //   208: fload #4
/*   */     //   210: ldc 1.0E-11
/*   */     //   212: fcmpg
/*   */     //   213: ifge -> 239
/*   */     //   216: aload_0
/*   */     //   217: getfield ed : Lf/con;
/*   */     //   220: aload #5
/*   */     //   222: aload_0
/*   */     //   223: dup
/*   */     //   224: getfield OD0 : I
/*   */     //   227: istore_0
/*   */     //   228: getfield Ys0 : [F
/*   */     //   231: iload_0
/*   */     //   232: swap
/*   */     //   233: invokeinterface ng : (Ljava/lang/Object;I[F)V
/*   */     //   238: return
/*   */     //   239: aload_0
/*   */     //   240: dup
/*   */     //   241: getfield yz0 : F
/*   */     //   244: fstore_1
/*   */     //   245: getfield st : Lf/i0;
/*   */     //   248: fload_1
/*   */     //   249: aload_0
/*   */     //   250: getfield aq0 : F
/*   */     //   253: fdiv
/*   */     //   254: invokevirtual compute : (F)F
/*   */     //   257: fstore_1
/*   */     //   258: iconst_0
/*   */     //   259: istore_2
/*   */     //   260: iload_2
/*   */     //   261: aload_0
/*   */     //   262: getfield Zt : I
/*   */     //   265: if_icmpge -> 299
/*   */     //   268: aload_0
/*   */     //   269: getfield Vd : [F
/*   */     //   272: iload_2
/*   */     //   273: aload_0
/*   */     //   274: dup
/*   */     //   275: getfield NW : [F
/*   */     //   278: iload_2
/*   */     //   279: faload
/*   */     //   280: fstore_3
/*   */     //   281: getfield Ys0 : [F
/*   */     //   284: iload_2
/*   */     //   285: faload
/*   */     //   286: fload_3
/*   */     //   287: fload_1
/*   */     //   288: fload_3
/*   */     //   289: invokestatic df : (FFFF)F
/*   */     //   292: fastore
/*   */     //   293: iinc #2, 1
/*   */     //   296: goto -> 260
/*   */     //   299: aload_0
/*   */     //   300: getfield ed : Lf/con;
/*   */     //   303: aload_0
/*   */     //   304: dup
/*   */     //   305: dup
/*   */     //   306: getfield k00 : Ljava/lang/Object;
/*   */     //   309: astore_0
/*   */     //   310: getfield OD0 : I
/*   */     //   313: istore_1
/*   */     //   314: getfield Vd : [F
/*   */     //   317: astore_2
/*   */     //   318: aload_0
/*   */     //   319: iload_1
/*   */     //   320: aload_2
/*   */     //   321: invokeinterface ng : (Ljava/lang/Object;I[F)V
/*   */     //   326: return
/*   */     //   327: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 112
/*   */     //   #2	-> 123
/*   */     //   #3	-> 136
/*   */     //   #4	-> 140
/*   */     //   #5	-> 241
/*   */     //   #6	-> 245
/*   */   }
/*   */   
/*   */   public static Wz0 gq(Object paramObject, int paramInt, float paramFloat) {
/*   */     ((Wz0)xX.al()).sn0(paramObject, paramInt, paramFloat);
/*   */     ((Wz0)xX.al()).st = (i0)Quad.INOUT;
/*   */     return (Wz0)xX.al();
/*   */   }
/*   */   
/*   */   public static Wz0 OC(hk0 paramhk0) {
/*   */     ((Wz0)xX.al()).sn0(null, -1, 0.0F);
/*   */     ((Wz0)xX.al()).C00 = paramhk0;
/*   */     ((Wz0)xX.al()).yj0 = 2;
/*   */     return (Wz0)xX.al();
/*   */   }
/*   */   
/*   */   public Wz0() {
/*   */     int i;
/*   */     this.NW = new float[i = o30];
/*   */     this.Ys0 = new float[i];
/*   */     new float[j * i];
/*   */     this.Vd = new float[i];
/*   */     int j;
/*   */     this.gc = new float[((j = kW) + 2) * i];
/*   */     TL0();
/*   */   }
/*   */   
/*   */   static {
/*   */     o30 = 3;
/*   */     kW = 0;
/*   */     this();
/*   */     Ci ci;
/*   */     xX = new m30(ci);
/*   */     Dd = new HashMap<Object, Object>();
/*   */   }
/*   */   
/*   */   public static Wz0 aG(int paramInt, Object paramObject) {
/*   */     ((Wz0)xX.al()).sn0(paramObject, paramInt, 0.0F);
/*   */     ((Wz0)xX.al()).st = (i0)Quad.INOUT;
/*   */     return (Wz0)xX.al();
/*   */   }
/*   */   
/*   */   public static void Jv() {
/*   */     kW = 5;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Wz0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */