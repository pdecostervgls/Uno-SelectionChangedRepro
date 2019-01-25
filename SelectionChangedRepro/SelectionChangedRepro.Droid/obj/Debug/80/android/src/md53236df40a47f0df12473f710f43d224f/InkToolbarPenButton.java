package md53236df40a47f0df12473f710f43d224f;


public class InkToolbarPenButton
	extends md53236df40a47f0df12473f710f43d224f.InkToolbarToolButton
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.Controls.InkToolbarPenButton, Uno.UI", InkToolbarPenButton.class, __md_methods);
	}


	public InkToolbarPenButton (android.content.Context p0)
	{
		super (p0);
		if (getClass () == InkToolbarPenButton.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.Controls.InkToolbarPenButton, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
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
