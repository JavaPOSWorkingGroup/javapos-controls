//////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is now under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//////////////////////////////////////////////////////////////////////
//------------------------------------------------------------------------------
//
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
//
// CoinDispenser.java - A JavaPOS 1.6.0 device control
//
//------------------------------------------------------------------------------

package jpos;

import jpos.events.*;
import jpos.services.*;
import java.util.Vector;
import jpos.loader.*;

public class CoinDispenser
   implements CoinDispenserControl16, JposConst
{
    //--------------------------------------------------------------------------
    // Variables
    //--------------------------------------------------------------------------

    // Static Data
    protected static final String deviceControlDescription =
                                    "JavaPOS CoinDispenser Device Control";
    protected static final int    deviceControlVersion = 1006000; // 1.6.0
    protected static final int    deviceVersion12 = 1002000; // 1.2.0
    protected static final int    deviceVersion13 = 1003000; // 1.3.0
    protected static final int    deviceVersion14 = 1004000; // 1.4.0
    protected static final int    deviceVersion15 = 1005000; // 1.5.0
    protected static final int    deviceVersion16 = 1006000; // 1.6.0

    // Instance Data
    protected JposServiceConnection serviceConnection;
    protected int serviceVersion;
    protected CoinDispenserService12 service12;
    protected CoinDispenserService13 service13;
    protected CoinDispenserService14 service14;
    protected CoinDispenserService15 service15;
    protected CoinDispenserService16 service16;
    protected Vector directIOListeners;
    protected Vector statusUpdateListeners;

    //--------------------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------------------

    public CoinDispenser()
    {
        serviceConnection = null;
        service12 = null;
        service13 = null;
        service14 = null;
        service15 = null;
        service16 = null;
        directIOListeners = new Vector();
        statusUpdateListeners = new Vector();
    }

    //--------------------------------------------------------------------------
    // Capabilities
    //--------------------------------------------------------------------------

    public boolean getCapEmptySensor()
        throws JposException
    {
        try
        {
            return service12.getCapEmptySensor();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapJamSensor()
        throws JposException
    {
        try
        {
            return service12.getCapJamSensor();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getCapNearEmptySensor()
        throws JposException
    {
        try
        {
            return service12.getCapNearEmptySensor();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getCapPowerReporting()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion13))
        {
            try
            {
                return service13.getCapPowerReporting();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the CoinDispenserControl13 interface");
        }
    }

    //--------------------------------------------------------------------------
    // Properties
    //--------------------------------------------------------------------------

    public String getCheckHealthText()
        throws JposException
    {
        try
        {
            return service12.getCheckHealthText();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getClaimed()
        throws JposException
    {
        try
        {
            return service12.getClaimed();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getDeviceControlDescription()
    {
        return deviceControlDescription;
    }

    public int getDeviceControlVersion()
    {
        return deviceControlVersion;
    }

    public boolean getDeviceEnabled()
        throws JposException
    {
        try
        {
            return service12.getDeviceEnabled();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setDeviceEnabled(boolean deviceEnabled)
        throws JposException
    {
        try
        {
            service12.setDeviceEnabled(deviceEnabled);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getDeviceServiceDescription()
        throws JposException
    {
        try
        {
            return service12.getDeviceServiceDescription();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getDeviceServiceVersion()
        throws JposException
    {
        try
        {
            return service12.getDeviceServiceVersion();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public boolean getFreezeEvents()
        throws JposException
    {
        try
        {
            return service12.getFreezeEvents();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void setFreezeEvents(boolean freezeEvents)
        throws JposException
    {
        try
        {
            service12.setFreezeEvents(freezeEvents);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getPhysicalDeviceDescription()
        throws JposException
    {
        try
        {
            return service12.getPhysicalDeviceDescription();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public String getPhysicalDeviceName()
        throws JposException
    {
        try
        {
            return service12.getPhysicalDeviceName();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getState()
    {
        try
        {
            return service12.getState();
        }
        catch(Exception e)
        {
            return JPOS_S_CLOSED;
        }
    }

    public int getDispenserStatus()
        throws JposException
    {
        try
        {
            return service12.getDispenserStatus();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public int getPowerNotify()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion13))
        {
            try
            {
                return service13.getPowerNotify();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the CoinDispenserControl13 interface");
        }
    }

    public void setPowerNotify(int powerNotify)
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion13))
        {
            try
            {
                service13.setPowerNotify(powerNotify);
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the CoinDispenserControl13 interface");
        }
    }

    public int getPowerState()
        throws JposException
    {
        // Attempt call to service if:
        //   1. The service supports the necessary service interface version
        //   2. The service is not open (this insures we fire the correct exception)
        if((service12 == null) || (serviceVersion >= deviceVersion13))
        {
            try
            {
                return service13.getPowerState();
            }
            catch(JposException je)
            {
                throw je;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
            }
        }
        else
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Service does not support the CoinDispenserControl13 interface");
        }
    }

    //--------------------------------------------------------------------------
    // Methods
    //--------------------------------------------------------------------------

    public void claim(int timeout)
        throws JposException
    {
        try
        {
            service12.claim(timeout);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public synchronized void close()
        throws JposException
    {
        try
        {
            service12.close();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED,
                                    "Service not open",
                                    e);
        }

        try
        {
            serviceConnection.disconnect();
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Unable to free service connection",
                                    e);
        }
        finally
        {
            service12 = null;
            service13 = null;
            service14 = null;
            service15 = null;
            service16 = null;
        }
    }

    public void checkHealth(int level)
        throws JposException
    {
        try
        {
            service12.checkHealth(level);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void directIO(int command, int[] data, Object object)
        throws JposException
    {
        try
        {
            service12.directIO(command, data, object);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public synchronized void open(String logicalDeviceName)
        throws JposException
    {
        // Make sure the control is not already open
        if(service12 != null)
        {
            throw new JposException(JPOS_E_ILLEGAL,
                                    "Device control already open");
        }

        // Use JCL to get a connection to the device service
        try
        {
            serviceConnection = JposServiceLoader.findService(logicalDeviceName);
            serviceConnection.connect();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Could not connect to service",
                                    e);
        }

        // Get an instance of the minimum service level supported
        try
        {
            service12 = (CoinDispenserService12)serviceConnection.getService();
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Could not get service instance",
                                    e);
        }

        // Get service version
        try
        {
            serviceVersion = service12.getDeviceServiceVersion();
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Could not get service version information",
                                    e);
        }

        // Make sure that the service actually conforms to the interfaces it
        // claims to.
        if(serviceVersion >= deviceVersion13)
        {
            try
            {
                service13 = (CoinDispenserService13)service12;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement CoinDispenserDevice13 interface",
                                        e);
            }
        }

        if(serviceVersion >= deviceVersion14)
        {
            try
            {
                service14 = (CoinDispenserService14)service12;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement CoinDispenserDevice14 interface",
                                        e);
            }
        }

        if(serviceVersion >= deviceVersion15)
        {
            try
            {
                service15 = (CoinDispenserService15)service12;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement CoinDispenserDevice15 interface",
                                        e);
            }
        }

        if(serviceVersion >= deviceVersion16)
        {
            try
            {
                service16 = (CoinDispenserService16)service12;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement CoinDispenserDevice16 interface",
                                        e);
            }
        }

        // Create callback subclass and attach it to the device service
        CoinDispenserCallbacks callbacks = this.new CoinDispenserCallbacks();
        service12.open(logicalDeviceName, callbacks);
    }

    public void release()
        throws JposException
    {
        try
        {
            service12.release();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    public void dispenseChange(int amount)
        throws JposException
    {
        try
        {
            service12.dispenseChange(amount);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened", e);
        }
    }

    //--------------------------------------------------------------------------
    // Event Listener Methods
    //--------------------------------------------------------------------------

    public void addDirectIOListener(DirectIOListener l)
    {
        synchronized(directIOListeners)
        {
            directIOListeners.addElement(l);
        }
    }

    public void removeDirectIOListener(DirectIOListener l)
    {
        synchronized(directIOListeners)
        {
            directIOListeners.removeElement(l);
        }
    }

    public void addStatusUpdateListener(StatusUpdateListener l)
    {
        synchronized(statusUpdateListeners)
        {
            statusUpdateListeners.addElement(l);
        }
    }

    public void removeStatusUpdateListener(StatusUpdateListener l)
    {
        synchronized(statusUpdateListeners)
        {
            statusUpdateListeners.removeElement(l);
        }
    }

    //--------------------------------------------------------------------------
    // EventCallbacks inner class
    //--------------------------------------------------------------------------
    protected class CoinDispenserCallbacks implements EventCallbacks
    {
        public BaseControl getEventSource()
        {
            return (BaseControl)CoinDispenser.this;
        }

        public void fireDataEvent(DataEvent e)
        {
        }

        public void fireDirectIOEvent(DirectIOEvent e)
        {
            synchronized(CoinDispenser.this.directIOListeners)
            {
                // deliver the event to all registered listeners
                for(int x = 0; x < directIOListeners.size(); x++)
                {
                    ((DirectIOListener)directIOListeners.elementAt(x)).directIOOccurred(e);
                }
            }
        }

        public void fireErrorEvent(ErrorEvent e)
        {
        }

        public void fireOutputCompleteEvent(OutputCompleteEvent e)
        {
        }

        public void fireStatusUpdateEvent(StatusUpdateEvent e)
        {
            synchronized(CoinDispenser.this.statusUpdateListeners)
            {
                // deliver the event to all registered listeners
                for(int x = 0; x < statusUpdateListeners.size(); x++)
                {
                    ((StatusUpdateListener)statusUpdateListeners.elementAt(x)).statusUpdateOccurred(e);
                }
            }
        }
    }
}
