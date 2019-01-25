package md59a6b0a0d876796a7d592a1be4669414c;


public class GridViewAdapter
	extends md59a6b0a0d876796a7d592a1be4669414c.BindableListAdapter
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_getCount:()I:GetGetCountHandler\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.Controls.GridViewAdapter, Uno.UI", GridViewAdapter.class, __md_methods);
	}


	public GridViewAdapter ()
	{
		super ();
		if (getClass () == GridViewAdapter.class)
			mono.android.TypeManager.Activate ("Uno.UI.Controls.GridViewAdapter, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public int getCount ()
	{
		return n_getCount ();
	}

	private native int n_getCount ();

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
