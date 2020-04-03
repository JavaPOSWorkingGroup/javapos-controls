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
 * JavaPOS Device Service class, intended to be used for testing purposes in MSRTest.
 *
 */
public final class MSRTestService18 implements jpos.services.MSRService18, JposServiceInstance {
    
    private JposEntry configuration;
    
    @Override
    public int getDeviceServiceVersion() throws JposException {
        if (configuration.hasPropertyWithName("returnVersionTooLarge"))
            return 1009000;
        else
            return 1008000;
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
    public String getAccountNumber() throws JposException {
        return "";
    }
    
    @Override
    public boolean getAutoDisable() throws JposException {
        return true;
    }
    
    @Override
    public void setAutoDisable(boolean autoDisable) throws JposException {
    }
    
    @Override
    public boolean getCapISO() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJISOne() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapJISTwo() throws JposException {
        return true;
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        return 0;
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTransmitSentinels() throws JposException {
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
    public boolean getDecodeData() throws JposException {
        return true;
    }
    
    @Override
    public void setDecodeData(boolean decodeData) throws JposException {
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
    public int getErrorReportingType() throws JposException {
        return 0;
    }
    
    @Override
    public void setErrorReportingType(int errorReportingType) throws JposException {
    }
    
    @Override
    public String getExpirationDate() throws JposException {
        return "";
    }
    
    @Override
    public String getFirstName() throws JposException {
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
    public String getMiddleInitial() throws JposException {
        return "";
    }
    
    @Override
    public boolean getParseDecodeData() throws JposException {
        return true;
    }
    
    @Override
    public void setParseDecodeData(boolean parseDecodeData) throws JposException {
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
    public String getServiceCode() throws JposException {
        return "";
    }
    
    @Override
    public String getSuffix() throws JposException {
        return "";
    }
    
    @Override
    public String getSurname() throws JposException {
        return "";
    }
    
    @Override
    public String getTitle() throws JposException {
        return "";
    }
    
    @Override
    public byte[] getTrack1Data() throws JposException {
        return new byte[0];
    }
    
    @Override
    public byte[] getTrack1DiscretionaryData() throws JposException {
        return new byte[0];
    }
    
    @Override
    public byte[] getTrack2Data() throws JposException {
        return new byte[0];
    }
    
    @Override
    public byte[] getTrack2DiscretionaryData() throws JposException {
        return new byte[0];
    }
    
    @Override
    public byte[] getTrack3Data() throws JposException {
        return new byte[0];
    }
    
    @Override
    public byte[] getTrack4Data() throws JposException {
        return new byte[0];
    }
    
    @Override
    public int getTracksToRead() throws JposException {
        return 0;
    }
    
    @Override
    public void setTracksToRead(int tracksToRead) throws JposException {
    }
    
    @Override
    public boolean getTransmitSentinels() throws JposException {
        return true;
    }
    
    @Override
    public void setTransmitSentinels(boolean transmitSentinels) throws JposException {
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
    public void directIO(int command, int[] data, Object object) throws JposException 
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
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
    }
}
