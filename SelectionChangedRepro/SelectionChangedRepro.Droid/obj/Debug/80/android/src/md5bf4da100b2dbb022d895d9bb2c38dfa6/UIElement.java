package md5bf4da100b2dbb022d895d9bb2c38dfa6;


public class UIElement
	extends md59a6b0a0d876796a7d592a1be4669414c.BindableView
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_nativeHitCheck:()Z:GetNativeHitCheckHandler\n" +
			"n_GetDependencyPropertyValue:(Ljava/lang/String;)Ljava/lang/Object;:__export__\n" +
			"";
		mono.android.Runtime.register ("Windows.UI.Xaml.UIElement, Uno.UI", UIElement.class, __md_methods);
	}


	public UIElement (android.content.Context p0)
	{
		super (p0);
		if (getClass () == UIElement.class)
			mono.android.TypeManager.Activate ("Windows.UI.Xaml.UIElement, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public boolean nativeHitCheck ()
	{
		return n_nativeHitCheck ();
	}

	private native boolean n_nativeHitCheck ();


	public java.lang.Object GetDependencyPropertyValue (java.lang.String p0)
	{
		return n_GetDependencyPropertyValue (p0);
	}

	private native java.lang.Object n_GetDependencyPropertyValue (java.lang.String p0);

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
