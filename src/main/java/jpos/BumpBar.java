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
// BumpBar.java - A JavaPOS 1.16.0 device control
//
//------------------------------------------------------------------------------

package jpos;

import jpos.events.*;
import jpos.services.*;

import java.util.ArrayList;
import java.util.List;

public class BumpBar
    extends BaseJposControl
    implements BumpBarControl116, JposConst
{
    //--------------------------------------------------------------------------
    // Variables
    //--------------------------------------------------------------------------

    protected BumpBarService13 service13;
    protected BumpBarService14 service14;
    protected BumpBarService15 service15;
    protected BumpBarService16 service16;
    protected BumpBarService17 service17;
    protected BumpBarService18 service18;
    protected BumpBarService19 service19;
    protected BumpBarService110 service110;
    protected BumpBarService111 service111;
    protected BumpBarService112 service112;
    protected BumpBarService113 service113;
    protected BumpBarService114 service114;
    protected BumpBarService115 service115;
    protected BumpBarService116 service116;
    protected List<DataListener> dataListeners;
    protected List<DirectIOListener> directIOListeners;
    protected List<ErrorListener> errorListeners;
    protected List<OutputCompleteListener> outputCompleteListeners;
    protected List<StatusUpdateListener> statusUpdateListeners;
    

    //--------------------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------------------

    public BumpBar()
    {
        // Initialize base class instance data
        deviceControlDescription = "JavaPOS BumpBar Device Control";
        deviceControlVersion = deviceVersion116;
        
        // Initialize instance data. Initializations are commented out for
        // efficiency if the Java default is correct.
        //service13 = null;
        //service14 = null;
        //service15 = null;
        //service16 = null;
        //service17 = null;
        //service18 = null;
        //service19 = null;
        //service110 = null;
        //service111 = null;
        //service112 = null;
        //service113 = null;
        //service114 = null;
        //service115 = null;
        //service116 = null;
        dataListeners = new ArrayList<DataListener>();
        directIOListeners = new ArrayList<DirectIOListener>();
        errorListeners = new ArrayList<ErrorListener>();
        outputCompleteListeners = new ArrayList<OutputCompleteListener>();
        statusUpdateListeners = new ArrayList<StatusUpdateListener>();
    }
    
    //--------------------------------------------------------------------------
    // Capabilities
    //--------------------------------------------------------------------------
    
    public boolean getCapCompareFirmwareVersion()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        // Make sure service supports at least version 1.9.0
        if(serviceVersion < deviceVersion19)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.9.0 compliant.");
        }
        
        // Perform the operation
        try
        {
            return service19.getCapCompareFirmwareVersion();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getCapPowerReporting()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public boolean getCapStatisticsReporting()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        // Make sure service supports at least version 1.8.0
        if(serviceVersion < deviceVersion18)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.8.0 compliant.");
        }
        
        // Perform the operation
        try
        {
            return service18.getCapStatisticsReporting();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public boolean getCapTone()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public boolean getCapUpdateFirmware()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        // Make sure service supports at least version 1.9.0
        if(serviceVersion < deviceVersion19)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.9.0 compliant.");
        }
        
        // Perform the operation
        try
        {
            return service19.getCapUpdateFirmware();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public boolean getCapUpdateStatistics()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        // Make sure service supports at least version 1.8.0
        if(serviceVersion < deviceVersion18)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.8.0 compliant.");
        }
        
        // Perform the operation
        try
        {
            return service18.getCapUpdateStatistics();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    //--------------------------------------------------------------------------
    // Properties
    //--------------------------------------------------------------------------
    
    public boolean getAsyncMode()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    public void setAsyncMode(boolean asyncMode)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getAutoToneDuration()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    public void setAutoToneDuration(int autoToneDuration)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getAutoToneFrequency()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    public void setAutoToneFrequency(int autoToneFrequency)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getBumpBarDataCount()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
        try
        {
            return service13.getBumpBarDataCount();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getCurrentUnitID()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    public void setCurrentUnitID(int currentUnitID)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getDataCount()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public boolean getDataEventEnabled()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    public void setDataEventEnabled(boolean dataEventEnabled)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public String getErrorString()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getErrorUnits()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public String getEventString()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getEventUnitID()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getEventUnits()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getKeys()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
        try
        {
            return service13.getKeys();
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getOutputID()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getPowerNotify()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    public void setPowerNotify(int powerNotify)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getPowerState()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getTimeout()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    public void setTimeout(int timeout)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    public int getUnitsOnline()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE,
                                    "Unhandled exception from Device Service", e);
        }
    }
    
    //--------------------------------------------------------------------------
    // Methods
    //--------------------------------------------------------------------------
    
    public void bumpBarSound(int units, int frequency, int duration, int numberOfCycles, int interSoundWait)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
        try
        {
            service13.bumpBarSound(units, frequency, duration, numberOfCycles, interSoundWait);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }    
    
    public void clearInput()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }    
    
    public void clearOutput()
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
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
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }    
    
    public void compareFirmwareVersion(String firmwareFileName, int[] result)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        // Make sure service supports at least version 1.9.0
        if(serviceVersion < deviceVersion19)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.9.0 compliant.");
        }
        
        // Perform the operation
        try
        {
            service19.compareFirmwareVersion(firmwareFileName, result);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }    
    
    public void resetStatistics(String statisticsBuffer)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        // Make sure service supports at least version 1.8.0
        if(serviceVersion < deviceVersion18)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.8.0 compliant.");
        }
        
        // Perform the operation
        try
        {
            service18.resetStatistics(statisticsBuffer);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }    
    
    public void retrieveStatistics(String[] statisticsBuffer)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        // Make sure service supports at least version 1.8.0
        if(serviceVersion < deviceVersion18)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.8.0 compliant.");
        }
        
        // Perform the operation
        try
        {
            service18.retrieveStatistics(statisticsBuffer);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }    
    
    public void setKeyTranslation(int units, int scanCode, int logicalKey)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        
        // Perform the operation
        try
        {
            service13.setKeyTranslation(units, scanCode, logicalKey);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }    
    
    public void updateFirmware(String firmwareFileName)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        // Make sure service supports at least version 1.9.0
        if(serviceVersion < deviceVersion19)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.9.0 compliant.");
        }
        
        // Perform the operation
        try
        {
            service19.updateFirmware(firmwareFileName);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }    
    
    public void updateStatistics(String statisticsBuffer)
        throws JposException
    {
        // Make sure control is opened
        if(!bOpen)
        {
            throw new JposException(JPOS_E_CLOSED, "Control not opened");
        }
        
        // Make sure service supports at least version 1.8.0
        if(serviceVersion < deviceVersion18)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.8.0 compliant.");
        }
        
        // Perform the operation
        try
        {
            service18.updateStatistics(statisticsBuffer);
        }
        catch(JposException je)
        {
            throw je;
        }
        catch(Exception e)
        {
            throw new JposException(JPOS_E_FAILURE, 
                                    "Unhandled exception from Device Service", e);
        }
    }    
    
    //--------------------------------------------------------------------------
    // Framework Methods
    //--------------------------------------------------------------------------
    
    // Create an EventCallbacks interface implementation object for this Control
    protected EventCallbacks createEventCallbacks()
    {
      return new BumpBarCallbacks();
    }
    
    // Store the reference to the Device Service
    protected void setDeviceService(BaseService service, int nServiceVersion)
    throws JposException
    {
        // Special case: service == null to free references
        if(service == null)
        {
            service13 = null;
            service14 = null;
            service15 = null;
            service16 = null;
            service17 = null;
            service18 = null;
            service19 = null;
            service110 = null;
            service111 = null;
            service112 = null;
            service113 = null;
            service114 = null;
            service115 = null;
            service116 = null;
        }
        else
        {
            // Make sure that the service actually conforms to the interfaces it
            // claims to.
            if(serviceVersion >= deviceVersion13)
            {
                try
                {
                    service13 = (BumpBarService13)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService13 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion14)
            {
                try
                {
                    service14 = (BumpBarService14)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService14 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion15)
            {
                try
                {
                    service15 = (BumpBarService15)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService15 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion16)
            {
                try
                {
                    service16 = (BumpBarService16)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService16 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion17)
            {
                try
                {
                    service17 = (BumpBarService17)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService17 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion18)
            {
                try
                {
                    service18 = (BumpBarService18)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService18 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion19)
            {
                try
                {
                    service19 = (BumpBarService19)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService19 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion110)
            {
                try
                {
                    service110 = (BumpBarService110)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService110 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion111)
            {
                try
                {
                    service111 = (BumpBarService111)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService111 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion112)
            {
                try
                {
                    service112 = (BumpBarService112)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService112 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion113)
            {
                try
                {
                    service113 = (BumpBarService113)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService113 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion114)
            {
                try
                {
                    service114 = (BumpBarService114)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService114 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion115)
            {
                try
                {
                    service115 = (BumpBarService115)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService115 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion116)
            {
                try
                {
                    service116 = (BumpBarService116)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement BumpBarService116 interface",
                                            e);
                }
            }
            
        }
    }
    
    //--------------------------------------------------------------------------
    // Event Listener Methods
    //--------------------------------------------------------------------------
    
    public void addDataListener(DataListener l)
    {
        synchronized(dataListeners)
        {
            dataListeners.add(l);
        }
    }
    
    public void removeDataListener(DataListener l)
    {
        synchronized(dataListeners)
        {
            dataListeners.remove(l);
        }
    }
    public void addDirectIOListener(DirectIOListener l)
    {
        synchronized(directIOListeners)
        {
            directIOListeners.add(l);
        }
    }
    
    public void removeDirectIOListener(DirectIOListener l)
    {
        synchronized(directIOListeners)
        {
            directIOListeners.remove(l);
        }
    }
    public void addErrorListener(ErrorListener l)
    {
        synchronized(errorListeners)
        {
            errorListeners.add(l);
        }
    }
    
    public void removeErrorListener(ErrorListener l)
    {
        synchronized(errorListeners)
        {
            errorListeners.remove(l);
        }
    }
    public void addOutputCompleteListener(OutputCompleteListener l)
    {
        synchronized(outputCompleteListeners)
        {
            outputCompleteListeners.add(l);
        }
    }
    
    public void removeOutputCompleteListener(OutputCompleteListener l)
    {
        synchronized(outputCompleteListeners)
        {
            outputCompleteListeners.remove(l);
        }
    }
    public void addStatusUpdateListener(StatusUpdateListener l)
    {
        synchronized(statusUpdateListeners)
        {
            statusUpdateListeners.add(l);
        }
    }
    
    public void removeStatusUpdateListener(StatusUpdateListener l)
    {
        synchronized(statusUpdateListeners)
        {
            statusUpdateListeners.remove(l);
        }
    }
    
    //--------------------------------------------------------------------------
    // EventCallbacks inner class
    //--------------------------------------------------------------------------
    
    protected class BumpBarCallbacks
        implements EventCallbacks
    {
        public BaseControl getEventSource()
        {
            return (BaseControl)BumpBar.this;
        }
        
        public void fireDataEvent(DataEvent e)
        {
            synchronized(BumpBar.this.dataListeners)
            {
                // deliver the event to all registered listeners
                for (DataListener dataListener : BumpBar.this.dataListeners) {
                	dataListener.dataOccurred(e);
                }
            }
        }
        
        public void fireDirectIOEvent(DirectIOEvent e)
        {
            synchronized(BumpBar.this.directIOListeners)
            {
                // deliver the event to all registered listeners
                for (DirectIOListener directIOListener : BumpBar.this.directIOListeners) {
                	directIOListener.directIOOccurred(e);
                }
            }
        }
        
        public void fireErrorEvent(ErrorEvent e)
        {
            synchronized(BumpBar.this.errorListeners)
            {
                // deliver the event to all registered listeners
                for (ErrorListener errorListener : BumpBar.this.errorListeners) {
                	errorListener.errorOccurred(e);
                }
            }
        }
        
        public void fireStatusUpdateEvent(StatusUpdateEvent e)
        {
            synchronized(BumpBar.this.statusUpdateListeners)
            {
                // deliver the event to all registered listeners
                for (StatusUpdateListener statusUpdateListener : BumpBar.this.statusUpdateListeners) {
                	statusUpdateListener.statusUpdateOccurred(e);
                }
            }
        }
        
        public void fireOutputCompleteEvent(OutputCompleteEvent e)
        {
            synchronized(BumpBar.this.outputCompleteListeners)
            {
                // deliver the event to all registered listeners
                for (OutputCompleteListener outputCompleteListener : BumpBar.this.outputCompleteListeners) {
                	outputCompleteListener.outputCompleteOccurred(e);
                }
            }
        }
        
    }
}
