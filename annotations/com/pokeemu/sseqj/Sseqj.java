package com.pokeemu.sseqj;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class Sseqj {
  public static native int getApiLevel();
  
  public static native long newPlayer(int paramInt);
  
  public static native int loadSDAT(byte paramByte, ByteBuffer paramByteBuffer, int paramInt);
  
  public static native int loadSSEQ(long paramLong, byte paramByte, int paramInt, short paramShort);
  
  public static native int generateSamples(long paramLong, Buffer paramBuffer, int paramInt);
  
  public static native boolean isStopped(long paramLong);
  
  public static native void setVolume(long paramLong, float paramFloat);
  
  public static native void setPan(long paramLong, float paramFloat);
  
  public static native void setTrackMuted(long paramLong, int paramInt, boolean paramBoolean);
  
  public static native void setPitchShift(long paramLong, float paramFloat);
  
  public static native void deletePlayer(long paramLong);
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/pokeemu/sseqj/Sseqj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */