/* 1 */ package f;public class NZ extends il { public za0 xm0; public final boolean T9() { return (((byte)this.EC0 & 0x1) != 0); } public NZ(Cy paramCy, za0 paramza0, short paramShort1, short paramShort2, byte paramByte) { super(paramCy, paramza0, paramShort1, paramShort2, paramByte); this.xm0 = paramza0; this.EC0 = BY(); jp0(); } public final boolean f() { return (pq() == 254); } public final boolean Gc(byte paramByte) { return (((byte)this.EC0 & 0x2) != 0); } public final boolean EA0() { return (((byte)this.EC0 & 0x8) != 0); } public byte OB0() { return (byte)pq(); }
/* 2 */   public short rv0() { return this.xm0.gP[this.pu][0][this.si0][this.k80]; } public short RW() { return this.xm0.gP[this.pu][1][this.si0][this.k80]; } public short pq() { return this.xm0.gP[this.pu][2][this.si0][this.k80]; } public short BY() { return this.xm0.gP[this.pu][3][this.si0][this.k80]; } public final boolean Hc0(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) {
/* 3 */     boolean bool = this instanceof CoM8;
/* 4 */     short s1 = Ka(), s2 = hA0();
/* 5 */     byte b = this.pu;
/* 6 */     float f = i00(); HV hV; NI0 nI0; if ((hV = this.ys0.eX) != null && (nI0 = hV.yz(bool, s1, s2, b, f)) != null && nI0.Au0() && paramByte1 == nI0
/* 7 */       .jJ0)
/* 8 */       return il.ms0(this, paramtc, nI0, paramByte1); 
/* 9 */     return hz().kA0(paramxr0, paramtc, paramByte1);
/*   */   }
/*   */   
/*   */   public final boolean jd0(xr0 paramxr0, tc paramtc, byte paramByte1, byte paramByte2) {
/*   */     boolean bool = this instanceof CoM8;
/*   */     short s1 = Ka(), s2 = hA0();
/*   */     byte b = this.pu;
/*   */     float f = i00();
/*   */     NI0 nI0;
/*   */     HV hV;
/*   */     if ((hV = this.ys0.eX) != null && (nI0 = hV.yz(bool, s1, s2, b, f)) != null && !nI0.Au0() && Math.abs(i00() - paramtc.aJ0()) < 1.27F)
/*   */       return il.ms0(this, paramtc, nI0, paramByte1); 
/*   */     return hz().sM(paramxr0, paramtc, paramByte1, paramByte2);
/*   */   }
/*   */   
/*   */   public final nl i2(tc paramtc) {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: getfield ys0 : Lf/Cy;
/*   */     //   4: getfield eX : Lf/HV;
/*   */     //   7: aload_0
/*   */     //   8: dup
/*   */     //   9: dup
/*   */     //   10: dup2
/*   */     //   11: instanceof f/CoM8
/*   */     //   14: istore_1
/*   */     //   15: invokevirtual Ka : ()S
/*   */     //   18: istore_2
/*   */     //   19: invokevirtual hA0 : ()S
/*   */     //   22: istore_3
/*   */     //   23: getfield pu : B
/*   */     //   26: istore #4
/*   */     //   28: invokevirtual i00 : ()F
/*   */     //   31: fstore #5
/*   */     //   33: iload_1
/*   */     //   34: iload_2
/*   */     //   35: iload_3
/*   */     //   36: iload #4
/*   */     //   38: fload #5
/*   */     //   40: invokevirtual yz : (ZSSBF)Lf/NI0;
/*   */     //   43: dup
/*   */     //   44: astore_1
/*   */     //   45: ifnull -> 107
/*   */     //   48: aload_1
/*   */     //   49: invokevirtual Au0 : ()Z
/*   */     //   52: ifne -> 107
/*   */     //   55: aload_1
/*   */     //   56: invokevirtual Au0 : ()Z
/*   */     //   59: ifeq -> 66
/*   */     //   62: aconst_null
/*   */     //   63: goto -> 106
/*   */     //   66: aload_1
/*   */     //   67: getfield jJ0 : B
/*   */     //   70: dup
/*   */     //   71: istore_0
/*   */     //   72: ifeq -> 103
/*   */     //   75: iload_0
/*   */     //   76: iconst_2
/*   */     //   77: if_icmpeq -> 97
/*   */     //   80: iload_0
/*   */     //   81: iconst_3
/*   */     //   82: if_icmpeq -> 91
/*   */     //   85: getstatic f/nl.jC0 : Lf/nl;
/*   */     //   88: goto -> 106
/*   */     //   91: getstatic f/nl.Bn : Lf/nl;
/*   */     //   94: goto -> 106
/*   */     //   97: getstatic f/nl.Dz0 : Lf/nl;
/*   */     //   100: goto -> 106
/*   */     //   103: getstatic f/nl.Cl : Lf/nl;
/*   */     //   106: areturn
/*   */     //   107: aload_0
/*   */     //   108: invokevirtual hz : ()Lf/ZK0;
/*   */     //   111: invokevirtual V6 : ()Lf/nl;
/*   */     //   114: areturn
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 1
/*   */     //   #2	-> 4
/*   */     //   #3	-> 11
/*   */     //   #4	-> 15
/*   */     //   #5	-> 23
/*   */     //   #6	-> 28
/*   */     //   #7	-> 56
/*   */     //   #8	-> 108
/*   */   }
/*   */   
/*   */   public final void jp0() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: invokevirtual f : ()Z
/*   */     //   4: ifeq -> 8
/*   */     //   7: return
/*   */     //   8: aload_0
/*   */     //   9: getfield ys0 : Lf/Cy;
/*   */     //   12: dup
/*   */     //   13: astore_1
/*   */     //   14: getfield E10 : B
/*   */     //   17: iconst_2
/*   */     //   18: if_icmpne -> 52
/*   */     //   21: aload_1
/*   */     //   22: invokevirtual Xg0 : ()S
/*   */     //   25: bipush #97
/*   */     //   27: if_icmpne -> 52
/*   */     //   30: aload_0
/*   */     //   31: getfield pu : B
/*   */     //   34: dup
/*   */     //   35: istore_1
/*   */     //   36: ifle -> 52
/*   */     //   39: aload_0
/*   */     //   40: iload_1
/*   */     //   41: bipush #10
/*   */     //   43: imul
/*   */     //   44: bipush #20
/*   */     //   46: iadd
/*   */     //   47: i2f
/*   */     //   48: putfield xJ : F
/*   */     //   51: return
/*   */     //   52: aload_0
/*   */     //   53: invokevirtual rv0 : ()S
/*   */     //   56: dup
/*   */     //   57: istore_1
/*   */     //   58: ifeq -> 209
/*   */     //   61: iload_1
/*   */     //   62: iconst_2
/*   */     //   63: if_icmpeq -> 82
/*   */     //   66: aload_0
/*   */     //   67: dup
/*   */     //   68: invokevirtual rv0 : ()S
/*   */     //   71: iconst_2
/*   */     //   72: ishr
/*   */     //   73: i2s
/*   */     //   74: istore_1
/*   */     //   75: invokevirtual RW : ()S
/*   */     //   78: istore_2
/*   */     //   79: goto -> 106
/*   */     //   82: aload_0
/*   */     //   83: getfield xm0 : Lf/za0;
/*   */     //   86: getfield my0 : [[[S
/*   */     //   89: aload_0
/*   */     //   90: getfield pu : B
/*   */     //   93: aaload
/*   */     //   94: aload_0
/*   */     //   95: invokevirtual RW : ()S
/*   */     //   98: aaload
/*   */     //   99: dup
/*   */     //   100: iconst_1
/*   */     //   101: saload
/*   */     //   102: istore_1
/*   */     //   103: iconst_3
/*   */     //   104: saload
/*   */     //   105: istore_2
/*   */     //   106: iload_1
/*   */     //   107: iflt -> 117
/*   */     //   110: iload_1
/*   */     //   111: sipush #329
/*   */     //   114: if_icmplt -> 119
/*   */     //   117: iconst_0
/*   */     //   118: istore_1
/*   */     //   119: iload_2
/*   */     //   120: getstatic f/Fm0.Q7 : [[F
/*   */     //   123: iload_1
/*   */     //   124: aaload
/*   */     //   125: astore_1
/*   */     //   126: getstatic f/Fm0.R9 : [F
/*   */     //   129: astore_3
/*   */     //   130: sipush #1326
/*   */     //   133: if_icmplt -> 138
/*   */     //   136: iconst_0
/*   */     //   137: istore_2
/*   */     //   138: aload_0
/*   */     //   139: dup
/*   */     //   140: aload_1
/*   */     //   141: aload_0
/*   */     //   142: aload_1
/*   */     //   143: aload_0
/*   */     //   144: aload_3
/*   */     //   145: iload_2
/*   */     //   146: faload
/*   */     //   147: aload_1
/*   */     //   148: iconst_2
/*   */     //   149: faload
/*   */     //   150: fmul
/*   */     //   151: fstore_0
/*   */     //   152: getfield xm0 : Lf/za0;
/*   */     //   155: dup
/*   */     //   156: getfield ar0 : I
/*   */     //   159: i2f
/*   */     //   160: ldc 0.5
/*   */     //   162: fmul
/*   */     //   163: ldc 0.5
/*   */     //   165: fsub
/*   */     //   166: fstore_1
/*   */     //   167: getfield Rc0 : I
/*   */     //   170: i2f
/*   */     //   171: ldc 0.5
/*   */     //   173: fmul
/*   */     //   174: ldc 0.5
/*   */     //   176: fsub
/*   */     //   177: fstore_2
/*   */     //   178: iconst_0
/*   */     //   179: faload
/*   */     //   180: fstore_3
/*   */     //   181: getfield si0 : S
/*   */     //   184: i2f
/*   */     //   185: fload_1
/*   */     //   186: fload_3
/*   */     //   187: fload_0
/*   */     //   188: invokestatic df : (FFFF)F
/*   */     //   191: fstore_0
/*   */     //   192: iconst_1
/*   */     //   193: faload
/*   */     //   194: fstore_1
/*   */     //   195: getfield k80 : S
/*   */     //   198: i2f
/*   */     //   199: fload_2
/*   */     //   200: fload_1
/*   */     //   201: fload_0
/*   */     //   202: invokestatic df : (FFFF)F
/*   */     //   205: putfield xJ : F
/*   */     //   208: return
/*   */     //   209: aload_0
/*   */     //   210: invokevirtual RW : ()S
/*   */     //   213: dup
/*   */     //   214: istore_1
/*   */     //   215: getstatic f/Fm0.R9 : [F
/*   */     //   218: astore_2
/*   */     //   219: sipush #1326
/*   */     //   222: if_icmplt -> 227
/*   */     //   225: iconst_0
/*   */     //   226: istore_1
/*   */     //   227: aload_0
/*   */     //   228: aload_2
/*   */     //   229: iload_1
/*   */     //   230: faload
/*   */     //   231: putfield xJ : F
/*   */     //   234: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 9
/*   */     //   #2	-> 14
/*   */     //   #3	-> 22
/*   */     //   #4	-> 31
/*   */     //   #5	-> 48
/*   */     //   #6	-> 53
/*   */     //   #7	-> 86
/*   */     //   #8	-> 90
/*   */     //   #9	-> 120
/*   */     //   #10	-> 126
/*   */     //   #11	-> 149
/*   */     //   #12	-> 156
/*   */     //   #13	-> 167
/*   */     //   #14	-> 179
/*   */     //   #15	-> 205
/*   */     //   #16	-> 210
/*   */     //   #17	-> 215
/*   */     //   #18	-> 231
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/NZ.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */