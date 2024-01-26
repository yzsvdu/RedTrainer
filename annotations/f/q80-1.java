/*    */ package f;
/*  2 */ public class q80 extends rU implements nW { public static final Class[] uU = new Class[] { mX.class, pe.class, JE0.class }; public final XR Fy; public q80(dS paramdS, L00 paramL00) { super(paramdS, paramL00); XR xR; this(); this.Fy = this; } public final mX w2(String paramString) { mX mX; return ((mX = (mX)Yz0(paramString, true, mX.class, null)) == bn0.qs) ? null : this; } public final JE0 sL(String paramString) { return (JE0)Yz0(paramString, false, JE0.class, null); } public final nW Uz(String paramString) { nW nW1; return ((nW1 = (nW)Yz0(paramString, true, nW.class, null)) == null) ? this.qi.ro : nW1; } public final pe aa0(String paramString) { pe pe; if ((pe = (pe)Yz0(paramString, true, pe.class, null)) != null) return pe; 
/*  3 */     return this.qi.hS; }
/*    */   public final boolean Mw0(String paramString, boolean paramBoolean) { Boolean bool; return ((bool = (Boolean)Yz0(paramString, true, Boolean.class, null)) != null) ? booleanValue() : paramBoolean; }
/*    */   public final int Km(int paramInt, String paramString) { Integer integer; return ((integer = (Integer)Yz0(paramString, true, Integer.class, null)) != null) ? intValue() : paramInt; } public final Object Yz0(String paramString, boolean paramBoolean, Class paramClass, Object paramObject) { Object object; if ((object = this.Fy.VV(paramString)) == null && paramBoolean)
/*    */       d40(paramClass, paramString);  if (!paramClass.isInstance(object)) { if (object != null) { String str; Class<?> clazz = object.getClass(); object = lI.wb(); if (this.Bf0 != null)
/*  7 */         { str = B40.df(", defined in ").append(this.Bf0.t6(0).toString()).toString(); } else { str = ""; }  object
/*  8 */           .getClass();
/*  9 */         lI.u4.warning("Parameter \"" + paramString + "\" is a " + clazz.getSimpleName() + " expected a " + paramClass.getSimpleName() + this); }  return paramObject; }
/* 10 */      return paramClass.cast(object); } public final void d40(Class paramClass, String paramString) { String str; lI lI = lI.wb(); if (this.Bf0 != null) { str = B40.df(", defined in ").append(this.Bf0.t6(0).toString()).toString(); } else { str = ""; }  lI.getClass(); StringBuilder stringBuilder = (new StringBuilder("Parameter \"")).append(paramString).append("\" "); if (paramClass != null) { stringBuilder.append("of type "); if (paramClass.isEnum()) stringBuilder.append("enum ");  stringBuilder.append('"').append(paramClass.getSimpleName()).append('"'); }  stringBuilder.append(" not set"); if (this instanceof nY) { stringBuilder.append(" for \"").append(((L00)this).t6(0).toString()).append("\""); } else { stringBuilder.append(str); }  lI.u4.warning(stringBuilder.toString()); }
/*    */ 
/*    */   
/*    */   public final void J10(Object paramObject, String paramString) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Fy : Lf/XR;
/*    */     //   4: aload_2
/*    */     //   5: aload_1
/*    */     //   6: invokevirtual HC : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   9: dup
/*    */     //   10: astore_3
/*    */     //   11: ifnull -> 183
/*    */     //   14: aload_1
/*    */     //   15: ifnull -> 183
/*    */     //   18: aload_3
/*    */     //   19: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   22: dup
/*    */     //   23: astore_3
/*    */     //   24: aload_1
/*    */     //   25: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   28: dup
/*    */     //   29: astore_1
/*    */     //   30: if_acmpeq -> 183
/*    */     //   33: getstatic f/q80.uU : [Ljava/lang/Class;
/*    */     //   36: astore #4
/*    */     //   38: iconst_3
/*    */     //   39: istore #5
/*    */     //   41: iconst_0
/*    */     //   42: istore #6
/*    */     //   44: iload #6
/*    */     //   46: iload #5
/*    */     //   48: if_icmpge -> 85
/*    */     //   51: aload #4
/*    */     //   53: iload #6
/*    */     //   55: aaload
/*    */     //   56: dup
/*    */     //   57: astore #7
/*    */     //   59: aload_3
/*    */     //   60: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
/*    */     //   63: ifeq -> 79
/*    */     //   66: aload #7
/*    */     //   68: aload_1
/*    */     //   69: invokevirtual isAssignableFrom : (Ljava/lang/Class;)Z
/*    */     //   72: ifeq -> 79
/*    */     //   75: iconst_1
/*    */     //   76: goto -> 86
/*    */     //   79: iinc #6, 1
/*    */     //   82: goto -> 44
/*    */     //   85: iconst_0
/*    */     //   86: ifne -> 183
/*    */     //   89: aload_0
/*    */     //   90: invokestatic wb : ()Lf/lI;
/*    */     //   93: astore #4
/*    */     //   95: getfield Bf0 : Lf/L00;
/*    */     //   98: ifnull -> 127
/*    */     //   101: ldc ', defined in '
/*    */     //   103: invokestatic df : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   106: aload_0
/*    */     //   107: getfield Bf0 : Lf/L00;
/*    */     //   110: iconst_0
/*    */     //   111: invokevirtual t6 : (I)Ljava/lang/StringBuilder;
/*    */     //   114: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   117: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   120: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   123: astore_0
/*    */     //   124: goto -> 130
/*    */     //   127: ldc ''
/*    */     //   129: astore_0
/*    */     //   130: aload #4
/*    */     //   132: invokevirtual getClass : ()Ljava/lang/Class;
/*    */     //   135: pop
/*    */     //   136: getstatic f/lI.u4 : Ljava/util/logging/Logger;
/*    */     //   139: new java/lang/StringBuilder
/*    */     //   142: dup
/*    */     //   143: invokespecial <init> : ()V
/*    */     //   146: ldc 'Paramter "'
/*    */     //   148: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   151: aload_2
/*    */     //   152: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   155: ldc '" of type '
/*    */     //   157: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   160: aload_3
/*    */     //   161: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   164: ldc ' is replaced with type '
/*    */     //   166: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   169: aload_1
/*    */     //   170: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*    */     //   173: aload_0
/*    */     //   174: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*    */     //   177: invokevirtual toString : ()Ljava/lang/String;
/*    */     //   180: invokevirtual warning : (Ljava/lang/String;)V
/*    */     //   183: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 33
/*    */     //   #2	-> 90
/*    */     //   #3	-> 95
/*    */     //   #4	-> 101
/*    */     //   #5	-> 107
/*    */     //   #6	-> 111
/*    */     //   #7	-> 114
/*    */     //   #8	-> 117
/*    */     //   #9	-> 132
/*    */     //   #10	-> 136
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/q80.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */