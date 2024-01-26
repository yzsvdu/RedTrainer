/*  1 */
package f;

public final class Q50 implements IM {
    public static GLFWErrorCallback ok;
    public static Lh VE;
    public static Callback Ci;
    public final fa v30;
    public final fQ Cs0 = new fQ(); // object array that holds Hc0's which are object arrays
    public OL qU; // music object
    public final Xu fl0;

    // Initializes glfwInit
    public static void vp() {
        if (ok == null) {
            if (q00.Ar) try {
                Class<?> clazz;
                Configuration.GLFW_LIBRARY_NAME.set(((File) (clazz = Class.forName("com.badlogic.gdx.backends.lwjgl3.awt.GlfwAWTLoader")).getMethod("load", new Class[0]).invoke(clazz, new Object[0])).getAbsolutePath());
            } catch (ClassNotFoundException classNotFoundException) {
            } finally {
                Exception exception = null;
            }
            /*    */
            /*  3 */
            synchronized (Ju.class)
                /*  4 */ {
                if (Ju.js0) {
                } else {
                    (new q00()).fG("gdx");
                    Ju.js0 = true;
                }
                /*  5 */
                GLFW.glfwSetErrorCallback((GLFWErrorCallbackI) (ok = GLFWErrorCallback.createPrint(fa.Qe0)));
                if (q00.Ar) GLFW.glfwInitHint(327682, 225288);
                GLFW.glfwInitHint(327681, 0);
                if (!GLFW.glfwInit()) throw new JU("Unable to initialize GLFW");
            }
        }
    }

    public int Bs = 2;
    public bQ Aa0;
    public volatile boolean K7 = true;
    public final fQ E6 = new fQ(); // jamepad controller objects, probably for controller inputs
    public final fQ ZO = new fQ(); // what objects?
    public final fQ oB = new fQ(); //what objects ?
    public final Cw Vc0; // glfw time

    public final void rK() {
        this();
        fQ fQ1;
        while (this.K7 && this.Cs0.Z8 > 0) {
            fQ fQ2; //initalizes an Object Array
            long l;
            this.qU.update(); //updates music
            boolean bool = false;
            fQ1.clear(); // clears object array
            int i;
            Hc0 hc0;
            for (i = -2, hc0 = this.Cs0.r30(); hc0.hasNext(); ) {
                hj0 hj01;
                fQ fQ3;
                MJ0 mJ0;
                w70 w70 = (mJ0 = (MJ0) hc0.next()).Ai;
                hj0 hj02 = (mJ0 = (MJ0) hc0.next()).Ai.j60;
                if ((mJ0 = (MJ0) hc0.next()).Ai.j60 != null) {
                    hj01 = hj02;
                } else {
                    hj01 = ((w70) hj01).zW;
                }
                /*  6 */
                UB0.re0 = hj01;
                if (hj02 == null) hj02 = hj01;
                UB0.go = hj02;
                UB0.PU = mJ0.wR;
                GLFW.glfwMakeContextCurrent(mJ0.ne0);
                if (i == -2)
                    /*    */ {
                    /*  8 */
                    i = mJ0.oA0.cC;
                }  /* monitor enter ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
                try {
                    bool |= mJ0.a00();
                }
                /*    */ finally
                    /* 10 */ {
                    this = null; /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
                }
            }
            GLFW.glfwPollEvents(); /* monitor enter BinaryOperatorExpression{ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} = FieldReferenceExpression{lastType=ObjectType{f/fQ}, expression=ThisExpression{ObjectType{f/Q50}}, name=E6, descriptor=Lf/fQ;}} */
            try {
                boolean bool1;
                if (this.E6.Z8 > 0) {
                    bool1 = true;
                } else {
                    bool1 = false;
                }
                this.ZO.clear();
                this.ZO.OG0(this.E6);
                this.E6.clear(); /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{f/fQ}, name=null} */
                Hc0 hc01;
                for (hc01 = this.ZO.r30(); hc01.hasNext(); ((Runnable) hc01.next()).run()) ;
                if (bool1) for (hc01 = this.Cs0.r30(); hc01.hasNext(); )
                    /*    */
                    /* 12 */ {
                    if (!(mJ0 = (MJ0) hc01.next()).Ai.zg0) mJ0
/* 13 */.df0();
                }
                for (hc01 = fQ1.r30(); hc01.hasNext(); ) {
                    MJ0 mJ0 = (MJ0) hc01.next();
                    if (this.Cs0.Z8 == 1) {
                        for (int j = this.oB.Z8 - 1; j >= 0; ) {
                            ((lu) this.oB.get(j)).oC0();
                            ((lu) this.oB.get(j)).dispose();
                            j--;
                        }
                        this.oB.clear();
                    }
                    mJ0.dispose();
                    this.Cs0.Ct(mJ0, false);
                    /*    */
                    /*    */
                    /*    */
                    /*    */
                    /*    */
                    /*    */
                    /*    */
                }
                /*    */
                /*    */
                /*    */
                /*    */
                /*    */
                /*    */
                /*    */
                /*    */
            }
            /*    */
            /*    */ finally
                /*    */
                /*    */ {
                /*    */
                /*    */
                /*    */
                /*    */
                /*    */
                /* 38 */
                this = null;
                /*    */         /* monitor exit ClassFileLocalVariableReferenceExpression{type=PrimitiveType{primitive=long}, name=null} */
            }
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    /*    */
    public static void Sk0() {
        /*    */
        Exception exception;
        /*    */
        try {
            /*    */
            Class<ANGLELoader> clazz;
            /*    */
            (clazz = ANGLELoader.class).getMethod("load", new Class[0]).invoke(clazz, new Object[0]);
            /*    */
            return;
            /*    */
        } catch (ClassNotFoundException classNotFoundException) {
            /*    */
            /*    */
        } finally {
        }
        /*    */
        throw new JU("Couldn't load ANGLE.", exception);
        /*    */
    }

    /*    */
    /*    */
    public static void oV() {
        /*    */
        Exception exception;
        /*    */
        try {
            /*    */
            Class<ANGLELoader> clazz;
            /*    */
            (clazz = ANGLELoader.class).getMethod("postGlfwInit", new Class[0]).invoke(clazz, new Object[0]);
            /*    */
            return;
            /*    */
        } catch (ClassNotFoundException classNotFoundException) {
            /*    */
            /*    */
        } finally {
        }
        /*    */
        throw new JU("Couldn't load ANGLE.", exception);
        /*    */
    }

    /*    */
    /*    */
    public Q50(tG0 paramtG0) {
        /*    */
        this();
        /*    */
        fa fa1;
        /*    */
        this(paramtG0, this);
        /*    */
    }

    /*    */
    /*    */
    public Q50(tG0 paramtG0, fa paramfa) {
        /*    */
        if (paramfa.o8 == fN.xb0)
            /*    */ Sk0();
        /*    */
        vp();
        /*    */
        so(new bQ());
        /*    */
        this.v30 = paramfa = fa.E70(paramfa);
        /*    */
        if (paramfa.pk0 == null)
            /*    */ paramfa.pk0 = paramtG0.getClass().getSimpleName();
        /*    */
        UB0.Kg0 = this;
        /*    */
        if (!paramfa.WE) {
            /*    */
            try {
                /*    */
                this.qU = cY(paramfa);
                /*    */
            } finally {
                /*    */
                a30 a30;
                /*    */
                Exception exception = null;
                /*    */
                sf(exception);
                /*    */
                this();
                /*    */
            }
            /*    */
        } else {
            /*    */
            a30 a30;
            /*    */
            this();
            /*    */
            this.qU = a30;
            /*    */
        }
        /*    */
        UB0.L90 = this.qU;
        /*    */
        UB0.vj0 = Qp();
        /*    */
        UB0.LL0 = new wv0(paramfa);
        /*    */
        this.fl0 = new Xu();
        /*    */
        this.Vc0 = new Cw();
        /*    */
        MJ0 mJ0 = t80(paramfa, paramtG0);
        /*    */
        if (paramfa.o8 == fN.xb0)
            /*    */ oV();
        /*    */
        this.Cs0.Com3(mJ0);
        /*    */
        try {
            /*    */
            rK();
            /*    */
            xE0();
            /*    */
            return;
            /*    */
        } finally {
            /*    */
            mJ0 = null;
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public static Xb0 cY(fa paramfa) {
        /*    */
        int i = paramfa.ng0;
        /*    */
        int j = paramfa.vH0;
        /*    */
        int k = paramfa.Fl;
        /*    */
        return new Xb0(i, j, k);
        /*    */
    }

    /*    */
    /*    */
    public static XG Qp() {
        /*    */
        return new XG();
        /*    */
    }

    /*    */ public static void COM7(MJ0 var0, fa var1_4, long var2_5) {
        block60: {
            block62: {
                block61: {
                    v0 = var1_4;
                    GLFW.glfwDefaultWindowHints();
                    GLFW.glfwWindowHint(131076, 0);
                    GLFW.glfwWindowHint(131075, (int)v0.c0);
                    GLFW.glfwWindowHint(131080, (int)v0.CoM8);
                    GLFW.glfwWindowHint(131078, (int)v0.Og0);
                    GLFW.glfwWindowHint(135169, v0.Xc);
                    GLFW.glfwWindowHint(135170, v0.Y20);
                    GLFW.glfwWindowHint(135171, v0.yo);
                    GLFW.glfwWindowHint(135172, v0.tp);
                    GLFW.glfwWindowHint(135174, v0.dv);
                    GLFW.glfwWindowHint(135173, v0.Bw0);
                    GLFW.glfwWindowHint(135181, v0.Xx0);
                    var4_6 /* !! */  = v0.o8;
                    if (var4_6 /* !! */  == fN.ye) {
                        v1 = var1_4;
                        GLFW.glfwWindowHint(139266, v1.yh);
                        GLFW.glfwWindowHint(139267, v1.Wy);
                        if (q00.Ar) {
                            GLFW.glfwWindowHint(139270, 1);
                            GLFW.glfwWindowHint(139272, 204801);
                        }
                    } else if (var4_6 /* !! */  == fN.xb0) {
                        GLFW.glfwWindowHint(139275, 221186);
                        GLFW.glfwWindowHint(139265, 196610);
                        GLFW.glfwWindowHint(139266, 2);
                        GLFW.glfwWindowHint(139267, 0);
                    }
                    if (var1_4.qj) {
                        GLFW.glfwWindowHint(131082, 1);
                    }
                    if (var1_4.wp) {
                        GLFW.glfwWindowHint(139271, 1);
                    }
                    if ((var4_6 /* !! */  = var1_4.Sl0) != null) {
                        GLFW.glfwWindowHint(135183, var4_6 /* !! */ .BB);
                        var4_6 /* !! */  = var1_4.Sl0;
                        var4_7 = var4_6 /* !! */ .FP;
                        var5_19 = var1_4.pk0;
                        var6_26 = var4_6 /* !! */ .WH0;
                        var2_5 = GLFW.glfwCreateWindow(var4_6 /* !! */ .wp, var4_7, var5_19, var6_26, var2_5);
                    } else {
                        v2 = var1_4;
                        GLFW.glfwWindowHint(131077, (int)v2.yH);
                        v3 = var1_4;
                        var4_7 = v3.e6;
                        var2_5 = GLFW.glfwCreateWindow(v2.zC, var4_7, v3.pk0, 0L, var2_5);
                    }
                    if (var2_5 == 0L) break block60;
                    var4_7 = var1_4.K3;
                    v4 = var1_4;
                    var5_20 = v4.nJ0;
                    var6_27 = v4.IK;
                    var7_33 = v4.ed0;
                    if (var4_7 <= -1) {
                        var4_7 = -1;
                    }
                    if (var5_20 <= -1) {
                        var5_20 = -1;
                    }
                    if (var6_27 <= -1) {
                        var6_27 = -1;
                    }
                    if (var7_33 <= -1) {
                        var7_33 = -1;
                    }
                    GLFW.glfwSetWindowSizeLimits(var2_5, var4_7, var5_20, var6_27, var7_33);
                    if (var1_4.Sl0 == null) {
                        var4_7 = var1_4.Mj;
                        if (var4_7 == -1 && var1_4.fl == -1) {
                            v5 = var1_4;
                            var4_7 = Math.max(v5.zC, var1_4.K3);
                            var5_20 = Math.max(v5.e6, var1_4.nJ0);
                            var6_27 = v5.IK;
                            if (var6_27 > -1) {
                                var4_7 = Math.min(var4_7, var6_27);
                            }
                            if ((var6_27 = var1_4.ed0) > -1) {
                                var5_20 = Math.min(var5_20, var6_27);
                            }
                            var6_28 = GLFW.glfwGetPrimaryMonitor();
                            if (var1_4.CoM8 && (var8_37 = var1_4.Rn0) != null) {
                                var6_28 = var8_37.Jr;
                            }
                            var8_37 = BufferUtils.createIntBuffer(1);
                            var9_40 = BufferUtils.createIntBuffer(1);
                            var10_43 = BufferUtils.createIntBuffer(1);
                            var11_44 = BufferUtils.createIntBuffer(1);
                            GLFW.glfwGetMonitorWorkarea(var6_28, (IntBuffer)var8_37, (IntBuffer)var9_40, (IntBuffer)var10_43, (IntBuffer)var11_44);
                            var6_27 = var8_37.get(0);
                            var4_7 = Math.max(0, var10_43.get(0) / 2 + var6_27 - var4_7 / 2);
                            var6_27 = var9_40.get(0);
                            var5_20 = var11_44.get(0) / 2 + var6_27 - var5_20 / 2;
                            GLFW.glfwSetWindowPos(var2_5, var4_7, Math.max(0, var5_20));
                        } else {
                            GLFW.glfwSetWindowPos(var2_5, var4_7, var1_4.fl);
                        }
                        if (var1_4.CoM8) {
                            GLFW.glfwMaximizeWindow(var2_5);
                        }
                    }
                    var4_8 = var1_4.FG0;
                    if (var1_4.FG0 != null) {
                        var5_21 = var1_4.Hz0;
                        if (!q00.Ar) {
                            var6_27 = ((String[])var4_8).length;
                            var7_34 = new ZH[var6_27];
                            for (var8_38 = 0; var8_38 < ((String[])var4_8).length; ++var8_38) {
                                var9_40 = v6;
                                var10_43 = var4_8[var8_38];
                                UB0.vj0.getClass();
                                v6 = new ZH(new hZ((String)var10_43, (G20)var5_21));
                                var7_34[var8_38] = var9_40;
                            }
                            if (!q00.Ar) {
                                v7 = var6_27;
                                var4_8 = GLFWImage.malloc(v7);
                                var5_21 = new ZH[v7];
                                for (var8_38 = 0; var8_38 < var6_27; ++var8_38) {
                                    var9_40 = var7_34[var8_38];
                                    var10_43 = Uc.xi0;
                                    if (var9_40.TU() != var10_43) {
                                        var11_44 = v8;
                                        v9 = var11_44;
                                        v10 = var9_40.Con;
                                        var9_41 = v10.ju;
                                        v9(var9_41, v10.Og0, (Uc)var10_43);
                                        v9.r1(y1.Zj);
                                        v8.fL((ZH)var9_40, 0, 0);
                                        var5_21[var8_38] = var11_44;
                                        var9_40 = var11_44;
                                    }
                                    var10_43 = GLFWImage.malloc();
                                    v11 = var9_40;
                                    v12 = v11.Con;
                                    var9_42 = v12.ju;
                                    var11_45 = v12.Og0;
                                    var12_46 = v11.tp0();
                                    var10_43.set(var9_42, var11_45, var12_46);
                                    var4_8.put((Struct)var10_43);
                                    var10_43.free();
                                }
                                var4_8.position(0);
                                GLFW.glfwSetWindowIcon(var2_5, (GLFWImage.Buffer)var4_8);
                                var4_8.free();
                                for (var4_9 = 0; var4_9 < var6_27; ++var4_9) {
                                    var8_39 = var5_21[var4_9];
                                    if (var8_39 == null) continue;
                                    var8_39.dispose();
                                }
                            }
                            for (var4_10 = 0; var4_10 < var6_27; ++var4_10) {
                                var7_34[var4_10].dispose();
                            }
                        }
                    }
                    v13 = var1_4;
                    GLFW.glfwMakeContextCurrent(var2_5);
                    GLFW.glfwSwapInterval((int)v13.fn0);
                    var4_11 = fN.xb0;
                    if (v13.o8 != var4_11) break block61;
                    try {
                        v14 = var5_22 = GLES.class;
                    }
                    lbl150:
                    // 3 sources

                    catch (Throwable var0_1) {
                        throw new JU("Couldn't initialize GLES", var0_1);
                    }
                    ** try [egrp 1[TRYBLOCK] [1 : 1046->1049)] {
                        lbl153:
                        // 1 sources

                        v14.getMethod("createCapabilities", new Class[0]).invoke(var5_22, new Object[0]);
                        break block62;
                    }
                    GL.createCapabilities();
                }
                if (!(var1_4.o8 == var4_11)) {
                    var5_23 = GL11.glGetString(7938);
                    var6_29 = GL11.glGetString(7936);
                    var7_35 = GL11.glGetString(7937);
                    Q50.VE = new Lh(Dp0.Ro0, (String)var5_23, (String)var6_29, var7_35);
                } else {
                    v15 = var5_23 = GLES20.class;
                ** try [egrp 4[TRYBLOCK] [4 : 1159->1162)] {
                        lbl171:
                        // 1 sources

                        v16 = "glGetString";
                        v17 = new Class[1];
                        v17[0] = Integer.TYPE;
                        v18 = v15.getMethod(v16, v17);
                        var6_29 = v18;
                        v19 = var5_23;
                        v20 = var6_29;
                        v21 = var5_23;
                        v22 = var6_29;
                        v23 = var5_23;
                        v24 = new Object[1];
                        v24[0] = 7938;
                        var5_23 = (String)v22.invoke(v23, v24);
                        v25 = new Object[1];
                        v25[0] = 7936;
                        var6_29 = (String)v20.invoke(v21, v25);
                        v26 = new Object[1];
                        v26[0] = 7937;
                        var7_35 = (String)v18.invoke(v19, v26);
                        Q50.VE = new Lh(Dp0.Ro0, (String)var5_23, (String)var6_29, var7_35);
                    }
                    var5_23 = Q50.VE;
                    var6_30 = 2;
                    var7_36 = var5_23.qV;
                    v27 = var7_36 > var6_30 || var7_36 == var6_30 && var5_23.GS >= 0;
                    if (v27) {
                        if (var1_4.o8 != var4_11) {
                            var4_12 = 3;
                            v28 = var7_36 > 3 || var7_36 == var4_12 && var5_23.GS >= 0;
                            if (!(v28 || GLFW.glfwExtensionSupported("GL_EXT_framebuffer_object") || GLFW.glfwExtensionSupported("GL_ARB_framebuffer_object"))) {
                                v29 = B40.df("OpenGL 2.0 or higher with the FBO extension is required. OpenGL version: ").append(GL11.glGetString(7938)).append(", FBO extension: false\n");
                                var0 = Q50.VE;
                                var0.getClass();
                                throw new JU(v29.append("Type: " + (Object)var0.WY + "\nVersion: " + var0.qV + ":" + var0.GS + ":" + var0.bB + "\nVendor: " + var0.YX + "\nRenderer: " + var0.Ie0).toString());
                            }
                        }
                        if (var1_4.wp) {
                            Q50.Ci = GLUtil.setupDebugMessageCallback(var1_4.e1);
                            var4_13 = ff.Nx0;
                            var5_24 = false;
                            var6_31 = GL.getCapabilities();
                            if (var6_31.OpenGL43) {
                                var4_14 = var4_13.vQ;
                                GL43.glDebugMessageControl(4352, 4352, var4_14, null, var5_24);
                            } else if (var6_31.GL_KHR_debug) {
                                var4_15 = var4_13.py0;
                                KHRDebug.glDebugMessageControl(4352, 4352, var4_15, null, var5_24);
                            } else if (var6_31.GL_ARB_debug_output && (var7_36 = var4_13.mn) != -1) {
                                ARBDebugOutput.glDebugMessageControlARB(4352, 4352, var7_36, null, var5_24);
                            } else if (var6_31.GL_AMD_debug_output && (var4_16 = var4_13.Do0) != -1) {
                                AMDDebugOutput.glDebugMessageEnableAMD(4352, var4_16, null, var5_24);
                            }
                        }
                        v30 = var0;
                        v30.ne0 = var2_5;
                        ((Q50)v30.cd0).getClass();
                        v30.wR = new aY((MJ0)var0);
                        v30.Ai = new w70((MJ0)var0);
                        GLFW.glfwSetWindowFocusCallback(var2_5, v30.PQ);
                        GLFW.glfwSetWindowIconifyCallback(var2_5, var0.xI);
                        GLFW.glfwSetWindowMaximizeCallback(var2_5, var0.Z3);
                        GLFW.glfwSetWindowCloseCallback(var2_5, var0.Vs);
                        GLFW.glfwSetDropCallback(var2_5, var0.Uj);
                        GLFW.glfwSetWindowRefreshCallback(var2_5, var0.Jw);
                        if (var0.Og != null) {
                            GLFWWindowPosCallback.create(new Qe()).set(var0.ne0);
                        }
                        if (var1_4.GL) {
                            GLFW.glfwShowWindow(var0.ne0);
                        } else {
                            GLFW.glfwHideWindow(var0.ne0);
                        }
                        for (var0_2 = 0; var0_2 < 2; ++var0_2) {
                            v31 = var4_17 = var1_4.Eq0;
                            var4_18 = v31.g;
                            var5_25 = v31.b;
                            var6_32 = v31.a;
                            GL11.glClearColor(var4_17.r, var4_18, var5_25, var6_32);
                            GL11.glClear(16384);
                            GLFW.glfwSwapBuffers(var2_5);
                        }
                        return;
                    }
                    v32 = B40.df("OpenGL 2.0 or higher with the FBO extension is required. OpenGL version: ").append(GL11.glGetString(7938)).append("\n");
                    var0 = Q50.VE;
                    var0.getClass();
                    throw new JU(v32.append("Type: " + (Object)var0.WY + "\nVersion: " + var0.qV + ":" + var0.GS + ":" + var0.bB + "\nVendor: " + var0.YX + "\nRenderer: " + var0.Ie0).toString());
                    lbl273:
                    // 11 sources

            catch (Throwable var0_3) {
                        throw new JU("Couldn't get GLES version string.", var0_3);
                    }
                }
                throw new JU("Couldn't create window");
            }


            /*    */
    /*    */
    public final void xE0() {
        /*    */
        fQ fQ1;
        /*    */
        Hc0 hc0;
        /*    */
        synchronized (this.oB) {
            /*    */
            Hc0 hc01 = this.oB.r30();
            /*    */
            while (hc01.hasNext()) {
                /*    */
                ((lu) hc01.next()).oC0();
                /*    */
                ((lu) hc01.next()).dispose();
                /*    */
            }
            /*    */
            hc0 = this.Cs0.r30();
            /*    */
            while (hc0.hasNext())
                /*    */ ((MJ0) hc0.next()).dispose();
            /*    */
            this.Cs0.clear();
            /*    */
            return;
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void U50() {
        /*    */
        for (Iterator<Long> iterator = cOm1.tN.values().iterator(); iterator.hasNext(); GLFW.glfwDestroyCursor(((Long) iterator.next()).longValue()))
            ;
        /*    */
        cOm1.tN.clear();
        /*    */
        this.qU.dispose();
        /*    */
        ok.free();
        /*    */
        ok = null;
        /*    */
        Callback callback;
        /*    */
        if ((callback = Ci) != null) {
            /*    */
            free();
            /*    */
            Ci = null;
            /*    */
        }
        /*    */
        GLFW.glfwTerminate();
        /*    */
    }

    /*    */
    /*    */
    public final void HC(String paramString1, String paramString2) {
        /*    */
        if (this.Bs >= 2) {
            /*    */
            this.Aa0.getClass();
            /*    */
            System.out.println("[" + paramString1 + "] " + paramString2);
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
    public final void O70(String paramString1, String paramString2) {
        /*    */
        if (this.Bs >= 1) {
            /*    */
            this.Aa0.getClass();
            /*    */
            System.err.println("[" + paramString1 + "] " + paramString2);
            /*    */
        }
        /*    */
    }

    /*    */
    /*    */
            public final void fN(Runnable runnable) {
                fQ fQ2 = this.E6;
                synchronized (fQ2) {
                    this.E6.Com3(runnable);
                    return;
                }
            }


            /*    */
    /*    */
    public final void EM() {
        /*    */
        this.K7 = false;
        /*    */
    }

    /*    */
    /*    */
    public final void QS(lu paramlu) {
        /*    */     // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: getfield oB : Lf/fQ;
        /*    */     //   4: dup
        /*    */     //   5: astore_2
        /*    */     //   6: aload_0
        /*    */     //   7: aload_2
        /*    */     //   8: monitorenter
        /*    */     //   9: getfield oB : Lf/fQ;
        /*    */     //   12: aload_1
        /*    */     //   13: invokevirtual Com3 : (Ljava/lang/Object;)V
        /*    */     //   16: monitorexit
        /*    */     //   17: return
        /*    */     //   18: aload_2
        /*    */     //   19: monitorexit
        /*    */     //   20: athrow
        /*    */     // Exception table:
        /*    */     //   from	to	target	type
        /*    */     //   9	17	18	finally
        /*    */     //   18	20	18	finally
        /*    */
    }

    /*    */
    /*    */
    public final void so(bQ parambQ) {
        /*    */
        this.Aa0 = parambQ;
        /*    */
    }

    /*    */
    /*    */
    public final MJ0 t80(fa paramfa, tG0 paramtG0) {
        /*    */
        long l = 0L;
        /*    */
        COM7(new MJ0(paramtG0, paramfa, this), paramfa, l);
        /*    */
        return new MJ0(paramtG0, paramfa, this);
        /*    */
    }

    /*    */
    /*    */
    public final void sf(Throwable paramThrowable) {
        /*    */
        String str1 = "Lwjgl3Application";
        /*    */
        String str2 = "Couldn't initialize audio, disabling audio";
        /*    */
        if (this.Bs >= 2) {
            /*    */
            this.Aa0.getClass();
            /*    */
            System.out.println("[" + str1 + "] " + str2);
            /*    */
            paramThrowable.printStackTrace(System.out);
            /*    */
        }
        /*    */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Q50.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */