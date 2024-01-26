/*  1 */ package f;public final class nf implements iq0 { public float[] g0; public re0 Ug0; public final Sn0 wv0; public gd mE0; public final void xe0(int paramInt) { this.g0 = new float[paramInt * 24]; yj yj = yj.xd0; if (UB0.Je != null) yj = yj.bz0;  re0 re01 = new re0(); int i = paramInt * 4; this(1, 3, "a_position"); lw0 lw0, arrayOfLw0[]; (arrayOfLw0 = new lw0[4])[0] = lw0; this(4, 4, "a_color"); (new lw0[4])[1] = lw0; this(4, 4, "a_color_mix"); (new lw0[4])[2] = lw0; this(16, 2, "a_texCoord0"); (new lw0[4])[3] = lw0; this(yj, false, i, j, arrayOfLw0); short[] arrayOfShort; byte b; int j; for (this.Ug0 = re01, arrayOfShort = new short[j = paramInt * 6], b = 0, i = 0; i < j; ) { arrayOfShort[i] = (short)b; int k = i + 1; short s1 = (short)(b + 2); arrayOfShort[k] = s1; k = i + 2; short s2 = (short)(b + 1); arrayOfShort[k] = s2; arrayOfShort[i + 3] = s2; arrayOfShort[i + 4] = s1; k = i + 5; arrayOfShort[k] = (short)(b + 3); i += 6; b += 4; }  this.Ug0.rs0
/*  2 */       .q10(j, arrayOfShort); } public final cON ug; public final fQ Rj; public nf(gd paramgd) { this(1000, paramgd); } public nf(int paramInt, gd paramgd) { Sn0 sn0; cON cON1; fQ fQ1; this(); this.wv0 = this; this(); this.ug = this; this(16); this.Rj = this; xe0(paramInt); vo(paramgd); } public final void vo(gd paramgd) { this.mE0 = paramgd; } public final void Zx(oq paramoq) { int i; this.mE0.getClass(); if (paramoq.PQ.rb0 == -1) { i = 1; } else { i = 0; }  i ^= 0x1;
/*  3 */     Object object = null; C9 c9;
/*  4 */     if ((c9 = this.wv0.iN) != null) {
/*  5 */       C9 c91; while ((c91 = c9.Nk0) != null && c9.rF < i) c9 = c91;  if (c9.rF == i) object = c9.y80; 
/*  6 */     }  if ((object = object) == null) { C9 c91, c92; (object = this.ug.obtain()).clear(); this.Rj.Com3(object); Sn0 sn0;
/*  7 */       if ((c9 = (sn0 = this.wv0).iN) != null)
/*  8 */       { C9 c93; while ((c93 = c9.Nk0) != null && c93.rF <= i) c9 = c93;  int j; if (i > (j = c9.rF)) { c9.Nk0 = this; if ((c92 = (c91 = this.le.E20(c9, c93, (fQ)object, i)).Nk0) != null) c92.Jv0 = this;  } else if (c92 < j) { ((Sn0)this).iN = ((Sn0)this).iN.Jv0 = ((Sn0)this).le.E20(null, ((Sn0)this).iN, (fQ)object, c92); } else { c9.y80 = object; }  } else { ((Sn0)this).iN = ((Sn0)this).le.E20(null, null, (fQ)object, c92); }  }  object
/*  9 */       .Com3(paramoq); } public final void Js0() { gd gd1; (gd1 = this.mE0).getClass(); UB0.go.glEnable(2929); this.mE0.ZE0.bind(); Matrix4 matrix4 = gd1.Pz0.VD0; float[] arrayOfFloat = matrix4.Z0; UB0.re0.glUniformMatrix4fv(this.mE0.ZE0.mm0("u_projectionViewMatrix", Rm0.bk0), 1, false, arrayOfFloat, 0); Rm0 rm0 = this.mE0.ZE0; boolean bool = false; String str = "u_texture"; rm0.oM();
/* 10 */     UB0.re0.glUniform1i(rm0.mm0(str, Rm0.bk0), bool);
/* 11 */     if (this.mE0.sz0 != null) { Rm0 rm01; rm0 = gd1.ZE0; float f2 = gd1.Pz0.H.x, f3 = gd1.Pz0.H.y, f4 = gd1.Pz0.H.z, f5 = 1.1881F / gd1.Pz0.l6 * gd1.Pz0.l6; String str1 = "u_cameraPosition";
/* 12 */       UB0.re0
/*    */ 
/*    */         
/* 15 */         .glUniform4f(rm0.mm0(str1, Rm0.bk0), f2, f3, f4, f5); long l;
/* 16 */       if (gd1.sz0.gV(l = qo.Ml)) { rm01 = gd1.ZE0;
/*    */         
/*    */          }
/*    */       
/*    */       else
/*    */       
/*    */       { 
/* 23 */         rm01 = ((gd)rm01).ZE0; }  rm01.getClass(); float f1 = Color.BLACK.r; f2 = Color.BLACK.g; f3 = Color.BLACK.b; f4 = Color.BLACK.a; UB0.re0.glUniform4f(rm01.mm0("u_fogColor", Rm0.bk0), f1, f2, f3, f4); }
/* 24 */      iK0 iK0; for (Iterator iterator = this.wv0.iterator(); (iK0 = (iK0)iterator).hasNext(); ) { C9 c91 = (C9)iK0.next(); gd gd3 = this.mE0; fQ fQ1 = (fQ)c91.y80; gd3.getClass(); if (c91.rF == 1)
/* 25 */       { UB0.go.glEnable(3042); fQ1.sort(gd3.Tu0); } else { byte b; int j; for (b = 0, j = fQ1.Z8; b < j; ) { oq oq = (oq)fQ1.get(b);
/*    */           fQ fQ2;
/* 27 */           if ((fQ2 = (fQ)gd3.O2.pd0(oq.PQ)) == null) { (fQ2 = (fQ)gd3.sx0.obtain()).clear(); gd3.Mi0.Com3(fQ2); gd3.O2
/*    */               
/* 29 */               .X00(oq.PQ, fQ2); }  fQ2.Com3(oq); b++; }  fQ1.clear(); TA tA; (tA = gd3.O2.mw0()).getClass(); for (; tA.hasNext(); fQ1.OG0(tA.next())); gd3.O2.t9(); gd3.sx0.freeAll(gd3.Mi0); gd3.Mi0.clear(); }
/*    */       
/* 31 */       Rm0 rm01 = this.mE0.ZE0;
/* 32 */       fQ1 = null; int i = 0;
/* 33 */       for (Hc0 hc0 = ((fQ)c91.y80).r30(); hc0.hasNext(); ) { boolean bool1; Xf xf = (Xf)hc0.next(); if (fQ1 == null || 
/*    */           
/* 35 */           !fQ1.equals(xf.PQ)) { boolean bool2; if (i) {
/* 36 */             re0 re01 = this.Ug0; float[] arrayOfFloat2 = this.g0; re01
/* 37 */               .Dt0
/* 38 */               .Dc(0, i, arrayOfFloat2);
/* 39 */             int m = i / 4;
/* 40 */             bool1 = this.Ug0.N70;
/* 41 */             this.Ug0.Gi0(rm01, 4, 0, m, bool1); bool1 = false;
/*    */           }  zt zt;
/* 43 */           (zt = xf.PQ).wq0
/* 44 */             .G3
/* 45 */             .bind(0); int k;
/* 46 */           if ((k = xf.PQ.rb0) == -1) { bool2 = true; } else { bool2 = false; }  if (!bool2)
/* 47 */             UB0.go.glBlendFunc(k, zt.X50); 
/* 48 */           zt = xf.PQ; }
/* 49 */          if (!xf.Ka0) { xf
/* 50 */             .LJ(); xf.Vr0(); }
/* 51 */          float[] arrayOfFloat1 = this.g0; int j = xf.OK.length; System.arraycopy(xf.OK, 0, arrayOfFloat1, bool1, j); if ((i = bool1 + xf.OK.length) == (arrayOfFloat1 = this.g0).length)
/* 52 */         { this.Ug0
/* 53 */             .Dt0
/* 54 */             .Dc(0, i, arrayOfFloat1);
/* 55 */           i /= 4;
/* 56 */           boolean bool2 = this.Ug0.N70;
/* 57 */           this.Ug0.Gi0(rm01, 4, 0, i, bool2); i = 0; }  }  if (i > 0) {
/* 58 */         re0 re01 = this.Ug0; float[] arrayOfFloat1 = this.g0; re01
/* 59 */           .Dt0
/* 60 */           .Dc(0, i, arrayOfFloat1);
/* 61 */         int j = i / 4;
/* 62 */         boolean bool1 = this.Ug0.N70;
/* 63 */         this.Ug0.Gi0(rm01, 4, 0, j, bool1);
/* 64 */       }  gd gd2 = this.mE0; gd2.getClass(); if (c91.rF == 1)
/* 65 */         UB0.go.glDisable(3042);  }  this
/* 66 */       .mE0.getClass();
/* 67 */     UB0.go.glDisable(2929);
/* 68 */     Sn0 sn0 = this.wv0; C9 c9;
/* 69 */     while ((c9 = sn0.iN) != null) { sn0
/* 70 */         .le.free(c9); sn0.iN = sn0.iN.Nk0; }  this
/* 71 */       .ug.freeAll(this.Rj); this.Rj.clear(); }
/*    */ 
/*    */   
/*    */   public final void dispose() {
/*    */     Sn0 sn0 = this.wv0;
/*    */     C9 c9;
/*    */     while ((c9 = sn0.iN) != null) {
/*    */       sn0.le.free(c9);
/*    */       sn0.iN = sn0.iN.Nk0;
/*    */     } 
/*    */     this.ug.freeAll(this.Rj);
/*    */     this.Rj.clear();
/*    */     this.g0 = null;
/*    */     this.Ug0.dispose();
/*    */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/nf.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */