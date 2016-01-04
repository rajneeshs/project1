package driver;

import com.google.inject.Guice;
import com.google.inject.Injector;

import model.Board;
import modules.BoardModule;

public class Driver
{

    public static void main(String[] args)
    {
	Injector injector = Guice.createInjector(new BoardModule());
	

	Board board = injector.getInstance(Board.class);
	
	System.out.println(board);
    }

}
