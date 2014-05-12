package com.example.phonicsapp.boxGame;

import org.andengine.entity.Entity;
import org.andengine.entity.IEntity;
import org.andengine.entity.modifier.DelayModifier;
import org.andengine.entity.modifier.MoveModifier;
import org.andengine.entity.modifier.ParallelEntityModifier;
import org.andengine.entity.modifier.PathModifier;
import org.andengine.entity.modifier.PathModifier.IPathModifierListener;
import org.andengine.entity.modifier.PathModifier.Path;
import org.andengine.entity.modifier.SequenceEntityModifier;
import org.andengine.entity.modifier.IEntityModifier.IEntityModifierListener;
import org.andengine.entity.sprite.AnimatedSprite;
import org.andengine.entity.sprite.Sprite;
import org.andengine.input.touch.TouchEvent;
import org.andengine.opengl.texture.region.ITiledTextureRegion;
import org.andengine.opengl.vbo.VertexBufferObjectManager;
import org.andengine.util.modifier.IModifier;
import org.andengine.util.modifier.ease.EaseBounceOut;

import com.example.phonicsapp.GameMainPage;
import com.example.phonicsapp.R;


public class Parrot extends AnimatedSprite
{

	public Parrot(float pX, float pY, ITiledTextureRegion pTiledTextureRegion,
			VertexBufferObjectManager vertexBufferObjectManager)
	{
		super(pX, pY, pTiledTextureRegion, vertexBufferObjectManager);
		// TODO Auto-generated constructor stub

	}
	
	@Override
	public boolean onAreaTouched(final TouchEvent pSceneTouchEvent, final float pTouchAreaLocalX, final float pTouchAreaLocalY)
	{
		switch (pSceneTouchEvent.getAction()) 
		{
			case TouchEvent.ACTION_DOWN:
			
				Functions.audioPlay = true;
				if(BoxGameActivity.boxGameMenuLetterSelector==1)
				{
					Functions.playAudio(R.raw.box_mo);
				}
				else if(BoxGameActivity.boxGameMenuLetterSelector==6)
				{
					Functions.playAudio(R.raw.box_bo);
				}
				else if(BoxGameActivity.boxGameMenuLetterSelector==4)
				{
					Functions.playAudio(R.raw.box_ro);
				}
				else if(BoxGameActivity.boxGameMenuLetterSelector==19)
				{
					Functions.playAudio(R.raw.box_toh);
				}
				
			break;
			
			case TouchEvent.ACTION_UP:
				
			break;
		
			case TouchEvent.ACTION_MOVE:
				
			break;
		}

		return true;
	}

	public static void pathModifier(Path p1, Entity sp, double d)
	{
		
		PathModifier a = new PathModifier(
				(float) d, p1, null, new IPathModifierListener() 
				{
					@Override
					public void onPathStarted(final PathModifier pPathModifier,
							final IEntity pEntity)
					{
						BoxGameActivity.parrot.animate(new long[]{0, 0, 150, 150}, 0, 3, true);
					}
					@Override
					public void onPathWaypointStarted(final PathModifier pPathModifier,
							final IEntity pEntity, final int pWaypointIndex) 
					{

					}
					@Override
					public void onPathWaypointFinished(final PathModifier pPathModifier,
							final IEntity pEntity, final int pWaypointIndex) 
					{

					}
					@Override
					public void onPathFinished(final PathModifier pPathModifier,
							final IEntity pEntity) 
					{
						BoxGameActivity.parrot.animate(new long[]{200, 200, 0, 0}, 0, 3, true);
					}
				});
		
	    sp.registerEntityModifier(a);
	}
	
	static void parrotPath() 
	{
		if(BoxGameActivity.boxGameMenuLetterSelector == 1)
		{
			pathModifier(new Path(2).to(BoxGameActivity.CAMERA_WIDTH, BoxGameActivity.CAMERA_HEIGHT / 2 - 340)
					.to(BoxGameActivity.CAMERA_WIDTH - 350,BoxGameActivity.CAMERA_HEIGHT / 2 - 340), 
					BoxGameActivity.parrotLetter, 4);
		}
		else if(BoxGameActivity.boxGameMenuLetterSelector == 6)
		{
			pathModifier(new Path(2).to(BoxGameActivity.CAMERA_WIDTH, BoxGameActivity.CAMERA_HEIGHT / 2 - 340)
					.to(BoxGameActivity.CAMERA_WIDTH - 350,BoxGameActivity.CAMERA_HEIGHT / 2 - 340), 
					BoxGameActivity.parrotLetter, 4);
		}
		else if(BoxGameActivity.boxGameMenuLetterSelector == 4)
		{
			pathModifier(new Path(2).to(BoxGameActivity.CAMERA_WIDTH, BoxGameActivity.CAMERA_HEIGHT / 2 - 340)
					.to(BoxGameActivity.CAMERA_WIDTH - 350,BoxGameActivity.CAMERA_HEIGHT / 2 - 340), 
					BoxGameActivity.parrotLetter, 4);
		}
		else if(BoxGameActivity.boxGameMenuLetterSelector == 19)
		{
			pathModifier(new Path(2).to(BoxGameActivity.CAMERA_WIDTH, BoxGameActivity.CAMERA_HEIGHT / 2 - 340)
					.to(BoxGameActivity.CAMERA_WIDTH - 350,BoxGameActivity.CAMERA_HEIGHT / 2 - 340), 
					BoxGameActivity.parrotLetter, 4);
		}
	}
}
