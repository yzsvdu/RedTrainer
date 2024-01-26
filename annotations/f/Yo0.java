/*  1 */ package f;public class Yo0 implements iq0 { public ig JB0; public lpt1 zt0; public lpt1 eA0; public lpt1 C70; public lpt1 mx0; public lpt1 Nh0; public lpt1[] mA0; public vn de0; public Ui0[][] Uf; public Ui0[] YH; public Ui0[] qa; public Texture Q0; public Texture ED; public fQ fe0; public Yo0(Wo paramWo) { this.Uf = new Ui0[3][]; this.fe0 = new fQ(); this.JB0 = new ig(paramWo.Vz().B8("/a/2/0/5")); eI eI2 = eI.Lj(); int[] arrayOfInt2; (arrayOfInt2 = new int[4])[0] = 35; (new int[4])[1] = -1; (new int[4])[2] = -1; (new int[4])[3] = -1; eI2.getClass(); this.eA0 = eI.L4(this.JB0, 34, arrayOfInt2); eI eI1 = eI.Lj(); int[] arrayOfInt1; (arrayOfInt1 = new int[4])[0] = 39; (new int[4])[1] = -1; (new int[4])[2] = -1; (new int[4])[3] = 38; eI1.getClass(); this.mx0 = eI.L4(this.JB0, 37, arrayOfInt1); ByteBuffer byteBuffer; int i = (byteBuffer = this.JB0.Em0(33).l2()).getInt(); int j; if ((j = this.JB0.Em0(33).l2().getInt()) == 65792) { j = 24; } else if (j == 65793) { j = 36; } else if (j == 65536) { j = 12; }
/*    */     else
/*  3 */     { throw new RuntimeException(); }  if (byteBuffer.remaining() == i * j) { Texture texture; vJ vJ; ek0 ek0; byte b; for (this.de0 = new vn(this.JB0.Em0(36)), b = 0; b < 3; ) { this.Uf[b] = BO(b * 2, b * 2 + 1, b + 12); b++; }  for (this.YH = new Ui0[4], this.qa = new Ui0[4], b = 0; b < this.YH.length; ) { vJ vJ1; Ui0 ui01; ek0 ek01; FM fM1; Ui0 ui02; this(this.JB0.Em0(b + 7)); this(this.JB0.Em0(16)); this(this.JB0.Em0(19)); this(this.JB0.Em0(20)); ZH zH1 = fM1.VC0(vJ1, ek01); this(new Texture(zH1)); this.YH[b] = ui02; this(new Texture(zH2)); this.qa[b] = ui01; this.fe0.Com3(this.YH[b].rP()); this.fe0.Com3(this.qa[b].rP()); zH1.dispose(); ZH zH2; FM fM2; (zH2 = (fM2 = new FM()).VC0(vJ1, ek01)).dispose(); b++; }  this(this.JB0.Em0(11)); this(this.JB0.Em0(17)); this(zH); this.Q0 = new Texture(); this.fe0.Com3(this); ZH zH; (zH = (new LD(this.JB0.Em0(24))).Ld0(ek0, vJ, 0)).dispose(); return; }  throw new RuntimeException(); } public Ui0[] BO(int paramInt1, int paramInt2, int paramInt3) { byte b = 21; this(this.JB0.zz(paramInt1)); Ui0 ui0; vJ vJ1; ek0 ek0; vJ vJ2;
/*  4 */     this(this.JB0.zz(paramInt2));
/*    */     
/*  6 */     this(this.JB0.zz(paramInt3), false);
/*    */ 
/*    */     
/*  9 */     this(this.JB0.zz(b), false);
/* 10 */     ZH zH2 = lD.Tx0(ek0, vJ2, 0, 96, 96, 0); LD lD; ZH zH1 = (lD = new LD()).Tx0(ek0, vJ1, 0, 96, 96, 0);
/* 11 */     this(new Texture(zH2)); arrayOfUi0[0] = this; this(new Texture(zH1)); arrayOfUi0[1] = this; this.fe0
/*    */       
/* 13 */       .Com3((arrayOfUi0[0]).G3); this.fe0
/*    */       
/* 15 */       .Com3((arrayOfUi0[1]).G3); zH2.dispose(); zH1.dispose();
/*    */     Ui0[] arrayOfUi0;
/*    */     return arrayOfUi0 = new Ui0[2]; }
/*    */ 
/*    */   
/*    */   public Yo0(gD paramgD) {
/*    */     vJ vJ2;
/*    */     vJ vJ1;
/*    */     ek0 ek0;
/*    */     this.Uf = new Ui0[3][];
/*    */     this.fe0 = new fQ();
/*    */     this.JB0 = new ig(paramgD.Vz().B8("/graphic/ev_pokeselect.narc"));
/*    */     eI eI3 = eI.Lj();
/*    */     int[] arrayOfInt3;
/*    */     (arrayOfInt3 = new int[1])[0] = 0;
/*    */     eI3.getClass();
/*    */     this.zt0 = eI.L4(this.JB0, 1, arrayOfInt3);
/*    */     eI eI2 = eI.Lj();
/*    */     int[] arrayOfInt2 = new int[0];
/*    */     eI2.getClass();
/*    */     this.eA0 = eI.L4(this.JB0, 8, arrayOfInt2);
/*    */     eI eI1 = eI.Lj();
/*    */     int[] arrayOfInt1 = new int[0];
/*    */     eI1.getClass();
/*    */     this.C70 = eI.L4(this.JB0, 9, arrayOfInt1);
/*    */     this.mA0 = new lpt1[3];
/*    */     for (byte b = 0; b < 3; b++) {
/*    */       eI eI = eI.Lj();
/*    */       int i;
/*    */       int j = (i = b * 2) + 3;
/*    */       int[] arrayOfInt;
/*    */       (arrayOfInt = new int[1])[0] = i + 2;
/*    */       eI.getClass();
/*    */       this.mA0[b] = eI.L4(this.JB0, j, arrayOfInt);
/*    */     } 
/*    */     this(this.JB0.Em0(11));
/*    */     this(this.JB0.Em0(10));
/*    */     this.Q0 = new Texture(zH2);
/*    */     ZH zH2;
/*    */     (zH2 = (new LD(this.JB0.Em0(12))).Ld0(ek0, vJ2, 0)).dispose();
/*    */     this.fe0.Com3(this.Q0);
/*    */     this(this.JB0.Em0(15));
/*    */     this.ED = new Texture(zH1);
/*    */     ZH zH1;
/*    */     (zH1 = (new ek0(this.JB0.Em0(14))).H4(vJ1)).dispose();
/*    */     this.fe0.Com3(this.ED);
/*    */   }
/*    */   
/*    */   public Yo0(BE paramBE) {
/*    */     this.Uf = new Ui0[3][];
/*    */     this.fe0 = new fQ();
/*    */     this.JB0 = new ig(paramBE.Vz().B8("/a/0/8/2"));
/*    */     eI eI4 = eI.Lj();
/*    */     int[] arrayOfInt4 = new int[0];
/*    */     getClass();
/*    */     this.zt0 = eI.L4(this.JB0, 0, this);
/*    */     eI eI3 = eI.Lj();
/*    */     int[] arrayOfInt3;
/*    */     (arrayOfInt3 = new int[1])[0] = 7;
/*    */     getClass();
/*    */     this.eA0 = eI.L4(this.JB0, 1, this);
/*    */     eI eI2 = eI.Lj();
/*    */     int[] arrayOfInt2;
/*    */     (arrayOfInt2 = new int[2])[0] = 6;
/*    */     (new int[2])[1] = 5;
/*    */     getClass();
/*    */     this.mx0 = eI.L4(this.JB0, 2, this);
/*    */     eI eI1 = eI.Lj();
/*    */     int[] arrayOfInt1;
/*    */     (arrayOfInt1 = new int[1])[0] = 4;
/*    */     getClass();
/*    */     this.Nh0 = eI.L4(this.JB0, 3, this);
/*    */   }
/*    */   
/*    */   public final void dispose() {
/*    */     Hc0 hc0 = this.fe0.r30();
/*    */     while (hc0.hasNext())
/*    */       ((iq0)hc0.next()).dispose(); 
/*    */     lpt1 lpt11;
/*    */     if ((lpt11 = this.zt0) != null)
/*    */       lpt11.Ea0(); 
/*    */     if ((lpt11 = this.eA0) != null)
/*    */       lpt11.Ea0(); 
/*    */     if ((lpt11 = this.C70) != null)
/*    */       lpt11.Ea0(); 
/*    */     if ((lpt11 = this.mx0) != null)
/*    */       lpt11.Ea0(); 
/*    */     if ((lpt11 = this.Nh0) != null)
/*    */       lpt11.Ea0(); 
/*    */     lpt1[] arrayOfLpt1;
/*    */     if ((arrayOfLpt1 = this.mA0) != null) {
/*    */       byte b = 0;
/*    */       int i = arrayOfLpt1.length;
/*    */       while (b < i) {
/*    */         this.mA0[b].Ea0();
/*    */         b++;
/*    */       } 
/*    */     } 
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Yo0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */