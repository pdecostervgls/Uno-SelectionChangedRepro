package md5d668ef940f38cb1c2b8f5474bb7d4486;


public abstract class Shape
	extends md5bf4da100b2dbb022d895d9bb2c38dfa6.FrameworkElement
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Shapes.Shape, Uno.UI", Shape.class, __md_methods);
	}


	public Shape (android.content.Context p0)
	{
		super (p0);
		if (getClass () == Shape.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Shapes.Shape, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}

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
