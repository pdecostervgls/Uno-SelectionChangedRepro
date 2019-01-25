package md567cff875f28d20379ac19e960a3af0b6;


public class KeyboardRectProvider
	extends android.widget.PopupWindow
	implements
		mono.android.IGCUserPeer,
		android.view.ViewTreeObserver.OnGlobalLayoutListener
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"n_onGlobalLayout:()V:GetOnGlobalLayoutHandler:Android.Views.ViewTreeObserver/IOnGlobalLayoutListenerInvoker, Mono.Android, Version=0.0.0.0, Culture=neutral, PublicKeyToken=null\n" +
			"";
		mono.android.Runtime.register ("Uno.UI.KeyboardRectProvider, Uno.UI", KeyboardRectProvider.class, __md_methods);
	}


	public KeyboardRectProvider ()
	{
		super ();
		if (getClass () == KeyboardRectProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.KeyboardRectProvider, Uno.UI", "", this, new java.lang.Object[] {  });
	}


	public KeyboardRectProvider (android.content.Context p0)
	{
		super (p0);
		if (getClass () == KeyboardRectProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.KeyboardRectProvider, Uno.UI", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public KeyboardRectProvider (android.content.Context p0, android.util.AttributeSet p1)
	{
		super (p0, p1);
		if (getClass () == KeyboardRectProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.KeyboardRectProvider, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android", this, new java.lang.Object[] { p0, p1 });
	}


	public KeyboardRectProvider (android.content.Context p0, android.util.AttributeSet p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == KeyboardRectProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.KeyboardRectProvider, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public KeyboardRectProvider (android.content.Context p0, android.util.AttributeSet p1, int p2, int p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == KeyboardRectProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.KeyboardRectProvider, Uno.UI", "Android.Content.Context, Mono.Android:Android.Util.IAttributeSet, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public KeyboardRectProvider (android.view.View p0)
	{
		super (p0);
		if (getClass () == KeyboardRectProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.KeyboardRectProvider, Uno.UI", "Android.Views.View, Mono.Android", this, new java.lang.Object[] { p0 });
	}


	public KeyboardRectProvider (android.view.View p0, int p1, int p2)
	{
		super (p0, p1, p2);
		if (getClass () == KeyboardRectProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.KeyboardRectProvider, Uno.UI", "Android.Views.View, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1, p2 });
	}


	public KeyboardRectProvider (android.view.View p0, int p1, int p2, boolean p3)
	{
		super (p0, p1, p2, p3);
		if (getClass () == KeyboardRectProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.KeyboardRectProvider, Uno.UI", "Android.Views.View, Mono.Android:System.Int32, mscorlib:System.Int32, mscorlib:System.Boolean, mscorlib", this, new java.lang.Object[] { p0, p1, p2, p3 });
	}


	public KeyboardRectProvider (int p0, int p1)
	{
		super (p0, p1);
		if (getClass () == KeyboardRectProvider.class)
			mono.android.TypeManager.Activate ("Uno.UI.KeyboardRectProvider, Uno.UI", "System.Int32, mscorlib:System.Int32, mscorlib", this, new java.lang.Object[] { p0, p1 });
	}


	public void onGlobalLayout ()
	{
		n_onGlobalLayout ();
	}

	private native void n_onGlobalLayout ();

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
