/* 1 */ package f;public final class Cy0 extends Kl0 { public final void sM() { this
/* 2 */       .Zs0 = this.Ws.getInt(); this.yv = Vp0.cOm1(R00()); short s1, s2;
/* 3 */     if ((s2 = (short)((s1 = this.Ws.getShort()) & 0x3FF)) == 1023) s2 = -1;  this
/* 4 */       .Ob0 = s2; if ((s1 = (byte)((s1 & 0xFFFF) >> 10)) == 63) s1 = -1;  this.YP = s1; }
/*   */ 
/*   */   
/*   */   public int Zs0;
/*   */   public Vp0 yv;
/*   */   public short Ob0;
/*   */   public byte YP;
/*   */   
/*   */   public Cy0(c4 paramc4, ByteBuffer paramByteBuffer) {
/*   */     super(paramc4, paramByteBuffer);
/*   */   }
/*   */   
/*   */   public final void Cx() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: dup
/*   */     //   3: dup2
/*   */     //   4: invokevirtual r8 : ()Lf/ro;
/*   */     //   7: getfield Qa : Lf/vh0;
/*   */     //   10: astore_0
/*   */     //   11: getfield Zs0 : I
/*   */     //   14: istore_1
/*   */     //   15: getfield yv : Lf/Vp0;
/*   */     //   18: astore_2
/*   */     //   19: getfield Ob0 : S
/*   */     //   22: istore_3
/*   */     //   23: getfield YP : B
/*   */     //   26: istore #4
/*   */     //   28: aload_0
/*   */     //   29: getfield yD : I
/*   */     //   32: iload_1
/*   */     //   33: if_icmpne -> 79
/*   */     //   36: aload_0
/*   */     //   37: getfield Ct : Lf/Jo;
/*   */     //   40: getfield lB0 : Lf/OE0;
/*   */     //   43: dup
/*   */     //   44: getfield Xu : Lf/H10;
/*   */     //   47: dup
/*   */     //   48: getfield Hd0 : [S
/*   */     //   51: aload_2
/*   */     //   52: getfield gw0 : B
/*   */     //   55: dup
/*   */     //   56: istore_0
/*   */     //   57: iload_3
/*   */     //   58: sastore
/*   */     //   59: getfield Kw0 : [B
/*   */     //   62: iload_0
/*   */     //   63: iload #4
/*   */     //   65: bastore
/*   */     //   66: getstatic f/Vp0.Jo : [Lf/Vp0;
/*   */     //   69: arraylength
/*   */     //   70: anewarray f/UX
/*   */     //   73: putfield tx : [Lf/UX;
/*   */     //   76: goto -> 145
/*   */     //   79: aload_0
/*   */     //   80: getfield KO : Ljava/util/concurrent/ConcurrentHashMap;
/*   */     //   83: iload_1
/*   */     //   84: invokestatic valueOf : (I)Ljava/lang/Integer;
/*   */     //   87: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*   */     //   90: checkcast f/tc
/*   */     //   93: dup
/*   */     //   94: astore_0
/*   */     //   95: ifnull -> 145
/*   */     //   98: aload_0
/*   */     //   99: instanceof f/Jo
/*   */     //   102: ifeq -> 145
/*   */     //   105: aload_0
/*   */     //   106: checkcast f/Jo
/*   */     //   109: getfield lB0 : Lf/OE0;
/*   */     //   112: dup
/*   */     //   113: getfield Xu : Lf/H10;
/*   */     //   116: dup
/*   */     //   117: getfield Hd0 : [S
/*   */     //   120: aload_2
/*   */     //   121: getfield gw0 : B
/*   */     //   124: dup
/*   */     //   125: istore_0
/*   */     //   126: iload_3
/*   */     //   127: sastore
/*   */     //   128: getfield Kw0 : [B
/*   */     //   131: iload_0
/*   */     //   132: iload #4
/*   */     //   134: bastore
/*   */     //   135: getstatic f/Vp0.Jo : [Lf/Vp0;
/*   */     //   138: arraylength
/*   */     //   139: anewarray f/UX
/*   */     //   142: putfield tx : [Lf/UX;
/*   */     //   145: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 7
/*   */     //   #2	-> 11
/*   */     //   #3	-> 29
/*   */     //   #4	-> 37
/*   */     //   #5	-> 40
/*   */     //   #6	-> 44
/*   */     //   #7	-> 48
/*   */     //   #8	-> 52
/*   */     //   #9	-> 58
/*   */     //   #10	-> 66
/*   */     //   #11	-> 80
/*   */     //   #12	-> 99
/*   */     //   #13	-> 106
/*   */     //   #14	-> 109
/*   */     //   #15	-> 113
/*   */     //   #16	-> 117
/*   */     //   #17	-> 121
/*   */     //   #18	-> 127
/*   */     //   #19	-> 135
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Cy0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */