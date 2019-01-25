package md5d668ef940f38cb1c2b8f5474bb7d4486;


public abstract class ArbitraryShapeBase
	extends md5d668ef940f38cb1c2b8f5474bb7d4486.Shape
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onLayoutCore:(ZIIII)V:GetOnLayoutCore_ZIIIIHandler\n" +
			"n_onMeasure:(II)V:GetOnMeasure_IIHandler\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Shapes.ArbitraryShapeBase, Uno.UI", ArbitraryShapeBase.class, __md_methods);
	}


	public ArbitraryShapeBase (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ArbitraryShapeBase.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Shapes.ArbitraryShapeBase, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public void onLayoutCore (boolean p0, int p1, int p2, int p3, int p4)
	{
		n_onLayoutCore (p0, p1, p2, p3, p4);
	}

	private native void n_onLayoutCore (boolean p0, int p1, int p2, int p3, int p4);


	public void onMeasure (int p0, int p1)
	{
		n_onMeasure (p0, p1);
	}

	private native void n_onMeasure (int p0, int p1);

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
