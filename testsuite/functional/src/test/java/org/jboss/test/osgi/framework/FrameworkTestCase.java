/*
 * JBoss, Home of Professional Open Source
 * Copyright 2005, JBoss Inc., and individual contributors as indicated
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.jboss.test.osgi.framework;

//$Id$

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.fail;

import org.jboss.osgi.testing.OSGiFrameworkTest;
import org.junit.Ignore;
import org.junit.Test;
import org.osgi.framework.BundleException;

/**
 * Test the Framework functionality
 * 
 * @author thomas.diesler@jboss.com
 * @since 29-Jul-2009
 */
public class FrameworkTestCase extends OSGiFrameworkTest
{
   @Test
   public void testGetBundleId() throws BundleException
   {
      assertEquals("BundleId == 0", 0, getFramework().getBundleId());
   }

   @Test
   public void testGetSymbolicName() throws BundleException
   {
      assertNotNull("SymbolicName not null", getFramework().getSymbolicName());
   }

   @Test
   public void testGetLocation() throws BundleException
   {
      assertEquals("System Bundle", getFramework().getLocation());
   }

   @Test
   public void testUninstall()
   {
      try
      {
         getFramework().uninstall();
         fail("BundleException expected");
      }
      catch (BundleException ex)
      {
         // expected
      }
   }

   @Test
   @Ignore
   public void testFindEntries()
   {

   }

   @Test
   @Ignore
   public void testGetBundleContext()
   {

   }

   @Test
   @Ignore
   public void testGetEntry()
   {

   }

   @Test
   @Ignore
   public void testGetEntryPaths()
   {

   }

   @Test
   @Ignore
   public void testGetHeaders()
   {

   }

   @Test
   @Ignore
   public void testGetLastModified()
   {

   }

   @Test
   @Ignore
   public void testGetRegisteredServices()
   {

   }

   @Test
   @Ignore
   public void testGetResource()
   {

   }

   @Test
   @Ignore
   public void testGetResources()
   {

   }

   @Test
   @Ignore
   public void testGetServicesInUse()
   {

   }

   @Test
   @Ignore
   public void testGetSignerCertificates()
   {

   }

   @Test
   @Ignore
   public void testGetState()
   {

   }

   @Test
   @Ignore
   public void testGetVersion()
   {

   }

   @Test
   @Ignore
   public void testHasPermission()
   {

   }

   @Test
   @Ignore
   public void testLoadClass()
   {

   }
}