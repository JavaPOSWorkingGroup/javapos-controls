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
public final class MSRTestServiceAlwaysThrowingNPE implements jpos.services.MSRService114, JposServiceInstance {
    
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
    public String getAccountNumber() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getAdditionalSecurityInformation() throws JposException {
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
    public String getCapCardAuthentication() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapCompareFirmwareVersion() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapDataEncryption() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapDeviceAuthentication() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapISO() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJISOne() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapJISTwo() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCapPowerReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapStatisticsReporting() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTrackDataMasking() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getCapTransmitSentinels() throws JposException {
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
    public int getCapWritableTracks() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getCardAuthenticationData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getCardAuthenticationDataLength() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCardPropertyList() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCardType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getCardTypeList() throws JposException {
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
    public int getDataEncryptionAlgorithm() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDataEncryptionAlgorithm(int encryptAlgorithm) throws JposException {
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
    public boolean getDecodeData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setDecodeData(boolean decodeData) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getDeviceAuthenticated() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getDeviceAuthenticationProtocol() throws JposException {
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
    public int getEncodingMaxLength() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getErrorReportingType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setErrorReportingType(int errorReportingType) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getExpirationDate() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getFirstName() throws JposException {
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
    public String getMiddleInitial() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getParseDecodeData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setParseDecodeData(boolean parseDecodeData) throws JposException {
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
    public String getServiceCode() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getSuffix() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getSurname() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getTitle() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getTrack1Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getTrack1DiscretionaryData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getTrack1EncryptedData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTrack1EncryptedDataLength() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getTrack2Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getTrack2DiscretionaryData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getTrack2EncryptedData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTrack2EncryptedDataLength() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getTrack3Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getTrack3EncryptedData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTrack3EncryptedDataLength() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getTrack4Data() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public byte[] getTrack4EncryptedData() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTrack4EncryptedDataLength() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTracksToRead() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setTracksToRead(int tracksToRead) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public int getTracksToWrite() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setTracksToWrite(int tracks) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public boolean getTransmitSentinels() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setTransmitSentinels(boolean transmitSentinels) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public String getWriteCardType() throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void setWriteCardType(String cardType) throws JposException {
        throw new NullPointerException();
    }
    
    @Override
    public void authenticateDevice(byte[] response) throws JposException 
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
    public void clearInputProperties() throws JposException 
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
    public void deauthenticateDevice(byte[] response) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void directIO(int command, int[] data, Object object) throws JposException 
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
    public void retrieveCardProperty(String name, String[] value) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveDeviceAuthenticationData(byte[][] challenge) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveDeviceAuthenticationData(byte[] challenge) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void retrieveStatistics(String[] statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateFirmware(String firmwareFileName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateKey(String key, String keyName) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void updateStatistics(String statisticsBuffer) throws JposException 
    {
        throw new NullPointerException();
    }
    
    @Override
    public void writeTracks(byte[][] data, int timeout) throws JposException 
    {
        throw new NullPointerException();
    }
}
