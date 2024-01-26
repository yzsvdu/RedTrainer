/*  1 */ package f;public final class wJ0 { public static final wJ0 Nf0 = new wJ0(); public final LinkedList FE0; public short uY; public short Dk; public short SD; public short un; public long rs; public final void dz() { boolean bool1 = false, bool2 = false; this.uY = bool1; this.Dk = bool2; this.SD = bool1; this.un = bool2; this.Vo0 = 0; this.rs = 0L; this.vM = 0L; this.X2 = 0L; this.NuL = 0L; this.Gb = 0; }
/*  2 */   public long vM; public long X2; public long NuL; public int Gb; public int Vo0; public wJ0() { LinkedList linkedList; this(); this.FE0 = this; this.uY = 0; this.Dk = 0; this.SD = 0; this.un = 0; this.rs = 0L; this.vM = 0L; this.X2 = 0L; this.NuL = 0L; this.Gb = 0; this.Vo0 = 0; } public final void rq(nl... paramVarArgs) { LinkedList linkedList; /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} = FieldReferenceExpression{lastType=ObjectType{java/util/LinkedList}, expression=ThisExpression{ObjectType{f/wJ0}}, name=FE0, descriptor=Ljava/util/LinkedList;}} */ try { int i = paramVarArgs.length; return; } finally { this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/util/LinkedList}, name=null} */ }  } public final int LE() { int i = this.Gb / i; short s1, s2; long l; if ((i = this.Vo0) > 0 && (s1 = this.SD) != (s2 = this.uY) && (l = zm0.u20 - this.X2) < (Math.abs(s1 - s2) * i)) return ((s1 = this.SD) > this.uY) ? (s1 * 16 - (int)(l * 16L / i)) : (s1 * 16 - (int)(l * 16L / i) * -1);  return (this.SD = this.uY) * 16; } public final int Lh() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Vo0 : I
/*    */     //   4: dup
/*    */     //   5: istore_1
/*    */     //   6: ifle -> 104
/*    */     //   9: aload_0
/*    */     //   10: getfield un : S
/*    */     //   13: dup
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: getfield Dk : S
/*    */     //   19: dup
/*    */     //   20: istore_3
/*    */     //   21: if_icmpeq -> 104
/*    */     //   24: getstatic f/zm0.u20 : J
/*    */     //   27: aload_0
/*    */     //   28: getfield X2 : J
/*    */     //   31: lsub
/*    */     //   32: dup2
/*    */     //   33: lstore #4
/*    */     //   35: iload_2
/*    */     //   36: iload_3
/*    */     //   37: aload_0
/*    */     //   38: getfield Gb : I
/*    */     //   41: iload_1
/*    */     //   42: idiv
/*    */     //   43: istore_1
/*    */     //   44: isub
/*    */     //   45: invokestatic abs : (I)I
/*    */     //   48: iload_1
/*    */     //   49: imul
/*    */     //   50: i2l
/*    */     //   51: lcmp
/*    */     //   52: ifge -> 104
/*    */     //   55: aload_0
/*    */     //   56: getfield un : S
/*    */     //   59: dup
/*    */     //   60: istore_2
/*    */     //   61: aload_0
/*    */     //   62: getfield Dk : S
/*    */     //   65: if_icmpge -> 84
/*    */     //   68: iload_2
/*    */     //   69: bipush #16
/*    */     //   71: imul
/*    */     //   72: lload #4
/*    */     //   74: ldc2_w 16
/*    */     //   77: lmul
/*    */     //   78: iload_1
/*    */     //   79: i2l
/*    */     //   80: ldiv
/*    */     //   81: l2i
/*    */     //   82: iadd
/*    */     //   83: ireturn
/*    */     //   84: lload #4
/*    */     //   86: iload_2
/*    */     //   87: bipush #16
/*    */     //   89: imul
/*    */     //   90: istore_0
/*    */     //   91: ldc2_w 16
/*    */     //   94: lmul
/*    */     //   95: iload_1
/*    */     //   96: i2l
/*    */     //   97: ldiv
/*    */     //   98: l2i
/*    */     //   99: iconst_m1
/*    */     //   100: imul
/*    */     //   101: iload_0
/*    */     //   102: iadd
/*    */     //   103: ireturn
/*    */     //   104: aload_0
/*    */     //   105: getfield Dk : S
/*    */     //   108: dup
/*    */     //   109: aload_0
/*    */     //   110: swap
/*    */     //   111: putfield un : S
/*    */     //   114: bipush #16
/*    */     //   116: imul
/*    */     //   117: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 24
/*  2 */     //   #2	-> 28 } public final float tJ0() { float f1 = this.Gb / i; int i; short s2, s3; float f2; if ((i = this.Vo0) > 0 && (s2 = this.SD) != (s3 = this.uY) && (f2 = (float)(zm0.u20 - this.X2)) < f1 * Math.abs(s2 - s3)) return ((s2 = this.SD) > this.uY) ? (s2 * 0.25F - f2 * 0.25F / f1) : (s2 * 0.25F - f2 * 0.25F / f1 * -1.0F);  short s1 = this.uY; return s1 * 0.25F; } public final float yc0() { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield Vo0 : I
/*    */     //   4: dup
/*    */     //   5: istore_1
/*    */     //   6: ifle -> 106
/*    */     //   9: aload_0
/*    */     //   10: getfield un : S
/*    */     //   13: dup
/*    */     //   14: istore_2
/*    */     //   15: aload_0
/*    */     //   16: getfield Dk : S
/*    */     //   19: dup
/*    */     //   20: istore_3
/*    */     //   21: if_icmpeq -> 106
/*    */     //   24: getstatic f/zm0.u20 : J
/*    */     //   27: aload_0
/*    */     //   28: getfield X2 : J
/*    */     //   31: lsub
/*    */     //   32: aload_0
/*    */     //   33: getfield Gb : I
/*    */     //   36: i2f
/*    */     //   37: iload_1
/*    */     //   38: i2f
/*    */     //   39: fdiv
/*    */     //   40: fstore_1
/*    */     //   41: l2f
/*    */     //   42: dup
/*    */     //   43: fstore #4
/*    */     //   45: fload_1
/*    */     //   46: iload_2
/*    */     //   47: iload_3
/*    */     //   48: isub
/*    */     //   49: invokestatic abs : (I)I
/*    */     //   52: i2f
/*    */     //   53: fmul
/*    */     //   54: fcmpg
/*    */     //   55: ifge -> 106
/*    */     //   58: aload_0
/*    */     //   59: getfield un : S
/*    */     //   62: dup
/*    */     //   63: istore_2
/*    */     //   64: aload_0
/*    */     //   65: getfield Dk : S
/*    */     //   68: if_icmpge -> 87
/*    */     //   71: fload #4
/*    */     //   73: iload_2
/*    */     //   74: i2f
/*    */     //   75: ldc 0.25
/*    */     //   77: fmul
/*    */     //   78: fstore_0
/*    */     //   79: ldc 0.25
/*    */     //   81: fmul
/*    */     //   82: fload_1
/*    */     //   83: fdiv
/*    */     //   84: fload_0
/*    */     //   85: fadd
/*    */     //   86: freturn
/*    */     //   87: fload #4
/*    */     //   89: iload_2
/*    */     //   90: i2f
/*    */     //   91: ldc 0.25
/*    */     //   93: fmul
/*    */     //   94: fstore_0
/*    */     //   95: ldc 0.25
/*    */     //   97: fmul
/*    */     //   98: fload_1
/*    */     //   99: fdiv
/*    */     //   100: ldc -1.0
/*    */     //   102: fmul
/*    */     //   103: fload_0
/*    */     //   104: fadd
/*    */     //   105: freturn
/*    */     //   106: aload_0
/*    */     //   107: dup
/*    */     //   108: getfield Dk : S
/*    */     //   111: dup
/*    */     //   112: istore_0
/*    */     //   113: putfield un : S
/*    */     //   116: iload_0
/*    */     //   117: i2f
/*    */     //   118: ldc 0.25
/*    */     //   120: fmul
/*    */     //   121: freturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 24
/*  2 */     //   #2	-> 28 } public final void ZP(nl paramnl) { short s3, s4; short s1 = this.uY, s2 = this.Dk; switch (paramnl.rb) { default: s4 = s2; s3 = s1; break;case 3: s3 = (short)(s1 + paramnl.sv); s4 = s2; break;case 2: s3 = (short)(s1 - paramnl.sv); s4 = s2; break;case 1: s4 = s3 = (short)(s2 - paramnl.sv); s3 = s1; break;case 0: s4 = s3 = (short)(s2 + paramnl.sv); s3 = s1; break; }
/*  3 */      int j; if ((j = paramnl.ordinal()) != 104) { if (j != 105) { if (j == 108) { dz(); return; }  } else { s3 = (short)(this.uY - 1); s4 = (short)(this.Dk + 1); }  } else { s3 = (short)(this.uY + 1); s4 = (short)(this.Dk - 1); }  this.uY = s3; this.Dk = s4; this.SD = s1; this.un = s2;
/*  4 */     this
/*  5 */       .Vo0 = s1; if ((s1 = paramnl.sv) > 0 || paramnl
/*  6 */       .Iy)
/*    */     
/*  8 */     { this
/*    */         
/* 10 */         .rs = zm0.u20; } else { this.vM = zm0.u20; }  if (s1 > 0 || paramnl
/* 11 */       .Iy) this
/*    */         
/* 13 */         .X2 = zm0.u20; 
/* 14 */     int i = paramnl.qf0;
/*    */ 
/*    */     
/* 17 */     this.NuL = i + zm0.u20; }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wJ0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */