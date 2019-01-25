package md5f3b65cf7af3f10b96d40f22c7db07a9e;


public class ListViewItemPresenter
	extends md53236df40a47f0df12473f710f43d224f.ContentPresenter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.Primitives.ListViewItemPresenter, Uno.UI", ListViewItemPresenter.class, __md_methods);
	}


	public ListViewItemPresenter (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ListViewItemPresenter.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.Primitives.ListViewItemPresenter, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
