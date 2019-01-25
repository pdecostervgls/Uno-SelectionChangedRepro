package md5339d6556b36cd156ecaaf9b2b967a2e2;


public class Glyphs
	extends md5bf4da100b2dbb022d895d9bb2c38dfa6.FrameworkElement
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Documents.Glyphs, Uno.UI", Glyphs.class, __md_methods);
	}


	public Glyphs (android.content.Context p0)
	{
		super (p0);
		if (getClass () == Glyphs.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Documents.Glyphs, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
