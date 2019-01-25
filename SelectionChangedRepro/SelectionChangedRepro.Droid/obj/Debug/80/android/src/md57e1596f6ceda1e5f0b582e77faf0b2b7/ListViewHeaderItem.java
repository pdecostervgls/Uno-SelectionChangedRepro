package md57e1596f6ceda1e5f0b582e77faf0b2b7;


public class ListViewHeaderItem
	extends md53236df40a47f0df12473f710f43d224f.ContentControl
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.Legacy.ListViewHeaderItem, Uno.UI", ListViewHeaderItem.class, __md_methods);
	}


	public ListViewHeaderItem (android.content.Context p0)
	{
		super (p0);
		if (getClass () == ListViewHeaderItem.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.Legacy.ListViewHeaderItem, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
