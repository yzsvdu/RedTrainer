/* 1 */ package f;public class Rm0 implements iq0 { public static boolean bk0 = true; public static final f7 ZK = new f7(); public String is = ""; public boolean Xu0; public final Nu0 o3 = new Nu0(); public final Nu0 Km = new Nu0(); public final Nu0 Ko = new Nu0(); public String[] BH0; public final Nu0 DA0 = new Nu0(); public final Nu0 Pz0 = new Nu0(); public final void N1(String paramString1, String paramString2) { this.re = Com8(35633, paramString1); int i = Com8(35632, paramString2); if (this.re == -1 || i == -1)
/*   */     
/* 3 */     { this.Xu0 = false; return; }  if ((i = UB0.re0.glCreateProgram()) == 0) i = -1;  hj0 hj0 = UB0.re0; if (i == -1) { i = -1; } else { hj0.glAttachShader(i, this.re); hj0.glAttachShader(i, this.gi); hj0.glLinkProgram(i); ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder()); hj0.glGetProgramiv(i, 35714, intBuffer); IntBuffer intBuffer; if ((intBuffer = ByteBuffer.allocateDirect(4).asIntBuffer()).get(0) == 0) { this.is = UB0.re0.glGetProgramInfoLog(i); i = -1; }  }  this.Zh = i; if (i == -1) { this.Xu0 = false; return; }  this.Xu0 = true; } public final Nu0 X50 = new Nu0(); public String[] RX; public int Zh; public int re; public int gi; public IntBuffer Fq = BufferUtils.mt0(1); public IntBuffer IM = BufferUtils.mt0(1); public Rm0(String paramString1, String paramString2) { if (paramString1 != null) { if (paramString2 != null) { BufferUtils.Sg(); N1(paramString1, paramString2); if (d8()) { Tq(); Mc(); CX(UB0.Kg0, this); }  return; }  throw new IllegalArgumentException("fragment shader must not be null"); }  throw new IllegalArgumentException("vertex shader must not be null"); } public Rm0(RD0 paramRD01, RD0 paramRD02) { this(this, paramRD02.mM()); } static { BufferUtils.mt0(1); } public static void CX(x paramx, Rm0 paramRm0) { f7 f71; fQ fQ; if ((fQ = (fQ)(f71 = ZK).pd0(paramx)) == null) this();  fQ.Com3(paramRm0); f71.X00(paramx, fQ); } public final int Com8(int paramInt, String paramString) { IntBuffer intBuffer = BufferUtils.mt0(1); hj0 hj0; int i; if ((i = (hj0 = UB0.re0).glCreateShader(paramInt)) == 0) return -1;  hj0.glShaderSource(i, paramString); hj0.glCompileShader(i); hj0.glGetShaderiv(i, 35713, intBuffer); if (intBuffer.get(0) == 0) { String str2, str1 = hj0.glGetShaderInfoLog(i); StringBuilder stringBuilder = (new StringBuilder()).append(this.is); if (paramInt == 35633) { str2 = "Vertex shader\n"; } else { str2 = "Fragment shader:\n"; }  this.is = stringBuilder.append(str2).toString(); this.is = UQ.Vr0(new StringBuilder(), this.is, str1); return -1; }  return i; } public final void oM() {} public final void Mc() { this.Fq.clear(); int i = this.Zh; IntBuffer intBuffer = this.Fq; UB0.re0.glGetProgramiv(i, 35718, intBuffer); this.BH0 = new String[i = this.Fq.get(0)]; for (byte b = 0; b < i; b++) { this.Fq.clear(); this.Fq.put(0, 1); this.IM.clear(); int j = this.Zh; IntBuffer intBuffer1 = this.Fq; IntBuffer intBuffer2 = this.IM; String str = UB0.re0.glGetActiveUniform(j, b, intBuffer1, intBuffer2); int k = UB0.re0.glGetUniformLocation(this.Zh, str); this.o3.b4(k, str); this.Km.b4(this.IM.get(0), str); this.Ko.b4(this.Fq.get(0), str); this.BH0[b] = str; }  } public final int mm0(String paramString, boolean paramBoolean) { int i = -2; Nu0 nu0; int j; if ((j = (nu0 = this.o3).aD0(paramString)) >= 0) i = nu0.d50[j];  if (i == -2) { if ((i = UB0.re0.glGetUniformLocation(this.Zh, paramString)) == -1 && paramBoolean) { if (this.Xu0) throw new IllegalArgumentException(
/* 4 */               De0.AT("No uniform with name '", paramString, "' in shader")); 
/* 5 */         throw new IllegalStateException(
/* 6 */             B40.df("An attempted fetch uniform from uncompiled shader \n")
/* 7 */             .append(ET()).toString()); }  this.o3.b4(i, paramString); }  return i; }
/*   */ 
/*   */   
/*   */   public final void Tq() {
/*   */     this.Fq.clear();
/*   */     int i = this.Zh;
/*   */     IntBuffer intBuffer = this.Fq;
/*   */     UB0.re0.glGetProgramiv(i, 35721, intBuffer);
/*   */     this.RX = new String[i = this.Fq.get(0)];
/*   */     for (byte b = 0; b < i; b++) {
/*   */       this.Fq.clear();
/*   */       this.Fq.put(0, 1);
/*   */       this.IM.clear();
/*   */       int j = this.Zh;
/*   */       IntBuffer intBuffer1 = this.Fq;
/*   */       IntBuffer intBuffer2 = this.IM;
/*   */       String str = UB0.re0.glGetActiveAttrib(j, b, intBuffer1, intBuffer2);
/*   */       int k = UB0.re0.glGetAttribLocation(this.Zh, str);
/*   */       this.DA0.b4(k, str);
/*   */       this.Pz0.b4(this.IM.get(0), str);
/*   */       this.X50.b4(this.Fq.get(0), str);
/*   */       this.RX[b] = str;
/*   */     } 
/*   */   }
/*   */   
/*   */   public final String ET() {
/*   */     return this.Xu0 ? (this.is = UB0.re0.glGetProgramInfoLog(this.Zh)) : this.is;
/*   */   }
/*   */   
/*   */   public final boolean d8() {
/*   */     return this.Xu0;
/*   */   }
/*   */   
/*   */   public final void rp(int paramInt, float paramFloat) {
/*   */     UB0.re0.glUniform1f(paramInt, paramFloat);
/*   */   }
/*   */   
/*   */   public final void IB(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     oM();
/*   */     UB0.re0.glUniform3f(paramInt, paramFloat1, paramFloat2, paramFloat3);
/*   */   }
/*   */   
/*   */   public final void bind() {
/*   */     oM();
/*   */     UB0.re0.glUseProgram(this.Zh);
/*   */   }
/*   */   
/*   */   public final void dispose() {
/*   */     hj0.glUseProgram(0);
/*   */     hj0.glDeleteShader(this.re);
/*   */     hj0.glDeleteShader(this.gi);
/*   */     hj0 hj0;
/*   */     (hj0 = UB0.re0).glDeleteProgram(this.Zh);
/*   */     f7 f71;
/*   */     if ((f71 = ZK).pd0(UB0.Kg0) != null)
/*   */       ((fQ)f71.pd0(UB0.Kg0)).Ct(this, true); 
/*   */   }
/*   */   
/*   */   public final void Gu0(String paramString) {
/*   */     hj0 hj0 = UB0.re0;
/*   */     int i = -2;
/*   */     Nu0 nu0;
/*   */     int j;
/*   */     if ((j = (nu0 = this.DA0).aD0(paramString)) >= 0)
/*   */       i = nu0.d50[j]; 
/*   */     if (i == -2) {
/*   */       i = hj0.glGetAttribLocation(this.Zh, paramString);
/*   */       this.DA0.b4(i, paramString);
/*   */     } 
/*   */     if (i == -1)
/*   */       return; 
/*   */     hj0.glDisableVertexAttribArray(i);
/*   */   }
/*   */   
/*   */   public final void O1(int paramInt) {
/*   */     oM();
/*   */     UB0.re0.glEnableVertexAttribArray(paramInt);
/*   */   }
/*   */   
/*   */   public final int I(String paramString) {
/*   */     int j = -1;
/*   */     Nu0 nu0;
/*   */     int i;
/*   */     if ((i = (nu0 = this.DA0).aD0(paramString)) >= 0)
/*   */       j = this.d50[i]; 
/*   */     return j;
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/Rm0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */