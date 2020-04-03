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

/**
 * JavaPOS Device Service class, intended to be used for testing purposes in ElectronicJournalTest.
 *
 */
public final class ElectronicJournalTestServiceAlwaysThrowingNPE implements jpos.services.ElectronicJournalService114, JposServiceInstance {
    
    private JposEntry configuration;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1015000;
        else
            return 1014000;
    }
    
    @Override
    public int getState() throws JposException {
        return JposConst.JPOS_S_CLOSED;
    }

    @Override
    public void open(String logicalName, EventCallbacks cb) throws JposException {
        configuration = JposServiceLoader.getManager().getEntryRegistry().getJposEntry(logicalName);
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
    public boolean getCapAddMarker() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapErasableMedium() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapInitializeMedium() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapMediumIsAvailable() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPrintContent() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapPrintContentFile() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRetrieveCurrentMarker() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRetrieveMarker() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRetrieveMarkerByDateTime() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapRetrieveMarkersDateTime() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapStation() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStorageEnabled() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSuspendPrintContent() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapSuspendQueryContent() throws JposException {
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
    public boolean getCapWaterMark() throws JposException {
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
    public boolean getFlagWhenIdle() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setFlagWhenIdle(boolean flagWhenIdle) throws JposException {
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
    public long getMediumFreeSpace() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getMediumID() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getMediumIsAvailable() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public long getMediumSize() throws JposException {
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
    public int getStation() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setStation(int station) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getStorageEnabled() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setStorageEnabled(boolean enabled) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getSuspended() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getWaterMark() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setWaterMark(boolean waterMark) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void addMarker(String marker) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void cancelPrintContent() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void cancelQueryContent() throws JposException 
    {
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
    public void eraseMedium() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void initializeMedium(String mediumID) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printContent(String fromMarker, String toMarker) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void printContentFile(String fileName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void queryContent(String fileName, String fromMarker, String toMarker) throws JposException 
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
    public void resumePrintContent() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void resumeQueryContent() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveCurrentMarker(int markerType, String[] marker) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveMarker(int markerType, int sessionNumber, int documentNumber, String[] marker) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveMarkerByDateTime(int markerType, String dateTime, String markerNumber, String[] marker) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveMarkersDateTime(String marker, String[] dateTime) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void suspendPrintContent() throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void suspendQueryContent() throws JposException 
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
}
