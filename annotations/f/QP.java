/*  1 */ package f;public final class QP extends JG0 implements r60 { public final js Yw; public final Ip lo0; public final boolean qk0; public final void LM(throws paramthrows) { VA0.c90(nx()); }
/*  2 */   public ArrayList Lg0; public int l60; public QP(js paramjs) { Un un1; Un un2; Un un3; Un un4; Un un5; Un un6; this.Lg0 = new ArrayList(); this.l60 = 0; this.Yw = paramjs; this(); this.lo0 = ip; this.qk0 = false; Xu("gamemenugui"); Ip ip; (ip = new Ip()).Xu("game-menu-panel"); this(Ml0.OH0(1110)); (new Un()).tW(new bM(this)); this(Ml0.OH0(1111)); (new Un()).tW(new Qa(this, paramjs)); this(Ml0.OH0(1112)); (new Un()).tW(new n1(this, paramjs)); this(Ml0.OH0(1159)); (new Un()).tW(new J1(this)); this(Ml0.OH0(1124)); (new Un()).tW(new YA(this)); this(Ml0.OH0(1114)); (new Un()).tW(new mN(this)); cr0 cr0 = (new Ip()).d7(); cr0.Ya(un2); g0.Ya(un2); this.Lg0.add(un2); cr0.Ya(un3); g0 g0; (g0 = (new Ip()).mE0()).Ya(un3); this.Lg0.add(un3); R8 r8; if ((r8 = km.u4) != null && r8.dm0() == 5) { cr0.Ya(un4); g0.Ya(un4); this.Lg0.add(un4); cr0.Ya(un5); g0.Ya(un5); this.Lg0.add(un5); cr0.Ya(un1); g0.Ya(un1); this.Lg0.add(un1); }  cr0.Ya(un6); cr0.Em0(); g0.Ya(un6); this.Lg0.add(un6); ip.WN(cr0); ip.rK0(g0); J8(ip); } public final boolean i2(oa0 paramoa0) { if (B8.Wm0(paramoa0.cz0) && paramoa0
/*  3 */       .oO()) {
/*    */       int i;
/*  5 */       if (h1.J20(i = paramoa0.GG0, BM.ni)) { this.l60--;
/*  6 */         VA0.c90(nx()); return true; }
/*  7 */        if (h1.J20(i, BM.N70)) { this.l60++;
/*  8 */         VA0.c90(nx()); return true; }
/*  9 */        if (h1.J20(i, BM.bC)) {
/*    */ 
/*    */         
/* 12 */         hm.Fz0((nx()).TG0.oh0); return true;
/* 13 */       }  if (h1.J20(i, BM.lc))
/* 14 */       { if ((this = this.Yw.GC0) != null)
/* 15 */           ra0();  return true; } 
/* 16 */     }  return super.i2(paramoa0); }
/*    */ 
/*    */   
/*    */   public final void d40() {
/*    */     // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield fr0 : Lf/JG0;
/*    */     //   4: ifnonnull -> 8
/*    */     //   7: return
/*    */     //   8: aload_0
/*    */     //   9: dup
/*    */     //   10: getfield lo0 : Lf/Ip;
/*    */     //   13: invokevirtual mM : ()V
/*    */     //   16: getfield qk0 : Z
/*    */     //   19: ifeq -> 65
/*    */     //   22: aload_0
/*    */     //   23: dup
/*    */     //   24: dup
/*    */     //   25: getfield lo0 : Lf/Ip;
/*    */     //   28: astore_1
/*    */     //   29: getfield fr0 : Lf/JG0;
/*    */     //   32: invokevirtual Xq : ()I
/*    */     //   35: aload_0
/*    */     //   36: getfield lo0 : Lf/Ip;
/*    */     //   39: getfield xY : I
/*    */     //   42: isub
/*    */     //   43: istore_2
/*    */     //   44: getfield fr0 : Lf/JG0;
/*    */     //   47: invokevirtual yR : ()I
/*    */     //   50: aload_0
/*    */     //   51: getfield lo0 : Lf/Ip;
/*    */     //   54: getfield HC : I
/*    */     //   57: isub
/*    */     //   58: bipush #40
/*    */     //   60: isub
/*    */     //   61: istore_0
/*    */     //   62: goto -> 125
/*    */     //   65: aload_0
/*    */     //   66: dup
/*    */     //   67: dup
/*    */     //   68: dup2
/*    */     //   69: getfield lo0 : Lf/Ip;
/*    */     //   72: astore_1
/*    */     //   73: getfield fr0 : Lf/JG0;
/*    */     //   76: invokevirtual RS : ()I
/*    */     //   79: istore_2
/*    */     //   80: getfield fr0 : Lf/JG0;
/*    */     //   83: invokevirtual qF : ()I
/*    */     //   86: aload_0
/*    */     //   87: getfield lo0 : Lf/Ip;
/*    */     //   90: getfield xY : I
/*    */     //   93: iconst_2
/*    */     //   94: iload_2
/*    */     //   95: invokestatic Se0 : (IIII)I
/*    */     //   98: istore_2
/*    */     //   99: getfield fr0 : Lf/JG0;
/*    */     //   102: invokevirtual e3 : ()I
/*    */     //   105: istore_3
/*    */     //   106: getfield fr0 : Lf/JG0;
/*    */     //   109: invokevirtual Hy : ()I
/*    */     //   112: aload_0
/*    */     //   113: getfield lo0 : Lf/Ip;
/*    */     //   116: getfield HC : I
/*    */     //   119: iconst_2
/*    */     //   120: iload_3
/*    */     //   121: invokestatic Se0 : (IIII)I
/*    */     //   124: istore_0
/*    */     //   125: aload_1
/*    */     //   126: iload_2
/*    */     //   127: iload_0
/*    */     //   128: invokevirtual ME : (II)Z
/*    */     //   131: pop
/*    */     //   132: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #1	-> 1
/*    */     //   #2	-> 10
/*    */     //   #3	-> 29
/*    */     //   #4	-> 32
/*    */     //   #5	-> 39
/*    */     //   #6	-> 44
/*    */     //   #7	-> 47
/*    */     //   #8	-> 54
/*    */     //   #9	-> 69
/*    */     //   #10	-> 73
/*    */     //   #11	-> 76
/*    */     //   #12	-> 80
/*    */     //   #13	-> 83
/*    */     //   #14	-> 90
/*    */     //   #15	-> 95
/*    */     //   #16	-> 99
/*    */     //   #17	-> 102
/*    */     //   #18	-> 106
/*    */     //   #19	-> 109
/*    */     //   #20	-> 116
/*    */     //   #21	-> 121
/*    */     //   #22	-> 128
/*    */   }
/*    */   
/*    */   public final Un nx() {
/*    */     if (this.l60 < 0)
/*    */       this.l60 = 0; 
/*    */     if (this.l60 >= this.Lg0.size())
/*    */       this.l60 = this.Lg0.size() - 1; 
/*    */     return this.Lg0.get(this.l60);
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/QP.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */