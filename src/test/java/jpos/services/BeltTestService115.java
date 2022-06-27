////////////////////////////////////////////////////////////////////////////////
//
// The JavaPOS library source code is under the CPL license, which 
// is an OSS Apache-like license. The complete license is located at:
//    http://www.ibm.com/developerworks/library/os-cpl.html
//
//------------------------------------------------------------------------------
// This software is provided "AS IS".  The JavaPOS working group (including
// each of the Corporate members, contributors and individuals)  MAKES NO
// REPRESENTATIONS OR WARRANTIES ABOUT THE SUITABILITY OF THE SOFTWARE,
// EITHER EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE IMPLIED
// WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
// NON-INFRINGEMENT. The JavaPOS working group shall not be liable for
// any damages suffered as a result of using, modifying or distributing this
// software or its derivatives.Permission to use, copy, modify, and distribute
// the software and its documentation for any purpose is hereby granted.
////////////////////////////////////////////////////////////////////////////////

package jpos.services;

import jpos.JposConst;
import jpos.JposException;
import jpos.config.JposEntry;
import jpos.loader.JposServiceInstance;
import jpos.loader.JposServiceLoader;
import jpos.events.*;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in BeltTest.
 *
 */
public final class BeltTestService115 implements jpos.services.BeltService115, JposServiceInstance {
    
    private JposEntry configuration;
    private EventCallbacks callbacks;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1016000;
        else if (configuration.hasPropertyWithName("throwingNPEOnGetDSVersion"))
            throw new NullPointerException();
        else
            return 1015000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_IDLE;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        configuration = JposServiceLoader.getManager().getEntryRegistry().getJposEntry(logicalName);
        callbacks = cb;
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
        switch (command) {
        case jpos.ControlsTestHelper.SEND_DATA_EVENT:
            this.callbacks.fireDataEvent(new DataEvent(this.callbacks.getEventSource(), 0));
        case jpos.ControlsTestHelper.SEND_DIRECTIO_EVENT:
            this.callbacks.fireDirectIOEvent(new DirectIOEvent(this.callbacks.getEventSource(), 1, 2, null));
        case jpos.ControlsTestHelper.SEND_ERROR_EVENT:
            this.callbacks.fireErrorEvent(new ErrorEvent(this.callbacks.getEventSource(), 1, 2, 3, 4));
            break;
        case jpos.ControlsTestHelper.SEND_OUTPUTCOMPLETE_EVENT: 
            this.callbacks.fireOutputCompleteEvent(new OutputCompleteEvent(this.callbacks.getEventSource(), 1));
            break;
        case jpos.ControlsTestHelper.SEND_STATUSUPDATE_EVENT:
            this.callbacks.fireStatusUpdateEvent(new StatusUpdateEvent(this.callbacks.getEventSource(), 1));
            break;
        default:
            break;
        }
    }
    
    
    @Override
    public boolean getAutoStopBackward() throws JposException {
        return true;
    }
    
    @Override
    public void setAutoStopBackward(boolean autoStop) throws JposException {
    }
    
    @Override
    public int getAutoStopBackwardDelayTime() throws JposException {
        return 0;
    }
    
    @Override
    public void setAutoStopBackwardDelayTime(int delayTime) throws JposException {
    }
    
    @Override
    public int getAutoStopBackwardItemCount() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getAutoStopForward() throws JposException {
        return true;
    }
    
    @Override
    public void setAutoStopForward(boolean autoStop) throws JposException {
    }
    
    @Override
    public int getAutoStopForwardDelayTime() throws JposException {
        return 0;
    }
    
    @Override
    public void setAutoStopForwardDelayTime(int delayTime) throws JposException {
    }
    
    @Override
    public int getAutoStopForwardItemCount() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapAutoStopBackward() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAutoStopBackwardItemCount() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAutoStopForward() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapAutoStopForwardItemCount() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapLightBarrierBackward() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapLightBarrierForward() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapMoveBackward() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapRealTimeData() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSecurityFlapBackward() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSecurityFlapForward() throws JposException {
        return true;
    }
    
    @Override
    public int getCapSpeedStepsBackward() throws JposException {
        return 0;
    }
    
    @Override
    public int getCapSpeedStepsForward() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        return true;
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        return "";
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        return true;
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        return "";
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public boolean getLightBarrierBackwardInterrupted() throws JposException {
        return true;
    }
    
    @Override
    public boolean getLightBarrierForwardInterrupted() throws JposException {
        return true;
    }
    
    @Override
    public int getMotionStatus() throws JposException {
        return 0;
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        return "";
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        return "";
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        return 0;
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
    }
    
    @Override
    public int getPowerState() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getSecurityFlapBackwardOpened() throws JposException {
        return true;
    }
    
    @Override
    public boolean getSecurityFlapForwardOpened() throws JposException {
        return true;
    }
    
    @Override
    public void adjustItemCount(int direction, int count) throws JposException 
    {
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
    }
    
    @Override
    public void close() throws JposException 
    {
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
    }
    
    @Override
    public void moveBackward(int speed) throws JposException 
    {
    }
    
    @Override
    public void moveForward(int speed) throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
    {
    }
    
    @Override
    public void resetBelt() throws JposException 
    {
    }
    
    @Override
    public void resetItemCount(int direction) throws JposException 
    {
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void stopBelt() throws JposException 
    {
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
    }
}
