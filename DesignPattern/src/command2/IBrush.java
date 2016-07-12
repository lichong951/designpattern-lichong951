package command2;

import java.nio.file.Path;

public interface IBrush {
	void down(Path path,float x,float y);
	void move(Path path,float x,float y);
	void up(Path path,float x,float y);
	
}
