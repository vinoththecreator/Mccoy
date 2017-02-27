package com.mccoy.consumer;

import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import net.webservicex.www.GeoIP;
import net.webservicex.www.GeoIPService;
import net.webservicex.www.GeoIPServiceLocator;
import net.webservicex.www.GeoIPServiceSoap;

public class Ip
	{

		public static void main(String[] args) throws ServiceException, RemoteException
			{
				/* String IPAddress=args[0]; */
				GeoIPService gis = new GeoIPServiceLocator();
				GeoIPServiceSoap giss = gis.getGeoIPServiceSoap();
				GeoIP ipinfo = giss.getGeoIP("139.130.4.5");
				System.out.println(ipinfo.getCountryName());

			}

	}
