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
 * JavaPOS Device Service class, intended to be used for testing purposes in MSRTest.
 *
 */
public final class MSRTestService114 implements jpos.services.MSRService114, JposServiceInstance {
    
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
    public String getAccountNumber() throws JposException {
        return "";
    }
    
    @Override
    public byte[] getAdditionalSecurityInformation() throws JposException {
        return new byte[0];
    }
    
    @Override
    public boolean getAutoDisable() throws JposException {
        return true;
    }
    
    @Override
    public void setAutoDisable(boolean autoDisable) throws JposException {
    }
    
    @Override
    public String getCapCardAuthentication() throws JposException {
        return "";
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        return true;
    }
    
    @Override
    public int getCapDataEncryption() throws JposException {
        return 0;
    }
    
    @Override
    public int getCapDeviceAuthentication() throws JposException {
        return 0;
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
    public boolean getCapTrackDataMasking() throws JposException {
        return true;
    }
    
    @Override
    public boolean getCapTransmitSentinels() throws JposException {
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
    public int getCapWritableTracks() throws JposException {
        return 0;
    }
    
    @Override
    public byte[] getCardAuthenticationData() throws JposException {
        return new byte[0];
    }
    
    @Override
    public int getCardAuthenticationDataLength() throws JposException {
        return 0;
    }
    
    @Override
    public String getCardPropertyList() throws JposException {
        return "";
    }
    
    @Override
    public String getCardType() throws JposException {
        return "";
    }
    
    @Override
    public String getCardTypeList() throws JposException {
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
    public int getDataCount() throws JposException {
        return 0;
    }
    
    @Override
    public int getDataEncryptionAlgorithm() throws JposException {
        return 0;
    }
    
    @Override
    public void setDataEncryptionAlgorithm(int encryptAlgorithm) throws JposException {
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
    public boolean getDeviceAuthenticated() throws JposException {
        return true;
    }
    
    @Override
    public int getDeviceAuthenticationProtocol() throws JposException {
        return 0;
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
    public int getEncodingMaxLength() throws JposException {
        return 0;
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
    public byte[] getTrack1EncryptedData() throws JposException {
        return new byte[0];
    }
    
    @Override
    public int getTrack1EncryptedDataLength() throws JposException {
        return 0;
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
    public byte[] getTrack2EncryptedData() throws JposException {
        return new byte[0];
    }
    
    @Override
    public int getTrack2EncryptedDataLength() throws JposException {
        return 0;
    }
    
    @Override
    public byte[] getTrack3Data() throws JposException {
        return new byte[0];
    }
    
    @Override
    public byte[] getTrack3EncryptedData() throws JposException {
        return new byte[0];
    }
    
    @Override
    public int getTrack3EncryptedDataLength() throws JposException {
        return 0;
    }
    
    @Override
    public byte[] getTrack4Data() throws JposException {
        return new byte[0];
    }
    
    @Override
    public byte[] getTrack4EncryptedData() throws JposException {
        return new byte[0];
    }
    
    @Override
    public int getTrack4EncryptedDataLength() throws JposException {
        return 0;
    }
    
    @Override
    public int getTracksToRead() throws JposException {
        return 0;
    }
    
    @Override
    public void setTracksToRead(int tracksToRead) throws JposException {
    }
    
    @Override
    public int getTracksToWrite() throws JposException {
        return 0;
    }
    
    @Override
    public void setTracksToWrite(int tracks) throws JposException {
    }
    
    @Override
    public boolean getTransmitSentinels() throws JposException {
        return true;
    }
    
    @Override
    public void setTransmitSentinels(boolean transmitSentinels) throws JposException {
    }
    
    @Override
    public String getWriteCardType() throws JposException {
        return "";
    }
    
    @Override
    public void setWriteCardType(String cardType) throws JposException {
    }
    
    @Override
    public void authenticateDevice(byte[] response) throws JposException 
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
    public void clearInputProperties() throws JposException 
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
    public void deauthenticateDevice(byte[] response) throws JposException 
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
    public void retrieveCardProperty(String name, String[] value) throws JposException 
    {
    }
    
    @Override
    public void retrieveDeviceAuthenticationData(byte[][] challenge) throws JposException 
    {
    }
    
    @Override
    public void retrieveDeviceAuthenticationData(byte[] challenge) throws JposException 
    {
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
    }
    
    @Override
    public void updateKey(String key, String keyName) throws JposException 
    {
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
    }
    
    @Override
    public void writeTracks(byte[][] data, int timeout) throws JposException 
    {
    }
}
