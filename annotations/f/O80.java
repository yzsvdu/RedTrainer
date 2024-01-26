/*  1 */ package f;public final class O80 extends dj { public final void ID(pe0 parampe0) { this.cv0
/*  2 */       .ze = (zp)parampe0.G3;
/*  3 */     float f1 = parampe0.mP;
/*    */     
/*  5 */     float f2 = parampe0.WT;
/*    */ 
/*    */     
/*  8 */     this.za = parampe0.zV - f1;
/*    */     
/* 10 */     this.yh0 = parampe0.bh0 - f2; }
/*    */ 
/*    */   
/*    */   public static final long Jg0;
/*    */   public static final long D8;
/*    */   public static final long wF0;
/*    */   public static final long tM;
/*    */   public static final long Mc0;
/*    */   public static final long fS;
/*    */   public static final long La;
/*    */   public static long Kn0;
/*    */   public final IX cv0;
/*    */   public float QG = 0.0F;
/*    */   public float Ry = 0.0F;
/*    */   public float za = 1.0F;
/*    */   public float yh0 = 1.0F;
/*    */   public int yz = 0;
/*    */   
/*    */   public static final boolean CM(long paramLong) {
/*    */     return ((paramLong & Kn0) != 0L);
/*    */   }
/*    */   
/*    */   public O80(long paramLong) {
/*    */     super(paramLong);
/*    */     if (CM(paramLong)) {
/*    */       IX iX;
/*    */       this();
/*    */       this.cv0 = this;
/*    */       return;
/*    */     } 
/*    */     throw new JU("Invalid type specified");
/*    */   }
/*    */   
/*    */   public O80(long paramLong, IX paramIX) {
/*    */     this(paramLong);
/*    */     this.cv0.jf0(paramIX);
/*    */   }
/*    */   
/*    */   public O80(long paramLong, IX paramIX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, int paramInt) {
/*    */     this(paramLong, paramIX);
/*    */     this.QG = paramFloat1;
/*    */     this.Ry = paramFloat2;
/*    */     this.za = paramFloat3;
/*    */     this.yh0 = paramFloat4;
/*    */     this.yz = paramInt;
/*    */   }
/*    */   
/*    */   public O80(long paramLong, IX paramIX, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*    */     this(paramLong, paramIX, paramFloat1, paramFloat2, paramFloat3, paramFloat4, 0);
/*    */   }
/*    */   
/*    */   public O80(long paramLong, Texture paramTexture) {
/*    */     this(paramLong);
/*    */     this.cv0.ze = (zp)paramTexture;
/*    */   }
/*    */   
/*    */   public O80(long paramLong, pe0 parampe0) {
/*    */     this(paramLong);
/*    */     ID(parampe0);
/*    */   }
/*    */   
/*    */   public O80(O80 paramO80) {
/*    */     this(l, iX, f1, f2, f3, f4, i);
/*    */   }
/*    */   
/*    */   static {
/*    */     long l1 = dj.tv0("bumpTexture");
/*    */     long l2 = dj.tv0("normalTexture");
/*    */     long l3 = dj.tv0("ambientTexture");
/*    */     long l4 = dj.tv0("emissiveTexture");
/*    */     long l5 = dj.tv0("reflectionTexture");
/*    */     Kn0 = (Jg0 = dj.tv0("diffuseTexture")) | (D8 = dj.tv0("specularTexture")) | l1 | l2 | l3 | l4 | l5;
/*    */   }
/*    */   
/*    */   public final dj Mi0() {
/*    */     return new O80(this);
/*    */   }
/*    */   
/*    */   public final int hashCode() {
/*    */     int i = super.hashCode() * 991;
/*    */     i = (this.cv0.hashCode() + i) * 991;
/*    */     i = (Float.floatToRawIntBits(this.QG) + i) * 991;
/*    */     i = (Float.floatToRawIntBits(this.Ry) + i) * 991;
/*    */     i = (Float.floatToRawIntBits(this.za) + i) * 991;
/*    */     return (Float.floatToRawIntBits(this.yh0) + i) * 991 + this.yz;
/*    */   }
/*    */   
/*    */   public final int compareTo(Object paramObject) {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: aload_1
/*    */     //   2: checkcast f/dj
/*    */     //   5: astore_1
/*    */     //   6: getfield tL : J
/*    */     //   9: aload_1
/*    */     //   10: getfield tL : J
/*    */     //   13: lcmp
/*    */     //   14: dup
/*    */     //   15: istore_2
/*    */     //   16: ifeq -> 33
/*    */     //   19: iload_2
/*    */     //   20: ifge -> 28
/*    */     //   23: iconst_m1
/*    */     //   24: istore_0
/*    */     //   25: goto -> 199
/*    */     //   28: iconst_1
/*    */     //   29: istore_0
/*    */     //   30: goto -> 199
/*    */     //   33: aload_0
/*    */     //   34: aload_1
/*    */     //   35: checkcast f/O80
/*    */     //   38: astore_1
/*    */     //   39: getfield cv0 : Lf/IX;
/*    */     //   42: aload_1
/*    */     //   43: getfield cv0 : Lf/IX;
/*    */     //   46: invokevirtual e10 : (Lf/IX;)I
/*    */     //   49: dup
/*    */     //   50: istore_2
/*    */     //   51: ifeq -> 59
/*    */     //   54: iload_2
/*    */     //   55: istore_0
/*    */     //   56: goto -> 199
/*    */     //   59: aload_0
/*    */     //   60: getfield yz : I
/*    */     //   63: dup
/*    */     //   64: istore_2
/*    */     //   65: aload_1
/*    */     //   66: getfield yz : I
/*    */     //   69: dup
/*    */     //   70: istore_3
/*    */     //   71: if_icmpeq -> 81
/*    */     //   74: iload_2
/*    */     //   75: iload_3
/*    */     //   76: isub
/*    */     //   77: istore_0
/*    */     //   78: goto -> 199
/*    */     //   81: aload_0
/*    */     //   82: getfield za : F
/*    */     //   85: aload_1
/*    */     //   86: getfield za : F
/*    */     //   89: invokestatic JC0 : (FF)Z
/*    */     //   92: ifne -> 110
/*    */     //   95: aload_0
/*    */     //   96: getfield za : F
/*    */     //   99: aload_1
/*    */     //   100: getfield za : F
/*    */     //   103: fcmpl
/*    */     //   104: ifle -> 23
/*    */     //   107: goto -> 28
/*    */     //   110: aload_0
/*    */     //   111: getfield yh0 : F
/*    */     //   114: aload_1
/*    */     //   115: getfield yh0 : F
/*    */     //   118: invokestatic JC0 : (FF)Z
/*    */     //   121: ifne -> 139
/*    */     //   124: aload_0
/*    */     //   125: getfield yh0 : F
/*    */     //   128: aload_1
/*    */     //   129: getfield yh0 : F
/*    */     //   132: fcmpl
/*    */     //   133: ifle -> 23
/*    */     //   136: goto -> 28
/*    */     //   139: aload_0
/*    */     //   140: getfield QG : F
/*    */     //   143: aload_1
/*    */     //   144: getfield QG : F
/*    */     //   147: invokestatic JC0 : (FF)Z
/*    */     //   150: ifne -> 168
/*    */     //   153: aload_0
/*    */     //   154: getfield QG : F
/*    */     //   157: aload_1
/*    */     //   158: getfield QG : F
/*    */     //   161: fcmpl
/*    */     //   162: ifle -> 23
/*    */     //   165: goto -> 28
/*    */     //   168: aload_0
/*    */     //   169: getfield Ry : F
/*    */     //   172: aload_1
/*    */     //   173: getfield Ry : F
/*    */     //   176: invokestatic JC0 : (FF)Z
/*    */     //   179: ifne -> 197
/*    */     //   182: aload_0
/*    */     //   183: getfield Ry : F
/*    */     //   186: aload_1
/*    */     //   187: getfield Ry : F
/*    */     //   190: fcmpl
/*    */     //   191: ifle -> 23
/*    */     //   194: goto -> 28
/*    */     //   197: iconst_0
/*    */     //   198: istore_0
/*    */     //   199: iload_0
/*    */     //   200: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 6
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/O80.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */