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
 * JavaPOS Device Service class, intended to be used for testing purposes in ScaleTest.
 *
 */
public final class ScaleTestService115 implements jpos.services.ScaleService115, JposServiceInstance {
    
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
    public boolean getAsyncMode() throws JposException {
        return true;
    }
    
    @Override
    public void setAsyncMode(boolean asyncMode) throws JposException {
    }
    
    @Override
    public boolean getAutoDisable() throws JposException {
        return true;
    }
    
    @Override
    public void setAutoDisable(boolean autoDisable) throws JposException {
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapDisplay() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapDisplayText() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapFreezeValue() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapPriceCalculating() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapReadLiveWeightWithTare() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSetPriceCalculationMode() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSetUnitPriceWithWeightUnit() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSpecialTare() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapStatusUpdate() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTarePriority() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTareWeight() throws JposException {
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
    public boolean getCapZeroScale() throws JposException {
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
    public int getDataCount() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getDataEventEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setDataEventEnabled(boolean dataEventEnabled) throws JposException {
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
    public int getMaxDisplayTextChars() throws JposException {
        return 0;
    }
    
    @Override
    public int getMaximumWeight() throws JposException {
        return 0;
    }
    
    @Override
    public int getMinimumWeight() throws JposException {
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
    public long getSalesPrice() throws JposException {
        return 0;
    }
    
    @Override
    public int getScaleLiveWeight() throws JposException {
        return 0;
    }
    
    @Override
    public int getStatusNotify() throws JposException {
        return 0;
    }
    
    @Override
    public void setStatusNotify(int statusNotify) throws JposException {
    }
    
    @Override
    public int getTareWeight() throws JposException {
        return 0;
    }
    
    @Override
    public void setTareWeight(int tareWeight) throws JposException {
    }
    
    @Override
    public long getUnitPrice() throws JposException {
        return 0;
    }
    
    @Override
    public void setUnitPrice(long unitPrice) throws JposException {
    }
    
    @Override
    public int getWeightUnit() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getZeroValid() throws JposException {
        return true;
    }
    
    @Override
    public void setZeroValid(boolean zeroValid) throws JposException {
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
    public void clearInput() throws JposException 
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
    public void displayText(String data) throws JposException 
    {
    }
    
    @Override
    public void doPriceCalculating(int[] weightValue, int[] tare, long[] unitPrice, long[] unitPriceX, int[] weightUnitX, int[] weightNumeratorX, int[] weightDenominatorX, long[] price, int timeout) throws JposException 
    {
    }
    
    @Override
    public void freezeValue(int item, boolean freeze) throws JposException 
    {
    }
    
    @Override
    public void readLiveWeightWithTare(int[] weightData, int[] tare, int timeout) throws JposException 
    {
    }
    
    @Override
    public void readWeight(int[] weightData, int timeout) throws JposException 
    {
    }
    
    @Override
    public void release() throws JposException 
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
    public void setPriceCalculationMode(int mode) throws JposException 
    {
    }
    
    @Override
    public void setSpecialTare(int mode, int data) throws JposException 
    {
    }
    
    @Override
    public void setTarePrioity(int priority) throws JposException 
    {
    }
    
    @Override
    public void setUnitPriceWithWeightUnit(long unitPrice, int weightUnit, int weightNumerator, int weightDenominator) throws JposException 
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
    
    @Override
    public void zeroScale() throws JposException 
    {
    }
}
