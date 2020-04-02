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
 * JavaPOS Device Service class, intended to be used for testing purposes in ElectronicJournalTest.
 *
 */
public final class ElectronicJournalTestService111 implements jpos.services.ElectronicJournalService111, JposServiceInstance {
    
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
    public boolean getAutoDisable() throws JposException {
        return true;
    }
    
    @Override
    public void setAutoDisable(boolean autoDisable) throws JposException {
    }
    
    @Override
    public boolean getCapAddMarker() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapErasableMedium() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapInitializeMedium() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapMediumIsAvailable() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapPrintContent() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapPrintContentFile() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRetrieveCurrentMarker() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRetrieveMarker() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRetrieveMarkerByDateTime() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapRetrieveMarkersDateTime() throws JposException {
        return true;
    }
    
    @Override
    public int getCapStation() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapStorageEnabled() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSuspendPrintContent() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapSuspendQueryContent() throws JposException {
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
    public boolean getCapWaterMark() throws JposException {
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
    public boolean getFlagWhenIdle() throws JposException {
        return true;
    }
    
    @Override
    public void setFlagWhenIdle(boolean flagWhenIdle) throws JposException {
    }
    
    @Override
    public boolean getFreezeEvents() throws JposException {
        return true;
    }
    
    @Override
    public void setFreezeEvents(boolean freezeEvents) throws JposException {
    }
    
    @Override
    public long getMediumFreeSpace() throws JposException {
        return 0;
    }
    
    @Override
    public String getMediumID() throws JposException {
        return "";
    }
    
    @Override
    public boolean getMediumIsAvailable() throws JposException {
        return true;
    }
    
    @Override
    public long getMediumSize() throws JposException {
        return 0;
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
    public int getStation() throws JposException {
        return 0;
    }
    
    @Override
    public void setStation(int station) throws JposException {
    }
    
    @Override
    public boolean getStorageEnabled() throws JposException {
        return true;
    }
    
    @Override
    public void setStorageEnabled(boolean enabled) throws JposException {
    }
    
    @Override
    public boolean getSuspended() throws JposException {
        return true;
    }
    
    @Override
    public boolean getWaterMark() throws JposException {
        return true;
    }
    
    @Override
    public void setWaterMark(boolean waterMark) throws JposException {
    }
    
    @Override
    public void addMarker(String marker) throws JposException 
    {
    }
    
    @Override
    public void cancelPrintContent() throws JposException 
    {
    }
    
    @Override
    public void cancelQueryContent() throws JposException 
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
    public void clearInput() throws JposException 
    {
    }
    
    @Override
    public void clearOutput() throws JposException 
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
    public void directIO(int command, int[] data, Object object) throws JposException 
    {
    }
    
    @Override
    public void eraseMedium() throws JposException 
    {
    }
    
    @Override
    public void initializeMedium(String mediumID) throws JposException 
    {
    }
    
    @Override
    public void printContent(String fromMarker, String toMarker) throws JposException 
    {
    }
    
    @Override
    public void printContentFile(String fileName) throws JposException 
    {
    }
    
    @Override
    public void queryContent(String fileName, String fromMarker, String toMarker) throws JposException 
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
    public void resumePrintContent() throws JposException 
    {
    }
    
    @Override
    public void resumeQueryContent() throws JposException 
    {
    }
    
    @Override
    public void retrieveCurrentMarker(int markerType, String[] marker) throws JposException 
    {
    }
    
    @Override
    public void retrieveMarker(int markerType, int sessionNumber, int documentNumber, String[] marker) throws JposException 
    {
    }
    
    @Override
    public void retrieveMarkerByDateTime(int markerType, String dateTime, String markerNumber, String[] marker) throws JposException 
    {
    }
    
    @Override
    public void retrieveMarkersDateTime(String marker, String[] dateTime) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void suspendPrintContent() throws JposException 
    {
    }
    
    @Override
    public void suspendQueryContent() throws JposException 
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
