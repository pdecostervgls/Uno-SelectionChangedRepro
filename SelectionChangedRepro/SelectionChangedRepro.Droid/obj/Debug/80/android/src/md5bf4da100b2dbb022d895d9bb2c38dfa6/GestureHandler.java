package md5bf4da100b2dbb022d895d9bb2c38dfa6;


public class GestureHandler
	extends Uno.UI.UnoGestureDetector
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onSingleTap:(Landroid/view/MotionEvent;)Z:GetOnSingleTap_Landroid_view_MotionEvent_Handler\n" +
			"n_onDoubleTap:(Landroid/view/MotionEvent;)Z:GetOnDoubleTap_Landroid_view_MotionEvent_Handler\n" +
			"n_onDown:(Landroid/view/MotionEvent;)Z:GetOnDown_Landroid_view_MotionEvent_Handler\n" +
			"n_onUp:(Landroid/view/MotionEvent;)Z:GetOnUp_Landroid_view_MotionEvent_Handler\n" +
			"n_onMove:(Landroid/view/MotionEvent;)Z:GetOnMove_Landroid_view_MotionEvent_Handler\n" +
			"n_onExit:(Landroid/view/MotionEvent;)Z:GetOnExit_Landroid_view_MotionEvent_Handler\n" +
			"n_onEnter:(Landroid/view/MotionEvent;)Z:GetOnEnter_Landroid_view_MotionEvent_Handler\n" +
			"n_onCancel:(Landroid/view/MotionEvent;)Z:GetOnCancel_Landroid_view_MotionEvent_Handler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.GestureHandler, Uno.UI", GestureHandler.class, __md_methods);
	}


	public GestureHandler (android.content.Context p0, Uno.UI.UnoViewGroup p1)
	{
		super (p0, p1);
		if (getClass () == GestureHandler.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.GestureHandler, Uno.UI", "Android.Content.Context, Mono.Android:Uno.UI.UnoViewGroup, Uno.UI.BindingHelper.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public boolean onSingleTap (android.view.MotionEvent p0)
	{
		return n_onSingleTap (p0);
	}

	private native boolean n_onSingleTap (android.view.MotionEvent p0);


	public boolean onDoubleTap (android.view.MotionEvent p0)
	{
		return n_onDoubleTap (p0);
	}

	private native boolean n_onDoubleTap (android.view.MotionEvent p0);


	public boolean onDown (android.view.MotionEvent p0)
	{
		return n_onDown (p0);
	}

	private native boolean n_onDown (android.view.MotionEvent p0);


	public boolean onUp (android.view.MotionEvent p0)
	{
		return n_onUp (p0);
	}

	private native boolean n_onUp (android.view.MotionEvent p0);


	public boolean onMove (android.view.MotionEvent p0)
	{
		return n_onMove (p0);
	}

	private native boolean n_onMove (android.view.MotionEvent p0);


	public boolean onExit (android.view.MotionEvent p0)
	{
		return n_onExit (p0);
	}

	private native boolean n_onExit (android.view.MotionEvent p0);


	public boolean onEnter (android.view.MotionEvent p0)
	{
		return n_onEnter (p0);
	}

	private native boolean n_onEnter (android.view.MotionEvent p0);


	public boolean onCancel (android.view.MotionEvent p0)
	{
		return n_onCancel (p0);
	}

	private native boolean n_onCancel (android.view.MotionEvent p0);

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
