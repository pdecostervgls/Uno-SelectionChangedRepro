package md53236df40a47f0df12473f710f43d224f;


public class Panel
	extends md5bf4da100b2dbb022d895d9bb2c38dfa6.FrameworkElement
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayoutCore:(ZIIII)V:GetOnLayoutCore_ZIIIIHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.Panel, Uno.UI", Panel.class, __md_methods);
	}


	public Panel (android.content.Context p0)
	{
		super (p0);
		if (getClass () == Panel.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.Panel, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onLayoutCore (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayoutCore (p0, p1, p2, p3, p4);
	}

	private native void n_onLayoutCore (boolean p0, int p1, int p2, int p3, int p4);

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
