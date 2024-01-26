/* 1 */ package f;public class K30 implements L0 { public void b7() { int i; if ((i = this.prn) == 3) { for (i = 0; i < this.E2; ) { OQ oQ; this(i); this.eL0[i] = oQ; i++; }  } else if (i == 1) { for (i = 0; i < this.O1.ne0; )
/* 2 */       { Cz cz; this(i); this.eL0[i] = cz; i++; }  while (i < this.E2) { vz vz; this(i); this.eL0[i] = vz; i++; }  } else { for (i = 0; i < this.E2; ) { Cz cz; this(i); this.eL0[i] = cz; i++; }
/*   */        }
/*   */      }
/*   */ 
/*   */   
/*   */   public static final float[] dr0 = new float[] { 
/*   */       2.0F, 1.587401F, 1.2599211F, 1.0F, 0.7937005F, 0.62996054F, 0.5F, 0.39685026F, 0.31498027F, 0.25F, 
/*   */       0.19842513F, 0.15749013F, 0.125F, 0.099212565F, 0.07874507F, 0.0625F, 0.049606282F, 0.039372534F, 0.03125F, 0.024803141F, 
/*   */       0.019686267F, 0.015625F, 0.012401571F, 0.009843133F, 0.0078125F, 0.0062007853F, 0.0049215667F, 0.00390625F, 0.0031003926F, 0.0024607833F, 
/*   */       0.001953125F, 0.0015501963F, 0.0012303917F, 9.765625E-4F, 7.7509816E-4F, 6.1519584E-4F, 4.8828125E-4F, 3.8754908E-4F, 3.0759792E-4F, 2.4414062E-4F, 
/*   */       1.9377454E-4F, 1.5379896E-4F, 1.2207031E-4F, 9.688727E-5F, 7.689948E-5F, 6.1035156E-5F, 4.8443635E-5F, 3.844974E-5F, 3.0517578E-5F, 2.4221818E-5F, 
/*   */       1.922487E-5F, 1.5258789E-5F, 1.2110909E-5F, 9.612435E-6F, 7.6293945E-6F, 6.0554544E-6F, 4.8062175E-6F, 3.8146973E-6F, 3.0277272E-6F, 2.4031087E-6F, 
/*   */       1.9073486E-6F, 1.5138636E-6F, 1.2015544E-6F, 0.0F };
/*   */   public AH0 XI0;
/*   */   public Ym0 O1;
/*   */   public Va dp0;
/*   */   public Va s20;
/*   */   public qR o5;
/*   */   public int EM;
/*   */   public int prn;
/*   */   public int E2;
/*   */   public g4[] eL0;
/*   */   public ls0 Al0;
/*   */   
/*   */   public K30() {
/*   */     ls0 ls01;
/*   */     this();
/*   */     this.Al0 = this;
/*   */   }
/*   */   
/*   */   public final void t80() {
/*   */     // Byte code:
/*   */     //   0: aload_0
/*   */     //   1: dup
/*   */     //   2: dup
/*   */     //   3: dup2
/*   */     //   4: getfield O1 : Lf/Ym0;
/*   */     //   7: dup
/*   */     //   8: astore_1
/*   */     //   9: getfield hh : I
/*   */     //   12: putfield E2 : I
/*   */     //   15: bipush #32
/*   */     //   17: anewarray f/g4
/*   */     //   20: putfield eL0 : [Lf/g4;
/*   */     //   23: aload_1
/*   */     //   24: getfield kb0 : I
/*   */     //   27: putfield prn : I
/*   */     //   30: invokevirtual b7 : ()V
/*   */     //   33: iconst_0
/*   */     //   34: istore_1
/*   */     //   35: iload_1
/*   */     //   36: aload_0
/*   */     //   37: getfield E2 : I
/*   */     //   40: if_icmpge -> 78
/*   */     //   43: aload_0
/*   */     //   44: getfield eL0 : [Lf/g4;
/*   */     //   47: iload_1
/*   */     //   48: aaload
/*   */     //   49: aload_0
/*   */     //   50: dup
/*   */     //   51: dup
/*   */     //   52: getfield XI0 : Lf/AH0;
/*   */     //   55: astore_2
/*   */     //   56: getfield O1 : Lf/Ym0;
/*   */     //   59: astore_3
/*   */     //   60: getfield Al0 : Lf/ls0;
/*   */     //   63: astore #4
/*   */     //   65: aload_2
/*   */     //   66: aload_3
/*   */     //   67: aload #4
/*   */     //   69: invokevirtual rH : (Lf/AH0;Lf/Ym0;Lf/ls0;)V
/*   */     //   72: iinc #1, 1
/*   */     //   75: goto -> 35
/*   */     //   78: aload_0
/*   */     //   79: dup
/*   */     //   80: invokevirtual RU : ()V
/*   */     //   83: getfield Al0 : Lf/ls0;
/*   */     //   86: ifnonnull -> 126
/*   */     //   89: aload_0
/*   */     //   90: getfield O1 : Lf/Ym0;
/*   */     //   93: dup
/*   */     //   94: astore_1
/*   */     //   95: getfield U30 : S
/*   */     //   98: aload_1
/*   */     //   99: getfield vw0 : Lf/ls0;
/*   */     //   102: dup
/*   */     //   103: getfield uM : S
/*   */     //   106: istore_1
/*   */     //   107: iconst_m1
/*   */     //   108: putfield uM : S
/*   */     //   111: iload_1
/*   */     //   112: if_icmpne -> 120
/*   */     //   115: iconst_1
/*   */     //   116: istore_1
/*   */     //   117: goto -> 122
/*   */     //   120: iconst_0
/*   */     //   121: istore_1
/*   */     //   122: iload_1
/*   */     //   123: ifeq -> 300
/*   */     //   126: iconst_0
/*   */     //   127: istore_1
/*   */     //   128: iload_1
/*   */     //   129: aload_0
/*   */     //   130: getfield E2 : I
/*   */     //   133: if_icmpge -> 162
/*   */     //   136: aload_0
/*   */     //   137: getfield eL0 : [Lf/g4;
/*   */     //   140: iload_1
/*   */     //   141: aaload
/*   */     //   142: aload_0
/*   */     //   143: dup
/*   */     //   144: getfield XI0 : Lf/AH0;
/*   */     //   147: astore_2
/*   */     //   148: getfield O1 : Lf/Ym0;
/*   */     //   151: aload_2
/*   */     //   152: swap
/*   */     //   153: invokevirtual ai0 : (Lf/AH0;Lf/Ym0;)V
/*   */     //   156: iinc #1, 1
/*   */     //   159: goto -> 128
/*   */     //   162: aload_0
/*   */     //   163: iconst_0
/*   */     //   164: istore_1
/*   */     //   165: iconst_0
/*   */     //   166: istore_2
/*   */     //   167: getfield O1 : Lf/Ym0;
/*   */     //   170: getfield kb0 : I
/*   */     //   173: istore_3
/*   */     //   174: iconst_0
/*   */     //   175: istore #4
/*   */     //   177: iload #4
/*   */     //   179: aload_0
/*   */     //   180: getfield E2 : I
/*   */     //   183: if_icmpge -> 207
/*   */     //   186: aload_0
/*   */     //   187: getfield eL0 : [Lf/g4;
/*   */     //   190: iload #4
/*   */     //   192: aaload
/*   */     //   193: aload_0
/*   */     //   194: getfield XI0 : Lf/AH0;
/*   */     //   197: invokevirtual Pg0 : (Lf/AH0;)Z
/*   */     //   200: istore_1
/*   */     //   201: iinc #4, 1
/*   */     //   204: goto -> 177
/*   */     //   207: iconst_0
/*   */     //   208: istore #4
/*   */     //   210: iload #4
/*   */     //   212: aload_0
/*   */     //   213: getfield E2 : I
/*   */     //   216: if_icmpge -> 258
/*   */     //   219: aload_0
/*   */     //   220: getfield eL0 : [Lf/g4;
/*   */     //   223: iload #4
/*   */     //   225: aaload
/*   */     //   226: aload_0
/*   */     //   227: dup
/*   */     //   228: dup
/*   */     //   229: getfield EM : I
/*   */     //   232: istore_2
/*   */     //   233: getfield dp0 : Lf/Va;
/*   */     //   236: astore #5
/*   */     //   238: getfield s20 : Lf/Va;
/*   */     //   241: astore #6
/*   */     //   243: iload_2
/*   */     //   244: aload #5
/*   */     //   246: aload #6
/*   */     //   248: invokevirtual cOM7 : (ILf/Va;Lf/Va;)Z
/*   */     //   251: istore_2
/*   */     //   252: iinc #4, 1
/*   */     //   255: goto -> 210
/*   */     //   258: aload_0
/*   */     //   259: dup
/*   */     //   260: getfield dp0 : Lf/Va;
/*   */     //   263: aload_0
/*   */     //   264: getfield o5 : Lf/qR;
/*   */     //   267: invokevirtual yv0 : (Lf/qR;)V
/*   */     //   270: getfield EM : I
/*   */     //   273: ifne -> 292
/*   */     //   276: iload_3
/*   */     //   277: iconst_3
/*   */     //   278: if_icmpeq -> 292
/*   */     //   281: aload_0
/*   */     //   282: getfield s20 : Lf/Va;
/*   */     //   285: aload_0
/*   */     //   286: getfield o5 : Lf/qR;
/*   */     //   289: invokevirtual yv0 : (Lf/qR;)V
/*   */     //   292: iload_2
/*   */     //   293: ifeq -> 207
/*   */     //   296: iload_1
/*   */     //   297: ifeq -> 174
/*   */     //   300: return
/*   */     // Line number table:
/*   */     //   Java source line number -> byte code offset
/*   */     //   #1	-> 9
/*   */     //   #2	-> 12
/*   */     //   #3	-> 24
/*   */     //   #4	-> 27
/*   */     //   #5	-> 37
/*   */     //   #6	-> 80
/*   */     //   #7	-> 95
/*   */     //   #8	-> 99
/*   */     //   #9	-> 103
/*   */     //   #10	-> 108
/*   */     //   #11	-> 130
/*   */     //   #12	-> 167
/*   */     //   #13	-> 170
/*   */     //   #14	-> 180
/*   */   }
/*   */   
/*   */   public void RU() {} }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/K30.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */