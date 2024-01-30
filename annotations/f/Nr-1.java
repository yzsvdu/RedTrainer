/*    */
package f;

public abstract class Nr implements R40 {
    private final fQ uniforms;
    private final fQ validators;
    private final fQ setters;
    private int[] locations;
    private final o0 globalUniforms;
    private final o0 localUniforms;
    private final lm attributes;
    public Rm0 program;
    public l2 context;
    public ny camera;
    private re0 currentMesh;
    private final o0 tempArray;
    private b70 combinedAttributes;

    public void init(Rm0 paramRm0, Xw0 paramXw0) { // Byte code:
        /*    */     //   0: aload_0
        /*    */     //   1: getfield locations : [I
        /*    */     //   4: ifnonnull -> 426
        /*    */     //   7: aload_1
        /*    */     //   8: getfield Xu0 : Z
        /*    */     //   11: ifeq -> 414
        /*    */     //   14: aload_0
        /*    */     //   15: dup
        /*    */     //   16: dup
        /*    */     //   17: aload_1
        /*    */     //   18: putfield program : Lf/Rm0;
        /*    */     //   21: getfield uniforms : Lf/fQ;
        /*    */     //   24: getfield Z8 : I
        /*    */     //   27: dup
        /*    */     //   28: istore_3
        /*    */     //   29: newarray int
        /*    */     //   31: putfield locations : [I
        /*    */     //   34: iconst_0
        /*    */     //   35: istore #4
        /*    */     //   37: iload #4
        /*    */     //   39: iload_3
        /*    */     //   40: if_icmpge -> 322
        /*    */     //   43: aload_0
        /*    */     //   44: dup
        /*    */     //   45: getfield uniforms : Lf/fQ;
        /*    */     //   48: iload #4
        /*    */     //   50: invokevirtual get : (I)Ljava/lang/Object;
        /*    */     //   53: checkcast java/lang/String
        /*    */     //   56: astore #5
        /*    */     //   58: getfield validators : Lf/fQ;
        /*    */     //   61: iload #4
        /*    */     //   63: invokevirtual get : (I)Ljava/lang/Object;
        /*    */     //   66: checkcast f/mv
        /*    */     //   69: dup
        /*    */     //   70: astore #6
        /*    */     //   72: aload_0
        /*    */     //   73: getfield setters : Lf/fQ;
        /*    */     //   76: iload #4
        /*    */     //   78: invokevirtual get : (I)Ljava/lang/Object;
        /*    */     //   81: checkcast f/CK0
        /*    */     //   84: astore #7
        /*    */     //   86: ifnull -> 223
        /*    */     //   89: aload_2
        /*    */     //   90: aload #6
        /*    */     //   92: checkcast f/vK
        /*    */     //   95: astore #6
        /*    */     //   97: ifnull -> 120
        /*    */     //   100: aload_2
        /*    */     //   101: getfield bL : Lf/T0;
        /*    */     //   104: dup
        /*    */     //   105: astore #8
        /*    */     //   107: ifnull -> 120
        /*    */     //   110: aload #8
        /*    */     //   112: getfield Qr : J
        /*    */     //   115: lstore #8
        /*    */     //   117: goto -> 123
        /*    */     //   120: lconst_0
        /*    */     //   121: lstore #8
        /*    */     //   123: aload_2
        /*    */     //   124: ifnull -> 147
        /*    */     //   127: aload_2
        /*    */     //   128: getfield kw : Lf/fo0;
        /*    */     //   131: dup
        /*    */     //   132: astore #10
        /*    */     //   134: ifnull -> 147
        /*    */     //   137: aload #10
        /*    */     //   139: getfield Qr : J
        /*    */     //   142: lstore #10
        /*    */     //   144: goto -> 150
        /*    */     //   147: lconst_0
        /*    */     //   148: lstore #10
        /*    */     //   150: lload #8
        /*    */     //   152: aload #6
        /*    */     //   154: getfield ve : J
        /*    */     //   157: dup2
        /*    */     //   158: lstore #12
        /*    */     //   160: land
        /*    */     //   161: lload #12
        /*    */     //   163: lcmp
        /*    */     //   164: ifne -> 208
        /*    */     //   167: lload #10
        /*    */     //   169: aload #6
        /*    */     //   171: getfield jF : J
        /*    */     //   174: dup2
        /*    */     //   175: lstore #12
        /*    */     //   177: land
        /*    */     //   178: lload #12
        /*    */     //   180: lcmp
        /*    */     //   181: ifne -> 208
        /*    */     //   184: lload #8
        /*    */     //   186: lload #10
        /*    */     //   188: lor
        /*    */     //   189: aload #6
        /*    */     //   191: getfield py0 : J
        /*    */     //   194: dup2
        /*    */     //   195: lstore #8
        /*    */     //   197: land
        /*    */     //   198: lload #8
        /*    */     //   200: lcmp
        /*    */     //   201: ifne -> 208
        /*    */     //   204: iconst_1
        /*    */     //   205: goto -> 209
        /*    */     //   208: iconst_0
        /*    */     //   209: ifne -> 223
        /*    */     //   212: aload_0
        /*    */     //   213: getfield locations : [I
        /*    */     //   216: iload #4
        /*    */     //   218: iconst_m1
        /*    */     //   219: iastore
        /*    */     //   220: goto -> 286
        /*    */     //   223: aload_0
        /*    */     //   224: dup
        /*    */     //   225: getfield locations : [I
        /*    */     //   228: iload #4
        /*    */     //   230: aload_1
        /*    */     //   231: aload #5
        /*    */     //   233: iconst_0
        /*    */     //   234: invokevirtual mm0 : (Ljava/lang/String;Z)I
        /*    */     //   237: iastore
        /*    */     //   238: getfield locations : [I
        /*    */     //   241: iload #4
        /*    */     //   243: iaload
        /*    */     //   244: iflt -> 286
        /*    */     //   247: aload #7
        /*    */     //   249: ifnull -> 286
        /*    */     //   252: aload #7
        /*    */     //   254: aload_0
        /*    */     //   255: iload #4
        /*    */     //   257: invokeinterface isGlobal : (Lf/Nr;I)Z
        /*    */     //   262: ifeq -> 277
        /*    */     //   265: aload_0
        /*    */     //   266: getfield globalUniforms : Lf/o0;
        /*    */     //   269: iload #4
        /*    */     //   271: invokevirtual oU : (I)V
        /*    */     //   274: goto -> 286
        /*    */     //   277: aload_0
        /*    */     //   278: getfield localUniforms : Lf/o0;
        /*    */     //   281: iload #4
        /*    */     //   283: invokevirtual oU : (I)V
        /*    */     //   286: aload_0
        /*    */     //   287: getfield locations : [I
        /*    */     //   290: iload #4
        /*    */     //   292: iaload
        /*    */     //   293: ifge -> 316
        /*    */     //   296: aload_0
        /*    */     //   297: dup
        /*    */     //   298: getfield validators : Lf/fQ;
        /*    */     //   301: iload #4
        /*    */     //   303: aconst_null
        /*    */     //   304: invokevirtual Bz0 : (ILjava/lang/Object;)V
        /*    */     //   307: getfield setters : Lf/fQ;
        /*    */     //   310: iload #4
        /*    */     //   312: aconst_null
        /*    */     //   313: invokevirtual Bz0 : (ILjava/lang/Object;)V
        /*    */     //   316: iinc #4, 1
        /*    */     //   319: goto -> 37
        /*    */     //   322: aload_2
        /*    */     //   323: ifnull -> 413
        /*    */     //   326: aload_2
        /*    */     //   327: getfield L90 : Lf/COM6;
        /*    */     //   330: getfield u90 : Lf/re0;
        /*    */     //   333: getfield Dt0 : Lf/Com9;
        /*    */     //   336: invokeinterface getAttributes : ()Lf/Ao;
        /*    */     //   341: dup
        /*    */     //   342: astore_2
        /*    */     //   343: getfield rJ0 : [Lf/lw0;
        /*    */     //   346: arraylength
        /*    */     //   347: istore_3
        /*    */     //   348: iconst_0
        /*    */     //   349: istore #4
        /*    */     //   351: iload #4
        /*    */     //   353: iload_3
        /*    */     //   354: if_icmpge -> 413
        /*    */     //   357: aload_1
        /*    */     //   358: aload_2
        /*    */     //   359: getfield rJ0 : [Lf/lw0;
        /*    */     //   362: iload #4
        /*    */     //   364: aaload
        /*    */     //   365: dup
        /*    */     //   366: astore #5
        /*    */     //   368: getfield M8 : Ljava/lang/String;
        /*    */     //   371: invokevirtual I : (Ljava/lang/String;)I
        /*    */     //   374: dup
        /*    */     //   375: istore #6
        /*    */     //   377: iflt -> 407
        /*    */     //   380: aload_0
        /*    */     //   381: getfield attributes : Lf/lm;
        /*    */     //   384: aload #5
        /*    */     //   386: getfield pe0 : I
        /*    */     //   389: bipush #8
        /*    */     //   391: ishl
        /*    */     //   392: aload #5
        /*    */     //   394: getfield ed : I
        /*    */     //   397: sipush #255
        /*    */     //   400: iand
        /*    */     //   401: iadd
        /*    */     //   402: iload #6
        /*    */     //   404: invokevirtual Oe : (II)V
        /*    */     //   407: iinc #4, 1
        /*    */     //   410: goto -> 351
        /*    */     //   413: return
        /*    */     //   414: new f/JU
        /*    */     //   417: dup
        /*    */     //   418: aload_1
        /*    */     //   419: invokevirtual ET : ()Ljava/lang/String;
        /*    */     //   422: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   425: athrow
        /*    */     //   426: new f/JU
        /*    */     //   429: dup
        /*    */     //   430: ldc 'Already initialized'
        /*    */     //   432: invokespecial <init> : (Ljava/lang/String;)V
        /*    */     //   435: athrow
        /*    */     // Line number table:
        /*    */     //   Java source line number -> byte code offset
        /*    */     //   #1	-> 8
        /*    */     //   #2	-> 18
        /*    */     //   #3	-> 101
        /*    */     //   #4	-> 112
        /*    */     //   #5	-> 128
        /*    */     //   #6	-> 139
        /*    */     //   #7	-> 154
        /*    */     //   #8	-> 213
        /*    */     //   #9	-> 333
        /*    */     //   #10	-> 336
        /*    */     //   #11	-> 343
        /*    */     //   #12	-> 346
        /*    */     //   #13	-> 359
        /*    */     //   #14	-> 368
        /*    */     //   #15	-> 386
        /*    */     //   #16	-> 404 }
        /*  2 */
        public void render (Xw0 paramXw0){
            float arrayOfFloat[], f2, f3, f4, f5 = (f2 = (arrayOfFloat = paramXw0.kD0.Z0)[0]) * (f3 = arrayOfFloat[5]) * (f4 = arrayOfFloat[10]);
            float f6, f7, f8;
            f5 = (f6 = paramXw0.kD0.Z0[4]) * (f7 = arrayOfFloat[9]) * (f8 = arrayOfFloat[2]) + f5;
            float f1 = Oq.R0(f2, f7, f1, f9 * (f2 = arrayOfFloat[1]) * (f1 = arrayOfFloat[6]) + f5);
            float f9;
            if (Oq.R0(f9 = paramXw0.kD0.Z0[8], f3, f8, Oq.R0(f6, f2, f4, f1)) == 0.0F)
                /*  3 */ return;
            this.combinedAttributes
                    /*  4 */.Qr = 0L;
            /*  5 */
            this.combinedAttributes.ra0.clear();
            fo0 fo0;
            /*  6 */
            if ((fo0 = paramXw0.kw) != null) this.combinedAttributes.ir(fo0);
            T0 t0;
            if ((t0 = paramXw0.bL) != null) this.combinedAttributes.ir(t0);
            render(paramXw0, this.combinedAttributes);
        }
        public void end () {
            re0 re01;
            if ((re01 = this.currentMesh) != null) {
                Rm0 rm0 = this.program;
                int[] arrayOfInt = this.tempArray.Ky;
                re01.Dt0.bD0(rm0, arrayOfInt);
                if (re01.rs0.pP() > 0) re01.rs0.bj0();
                this.currentMesh = null;
            }
        }
        public void dispose () {
            this.program = null;
            this.uniforms.clear();
            this.validators.clear();
            this.setters.clear();
            this.localUniforms.mG0 = 0;
            this.globalUniforms.mG0 = 0;
            this.locations = null;
        }
        public final boolean set ( int paramInt, float paramFloat1, float paramFloat2){
            if ((paramInt = this.locations[paramInt]) < 0) return false;
            Rm0 rm0 = this.program;
            oM();
            UB0.re0.glUniform2f(paramInt, paramFloat1, paramFloat2);
            return true;
        }
        public final boolean set ( int paramInt, float paramFloat1, float paramFloat2, float paramFloat3,
        float paramFloat4){
            if ((paramInt = this.locations[paramInt]) < 0) return false;
            Rm0 rm0 = this.program;
            oM();
            UB0.re0.glUniform4f(paramInt, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
            return true;
        }
        public void render (Xw0 paramXw0, b70 paramb70){
            o0 o01;
            /*  7 */
            for (byte b = 0; b < (o01 = this.localUniforms).mG0; ) {
                int m;
                if (this.setters.get(m = o01.Vl(b)) != null)
                    ((CK0) this.setters.get(m)).set(this, m, paramXw0, paramb70);
                b++;
            }
            re0 re01;
            if ((re01 = this.currentMesh) != paramXw0.L90.u90) {
                Rm0 rm0 = this.program;
                int[] arrayOfInt2 = this.tempArray.Ky;
                re01.Dt0.bD0(rm0, arrayOfInt2);
                if (re01 != null && re01.rs0.pP() > 0) re01.rs0.bj0();
                this
                        /*  8 */.currentMesh = re01 = paramXw0.L90.u90;
                rm0 = this.program;
                /*    */
                /*    */
                /* 11 */
                this.tempArray
                        /* 12 */.mG0 = 0;
                Ao ao;
                int m;
                /*    */
                byte b1;
                /* 14 */
                for (m = (ao = re01.Dt0.getAttributes()).rJ0.length, b1 = 0; b1 < m; ) {
                    lw0 lw0;
                    this
/* 15 */.tempArray
/*    */
/*    */
/*    */
/* 19 */.oU(this.attributes.uv0(((lw0 = ao.rJ0[b1]).pe0 << 8) + (lw0.ed & 0xFF), -1));
                    b1++;
                }
                o0 o02;
                if ((o02 = this.tempArray)
                        /* 20 */.Ky.length != (
                        /* 21 */         m = o02.mG0)) o02.YK0(m);
                /* 22 */
                int[] arrayOfInt1 = this.tempArray.Ky;
                /* 23 */
                re01.Dt0.sm(rm0, arrayOfInt1);
                if (re01.rs0.pP() > 0) re01.rs0.bind();
            }
            /* 24 */
            COM6 cOM6 = paramXw0.L90;
            /*    */
            /* 26 */
            int i = this.lm, j = this.xI0, k = this.Dr;
            this.u90.Gi0(this.program, i, j, k, false);
        }
        public final boolean set ( int paramInt1, int paramInt2){
            if ((paramInt1 = this.locations[paramInt1]) < 0) return false;
            this.program.getClass();
            UB0.re0.glUniform1i(paramInt1, paramInt2);
            return true;
        }
        public final boolean set ( int paramInt1, int paramInt2, int paramInt3){
            if ((paramInt1 = this.locations[paramInt1]) < 0) return false;
            Rm0 rm0 = this.program;
            oM();
            UB0.re0.glUniform2i(paramInt1, paramInt2, paramInt3);
            return true;
        }
        public final boolean set ( int paramInt1, int paramInt2, int paramInt3, int paramInt4){
            if ((paramInt1 = this.locations[paramInt1]) < 0) return false;
            Rm0 rm0 = this.program;
            oM();
            UB0.re0.glUniform3i(paramInt1, paramInt2, paramInt3, paramInt4);
            return true;
        }
        public final boolean set ( int paramInt, sX paramsX){
            if ((paramInt = this.locations[paramInt]) < 0) return false;
            Rm0 rm0 = this.program;
            oM();
            /* 27 */
            float[] arrayOfFloat = paramsX.h50;
            UB0.re0.glUniformMatrix3fv(paramInt, 1, false, this, 0);
            return true;
        }
        /* 28 */
        public final boolean set ( int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5){
            if ((paramInt1 = this.locations[paramInt1]) < 0) return false;
            Rm0 rm0 = this.program;
            oM();
            UB0.re0.glUniform4i(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
            return true;
        }
        public final boolean set ( int paramInt, Color paramColor){
            if ((paramInt = this.locations[paramInt]) < 0) return false;
            Rm0 rm0;
            (rm0 = this.program).getClass();
            float f1 = paramColor.r, f2 = paramColor.g, f3 = paramColor.b, f4 = paramColor.a;
            oM();
            UB0.re0.glUniform4f(paramInt, f1, f2, f3, f4);
            return true;
        }
        public final boolean set ( int paramInt, Matrix4 paramMatrix4){
            if ((paramInt = this.locations[paramInt]) < 0) return false;
            this.program.getClass();
            float[] arrayOfFloat = paramMatrix4.Z0;
            UB0.re0.glUniformMatrix4fv(paramInt, 1, false, this, 0);
            return true;
        }
        public final boolean set ( int paramInt, zp paramzp){
            if ((paramInt = this.locations[paramInt]) < 0) return false;
            ((c00) this.context.fe).Nn0.vv0(paramzp, null, null, null, null);
            int i = ((c00) this.context.fe).fE0(((c00) this.context.fe).Nn0);
            this.program.getClass();
            UB0.re0.glUniform1i(paramInt, i);
            return true;
        }
        public final boolean set ( int paramInt, IX paramIX){
            if ((paramInt = this.locations[paramInt]) < 0) return false;
            int i = ((c00) this.context.fe).fE0(paramIX);
            this.program
/* 29 */.getClass();
            /* 30 */
            UB0.re0.glUniform1i(paramInt, i);
            return true;
        }
        /* 31 */
        public final boolean set ( int paramInt, NC0 paramNC0){
            if ((paramInt = this.locations[paramInt]) < 0) return false;
            Rm0 rm0;
            (rm0 = this.program).getClass();
            float f1 = paramNC0.x, f2 = paramNC0.y;
            /* 32 */
            oM();
            UB0.re0.glUniform2f(paramInt, f1, f2);
            return true;
        }
        public final boolean set ( int paramInt, eo parameo){
            /* 33 */
            if ((paramInt = this.locations[paramInt]) < 0) return false;
            getClass();
            float f1 = parameo.x, f2 = parameo.y, f3 = parameo.z;
            Rm0 rm0;
            (rm0 = this.program).IB(paramInt, f1, f2, f3);
            return true;
            /*    */
        }
        /*    */
        /*    */   public Nr() {
            /*    */
            fQ fQ1;
            /*    */
            o0 o02;
            /*    */
            lm lm1;
            /*    */
            o0 o01;
            /*    */
            b70 b701;
            /*    */
            this();
            /*    */
            this.uniforms = this;
            /*    */
            this();
            /*    */
            this.validators = this;
            /*    */
            this();
            /*    */
            this.setters = this;
            /*    */
            this();
            /*    */
            this.globalUniforms = this;
            /*    */
            this();
            /*    */
            this.localUniforms = this;
            /*    */
            this();
            /*    */
            this.attributes = this;
            /*    */
            this();
            /*    */
            this.tempArray = this;
            /*    */
            this();
            /*    */
            this.combinedAttributes = this;
            /*    */
        }
        /*    */
        /*    */
        public int register (String paramString, mv parammv, CK0 paramCK0){
            /*    */
            if (this.locations == null) {
                /*    */
                int i;
                /*    */
                if ((i = getUniformID(paramString)) >= 0) {
                    /*    */
                    this.validators.Bz0(i, parammv);
                    /*    */
                    this.setters.Bz0(i, paramCK0);
                    /*    */
                    return i;
                    /*    */
                }
                /*    */
                this.uniforms.Com3(paramString);
                /*    */
                this.validators.Com3(parammv);
                /*    */
                this.setters.Com3(paramCK0);
                /*    */
                return this.uniforms.Z8 - 1;
                /*    */
            }
            /*    */
            throw new JU("Cannot register an uniform after initialization");
            /*    */
        }
        /*    */
        /*    */
        public int register (String paramString, mv parammv){
            /*    */
            return register(paramString, parammv, null);
            /*    */
        }
        /*    */
        /*    */
        public int register (String paramString, CK0 paramCK0){
            /*    */
            return register(paramString, null, paramCK0);
            /*    */
        }
        /*    */
        /*    */
        public int register (String paramString){
            /*    */
            return register(paramString, null, null);
            /*    */
        }
        /*    */
        /*    */
        public int register (vK paramvK, CK0 paramCK0){
            /*    */
            return register(paramvK.WY, paramvK, paramCK0);
            /*    */
        }
        /*    */
        /*    */
        public int register (vK paramvK){
            /*    */
            return register(paramvK, (CK0) null);
            /*    */
        }
        /*    */
        /*    */
        public int getUniformID (String paramString){
            /*    */
            int i = this.uniforms.Z8;
            /*    */
            for (byte b = 0; b < i; b++) {
                /*    */
                if (((String) this.uniforms.get(b)).equals(paramString))
                    /*    */ return b;
                /*    */
            }
            /*    */
            return -1;
            /*    */
        }
        /*    */
        /*    */
        public String getUniformAlias ( int paramInt){
            /*    */
            return (String) this.uniforms.get(paramInt);
            /*    */
        }
        /*    */
        /*    */
        public void begin (ny paramny, l2 paraml2){
            /*    */
            this.camera = paramny;
            /*    */
            this.context = paraml2;
            /*    */
            this.program.bind();
            /*    */
            this.currentMesh = null;
            /*    */
            o0 o01;
            /*    */
            for (byte b = 0; b < (o01 = this.globalUniforms).mG0; b++) {
                /*    */
                int i;
                /*    */
                if (this.setters.get(i = o01.Vl(b)) != null)
                    /*    */ ((CK0) this.setters.get(i)).set(this, i, null, null);
                /*    */
            }
            /*    */
        }
        /*    */
        /*    */
        public final boolean has ( int paramInt){
            /*    */
            int[] arrayOfInt;
            /*    */
            return (paramInt >= 0 && paramInt < (arrayOfInt = this.locations).length && this[paramInt] >= 0);
            /*    */
        }
        /*    */
        /*    */
        public final int loc ( int paramInt){
            /*    */
            int[] arrayOfInt;
            /*    */
            return (paramInt >= 0 && paramInt < (arrayOfInt = this.locations).length) ? this[paramInt] : -1;
            /*    */
        }
        /*    */
        /*    */
        public final boolean set ( int paramInt, float paramFloat){
            /*    */
            if ((paramInt = this.locations[paramInt]) < 0)
                /*    */ return false;
            /*    */
            this.program.rp(paramInt, paramFloat);
            /*    */
            return true;
            /*    */
        }
        /*    */
        /*    */
        public final boolean set ( int paramInt, float paramFloat1, float paramFloat2, float paramFloat3){
            /*    */
            if ((paramInt = this.locations[paramInt]) < 0)
                /*    */ return false;
            /*    */
            this.program.IB(paramInt, paramFloat1, paramFloat2, paramFloat3);
            /*    */
            return true;
            /*    */
        }
    }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Nr.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */