/*  1 */
package f;

public abstract class wb {
    public static final uT[] im0 = new uT[0];
    public static final ik eC = C00.gd(wb.class);
    public static final eo EB0 = new eo();
    public static final Color Uz = new Color();
    public boolean xh = false;
    public vH pb;
    public Ih0 Gc0;
    public byte CP = -1;
    public byte XW = -1;
    public hm0 xS;
    public hm0 M7;
    public fQ KO;
    public uT[] TC0 = im0;
    public fQ jN;
    public So synchronized;
    public final fQ ts0 = new fQ();
    public final Ut0 y1 = new Ut0();
    public final uV pg = new uV();
    public final fQ hf = new fQ();
    public boolean i5 = false;
    public boolean ki0 = false;
    public fQ lPT1 = new fQ();

    public wb(hm0 paramhm0) {
        vH vH1 = (vH) km.wI0.qn();
        this.Gc0 = go();
        fv0(paramhm0);
        Wz0.Jv();
    }

    private void lq(int paramInt1, int paramInt2, sh paramsh) {
        hm0 hm01;
        if ((paramInt1 != 14) ? (paramInt1 == 16 && (hm01 = this.M7) != null) : ((
                /*  2 */       hm01 = ((wb) super).xS) != null)) xy0(1.0F);
    }

    public static void FD(byte paramByte, short paramShort, int paramInt, sh paramsh) {
        km.pm0.bA0(false, paramByte, paramShort, 0.0F);
    }

    private void d5(int paramInt, sh paramsh) {
        vH vH1;
        Texture texture;
        if ((texture = (vH1 = this.pb).qc) != null) {
            texture.dispose();
            this.qc = null;
        }
        this.cH0.a = 0.0F;
        this.i1 = false;
        this.zg0 = false;
        this.a3 = false;
    }

    private void Ki0(int paramInt1, boolean paramBoolean, int paramInt2, sh paramsh) {
        Hc0 hc0;
        if (paramInt1 != 14) {
            if (paramInt1 != 16) {
                this.xS.Cs0 = paramBoolean;
                fQ fQ1;
                if (paramInt1 == 18 && (fQ1 = this.KO) != null && this.Z8 > 0) for (hc0 = r30(); hasNext(); )
                    ((hm0) next())
                            /*  3 */.Cs0 = paramBoolean;
            }
            /*  4 */
            else {
                fQ fQ1;
                if ((fQ1 = ((wb) super).KO) != null && this.Z8 > 0) for (hc0 = r30(); hasNext(); )
                    ((hm0) next())
                            /*  5 */.Cs0 = paramBoolean;
            }
        }
        /*  6 */
        else {
            ((wb) super).xS
                    /*  7 */.Cs0 = paramBoolean;
        }
    }

    public static Wz0 cOM2(short paramShort) { // Byte code:
        /*    */     //   0: iconst_2
        /*    */     //   1: iload_0
        /*    */     //   2: <illegal opcode> Do : (BS)Lf/hk0;
        /*    */     //   7: invokestatic OC : (Lf/hk0;)Lf/Wz0;
        /*    */     //   10: areturn } public static Wz0 A50(short paramShort, boolean paramBoolean) { // Byte code:
        /*    */     //   0: iconst_2
        /*    */     //   1: iload_0
        /*    */     //   2: iload_1
        /*    */     //   3: <illegal opcode> Do : (BSZ)Lf/hk0;
        /*    */     //   8: invokestatic OC : (Lf/hk0;)Lf/Wz0;
        /*    */     //   11: areturn } public final void fv0(hm0 paramhm0) { this.xS = paramhm0; if (paramhm0 == null) return;  this.TC0 = paramhm0.qf; this.CP = paramhm0.FT; tS(); } public final wb SK(hm0 paramhm0) { this(); fQ fQ1; this.KO = fQ1; this(); this.jN = fQ1; this.M7 = paramhm0; if (paramhm0 != null) { this.KO.Com3(paramhm0); this.jN.Nv((Object[])paramhm0.qf); this.XW = paramhm0.FT; }  tS(); return this; } public final void tS() { q10.Nl = zc0() ? K50.zN : K50.qF; hm0 hm01; uT uT1; if ((hm01 = this.xS) != null && (uT1 = hm01.rF0) != null) q10.Rs.JL(hm01.sf(uT1, false));  if ((hm01 = this.M7) != null && (uT1 = hm01.rF0) != null) { q10.HF.JL(hm01.sf(uT1, false)); } else { eo eo2, eo1 = q10.HF; if (zc0()) { eo2 = vH.Zu; } else { eo2 = vH.xC; }  JL(eo2); }  } public final So vk0(int paramInt, float paramFloat) { // Byte code:
        /*    */     //   0: iload_1
        /*    */     //   1: fconst_0
        /*    */     //   2: fstore_3
        /*    */     //   3: aconst_null
        /*    */     //   4: astore #4
        /*    */     //   6: ifeq -> 26
        /*    */     //   9: iload_1
        /*    */     //   10: iconst_1
        /*    */     //   11: if_icmpeq -> 17
        /*    */     //   14: goto -> 32
        /*    */     //   17: aload_0
        /*    */     //   18: getfield M7 : Lf/hm0;
        /*    */     //   21: astore #4
        /*    */     //   23: goto -> 32
        /*    */     //   26: aload_0
        /*    */     //   27: getfield xS : Lf/hm0;
        /*    */     //   30: astore #4
        /*    */     //   32: aload #4
        /*    */     //   34: ifnull -> 78
        /*    */     //   37: getstatic f/wb.EB0 : Lf/eo;
        /*    */     //   40: aload #4
        /*    */     //   42: getfield rF0 : Lf/uT;
        /*    */     //   45: getfield He0 : Lf/eo;
        /*    */     //   48: dup
        /*    */     //   49: dup
        /*    */     //   50: getfield x : F
        /*    */     //   53: fstore #4
        /*    */     //   55: getfield y : F
        /*    */     //   58: fstore #5
        /*    */     //   60: getfield z : F
        /*    */     //   63: fstore #6
        /*    */     //   65: fload #4
        /*    */     //   67: fload #5
        /*    */     //   69: fload #6
        /*    */     //   71: invokevirtual TG0 : (FFF)Lf/eo;
        /*    */     //   74: pop
        /*    */     //   75: goto -> 138
        /*    */     //   78: iload_1
        /*    */     //   79: ifeq -> 105
        /*    */     //   82: iload_1
        /*    */     //   83: iconst_1
        /*    */     //   84: if_icmpeq -> 90
        /*    */     //   87: goto -> 138
        /*    */     //   90: aload_0
        /*    */     //   91: getstatic f/wb.EB0 : Lf/eo;
        /*    */     //   94: astore #4
        /*    */     //   96: invokevirtual zc0 : ()Z
        /*    */     //   99: ifeq -> 117
        /*    */     //   102: goto -> 125
        /*    */     //   105: aload_0
        /*    */     //   106: getstatic f/wb.EB0 : Lf/eo;
        /*    */     //   109: astore #4
        /*    */     //   111: invokevirtual zc0 : ()Z
        /*    */     //   114: ifeq -> 125
        /*    */     //   117: getstatic f/vH.xC : Lf/eo;
        /*    */     //   120: astore #5
        /*    */     //   122: goto -> 130
        /*    */     //   125: getstatic f/vH.Zu : Lf/eo;
        /*    */     //   128: astore #5
        /*    */     //   130: aload #4
        /*    */     //   132: aload #5
        /*    */     //   134: invokevirtual JL : (Lf/eo;)Lf/eo;
        /*    */     //   137: pop
        /*    */     //   138: iload_1
        /*    */     //   139: fconst_0
        /*    */     //   140: fstore #4
        /*    */     //   142: ldc_w 0.25
        /*    */     //   145: fstore #5
        /*    */     //   147: ldc_w -0.25
        /*    */     //   150: fstore #6
        /*    */     //   152: fconst_1
        /*    */     //   153: fstore #7
        /*    */     //   155: ifne -> 171
        /*    */     //   158: aload_0
        /*    */     //   159: getfield XW : B
        /*    */     //   162: getstatic f/km.MR : Lf/Gp0;
        /*    */     //   165: invokevirtual nI : ()B
        /*    */     //   168: if_icmpne -> 189
        /*    */     //   171: iload_1
        /*    */     //   172: iconst_1
        /*    */     //   173: if_icmpne -> 209
        /*    */     //   176: aload_0
        /*    */     //   177: getfield XW : B
        /*    */     //   180: getstatic f/km.MR : Lf/Gp0;
        /*    */     //   183: invokevirtual nI : ()B
        /*    */     //   186: if_icmpne -> 209
        /*    */     //   189: ldc_w 0.25
        /*    */     //   192: fstore #4
        /*    */     //   194: ldc_w 0.5
        /*    */     //   197: fstore #5
        /*    */     //   199: ldc_w -0.075
        /*    */     //   202: fstore #6
        /*    */     //   204: ldc_w 0.5
        /*    */     //   207: fstore #7
        /*    */     //   209: invokestatic k60 : ()Lf/So;
        /*    */     //   212: fload_3
        /*    */     //   213: invokevirtual Wz0 : (F)Lf/So;
        /*    */     //   216: invokevirtual L5 : ()Lf/So;
        /*    */     //   219: aload_0
        /*    */     //   220: getfield Gc0 : Lf/Ih0;
        /*    */     //   223: bipush #9
        /*    */     //   225: fload_2
        /*    */     //   226: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
        /*    */     //   229: getstatic f/wb.EB0 : Lf/eo;
        /*    */     //   232: dup
        /*    */     //   233: astore_1
        /*    */     //   234: getfield x : F
        /*    */     //   237: aload_1
        /*    */     //   238: dup
        /*    */     //   239: getfield y : F
        /*    */     //   242: fload #4
        /*    */     //   244: fsub
        /*    */     //   245: fstore_3
        /*    */     //   246: getfield z : F
        /*    */     //   249: fload #5
        /*    */     //   251: fsub
        /*    */     //   252: fload_3
        /*    */     //   253: swap
        /*    */     //   254: invokevirtual qw0 : (FFF)Lf/Wz0;
        /*    */     //   257: invokevirtual PL : (Lf/Wz0;)Lf/So;
        /*    */     //   260: aload_0
        /*    */     //   261: getfield Gc0 : Lf/Ih0;
        /*    */     //   264: iconst_4
        /*    */     //   265: fload_2
        /*    */     //   266: invokestatic gq : (Ljava/lang/Object;IF)Lf/Wz0;
        /*    */     //   269: aload_1
        /*    */     //   270: getfield x : F
        /*    */     //   273: aload_1
        /*    */     //   274: dup
        /*    */     //   275: getfield y : F
        /*    */     //   278: fload #6
        /*    */     //   280: fsub
        /*    */     //   281: fstore_0
        /*    */     //   282: getfield z : F
        /*    */     //   285: fload #7
        /*    */     //   287: fsub
        /*    */     //   288: fload_0
        /*    */     //   289: swap
        /*    */     //   290: invokevirtual qw0 : (FFF)Lf/Wz0;
        /*    */     //   293: invokevirtual PL : (Lf/Wz0;)Lf/So;
        /*    */     //   296: invokevirtual Kr : ()Lf/So;
        /*    */     //   299: areturn
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 18
        /*    */     //   #2	-> 42
        /*    */     //   #3	-> 45
        /*    */     //   #4	-> 50
        /*    */     //   #5	-> 55
        /*    */     //   #6	-> 60
        /*    */     //   #7	-> 71 } public final So hp0(float paramFloat) { float f2 = vH.AUX.x, f3 = vH.AUX.y, f4 = vH.AUX.z, f1 = vH.Lu.x; paramFloat = vH.Lu.y; f2 = vH.Lu.z; return So.k60().Wz0(0.0F).L5().PL(Wz0.gq(this.Gc0, 4, paramFloat).qw0(f2, f3, f4)).PL(Wz0.gq(this.Gc0, 9, paramFloat).qw0(f1, paramFloat, f2)).Kr(); } public final Wz0 fu0(int paramInt, boolean paramBoolean) { // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: iload_1
        /*    */     //   2: iload_2
        /*    */     //   3: <illegal opcode> Do : (Lf/wb;IZ)Lf/hk0;
        /*    */     //   8: invokestatic OC : (Lf/hk0;)Lf/Wz0;
        /*  7 */     //   11: areturn } public final Wz0 Sn() { return Wz0.OC(this::d5); } public Wz0 Ur0(String paramString) { return Wz0.OC((paramInt, paramsh) -> OJ(paramParticleEffectExt)); } public final Wz0 con(String paramString) { return Wz0.OC((paramInt, paramsh) -> OJ(paramParticleEffectExt)); } public wb O3() { tS(); return this; } public wb d9() { return this; } public wb hh0() { return this; } public wb pI0(hR paramhR, byte paramByte) { return this; } public void Ba() { byte b; Hc0 hc0; for (b = 0, hc0 = this.ts0.r30(); hc0.hasNext();) { if (((ParticleEffect)hc0.next()).isComplete()) b++;  }  So so; if ((so = this.synchronized) != null && (so.DD() || !this.synchronized.p0)) this.synchronized = null;  if (!this.i5 && b == this.ts0.Z8 && this.synchronized == null) { this.i5 = true; la0(); }  } public void la0() { for (Hc0 hc0 = this.ts0.r30(); hc0.hasNext(); ) { ParticleEffectExt particleEffectExt = (ParticleEffectExt)hc0.next(); this.pb.jv0.Ow0(particleEffectExt); }  this.ts0.clear(); if (!this.ki0) { float f1 = vH.AUX.x, f2 = vH.AUX.y, f3 = vH.AUX.z; f1 = vH.Lu.x; f2 = vH.Lu.y; f3 = vH.Lu.z; So so2 = So.k60().L5().PL(Wz0.gq(this.Gc0, 4, 0.25F).qw0(f1, f2, f3)).PL(Wz0.gq(this.Gc0, 9, 0.25F).qw0(f1, f2, f3)); f2 = 0.25F; f3 = this.pb.Pz[0]; float f4 = this.pb.Pz[1], f5 = this.pb.Pz[2], f6 = this.pb.Pz[3]; So so3; Hc0 hc01; for (so3 = So.k60().L5(), hc01 = this.pb.IO.xl0.r30(); hc01.hasNext(); so3.PL(Wz0.gq(hc01.next(), 10, f2).qY(new float[] { f3, f4, f5, f6 }))); for (hc01 = this.pb.COM7.xl0.r30(); hc01.hasNext(); so3.PL(Wz0.gq(hc01.next(), 10, f2).qY(new float[] { f3, f4, f5, f6 }))); for (hc01 = this.pb.Yh0.xl0.r30(); hc01.hasNext(); so3.PL(Wz0.gq(hc01.next(), 10, f2).qY(new float[] { f3, f4, f5, f6 }))); so3.Kr(); Color color = dL.z2(0); color = dL.z2(0);
        /*    */
        /*    */
        /*    */
        /* 11 */
        So so1 = (So) so2.Zo0(so3).Zo0(BW(16, 0.0F, 0.0F, 0.0F, color)).Zo0(BW(14, 0.0F, 0.0F, 0.0F, color)).PL(Sn()).Kr().mg(this.pb.dr0);
        this.pb.t9(so1);
    }  this.Gc0.c5.gL();
    vH vH1;
    Texture texture;
    /* 12 */     if((texture =(vH1 =this.pb).qc)!=null)

    {
        texture
/* 13 */.dispose();
        this.qc = null;
    }  this.cH0.a =0.0F; this.i1 =false; this.zg0 =false; this.a3 =false;
}

    /*    */
    public boolean cw() {
        return this.i5;
    }

    /*    */
    public final ParticleEffectExt vR(String paramString) {
        ParticleEffectExt particleEffectExt;
        try {
            particleEffectExt = this.pb.jv0.gi0(paramString);
        } catch (Exception exception) {
            eC.info("Couldn't load move effect " + particleEffectExt, exception);
            this();
        }
        this.lPT1.Com3(particleEffectExt);
        return particleEffectExt;
    }

    /*    */
    public final void OJ(ParticleEffectExt paramParticleEffectExt) {
        this.lPT1.Ct(paramParticleEffectExt, true);
        this.ts0.Com3(paramParticleEffectExt);
        if (!this.xh) this.pb.jv0.L40(paramParticleEffectExt);
        paramParticleEffectExt.init();
        paramParticleEffectExt.start();
    }

    /*    */
    public final boolean zc0() {
        return (this.CP == km.MR.nI());
    }

    /*    */
    public final So ia0(byte paramByte, short paramShort, int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, hm0 paramhm0) {
        float f = 0.0F;
        if (paramInt2 != 14) {
            if (paramInt2 == 16) f = 1.0F;
        } else {
            f = -1.0F;
        }
        Gp0 gp0;
        if (paramhm0 != null && (gp0 = km.MR) != null && paramhm0.FT != gp0.hG0()) f *= -1.0F;
        So.k60().PL(Wz0.OC(new Cj0(this, paramInt1, paramByte, paramShort, f, paramFloat2, paramFloat1)));
        return So.k60();
    }

    /*    */
    public final Wz0 sy(int paramInt) {
        return Wz0.OC(new oh0(this, paramInt));
    }

    /* 20 */
    public final So bd(int paramInt1, int paramInt2, int paramInt3, float paramFloat) {
        So so;
        (so = So.k60()).PL(Wz0.OC(new Dh0(this, paramInt1, paramInt2, paramInt3, paramFloat)));
        return this.ki0 ? so : so.Wz0(paramFloat);
    }

    public final So Sn(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
        Hc0 hc0;
        float f1;
        this.hf.clear();
        So so = So.k60();
        if (paramInt1 != 14) {
            if (paramInt1 != 16) {
                if (!this.xh) eC.error("Unknown target_id for getScaleAnimation = " + paramInt1);
                return so;
            }
            fQ fQ1;
            if ((fQ1 = this.jN) != null && fQ1.Z8 > 0) {
                fQ2.getClass();
                Object[] arrayOfObject = fQ1.Uq0;
                int i = fQ1.Z8;
                fQ fQ2;
                (fQ2 = this.hf).tu0(arrayOfObject, 0, i);
            }
        } else {
            this.hf.Nv((Object[]) this.TC0);
        }
        paramInt2 = paramInt3 - 1;
        float f2 = paramFloat2 + paramFloat1;
        switch (paramInt2) {
            default:
                if (!this.xh) eC.error("Unknown type_id for getScaleAnimation = " + paramInt1);
                return so;
            case 3:
                so.L5();
                for (hc0 = this.hf.r30(); hasNext(); ) {
                    uT uT1 = (uT) next();
                    f1 = paramFloat3 + 1.0F;
                    paramFloat1 = paramFloat4 + 1.0F;
                    paramFloat2 = (1.0F - paramFloat1) / 2.0F;
                    float f3 = 1.0F - paramFloat3, f4 = 1.0F - paramFloat4, f5 = (1.0F - f4) / 2.0F;
                    so.eC().L5().PL(Wz0.gq(uT1, 7, f2).n20(f1, paramFloat1)).PL(Wz0.gq(uT1, 2, f2).a(uT1.He0.y - paramFloat2)).Kr().L5().PL(Wz0.gq(uT1, 7, f2).n20(f3, f4)).PL(Wz0.gq(uT1, 2, f2).a(uT1.He0.y - f5)).Kr().L5().PL(Wz0.gq(uT1, 7, f2).n20(1.0F, 1.0F)).PL(Wz0.gq(uT1, 2, f2).a(uT1.He0.y)).Kr().Kr();
                }
                break;
            case 2:
                so.L5();
                for (hc0 = ((wb) super).hf.r30(); hasNext(); ) {
                    uT uT1 = (uT) next();
                    paramFloat1 = paramFloat3 + 1.0F;
                    paramFloat2 = paramFloat4 + 1.0F;
                    float f = (1.0F - paramFloat2) / 2.0F;
                    so.eC().L5().PL(Wz0.gq(uT1, 7, f2).n20(paramFloat1, paramFloat2)).PL(Wz0.gq(uT1, 2, f2).a(uT1.He0.y - f)).Kr().L5().PL(Wz0.gq(uT1, 7, f2).n20(1.0F, 1.0F)).PL(Wz0.gq(uT1, 2, f2).a(uT1.He0.y)).Kr().Kr();
                }
                so.Kr();
                if (f1 > 1) {
                    so.Ck0(f1, 0.0F);
                    return so;
                }
                return so;
            case 1:
                so.L5();
                for (hc0 = ((wb) super).hf.r30(); hasNext(); ) {
                    uT uT1 = (uT) next();
                    paramFloat1 = (1.0F - paramFloat4) / 2.0F;
                    so.eC().L5().PL(Wz0.gq(uT1, 7, f2).n20(paramFloat3, paramFloat4)).PL(Wz0.gq(uT1, 2, f2).a(uT1.He0.y - paramFloat1)).Kr().Kr();
                }
                so.Kr();
                if (f1 > 1) {
                    so.Ck0(f1, 0.0F);
                    return so;
                }
                return so;
            case 0:
                so.L5();
                for (hc0 = ((wb) super).hf.r30(); hasNext(); ) {
                    uT uT1;
                    f1 = (uT1 = (uT) next()).FC0.x * 100.0F * paramFloat3;
                    paramFloat1 = (uT1 = (uT) next()).FC0.y * 100.0F * paramFloat4;
                    so.eC().L5().PL(Wz0.gq(uT1, 7, f2).n20(f1, paramFloat1)).PL(Wz0.gq(uT1, 2, f2).a(uT1.He0.y - paramFloat1)).Kr().Kr();
                }
                break;
        }
        so.Kr();
        return so;
    }

    public final Wz0 T60(int paramInt, boolean paramBoolean) {
        return Wz0.OC(new wF(this, paramInt, paramBoolean));
    }

    public final Wz0 Ii(int paramInt) {
        ParticleEffectExt particleEffectExt;
        if (paramInt >= 1000) {
            particleEffectExt = vR("custom/" + paramInt);
        } else {
            particleEffectExt = vR("auto/" + paramInt);
        }
        this.y1.A3(paramInt, particleEffectExt);
        this.ts0.Com3(particleEffectExt);
        this.pb.jv0.L40(particleEffectExt);
        particleEffectExt.end();
        ((Wz0) Wz0.xX.al()).sn0(null, -1, 0.0F);
        return (Wz0) Wz0.xX.al();
    }

    public final So BW(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, Color paramColor) {
        this.hf.clear();
        So so = So.k60();
        if (paramInt != 14) {
            if (paramInt != 16) {
                if (!this.xh) eC.error("Unknown target_id for getMoveAnimation = " + paramInt);
                return so;
            }
            fQ fQ1;
            if ((fQ1 = this.jN) != null && fQ1.Z8 > 0) this.hf.OG0(fQ1);
        } else {
            this.hf.Nv((Object[]) this.TC0);
        }
        Uz.set(paramColor);
        so.L5();
        Hc0 hc02 = this.hf.r30();
        while (hc02.hasNext()) {
            arrayOfFloat[0] = color.r;
            arrayOfFloat[1] = color.g;
            float[] arrayOfFloat;
            Color color;
            (arrayOfFloat = new float[4])[2] = (color = Uz).b;
            so.PL(Wz0.aG(10, hc02.next()).qY(new float[]{0, 0, 0, paramFloat2}));
        }
        so.Kr();
        so.L5();
        Hc0 hc01 = this.hf.r30();
        while (hasNext()) {
            arrayOfFloat[0] = color.r;
            arrayOfFloat[1] = color.g;
            float[] arrayOfFloat;
            Color color;
            (arrayOfFloat = new float[4])[2] = (color = Uz).b;
            so.PL(Wz0.gq(next(), 10, paramFloat1).qY(new float[]{0, 0, 0, paramFloat3}));
        }
        so.Kr();
        return so;
    }

    public final So Qe(int paramInt1, int paramInt2) {
        Hc0 hc0;
        this.hf.clear();
        So so = So.k60();
        if (paramInt1 != 14) {
            if (paramInt1 != 16) {
                if (!this.xh) eC.error("Unknown target_id for getMoveAnimation = " + paramInt1);
                return so;
            }
            fQ fQ1;
            if ((fQ1 = this.jN) != null && fQ1.Z8 > 0) this.hf.OG0(fQ1);
        } else {
            this.hf.Nv((Object[]) this.TC0);
        }
        so.L5();
        if (paramInt2 != 3) {
            if (paramInt2 == 4) {
                hc0 = this.hf.r30();
                while (hasNext()) {
                    uT uT1;
                    (uT1 = (uT) next()).getClass();
                    so.PL(Wz0.aG(8, uT1).qY(new float[]{1.0F, 1.0F, 1.0F, 1.0F}));
                }
            }
        } else {
            hc0 = ((wb) super).hf.r30();
            while (hasNext()) {
                uT uT1;
                (uT1 = (uT) next()).getClass();
                so.PL(Wz0.aG(9, uT1).a(0.0F));
            }
        }
        so.Kr();
        return so;
    }

    public final So Tt(int paramInt1, int paramInt2) {
        Hc0 hc0;
        this.hf.clear();
        So so = So.k60();
        if (paramInt1 != 14) {
            this.hf.Nv((Object[]) this.TC0);
            fQ fQ1;
            if ((paramInt1 != 16) ? (paramInt1 == 18 && (fQ1 = this.jN) != null && fQ1.Z8 > 0) : ((fQ1 = this.jN) != null && fQ1.Z8 > 0)) {
                fQ2.getClass();
                Object[] arrayOfObject = fQ1.Uq0;
                int i = fQ1.Z8;
                fQ fQ2;
                (fQ2 = this.hf).tu0(arrayOfObject, 0, i);
            }
        } else {
            this.hf.Nv((Object[]) this.TC0);
        }
        if (paramInt2 != 0) {
            if (paramInt2 == 1) for (hc0 = this.hf.r30(); hasNext(); so.PL(Wz0.aG(13, next()).a(0.0F))) ;
        } else {
            so.PL(Wz0.OC((paramInt, paramsh) -> {
                hm0 hm01;
                if ((hm01 = this.xS) != null) hm01.kn0();
                fQ fQ1;
                if ((fQ1 = this.KO) != null) {
                    Hc0 hc0 = r30();
                    while (hasNext()) ((hm0) next()).kn0();
                }
            }));
        }
        return so;
    }

    public final So wG0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, float paramFloat1, float paramFloat2) { // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: getfield y1 : Lf/Ut0;
        /*    */     //   4: iload_1
        /*    */     //   5: invokevirtual Z6 : (I)Ljava/lang/Object;
        /*    */     //   8: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
        /*    */     //   11: dup
        /*    */     //   12: astore_1
        /*    */     //   13: invokevirtual getControllers : ()Lf/fQ;
        /*    */     //   16: getfield Z8 : I
        /*    */     //   19: ifne -> 26
        /*    */     //   22: invokestatic fD : ()Lf/So;
        /*    */     //   25: areturn
        /*    */     //   26: aload_1
        /*    */     //   27: invokevirtual getControllers : ()Lf/fQ;
        /*    */     //   30: getfield Z8 : I
        /*    */     //   33: iload_2
        /*    */     //   34: if_icmpgt -> 41
        /*    */     //   37: invokestatic fD : ()Lf/So;
        /*    */     //   40: areturn
        /*    */     //   41: iload_3
        /*    */     //   42: aload_1
        /*    */     //   43: dup
        /*    */     //   44: invokevirtual getControllers : ()Lf/fQ;
        /*    */     //   47: iload_2
        /*    */     //   48: invokevirtual get : (I)Ljava/lang/Object;
        /*    */     //   51: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleController
        /*    */     //   54: invokevirtual copy : ()Lcom/badlogic/gdx/graphics/g3d/particles/ParticleController;
        /*    */     //   57: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt
        /*    */     //   60: astore_2
        /*    */     //   61: invokevirtual getControllers : ()Lf/fQ;
        /*    */     //   64: aload_2
        /*    */     //   65: invokevirtual Com3 : (Ljava/lang/Object;)V
        /*    */     //   68: invokestatic k60 : ()Lf/So;
        /*    */     //   71: astore #7
        /*    */     //   73: ifeq -> 151
        /*    */     //   76: iload_3
        /*    */     //   77: iconst_1
        /*    */     //   78: if_icmpeq -> 142
        /*    */     //   81: iload_3
        /*    */     //   82: iconst_2
        /*    */     //   83: if_icmpeq -> 142
        /*    */     //   86: iload_3
        /*    */     //   87: bipush #9
        /*    */     //   89: if_icmpeq -> 151
        /*    */     //   92: iload_3
        /*    */     //   93: bipush #11
        /*    */     //   95: if_icmpeq -> 142
        /*    */     //   98: iload_3
        /*    */     //   99: bipush #13
        /*    */     //   101: if_icmpeq -> 151
        /*    */     //   104: aload_0
        /*    */     //   105: getfield xh : Z
        /*    */     //   108: ifne -> 157
        /*    */     //   111: getstatic f/wb.eC : Lf/ik;
        /*    */     //   114: new java/lang/StringBuilder
        /*    */     //   117: dup
        /*    */     //   118: invokespecial <init> : ()V
        /*    */     //   121: ldc_w 'UNK TARGET TYPE = '
        /*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        /*    */     //   127: iload_3
        /*    */     //   128: invokevirtual append : (I)Ljava/lang/StringBuilder;
        /*    */     //   131: invokevirtual toString : ()Ljava/lang/String;
        /*    */     //   134: invokeinterface error : (Ljava/lang/String;)V
        /*    */     //   139: goto -> 157
        /*    */     //   142: getstatic f/K50.zN : Lf/K50;
        /*    */     //   145: putstatic f/q10.Nl : Lf/K50;
        /*    */     //   148: goto -> 157
        /*    */     //   151: getstatic f/K50.qF : Lf/K50;
        /*    */     //   154: putstatic f/q10.Nl : Lf/K50;
        /*    */     //   157: iload #4
        /*    */     //   159: iconst_1
        /*    */     //   160: if_icmpeq -> 205
        /*    */     //   163: iload #4
        /*    */     //   165: bipush #11
        /*    */     //   167: if_icmpeq -> 205
        /*    */     //   170: iload #4
        /*    */     //   172: bipush #8
        /*    */     //   174: if_icmpeq -> 196
        /*    */     //   177: iload #4
        /*    */     //   179: bipush #9
        /*    */     //   181: if_icmpeq -> 187
        /*    */     //   184: goto -> 211
        /*    */     //   187: getstatic f/K50.qF : Lf/K50;
        /*    */     //   190: putstatic f/q10.aA : Lf/K50;
        /*    */     //   193: goto -> 211
        /*    */     //   196: getstatic f/K50.if : Lf/K50;
        /*    */     //   199: putstatic f/q10.aA : Lf/K50;
        /*    */     //   202: goto -> 211
        /*    */     //   205: getstatic f/K50.zN : Lf/K50;
        /*    */     //   208: putstatic f/q10.aA : Lf/K50;
        /*    */     //   211: aload_2
        /*    */     //   212: iconst_0
        /*    */     //   213: istore_3
        /*    */     //   214: getfield influencers : Lf/fQ;
        /*    */     //   217: invokevirtual r30 : ()Lf/Hc0;
        /*    */     //   220: astore #4
        /*    */     //   222: aload #4
        /*    */     //   224: invokevirtual hasNext : ()Z
        /*    */     //   227: ifeq -> 385
        /*    */     //   230: aload #4
        /*    */     //   232: invokevirtual next : ()Ljava/lang/Object;
        /*    */     //   235: checkcast com/badlogic/gdx/graphics/g3d/particles/influencers/Influencer
        /*    */     //   238: dup
        /*    */     //   239: astore #8
        /*    */     //   241: instanceof com/badlogic/gdx/graphics/g3d/particles/influencers/ControllerSpawnInfluencer
        /*    */     //   244: ifeq -> 306
        /*    */     //   247: aload #8
        /*    */     //   249: checkcast com/badlogic/gdx/graphics/g3d/particles/influencers/ControllerSpawnInfluencer
        /*    */     //   252: dup
        /*    */     //   253: astore #8
        /*    */     //   255: getfield spawnType : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
        /*    */     //   258: astore #9
        /*    */     //   260: getstatic f/q10.Nl : Lf/K50;
        /*    */     //   263: getstatic f/K50.zN : Lf/K50;
        /*    */     //   266: if_acmpne -> 275
        /*    */     //   269: fconst_1
        /*    */     //   270: fstore #10
        /*    */     //   272: goto -> 278
        /*    */     //   275: fconst_0
        /*    */     //   276: fstore #10
        /*    */     //   278: aload #8
        /*    */     //   280: aload #9
        /*    */     //   282: fload #10
        /*    */     //   284: invokevirtual setValue : (F)V
        /*    */     //   287: getfield spawnAdjustment : Lf/eo;
        /*    */     //   290: fload #5
        /*    */     //   292: ldc_w 0.5
        /*    */     //   295: fsub
        /*    */     //   296: fconst_0
        /*    */     //   297: swap
        /*    */     //   298: fconst_0
        /*    */     //   299: invokevirtual Tz : (FFF)Lf/eo;
        /*    */     //   302: pop
        /*    */     //   303: goto -> 222
        /*    */     //   306: aload #8
        /*    */     //   308: instanceof com/badlogic/gdx/graphics/g3d/particles/influencers/DynamicsInfluencerExt
        /*    */     //   311: ifeq -> 222
        /*    */     //   314: aload #8
        /*    */     //   316: checkcast com/badlogic/gdx/graphics/g3d/particles/influencers/DynamicsInfluencerExt
        /*    */     //   319: getfield velocities : Lf/fQ;
        /*    */     //   322: invokevirtual r30 : ()Lf/Hc0;
        /*    */     //   325: astore #8
        /*    */     //   327: aload #8
        /*    */     //   329: invokevirtual hasNext : ()Z
        /*    */     //   332: ifeq -> 222
        /*    */     //   335: aload #8
        /*    */     //   337: invokevirtual next : ()Ljava/lang/Object;
        /*    */     //   340: checkcast com/badlogic/gdx/graphics/g3d/particles/influencers/DynamicsModifier
        /*    */     //   343: dup
        /*    */     //   344: astore #9
        /*    */     //   346: instanceof com/badlogic/gdx/graphics/g3d/particles/DynamicsModifierExt$DragForce
        /*    */     //   349: ifne -> 368
        /*    */     //   352: aload #9
        /*    */     //   354: instanceof com/badlogic/gdx/graphics/g3d/particles/DynamicsModifierExt$CentripetalAccelerationExt
        /*    */     //   357: ifne -> 368
        /*    */     //   360: aload #9
        /*    */     //   362: instanceof com/badlogic/gdx/graphics/g3d/particles/DynamicsModifierExt$CircuralModifier
        /*    */     //   365: ifeq -> 371
        /*    */     //   368: iinc #3, 1
        /*    */     //   371: aload #9
        /*    */     //   373: instanceof com/badlogic/gdx/graphics/g3d/particles/DynamicsModifierExt$VectorPathModifier
        /*    */     //   376: ifeq -> 327
        /*    */     //   379: fconst_0
        /*    */     //   380: fstore #6
        /*    */     //   382: goto -> 327
        /*    */     //   385: fload #6
        /*    */     //   387: fconst_0
        /*    */     //   388: fcmpl
        /*    */     //   389: ifle -> 493
        /*    */     //   392: new com/badlogic/gdx/graphics/g3d/particles/DynamicsModifierExt$VectorPathModifier
        /*    */     //   395: dup
        /*    */     //   396: astore #4
        /*    */     //   398: invokespecial <init> : ()V
        /*    */     //   401: getstatic f/q10.aA : Lf/K50;
        /*    */     //   404: getstatic f/K50.zN : Lf/K50;
        /*    */     //   407: if_acmpeq -> 441
        /*    */     //   410: aload #4
        /*    */     //   412: dup
        /*    */     //   413: getfield vectorPath : Lf/fQ;
        /*    */     //   416: iconst_0
        /*    */     //   417: invokevirtual get : (I)Ljava/lang/Object;
        /*    */     //   420: checkcast com/badlogic/gdx/graphics/g3d/particles/DynamicsModifierExt$VectorPathModifier$VectorEntry
        /*    */     //   423: iconst_2
        /*    */     //   424: putfield modifier : I
        /*    */     //   427: getfield vectorPath : Lf/fQ;
        /*    */     //   430: iconst_1
        /*    */     //   431: invokevirtual get : (I)Ljava/lang/Object;
        /*    */     //   434: checkcast com/badlogic/gdx/graphics/g3d/particles/DynamicsModifierExt$VectorPathModifier$VectorEntry
        /*    */     //   437: iconst_1
        /*    */     //   438: putfield modifier : I
        /*    */     //   441: iload_3
        /*    */     //   442: aload #4
        /*    */     //   444: getfield strengthValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValue;
        /*    */     //   447: astore_3
        /*    */     //   448: ifle -> 457
        /*    */     //   451: iconst_1
        /*    */     //   452: istore #5
        /*    */     //   454: goto -> 460
        /*    */     //   457: iconst_0
        /*    */     //   458: istore #5
        /*    */     //   460: aload_2
        /*    */     //   461: aload #4
        /*    */     //   463: dup
        /*    */     //   464: aload_3
        /*    */     //   465: iload #5
        /*    */     //   467: invokevirtual setRelative : (Z)V
        /*    */     //   470: getfield speed : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
        /*    */     //   473: iconst_1
        /*    */     //   474: invokevirtual setActive : (Z)V
        /*    */     //   477: getfield speed : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
        /*    */     //   480: fload #6
        /*    */     //   482: invokevirtual setValue : (F)V
        /*    */     //   485: getfield influencers : Lf/fQ;
        /*    */     //   488: aload #4
        /*    */     //   490: invokevirtual Com3 : (Ljava/lang/Object;)V
        /*    */     //   493: aload_2
        /*    */     //   494: dup
        /*    */     //   495: invokevirtual init : ()V
        /*    */     //   498: aconst_null
        /*    */     //   499: astore_3
        /*    */     //   500: getfield trailController : I
        /*    */     //   503: iflt -> 530
        /*    */     //   506: aload_2
        /*    */     //   507: aload_1
        /*    */     //   508: invokevirtual getControllers : ()Lf/fQ;
        /*    */     //   511: aload_2
        /*    */     //   512: getfield trailController : I
        /*    */     //   515: invokevirtual get : (I)Ljava/lang/Object;
        /*    */     //   518: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt
        /*    */     //   521: dup
        /*    */     //   522: dup
        /*    */     //   523: astore_3
        /*    */     //   524: invokevirtual init : ()V
        /*    */     //   527: invokevirtual updateTrailController : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt;)V
        /*    */     //   530: aload_0
        /*    */     //   531: aload #7
        /*    */     //   533: aload_2
        /*    */     //   534: getfield emitter : Lcom/badlogic/gdx/graphics/g3d/particles/emitters/Emitter;
        /*    */     //   537: checkcast com/badlogic/gdx/graphics/g3d/particles/emitters/RegularEmitter
        /*    */     //   540: dup
        /*    */     //   541: dup
        /*    */     //   542: getfield delayValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/RangedNumericValue;
        /*    */     //   545: invokevirtual getLowMax : ()F
        /*    */     //   548: fstore_0
        /*    */     //   549: getfield durationValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/RangedNumericValue;
        /*    */     //   552: invokevirtual getLowMax : ()F
        /*    */     //   555: fload_0
        /*    */     //   556: fadd
        /*    */     //   557: fstore_0
        /*    */     //   558: getfield lifeValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValue;
        /*    */     //   561: invokevirtual getHighMax : ()F
        /*    */     //   564: fload_0
        /*    */     //   565: fadd
        /*    */     //   566: fstore_0
        /*    */     //   567: new f/K5
        /*    */     //   570: dup
        /*    */     //   571: aload_2
        /*    */     //   572: aload_3
        /*    */     //   573: invokespecial <init> : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt;Lcom/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt;)V
        /*    */     //   576: invokestatic OC : (Lf/hk0;)Lf/Wz0;
        /*    */     //   579: invokevirtual PL : (Lf/Wz0;)Lf/So;
        /*    */     //   582: pop
        /*    */     //   583: getfield ki0 : Z
        /*    */     //   586: ifeq -> 592
        /*    */     //   589: aload #7
        /*    */     //   591: areturn
        /*    */     //   592: aload #7
        /*    */     //   594: fload_0
        /*    */     //   595: ldc_w 1000.0
        /*    */     //   598: fdiv
        /*    */     //   599: invokevirtual Wz0 : (F)Lf/So;
        /* 20 */     //   602: areturn } public final So Wt(hm0 paramhm0) { SK(paramhm0); return So.k60().PL(Wz0.OC((paramInt, paramsh) -> SK(paramhm0))); } public boolean tF0(boolean paramBoolean) { Gp0 gp0; int i; if ((gp0 = km.MR) != null && (i = h1.nv) > 0) { if (i >= 1 && yx0()) return false;  if (h1.nv >= 2) return false;  }  return true; } public final So cn(int paramInt1, int paramInt2, int paramInt3, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) { Hc0 hc0; uT uT1; this.hf.clear(); So so = So.k60(); if (paramInt1 != 14) { if (paramInt1 != 16) { if (!this.xh) eC.error("Unknown target_id for getMoveAnimation = " + paramInt1);  return so; }  fQ fQ1; if ((fQ1 = this.jN) != null && fQ1.Z8 > 0) { fQ2.getClass(); Object[] arrayOfObject = fQ1.Uq0; int i = fQ1.Z8; fQ fQ2; (fQ2 = this.hf).tu0(arrayOfObject, 0, i); }  } else { this.hf.Nv((Object[])this.TC0); }  paramFloat1 = paramFloat3 / 4.0F; paramFloat2 = paramFloat4 / 4.0F; paramFloat3 = (paramFloat2 + paramFloat1) / 2.0F; if (paramInt2 != 14) { if (paramInt2 != 15) { Hc0 hc01; switch (paramInt2) { default: if (!this.xh) eC.error("Unknown type_id for getMoveAnimation = " + paramInt1);  break;case 3: so.L5(); for (hc01 = this.hf.r30(); hc01.hasNext(); ) { uT1 = (uT)hc01.next(); so.eC().PL(Wz0.gq(uT1, 1, paramFloat3).a(uT1.He0.x + paramFloat1)).PL(Wz0.gq(uT1, 1, paramFloat3).a(uT1.He0.x - paramFloat1)).Kr(); so.eC().PL(Wz0.gq(uT1, 3, paramFloat3).a(uT1.He0.z + paramFloat2)).PL(Wz0.gq(uT1, 3, paramFloat3).a(uT1.He0.z - paramFloat2)).Kr(); }  so.Kr().Ck0(paramInt3, 0.0F); for (hc0 = this.hf.r30(); hasNext(); ) { so.PL(Wz0.gq(uT2, 1, paramFloat3).a(uT2.He0.x)); uT uT2; so.PL(Wz0.gq(uT2 = (uT)next(), 3, paramFloat3).a(uT2.He0.z)); }  break;case 2: so.L5(); for (hc0 = ((wb)super).hf.r30(); hasNext(); ) { uT uT2 = (uT)next(); so.eC().PL(Wz0.gq(uT2, 1, paramFloat3).a(uT2.He0.x + paramFloat1)).PL(Wz0.gq(uT2, 1, paramFloat3).a(uT2.He0.x)).Kr(); so.eC().PL(Wz0.gq(uT2, 2, paramFloat3).a(uT2.He0.y + paramFloat2))
        /*    */
        /* 22 */                 .PL(Wz0.gq(uT2, 2, paramFloat3).a(uT2.He0.y)).Kr();
    }  so.Kr().Ck0(paramInt3,0.0F);break;case 1:so.L5();for(hc0=((wb)super).hf.r30();hasNext();){uT uT2=(uT)next();so.eC()
        /*    */
        /* 24 */                 .PL(Wz0.gq(uT2,1,paramFloat3).a(uT2.He0.x+paramFloat1))
        /*    */
        /* 26 */                 .PL(Wz0.gq(uT2,1,paramFloat3).a(uT2.He0.x)).Kr();so.eC()
        /*    */
        /* 28 */                 .PL(Wz0.gq(uT2,2,paramFloat3).a(uT2.He0.y+paramFloat2))
        /*    */
        /* 30 */                 .PL(Wz0.gq(uT2,2,paramFloat3).a(uT2.He0.y)).Kr();}
        /*    */
        /*    */
        /*    */
        /*    */
        /*    */
        /*    */
        /*    */
        /*    */
        /*    */
        /*    */
        /*    */
        /* 42 */             so.Kr();case 0:case 4:so.L5();for(hc0=((wb)super).hf.r30();hasNext();){uT uT2=(uT)next();so.eC().PL(Wz0.gq(uT2,1,paramFloat3).a(uT2.He0.x+paramFloat1)).PL(Wz0.gq(uT2,1,paramFloat3).a(uT2.He0.x)).Kr();}so.Kr();case 5:break;}}else{super.UA0(uT1,0,0.0F,1.0F,3.0F);so.L5();for(hc0=((wb)super).hf.r30();hasNext();){uT uT2=(uT)next();so.L5().PL(Wz0.aG(8,uT2).qY(new float[]{1.0F,1.0F,1.0F,1.0F})).PL(Wz0.gq(uT2,1,paramFloat3).a(uT2.He0.x-paramFloat1)).Kr();so.L5().PL(Wz0.aG(8,uT2).qY(new float[]{1.0F,1.0F,1.0F,1.0F})).PL(Wz0.gq(uT2,2,paramFloat3).a(uT2.He0.y-paramFloat2)).Kr();}so.Kr();}}else{super.UA0(uT1,0,1.0F,0.0F,3.0F);so.L5();for(hc0=((wb)super).hf.r30();hasNext();){uT uT2=(uT)next();so.L5().PL(Wz0.gq(uT2,9,paramFloat3).a(0.0F)).PL(Wz0.gq(uT2,1,paramFloat3).a(uT2.He0.x+paramFloat1)).Kr();so.L5().PL(Wz0.gq(uT2,9,paramFloat3).a(0.0F)).PL(Wz0.gq(uT2,2,paramFloat3).a(uT2.He0.y+paramFloat2)).Kr();}so.Kr();}return so;}
/*    */
/*    */
/*    */   public final So UA0(int paramInt1,int paramInt2,float paramFloat1,float paramFloat2,float paramFloat3){
        /*    */     Hc0 hc02;
        /*    */     float[]arrayOfFloat1;
        /*    */     Color color1;
        /*    */     Color color2;
        /*    */     Hc0 hc04;
        /*    */     float[]arrayOfFloat2;
        /*    */     Color color3;
        /*    */     float f2;
        /*    */     Color color4;
        /*    */     So so=So.fD();
        /*    */     vH vH1;
        /*    */     if((vH1=this.pb)!=null&&paramFloat2==0.0F){
        /*    */       color2=Uz;
        /*    */       color2.r=arrayOfFloat[0];
        /*    */       color2.g=arrayOfFloat[1];
        /*    */       color2.b=arrayOfFloat[2];
        /*    */       float[]arrayOfFloat;
        /*    */       f2=(arrayOfFloat=vH1.Pz)[3];
        /*    */     }else{
        /*    */       Uz.set(dL.z2(color2));
        /*    */     }
        /*    */     float f1=10.0F;
        /*    */     switch(paramInt1){
/*    */       default:
        /*    */         return so;
        /*    */       case 4:
        /*    */         hc04=this.pb.IO.xl0.r30();
        /*    */         while(hc04.hasNext()){
        /*    */           arrayOfFloat[0]=color.r;
        /*    */           arrayOfFloat[1]=color.g;
        /*    */           float[]arrayOfFloat;
        /*    */           Color color;
        /*    */           (arrayOfFloat=new float[4])[2]=(color=Uz).b;
        /*    */           so.PL(Wz0.gq(hc04.next(),10,paramFloat3*f1).qY(new float[]{0,0,0,f2}));
        /*    */         }
        /*    */         f1=paramFloat3*f1;
        /*    */         arrayOfFloat2[0]=color4.r;
        /*    */         arrayOfFloat2[1]=color4.g;
        /*    */         (arrayOfFloat2=new float[4])[2]=(color4=Uz).b;
        /*    */         so.PL(Wz0.gq(this.pb.cH0,0,f1).qY(new float[]{0,0,0,paramFloat1}));
        /*    */         hc03=this.pb.COM7.xl0.r30();
        /*    */         while(hc03.hasNext()){
        /*    */           arrayOfFloat[0]=color4.r;
        /*    */           arrayOfFloat[1]=color4.g;
        /*    */           float[]arrayOfFloat;
        /*    */           (arrayOfFloat=new float[4])[2]=(color4=Uz).b;
        /*    */           so.PL(Wz0.gq(hc03.next(),10,f1).qY(new float[]{0,0,0,f2}));
        /*    */         }
        /*    */         hc02=this.pb.Yh0.xl0.r30();
        /*    */         while(hasNext()){
        /*    */           arrayOfFloat[0]=color3.r;
        /*    */           arrayOfFloat[1]=color3.g;
        /*    */           float[]arrayOfFloat;
        /*    */           (arrayOfFloat=new float[4])[2]=(color3=Uz).b;
        /*    */           so.PL(Wz0.gq(next(),10,f1).qY(new float[]{0,0,0,f2}));
        /*    */         }
        /*    */       case 3:
        /*    */         this[0]=color1.r;
        /*    */         this[1]=color1.g;
        /*    */         (arrayOfFloat1=new float[4])[2]=(color1=Uz).b;
        /*    */         so.PL(Wz0.gq(((wb)super).pb.cH0,0,color4*f1).qY(new float[]{0,0,0,color3}));
        /*    */       case 2:
        /*    */         hc03=((wb)super).pb.IO.xl0.r30();
        /*    */         while(hc03.hasNext()){
        /*    */           arrayOfFloat[0]=color.r;
        /*    */           arrayOfFloat[1]=color.g;
        /*    */           float[]arrayOfFloat;
        /*    */           Color color;
        /*    */           (arrayOfFloat=new float[4])[2]=(color=Uz).b;
        /*    */           so.PL(Wz0.gq(hc03.next(),10,color4*color1).qY(new float[]{0,0,0,f2}));
        /*    */         }
        /*    */         hc03=((wb)super).pb.COM7.xl0.r30();
        /*    */         while(hc03.hasNext()){
        /*    */           arrayOfFloat[0]=color.r;
        /*    */           arrayOfFloat[1]=color.g;
        /*    */           float[]arrayOfFloat;
        /*    */           Color color;
        /*    */           (arrayOfFloat=new float[4])[2]=(color=Uz).b;
        /*    */           so.PL(Wz0.gq(hc03.next(),10,color4*color1).qY(new float[]{0,0,0,f2}));
        /*    */         }
        /*    */         hc01=((wb)super).pb.Yh0.xl0.r30();
        /*    */         while(hasNext()){
        /*    */           arrayOfFloat[0]=color3.r;
        /*    */           arrayOfFloat[1]=color3.g;
        /*    */           float[]arrayOfFloat;
        /*    */           (arrayOfFloat=new float[4])[2]=(color3=Uz).b;
        /*    */           so.PL(Wz0.gq(next(),10,color4*color1).qY(new float[]{0,0,0,f2}));
        /*    */         }
        /*    */       case 1:
        /*    */         hc01=((wb)super).pb.IO.xl0.r30();
        /*    */         while(hasNext()){
        /*    */           arrayOfFloat[0]=color3.r;
        /*    */           arrayOfFloat[1]=color3.g;
        /*    */           float[]arrayOfFloat;
        /*    */           (arrayOfFloat=new float[4])[2]=(color3=Uz).b;
        /*    */           so.PL(Wz0.gq(next(),10,color4*color1).qY(new float[]{0,0,0,f2}));
        /*    */         }
        /*    */       case 0:
        /*    */         break;
        /*    */     }
        /*    */     Hc0 hc03=((wb)super).pb.COM7.xl0.r30();
        /*    */     while(hc03.hasNext()){
        /*    */       arrayOfFloat[0]=color.r;
        /*    */       arrayOfFloat[1]=color.g;
        /*    */       float[]arrayOfFloat;
        /*    */       Color color;
        /*    */       (arrayOfFloat=new float[4])[2]=(color=Uz).b;
        /*    */       so.PL(Wz0.gq(hc03.next(),10,color4*color1).qY(new float[]{0,0,0,f2}));
        /*    */     }
        /*    */     Hc0 hc01=((wb)super).pb.Yh0.xl0.r30();
        /*    */     while(hasNext()){
        /*    */       arrayOfFloat[0]=color3.r;
        /*    */       arrayOfFloat[1]=color3.g;
        /*    */       float[]arrayOfFloat;
        /*    */       (arrayOfFloat=new float[4])[2]=(color3=Uz).b;
        /*    */       so.PL(Wz0.gq(next(),10,color4*color1).qY(new float[]{0,0,0,f2}));
        /*    */     }
        /*    */   }
/*    */
/*    */   public final void iP(hm0[]paramArrayOfhm0){
        /*    */     this();
        /*    */     fQ fQ1;
        /*    */     this.KO=fQ1;
        /*    */     this();
        /*    */     int i;
        /*    */     byte b;
        /*    */     for(this.jN=fQ1,i=paramArrayOfhm0.length,b=0;b<i; ){
        /*    */       hm0 hm01;
        /*    */       if((hm01=paramArrayOfhm0[b])!=null&&!hm01.aJ0&&hm01.El0){
        /*    */         if(this.M7==null)
        /*    */           this.M7=hm01;
        /*    */         this.KO.Com3(hm01);
        /*    */         this.jN.Nv((Object[])hm01.qf);
        /*    */         this.XW=hm01.FT;
        /*    */       }
        /*    */       b++;
        /*    */     }
        /*    */     tS();
        /*    */   }
/*    */
/*    */   public final Wz0 RZ(){
        /*    */     return Wz0.OC((paramInt,paramsh)->OJ(paramParticleEffectExt));
        /*    */   }
/*    */
/*    */   public final Wz0 QI0(Ht0 paramHt0){
        /*    */     return Wz0.OC((paramInt,paramsh)->OJ(paramParticleEffectExt));
        /*    */   }
/*    */
/*    */   public final So rF(int paramInt1,int paramInt2,float paramFloat1,float paramFloat2){
        /*    */     So so=So.k60();
        /*    */     if(paramInt2==1)
        /*    */       so.PL(Wz0.OC(new kd(this,paramInt1,paramFloat1,paramFloat2)));
        /*    */     return so;
        /*    */   }
/*    */
/*    */   public final So hg(int paramInt1,int paramInt2,int paramInt3,int paramInt4,float paramFloat){
        /*    */     // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: getfield y1 : Lf/Ut0;
        /*    */     //   4: iload_1
        /*    */     //   5: invokevirtual Z6 : (I)Ljava/lang/Object;
        /*    */     //   8: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleEffectExt
        /*    */     //   11: dup
        /*    */     //   12: astore_1
        /*    */     //   13: invokevirtual getControllers : ()Lf/fQ;
        /*    */     //   16: getfield Z8 : I
        /*    */     //   19: ifne -> 26
        /*    */     //   22: invokestatic fD : ()Lf/So;
        /*    */     //   25: areturn
        /*    */     //   26: aload_1
        /*    */     //   27: invokevirtual getControllers : ()Lf/fQ;
        /*    */     //   30: getfield Z8 : I
        /*    */     //   33: iload_2
        /*    */     //   34: if_icmpgt -> 41
        /*    */     //   37: invokestatic fD : ()Lf/So;
        /*    */     //   40: areturn
        /*    */     //   41: iload_3
        /*    */     //   42: aload_1
        /*    */     //   43: dup
        /*    */     //   44: invokevirtual getControllers : ()Lf/fQ;
        /*    */     //   47: iload_2
        /*    */     //   48: invokevirtual get : (I)Ljava/lang/Object;
        /*    */     //   51: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleController
        /*    */     //   54: invokevirtual copy : ()Lcom/badlogic/gdx/graphics/g3d/particles/ParticleController;
        /*    */     //   57: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt
        /*    */     //   60: astore_2
        /*    */     //   61: invokevirtual getControllers : ()Lf/fQ;
        /*    */     //   64: aload_2
        /*    */     //   65: invokevirtual Com3 : (Ljava/lang/Object;)V
        /*    */     //   68: invokestatic k60 : ()Lf/So;
        /*    */     //   71: astore #6
        /*    */     //   73: ifeq -> 151
        /*    */     //   76: iload_3
        /*    */     //   77: iconst_1
        /*    */     //   78: if_icmpeq -> 142
        /*    */     //   81: iload_3
        /*    */     //   82: iconst_2
        /*    */     //   83: if_icmpeq -> 142
        /*    */     //   86: iload_3
        /*    */     //   87: bipush #9
        /*    */     //   89: if_icmpeq -> 151
        /*    */     //   92: iload_3
        /*    */     //   93: bipush #11
        /*    */     //   95: if_icmpeq -> 142
        /*    */     //   98: iload_3
        /*    */     //   99: bipush #13
        /*    */     //   101: if_icmpeq -> 151
        /*    */     //   104: aload_0
        /*    */     //   105: getfield xh : Z
        /*    */     //   108: ifne -> 157
        /*    */     //   111: getstatic f/wb.eC : Lf/ik;
        /*    */     //   114: new java/lang/StringBuilder
        /*    */     //   117: dup
        /*    */     //   118: invokespecial <init> : ()V
        /*    */     //   121: ldc_w 'UNK TARGET TYPE = '
        /*    */     //   124: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
        /*    */     //   127: iload_3
        /*    */     //   128: invokevirtual append : (I)Ljava/lang/StringBuilder;
        /*    */     //   131: invokevirtual toString : ()Ljava/lang/String;
        /*    */     //   134: invokeinterface error : (Ljava/lang/String;)V
        /*    */     //   139: goto -> 157
        /*    */     //   142: getstatic f/K50.zN : Lf/K50;
        /*    */     //   145: putstatic f/q10.Nl : Lf/K50;
        /*    */     //   148: goto -> 157
        /*    */     //   151: getstatic f/K50.qF : Lf/K50;
        /*    */     //   154: putstatic f/q10.Nl : Lf/K50;
        /*    */     //   157: iload #4
        /*    */     //   159: iconst_1
        /*    */     //   160: if_icmpeq -> 205
        /*    */     //   163: iload #4
        /*    */     //   165: bipush #11
        /*    */     //   167: if_icmpeq -> 205
        /*    */     //   170: iload #4
        /*    */     //   172: bipush #8
        /*    */     //   174: if_icmpeq -> 196
        /*    */     //   177: iload #4
        /*    */     //   179: bipush #9
        /*    */     //   181: if_icmpeq -> 187
        /*    */     //   184: goto -> 211
        /*    */     //   187: getstatic f/K50.qF : Lf/K50;
        /*    */     //   190: putstatic f/q10.aA : Lf/K50;
        /*    */     //   193: goto -> 211
        /*    */     //   196: getstatic f/K50.if : Lf/K50;
        /*    */     //   199: putstatic f/q10.aA : Lf/K50;
        /*    */     //   202: goto -> 211
        /*    */     //   205: getstatic f/K50.zN : Lf/K50;
        /*    */     //   208: putstatic f/q10.aA : Lf/K50;
        /*    */     //   211: aload_2
        /*    */     //   212: getfield influencers : Lf/fQ;
        /*    */     //   215: invokevirtual r30 : ()Lf/Hc0;
        /*    */     //   218: astore_3
        /*    */     //   219: aload_3
        /*    */     //   220: invokevirtual hasNext : ()Z
        /*    */     //   223: ifeq -> 301
        /*    */     //   226: aload_3
        /*    */     //   227: invokevirtual next : ()Ljava/lang/Object;
        /*    */     //   230: checkcast com/badlogic/gdx/graphics/g3d/particles/influencers/Influencer
        /*    */     //   233: dup
        /*    */     //   234: astore #4
        /*    */     //   236: instanceof com/badlogic/gdx/graphics/g3d/particles/influencers/ControllerSpawnInfluencer
        /*    */     //   239: ifeq -> 219
        /*    */     //   242: aload #4
        /*    */     //   244: checkcast com/badlogic/gdx/graphics/g3d/particles/influencers/ControllerSpawnInfluencer
        /*    */     //   247: dup
        /*    */     //   248: astore #4
        /*    */     //   250: getfield spawnType : Lcom/badlogic/gdx/graphics/g3d/particles/values/NumericValue;
        /*    */     //   253: astore #7
        /*    */     //   255: getstatic f/q10.Nl : Lf/K50;
        /*    */     //   258: getstatic f/K50.zN : Lf/K50;
        /*    */     //   261: if_acmpne -> 270
        /*    */     //   264: fconst_1
        /*    */     //   265: fstore #8
        /*    */     //   267: goto -> 273
        /*    */     //   270: fconst_0
        /*    */     //   271: fstore #8
        /*    */     //   273: aload #4
        /*    */     //   275: aload #7
        /*    */     //   277: fload #8
        /*    */     //   279: invokevirtual setValue : (F)V
        /*    */     //   282: getfield spawnAdjustment : Lf/eo;
        /*    */     //   285: fload #5
        /*    */     //   287: ldc_w 0.5
        /*    */     //   290: fsub
        /*    */     //   291: fconst_0
        /*    */     //   292: swap
        /*    */     //   293: fconst_0
        /*    */     //   294: invokevirtual Tz : (FFF)Lf/eo;
        /*    */     //   297: pop
        /*    */     //   298: goto -> 219
        /*    */     //   301: aload_2
        /*    */     //   302: dup
        /*    */     //   303: aload_0
        /*    */     //   304: getfield ts0 : Lf/fQ;
        /*    */     //   307: aload_1
        /*    */     //   308: invokevirtual Com3 : (Ljava/lang/Object;)V
        /*    */     //   311: invokevirtual init : ()V
        /*    */     //   314: aconst_null
        /*    */     //   315: astore_3
        /*    */     //   316: getfield trailController : I
        /*    */     //   319: iflt -> 346
        /*    */     //   322: aload_2
        /*    */     //   323: aload_1
        /*    */     //   324: invokevirtual getControllers : ()Lf/fQ;
        /*    */     //   327: aload_2
        /*    */     //   328: getfield trailController : I
        /*    */     //   331: invokevirtual get : (I)Ljava/lang/Object;
        /*    */     //   334: checkcast com/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt
        /*    */     //   337: dup
        /*    */     //   338: dup
        /*    */     //   339: astore_3
        /*    */     //   340: invokevirtual init : ()V
        /*    */     //   343: invokevirtual updateTrailController : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt;)V
        /*    */     //   346: aload_0
        /*    */     //   347: aload #6
        /*    */     //   349: aload_2
        /*    */     //   350: aload_3
        /*    */     //   351: aload_2
        /*    */     //   352: getfield emitter : Lcom/badlogic/gdx/graphics/g3d/particles/emitters/Emitter;
        /*    */     //   355: checkcast com/badlogic/gdx/graphics/g3d/particles/emitters/RegularEmitter
        /*    */     //   358: dup
        /*    */     //   359: dup
        /*    */     //   360: getfield delayValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/RangedNumericValue;
        /*    */     //   363: invokevirtual getLowMax : ()F
        /*    */     //   366: fstore_0
        /*    */     //   367: getfield durationValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/RangedNumericValue;
        /*    */     //   370: invokevirtual getLowMax : ()F
        /*    */     //   373: fload_0
        /*    */     //   374: fadd
        /*    */     //   375: fstore_0
        /*    */     //   376: getfield lifeValue : Lcom/badlogic/gdx/graphics/g3d/particles/values/ScaledNumericValue;
        /*    */     //   379: invokevirtual getHighMax : ()F
        /*    */     //   382: fload_0
        /*    */     //   383: fadd
        /*    */     //   384: fstore_0
        /*    */     //   385: <illegal opcode> Do : (Lcom/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt;Lcom/badlogic/gdx/graphics/g3d/particles/ParticleControllerExt;)Lf/hk0;
        /*    */     //   390: invokestatic OC : (Lf/hk0;)Lf/Wz0;
        /*    */     //   393: invokevirtual PL : (Lf/Wz0;)Lf/So;
        /*    */     //   396: pop
        /*    */     //   397: getfield ki0 : Z
        /*    */     //   400: ifeq -> 406
        /*    */     //   403: aload #6
        /*    */     //   405: areturn
        /*    */     //   406: aload #6
        /*    */     //   408: fload_0
        /*    */     //   409: ldc_w 1000.0
        /*    */     //   412: fdiv
        /*    */     //   413: invokevirtual Wz0 : (F)Lf/So;
        /*    */     //   416: areturn
        /*    */   }
/*    */
/*    */   public final So r60(boolean paramBoolean,float paramFloat){
        /*    */     // Byte code:
        /*    */     //   0: iload_1
        /*    */     //   1: bipush #14
        /*    */     //   3: istore_1
        /*    */     //   4: invokestatic k60 : ()Lf/So;
        /*    */     //   7: astore_3
        /*    */     //   8: ifeq -> 13
        /*    */     //   11: aload_3
        /*    */     //   12: areturn
        /*    */     //   13: aload_3
        /*    */     //   14: dup
        /*    */     //   15: aload_0
        /*    */     //   16: iload_1
        /*    */     //   17: <illegal opcode> Do : (Lf/wb;I)Lf/hk0;
        /*    */     //   22: invokestatic OC : (Lf/hk0;)Lf/Wz0;
        /*    */     //   25: fload_2
        /*    */     //   26: ldc_w 1000.0
        /*    */     //   29: fdiv
        /*    */     //   30: invokevirtual Vq : (F)Lf/sh;
        /*    */     //   33: checkcast f/Wz0
        /*    */     //   36: aload_0
        /*    */     //   37: getfield pb : Lf/vH;
        /*    */     //   40: getfield dr0 : Lf/G30;
        /*    */     //   43: invokevirtual mg : (Lf/G30;)Lf/sh;
        /*    */     //   46: checkcast f/Wz0
        /*    */     //   49: invokevirtual PL : (Lf/Wz0;)Lf/So;
        /*    */     //   52: pop
        /*    */     //   53: areturn
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 37
        /*    */     //   #2	-> 40
        /*    */     //   #3	-> 43
        /*    */   }}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/wb.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */