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
// RemoteOrderDisplay.java - A JavaPOS 1.6.0 device control
//
//------------------------------------------------------------------------------

package jpos;

import jpos.events.*;
import jpos.services.*;
import java.util.Vector;
import jpos.loader.*;

public class RemoteOrderDisplay
   implements RemoteOrderDisplayControl16, JposConst
{
    //--------------------------------------------------------------------------
    // Variables
    //--------------------------------------------------------------------------

    // Static Data
    protected static final String deviceControlDescription =
                                    "JavaPOS RemoteOrderDisplay Device Control";
    protected static final int    deviceControlVersion = 1006000; // 1.6.0
    protected static final int    deviceVersion13 = 1003000; // 1.3.0
    protected static final int    deviceVersion14 = 1004000; // 1.4.0
    protected static final int    deviceVersion15 = 1005000; // 1.5.0
    protected static final int    deviceVersion16 = 1006000; // 1.6.0

    // Instance Data
    protected JposServiceConnection serviceConnection;
    protected int serviceVersion;
    protected RemoteOrderDisplayService13 service13;
    protected RemoteOrderDisplayService14 service14;
    protected RemoteOrderDisplayService15 service15;
    protected RemoteOrderDisplayService16 service16;
    protected Vector dataListeners;
    protected Vector directIOListeners;
    protected Vector errorListeners;
    protected Vector outputCompleteListeners;
    protected Vector statusUpdateListeners;

    //--------------------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------------------

    public RemoteOrderDisplay()
    {
        serviceConnection = null;
        service13 = null;
        service14 = null;
        service15 = null;
        service16 = null;
        dataListeners = new Vector();
        directIOListeners = new Vector();
        errorListeners = new Vector();
        outputCompleteListeners = new Vector();
        statusUpdateListeners = new Vector();
    }

    //--------------------------------------------------------------------------
    // Capabilities
    //--------------------------------------------------------------------------

    public int getCapPowerReporting()
        throws JposException
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

    public boolean getCapSelectCharacterSet()
        throws JposException
    {
        try
        {
            return service13.getCapSelectCharacterSet();
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

    public boolean getCapTone()
        throws JposException
    {
        try
        {
            return service13.getCapTone();
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

    public boolean getCapTouch()
        throws JposException
    {
        try
        {
            return service13.getCapTouch();
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

    public boolean getCapTransaction()
        throws JposException
    {
        try
        {
            return service13.getCapTransaction();
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
    // Properties
    //--------------------------------------------------------------------------

    public String getCheckHealthText()
        throws JposException
    {
        try
        {
            return service13.getCheckHealthText();
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
            return service13.getClaimed();
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
            return service13.getDeviceEnabled();
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
            service13.setDeviceEnabled(deviceEnabled);
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
            return service13.getDeviceServiceDescription();
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
            return service13.getDeviceServiceVersion();
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
            return service13.getFreezeEvents();
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
            service13.setFreezeEvents(freezeEvents);
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
            return service13.getPhysicalDeviceDescription();
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
            return service13.getPhysicalDeviceName();
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
            return service13.getState();
        }
        catch(Exception e)
        {
            return JPOS_S_CLOSED;
        }
    }

    public boolean getAsyncMode()
        throws JposException
    {
        try
        {
            return service13.getAsyncMode();
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

    public void setAsyncMode(boolean asyncMode)
        throws JposException
    {
        try
        {
            service13.setAsyncMode(asyncMode);
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

    public int getAutoToneDuration()
        throws JposException
    {
        try
        {
            return service13.getAutoToneDuration();
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

    public void setAutoToneDuration(int autoToneDuration)
        throws JposException
    {
        try
        {
            service13.setAutoToneDuration(autoToneDuration);
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

    public int getAutoToneFrequency()
        throws JposException
    {
        try
        {
            return service13.getAutoToneFrequency();
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

    public void setAutoToneFrequency(int autoToneFrequency)
        throws JposException
    {
        try
        {
            service13.setAutoToneFrequency(autoToneFrequency);
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

    public int getCharacterSet()
        throws JposException
    {
        try
        {
            return service13.getCharacterSet();
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

    public String getCharacterSetList()
        throws JposException
    {
        try
        {
            return service13.getCharacterSetList();
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

    public int getClocks()
        throws JposException
    {
        try
        {
            return service13.getClocks();
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

    public int getCurrentUnitID()
        throws JposException
    {
        try
        {
            return service13.getCurrentUnitID();
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

    public void setCurrentUnitID(int currentUnitID)
        throws JposException
    {
        try
        {
            service13.setCurrentUnitID(currentUnitID);
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

    public int getDataCount()
        throws JposException
    {
        try
        {
            return service13.getDataCount();
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

    public boolean getDataEventEnabled()
        throws JposException
    {
        try
        {
            return service13.getDataEventEnabled();
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

    public void setDataEventEnabled(boolean dataEventEnabled)
        throws JposException
    {
        try
        {
            service13.setDataEventEnabled(dataEventEnabled);
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

    public String getErrorString()
        throws JposException
    {
        try
        {
            return service13.getErrorString();
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

    public int getErrorUnits()
        throws JposException
    {
        try
        {
            return service13.getErrorUnits();
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

    public String getEventString()
        throws JposException
    {
        try
        {
            return service13.getEventString();
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

    public int getEventType()
        throws JposException
    {
        try
        {
            return service13.getEventType();
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

    public void setEventType(int eventType)
        throws JposException
    {
        try
        {
            service13.setEventType(eventType);
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

    public int getEventUnitID()
        throws JposException
    {
        try
        {
            return service13.getEventUnitID();
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

    public int getEventUnits()
        throws JposException
    {
        try
        {
            return service13.getEventUnits();
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

    public int getOutputID()
        throws JposException
    {
        try
        {
            return service13.getOutputID();
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

    public void setPowerNotify(int powerNotify)
        throws JposException
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

    public int getPowerState()
        throws JposException
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

    public int getSystemClocks()
        throws JposException
    {
        try
        {
            return service13.getSystemClocks();
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

    public int getSystemVideoSaveBuffers()
        throws JposException
    {
        try
        {
            return service13.getSystemVideoSaveBuffers();
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

    public int getTimeout()
        throws JposException
    {
        try
        {
            return service13.getTimeout();
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

    public void setTimeout(int timeout)
        throws JposException
    {
        try
        {
            service13.setTimeout(timeout);
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

    public int getUnitsOnline()
        throws JposException
    {
        try
        {
            return service13.getUnitsOnline();
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

    public int getVideoDataCount()
        throws JposException
    {
        try
        {
            return service13.getVideoDataCount();
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

    public int getVideoMode()
        throws JposException
    {
        try
        {
            return service13.getVideoMode();
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

    public void setVideoMode(int videoMode)
        throws JposException
    {
        try
        {
            service13.setVideoMode(videoMode);
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

    public String getVideoModesList()
        throws JposException
    {
        try
        {
            return service13.getVideoModesList();
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

    public int getVideoSaveBuffers()
        throws JposException
    {
        try
        {
            return service13.getVideoSaveBuffers();
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
    // Methods
    //--------------------------------------------------------------------------

    public void claim(int timeout)
        throws JposException
    {
        try
        {
            service13.claim(timeout);
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
            service13.close();
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
            service13.checkHealth(level);
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
            service13.directIO(command, data, object);
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
        if(service13 != null)
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
            service13 = (RemoteOrderDisplayService13)serviceConnection.getService();
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
            serviceVersion = service13.getDeviceServiceVersion();
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Could not get service version information",
                                    e);
        }

        // Make sure that the service actually conforms to the interfaces it
        // claims to.
        if(serviceVersion >= deviceVersion14)
        {
            try
            {
                service14 = (RemoteOrderDisplayService14)service13;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement RemoteOrderDisplayDevice14 interface",
                                        e);
            }
        }

        if(serviceVersion >= deviceVersion15)
        {
            try
            {
                service15 = (RemoteOrderDisplayService15)service13;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement RemoteOrderDisplayDevice15 interface",
                                        e);
            }
        }

        if(serviceVersion >= deviceVersion16)
        {
            try
            {
                service16 = (RemoteOrderDisplayService16)service13;
            }
            catch(Exception e)
            {
                throw new JposException(JPOS_E_NOSERVICE,
                                        "Service does not fully implement RemoteOrderDisplayDevice16 interface",
                                        e);
            }
        }

        // Create callback subclass and attach it to the device service
        RemoteOrderDisplayCallbacks callbacks = this.new RemoteOrderDisplayCallbacks();
        service13.open(logicalDeviceName, callbacks);
    }

    public void release()
        throws JposException
    {
        try
        {
            service13.release();
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

    public void clearInput()
        throws JposException
    {
        try
        {
            service13.clearInput();
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

    public void clearOutput()
        throws JposException
    {
        try
        {
            service13.clearOutput();
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

    public void clearVideo(int units, int attribute)
        throws JposException
    {
        try
        {
            service13.clearVideo(units, attribute);
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

    public void clearVideoRegion(int units, int row, int column, int height, int width, int attribute)
        throws JposException
    {
        try
        {
            service13.clearVideoRegion(units, row, column, height, width, attribute);
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

    public void controlClock(int units, int function, int clockId, int hour, int min, int sec, int row, int column, int attribute, int mode)
        throws JposException
    {
        try
        {
            service13.controlClock(units, function, clockId, hour, min, sec, row, column, attribute, mode);
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

    public void controlCursor(int units, int function)
        throws JposException
    {
        try
        {
            service13.controlCursor(units, function);
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

    public void copyVideoRegion(int units, int row, int column, int height, int width, int targetRow, int targetColumn)
        throws JposException
    {
        try
        {
            service13.copyVideoRegion(units, row, column, height, width, targetRow, targetColumn);
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

    public void displayData(int units, int row, int column, int attribute, String data)
        throws JposException
    {
        try
        {
            service13.displayData(units, row, column, attribute, data);
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

    public void drawBox(int units, int row, int column, int height, int width, int attribute, int borderType)
        throws JposException
    {
        try
        {
            service13.drawBox(units, row, column, height, width, attribute, borderType);
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

    public void freeVideoRegion(int units, int bufferId)
        throws JposException
    {
        try
        {
            service13.freeVideoRegion(units, bufferId);
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

    public void resetVideo(int units)
        throws JposException
    {
        try
        {
            service13.resetVideo(units);
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

    public void restoreVideoRegion(int units, int targetRow, int targetColumn, int bufferId)
        throws JposException
    {
        try
        {
            service13.restoreVideoRegion(units, targetRow, targetColumn, bufferId);
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

    public void saveVideoRegion(int units, int row, int column, int height, int width, int bufferId)
        throws JposException
    {
        try
        {
            service13.saveVideoRegion(units, row, column, height, width, bufferId);
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

    public void selectChararacterSet(int units, int characterSet)
        throws JposException
    {
        try
        {
            service13.selectChararacterSet(units, characterSet);
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

    public void setCursor(int units, int row, int column)
        throws JposException
    {
        try
        {
            service13.setCursor(units, row, column);
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

    public void transactionDisplay(int units, int function)
        throws JposException
    {
        try
        {
            service13.transactionDisplay(units, function);
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

    public void updateVideoRegionAttribute(int units, int function, int row, int column, int height, int width, int attribute)
        throws JposException
    {
        try
        {
            service13.updateVideoRegionAttribute(units, function, row, column, height, width, attribute);
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

    public void videoSound(int units, int frequency, int duration, int numberOfCycles, int interSoundWait)
        throws JposException
    {
        try
        {
            service13.videoSound(units, frequency, duration, numberOfCycles, interSoundWait);
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

    public void addDataListener(DataListener l)
    {
        synchronized(dataListeners)
        {
            dataListeners.addElement(l);
        }
    }

    public void removeDataListener(DataListener l)
    {
        synchronized(dataListeners)
        {
            dataListeners.removeElement(l);
        }
    }

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

    public void addErrorListener(ErrorListener l)
    {
        synchronized(errorListeners)
        {
            errorListeners.addElement(l);
        }
    }

    public void removeErrorListener(ErrorListener l)
    {
        synchronized(errorListeners)
        {
            errorListeners.removeElement(l);
        }
    }

    public void addOutputCompleteListener(OutputCompleteListener l)
    {
        synchronized(outputCompleteListeners)
        {
            outputCompleteListeners.addElement(l);
        }
    }

    public void removeOutputCompleteListener(OutputCompleteListener l)
    {
        synchronized(outputCompleteListeners)
        {
            outputCompleteListeners.removeElement(l);
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
    protected class RemoteOrderDisplayCallbacks implements EventCallbacks
    {
        public BaseControl getEventSource()
        {
            return (BaseControl)RemoteOrderDisplay.this;
        }

        public void fireDataEvent(DataEvent e)
        {
            synchronized(RemoteOrderDisplay.this.dataListeners)
            {
                // deliver the event to all registered listeners
                for(int x = 0; x < dataListeners.size(); x++)
                {
                    ((DataListener)dataListeners.elementAt(x)).dataOccurred(e);
                }
            }
        }

        public void fireDirectIOEvent(DirectIOEvent e)
        {
            synchronized(RemoteOrderDisplay.this.directIOListeners)
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
            synchronized(RemoteOrderDisplay.this.errorListeners)
            {
                // deliver the event to all registered listeners
                for(int x = 0; x < errorListeners.size(); x++)
                {
                    ((ErrorListener)errorListeners.elementAt(x)).errorOccurred(e);
                }
            }
        }

        public void fireOutputCompleteEvent(OutputCompleteEvent e)
        {
            synchronized(RemoteOrderDisplay.this.outputCompleteListeners)
            {
                // deliver the event to all registered listeners
                for(int x = 0; x < outputCompleteListeners.size(); x++)
                {
                    ((OutputCompleteListener)outputCompleteListeners.elementAt(x)).outputCompleteOccurred(e);
                }
            }
        }

        public void fireStatusUpdateEvent(StatusUpdateEvent e)
        {
            synchronized(RemoteOrderDisplay.this.statusUpdateListeners)
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
