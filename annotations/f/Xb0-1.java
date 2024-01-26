/* 1 */
package f;

public final class Xb0 implements OL {
    public final void update() {
        if (this.jj0) return;
        fQ fQ1;
        for (byte b = 0; b < (fQ1 = this.uH).Z8; ) {
            /* 2 */
            LE lE;
            int i;
            if (!(lE = ((LE[]) fQ1.Uq0)[b]).Lpt8.jj0 && (i = lE.TO) != -1) {
                int j;
                int k;
                for (i = 0, j = AL10.alGetSourcei(i, 4118); j-- > 0 && (k = AL10.alSourceUnqueueBuffers(lE.TO)) != 40963; ) {
                    G3 g3;
                    int m;
                    if ((m = (g3 = lE.tE0).NB0) > 0)
                        /* 3 */ {
                        int n = m - 1;
                        g3.By0[
                                /* 4 */                 n];
                    }
                    if (i != 0) continue;
                    if (lE
/* 5 */.xb0(k)) {
                        AL10.alSourceQueueBuffers(lE.TO, k);
                        continue;
                    }
                    i = 1;
                }
                if (i != 0 && AL10.alGetSourcei(lE.TO, 4117) == 0) lE.stop();
                if (lE.SL0 && AL10.alGetSourcei(lE.TO, 4112) != 4114) AL10.alSourcePlay(lE.TO);
            }
            b++;
            /*   */
        }
    }

    /*   */
    /*   */
    /*   */   public final int G;
    /*   */   public final int U4;
    /*   */   public o0 a10;
    /*   */   public o0 ld;
    /*   */   public LF0 vI0;
    /*   */   public y10 lpT8;
    /*   */   public long z30;
    /*   */   public f7 HO;
    /*   */   public f7 NJ0;
    /*   */   public Hn[] o;
    /*   */   public int pX;
    /*   */   public String SO;
    /*   */   public Thread oM;
    /*   */   public fQ uH;
    /*   */   public long Jx;
    /*   */   public long fd0;
    /*   */   public boolean jj0;

    /*   */
    /*   */
    public Xb0() {
        /*   */
        this(16, 9, 512);
        /*   */
    }

    /*   */
    /*   */
    public Xb0(int paramInt1, int paramInt2, int paramInt3) {
        /*   */
        o0 o01;
        /*   */
        this.z30 = 0L;
        /*   */
        this.HO = new f7();
        /*   */
        this.NJ0 = new f7();
        /*   */
        this.pX = -1;
        /*   */
        this.SO = null;
        /*   */
        this.uH = new fQ(false, 1, LE.class);
        /*   */
        this.jj0 = false;
        /*   */
        this.G = paramInt3;
        /*   */
        this.U4 = paramInt2;
        /*   */
        ng0(C5.class, "ogg");
        /*   */
        rZ(Pp.class, "ogg");
        /*   */
        ng0(UE.class, "wav");
        /*   */
        rZ(TO.class, "wav");
        /*   */
        ng0(OK.class, "mp3");
        /*   */
        rZ(Kg0.class, "mp3");
        /*   */
        this.Jx = l1;
        /*   */
        long l1;
        /*   */
        if ((l1 = ALC10.alcOpenDevice(null)) == 0L) {
            /*   */
            this.jj0 = true;
            /*   */
            return;
            /*   */
        }
        /*   */
        ALCCapabilities aLCCapabilities = ALC.createCapabilities(l1);
        /*   */
        this.fd0 = l2;
        /*   */
        long l2;
        /*   */
        if ((l2 = ALC10.alcCreateContext(this.Jx, null)) == 0L) {
            /*   */
            ALC10.alcCloseDevice(this.Jx);
            /*   */
            this.jj0 = true;
            /*   */
            return;
            /*   */
        }
        /*   */
        if (!ALC10.alcMakeContextCurrent(l2)) {
            /*   */
            this.jj0 = true;
            /*   */
            return;
            /*   */
        }
        /*   */
        AL.createCapabilities(aLCCapabilities);
        /*   */
        AL10.alGetError();
        /*   */
        this(false, paramInt1);
        /*   */
        this.ld = o01;
        /*   */
        for (byte b = 0; b < paramInt1; b++) {
            /*   */
            paramInt3 = AL10.alGenSources();
            /*   */
            if (AL10.alGetError() != 0)
                /*   */ break;
            /*   */
            this.ld.oU(paramInt3);
            /*   */
        }
        /*   */
        this.a10 = new o0(this.ld);
        /*   */
        this.vI0 = new LF0();
        /*   */
        this.lpT8 = new y10();
        /*   */
        FloatBuffer floatBuffer;
        /*   */
        (floatBuffer = BufferUtils.createFloatBuffer(6).put(new float[]{0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F})).flip();
        /*   */
        AL10.alListenerfv(4111, floatBuffer);
        /*   */
        (floatBuffer = BufferUtils.createFloatBuffer(3).put(new float[]{0.0F, 0.0F, 0.0F})).flip();
        /*   */
        AL10.alListenerfv(4102, floatBuffer);
        /*   */
        (floatBuffer = BufferUtils.createFloatBuffer(3).put(new float[]{0.0F, 0.0F, 0.0F})).flip();
        /*   */
        AL10.alListenerfv(4100, floatBuffer);
        /*   */
        AL10.alDisable(6571);
        /*   */
        (this.oM = new Thread(new Mp(this))).setDaemon(true);
        /*   */
        this.oM.start();
        /*   */
        this.o = new Hn[paramInt1];
        /*   */
    }

    /*   */
    /*   */
    public final boolean Yr0(String paramString, boolean paramBoolean) {
        /*   */
        if (paramBoolean)
            /*   */ this.SO = paramString;
        /*   */
        return (paramString == null) ? SOFTReopenDevice.nalcReopenDeviceSOFT(this.Jx, MemoryUtil.memAddressSafe(null), MemoryUtil.memAddressSafe(null)) : SOFTReopenDevice.alcReopenDeviceSOFT(this.Jx, paramString, null);
        /*   */
    }

    /*   */
    /*   */
    public final boolean gW(String paramString) {
        /*   */
        return Yr0(paramString, true);
        /*   */
    }

    /*   */
    /*   */
    public final String[] Mv() {
        /*   */
        List list;
        /*   */
        return ((list = ALUtil.getStringList(0L, 4115)) == null) ? new String[0] : toArray(new String[0]);
        /*   */
    }

    /*   */
    /*   */
    public final int VH(boolean paramBoolean) {
        /*   */
        if (this.jj0)
            /*   */ return 0;
        /*   */
        byte b = 0;
        /*   */
        int i = this.a10.mG0;
        /*   */
        while (b < i) {
            /*   */
            int j;
            /*   */
            int k;
            /*   */
            if ((k = AL10.alGetSourcei(j = this.a10.Vl(b), 4112)) != 4114 && k != 4115) {
                /*   */
                Long long_;
                /*   */
                if ((long_ = (Long) this.lpT8.remove(j)) != null)
                    /*   */ this.vI0.sH(long_.longValue());
                /*   */
                if (paramBoolean) {
                    /*   */
                    this.a10.Yv0(b);
                    /*   */
                } else {
                    /*   */
                    long l;
                    /*   */
                    this.z30 = (l = this.z30) + 1L;
                    /*   */
                    this.lpT8.tD0(j, Long.valueOf(l));
                    /*   */
                    this.vI0.dG0(l, Integer.valueOf(j));
                    /*   */
                }
                /*   */
                AL10.alSourceStop(j);
                /*   */
                AL10.alSourcei(j, 4105, 0);
                /*   */
                AL10.alSourcef(j, 4106, 1.0F);
                /*   */
                AL10.alSourcef(j, 4099, 1.0F);
                /*   */
                AL10.alSource3f(j, 4100, 0.0F, 0.0F, 1.0F);
                /*   */
                AL10.alSourcei(j, 4147, 1);
                /*   */
                return j;
                /*   */
            }
            /*   */
            b++;
            /*   */
        }
        /*   */
        return -1;
        /*   */
    }

    /*   */
    /*   */
    public final void dispose() {
        /*   */
        if (this.jj0)
            /*   */ return;
        /*   */
        this.oM.interrupt();
        /*   */
        byte b = 0;
        /*   */
        int i = this.ld.mG0;
        /*   */
        while (b < i) {
            /*   */
            int j;
            /*   */
            if (AL10.alGetSourcei(j = this.ld.Vl(b), 4112) != 4116)
                /*   */ AL10.alSourceStop(j);
            /*   */
            AL10.alDeleteSources(j);
            /*   */
            b++;
            /*   */
        }
        /*   */
        this.lpT8 = null;
        /*   */
        this.vI0 = null;
        /*   */
        ALC10.alcDestroyContext(this.fd0);
        /*   */
        ALC10.alcCloseDevice(this.Jx);
        /*   */
    }

    /*   */
    /*   */
    public final s70 wf0(RD0 paramRD0) {
        /*   */
        if (paramRD0 != null) {
            /*   */
            Class<LE> clazz;
            /*   */
            if ((clazz = (Class) this.NJ0.pd0(paramRD0.il0().toLowerCase())) != null)
                /*   */ try {
                /*   */
                return clazz.getConstructor(new Class[]{Xb0.class, RD0.class}).newInstance(new Object[]{this, paramRD0});
                /*   */
            } catch (Exception exception) {
                /*   */
                throw new JU(B40.df("Error creating music ").append(clazz.getName()).append(" for file: ").append(paramRD0).toString(), this);
                /*   */
            }
            /*   */
            throw new JU("Unknown file extension for music: " + paramRD0);
            /*   */
        }
        /*   */
        throw new IllegalArgumentException("file cannot be null.");
        /*   */
    }

    /*   */
    /*   */
    public final cF V2(RD0 paramRD0) {
        /*   */
        if (paramRD0 != null) {
            /*   */
            Class<Hn> clazz;
            /*   */
            if ((clazz = (Class) this.HO.pd0(paramRD0.il0().toLowerCase())) != null)
                /*   */ try {
                /*   */
                return clazz.getConstructor(new Class[]{Xb0.class, RD0.class}).newInstance(new Object[]{this, paramRD0});
                /*   */
            } catch (Exception exception) {
                /*   */
                throw new JU(B40.df("Error creating sound ").append(clazz.getName()).append(" for file: ").append(paramRD0).toString(), this);
                /*   */
            }
            /*   */
            throw new JU("Unknown file extension for sound: " + paramRD0);
            /*   */
        }
        /*   */
        throw new IllegalArgumentException("file cannot be null.");
        /*   */
    }

    /*   */
    /*   */
    public final void ng0(Class paramClass, String paramString) {
        /*   */
        this.HO.X00(paramString, paramClass);
        /*   */
    }

    /*   */
    /*   */
    public final void rZ(Class paramClass, String paramString) {
        /*   */
        this.NJ0.X00(paramString, paramClass);
        /*   */
    }

    /*   */
    /*   */
    public final cw0 rF(int paramInt) {
        /*   */
        boolean bool = false;
        /*   */
        if (this.jj0)
            /*   */ return new qD();
        /*   */
        int i = this.G;
        /*   */
        int j = this.U4;
        /*   */
        return new Kn(this, paramInt, bool, i, j);
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Xb0.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */