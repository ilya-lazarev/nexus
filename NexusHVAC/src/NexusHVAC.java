import org.eclipse.swt.widgets.*;

public class NexusHVAC {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display display = new Display();
		Shell shell = new Shell(display);
		shell.setText("Hello Nexus");
		shell.open();
		while( !shell.isDisposed() )
		{
			if( !display.readAndDispatch() )
			{
				display.sleep();
			}
		}
		display.dispose();

	}

}
