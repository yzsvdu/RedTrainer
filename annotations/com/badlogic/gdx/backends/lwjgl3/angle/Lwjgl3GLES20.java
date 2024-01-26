package com.badlogic.gdx.backends.lwjgl3.angle;

import com.badlogic.gdx.utils.BufferUtils;
import f.JU;
import f.hj0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.nio.ShortBuffer;
import org.lwjgl.opengles.GLES20;

public class Lwjgl3GLES20 implements hj0 {
  private ByteBuffer buffer = null;
  
  private FloatBuffer floatBuffer = null;
  
  private IntBuffer intBuffer = null;
  
  private void ensureBufferCapacity(int paramInt) {
    ByteBuffer byteBuffer;
    if ((byteBuffer = this.buffer) == null || byteBuffer.capacity() < paramInt) {
      ByteBuffer byteBuffer1 = BufferUtils.ar(paramInt);
      this.floatBuffer = asFloatBuffer();
      this.intBuffer = this.buffer.asIntBuffer();
    } 
  }
  
  private FloatBuffer toFloatBuffer(float[] paramArrayOffloat, int paramInt1, int paramInt2) {
    ensureBufferCapacity(paramInt2 << 2);
    this.floatBuffer.clear();
    this.floatBuffer.limit(paramInt2);
    this.floatBuffer.put(paramArrayOffloat, paramInt1, paramInt2);
    this.floatBuffer.position(0);
    return this.floatBuffer;
  }
  
  private IntBuffer toIntBuffer(int[] paramArrayOfint, int paramInt1, int paramInt2) {
    ensureBufferCapacity(paramInt2 << 2);
    this.intBuffer.clear();
    this.intBuffer.limit(paramInt2);
    this.intBuffer.put(paramArrayOfint, paramInt1, paramInt2);
    this.intBuffer.position(0);
    return this.intBuffer;
  }
  
  public void glActiveTexture(int paramInt) {
    GLES20.glActiveTexture(paramInt);
  }
  
  public void glAttachShader(int paramInt1, int paramInt2) {
    GLES20.glAttachShader(paramInt1, paramInt2);
  }
  
  public void glBindAttribLocation(int paramInt1, int paramInt2, String paramString) {
    GLES20.glBindAttribLocation(paramInt1, paramInt2, paramString);
  }
  
  public void glBindBuffer(int paramInt1, int paramInt2) {
    GLES20.glBindBuffer(paramInt1, paramInt2);
  }
  
  public void glBindFramebuffer(int paramInt1, int paramInt2) {
    GLES20.glBindFramebuffer(paramInt1, paramInt2);
  }
  
  public void glBindRenderbuffer(int paramInt1, int paramInt2) {
    GLES20.glBindRenderbuffer(paramInt1, paramInt2);
  }
  
  public void glBindTexture(int paramInt1, int paramInt2) {
    GLES20.glBindTexture(paramInt1, paramInt2);
  }
  
  public void glBlendColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    GLES20.glBlendColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void glBlendEquation(int paramInt) {
    GLES20.glBlendEquation(paramInt);
  }
  
  public void glBlendEquationSeparate(int paramInt1, int paramInt2) {
    GLES20.glBlendEquationSeparate(paramInt1, paramInt2);
  }
  
  public void glBlendFunc(int paramInt1, int paramInt2) {
    GLES20.glBlendFunc(paramInt1, paramInt2);
  }
  
  public void glBlendFuncSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    GLES20.glBlendFuncSeparate(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void glBufferData(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3) {
    if (paramBuffer == null) {
      GLES20.glBufferData(paramInt1, paramInt2, paramInt3);
    } else if (paramBuffer instanceof ByteBuffer) {
      GLES20.glBufferData(paramInt1, (ByteBuffer)paramBuffer, paramInt3);
    } else if (paramBuffer instanceof IntBuffer) {
      GLES20.glBufferData(paramInt1, (IntBuffer)paramBuffer, paramInt3);
    } else if (paramBuffer instanceof FloatBuffer) {
      GLES20.glBufferData(paramInt1, (FloatBuffer)paramBuffer, paramInt3);
    } else {
      if (paramBuffer instanceof ShortBuffer) {
        GLES20.glBufferData(paramInt1, (ShortBuffer)paramBuffer, paramInt3);
        return;
      } 
      throw new JU("Buffer data of type " + paramBuffer.getClass().getName() + " not supported in GLES20.");
    } 
  }
  
  public void glBufferSubData(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer) {
    if (paramBuffer != null) {
      ByteBuffer byteBuffer;
      if (paramBuffer instanceof ByteBuffer) {
        long l = paramInt2;
        byteBuffer = (ByteBuffer)paramBuffer;
        GLES20.glBufferSubData(paramInt1, l, byteBuffer);
      } else {
        IntBuffer intBuffer;
        if (paramBuffer instanceof IntBuffer) {
          long l = byteBuffer;
          intBuffer = (IntBuffer)paramBuffer;
          GLES20.glBufferSubData(paramInt1, l, intBuffer);
        } else {
          FloatBuffer floatBuffer;
          if (paramBuffer instanceof FloatBuffer) {
            long l = intBuffer;
            floatBuffer = (FloatBuffer)paramBuffer;
            GLES20.glBufferSubData(paramInt1, l, floatBuffer);
          } else {
            if (paramBuffer instanceof ShortBuffer) {
              long l = floatBuffer;
              ShortBuffer shortBuffer = (ShortBuffer)paramBuffer;
              GLES20.glBufferSubData(paramInt1, l, shortBuffer);
              return;
            } 
            throw new JU("Buffer data of type " + paramBuffer.getClass().getName() + " not supported in GLES20.");
          } 
        } 
      } 
      return;
    } 
    throw new JU("Using null for the data not possible, ");
  }
  
  public int glCheckFramebufferStatus(int paramInt) {
    return GLES20.glCheckFramebufferStatus(paramInt);
  }
  
  public void glClear(int paramInt) {
    GLES20.glClear(paramInt);
  }
  
  public void glClearColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    GLES20.glClearColor(paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void glClearDepthf(float paramFloat) {
    GLES20.glClearDepthf(paramFloat);
  }
  
  public void glClearStencil(int paramInt) {
    GLES20.glClearStencil(paramInt);
  }
  
  public void glColorMask(boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    GLES20.glColorMask(paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4);
  }
  
  public void glCompileShader(int paramInt) {
    GLES20.glCompileShader(paramInt);
  }
  
  public void glCompressedTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Buffer paramBuffer) {
    if (paramBuffer instanceof ByteBuffer) {
      ByteBuffer byteBuffer = (ByteBuffer)paramBuffer;
      GLES20.glCompressedTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, this);
      return;
    } 
    throw new JU("Can't use " + paramBuffer.getClass().getName() + " with this method. Use ByteBuffer instead.");
  }
  
  public void glCompressedTexSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer) {
    throw new JU("not implemented");
  }
  
  public void glCopyTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    GLES20.glCopyTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public void glCopyTexSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8) {
    GLES20.glCopyTexSubImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public int glCreateProgram() {
    return GLES20.glCreateProgram();
  }
  
  public int glCreateShader(int paramInt) {
    return GLES20.glCreateShader(paramInt);
  }
  
  public void glCullFace(int paramInt) {
    GLES20.glCullFace(paramInt);
  }
  
  public void glDeleteBuffers(int paramInt, IntBuffer paramIntBuffer) {
    GLES20.glDeleteBuffers(paramIntBuffer);
  }
  
  public void glDeleteBuffer(int paramInt) {
    GLES20.glDeleteBuffers(paramInt);
  }
  
  public void glDeleteFramebuffers(int paramInt, IntBuffer paramIntBuffer) {
    GLES20.glDeleteFramebuffers(paramIntBuffer);
  }
  
  public void glDeleteFramebuffer(int paramInt) {
    GLES20.glDeleteFramebuffers(paramInt);
  }
  
  public void glDeleteProgram(int paramInt) {
    GLES20.glDeleteProgram(paramInt);
  }
  
  public void glDeleteRenderbuffers(int paramInt, IntBuffer paramIntBuffer) {
    GLES20.glDeleteRenderbuffers(paramIntBuffer);
  }
  
  public void glDeleteRenderbuffer(int paramInt) {
    GLES20.glDeleteRenderbuffers(paramInt);
  }
  
  public void glDeleteShader(int paramInt) {
    GLES20.glDeleteShader(paramInt);
  }
  
  public void glDeleteTextures(int paramInt, IntBuffer paramIntBuffer) {
    GLES20.glDeleteTextures(paramIntBuffer);
  }
  
  public void glDeleteTexture(int paramInt) {
    GLES20.glDeleteTextures(paramInt);
  }
  
  public void glDepthFunc(int paramInt) {
    GLES20.glDepthFunc(paramInt);
  }
  
  public void glDepthMask(boolean paramBoolean) {
    GLES20.glDepthMask(paramBoolean);
  }
  
  public void glDepthRangef(float paramFloat1, float paramFloat2) {
    GLES20.glDepthRangef(paramFloat1, paramFloat2);
  }
  
  public void glDetachShader(int paramInt1, int paramInt2) {
    GLES20.glDetachShader(paramInt1, paramInt2);
  }
  
  public void glDisable(int paramInt) {
    GLES20.glDisable(paramInt);
  }
  
  public void glDisableVertexAttribArray(int paramInt) {
    GLES20.glDisableVertexAttribArray(paramInt);
  }
  
  public void glDrawArrays(int paramInt1, int paramInt2, int paramInt3) {
    GLES20.glDrawArrays(paramInt1, paramInt2, paramInt3);
  }
  
  public void glDrawElements(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer) {
    if (paramBuffer instanceof ShortBuffer && paramInt3 == 5123) {
      GLES20.glDrawElements(paramInt1, (ShortBuffer)paramBuffer);
    } else {
      boolean bool;
      if ((bool = paramBuffer instanceof ByteBuffer) && paramInt3 == 5123) {
        GLES20.glDrawElements(paramInt1, ((ByteBuffer)paramBuffer).asShortBuffer());
      } else {
        if (bool && paramInt3 == 5121) {
          GLES20.glDrawElements(paramInt1, (ByteBuffer)paramBuffer);
          return;
        } 
        throw new JU("Can't use " + paramBuffer.getClass().getName() + " with this method. Use ShortBuffer or ByteBuffer instead.");
      } 
    } 
  }
  
  public void glEnable(int paramInt) {
    GLES20.glEnable(paramInt);
  }
  
  public void glEnableVertexAttribArray(int paramInt) {
    GLES20.glEnableVertexAttribArray(paramInt);
  }
  
  public void glFinish() {
    GLES20.glFinish();
  }
  
  public void glFlush() {
    GLES20.glFlush();
  }
  
  public void glFramebufferRenderbuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    GLES20.glFramebufferRenderbuffer(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void glFramebufferTexture2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    GLES20.glFramebufferTexture2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void glFrontFace(int paramInt) {
    GLES20.glFrontFace(paramInt);
  }
  
  public void glGenBuffers(int paramInt, IntBuffer paramIntBuffer) {
    GLES20.glGenBuffers(paramIntBuffer);
  }
  
  public int glGenBuffer() {
    return GLES20.glGenBuffers();
  }
  
  public void glGenFramebuffers(int paramInt, IntBuffer paramIntBuffer) {
    GLES20.glGenFramebuffers(paramIntBuffer);
  }
  
  public int glGenFramebuffer() {
    return GLES20.glGenFramebuffers();
  }
  
  public void glGenRenderbuffers(int paramInt, IntBuffer paramIntBuffer) {
    GLES20.glGenRenderbuffers(paramIntBuffer);
  }
  
  public int glGenRenderbuffer() {
    return GLES20.glGenRenderbuffers();
  }
  
  public void glGenTextures(int paramInt, IntBuffer paramIntBuffer) {
    GLES20.glGenTextures(paramIntBuffer);
  }
  
  public int glGenTexture() {
    return GLES20.glGenTextures();
  }
  
  public void glGenerateMipmap(int paramInt) {
    GLES20.glGenerateMipmap(paramInt);
  }
  
  public String glGetActiveAttrib(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2) {
    return GLES20.glGetActiveAttrib(paramInt1, paramInt2, 256, paramIntBuffer1, paramIntBuffer2);
  }
  
  public String glGetActiveUniform(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2) {
    return GLES20.glGetActiveUniform(paramInt1, paramInt2, 256, paramIntBuffer1, paramIntBuffer2);
  }
  
  public void glGetAttachedShaders(int paramInt1, int paramInt2, Buffer paramBuffer, IntBuffer paramIntBuffer) {
    GLES20.glGetAttachedShaders(paramInt1, (IntBuffer)paramBuffer, paramIntBuffer);
  }
  
  public int glGetAttribLocation(int paramInt, String paramString) {
    return GLES20.glGetAttribLocation(paramInt, paramString);
  }
  
  public void glGetBooleanv(int paramInt, Buffer paramBuffer) {
    GLES20.glGetBooleanv(paramInt, (ByteBuffer)paramBuffer);
  }
  
  public void glGetBufferParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glGetBufferParameteriv(paramInt1, paramInt2, paramIntBuffer);
  }
  
  public int glGetError() {
    return GLES20.glGetError();
  }
  
  public void glGetFloatv(int paramInt, FloatBuffer paramFloatBuffer) {
    GLES20.glGetFloatv(paramInt, paramFloatBuffer);
  }
  
  public void glGetFramebufferAttachmentParameteriv(int paramInt1, int paramInt2, int paramInt3, IntBuffer paramIntBuffer) {
    GLES20.glGetFramebufferAttachmentParameteriv(paramInt1, paramInt2, paramInt3, paramIntBuffer);
  }
  
  public void glGetIntegerv(int paramInt, IntBuffer paramIntBuffer) {
    GLES20.glGetIntegerv(paramInt, paramIntBuffer);
  }
  
  public String glGetProgramInfoLog(int paramInt) {
    ByteBuffer byteBuffer;
    (byteBuffer = ByteBuffer.allocateDirect(10240)).order(ByteOrder.nativeOrder());
    ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder());
    GLES20.glGetProgramInfoLog(paramInt, ByteBuffer.allocateDirect(4).asIntBuffer(), this);
    byte[] arrayOfByte;
    ByteBuffer.allocateDirect(10240).get(arrayOfByte = new byte[ByteBuffer.allocateDirect(4).asIntBuffer().get(0)]);
    return new String(this);
  }
  
  public void glGetProgramiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glGetProgramiv(paramInt1, paramInt2, paramIntBuffer);
  }
  
  public void glGetRenderbufferParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glGetRenderbufferParameteriv(paramInt1, paramInt2, paramIntBuffer);
  }
  
  public String glGetShaderInfoLog(int paramInt) {
    ByteBuffer byteBuffer;
    (byteBuffer = ByteBuffer.allocateDirect(10240)).order(ByteOrder.nativeOrder());
    ByteBuffer.allocateDirect(4).order(ByteOrder.nativeOrder());
    GLES20.glGetShaderInfoLog(paramInt, ByteBuffer.allocateDirect(4).asIntBuffer(), this);
    byte[] arrayOfByte;
    ByteBuffer.allocateDirect(10240).get(arrayOfByte = new byte[ByteBuffer.allocateDirect(4).asIntBuffer().get(0)]);
    return new String(this);
  }
  
  public void glGetShaderPrecisionFormat(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2) {
    throw new UnsupportedOperationException("unsupported, won't implement");
  }
  
  public void glGetShaderiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glGetShaderiv(paramInt1, paramInt2, paramIntBuffer);
  }
  
  public String glGetString(int paramInt) {
    return GLES20.glGetString(paramInt);
  }
  
  public void glGetTexParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer) {
    GLES20.glGetTexParameterfv(paramInt1, paramInt2, paramFloatBuffer);
  }
  
  public void glGetTexParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glGetTexParameteriv(paramInt1, paramInt2, paramIntBuffer);
  }
  
  public int glGetUniformLocation(int paramInt, String paramString) {
    return GLES20.glGetUniformLocation(paramInt, paramString);
  }
  
  public void glGetUniformfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer) {
    GLES20.glGetUniformfv(paramInt1, paramInt2, paramFloatBuffer);
  }
  
  public void glGetUniformiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glGetUniformiv(paramInt1, paramInt2, paramIntBuffer);
  }
  
  public void glGetVertexAttribPointerv(int paramInt1, int paramInt2, Buffer paramBuffer) {
    throw new UnsupportedOperationException("unsupported, won't implement");
  }
  
  public void glGetVertexAttribfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer) {
    GLES20.glGetVertexAttribfv(paramInt1, paramInt2, paramFloatBuffer);
  }
  
  public void glGetVertexAttribiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glGetVertexAttribiv(paramInt1, paramInt2, paramIntBuffer);
  }
  
  public void glHint(int paramInt1, int paramInt2) {
    GLES20.glHint(paramInt1, paramInt2);
  }
  
  public boolean glIsBuffer(int paramInt) {
    return GLES20.glIsBuffer(paramInt);
  }
  
  public boolean glIsEnabled(int paramInt) {
    return GLES20.glIsEnabled(paramInt);
  }
  
  public boolean glIsFramebuffer(int paramInt) {
    return GLES20.glIsFramebuffer(paramInt);
  }
  
  public boolean glIsProgram(int paramInt) {
    return GLES20.glIsProgram(paramInt);
  }
  
  public boolean glIsRenderbuffer(int paramInt) {
    return GLES20.glIsRenderbuffer(paramInt);
  }
  
  public boolean glIsShader(int paramInt) {
    return GLES20.glIsShader(paramInt);
  }
  
  public boolean glIsTexture(int paramInt) {
    return GLES20.glIsTexture(paramInt);
  }
  
  public void glLineWidth(float paramFloat) {
    GLES20.glLineWidth(paramFloat);
  }
  
  public void glLinkProgram(int paramInt) {
    GLES20.glLinkProgram(paramInt);
  }
  
  public void glPixelStorei(int paramInt1, int paramInt2) {
    GLES20.glPixelStorei(paramInt1, paramInt2);
  }
  
  public void glPolygonOffset(float paramFloat1, float paramFloat2) {
    GLES20.glPolygonOffset(paramFloat1, paramFloat2);
  }
  
  public void glReadPixels(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Buffer paramBuffer) {
    if (paramBuffer instanceof ByteBuffer) {
      ByteBuffer byteBuffer = (ByteBuffer)paramBuffer;
      GLES20.glReadPixels(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, this);
    } else if (paramBuffer instanceof ShortBuffer) {
      ShortBuffer shortBuffer = (ShortBuffer)paramBuffer;
      GLES20.glReadPixels(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, this);
    } else if (paramBuffer instanceof IntBuffer) {
      IntBuffer intBuffer = (IntBuffer)paramBuffer;
      GLES20.glReadPixels(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, this);
    } else {
      if (paramBuffer instanceof FloatBuffer) {
        FloatBuffer floatBuffer = (FloatBuffer)paramBuffer;
        GLES20.glReadPixels(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, this);
        return;
      } 
      throw new JU("Can't use " + paramBuffer.getClass().getName() + " with this method. Use ByteBuffer, ShortBuffer, IntBuffer or FloatBuffer instead.");
    } 
  }
  
  public void glReleaseShaderCompiler() {}
  
  public void glRenderbufferStorage(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    GLES20.glRenderbufferStorage(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void glSampleCoverage(float paramFloat, boolean paramBoolean) {
    GLES20.glSampleCoverage(paramFloat, paramBoolean);
  }
  
  public void glScissor(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    GLES20.glScissor(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void glShaderBinary(int paramInt1, IntBuffer paramIntBuffer, int paramInt2, Buffer paramBuffer, int paramInt3) {
    throw new UnsupportedOperationException("unsupported, won't implement");
  }
  
  public void glShaderSource(int paramInt, String paramString) {
    GLES20.glShaderSource(paramInt, paramString);
  }
  
  public void glStencilFunc(int paramInt1, int paramInt2, int paramInt3) {
    GLES20.glStencilFunc(paramInt1, paramInt2, paramInt3);
  }
  
  public void glStencilFuncSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    GLES20.glStencilFuncSeparate(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void glStencilMask(int paramInt) {
    GLES20.glStencilMask(paramInt);
  }
  
  public void glStencilMaskSeparate(int paramInt1, int paramInt2) {
    GLES20.glStencilMaskSeparate(paramInt1, paramInt2);
  }
  
  public void glStencilOp(int paramInt1, int paramInt2, int paramInt3) {
    GLES20.glStencilOp(paramInt1, paramInt2, paramInt3);
  }
  
  public void glStencilOpSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    GLES20.glStencilOpSeparate(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void glTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer) {
    if (paramBuffer == null) {
      GLES20.glTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, null);
    } else if (paramBuffer instanceof ByteBuffer) {
      ByteBuffer byteBuffer = (ByteBuffer)paramBuffer;
      GLES20.glTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, this);
    } else if (paramBuffer instanceof ShortBuffer) {
      ShortBuffer shortBuffer = (ShortBuffer)paramBuffer;
      GLES20.glTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, this);
    } else if (paramBuffer instanceof IntBuffer) {
      IntBuffer intBuffer = (IntBuffer)paramBuffer;
      GLES20.glTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, this);
    } else {
      if (paramBuffer instanceof FloatBuffer) {
        FloatBuffer floatBuffer = (FloatBuffer)paramBuffer;
        GLES20.glTexImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, this);
        return;
      } 
      throw new JU("Can't use " + paramBuffer.getClass().getName() + " with this method. Use ByteBuffer, ShortBuffer, IntBuffer, FloatBuffer or DoubleBuffer instead.");
    } 
  }
  
  public void glTexParameterf(int paramInt1, int paramInt2, float paramFloat) {
    GLES20.glTexParameterf(paramInt1, paramInt2, paramFloat);
  }
  
  public void glTexParameterfv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer) {
    GLES20.glTexParameterfv(paramInt1, paramInt2, paramFloatBuffer);
  }
  
  public void glTexParameteri(int paramInt1, int paramInt2, int paramInt3) {
    GLES20.glTexParameteri(paramInt1, paramInt2, paramInt3);
  }
  
  public void glTexParameteriv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glTexParameteriv(paramInt1, paramInt2, paramIntBuffer);
  }
  
  public void glTexSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer) {
    if (paramBuffer instanceof ByteBuffer) {
      ByteBuffer byteBuffer = (ByteBuffer)paramBuffer;
      GLES20.glTexSubImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, this);
    } else if (paramBuffer instanceof ShortBuffer) {
      ShortBuffer shortBuffer = (ShortBuffer)paramBuffer;
      GLES20.glTexSubImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, this);
    } else if (paramBuffer instanceof IntBuffer) {
      IntBuffer intBuffer = (IntBuffer)paramBuffer;
      GLES20.glTexSubImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, this);
    } else {
      if (paramBuffer instanceof FloatBuffer) {
        FloatBuffer floatBuffer = (FloatBuffer)paramBuffer;
        GLES20.glTexSubImage2D(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, this);
        return;
      } 
      throw new JU("Can't use " + paramBuffer.getClass().getName() + " with this method. Use ByteBuffer, ShortBuffer, IntBuffer, FloatBuffer or DoubleBuffer instead.");
    } 
  }
  
  public void glUniform1f(int paramInt, float paramFloat) {
    GLES20.glUniform1f(paramInt, paramFloat);
  }
  
  public void glUniform1fv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer) {
    GLES20.glUniform1fv(paramInt1, paramFloatBuffer);
  }
  
  public void glUniform1fv(int paramInt1, int paramInt2, float[] paramArrayOffloat, int paramInt3) {
    GLES20.glUniform1fv(paramInt1, toFloatBuffer(paramArrayOffloat, paramInt3, paramInt2));
  }
  
  public void glUniform1i(int paramInt1, int paramInt2) {
    GLES20.glUniform1i(paramInt1, paramInt2);
  }
  
  public void glUniform1iv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glUniform1iv(paramInt1, paramIntBuffer);
  }
  
  public void glUniform1iv(int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    GLES20.glUniform1iv(paramInt1, toIntBuffer(paramArrayOfint, paramInt3, paramInt2));
  }
  
  public void glUniform2f(int paramInt, float paramFloat1, float paramFloat2) {
    GLES20.glUniform2f(paramInt, paramFloat1, paramFloat2);
  }
  
  public void glUniform2fv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer) {
    GLES20.glUniform2fv(paramInt1, paramFloatBuffer);
  }
  
  public void glUniform2fv(int paramInt1, int paramInt2, float[] paramArrayOffloat, int paramInt3) {
    GLES20.glUniform2fv(paramInt1, toFloatBuffer(paramArrayOffloat, paramInt3, paramInt2 << 1));
  }
  
  public void glUniform2i(int paramInt1, int paramInt2, int paramInt3) {
    GLES20.glUniform2i(paramInt1, paramInt2, paramInt3);
  }
  
  public void glUniform2iv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glUniform2iv(paramInt1, paramIntBuffer);
  }
  
  public void glUniform2iv(int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    GLES20.glUniform2iv(paramInt1, toIntBuffer(paramArrayOfint, paramInt3, paramInt2 << 1));
  }
  
  public void glUniform3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
    GLES20.glUniform3f(paramInt, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void glUniform3fv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer) {
    GLES20.glUniform3fv(paramInt1, paramFloatBuffer);
  }
  
  public void glUniform3fv(int paramInt1, int paramInt2, float[] paramArrayOffloat, int paramInt3) {
    GLES20.glUniform3fv(paramInt1, toFloatBuffer(paramArrayOffloat, paramInt3, paramInt2 * 3));
  }
  
  public void glUniform3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    GLES20.glUniform3i(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void glUniform3iv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glUniform3iv(paramInt1, paramIntBuffer);
  }
  
  public void glUniform3iv(int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    GLES20.glUniform3iv(paramInt1, toIntBuffer(paramArrayOfint, paramInt3, paramInt2 * 3));
  }
  
  public void glUniform4f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    GLES20.glUniform4f(paramInt, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void glUniform4fv(int paramInt1, int paramInt2, FloatBuffer paramFloatBuffer) {
    GLES20.glUniform4fv(paramInt1, paramFloatBuffer);
  }
  
  public void glUniform4fv(int paramInt1, int paramInt2, float[] paramArrayOffloat, int paramInt3) {
    GLES20.glUniform4fv(paramInt1, toFloatBuffer(paramArrayOffloat, paramInt3, paramInt2 << 2));
  }
  
  public void glUniform4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    GLES20.glUniform4i(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public void glUniform4iv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer) {
    GLES20.glUniform4iv(paramInt1, paramIntBuffer);
  }
  
  public void glUniform4iv(int paramInt1, int paramInt2, int[] paramArrayOfint, int paramInt3) {
    GLES20.glUniform4iv(paramInt1, toIntBuffer(paramArrayOfint, paramInt3, paramInt2 << 2));
  }
  
  public void glUniformMatrix2fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer) {
    GLES20.glUniformMatrix2fv(paramInt1, paramBoolean, paramFloatBuffer);
  }
  
  public void glUniformMatrix2fv(int paramInt1, int paramInt2, boolean paramBoolean, float[] paramArrayOffloat, int paramInt3) {
    int i = paramInt2 << 2;
    GLES20.glUniformMatrix2fv(paramInt1, paramBoolean, toFloatBuffer(paramArrayOffloat, paramInt3, i));
  }
  
  public void glUniformMatrix3fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer) {
    GLES20.glUniformMatrix3fv(paramInt1, paramBoolean, paramFloatBuffer);
  }
  
  public void glUniformMatrix3fv(int paramInt1, int paramInt2, boolean paramBoolean, float[] paramArrayOffloat, int paramInt3) {
    int i = paramInt2 * 9;
    GLES20.glUniformMatrix3fv(paramInt1, paramBoolean, toFloatBuffer(paramArrayOffloat, paramInt3, i));
  }
  
  public void glUniformMatrix4fv(int paramInt1, int paramInt2, boolean paramBoolean, FloatBuffer paramFloatBuffer) {
    GLES20.glUniformMatrix4fv(paramInt1, paramBoolean, paramFloatBuffer);
  }
  
  public void glUniformMatrix4fv(int paramInt1, int paramInt2, boolean paramBoolean, float[] paramArrayOffloat, int paramInt3) {
    int i = paramInt2 << 4;
    GLES20.glUniformMatrix4fv(paramInt1, paramBoolean, toFloatBuffer(paramArrayOffloat, paramInt3, i));
  }
  
  public void glUseProgram(int paramInt) {
    GLES20.glUseProgram(paramInt);
  }
  
  public void glValidateProgram(int paramInt) {
    GLES20.glValidateProgram(paramInt);
  }
  
  public void glVertexAttrib1f(int paramInt, float paramFloat) {
    GLES20.glVertexAttrib1f(paramInt, paramFloat);
  }
  
  public void glVertexAttrib1fv(int paramInt, FloatBuffer paramFloatBuffer) {
    GLES20.glVertexAttrib1f(paramInt, paramFloatBuffer.get());
  }
  
  public void glVertexAttrib2f(int paramInt, float paramFloat1, float paramFloat2) {
    GLES20.glVertexAttrib2f(paramInt, paramFloat1, paramFloat2);
  }
  
  public void glVertexAttrib2fv(int paramInt, FloatBuffer paramFloatBuffer) {
    float f = paramFloatBuffer.get();
    GLES20.glVertexAttrib2f(paramInt, f, paramFloatBuffer.get());
  }
  
  public void glVertexAttrib3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3) {
    GLES20.glVertexAttrib3f(paramInt, paramFloat1, paramFloat2, paramFloat3);
  }
  
  public void glVertexAttrib3fv(int paramInt, FloatBuffer paramFloatBuffer) {
    float f1 = paramFloatBuffer.get();
    float f2 = paramFloatBuffer.get();
    float f3 = paramFloatBuffer.get();
    GLES20.glVertexAttrib3f(paramInt, f1, f2, f3);
  }
  
  public void glVertexAttrib4f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    GLES20.glVertexAttrib4f(paramInt, paramFloat1, paramFloat2, paramFloat3, paramFloat4);
  }
  
  public void glVertexAttrib4fv(int paramInt, FloatBuffer paramFloatBuffer) {
    float f1 = paramFloatBuffer.get();
    float f2 = paramFloatBuffer.get();
    float f3 = paramFloatBuffer.get();
    float f4 = paramFloatBuffer.get();
    GLES20.glVertexAttrib4f(paramInt, f1, f2, f3, f4);
  }
  
  public void glVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, Buffer paramBuffer) {
    if (paramBuffer instanceof ByteBuffer) {
      if (paramInt3 == 5120 || paramInt3 == 5121) {
        ByteBuffer byteBuffer = (ByteBuffer)paramBuffer;
        GLES20.glVertexAttribPointer(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, this);
      } else if (paramInt3 == 5122 || paramInt3 == 5123) {
        ShortBuffer shortBuffer = ((ByteBuffer)paramBuffer).asShortBuffer();
        GLES20.glVertexAttribPointer(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, this);
      } else if (paramInt3 == 5126) {
        FloatBuffer floatBuffer = ((ByteBuffer)paramBuffer).asFloatBuffer();
        GLES20.glVertexAttribPointer(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, this);
      } else {
        throw new JU("Can't use " + paramBuffer.getClass().getName() + " with type " + paramInt3 + " with this method. Use ByteBuffer and one of GL_BYTE, GL_UNSIGNED_BYTE, GL_SHORT, GL_UNSIGNED_SHORT or GL_FLOAT for type.");
      } 
    } else {
      if (paramBuffer instanceof FloatBuffer) {
        if (paramInt3 == 5126) {
          FloatBuffer floatBuffer = (FloatBuffer)paramBuffer;
          GLES20.glVertexAttribPointer(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, this);
          return;
        } 
        throw new JU("Can't use " + paramBuffer.getClass().getName() + " with type " + paramInt3 + " with this method.");
      } 
      throw new JU("Can't use " + paramBuffer.getClass().getName() + " with this method. Use ByteBuffer instead.");
    } 
  }
  
  public void glViewport(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    GLES20.glViewport(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void glDrawElements(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    long l = paramInt4;
    GLES20.glDrawElements(paramInt1, paramInt2, paramInt3, l);
  }
  
  public void glVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5) {
    long l = paramInt5;
    GLES20.glVertexAttribPointer(paramInt1, paramInt2, paramInt3, paramBoolean, paramInt4, l);
  }
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/badlogic/gdx/backends/lwjgl3/angle/Lwjgl3GLES20.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */