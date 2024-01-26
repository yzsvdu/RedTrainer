/* 1 */
package f;

public final class B6 extends tu0 implements ib {
    public final void Np() {
        for (int i = this.RI.glGetError(); i != 0; ) {
            this.TC.jW
/* 2 */.Cw0(i);
            i = this.RI.glGetError();
        }
        /*   */
    }

    /*   */
    /*   */
    /*   */   public final ib RI;

    /*   */
    /*   */
    public B6(QD0 paramQD0, ib paramib) {
        /*   */
        super(paramQD0);
        /*   */
        this.RI = paramib;
        /*   */
    }

    /*   */
    /*   */
    public final void glActiveTexture(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glActiveTexture(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glBindTexture(int paramInt1, int paramInt2) {
        /*   */
        this.mG++;
        /*   */
        this.MD++;
        /*   */
        this.RI.glBindTexture(paramInt1, paramInt2);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glBlendFunc(int paramInt1, int paramInt2) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glBlendFunc(paramInt1, paramInt2);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glClear(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glClear(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glClearColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glClearColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glCompressedTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Buffer paramBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glCompressedTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, paramInt7, paramBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glCullFace(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glCullFace(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDeleteTexture(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDeleteTexture(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDepthFunc(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDepthFunc(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDepthMask(boolean paramBoolean) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDepthMask(paramBoolean);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDepthRangef(float paramFloat1, float paramFloat2) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDepthRangef(paramFloat1, paramFloat2);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDisable(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDisable(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDrawArrays(int paramInt1, int paramInt2, int paramInt3) {
        /*   */
        this.eO.Ed0(paramInt3);
        /*   */
        this.w20++;
        /*   */
        this.MD++;
        /*   */
        this.RI.glDrawArrays(paramInt1, paramInt2, paramInt3);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDrawElements(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer) {
        /*   */
        this.eO.Ed0(paramInt2);
        /*   */
        this.w20++;
        /*   */
        this.MD++;
        /*   */
        this.RI.glDrawElements(paramInt1, paramInt2, 5123, paramBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glEnable(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glEnable(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final int glGenTexture() {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGenTexture();
        /*   */
    }

    /*   */
    /*   */
    public final int glGetError() {
        /*   */
        this.MD++;
        /*   */
        return this.RI.glGetError();
        /*   */
    }

    /*   */
    /*   */
    public final void glGetIntegerv(int paramInt, IntBuffer paramIntBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glGetIntegerv(paramInt, paramIntBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final String glGetString(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGetString(paramInt);
        /*   */
    }

    /*   */
    /*   */
    public final void glPixelStorei(int paramInt1, int paramInt2) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glPixelStorei(paramInt1, paramInt2);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glReadPixels(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Buffer paramBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glReadPixels(0, 0, paramInt3, paramInt4, 6408, 5121, paramBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glScissor(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glScissor(paramInt1, paramInt2, paramInt3, paramInt4);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, 0, paramInt7, paramInt8, paramBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glTexParameterf(int paramInt1, int paramInt2, float paramFloat) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glTexParameterf(3553, 34046, paramFloat);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glTexSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glTexSubImage2D(paramInt1, 0, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glViewport(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glViewport(paramInt1, paramInt2, paramInt3, paramInt4);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glAttachShader(int paramInt1, int paramInt2) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glAttachShader(paramInt1, paramInt2);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glBindBuffer(int paramInt1, int paramInt2) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glBindBuffer(paramInt1, paramInt2);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glBindFramebuffer(int paramInt1, int paramInt2) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glBindFramebuffer(36160, paramInt2);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glBindRenderbuffer(int paramInt1, int paramInt2) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glBindRenderbuffer(36161, paramInt2);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glBlendFuncSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glBlendFuncSeparate(paramInt1, paramInt2, paramInt3, paramInt4);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glBufferData(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glBufferData(paramInt1, paramInt2, paramBuffer, paramInt3);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glBufferSubData(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glBufferSubData(paramInt1, 0, paramInt3, paramBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final int glCheckFramebufferStatus(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glCheckFramebufferStatus(36160);
        /*   */
    }

    /*   */
    /*   */
    public final void glCompileShader(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glCompileShader(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final int glCreateProgram() {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glCreateProgram();
        /*   */
    }

    /*   */
    /*   */
    public final int glCreateShader(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glCreateShader(paramInt);
        /*   */
    }

    /*   */
    /*   */
    public final void glDeleteBuffer(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDeleteBuffer(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDeleteFramebuffer(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDeleteFramebuffer(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDeleteProgram(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDeleteProgram(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDeleteRenderbuffer(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDeleteRenderbuffer(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDeleteShader(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDeleteShader(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDisableVertexAttribArray(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glDisableVertexAttribArray(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glDrawElements(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        /*   */
        this.eO.Ed0(paramInt2);
        /*   */
        this.w20++;
        /*   */
        this.MD++;
        /*   */
        this.RI.glDrawElements(paramInt1, paramInt2, 5123, paramInt4);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glEnableVertexAttribArray(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glEnableVertexAttribArray(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glFramebufferRenderbuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glFramebufferRenderbuffer(36160, paramInt2, 36161, paramInt4);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glFramebufferTexture2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glFramebufferTexture2D(36160, paramInt2, 3553, paramInt4, 0);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final int glGenBuffer() {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGenBuffer();
        /*   */
    }

    /*   */
    /*   */
    public final void glGenerateMipmap(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glGenerateMipmap(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final int glGenFramebuffer() {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGenFramebuffer();
        /*   */
    }

    /*   */
    /*   */
    public final int glGenRenderbuffer() {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGenRenderbuffer();
        /*   */
    }

    /*   */
    /*   */
    public final String glGetActiveAttrib(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2) {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGetActiveAttrib(paramInt1, paramInt2, paramIntBuffer1, paramIntBuffer2);
        /*   */
    }

    /*   */
    /*   */
    public final String glGetActiveUniform(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2) {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGetActiveUniform(paramInt1, paramInt2, paramIntBuffer1, paramIntBuffer2);
        /*   */
    }

    /*   */
    /*   */
    public final int glGetAttribLocation(int paramInt, String paramString) {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGetAttribLocation(paramInt, paramString);
        /*   */
    }

    /*   */
    /*   */
    public final void glGetFloatv(int paramInt, FloatBuffer paramFloatBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glGetFloatv(34047, paramFloatBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glGetProgramiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glGetProgramiv(paramInt1, paramInt2, paramIntBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final String glGetProgramInfoLog(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGetProgramInfoLog(paramInt);
        /*   */
    }

    /*   */
    /*   */
    public final void glGetShaderiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glGetShaderiv(paramInt1, 35713, paramIntBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final String glGetShaderInfoLog(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGetShaderInfoLog(paramInt);
        /*   */
    }

    /*   */
    /*   */
    public final int glGetUniformLocation(int paramInt, String paramString) {
        /*   */
        this.MD++;
        /*   */
        Np();
        /*   */
        return this.RI.glGetUniformLocation(paramInt, paramString);
        /*   */
    }

    /*   */
    /*   */
    public final void glLinkProgram(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glLinkProgram(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glRenderbufferStorage(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glRenderbufferStorage(36161, paramInt2, paramInt3, paramInt4);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glShaderSource(int paramInt, String paramString) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glShaderSource(paramInt, paramString);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glTexParameteri(int paramInt1, int paramInt2, int paramInt3) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glTexParameteri(paramInt1, paramInt2, paramInt3);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniform1f(int paramInt, float paramFloat) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniform1f(paramInt, paramFloat);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniform1i(int paramInt1, int paramInt2) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniform1i(paramInt1, paramInt2);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniform2f(int paramInt, float paramFloat1, float paramFloat2) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniform2f(paramInt, paramFloat1, paramFloat2);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniform2i(int paramInt1, int paramInt2, int paramInt3) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniform2i(paramInt1, paramInt2, paramInt3);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniform3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniform3f(paramInt, paramFloat1, paramFloat2, paramFloat3);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniform3fv(int paramInt1, int paramInt2, float[] paramArrayOffloat, int paramInt3) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniform3fv(paramInt1, paramInt2, paramArrayOffloat, 0);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniform3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniform3i(paramInt1, paramInt2, paramInt3, paramInt4);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniform4f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniform4f(paramInt, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniform4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniform4i(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniformMatrix3fv(int paramInt1, int paramInt2, boolean paramBoolean, float[] paramArrayOffloat, int paramInt3) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniformMatrix3fv(paramInt1, 1, false, paramArrayOffloat, 0);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUniformMatrix4fv(int paramInt1, int paramInt2, boolean paramBoolean, float[] paramArrayOffloat, int paramInt3) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glUniformMatrix4fv(paramInt1, paramInt2, false, paramArrayOffloat, 0);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glUseProgram(int paramInt) {
        /*   */
        this.ZZ++;
        /*   */
        this.MD++;
        /*   */
        this.RI.glUseProgram(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, Buffer paramBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glVertexAttribPointer(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, paramBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void glVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5) {
        /*   */
        this.MD++;
        /*   */
        this.RI.glVertexAttribPointer(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, paramInt5);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void Hs(int paramInt, IntBuffer paramIntBuffer) {
        /*   */
        this.w20++;
        /*   */
        this.MD++;
        /*   */
        this.RI.Hs(paramInt, paramIntBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void yy0(int paramInt) {
        /*   */
        this.MD++;
        /*   */
        this.RI.yy0(paramInt);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void Qu0(IntBuffer paramIntBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.Qu0(paramIntBuffer);
        /*   */
        Np();
        /*   */
    }

    /*   */
    /*   */
    public final void Vl(IntBuffer paramIntBuffer) {
        /*   */
        this.MD++;
        /*   */
        this.RI.Vl(paramIntBuffer);
        /*   */
        Np();
        /*   */
    }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/B6.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */