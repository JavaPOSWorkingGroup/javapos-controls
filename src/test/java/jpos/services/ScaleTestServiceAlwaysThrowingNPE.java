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
import jpos.loader.JposServiceInstance;
import jpos.services.EventCallbacks;

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in ScaleTest.
 *
 */
public final class ScaleTestServiceAlwaysThrowingNPE implements jpos.services.ScaleService114, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1_014_000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_CLOSED;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        // intentionally left empty
    }

    @Override
    public void deleteInstance() throws JposException {
        // intentionally left empty
    }

    
    @Override
    public boolean getAsyncMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAsyncMode(boolean asyncMode) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getAutoDisable() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAutoDisable(boolean autoDisable) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapDisplay() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapDisplayText() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapFreezeValue() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPriceCalculating() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapReadLiveWeightWithTare() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSetPriceCalculationMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSetUnitPriceWithWeightUnit() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSpecialTare() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatusUpdate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTarePriority() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTareWeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateFirmware() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapUpdateStatistics() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapZeroScale() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCheckHealthText() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getClaimed() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDataCount() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDataEventEnabled() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDataEventEnabled(boolean dataEventEnabled) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDeviceEnabled() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDeviceEnabled(boolean deviceEnabled) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getDeviceServiceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMaxDisplayTextChars() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMaximumWeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getMinimumWeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhysicalDeviceDescription() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getPhysicalDeviceName() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerNotify() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setPowerNotify(int powerNotify) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getPowerState() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public long getSalesPrice() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getScaleLiveWeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getStatusNotify() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setStatusNotify(int statusNotify) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTareWeight() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setTareWeight(int tareWeight) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public long getUnitPrice() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setUnitPrice(long unitPrice) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getWeightUnit() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getZeroValid() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setZeroValid(boolean zeroValid) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void checkHealth(int level) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void claim(int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearInput() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void close() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void compareFirmwareVersion(String firmwareFileName, int[] result) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void displayText(String data) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void doPriceCalculating(int[] weightValue, int[] tare, long[] unitPrice, long[] unitPriceX, int[] weightUnitX, int[] weightNumeratorX, int[] weightDenominatorX, long[] price, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void freezeValue(int item, boolean freeze) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void readLiveWeightWithTare(int[] weightData, int[] tare, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void readWeight(int[] weightData, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void release() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void resetStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setPriceCalculationMode(int mode) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setSpecialTare(int mode, int data) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setTarePrioity(int priority) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setUnitPriceWithWeightUnit(long unitPrice, int weightUnit, int weightNumerator, int weightDenominator) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void zeroScale() throws JposException 
    {
        throw new NullPointerException();
    }
}
