/* 1 */ package f;public final class gp0 extends Ip { public final void LM(throws paramthrows) { this.k1 = false;
/* 2 */     VA0.c90(this.J6[this.Tc]); }
/*   */ 
/*   */   
/*   */   public Un Vz0;
/*   */   public mc[] J6;
/*   */   public int Tc;
/*   */   
/*   */   public gp0(j40 paramj40, short paramShort, Runnable paramRunnable) {
/*   */     dQ dQ;
/*   */     WD wD;
/*   */     this.Tc = 0;
/*   */     this(Ml0.Qf0(F40.ef0, 157, 39));
/*   */     this.J6 = new mc[5];
/*   */     byte b1;
/*   */     mc[] arrayOfMc2;
/*   */     for (b1 = 0; b1 < (arrayOfMc2 = this.J6).length; b1 = (byte)(b1 + 1)) {
/*   */       mc mc1;
/*   */       this("", "");
/*   */       arrayOfMc2[b1] = mc1;
/*   */       this.J6[b1].C70(et.COM2);
/*   */     } 
/*   */     b1 = 0;
/*   */     byte b2;
/*   */     mc[] arrayOfMc3;
/*   */     for (b2 = 0; b2 < (arrayOfMc3 = this.J6).length; b2 = (byte)(b2 + 1)) {
/*   */       short s;
/*   */       if (b2 == 4) {
/*   */         s = paramShort;
/*   */       } else {
/*   */         s = paramj40.eC().Fp0(b2);
/*   */       } 
/*   */       if (s == 0) {
/*   */         this.J6[b2].s6("-");
/*   */         this.J6[b2].Ep0("");
/*   */         this.J6[b2].sk0(false);
/*   */         this.J6[b2].CW().H();
/*   */         this.J6[b2].Gq0(null);
/*   */         this.J6[b2].eQ();
/*   */         if (b1 == 0) {
/*   */           b1 = 1;
/*   */           this.J6[b2].sk0(true);
/*   */         } 
/*   */       } else {
/*   */         this.J6[b2].sk0(true);
/*   */         wD = yk0.cw().mP(s);
/*   */         this.J6[b2].Gq0(w50.Ii0(wD, paramj40));
/*   */         this.J6[b2].Ep0(rG0.oV(wD));
/*   */         this.J6[b2].eQ();
/*   */         this.J6[b2].CW().Pn(new pe0[] { interface.ZZ().xk0(wD.Fn(paramj40.eC()).oI()) });
/*   */         this.J6[b2].CW().zT(153, 10);
/*   */         this.J6[b2].s6(wD.cW());
/*   */         this.J6[b2].eQ();
/*   */       } 
/*   */       if (this.J6[b2].Ws())
/*   */         this.J6[b2].tW(() -> {
/*   */               this.Tc = paramByte;
/*   */               paramRunnable.run();
/*   */               ra0();
/*   */             }); 
/*   */     } 
/*   */     wD[4].sk0(false);
/*   */     (this.Vz0 = new Un(Ml0.OH0(53))).Xu("rbattle");
/*   */     this.Vz0.tW(this::ra0);
/*   */     arrayOfJG0[0] = this.J6[0];
/*   */     JG0[] arrayOfJG0;
/*   */     (arrayOfJG0 = new JG0[2])[1] = this.J6[1];
/*   */     arrayOfU90[0] = mE0().Mg(new JG0[2]);
/*   */     arrayOfJG0[0] = this.J6[2];
/*   */     (arrayOfJG0 = new JG0[2])[1] = this.J6[3];
/*   */     arrayOfU90[1] = mE0().Mg(new JG0[2]);
/*   */     arrayOfU90[2] = mE0().Mg(new JG0[] { this.J6[4], dQ });
/*   */     U90[] arrayOfU90;
/*   */     (arrayOfU90 = new U90[4])[3] = AUX(new JG0[] { this.Vz0 });
/*   */     WN(d7().cOM8(new U90[4]).Aq(240));
/*   */     arrayOfJG0[0] = arrayOfMc1[0];
/*   */     arrayOfJG0[1] = arrayOfMc1[2];
/*   */     mc[] arrayOfMc1;
/*   */     (arrayOfJG0 = new JG0[3])[2] = (arrayOfMc1 = this.J6)[4];
/*   */     (new U90[2])[0] = mE0().Mg(new JG0[3]);
/*   */     arrayOfJG0[0] = this.J6[1];
/*   */     (arrayOfJG0 = new JG0[2])[1] = this.J6[3];
/*   */     rK0(d7().Aq(80).cOM8(new U90[] { null, mE0().Mg(new JG0[2]).ee0(vo0(new JG0[] { dQ, this.Vz0 })) }).Aq(80));
/*   */   }
/*   */   
/*   */   public final void d40() {
/*   */     mc[] arrayOfMc;
/*   */     for (byte b = 0; b < (arrayOfMc = this.J6).length; b++) {
/*   */       arrayOfMc[b].uh0(210, 48);
/*   */       this.J6[b].Tm(210, 48);
/*   */       this.J6[b].RI(210, 48);
/*   */     } 
/*   */     this.Vz0.mM();
/*   */     this.Vz0.Tm(50, 20);
/*   */     mM();
/*   */     super.d40();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/gp0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */