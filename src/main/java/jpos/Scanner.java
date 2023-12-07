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
// Scanner.java - A JavaPOS 1.16.0 device control
//
//------------------------------------------------------------------------------

package jpos;

import jpos.events.*;
import jpos.services.*;

import java.util.ArrayList;
import java.util.List;

public class Scanner
    extends BaseJposControl
    implements ScannerControl116, JposConst
{
    //--------------------------------------------------------------------------
    // Variables
    //--------------------------------------------------------------------------

    protected ScannerService12 service12;
    protected ScannerService13 service13;
    protected ScannerService14 service14;
    protected ScannerService15 service15;
    protected ScannerService16 service16;
    protected ScannerService17 service17;
    protected ScannerService18 service18;
    protected ScannerService19 service19;
    protected ScannerService110 service110;
    protected ScannerService111 service111;
    protected ScannerService112 service112;
    protected ScannerService113 service113;
    protected ScannerService114 service114;
    protected ScannerService115 service115;
    protected ScannerService116 service116;
    protected List<DataListener> dataListeners;
    protected List<DirectIOListener> directIOListeners;
    protected List<ErrorListener> errorListeners;
    protected List<StatusUpdateListener> statusUpdateListeners;
    

    //--------------------------------------------------------------------------
    // Constructor
    //--------------------------------------------------------------------------

    public Scanner()
    {
        // Initialize base class instance data
        deviceControlDescription = "JavaPOS Scanner Device Control";
        deviceControlVersion = deviceVersion116;
        
        // Initialize instance data. Initializations are commented out for
        // efficiency if the Java default is correct.
        //service12 = null;
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
        
        // Make sure service supports at least version 1.3.0
        if(serviceVersion < deviceVersion13)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.3.0 compliant.");
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
            return service12.getAutoDisable();
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
    public void setAutoDisable(boolean autoDisable)
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
            service12.setAutoDisable(autoDisable);
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
            return service12.getDataCount();
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
            return service12.getDataEventEnabled();
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
            service12.setDataEventEnabled(dataEventEnabled);
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
    
    public boolean getDecodeData()
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
            return service12.getDecodeData();
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
    public void setDecodeData(boolean decodeData)
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
            service12.setDecodeData(decodeData);
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
        
        // Make sure service supports at least version 1.3.0
        if(serviceVersion < deviceVersion13)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.3.0 compliant.");
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
        
        
        // Make sure service supports at least version 1.3.0
        if(serviceVersion < deviceVersion13)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.3.0 compliant.");
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
        
        // Make sure service supports at least version 1.3.0
        if(serviceVersion < deviceVersion13)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.3.0 compliant.");
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
    
    public byte[] getScanData()
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
            return service12.getScanData();
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
    
    public byte[] getScanDataLabel()
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
            return service12.getScanDataLabel();
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
    
    public int getScanDataType()
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
            return service12.getScanDataType();
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
            service12.clearInput();
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
        
        // Make sure service supports at least version 1.10.0
        if(serviceVersion < deviceVersion110)
        {
            throw new JposException(JPOS_E_NOSERVICE,
                                    "Device Service is not 1.10.0 compliant.");
        }
        
        // Perform the operation
        try
        {
            service110.clearInputProperties();
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
      return new ScannerCallbacks();
    }
    
    // Store the reference to the Device Service
    protected void setDeviceService(BaseService service, int nServiceVersion)
    throws JposException
    {
        // Special case: service == null to free references
        if(service == null)
        {
            service12 = null;
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
            if(serviceVersion >= deviceVersion12)
            {
                try
                {
                    service12 = (ScannerService12)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService12 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion13)
            {
                try
                {
                    service13 = (ScannerService13)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService13 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion14)
            {
                try
                {
                    service14 = (ScannerService14)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService14 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion15)
            {
                try
                {
                    service15 = (ScannerService15)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService15 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion16)
            {
                try
                {
                    service16 = (ScannerService16)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService16 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion17)
            {
                try
                {
                    service17 = (ScannerService17)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService17 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion18)
            {
                try
                {
                    service18 = (ScannerService18)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService18 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion19)
            {
                try
                {
                    service19 = (ScannerService19)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService19 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion110)
            {
                try
                {
                    service110 = (ScannerService110)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService110 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion111)
            {
                try
                {
                    service111 = (ScannerService111)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService111 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion112)
            {
                try
                {
                    service112 = (ScannerService112)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService112 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion113)
            {
                try
                {
                    service113 = (ScannerService113)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService113 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion114)
            {
                try
                {
                    service114 = (ScannerService114)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService114 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion115)
            {
                try
                {
                    service115 = (ScannerService115)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService115 interface",
                                            e);
                }
            }
            if(serviceVersion >= deviceVersion116)
            {
                try
                {
                    service116 = (ScannerService116)service;
                }
                catch(Exception e)
                {
                    throw new JposException(JPOS_E_NOSERVICE,
                                            "Service does not fully implement ScannerService116 interface",
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
    
    protected class ScannerCallbacks
        implements EventCallbacks
    {
        public BaseControl getEventSource()
        {
            return (BaseControl)Scanner.this;
        }
        
        public void fireDataEvent(DataEvent e)
        {
            synchronized(Scanner.this.dataListeners)
            {
                // deliver the event to all registered listeners
                for (DataListener dataListener : Scanner.this.dataListeners) {
                	dataListener.dataOccurred(e);
                }
            }
        }
        
        public void fireDirectIOEvent(DirectIOEvent e)
        {
            synchronized(Scanner.this.directIOListeners)
            {
                // deliver the event to all registered listeners
                for (DirectIOListener directIOListener : Scanner.this.directIOListeners) {
                	directIOListener.directIOOccurred(e);
                }
            }
        }
        
        public void fireErrorEvent(ErrorEvent e)
        {
            synchronized(Scanner.this.errorListeners)
            {
                // deliver the event to all registered listeners
                for (ErrorListener errorListener : Scanner.this.errorListeners) {
                	errorListener.errorOccurred(e);
                }
            }
        }
        
        public void fireStatusUpdateEvent(StatusUpdateEvent e)
        {
            synchronized(Scanner.this.statusUpdateListeners)
            {
                // deliver the event to all registered listeners
                for (StatusUpdateListener statusUpdateListener : Scanner.this.statusUpdateListeners) {
                	statusUpdateListener.statusUpdateOccurred(e);
                }
            }
        }
        
        public void fireOutputCompleteEvent(OutputCompleteEvent e)
        {
        }
        
    }
}
