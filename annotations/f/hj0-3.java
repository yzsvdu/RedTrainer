package f;

import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;

public interface hj0 {
  void glActiveTexture(int paramInt);
  
  void glBindTexture(int paramInt1, int paramInt2);
  
  void glBlendFunc(int paramInt1, int paramInt2);
  
  void glClear(int paramInt);
  
  void glClearColor(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
  
  void glCompressedTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, Buffer paramBuffer);
  
  void glCullFace(int paramInt);
  
  void glDeleteTexture(int paramInt);
  
  void glDepthFunc(int paramInt);
  
  void glDepthMask(boolean paramBoolean);
  
  void glDepthRangef(float paramFloat1, float paramFloat2);
  
  void glDisable(int paramInt);
  
  void glDrawArrays(int paramInt1, int paramInt2, int paramInt3);
  
  void glDrawElements(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer);
  
  void glEnable(int paramInt);
  
  int glGenTexture();
  
  int glGetError();
  
  void glGetIntegerv(int paramInt, IntBuffer paramIntBuffer);
  
  String glGetString(int paramInt);
  
  void glPixelStorei(int paramInt1, int paramInt2);
  
  void glReadPixels(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, Buffer paramBuffer);
  
  void glScissor(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void glTexImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer);
  
  void glTexParameterf(int paramInt1, int paramInt2, float paramFloat);
  
  void glTexSubImage2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, Buffer paramBuffer);
  
  void glViewport(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void glAttachShader(int paramInt1, int paramInt2);
  
  void glBindBuffer(int paramInt1, int paramInt2);
  
  void glBindFramebuffer(int paramInt1, int paramInt2);
  
  void glBindRenderbuffer(int paramInt1, int paramInt2);
  
  void glBlendFuncSeparate(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void glBufferData(int paramInt1, int paramInt2, Buffer paramBuffer, int paramInt3);
  
  void glBufferSubData(int paramInt1, int paramInt2, int paramInt3, Buffer paramBuffer);
  
  int glCheckFramebufferStatus(int paramInt);
  
  void glCompileShader(int paramInt);
  
  int glCreateProgram();
  
  int glCreateShader(int paramInt);
  
  void glDeleteBuffer(int paramInt);
  
  void glDeleteFramebuffer(int paramInt);
  
  void glDeleteProgram(int paramInt);
  
  void glDeleteRenderbuffer(int paramInt);
  
  void glDeleteShader(int paramInt);
  
  void glDisableVertexAttribArray(int paramInt);
  
  void glDrawElements(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void glEnableVertexAttribArray(int paramInt);
  
  void glFramebufferRenderbuffer(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void glFramebufferTexture2D(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  int glGenBuffer();
  
  void glGenerateMipmap(int paramInt);
  
  int glGenFramebuffer();
  
  int glGenRenderbuffer();
  
  String glGetActiveAttrib(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2);
  
  String glGetActiveUniform(int paramInt1, int paramInt2, IntBuffer paramIntBuffer1, IntBuffer paramIntBuffer2);
  
  int glGetAttribLocation(int paramInt, String paramString);
  
  void glGetFloatv(int paramInt, FloatBuffer paramFloatBuffer);
  
  void glGetProgramiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer);
  
  String glGetProgramInfoLog(int paramInt);
  
  void glGetShaderiv(int paramInt1, int paramInt2, IntBuffer paramIntBuffer);
  
  String glGetShaderInfoLog(int paramInt);
  
  int glGetUniformLocation(int paramInt, String paramString);
  
  void glLinkProgram(int paramInt);
  
  void glRenderbufferStorage(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void glShaderSource(int paramInt, String paramString);
  
  void glTexParameteri(int paramInt1, int paramInt2, int paramInt3);
  
  void glUniform1f(int paramInt, float paramFloat);
  
  void glUniform1i(int paramInt1, int paramInt2);
  
  void glUniform2f(int paramInt, float paramFloat1, float paramFloat2);
  
  void glUniform2i(int paramInt1, int paramInt2, int paramInt3);
  
  void glUniform3f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3);
  
  void glUniform3fv(int paramInt1, int paramInt2, float[] paramArrayOffloat, int paramInt3);
  
  void glUniform3i(int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  void glUniform4f(int paramInt, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4);
  
  void glUniform4i(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  void glUniformMatrix3fv(int paramInt1, int paramInt2, boolean paramBoolean, float[] paramArrayOffloat, int paramInt3);
  
  void glUniformMatrix4fv(int paramInt1, int paramInt2, boolean paramBoolean, float[] paramArrayOffloat, int paramInt3);
  
  void glUseProgram(int paramInt);
  
  void glVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, Buffer paramBuffer);
  
  void glVertexAttribPointer(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int paramInt4, int paramInt5);
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/f/hj0.class
 * Java compiler version: 7 (51.0)
 * JD-Core Version:       1.1.3
 */