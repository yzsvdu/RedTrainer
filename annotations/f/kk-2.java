/*  1 */ package f;public final class kk extends Kl0 { public DK[] KS; public int Gu; public Pr0 bz; public CC0 M2 = null; public int mC; public kk(c4 paramc4, ByteBuffer paramByteBuffer) { super(paramc4, paramByteBuffer); } public final void sM() { byte b; if ((b = this.Ws.get()) < 0) { this
/*  2 */         .KS = new DK[0];
/*    */       
/*  4 */       this.Gu = this.Ws.getInt(); } else { byte b1; for (this.KS = new DK[b], b1 = 0; b1 < b; ) { this.KS[b1] = 
/*    */           
/*  6 */           DK.com4(this.Ws.get()); b1++; }  }  this
/*    */       
/*  8 */       .mC = this.Ws.getInt();
/*    */     
/* 10 */     if ((this
/* 11 */       .bz = (Pr0)Pr0.ew0.Ha0(this.Ws.get())) == Pr0.a2) this
/*    */         
/* 13 */         .M2 = CC0.Jo0(this.Ws.get());  } public final void Cx() { if ((this.KS == null && this.Gu < 1) || this.bz == null) return;  ro ro = r8(); DK[] arrayOfDK = this.KS; int j = this.Gu; CC0 cC0 = this.M2; int i = this.mC; R8 r8; (r8 = (R8)ro).getClass(); Pr0 pr01, pr02; if ((pr01 = this.bz) != (pr02 = Pr0.Cj)) if (this != null) { r8.Pq(Ml0.sB(pr01.pj0, new String[] { Ml0.OH0(this.a10), Integer.toString(i) })); } else { r8.Pq(Ml0.Go(pr01.pj0, Integer.toString(i))); }   ve ve; if ((ve = r8.YG0.MH0.yq0) != null) { Iterator iterator; this.gp = false; if (pr01 == pr02) { if (!this.aF) { Df[] arrayOfDf; int k; byte b; for (k = (arrayOfDf = this.Xg).length, b = 0; b < k; ) { Df df; if ((df = arrayOfDf[b]).po0
/* 14 */               .Mg0 != j) { df
/* 15 */                 .cOM7.E1(""); df.lPt8 = false; df.ZA(); df.K8.s6(Ml0.OH0(5515)); }
/* 16 */             else { df.XC0.TS
/* 17 */                 .VL0 = true;
/* 18 */               df.K8.s6(Ml0.OH0(5504)); df.lPt8 = true; df.ZA(); }  b++; }
/* 19 */            for (Iterator<pC> iterator1 = this.IC.iterator(); iterator1.hasNext(); ) {
/*    */             
/* 21 */             boolean bool2 = Arrays.<DK>asList(arrayOfDK).contains(pC.a8); pC pC;
/* 22 */             (pC = iterator1.next()).ar.TG0
/* 23 */               .Fx0(bool2);
/* 24 */             boolean bool1 = Arrays.<DK>asList(arrayOfDK).contains(pC.ct); (iterator1.next()).Wf
/* 25 */               .TG0
/* 26 */               .Fx0(bool1);
/* 27 */           }  if (!this.Oh0) if (arrayOfDK.length < 1) { this.DY.s6(Ml0.OH0(5507)); } else { this.DY.s6(Ml0.OH0(5504)); }   if (this.Oh0) { this.vi
/* 28 */               .As
/* 29 */               .qt(new U70[] { cC0.xK.PK0() }); } else { U70 u70; boolean bool; for (bool = false, k = arrayOfDK.length, b = 0; b < k; ) { if ((arrayOfDK[b])
/* 30 */                 .Iq) bool = true;  b++; }  this
/* 31 */               .vi.s6(Ml0.OH0(5501));
/* 32 */             rH rH = this.vi.As;
/* 33 */             U70[] arrayOfU70 = new U70[1]; b = 0; if (bool) { cC0 cC01; if ((cC01 = cC0.xK)
/* 34 */                 .V90 == null) cC01.V90 = cC0.Bv0((short)5002);  u70 = cC01.V90; }
/* 35 */             else { cC0 cC01; if ((cC01 = cC0.xK)
/* 36 */                 .xg == null) cC01.xg = cC0.Bv0((short)5003);  u70 = cC01.xg; }  arrayOfU70[b] = u70; rH
/* 37 */               .qt(arrayOfU70); }
/* 38 */            this.vi.As
/* 39 */             .VL0 = true;
/* 40 */           this.BB = arrayOfDK; this.WL = j; this.Bm.s6(Ml0.OH0(5504)); this.ki0.sk0(true); this.ki0.wI0(true); update(); }
/* 41 */          for (iterator = this.IC.iterator(); hasNext(); ) { ((pC)next())
/* 42 */             .pz0 = true;
/* 43 */           ((pC)next()).DG(); }  }
/* 44 */       else { km.pm0.bL((byte)2, (short)1367); ox(); XJ0(); for (iterator = ((ve)this).IC.iterator(); hasNext(); ) { ((pC)next())
/* 45 */             .pz0 = false;
/* 46 */           ((pC)next()).DG(); }
/*    */          }
/*    */        }
/*    */      }
/*    */    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/kk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */