package castle;

public class HandlerGo extends Handler{

	protected HandlerGo(Game game) {
		super(game);
	}
	
	@Override
	public void doCmd(String word) {
		// TODO Auto-generated method stub
		game.goRoom(word);
	}

}
