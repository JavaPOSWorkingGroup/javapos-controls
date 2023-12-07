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
// GestureControl.java - A JavaPOS 1.16.0 device control
//
//------------------------------------------------------------------------------

package jpos;

import jpos.events.*;
import jpos.services.*;

import java.util.ArrayList;
import java.util.List;

public class GestureControl
    extends BaseJposControl
    implements GestureControlControl116, JposConst
{
    //--------------------------------------------------------------------------
    // Variables
    //--------------------------------------------------------------------------

    protected GestureControlService116 service116;
    protected List<DirectIOListener> directIOListeners;
    protected List<ErrorListener> errorListeners;
    protected List<OutputCompleteListener> outputCompleteListeners;
    protected List<StatusUpdateListener> statusUpdateListeners;
    

    //--------------------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------------------

    public GestureControl()
    {
        // Initialize base class instance data
        deviceControlDescription = "JavaPOS GestureControl Device Control";
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
    
    public boolean getCapMotion()
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
            return service116.getCapMotion();
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
    
    public boolean getCapMotionCreation()
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
            return service116.getCapMotionCreation();
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
    
    public boolean getCapPose()
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
            return service116.getCapPose();
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
    
    public boolean getCapPoseCreation()
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
            return service116.getCapPoseCreation();
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
    
    public String getAutoMode()
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
            return service116.getAutoMode();
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
    public void setAutoMode(String newValue)
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
            service116.setAutoMode(newValue);
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
    
    public String getAutoModeList()
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
            return service116.getAutoModeList();
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
    
    public String getJointList()
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
            return service116.getJointList();
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
    
    public String getMotionList()
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
            return service116.getMotionList();
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
    
    public boolean getPoseCreationMode()
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
            return service116.getPoseCreationMode();
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
    public void setPoseCreationMode(boolean newValue)
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
            service116.setPoseCreationMode(newValue);
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
    
    public String getPoseList()
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
            return service116.getPoseList();
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
    
    public void createMotion(String fileName, String poseList)
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
            service116.createMotion(fileName, poseList);
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
    
    public void createPose(String fileName, int time)
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
            service116.createPose(fileName, time);
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
    
    public void getPosition(String jointID, int[] position)
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
            service116.getPosition(jointID, position);
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
    
    public void setPosition(String positionList, int time, boolean absolute)
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
            service116.setPosition(positionList, time, absolute);
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
    
    public void setSpeed(String speedList, int time)
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
            service116.setSpeed(speedList, time);
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
    
    public void startMotion(String fileName)
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
            service116.startMotion(fileName);
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
    
    public void startPose(String fileName)
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
            service116.startPose(fileName);
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
    
    public void stopControl(int outputID)
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
            service116.stopControl(outputID);
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
      return new GestureControlCallbacks();
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
                    service116 = (GestureControlService116)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement GestureControlService116 interface",
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
    
    protected class GestureControlCallbacks
        implements EventCallbacks
    {
        public BaseControl getEventSource()
        {
            return (BaseControl)GestureControl.this;
        }
        
        public void fireDataEvent(DataEvent e)
        {
        }
        
        public void fireDirectIOEvent(DirectIOEvent e)
        {
            synchronized(GestureControl.this.directIOListeners)
            {
                // deliver the event to all registered listeners
                for (DirectIOListener directIOListener : GestureControl.this.directIOListeners) {
                	directIOListener.directIOOccurred(e);
                }
            }
        }
        
        public void fireErrorEvent(ErrorEvent e)
        {
            synchronized(GestureControl.this.errorListeners)
            {
                // deliver the event to all registered listeners
                for (ErrorListener errorListener : GestureControl.this.errorListeners) {
                	errorListener.errorOccurred(e);
                }
            }
        }
        
        public void fireStatusUpdateEvent(StatusUpdateEvent e)
        {
            synchronized(GestureControl.this.statusUpdateListeners)
            {
                // deliver the event to all registered listeners
                for (StatusUpdateListener statusUpdateListener : GestureControl.this.statusUpdateListeners) {
                	statusUpdateListener.statusUpdateOccurred(e);
                }
            }
        }
        
        public void fireOutputCompleteEvent(OutputCompleteEvent e)
        {
            synchronized(GestureControl.this.outputCompleteListeners)
            {
                // deliver the event to all registered listeners
                for (OutputCompleteListener outputCompleteListener : GestureControl.this.outputCompleteListeners) {
                	outputCompleteListener.outputCompleteOccurred(e);
                }
            }
        }
        
    }
}
