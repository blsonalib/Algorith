package com.bridgelabz.design.structural.adapter;

public class SocketClassAdapterImpl extends Socket implements SocketAdapter
{
	public Volt get120Volt()
	{
		return getVolt();
	}
	public Volt get12Volt()
	{
		Volt v=getVolt();
		return ConverVolt(v,10);
	}
	public  Volt get3Volt()
	{
		Volt v=getVolt();
		return ConverVolt(v,40);
	}
	private Volt ConverVolt(Volt v,int i)
	{
		return new Volt (v.getVolts()/i);
	}
}
