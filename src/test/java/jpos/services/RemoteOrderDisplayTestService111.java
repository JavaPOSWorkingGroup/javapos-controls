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
public final class RemoteOrderDisplayTestService111 implements jpos.services.RemoteOrderDisplayService111, JposServiceInstance {
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        return 1_011_000;
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
        return true;
    }
    
    @Override
    public void setAsyncMode(boolean asyncMode) throws JposException {
    }
    
    @Override
    public int getAutoToneDuration() throws JposException {
        return 0;
    }
    
    @Override
    public void setAutoToneDuration(int autoToneDuration) throws JposException {
    }
    
    @Override
    public int getAutoToneFrequency() throws JposException {
        return 0;
    }
    
    @Override
    public void setAutoToneFrequency(int autoToneFrequency) throws JposException {
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapMapCharacterSet() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapSelectCharacterSet() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTone() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTouch() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTransaction() throws JposException {
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
    public int getCharacterSet() throws JposException {
        return 0;
    }
    
    @Override
    public String getCharacterSetList() throws JposException {
        return "";
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
    public int getClocks() throws JposException {
        return 0;
    }
    
    @Override
    public int getCurrentUnitID() throws JposException {
        return 0;
    }
    
    @Override
    public void setCurrentUnitID(int currentUnitID) throws JposException {
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
    public String getErrorString() throws JposException {
        return "";
    }
    
    @Override
    public int getErrorUnits() throws JposException {
        return 0;
    }
    
    @Override
    public String getEventString() throws JposException {
        return "";
    }
    
    @Override
    public int getEventType() throws JposException {
        return 0;
    }
    
    @Override
    public void setEventType(int eventType) throws JposException {
    }
    
    @Override
    public int getEventUnitID() throws JposException {
        return 0;
    }
    
    @Override
    public int getEventUnits() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public boolean getMapCharacterSet() throws JposException {
        return true;
    }
    
    @Override
    public void setMapCharacterSet(boolean mapCharacterSet) throws JposException {
    }
    
    @Override
    public int getOutputID() throws JposException {
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
    public int getSystemClocks() throws JposException {
        return 0;
    }
    
    @Override
    public int getSystemVideoSaveBuffers() throws JposException {
        return 0;
    }
    
    @Override
    public int getTimeout() throws JposException {
        return 0;
    }
    
    @Override
    public void setTimeout(int timeout) throws JposException {
    }
    
    @Override
    public int getUnitsOnline() throws JposException {
        return 0;
    }
    
    @Override
    public int getVideoDataCount() throws JposException {
        return 0;
    }
    
    @Override
    public int getVideoMode() throws JposException {
        return 0;
    }
    
    @Override
    public void setVideoMode(int videoMode) throws JposException {
    }
    
    @Override
    public String getVideoModesList() throws JposException {
        return "";
    }
    
    @Override
    public int getVideoSaveBuffers() throws JposException {
        return 0;
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
    public void clearOutput() throws JposException 
    {
    }
    
    @Override
    public void clearVideo(int units, int attribute) throws JposException 
    {
    }
    
    @Override
    public void clearVideoRegion(int units, int row, int column, int height, int width, int attribute) throws JposException 
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
    public void controlClock(int units, int function, int clockId, int hour, int min, int sec, int row, int column, int attribute, int mode) throws JposException 
    {
    }
    
    @Override
    public void controlCursor(int units, int function) throws JposException 
    {
    }
    
    @Override
    public void copyVideoRegion(int units, int row, int column, int height, int width, int targetRow, int targetColumn) throws JposException 
    {
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
    }
    
    @Override
    public void displayData(int units, int row, int column, int attribute, String data) throws JposException 
    {
    }
    
    @Override
    public void drawBox(int units, int row, int column, int height, int width, int attribute, int borderType) throws JposException 
    {
    }
    
    @Override
    public void freeVideoRegion(int units, int bufferId) throws JposException 
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
    public void resetVideo(int units) throws JposException 
    {
    }
    
    @Override
    public void restoreVideoRegion(int units, int targetRow, int targetColumn, int bufferId) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void saveVideoRegion(int units, int row, int column, int height, int width, int bufferId) throws JposException 
    {
    }
    
    @Override
    public void selectChararacterSet(int units, int characterSet) throws JposException 
    {
    }
    
    @Override
    public void setCursor(int units, int row, int column) throws JposException 
    {
    }
    
    @Override
    public void transactionDisplay(int units, int function) throws JposException 
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
    public void updateVideoRegionAttribute(int units, int function, int row, int column, int height, int width, int attribute) throws JposException 
    {
    }
    
    @Override
    public void videoSound(int units, int frequency, int duration, int numberOfCycles, int interSoundWait) throws JposException 
    {
    }
}
