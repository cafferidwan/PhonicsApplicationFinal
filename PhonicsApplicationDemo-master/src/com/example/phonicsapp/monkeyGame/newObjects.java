package com.example.phonicsapp.monkeyGame;

import org.andengine.entity.modifier.MoveXModifier;
import org.andengine.entity.modifier.MoveYModifier;
import org.andengine.entity.modifier.SequenceEntityModifier;
import org.andengine.entity.sprite.Sprite;
import org.andengine.util.modifier.ease.EaseBounceOut;
import org.andengine.util.modifier.ease.EaseCircularInOut;
import org.andengine.util.modifier.ease.EaseQuadOut;

import android.media.MediaPlayer;

import com.example.phonicsapp.R;
import com.example.phonicsapp.boxGame.BoxGameActivity;
import com.example.phonicsapp.boxGame.Functions;

public class newObjects
{
	
	static Boolean audioPlay = false;
	static MediaPlayer mediaPlayer = new MediaPlayer();
	public static SequenceEntityModifier jumpModifier, jumpModifier1;
	
	
	public static int collisoinCheck(Sprite a, Sprite b)
	{
		if(a.getX()-b.getX()>-30 && a.getX()-b.getX()<90 && a.getY()-b.getY()<50 && a.getY()-b.getY()>-135)
		{
			BoxGameActivity.val = 1;
			//Debug.d("Close1");
			return BoxGameActivity.val;
		}
		else if(b.getX()-a.getX()>20 && b.getX()-a.getX()<140 && a.getY()-b.getY()<50 && a.getY()-b.getY()>-135)
		{
			BoxGameActivity.val = 2;
			//Debug.d("Close2");
			return BoxGameActivity.val;
		}
		else
		{
			//Debug.d("Not Close");
			return 0;
		}
	}
	
	//jump functions
	public static void jump(Sprite a, int k)
	{
		 
        float jumpDuration = (float) 0.7;
        float startX = 0;
        float startY = 0;
        
        float endX = 0;
        float endY = 0;
        
        float midPointX = 0 ;
        float midPointY = 0 ;
        
        
        if(k == 0)
        {
        	startX = a.getX();
        	startY = a.getY();
        	
        	midPointX = 120;
        	midPointY = 50;
//        	
//        	endX = BoxGameActivity.wrongObj1X;
//        	endY = BoxGameActivity.wrongObj1Y;
//        	
//        	Functions.audioPlay = true;
			Functions.playAudio(R.raw.parrot_correct);
        	
        	jumpModifier = new SequenceEntityModifier(
                    new MoveYModifier(jumpDuration, startY, midPointY,EaseQuadOut.getInstance()),
                    new MoveYModifier(jumpDuration, midPointY, endY, EaseBounceOut.getInstance()));
            a.registerEntityModifier(jumpModifier);
            
            jumpModifier1 = new SequenceEntityModifier(
                    new MoveXModifier(jumpDuration, startX, midPointX,EaseQuadOut.getInstance()),
                    new MoveXModifier(jumpDuration, midPointX, endX, EaseBounceOut.getInstance()));
            a.registerEntityModifier(jumpModifier1);
        }
        else if(k == 1)
        {
        	startX = a.getX();
        	startY = a.getY();
        	
//        	midPointX = BoxGameActivity.CAMERA_WIDTH/2+100;
//        	midPointY = 50;
//        	
//        	endX = BoxGameActivity.wrongObj2X;
//        	endY = BoxGameActivity.wrongObj2Y;
//        	
//        	Functions.audioPlay = true;
			Functions.playAudio(R.raw.parrot_correct);
			
        	jumpModifier = new SequenceEntityModifier(
                    new MoveYModifier(jumpDuration, startY, midPointY, EaseCircularInOut.getInstance()),
                    new MoveYModifier(jumpDuration, midPointY, endY, EaseBounceOut.getInstance()));
            a.registerEntityModifier(jumpModifier);
            
            jumpModifier1 = new SequenceEntityModifier(
                    new MoveXModifier(jumpDuration, startX, midPointX, EaseCircularInOut.getInstance()),
                    new MoveXModifier(jumpDuration, midPointX, endX, EaseBounceOut.getInstance()));
            a.registerEntityModifier(jumpModifier1);
            
        }
        
	}
}
