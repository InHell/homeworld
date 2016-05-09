package Game;

import java.awt.Graphics2D;

import Io.Input;
import Util.Time;
import display.Display;
import graphics.TextureAtlas;
import level.Level;

public class Game implements Runnable {

	//(int width, int height, String title, int _clearColor, int numBuffers)
	public static final int WIDTH = 800;
	public static final int HEIGHT = 600;
	public static final String TITLE = "Megodrom";
	public static final int CLEAR_COLOR = 0xff000000;
	public static final int NUM_BUFFERS = 3;
	
	//update fiziki
	public static final float UPDATE_RATE = 60.0f;
	public static final float UPDATE_INTERVAL = Time.SECOND / UPDATE_RATE;
	public static final long IDLE_TIME = 1;
	public static final String ATLAS_FILE_NAME = "texture_atlas.png";
	
	private boolean         running;
	private Thread          gameThread;
	
	private Graphics2D   graphics;
	
	private Input           input;
	
	private TextureAtlas atlas;
	private Player   player;
	private Level lvl;
	

	
	
	
	
	
	
//constructor GAME
	public Game(){
		running = false;
		Display.create(WIDTH, HEIGHT, TITLE, CLEAR_COLOR, NUM_BUFFERS);
		graphics = Display.getGraphics();
		input = new Input();
	   Display.addInputListener(input);
	   atlas = new TextureAtlas(ATLAS_FILE_NAME);
       player = new Player(null, 300, 300, 2, 3, atlas);
       lvl = new Level(atlas);
		
		
	}
// START
	public synchronized void staart() {
		if(running)
			return;
		
		running = true;
		gameThread = new Thread(this);
		gameThread.start();
	}
	
//STOP
	public synchronized void stop() {
		// ! = not 
		if(!running)
			return;
			
		running = false;
		
		
		try{
		gameThread.join();
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
		cleanup();
	}
//UPDATE	
	private void update(){
		
	  player.update(input);
	  lvl.update(); 
	 
		   		
	}
	
	private void render(){
		Display.clear();
		lvl.render(graphics);
		player.render(graphics);
				
		Display.swapBuffers();
	}
	
//MAIN LOOP RUN	
	public void run() {
		
		int fps = 0;
		int upd = 0;
		int updl = 0;
		
		long count = 0;
		
		
		
		float delta = 0;
		
		long lasttime = Time.get();
		while(running){
			long now = Time.get();
			long elpasedTime = now - lasttime;
			lasttime = now;
			
			count += elpasedTime;
			
			boolean render = false;
			
			delta += ( elpasedTime / UPDATE_INTERVAL );
			while(delta > 1){ 
				update();
				upd++;
				delta --;
				if(render){
					updl++;
				}else{
				render = true;
			}
			if(render){
				
				render();
				fps++;
			} else {
				try {
					Thread.sleep(IDLE_TIME);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
			
			if(count >= Time.SECOND){
				Display.setTitle(TITLE + "|| Fps: " + fps + "| Upd: "+ upd + "| Updl "+ updl);
				upd = 0;
				fps = 0;
				updl = 0;
				count = 0;
			}
			}
		}	
	}
	
	private void cleanup(){
		Display.destroy();
	}
	
}
