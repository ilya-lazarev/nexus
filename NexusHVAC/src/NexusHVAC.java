import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Cursor;
import org.eclipse.swt.layout.FillLayout;
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
		
		
		shell.setLayout(new FillLayout());
		Button button = new Button(shell, SWT.PUSH);
	    button.setText("Change cursor");
	    
	    button.addListener(SWT.Selection, new Listener() 
	    {
	    	boolean wait=false;
	    	Cursor cursor;
	    	
			@Override
	        public void handleEvent(Event arg0) 
	        {
	            wait = !wait;
	
	            if(cursor != null)
	                cursor.dispose();
	
	            cursor = wait ? new Cursor(this. display, SWT.CURSOR_WAIT) : new Cursor(display, SWT.CURSOR_ARROW);
	
	            shell.setCursor(cursor);
	        }
	    });

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
