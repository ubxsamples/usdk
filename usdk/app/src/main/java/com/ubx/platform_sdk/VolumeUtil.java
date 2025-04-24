package com.ubx.platform_sdk;

import android.app.Service;
import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;

import java.io.IOException;

/**
 * 音量工具类
 */
public class VolumeUtil {
    private AudioManager mAudioManager;

    public VolumeUtil(){}

    //播放assets音频
    public void playSound(Context context){
        MediaPlayer mediaPlayer;
        mediaPlayer = new MediaPlayer();
        try {
            mediaPlayer.setDataSource(context.getAssets().openFd("warn.mp3"));
            mediaPlayer.prepare();
            mediaPlayer.setLooping(true);
            mediaPlayer.start();
        } catch (IOException e) {
            e.printStackTrace();
        }// 开始播放
    }
    public VolumeUtil(Context context){
        mAudioManager = (AudioManager) context.getSystemService(Service.AUDIO_SERVICE);
    }
    //获取最大多媒体音量
    public int getMediaMaxVolume(){
        return mAudioManager.getStreamMaxVolume( AudioManager.STREAM_MUSIC );
    }
    //获取当前多媒体音量
    public int getMediaVolume(){
        return mAudioManager.getStreamVolume( AudioManager.STREAM_MUSIC );
    }

    //获取最大通话音量
    public int getCallMaxVolume(){
        return mAudioManager.getStreamMaxVolume( AudioManager.STREAM_VOICE_CALL );
    }

    //获取当前通话音量
    public int getCallVolume(){
        return mAudioManager.getStreamVolume( AudioManager.STREAM_VOICE_CALL );
    }

    //获取最大系统音量
    public int getSystemMaxVolume(){

        return mAudioManager.getStreamMaxVolume(AudioManager.STREAM_SYSTEM );
    }

    //获取当前系统音量
    public int getSystemVolume(){

        return mAudioManager.getStreamVolume(AudioManager.STREAM_SYSTEM );
    }

    //获取最大提示音量
    public int getAlermMaxVolume(){
        return mAudioManager.getStreamMaxVolume(AudioManager.STREAM_ALARM );
    }

    //获取当前提示音量
    public int getAlermVolume(){
        return mAudioManager.getStreamVolume(AudioManager.STREAM_ALARM );
    }

    // 设置多媒体音量
    public void setMediaVolume(int volume){
        mAudioManager.setStreamVolume(AudioManager.STREAM_MUSIC, //音量类型
                volume,
                AudioManager.FLAG_PLAY_SOUND
                        | AudioManager.FLAG_SHOW_UI);
    }

    //设置通话音量
    public void setCallVolume(int volume){
        mAudioManager.setStreamVolume( AudioManager.STREAM_VOICE_CALL,
                volume,
                AudioManager.FLAG_PLAY_SOUND
                    | AudioManager.FLAG_SHOW_UI);
    }

    //设置提示音量
    public void setAlermVolume(int volume){
        mAudioManager.setStreamVolume( AudioManager.STREAM_ALARM,
                volume,AudioManager.FLAG_PLAY_SOUND
                        |AudioManager.FLAG_SHOW_UI);
    }


}
