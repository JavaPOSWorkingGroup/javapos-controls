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
// SpeechSynthesis.java - A JavaPOS 1.16.0 device control
//
//------------------------------------------------------------------------------

package jpos;

import jpos.events.*;
import jpos.services.*;

import java.util.ArrayList;
import java.util.List;

public class SpeechSynthesis
    extends BaseJposControl
    implements SpeechSynthesisControl116, JposConst
{
    //--------------------------------------------------------------------------
    // Variables
    //--------------------------------------------------------------------------

    protected SpeechSynthesisService116 service116;
    protected List<DirectIOListener> directIOListeners;
    protected List<ErrorListener> errorListeners;
    protected List<OutputCompleteListener> outputCompleteListeners;
    protected List<StatusUpdateListener> statusUpdateListeners;
    

    //--------------------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------------------

    public SpeechSynthesis()
    {
        // Initialize base class instance data
        deviceControlDescription = "JavaPOS SpeechSynthesis Device Control";
        deviceControlVersion = deviceVersion116;
        
        // Initialize instance data. Initializations are commented out for
        // efficiency if the Java default is correct.
        //service116 = null;
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
    
    public boolean getCapLanguage()
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
            return service116.getCapLanguage();
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
    
    public boolean getCapPitch()
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
            return service116.getCapPitch();
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
    
    public boolean getCapSpeed()
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
            return service116.getCapSpeed();
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
    
    public boolean getCapVoice()
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
            return service116.getCapVoice();
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
    
    public boolean getCapVolume()
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
            return service116.getCapVolume();
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
    
    public String getLanguage()
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
            return service116.getLanguage();
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
    public void setLanguage(String newValue)
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
            service116.setLanguage(newValue);
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
    
    public String getLanguageList()
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
            return service116.getLanguageList();
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
            return service116.getOutputID();
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
    
    public String getOutputIDList()
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
            return service116.getOutputIDList();
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
    
    public int getPitch()
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
            return service116.getPitch();
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
    public void setPitch(int newValue)
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
            service116.setPitch(newValue);
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
    
    public int getSpeed()
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
            return service116.getSpeed();
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
    public void setSpeed(int newValue)
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
            service116.setSpeed(newValue);
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
    
    public String getVoice()
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
            return service116.getVoice();
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
    public void setVoice(String newValue)
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
            service116.setVoice(newValue);
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
    
    public String getVoiceList()
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
            return service116.getVoiceList();
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
    
    public int getVolume()
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
            return service116.getVolume();
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
    public void setVolume(int newValue)
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
            service116.setVolume(newValue);
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
            service116.clearOutput();
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
    
    public void speak(String text)
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
            service116.speak(text);
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
    
    public void speakImmediate(String text)
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
            service116.speakImmediate(text);
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
    
    public void stopCurrentSpeaking()
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
            service116.stopCurrentSpeaking();
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
    
    public void stopSpeaking(int outputID)
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
            service116.stopSpeaking(outputID);
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
      return new SpeechSynthesisCallbacks();
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
                    service116 = (SpeechSynthesisService116)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement SpeechSynthesisService116 interface",
                                            e);
                }
            }
            
        }
    }
    
    //--------------------------------------------------------------------------
    // Event Listener Methods
    //--------------------------------------------------------------------------
    
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
    
    protected class SpeechSynthesisCallbacks
        implements EventCallbacks
    {
        public BaseControl getEventSource()
        {
            return (BaseControl)SpeechSynthesis.this;
        }
        
        public void fireDataEvent(DataEvent e)
        {
        }
        
        public void fireDirectIOEvent(DirectIOEvent e)
        {
            synchronized(SpeechSynthesis.this.directIOListeners)
            {
                // deliver the event to all registered listeners
                for (DirectIOListener directIOListener : SpeechSynthesis.this.directIOListeners) {
                	directIOListener.directIOOccurred(e);
                }
            }
        }
        
        public void fireErrorEvent(ErrorEvent e)
        {
            synchronized(SpeechSynthesis.this.errorListeners)
            {
                // deliver the event to all registered listeners
                for (ErrorListener errorListener : SpeechSynthesis.this.errorListeners) {
                	errorListener.errorOccurred(e);
                }
            }
        }
        
        public void fireStatusUpdateEvent(StatusUpdateEvent e)
        {
            synchronized(SpeechSynthesis.this.statusUpdateListeners)
            {
                // deliver the event to all registered listeners
                for (StatusUpdateListener statusUpdateListener : SpeechSynthesis.this.statusUpdateListeners) {
                	statusUpdateListener.statusUpdateOccurred(e);
                }
            }
        }
        
        public void fireOutputCompleteEvent(OutputCompleteEvent e)
        {
            synchronized(SpeechSynthesis.this.outputCompleteListeners)
            {
                // deliver the event to all registered listeners
                for (OutputCompleteListener outputCompleteListener : SpeechSynthesis.this.outputCompleteListeners) {
                	outputCompleteListener.outputCompleteOccurred(e);
                }
            }
        }
        
    }
}
