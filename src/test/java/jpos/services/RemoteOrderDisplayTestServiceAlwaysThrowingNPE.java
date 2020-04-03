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
 * JavaPOS Device Service class, intended to be used for testing purposes in RemoteOrderDisplayTest.
 *
 */
public final class RemoteOrderDisplayTestServiceAlwaysThrowingNPE implements jpos.services.RemoteOrderDisplayService114, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1014000;
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
    public int getAutoToneDuration() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAutoToneDuration(int autoToneDuration) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getAutoToneFrequency() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setAutoToneFrequency(int autoToneFrequency) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapMapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSelectCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTone() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTouch() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTransaction() throws JposException {
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
    public int getCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCharacterSetList() throws JposException {
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
    public int getClocks() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCurrentUnitID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setCurrentUnitID(int currentUnitID) throws JposException {
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
    public String getErrorString() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getErrorUnits() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getEventString() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getEventType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setEventType(int eventType) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getEventUnitID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getEventUnits() throws JposException {
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
    public boolean getMapCharacterSet() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setMapCharacterSet(boolean mapCharacterSet) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getOutputID() throws JposException {
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
    public int getSystemClocks() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getSystemVideoSaveBuffers() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTimeout() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setTimeout(int timeout) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getUnitsOnline() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getVideoDataCount() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getVideoMode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setVideoMode(int videoMode) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getVideoModesList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getVideoSaveBuffers() throws JposException {
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
    public void clearOutput() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearVideo(int units, int attribute) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void clearVideoRegion(int units, int row, int column, int height, int width, int attribute) throws JposException 
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
    public void controlClock(int units, int function, int clockId, int hour, int min, int sec, int row, int column, int attribute, int mode) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void controlCursor(int units, int function) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void copyVideoRegion(int units, int row, int column, int height, int width, int targetRow, int targetColumn) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void displayData(int units, int row, int column, int attribute, String data) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void drawBox(int units, int row, int column, int height, int width, int attribute, int borderType) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void freeVideoRegion(int units, int bufferId) throws JposException 
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
    public void resetVideo(int units) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void restoreVideoRegion(int units, int targetRow, int targetColumn, int bufferId) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void saveVideoRegion(int units, int row, int column, int height, int width, int bufferId) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void selectChararacterSet(int units, int characterSet) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void setCursor(int units, int row, int column) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void transactionDisplay(int units, int function) throws JposException 
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
    public void updateVideoRegionAttribute(int units, int function, int row, int column, int height, int width, int attribute) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void videoSound(int units, int frequency, int duration, int numberOfCycles, int interSoundWait) throws JposException 
    {
        throw new NullPointerException();
    }
}
