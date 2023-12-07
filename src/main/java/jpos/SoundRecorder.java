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
// SoundRecorder.java - A JavaPOS 1.16.0 device control
//
//------------------------------------------------------------------------------

package jpos;

import jpos.events.*;
import jpos.services.*;

import java.util.ArrayList;
import java.util.List;

public class SoundRecorder
    extends BaseJposControl
    implements SoundRecorderControl116, JposConst
{
    //--------------------------------------------------------------------------
    // Variables
    //--------------------------------------------------------------------------

    protected SoundRecorderService116 service116;
    protected List<DataListener> dataListeners;
    protected List<DirectIOListener> directIOListeners;
    protected List<ErrorListener> errorListeners;
    protected List<StatusUpdateListener> statusUpdateListeners;
    

    //--------------------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------------------

    public SoundRecorder()
    {
        // Initialize base class instance data
        deviceControlDescription = "JavaPOS SoundRecorder Device Control";
        deviceControlVersion = deviceVersion116;
        
        // Initialize instance data. Initializations are commented out for
        // efficiency if the Java default is correct.
        //service116 = null;
        dataListeners = new ArrayList<DataListener>();
        directIOListeners = new ArrayList<DirectIOListener>();
        errorListeners = new ArrayList<ErrorListener>();
        statusUpdateListeners = new ArrayList<StatusUpdateListener>();
    }
    
    //--------------------------------------------------------------------------
    // Capabilities
    //--------------------------------------------------------------------------
    
    public String getCapAssociatedHardTotalsDevice()
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
            return service116.getCapAssociatedHardTotalsDevice();
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
    
    public boolean getCapChannel()
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
            return service116.getCapChannel();
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
    
    public boolean getCapCompareFirmwareVersion()
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
            return service116.getCapCompareFirmwareVersion();
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
            return service116.getCapPowerReporting();
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
    
    public boolean getCapRecordingLevel()
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
            return service116.getCapRecordingLevel();
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
    
    public boolean getCapSamplingRate()
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
            return service116.getCapSamplingRate();
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
    
    public boolean getCapSoundType()
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
            return service116.getCapSoundType();
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
        
        
        // Perform the operation
        try
        {
            return service116.getCapStatisticsReporting();
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
    
    public int getCapStorage()
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
            return service116.getCapStorage();
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
        
        
        // Perform the operation
        try
        {
            return service116.getCapUpdateFirmware();
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
        
        
        // Perform the operation
        try
        {
            return service116.getCapUpdateStatistics();
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
    
    public boolean getAutoDisable()
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
            return service116.getAutoDisable();
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
    public void setAutoDisable(boolean newValue)
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
            service116.setAutoDisable(newValue);
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
    
    public String getChannel()
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
            return service116.getChannel();
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
    public void setChannel(String newValue)
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
            service116.setChannel(newValue);
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
    
    public String getChannelList()
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
            return service116.getChannelList();
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
            return service116.getDataCount();
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
            return service116.getDataEventEnabled();
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
    public void setDataEventEnabled(boolean newValue)
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
            service116.setDataEventEnabled(newValue);
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
            return service116.getPowerNotify();
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
    public void setPowerNotify(int newValue)
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
            service116.setPowerNotify(newValue);
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
            return service116.getPowerState();
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
    
    public int getRecordingLevel()
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
            return service116.getRecordingLevel();
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
    public void setRecordingLevel(int newValue)
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
            service116.setRecordingLevel(newValue);
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
    
    public int getRemainingRecordingTimeInSec()
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
            return service116.getRemainingRecordingTimeInSec();
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
    
    public String getSamplingRate()
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
            return service116.getSamplingRate();
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
    public void setSamplingRate(String newValue)
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
            service116.setSamplingRate(newValue);
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
    
    public String getSamplingRateList()
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
            return service116.getSamplingRateList();
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
    
    public byte[] getSoundData()
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
            return service116.getSoundData();
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
    
    public String getSoundType()
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
            return service116.getSoundType();
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
    public void setSoundType(String newValue)
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
            service116.setSoundType(newValue);
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
    
    public String getSoundTypeList()
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
            return service116.getSoundTypeList();
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
    
    public int getStorage()
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
            return service116.getStorage();
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
    public void setStorage(int newValue)
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
            service116.setStorage(newValue);
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
            service116.clearInput();
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
    
    public void clearInputProperties()
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
            service116.clearInputProperties();
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
        
        
        // Perform the operation
        try
        {
            service116.compareFirmwareVersion(firmwareFileName, result);
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
        
        
        // Perform the operation
        try
        {
            service116.resetStatistics(statisticsBuffer);
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
        
        
        // Perform the operation
        try
        {
            service116.retrieveStatistics(statisticsBuffer);
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
    
    public void startRecording(String fileName, boolean overwrite, int recordingTime)
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
            service116.startRecording(fileName, overwrite, recordingTime);
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
    
    public void stopRecording()
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
            service116.stopRecording();
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
        
        
        // Perform the operation
        try
        {
            service116.updateFirmware(firmwareFileName);
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
        
        
        // Perform the operation
        try
        {
            service116.updateStatistics(statisticsBuffer);
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
      return new SoundRecorderCallbacks();
    }
    
    // Store the reference to the Device Service
    protected void setDeviceService(BaseService service, int nServiceVersion)
    throws JposException
    {
        // Special case: service == null to free references
        if(service == null)
        {
            service116 = null;
        }
        else
        {
            // Make sure that the service actually conforms to the interfaces it
            // claims to.
            if(serviceVersion >= deviceVersion116)
            {
                try
                {
                    service116 = (SoundRecorderService116)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement SoundRecorderService116 interface",
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
    
    protected class SoundRecorderCallbacks
        implements EventCallbacks
    {
        public BaseControl getEventSource()
        {
            return (BaseControl)SoundRecorder.this;
        }
        
        public void fireDataEvent(DataEvent e)
        {
            synchronized(SoundRecorder.this.dataListeners)
            {
                // deliver the event to all registered listeners
                for (DataListener dataListener : SoundRecorder.this.dataListeners) {
                	dataListener.dataOccurred(e);
                }
            }
        }
        
        public void fireDirectIOEvent(DirectIOEvent e)
        {
            synchronized(SoundRecorder.this.directIOListeners)
            {
                // deliver the event to all registered listeners
                for (DirectIOListener directIOListener : SoundRecorder.this.directIOListeners) {
                	directIOListener.directIOOccurred(e);
                }
            }
        }
        
        public void fireErrorEvent(ErrorEvent e)
        {
            synchronized(SoundRecorder.this.errorListeners)
            {
                // deliver the event to all registered listeners
                for (ErrorListener errorListener : SoundRecorder.this.errorListeners) {
                	errorListener.errorOccurred(e);
                }
            }
        }
        
        public void fireStatusUpdateEvent(StatusUpdateEvent e)
        {
            synchronized(SoundRecorder.this.statusUpdateListeners)
            {
                // deliver the event to all registered listeners
                for (StatusUpdateListener statusUpdateListener : SoundRecorder.this.statusUpdateListeners) {
                	statusUpdateListener.statusUpdateOccurred(e);
                }
            }
        }
        
        public void fireOutputCompleteEvent(OutputCompleteEvent e)
        {
        }
        
    }
}
