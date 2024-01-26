/*  1 */ package f;public final class TE0 extends df { public final void sM() { final final1; byte b = this.Ws.get(); ak ak;
/*  2 */     if ((ak = final.tB)
/*  3 */       .db0(b))
/*  4 */     { final1 = (final)ak.Ha0(b); } else { final1 = final.Qx0; }  this
/*  5 */       .hl = final1; if (final1 == final.st0) { this
/*    */         
/*  7 */         .rp0 = this.Ws.getInt(); this.lPt9 = ee0(R00());
/*    */       
/*  9 */       this.Lr0 = this.Ws.get(); this.yc = ee0(R00()); this.ST = au(); byte b1;
/*    */       U50[] arrayOfU50;
/* 11 */       for (this.qv0 = this.Ws.getInt(), this.As0 = new U50[R00()], b1 = 0; b1 < (arrayOfU50 = this.As0).length; ) { arrayOfU50[b1] = eD(); b1++; }
/*    */        }
/*    */      }
/*    */ 
/*    */   
/*    */   public final hl;
/*    */   public int rp0;
/*    */   public byte[] lPt9;
/*    */   public byte Lr0 = 0;
/*    */   public byte[] yc = null;
/*    */   public String ST;
/*    */   public int qv0;
/*    */   public U50[] As0;
/*    */   
/*    */   public TE0(x6 paramx6, ByteBuffer paramByteBuffer) {
/*    */     super(paramByteBuffer, paramx6, 3);
/*    */   }
/*    */   
/*    */   public final void jZ() {
/*    */     if (this.hl == final.st0)
/*    */       ((x6)this.d).Ig = 4; 
/*    */   }
/*    */   
/*    */   public final void Cx() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield d : Lf/LPt3;
/*    */     //   4: checkcast f/x6
/*    */     //   7: getfield E50 : Lf/hb0;
/*    */     //   10: aload_0
/*    */     //   11: getfield Lr0 : B
/*    */     //   14: istore_1
/*    */     //   15: getfield N30 : [Lf/P10;
/*    */     //   18: dup
/*    */     //   19: astore_2
/*    */     //   20: arraylength
/*    */     //   21: istore_3
/*    */     //   22: iconst_0
/*    */     //   23: istore #4
/*    */     //   25: iload #4
/*    */     //   27: iload_3
/*    */     //   28: if_icmpge -> 54
/*    */     //   31: aload_2
/*    */     //   32: iload #4
/*    */     //   34: aaload
/*    */     //   35: dup
/*    */     //   36: astore #5
/*    */     //   38: getfield FJ0 : B
/*    */     //   41: iload_1
/*    */     //   42: if_icmpne -> 48
/*    */     //   45: goto -> 57
/*    */     //   48: iinc #4, 1
/*    */     //   51: goto -> 25
/*    */     //   54: aconst_null
/*    */     //   55: astore #5
/*    */     //   57: aload_0
/*    */     //   58: getfield yc : [B
/*    */     //   61: dup
/*    */     //   62: astore_1
/*    */     //   63: ifnull -> 99
/*    */     //   66: aload #5
/*    */     //   68: aload_0
/*    */     //   69: aload #5
/*    */     //   71: aload_0
/*    */     //   72: aload #5
/*    */     //   74: aload_0
/*    */     //   75: aload #5
/*    */     //   77: aload_1
/*    */     //   78: putfield m7 : [B
/*    */     //   81: getfield ST : Ljava/lang/String;
/*    */     //   84: putfield aB0 : Ljava/lang/String;
/*    */     //   87: getfield qv0 : I
/*    */     //   90: putfield Kj0 : I
/*    */     //   93: getfield As0 : [Lf/U50;
/*    */     //   96: putfield Yy0 : [Lf/U50;
/*    */     //   99: aload_0
/*    */     //   100: getfield d : Lf/LPt3;
/*    */     //   103: checkcast f/x6
/*    */     //   106: getfield E50 : Lf/hb0;
/*    */     //   109: dup
/*    */     //   110: dup
/*    */     //   111: dup2
/*    */     //   112: astore_1
/*    */     //   113: aload_0
/*    */     //   114: dup
/*    */     //   115: dup
/*    */     //   116: getfield hl : Lf/final;
/*    */     //   119: astore_0
/*    */     //   120: getfield rp0 : I
/*    */     //   123: istore_2
/*    */     //   124: getfield lPt9 : [B
/*    */     //   127: astore_3
/*    */     //   128: aload_0
/*    */     //   129: putfield G9 : Lf/final;
/*    */     //   132: iload_2
/*    */     //   133: putfield Ge : I
/*    */     //   136: aload_3
/*    */     //   137: putfield Sj : [B
/*    */     //   140: getfield qf0 : I
/*    */     //   143: bipush #11
/*    */     //   145: if_icmpne -> 174
/*    */     //   148: aload_0
/*    */     //   149: getstatic f/final.st0 : Lf/final;
/*    */     //   152: if_acmpne -> 168
/*    */     //   155: aload_1
/*    */     //   156: dup
/*    */     //   157: bipush #12
/*    */     //   159: putfield qf0 : I
/*    */     //   162: invokevirtual ni0 : ()V
/*    */     //   165: goto -> 174
/*    */     //   168: aload_1
/*    */     //   169: bipush #13
/*    */     //   171: putfield qf0 : I
/*    */     //   174: aload_1
/*    */     //   175: getfield qf0 : I
/*    */     //   178: dup
/*    */     //   179: istore_2
/*    */     //   180: bipush #12
/*    */     //   182: if_icmpeq -> 191
/*    */     //   185: iload_2
/*    */     //   186: bipush #14
/*    */     //   188: if_icmpne -> 204
/*    */     //   191: aload_0
/*    */     //   192: getstatic f/final.st0 : Lf/final;
/*    */     //   195: if_acmpeq -> 204
/*    */     //   198: aload_1
/*    */     //   199: bipush #13
/*    */     //   201: putfield qf0 : I
/*    */     //   204: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 4
/*    */     //   #3	-> 7
/*    */     //   #4	-> 11
/*    */     //   #5	-> 15
/*    */     //   #6	-> 20
/*    */     //   #7	-> 38
/*    */     //   #8	-> 58
/*    */     //   #9	-> 78
/*    */     //   #10	-> 81
/*    */     //   #11	-> 84
/*    */     //   #12	-> 87
/*    */     //   #13	-> 90
/*    */     //   #14	-> 93
/*    */     //   #15	-> 96
/*    */     //   #16	-> 100
/*    */     //   #17	-> 103
/*    */     //   #18	-> 106
/*    */     //   #19	-> 116
/*    */     //   #20	-> 129
/*    */     //   #21	-> 133
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/TE0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */