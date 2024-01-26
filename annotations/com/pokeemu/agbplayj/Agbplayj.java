package com.pokeemu.agbplayj;

import java.nio.Buffer;
import java.nio.ByteBuffer;

public abstract class Agbplayj {
  public static native int getApiLevel();
  
  public static native long newPlayer();
  
  public static native int loadRom(byte paramByte, ByteBuffer paramByteBuffer, int paramInt);
  
  public static native int loadSong(long paramLong, byte paramByte, int paramInt);
  
  public static native int generateSamples(long paramLong, Buffer paramBuffer, int paramInt);
  
  public static native boolean isStopped(long paramLong);
  
  public static native void setVolume(long paramLong, float paramFloat);
  
  public static native void deletePlayer(long paramLong);
}


/* Location:              /Users/vnnsnnt/Documents/Codespace/JavaWorkspace/RedTrainer/src/main/java/org/trainer/client/PokeMMO.jar!/com/pokeemu/agbplayj/Agbplayj.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */