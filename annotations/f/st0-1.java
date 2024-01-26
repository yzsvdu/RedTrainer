/* 1 */ package f;public final class st0 extends tu0 { public final void lL() { for (int i = this.cy0.glGetError(); i != 0; ) { this.TC.jW
/* 2 */         .Cw0(i); i = this.cy0.glGetError(); }
/*   */      }
/*   */ 
/*   */   
/*   */   public final hj0 cy0;
/*   */   
/*   */   public st0(QD0 paramQD0, hj0 paramhj0) {
/*   */     super(paramQD0);
/*   */     this.cy0 = paramhj0;
/*   */   }
/*   */   
/*   */   public final void glActiveTexture(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glActiveTexture(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glBindTexture(int paramInt1, int paramInt2) {
/*   */     this.mG++;
/*   */     this.MD++;
/*   */     this.cy0.glBindTexture(paramInt1, paramInt2);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glBlendFunc(int paramInt1, int paramInt2) {
/*   */     this.MD++;
/*   */     this.cy0.glBlendFunc(paramInt1, paramInt2);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glClear(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glClear(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glClearColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     this.MD++;
/*   */     this.cy0.glClearColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glCompressedTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Buffer paramBuffer) {
/*   */     this.MD++;
/*   */     this.cy0.glCompressedTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, paramInt7, paramBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glCullFace(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glCullFace(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDeleteTexture(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glDeleteTexture(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDepthFunc(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glDepthFunc(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDepthMask(boolean paramBoolean) {
/*   */     this.MD++;
/*   */     this.cy0.glDepthMask(paramBoolean);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDepthRangef(float paramFloat1, float paramFloat2) {
/*   */     this.MD++;
/*   */     this.cy0.glDepthRangef(paramFloat1, paramFloat2);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDisable(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glDisable(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDrawArrays(int paramInt1, int paramInt2, int paramInt3) {
/*   */     this.eO.Ed0(paramInt3);
/*   */     this.w20++;
/*   */     this.MD++;
/*   */     this.cy0.glDrawArrays(paramInt1, paramInt2, paramInt3);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDrawElements(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer) {
/*   */     this.eO.Ed0(paramInt2);
/*   */     this.w20++;
/*   */     this.MD++;
/*   */     this.cy0.glDrawElements(paramInt1, paramInt2, 5123, paramBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glEnable(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glEnable(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final int glGenTexture() {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGenTexture();
/*   */   }
/*   */   
/*   */   public final int glGetError() {
/*   */     this.MD++;
/*   */     return this.cy0.glGetError();
/*   */   }
/*   */   
/*   */   public final void glGetIntegerv(int paramInt, IntBuffer paramIntBuffer) {
/*   */     this.MD++;
/*   */     this.cy0.glGetIntegerv(paramInt, paramIntBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final String glGetString(int paramInt) {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGetString(paramInt);
/*   */   }
/*   */   
/*   */   public final void glPixelStorei(int paramInt1, int paramInt2) {
/*   */     this.MD++;
/*   */     this.cy0.glPixelStorei(paramInt1, paramInt2);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glReadPixels(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Buffer paramBuffer) {
/*   */     this.MD++;
/*   */     this.cy0.glReadPixels(0, 0, paramInt3, paramInt4, 6408, 5121, paramBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glScissor(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.MD++;
/*   */     this.cy0.glScissor(paramInt1, paramInt2, paramInt3, paramInt4);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer) {
/*   */     this.MD++;
/*   */     this.cy0.glTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, paramInt7, paramInt8, paramBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glTexParameterf(int paramInt1, int paramInt2, float paramFloat) {
/*   */     this.MD++;
/*   */     this.cy0.glTexParameterf(3553, 34046, paramFloat);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glTexSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer) {
/*   */     this.MD++;
/*   */     this.cy0.glTexSubImage2D(paramInt1, 0, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glViewport(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.MD++;
/*   */     this.cy0.glViewport(paramInt1, paramInt2, paramInt3, paramInt4);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glAttachShader(int paramInt1, int paramInt2) {
/*   */     this.MD++;
/*   */     this.cy0.glAttachShader(paramInt1, paramInt2);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glBindBuffer(int paramInt1, int paramInt2) {
/*   */     this.MD++;
/*   */     this.cy0.glBindBuffer(paramInt1, paramInt2);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glBindFramebuffer(int paramInt1, int paramInt2) {
/*   */     this.MD++;
/*   */     this.cy0.glBindFramebuffer(36160, paramInt2);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glBindRenderbuffer(int paramInt1, int paramInt2) {
/*   */     this.MD++;
/*   */     this.cy0.glBindRenderbuffer(36161, paramInt2);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glBlendFuncSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.MD++;
/*   */     this.cy0.glBlendFuncSeparate(paramInt1, paramInt2, paramInt3, paramInt4);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glBufferData(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3) {
/*   */     this.MD++;
/*   */     this.cy0.glBufferData(paramInt1, paramInt2, paramBuffer, paramInt3);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glBufferSubData(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer) {
/*   */     this.MD++;
/*   */     this.cy0.glBufferSubData(paramInt1, 0, paramInt3, paramBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final int glCheckFramebufferStatus(int paramInt) {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glCheckFramebufferStatus(36160);
/*   */   }
/*   */   
/*   */   public final void glCompileShader(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glCompileShader(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final int glCreateProgram() {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glCreateProgram();
/*   */   }
/*   */   
/*   */   public final int glCreateShader(int paramInt) {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glCreateShader(paramInt);
/*   */   }
/*   */   
/*   */   public final void glDeleteBuffer(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glDeleteBuffer(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDeleteFramebuffer(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glDeleteFramebuffer(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDeleteProgram(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glDeleteProgram(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDeleteRenderbuffer(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glDeleteRenderbuffer(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDeleteShader(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glDeleteShader(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDisableVertexAttribArray(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glDisableVertexAttribArray(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glDrawElements(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.eO.Ed0(paramInt2);
/*   */     this.w20++;
/*   */     this.MD++;
/*   */     this.cy0.glDrawElements(paramInt1, paramInt2, 5123, paramInt4);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glEnableVertexAttribArray(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glEnableVertexAttribArray(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glFramebufferRenderbuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.MD++;
/*   */     this.cy0.glFramebufferRenderbuffer(36160, paramInt2, 36161, paramInt4);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glFramebufferTexture2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*   */     this.MD++;
/*   */     this.cy0.glFramebufferTexture2D(36160, paramInt2, 3553, paramInt4, 0);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final int glGenBuffer() {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGenBuffer();
/*   */   }
/*   */   
/*   */   public final void glGenerateMipmap(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glGenerateMipmap(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final int glGenFramebuffer() {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGenFramebuffer();
/*   */   }
/*   */   
/*   */   public final int glGenRenderbuffer() {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGenRenderbuffer();
/*   */   }
/*   */   
/*   */   public final String glGetActiveAttrib(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2) {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGetActiveAttrib(paramInt1, paramInt2, paramIntBuffer1, paramIntBuffer2);
/*   */   }
/*   */   
/*   */   public final String glGetActiveUniform(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2) {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGetActiveUniform(paramInt1, paramInt2, paramIntBuffer1, paramIntBuffer2);
/*   */   }
/*   */   
/*   */   public final int glGetAttribLocation(int paramInt, String paramString) {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGetAttribLocation(paramInt, paramString);
/*   */   }
/*   */   
/*   */   public final void glGetFloatv(int paramInt, FloatBuffer paramFloatBuffer) {
/*   */     this.MD++;
/*   */     this.cy0.glGetFloatv(34047, paramFloatBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glGetProgramiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
/*   */     this.MD++;
/*   */     this.cy0.glGetProgramiv(paramInt1, paramInt2, paramIntBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final String glGetProgramInfoLog(int paramInt) {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGetProgramInfoLog(paramInt);
/*   */   }
/*   */   
/*   */   public final void glGetShaderiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
/*   */     this.MD++;
/*   */     this.cy0.glGetShaderiv(paramInt1, 35713, paramIntBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final String glGetShaderInfoLog(int paramInt) {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGetShaderInfoLog(paramInt);
/*   */   }
/*   */   
/*   */   public final int glGetUniformLocation(int paramInt, String paramString) {
/*   */     this.MD++;
/*   */     lL();
/*   */     return this.cy0.glGetUniformLocation(paramInt, paramString);
/*   */   }
/*   */   
/*   */   public final void glLinkProgram(int paramInt) {
/*   */     this.MD++;
/*   */     this.cy0.glLinkProgram(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glRenderbufferStorage(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.MD++;
/*   */     this.cy0.glRenderbufferStorage(36161, paramInt2, paramInt3, paramInt4);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glShaderSource(int paramInt, String paramString) {
/*   */     this.MD++;
/*   */     this.cy0.glShaderSource(paramInt, paramString);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glTexParameteri(int paramInt1, int paramInt2, int paramInt3) {
/*   */     this.MD++;
/*   */     this.cy0.glTexParameteri(paramInt1, paramInt2, paramInt3);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniform1f(int paramInt, float paramFloat) {
/*   */     this.MD++;
/*   */     this.cy0.glUniform1f(paramInt, paramFloat);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniform1i(int paramInt1, int paramInt2) {
/*   */     this.MD++;
/*   */     this.cy0.glUniform1i(paramInt1, paramInt2);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniform2f(int paramInt, float paramFloat1, float paramFloat2) {
/*   */     this.MD++;
/*   */     this.cy0.glUniform2f(paramInt, paramFloat1, paramFloat2);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniform2i(int paramInt1, int paramInt2, int paramInt3) {
/*   */     this.MD++;
/*   */     this.cy0.glUniform2i(paramInt1, paramInt2, paramInt3);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniform3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
/*   */     this.MD++;
/*   */     this.cy0.glUniform3f(paramInt, paramFloat1, paramFloat2, paramFloat3);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniform3fv(int paramInt1, int paramInt2, float[] paramArrayOffloat, int paramInt3) {
/*   */     this.MD++;
/*   */     this.cy0.glUniform3fv(paramInt1, paramInt2, paramArrayOffloat, 0);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniform3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
/*   */     this.MD++;
/*   */     this.cy0.glUniform3i(paramInt1, paramInt2, paramInt3, paramInt4);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniform4f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
/*   */     this.MD++;
/*   */     this.cy0.glUniform4f(paramInt, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniform4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
/*   */     this.MD++;
/*   */     this.cy0.glUniform4i(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniformMatrix3fv(int paramInt1, int paramInt2, boolean paramBoolean, float[] paramArrayOffloat, int paramInt3) {
/*   */     this.MD++;
/*   */     this.cy0.glUniformMatrix3fv(paramInt1, 1, false, paramArrayOffloat, 0);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUniformMatrix4fv(int paramInt1, int paramInt2, boolean paramBoolean, float[] paramArrayOffloat, int paramInt3) {
/*   */     this.MD++;
/*   */     this.cy0.glUniformMatrix4fv(paramInt1, paramInt2, false, paramArrayOffloat, 0);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glUseProgram(int paramInt) {
/*   */     this.ZZ++;
/*   */     this.MD++;
/*   */     this.cy0.glUseProgram(paramInt);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, Buffer paramBuffer) {
/*   */     this.MD++;
/*   */     this.cy0.glVertexAttribPointer(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, paramBuffer);
/*   */     lL();
/*   */   }
/*   */   
/*   */   public final void glVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5) {
/*   */     this.MD++;
/*   */     this.cy0.glVertexAttribPointer(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, paramInt5);
/*   */     lL();
/*   */   } }


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/st0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */